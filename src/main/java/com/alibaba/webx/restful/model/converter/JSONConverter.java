package com.alibaba.webx.restful.model.converter;

import java.lang.reflect.Type;

import com.alibaba.fastjson.JSON;

public class JSONConverter implements TypeConverter<Object> {

    private final Type type;

    public JSONConverter(Type type){
        this.type = type;
    }

    @Override
    public Object convert(String literalValue) throws TypeConvertException {
        Object value = JSON.parseObject(literalValue, type);
        return value;
    }

    public Type getType() {
        return type;
    }

}
