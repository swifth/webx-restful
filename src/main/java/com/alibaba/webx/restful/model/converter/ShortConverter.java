package com.alibaba.webx.restful.model.converter;


public class ShortConverter implements TypeConverter<Short> {

    @Override
    public Short convert(String literalValue) {
        return Short.parseShort(literalValue);
    }

}
