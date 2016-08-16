package com.vega.service.nfse.generic;

/**
 * Created by Ronaldo on 14/08/2016.
 */
public class TypeNFSe {

    public enum StatusNFSe {

        CONFIRMADO("CONFIRMADO"),
        AGUARDANDO("AGUARDANDO"),
        CANCELADO("CANCELADO"),
        FALHA("FALHA");

        private final String value;

        StatusNFSe(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
