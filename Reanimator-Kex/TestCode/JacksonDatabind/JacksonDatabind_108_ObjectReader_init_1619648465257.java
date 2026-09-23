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

public class ObjectReader_init_1619648465257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34518;
     Object term34628;
     Object term34754;
     Object term34756;
     Object term34757;

    public ObjectReader_init_1619648465257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34316 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term34426 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term34316, term34316.getClass(), "_config", term34426);
        term34518 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term34628 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term34754 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term34755 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term34755, term34755.getClass(), "_problemHandlers", null);
        setField(term34755, term34755.getClass(), "_nodeFactory", null);
        setIntField(term34755, term34755.getClass(), "_deserFeatures", 0);
        setIntField(term34755, term34755.getClass(), "_parserFeatures", 0);
        setIntField(term34755, term34755.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term34755, term34755.getClass(), "_formatReadFeatures", 0);
        setIntField(term34755, term34755.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term34755, term34755.getClass(), "_mixIns", null);
        setField(term34755, term34755.getClass(), "_subtypeResolver", null);
        setField(term34755, term34755.getClass(), "_rootName", null);
        setField(term34755, term34755.getClass(), "_view", null);
        setField(term34755, term34755.getClass(), "_attributes", null);
        setField(term34755, term34755.getClass(), "_rootNames", null);
        setField(term34755, term34755.getClass(), "_configOverrides", null);
        setIntField(term34755, term34755.getClass(), "_mapperFeatures", 0);
        setField(term34755, term34755.getClass(), "_base", null);
        setField(term34754, term34754.getClass(), "_config", term34755);
        setField(term34754, term34754.getClass(), "_context", null);
        setField(term34754, term34754.getClass(), "_parserFactory", null);
        setBooleanField(term34754, term34754.getClass(), "_unwrapRoot", false);
        setField(term34754, term34754.getClass(), "_filter", null);
        setField(term34754, term34754.getClass(), "_valueType", null);
        setField(term34754, term34754.getClass(), "_rootDeserializer", null);
        setField(term34754, term34754.getClass(), "_valueToUpdate", null);
        setField(term34754, term34754.getClass(), "_schema", null);
        setField(term34754, term34754.getClass(), "_injectableValues", null);
        setField(term34754, term34754.getClass(), "_dataFormatReaders", null);
        setField(term34754, term34754.getClass(), "_rootDeserializers", null);
        term34756 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term34756, term34756.getClass(), "_problemHandlers", null);
        setField(term34756, term34756.getClass(), "_nodeFactory", null);
        setIntField(term34756, term34756.getClass(), "_deserFeatures", 0);
        setIntField(term34756, term34756.getClass(), "_parserFeatures", 0);
        setIntField(term34756, term34756.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term34756, term34756.getClass(), "_formatReadFeatures", 0);
        setIntField(term34756, term34756.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term34756, term34756.getClass(), "_mixIns", null);
        setField(term34756, term34756.getClass(), "_subtypeResolver", null);
        setField(term34756, term34756.getClass(), "_rootName", null);
        setField(term34756, term34756.getClass(), "_view", null);
        setField(term34756, term34756.getClass(), "_attributes", null);
        setField(term34756, term34756.getClass(), "_rootNames", null);
        setField(term34756, term34756.getClass(), "_configOverrides", null);
        setIntField(term34756, term34756.getClass(), "_mapperFeatures", 0);
        setField(term34756, term34756.getClass(), "_base", null);
        term34757 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term34757, term34757.getClass(), "_config", null);
        setField(term34757, term34757.getClass(), "_context", null);
        setField(term34757, term34757.getClass(), "_parserFactory", null);
        setBooleanField(term34757, term34757.getClass(), "_unwrapRoot", false);
        setField(term34757, term34757.getClass(), "_filter", null);
        setField(term34757, term34757.getClass(), "_valueType", null);
        setField(term34757, term34757.getClass(), "_rootDeserializer", null);
        setField(term34757, term34757.getClass(), "_valueToUpdate", null);
        setField(term34757, term34757.getClass(), "_schema", null);
        setField(term34757, term34757.getClass(), "_injectableValues", null);
        setField(term34757, term34757.getClass(), "_dataFormatReaders", null);
        setField(term34757, term34757.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term34518;
        args[1] = term34628;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34754));
        assertTrue(recursiveEquals(term34518, term34756));
        assertTrue(recursiveEquals(term34628, term34757));
    }

};


