package com.alibaba.webx.restful.model.converter;


public class LongConverter implements TypeConverter<Long> {

    @Override
    public Long convert(String literalValue) {
        return Long.parseLong(literalValue);
    }

}
