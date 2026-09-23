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

public class ObjectReader_init_1605742296335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111530;
     Object term111744;
     Object term111809;
     Object term111812;
     Object term111813;

    public ObjectReader_init_1605742296335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term111438 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term111530 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term111640 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term111530, term111530.getClass(), "_config", term111640);
        term111744 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingJsonFactory"));
        term111809 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term111810 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term111811 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingJsonFactory"));
        setField(term111810, term111810.getClass(), "_problemHandlers", null);
        setField(term111810, term111810.getClass(), "_nodeFactory", null);
        setIntField(term111810, term111810.getClass(), "_deserFeatures", 0);
        setIntField(term111810, term111810.getClass(), "_parserFeatures", 0);
        setIntField(term111810, term111810.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term111810, term111810.getClass(), "_formatReadFeatures", 0);
        setIntField(term111810, term111810.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term111810, term111810.getClass(), "_mixIns", null);
        setField(term111810, term111810.getClass(), "_subtypeResolver", null);
        setField(term111810, term111810.getClass(), "_rootName", null);
        setField(term111810, term111810.getClass(), "_view", null);
        setField(term111810, term111810.getClass(), "_attributes", null);
        setField(term111810, term111810.getClass(), "_rootNames", null);
        setField(term111810, term111810.getClass(), "_configOverrides", null);
        setIntField(term111810, term111810.getClass(), "_mapperFeatures", 0);
        setField(term111810, term111810.getClass(), "_base", null);
        setField(term111809, term111809.getClass(), "_config", term111810);
        setField(term111809, term111809.getClass(), "_context", null);
        setField(term111811, term111811.getClass(), "_rootCharSymbols", null);
        setField(term111811, term111811.getClass(), "_byteSymbolCanonicalizer", null);
        setIntField(term111811, term111811.getClass(), "_factoryFeatures", 0);
        setIntField(term111811, term111811.getClass(), "_parserFeatures", 0);
        setIntField(term111811, term111811.getClass(), "_generatorFeatures", 0);
        setField(term111811, term111811.getClass(), "_objectCodec", null);
        setField(term111811, term111811.getClass(), "_characterEscapes", null);
        setField(term111811, term111811.getClass(), "_inputDecorator", null);
        setField(term111811, term111811.getClass(), "_outputDecorator", null);
        setField(term111811, term111811.getClass(), "_rootValueSeparator", null);
        setIntField(term111811, term111811.getClass(), "_maximumNonEscapedChar", 0);
        setField(term111809, term111809.getClass(), "_parserFactory", term111811);
        setBooleanField(term111809, term111809.getClass(), "_unwrapRoot", false);
        setField(term111809, term111809.getClass(), "_filter", null);
        setField(term111809, term111809.getClass(), "_valueType", null);
        setField(term111809, term111809.getClass(), "_rootDeserializer", null);
        setField(term111809, term111809.getClass(), "_valueToUpdate", null);
        setField(term111809, term111809.getClass(), "_schema", null);
        setField(term111809, term111809.getClass(), "_injectableValues", null);
        setField(term111809, term111809.getClass(), "_dataFormatReaders", null);
        setField(term111809, term111809.getClass(), "_rootDeserializers", null);
        term111812 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingJsonFactory"));
        setField(term111812, term111812.getClass(), "_rootCharSymbols", null);
        setField(term111812, term111812.getClass(), "_byteSymbolCanonicalizer", null);
        setIntField(term111812, term111812.getClass(), "_factoryFeatures", 0);
        setIntField(term111812, term111812.getClass(), "_parserFeatures", 0);
        setIntField(term111812, term111812.getClass(), "_generatorFeatures", 0);
        setField(term111812, term111812.getClass(), "_objectCodec", null);
        setField(term111812, term111812.getClass(), "_characterEscapes", null);
        setField(term111812, term111812.getClass(), "_inputDecorator", null);
        setField(term111812, term111812.getClass(), "_outputDecorator", null);
        setField(term111812, term111812.getClass(), "_rootValueSeparator", null);
        setIntField(term111812, term111812.getClass(), "_maximumNonEscapedChar", 0);
        term111813 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term111814 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term111814, term111814.getClass(), "_problemHandlers", null);
        setField(term111814, term111814.getClass(), "_nodeFactory", null);
        setIntField(term111814, term111814.getClass(), "_deserFeatures", 0);
        setIntField(term111814, term111814.getClass(), "_parserFeatures", 0);
        setIntField(term111814, term111814.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term111814, term111814.getClass(), "_formatReadFeatures", 0);
        setIntField(term111814, term111814.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term111814, term111814.getClass(), "_mixIns", null);
        setField(term111814, term111814.getClass(), "_subtypeResolver", null);
        setField(term111814, term111814.getClass(), "_rootName", null);
        setField(term111814, term111814.getClass(), "_view", null);
        setField(term111814, term111814.getClass(), "_attributes", null);
        setField(term111814, term111814.getClass(), "_rootNames", null);
        setField(term111814, term111814.getClass(), "_configOverrides", null);
        setIntField(term111814, term111814.getClass(), "_mapperFeatures", 0);
        setField(term111814, term111814.getClass(), "_base", null);
        setField(term111813, term111813.getClass(), "_config", term111814);
        setField(term111813, term111813.getClass(), "_context", null);
        setField(term111813, term111813.getClass(), "_parserFactory", null);
        setBooleanField(term111813, term111813.getClass(), "_unwrapRoot", false);
        setField(term111813, term111813.getClass(), "_filter", null);
        setField(term111813, term111813.getClass(), "_valueType", null);
        setField(term111813, term111813.getClass(), "_rootDeserializer", null);
        setField(term111813, term111813.getClass(), "_valueToUpdate", null);
        setField(term111813, term111813.getClass(), "_schema", null);
        setField(term111813, term111813.getClass(), "_injectableValues", null);
        setField(term111813, term111813.getClass(), "_dataFormatReaders", null);
        setField(term111813, term111813.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonFactory");
        Object[] args = new Object[2];
        args[0] = term111530;
        args[1] = term111744;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term111809));
        assertTrue(recursiveEquals(term111530, term111812));
        assertTrue(recursiveEquals(term111744, term111813));
    }

};


