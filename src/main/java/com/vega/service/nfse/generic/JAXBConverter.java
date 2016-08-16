package com.vega.service.nfse.generic;

import com.vega.service.nfse.equiplano.domain.EnviarLoteRpsResposta;
import com.vega.service.util.VegaException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.lang.reflect.*;


/**
 * Created by Ronaldo on 14/08/2016.
 */
public class JAXBConverter {

    public static <T> Object transform(Class<T> tClass, String xml) throws VegaException {

        StringReader stringReader = new StringReader(xml);

        JAXBContext jaxbContext;
        Object object = null;
        try {
            jaxbContext = JAXBContext.newInstance(tClass);
            Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
            object = jaxbUnMarshaller.unmarshal(stringReader);
        } catch (JAXBException e) {
            throw new VegaException(e.getMessage());
        }

        return object;
    }

}
