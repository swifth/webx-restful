package com.alibaba.webx.restful.model.converter;

import java.math.BigInteger;


public class BigIntegerConverter implements TypeConverter<BigInteger> {

    @Override
    public BigInteger convert(String literalValue) {
        return new BigInteger(literalValue);
    }

}
