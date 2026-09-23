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

public class ObjectReader_init_1605742296275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46641;
     Object term46833;
     Object term46898;
     Object term46901;
     Object term46902;

    public ObjectReader_init_1605742296275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46549 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term46641 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term46751 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term46641, term46641.getClass(), "_config", term46751);
        term46833 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        term46898 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term46899 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term46900 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term46899, term46899.getClass(), "_problemHandlers", null);
        setField(term46899, term46899.getClass(), "_nodeFactory", null);
        setIntField(term46899, term46899.getClass(), "_deserFeatures", 0);
        setIntField(term46899, term46899.getClass(), "_parserFeatures", 0);
        setIntField(term46899, term46899.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term46899, term46899.getClass(), "_formatReadFeatures", 0);
        setIntField(term46899, term46899.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term46899, term46899.getClass(), "_mixIns", null);
        setField(term46899, term46899.getClass(), "_subtypeResolver", null);
        setField(term46899, term46899.getClass(), "_rootName", null);
        setField(term46899, term46899.getClass(), "_view", null);
        setField(term46899, term46899.getClass(), "_attributes", null);
        setField(term46899, term46899.getClass(), "_rootNames", null);
        setField(term46899, term46899.getClass(), "_configOverrides", null);
        setIntField(term46899, term46899.getClass(), "_mapperFeatures", 0);
        setField(term46899, term46899.getClass(), "_base", null);
        setField(term46898, term46898.getClass(), "_config", term46899);
        setField(term46898, term46898.getClass(), "_context", null);
        setField(term46900, term46900.getClass(), "_rootCharSymbols", null);
        setField(term46900, term46900.getClass(), "_byteSymbolCanonicalizer", null);
        setIntField(term46900, term46900.getClass(), "_factoryFeatures", 0);
        setIntField(term46900, term46900.getClass(), "_parserFeatures", 0);
        setIntField(term46900, term46900.getClass(), "_generatorFeatures", 0);
        setField(term46900, term46900.getClass(), "_objectCodec", null);
        setField(term46900, term46900.getClass(), "_characterEscapes", null);
        setField(term46900, term46900.getClass(), "_inputDecorator", null);
        setField(term46900, term46900.getClass(), "_outputDecorator", null);
        setField(term46900, term46900.getClass(), "_rootValueSeparator", null);
        setIntField(term46900, term46900.getClass(), "_maximumNonEscapedChar", 0);
        setField(term46898, term46898.getClass(), "_parserFactory", term46900);
        setBooleanField(term46898, term46898.getClass(), "_unwrapRoot", false);
        setField(term46898, term46898.getClass(), "_filter", null);
        setField(term46898, term46898.getClass(), "_valueType", null);
        setField(term46898, term46898.getClass(), "_rootDeserializer", null);
        setField(term46898, term46898.getClass(), "_valueToUpdate", null);
        setField(term46898, term46898.getClass(), "_schema", null);
        setField(term46898, term46898.getClass(), "_injectableValues", null);
        setField(term46898, term46898.getClass(), "_dataFormatReaders", null);
        setField(term46898, term46898.getClass(), "_rootDeserializers", null);
        term46901 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term46901, term46901.getClass(), "_rootCharSymbols", null);
        setField(term46901, term46901.getClass(), "_byteSymbolCanonicalizer", null);
        setIntField(term46901, term46901.getClass(), "_factoryFeatures", 0);
        setIntField(term46901, term46901.getClass(), "_parserFeatures", 0);
        setIntField(term46901, term46901.getClass(), "_generatorFeatures", 0);
        setField(term46901, term46901.getClass(), "_objectCodec", null);
        setField(term46901, term46901.getClass(), "_characterEscapes", null);
        setField(term46901, term46901.getClass(), "_inputDecorator", null);
        setField(term46901, term46901.getClass(), "_outputDecorator", null);
        setField(term46901, term46901.getClass(), "_rootValueSeparator", null);
        setIntField(term46901, term46901.getClass(), "_maximumNonEscapedChar", 0);
        term46902 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term46903 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term46903, term46903.getClass(), "_problemHandlers", null);
        setField(term46903, term46903.getClass(), "_nodeFactory", null);
        setIntField(term46903, term46903.getClass(), "_deserFeatures", 0);
        setIntField(term46903, term46903.getClass(), "_parserFeatures", 0);
        setIntField(term46903, term46903.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term46903, term46903.getClass(), "_formatReadFeatures", 0);
        setIntField(term46903, term46903.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term46903, term46903.getClass(), "_mixIns", null);
        setField(term46903, term46903.getClass(), "_subtypeResolver", null);
        setField(term46903, term46903.getClass(), "_rootName", null);
        setField(term46903, term46903.getClass(), "_view", null);
        setField(term46903, term46903.getClass(), "_attributes", null);
        setField(term46903, term46903.getClass(), "_rootNames", null);
        setField(term46903, term46903.getClass(), "_configOverrides", null);
        setIntField(term46903, term46903.getClass(), "_mapperFeatures", 0);
        setField(term46903, term46903.getClass(), "_base", null);
        setField(term46902, term46902.getClass(), "_config", term46903);
        setField(term46902, term46902.getClass(), "_context", null);
        setField(term46902, term46902.getClass(), "_parserFactory", null);
        setBooleanField(term46902, term46902.getClass(), "_unwrapRoot", false);
        setField(term46902, term46902.getClass(), "_filter", null);
        setField(term46902, term46902.getClass(), "_valueType", null);
        setField(term46902, term46902.getClass(), "_rootDeserializer", null);
        setField(term46902, term46902.getClass(), "_valueToUpdate", null);
        setField(term46902, term46902.getClass(), "_schema", null);
        setField(term46902, term46902.getClass(), "_injectableValues", null);
        setField(term46902, term46902.getClass(), "_dataFormatReaders", null);
        setField(term46902, term46902.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonFactory");
        Object[] args = new Object[2];
        args[0] = term46641;
        args[1] = term46833;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46898));
        assertTrue(recursiveEquals(term46641, term46901));
        assertTrue(recursiveEquals(term46833, term46902));
    }

};


