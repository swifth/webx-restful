package com.alibaba.webx.restful.model.converter;


public class FloatConverter implements TypeConverter<Float> {

    @Override
    public Float convert(String literalValue) {
        return Float.parseFloat(literalValue);
    }

}
