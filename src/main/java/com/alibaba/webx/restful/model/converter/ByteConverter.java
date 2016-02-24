package com.alibaba.webx.restful.model.converter;


public class ByteConverter implements TypeConverter<Byte> {

    @Override
    public Byte convert(String literalValue) {
        return Byte.parseByte(literalValue);
    }

}
