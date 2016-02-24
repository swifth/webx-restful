package com.alibaba.webx.restful.model.converter;


public interface TypeConverter<T> {
    T convert(String literalValue) throws TypeConvertException;
}
