/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.nfse.generic;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;  
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;  
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Enumeration;
import java.util.List;  
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.Reference;  
import javax.xml.crypto.dsig.SignedInfo;  
import javax.xml.crypto.dsig.Transform;  
import javax.xml.crypto.dsig.XMLSignature;  
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;  
import javax.xml.crypto.dsig.dom.DOMSignContext;  
import javax.xml.crypto.dsig.keyinfo.KeyInfo;  
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;  
import javax.xml.crypto.dsig.keyinfo.X509Data;  
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;  
import javax.xml.crypto.dsig.spec.TransformParameterSpec;  
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;  
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
//import org.jcp.xml.dsig.internal.dom.XMLDSigRI;  
import org.jcp.xml.dsig.internal.dom.XMLDSigRI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;  
import org.w3c.dom.NodeList;  
import org.xml.sax.SAXException;  
/**
 *
 * @author Ronaldo
 */
public class Assinador {

    private String caminhoCertificado;
    private String senhaCertificado;

    public Assinador(String caminhoCertificado, String senhaCertificado) {
        this.caminhoCertificado = caminhoCertificado;
        this.senhaCertificado = senhaCertificado;
    }

    public String assinar(String xml, String tag, boolean includeSignatureID) throws Exception {

        String xmlRetorno = "";

        Document document;
        try {
            document = strToDoc(normalize(xml));
            document.getDocumentElement().removeAttribute("xmlns:ns3");
            document.getDocumentElement().removeAttribute("xmlns:ns2");
            document.getDocumentElement().removeAttributeNS("ns3", "");
        } catch (ParserConfigurationException | SAXException | IOException e1) {
            throw new Exception(e1.getMessage());
        }

        PrivateKey privateKey = null;

        XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM", new XMLDSigRI());
        KeyInfoFactory kif = fac.getKeyInfoFactory();

        List<Transform> transformList = new ArrayList<Transform>();
        TransformParameterSpec tps = null;
        Transform envelopedTransform;
        try {
            envelopedTransform = fac.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", tps);
            Transform c14NTransform = fac.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);
            transformList.add(envelopedTransform);
            transformList.add(c14NTransform);
        } catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException e1) {
            throw new Exception(e1.getMessage());
        }

        //Carrega o certificado digital	    
        InputStream entrada = null;
        KeyStore ks = null;

        try {
            entrada = new FileInputStream(caminhoCertificado);
        } catch (FileNotFoundException e1) {
            throw new Exception(e1.getMessage());
        }

        try {
            ks = KeyStore.getInstance("pkcs12");
            ks.load(entrada, senhaCertificado.toCharArray());
            
        } catch (Exception e) {
            throw new Exception("Senha do Certificado Digital incorreta ou Certificado inválido.");
        }

        KeyStore.PrivateKeyEntry pkEntry = null;
        Enumeration<String> aliasesEnum = null;

        try {
            aliasesEnum = ks.aliases();
        } catch (KeyStoreException e) {
            throw new Exception(e.getMessage());
        }

        while (aliasesEnum.hasMoreElements()) {
            String alias = (String) aliasesEnum.nextElement();
            try {
                if (ks.isKeyEntry(alias)) {
                    pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias,
                            new KeyStore.PasswordProtection(senhaCertificado.toCharArray()));
                    privateKey = pkEntry.getPrivateKey();
                    break;
                }
            } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e) {
                throw new Exception(e.getMessage());
            }
        }

        X509Certificate cert = (X509Certificate) pkEntry.getCertificate();
        
        KeyInfoFactory keyInfoFactory = fac.getKeyInfoFactory();
        List<X509Certificate> x509Content = new ArrayList<X509Certificate>();

        x509Content.add(cert);
        X509Data x509Data = keyInfoFactory.newX509Data(x509Content);
        keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));

        X509Data xd = kif.newX509Data(x509Content);
        KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));

        NodeList elements = null;
        elements = document.getElementsByTagName(tag);

        String id = "";

        Element el = (Element) elements.item(0);

        Reference ref;
        try {
            ref = fac.newReference(id, fac.newDigestMethod("http://www.w3.org/2000/09/xmldsig#sha1", null), transformList, null, null);
            SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod("http://www.w3.org/TR/2001/REC-xml-c14n-20010315",
                    (C14NMethodParameterSpec) null), fac.newSignatureMethod("http://www.w3.org/2000/09/xmldsig#rsa-sha1", null),
                    Collections.singletonList(ref));
            XMLSignature signature = fac.newXMLSignature(si, ki, null, includeSignatureID ? "ass_" + tag + "_" + id : null, null);
            DOMSignContext dsc = new DOMSignContext(privateKey, el);//  el.getParentNode());  

            signature.sign(dsc);
        } catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException | MarshalException | XMLSignatureException e) {
            throw new Exception(e.getMessage());
        }

        try {
            xmlRetorno = outputXML(document);
        } catch (TransformerException e) {
            throw new Exception(e.getMessage());
        }

        return xmlRetorno;
    }

    public String lerXML(String fileXML) throws IOException {
        String linha = "";
        StringBuilder xml = new StringBuilder();

        BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileXML)));
        while ((linha = in.readLine()) != null) {
            xml.append(linha);
        }
        in.close();

        return xml.toString();
    }

    private String outputXML(Document doc) throws TransformerException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer trans = tf.newTransformer();
        trans.transform(new DOMSource(doc), new StreamResult(os));
        String xml = os.toString();
        if ((xml != null) && (!"".equals(xml))) {
            //xml = xml.replaceAll("\\r\\n", "");
            xml = xml.replaceAll(" standalone=\"no\"", "");
        }
        return xml;
    }

    public static String normalize(String str) {
        String xml = str;
        if ((xml != null) && (!"".equals(xml))) {
            //xml = xml.replaceAll("\\r\\n", "");
            xml = xml.replaceAll("\\r", "");
            //xml = xml.replaceAll("\\n", "");
            xml = xml.replaceAll("\\>\\s+\\<", "><");
            xml = xml.replaceAll("(\\s\\s)", "");
            xml = xml.replaceAll(" standalone=\"no\"", "");
        }
        return xml;
    }

    public static String docToStr(Document doc) throws ParserConfigurationException, SAXException, IOException {

        return doc.getTextContent();
    }

    public static Document strToDoc(String xml) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        Document document = factory.newDocumentBuilder().parse(new ByteArrayInputStream(xml.getBytes()));
        return document;
    }

    public String getCaminhoCertificado() {
        return caminhoCertificado;
    }

    public void setCaminhoCertificado(String caminhoCertificado) {
        this.caminhoCertificado = caminhoCertificado;
    }

    public String getSenhaCertificado() {
        return senhaCertificado;
    }

    public void setSenhaCertificado(String senhaCertificado) {
        this.senhaCertificado = senhaCertificado;
    }

}
