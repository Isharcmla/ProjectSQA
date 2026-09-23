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

public class ObjectReader_init_1605742296256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53789;
     Object term53981;
     Object term54060;
     Object term54063;
     Object term54064;

    public ObjectReader_init_1605742296256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53697 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term53789 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term53899 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term53899, term53899.getClass(), "_mapperFeatures", -1);
        setField(term53789, term53789.getClass(), "_config", term53899);
        term53981 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        term54060 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term54061 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term54062 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setIntField(term54061, term54061.getClass(), "_deserFeatures", 0);
        setField(term54061, term54061.getClass(), "_problemHandlers", null);
        setField(term54061, term54061.getClass(), "_nodeFactory", null);
        setIntField(term54061, term54061.getClass(), "_parserFeatures", 0);
        setIntField(term54061, term54061.getClass(), "_parserFeaturesToChange", 0);
        setField(term54061, term54061.getClass(), "_mixInAnnotations", null);
        setField(term54061, term54061.getClass(), "_subtypeResolver", null);
        setField(term54061, term54061.getClass(), "_rootName", null);
        setField(term54061, term54061.getClass(), "_view", null);
        setField(term54061, term54061.getClass(), "_attributes", null);
        setIntField(term54061, term54061.getClass(), "_mapperFeatures", -8193);
        setField(term54061, term54061.getClass(), "_base", null);
        setField(term54060, term54060.getClass(), "_config", term54061);
        setField(term54060, term54060.getClass(), "_context", null);
        setField(term54062, term54062.getClass(), "_rootCharSymbols", null);
        setField(term54062, term54062.getClass(), "_rootByteSymbols", null);
        setField(term54062, term54062.getClass(), "_objectCodec", null);
        setIntField(term54062, term54062.getClass(), "_factoryFeatures", 0);
        setIntField(term54062, term54062.getClass(), "_parserFeatures", 0);
        setIntField(term54062, term54062.getClass(), "_generatorFeatures", 0);
        setField(term54062, term54062.getClass(), "_characterEscapes", null);
        setField(term54062, term54062.getClass(), "_inputDecorator", null);
        setField(term54062, term54062.getClass(), "_outputDecorator", null);
        setField(term54062, term54062.getClass(), "_rootValueSeparator", null);
        setField(term54060, term54060.getClass(), "_parserFactory", term54062);
        setBooleanField(term54060, term54060.getClass(), "_unwrapRoot", false);
        setField(term54060, term54060.getClass(), "_valueType", null);
        setField(term54060, term54060.getClass(), "_rootDeserializer", null);
        setField(term54060, term54060.getClass(), "_valueToUpdate", null);
        setField(term54060, term54060.getClass(), "_schema", null);
        setField(term54060, term54060.getClass(), "_injectableValues", null);
        setField(term54060, term54060.getClass(), "_dataFormatReaders", null);
        setField(term54060, term54060.getClass(), "_rootDeserializers", null);
        setField(term54060, term54060.getClass(), "_rootNames", null);
        term54063 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term54063, term54063.getClass(), "_rootCharSymbols", null);
        setField(term54063, term54063.getClass(), "_rootByteSymbols", null);
        setField(term54063, term54063.getClass(), "_objectCodec", null);
        setIntField(term54063, term54063.getClass(), "_factoryFeatures", 0);
        setIntField(term54063, term54063.getClass(), "_parserFeatures", 0);
        setIntField(term54063, term54063.getClass(), "_generatorFeatures", 0);
        setField(term54063, term54063.getClass(), "_characterEscapes", null);
        setField(term54063, term54063.getClass(), "_inputDecorator", null);
        setField(term54063, term54063.getClass(), "_outputDecorator", null);
        setField(term54063, term54063.getClass(), "_rootValueSeparator", null);
        term54064 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term54065 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term54065, term54065.getClass(), "_deserFeatures", 0);
        setField(term54065, term54065.getClass(), "_problemHandlers", null);
        setField(term54065, term54065.getClass(), "_nodeFactory", null);
        setIntField(term54065, term54065.getClass(), "_parserFeatures", 0);
        setIntField(term54065, term54065.getClass(), "_parserFeaturesToChange", 0);
        setField(term54065, term54065.getClass(), "_mixInAnnotations", null);
        setField(term54065, term54065.getClass(), "_subtypeResolver", null);
        setField(term54065, term54065.getClass(), "_rootName", null);
        setField(term54065, term54065.getClass(), "_view", null);
        setField(term54065, term54065.getClass(), "_attributes", null);
        setIntField(term54065, term54065.getClass(), "_mapperFeatures", -1);
        setField(term54065, term54065.getClass(), "_base", null);
        setField(term54064, term54064.getClass(), "_config", term54065);
        setField(term54064, term54064.getClass(), "_context", null);
        setField(term54064, term54064.getClass(), "_parserFactory", null);
        setBooleanField(term54064, term54064.getClass(), "_unwrapRoot", false);
        setField(term54064, term54064.getClass(), "_valueType", null);
        setField(term54064, term54064.getClass(), "_rootDeserializer", null);
        setField(term54064, term54064.getClass(), "_valueToUpdate", null);
        setField(term54064, term54064.getClass(), "_schema", null);
        setField(term54064, term54064.getClass(), "_injectableValues", null);
        setField(term54064, term54064.getClass(), "_dataFormatReaders", null);
        setField(term54064, term54064.getClass(), "_rootDeserializers", null);
        setField(term54064, term54064.getClass(), "_rootNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonFactory");
        Object[] args = new Object[2];
        args[0] = term53789;
        args[1] = term53981;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term54060));
        assertTrue(recursiveEquals(term53789, term54063));
        assertTrue(recursiveEquals(term53981, term54064));
    }

};


