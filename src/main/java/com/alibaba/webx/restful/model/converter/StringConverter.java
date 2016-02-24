package com.alibaba.webx.restful.model.converter;

public class StringConverter implements TypeConverter<String> {

    @Override
    public String convert(String literalValue) {
        return literalValue;
    }

}
