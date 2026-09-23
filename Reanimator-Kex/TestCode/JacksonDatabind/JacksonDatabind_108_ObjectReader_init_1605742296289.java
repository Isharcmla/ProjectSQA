package com.fasterxml.jackson.databind;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;

public class ObjectReader_init_1605742296289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58929;
     Object term59121;
     Object term59220;
     Object term59223;
     Object term59224;

    public ObjectReader_init_1605742296289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58837 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term58929 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term59039 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term59039, term59039.getClass(), "_mapperFeatures", -1);
        setField(term58929, term58929.getClass(), "_config", term59039);
        term59121 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        term59220 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term59221 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term59222 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term59221, term59221.getClass(), "_problemHandlers", null);
        setField(term59221, term59221.getClass(), "_nodeFactory", null);
        setIntField(term59221, term59221.getClass(), "_deserFeatures", 0);
        setIntField(term59221, term59221.getClass(), "_parserFeatures", 0);
        setIntField(term59221, term59221.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term59221, term59221.getClass(), "_formatReadFeatures", 0);
        setIntField(term59221, term59221.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term59221, term59221.getClass(), "_mixIns", null);
        setField(term59221, term59221.getClass(), "_subtypeResolver", null);
        setField(term59221, term59221.getClass(), "_rootName", null);
        setField(term59221, term59221.getClass(), "_view", null);
        setField(term59221, term59221.getClass(), "_attributes", null);
        setField(term59221, term59221.getClass(), "_rootNames", null);
        setField(term59221, term59221.getClass(), "_configOverrides", null);
        setIntField(term59221, term59221.getClass(), "_mapperFeatures", -131073);
        setField(term59221, term59221.getClass(), "_base", null);
        setField(term59220, term59220.getClass(), "_config", term59221);
        setField(term59220, term59220.getClass(), "_context", null);
        setField(term59222, term59222.getClass(), "_rootCharSymbols", null);
        setField(term59222, term59222.getClass(), "_byteSymbolCanonicalizer", null);
        setIntField(term59222, term59222.getClass(), "_factoryFeatures", 0);
        setIntField(term59222, term59222.getClass(), "_parserFeatures", 0);
        setIntField(term59222, term59222.getClass(), "_generatorFeatures", 0);
        setField(term59222, term59222.getClass(), "_objectCodec", null);
        setField(term59222, term59222.getClass(), "_characterEscapes", null);
        setField(term59222, term59222.getClass(), "_inputDecorator", null);
        setField(term59222, term59222.getClass(), "_outputDecorator", null);
        setField(term59222, term59222.getClass(), "_rootValueSeparator", null);
        setIntField(term59222, term59222.getClass(), "_maximumNonEscapedChar", 0);
        setField(term59220, term59220.getClass(), "_parserFactory", term59222);
        setBooleanField(term59220, term59220.getClass(), "_unwrapRoot", false);
        setField(term59220, term59220.getClass(), "_filter", null);
        setField(term59220, term59220.getClass(), "_valueType", null);
        setField(term59220, term59220.getClass(), "_rootDeserializer", null);
        setField(term59220, term59220.getClass(), "_valueToUpdate", null);
        setField(term59220, term59220.getClass(), "_schema", null);
        setField(term59220, term59220.getClass(), "_injectableValues", null);
        setField(term59220, term59220.getClass(), "_dataFormatReaders", null);
        setField(term59220, term59220.getClass(), "_rootDeserializers", null);
        term59223 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term59223, term59223.getClass(), "_rootCharSymbols", null);
        setField(term59223, term59223.getClass(), "_byteSymbolCanonicalizer", null);
        setIntField(term59223, term59223.getClass(), "_factoryFeatures", 0);
        setIntField(term59223, term59223.getClass(), "_parserFeatures", 0);
        setIntField(term59223, term59223.getClass(), "_generatorFeatures", 0);
        setField(term59223, term59223.getClass(), "_objectCodec", null);
        setField(term59223, term59223.getClass(), "_characterEscapes", null);
        setField(term59223, term59223.getClass(), "_inputDecorator", null);
        setField(term59223, term59223.getClass(), "_outputDecorator", null);
        setField(term59223, term59223.getClass(), "_rootValueSeparator", null);
        setIntField(term59223, term59223.getClass(), "_maximumNonEscapedChar", 0);
        term59224 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term59225 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term59225, term59225.getClass(), "_problemHandlers", null);
        setField(term59225, term59225.getClass(), "_nodeFactory", null);
        setIntField(term59225, term59225.getClass(), "_deserFeatures", 0);
        setIntField(term59225, term59225.getClass(), "_parserFeatures", 0);
        setIntField(term59225, term59225.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term59225, term59225.getClass(), "_formatReadFeatures", 0);
        setIntField(term59225, term59225.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term59225, term59225.getClass(), "_mixIns", null);
        setField(term59225, term59225.getClass(), "_subtypeResolver", null);
        setField(term59225, term59225.getClass(), "_rootName", null);
        setField(term59225, term59225.getClass(), "_view", null);
        setField(term59225, term59225.getClass(), "_attributes", null);
        setField(term59225, term59225.getClass(), "_rootNames", null);
        setField(term59225, term59225.getClass(), "_configOverrides", null);
        setIntField(term59225, term59225.getClass(), "_mapperFeatures", -1);
        setField(term59225, term59225.getClass(), "_base", null);
        setField(term59224, term59224.getClass(), "_config", term59225);
        setField(term59224, term59224.getClass(), "_context", null);
        setField(term59224, term59224.getClass(), "_parserFactory", null);
        setBooleanField(term59224, term59224.getClass(), "_unwrapRoot", false);
        setField(term59224, term59224.getClass(), "_filter", null);
        setField(term59224, term59224.getClass(), "_valueType", null);
        setField(term59224, term59224.getClass(), "_rootDeserializer", null);
        setField(term59224, term59224.getClass(), "_valueToUpdate", null);
        setField(term59224, term59224.getClass(), "_schema", null);
        setField(term59224, term59224.getClass(), "_injectableValues", null);
        setField(term59224, term59224.getClass(), "_dataFormatReaders", null);
        setField(term59224, term59224.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonFactory");
        Object[] args = new Object[2];
        args[0] = term58929;
        args[1] = term59121;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term59220));
        assertTrue(recursiveEquals(term58929, term59223));
        assertTrue(recursiveEquals(term59121, term59224));
    }

};


