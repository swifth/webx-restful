package com.alibaba.webx.restful.model.converter;

import java.math.BigDecimal;


public class BigDecimalConverter implements TypeConverter<BigDecimal> {

    @Override
    public BigDecimal convert(String literalValue) {
        return new BigDecimal(literalValue);
    }

}
