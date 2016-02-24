package com.alibaba.webx.restful.model.converter;


public class DoubleConverter implements TypeConverter<Double> {

    @Override
    public Double convert(String literalValue) {
        return Double.parseDouble(literalValue);
    }

}
