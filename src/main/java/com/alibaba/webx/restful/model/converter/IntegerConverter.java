package com.alibaba.webx.restful.model.converter;


public class IntegerConverter implements TypeConverter<Integer> {

    @Override
    public Integer convert(String literalValue) {
        return Integer.parseInt(literalValue);
    }

}
