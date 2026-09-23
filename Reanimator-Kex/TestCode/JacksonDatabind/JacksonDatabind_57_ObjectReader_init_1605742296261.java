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

public class ObjectReader_init_1605742296261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42203;
     Object term42395;
     Object term42459;
     Object term42462;
     Object term42463;

    public ObjectReader_init_1605742296261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42111 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term42203 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term42313 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term42203, term42203.getClass(), "_config", term42313);
        term42395 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        term42459 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term42460 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term42461 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term42460, term42460.getClass(), "_problemHandlers", null);
        setField(term42460, term42460.getClass(), "_nodeFactory", null);
        setIntField(term42460, term42460.getClass(), "_deserFeatures", 0);
        setIntField(term42460, term42460.getClass(), "_parserFeatures", 0);
        setIntField(term42460, term42460.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term42460, term42460.getClass(), "_formatReadFeatures", 0);
        setIntField(term42460, term42460.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term42460, term42460.getClass(), "_mixIns", null);
        setField(term42460, term42460.getClass(), "_subtypeResolver", null);
        setField(term42460, term42460.getClass(), "_rootName", null);
        setField(term42460, term42460.getClass(), "_view", null);
        setField(term42460, term42460.getClass(), "_attributes", null);
        setField(term42460, term42460.getClass(), "_rootNames", null);
        setIntField(term42460, term42460.getClass(), "_mapperFeatures", 0);
        setField(term42460, term42460.getClass(), "_base", null);
        setField(term42459, term42459.getClass(), "_config", term42460);
        setField(term42459, term42459.getClass(), "_context", null);
        setField(term42461, term42461.getClass(), "_rootCharSymbols", null);
        setField(term42461, term42461.getClass(), "_byteSymbolCanonicalizer", null);
        setField(term42461, term42461.getClass(), "_objectCodec", null);
        setIntField(term42461, term42461.getClass(), "_factoryFeatures", 0);
        setIntField(term42461, term42461.getClass(), "_parserFeatures", 0);
        setIntField(term42461, term42461.getClass(), "_generatorFeatures", 0);
        setField(term42461, term42461.getClass(), "_characterEscapes", null);
        setField(term42461, term42461.getClass(), "_inputDecorator", null);
        setField(term42461, term42461.getClass(), "_outputDecorator", null);
        setField(term42461, term42461.getClass(), "_rootValueSeparator", null);
        setField(term42459, term42459.getClass(), "_parserFactory", term42461);
        setBooleanField(term42459, term42459.getClass(), "_unwrapRoot", false);
        setField(term42459, term42459.getClass(), "_filter", null);
        setField(term42459, term42459.getClass(), "_valueType", null);
        setField(term42459, term42459.getClass(), "_rootDeserializer", null);
        setField(term42459, term42459.getClass(), "_valueToUpdate", null);
        setField(term42459, term42459.getClass(), "_schema", null);
        setField(term42459, term42459.getClass(), "_injectableValues", null);
        setField(term42459, term42459.getClass(), "_dataFormatReaders", null);
        setField(term42459, term42459.getClass(), "_rootDeserializers", null);
        term42462 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term42462, term42462.getClass(), "_rootCharSymbols", null);
        setField(term42462, term42462.getClass(), "_byteSymbolCanonicalizer", null);
        setField(term42462, term42462.getClass(), "_objectCodec", null);
        setIntField(term42462, term42462.getClass(), "_factoryFeatures", 0);
        setIntField(term42462, term42462.getClass(), "_parserFeatures", 0);
        setIntField(term42462, term42462.getClass(), "_generatorFeatures", 0);
        setField(term42462, term42462.getClass(), "_characterEscapes", null);
        setField(term42462, term42462.getClass(), "_inputDecorator", null);
        setField(term42462, term42462.getClass(), "_outputDecorator", null);
        setField(term42462, term42462.getClass(), "_rootValueSeparator", null);
        term42463 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term42464 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term42464, term42464.getClass(), "_problemHandlers", null);
        setField(term42464, term42464.getClass(), "_nodeFactory", null);
        setIntField(term42464, term42464.getClass(), "_deserFeatures", 0);
        setIntField(term42464, term42464.getClass(), "_parserFeatures", 0);
        setIntField(term42464, term42464.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term42464, term42464.getClass(), "_formatReadFeatures", 0);
        setIntField(term42464, term42464.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term42464, term42464.getClass(), "_mixIns", null);
        setField(term42464, term42464.getClass(), "_subtypeResolver", null);
        setField(term42464, term42464.getClass(), "_rootName", null);
        setField(term42464, term42464.getClass(), "_view", null);
        setField(term42464, term42464.getClass(), "_attributes", null);
        setField(term42464, term42464.getClass(), "_rootNames", null);
        setIntField(term42464, term42464.getClass(), "_mapperFeatures", 0);
        setField(term42464, term42464.getClass(), "_base", null);
        setField(term42463, term42463.getClass(), "_config", term42464);
        setField(term42463, term42463.getClass(), "_context", null);
        setField(term42463, term42463.getClass(), "_parserFactory", null);
        setBooleanField(term42463, term42463.getClass(), "_unwrapRoot", false);
        setField(term42463, term42463.getClass(), "_filter", null);
        setField(term42463, term42463.getClass(), "_valueType", null);
        setField(term42463, term42463.getClass(), "_rootDeserializer", null);
        setField(term42463, term42463.getClass(), "_valueToUpdate", null);
        setField(term42463, term42463.getClass(), "_schema", null);
        setField(term42463, term42463.getClass(), "_injectableValues", null);
        setField(term42463, term42463.getClass(), "_dataFormatReaders", null);
        setField(term42463, term42463.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonFactory");
        Object[] args = new Object[2];
        args[0] = term42203;
        args[1] = term42395;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term42459));
        assertTrue(recursiveEquals(term42203, term42462));
        assertTrue(recursiveEquals(term42395, term42463));
    }

};


