package com.alibaba.webx.restful.model.converter;

import com.alibaba.fastjson.util.Base64;

public class ByteArrayConverter implements TypeConverter<byte[]> {

    @Override
    public byte[] convert(String literalValue) {
        if (literalValue == null) {
            return null;
        }

        if (literalValue.length() == 0) {
            return new byte[0];
        }

        byte[] bytes = Base64.decodeFast(literalValue);
        
        return bytes;
    }

}
