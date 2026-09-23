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

public class ObjectReader_init_1613963825243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32175;
     Object term32285;
     Object term33161;
     Object term33163;
     Object term33164;

    public ObjectReader_init_1613963825243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31973 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term32083 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term31973, term31973.getClass(), "_config", term32083);
        term32175 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term32285 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term33161 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term33162 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33162, term33162.getClass(), "_problemHandlers", null);
        setField(term33162, term33162.getClass(), "_nodeFactory", null);
        setIntField(term33162, term33162.getClass(), "_deserFeatures", 0);
        setIntField(term33162, term33162.getClass(), "_parserFeatures", 0);
        setIntField(term33162, term33162.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term33162, term33162.getClass(), "_formatReadFeatures", 0);
        setIntField(term33162, term33162.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term33162, term33162.getClass(), "_mixIns", null);
        setField(term33162, term33162.getClass(), "_subtypeResolver", null);
        setField(term33162, term33162.getClass(), "_rootName", null);
        setField(term33162, term33162.getClass(), "_view", null);
        setField(term33162, term33162.getClass(), "_attributes", null);
        setField(term33162, term33162.getClass(), "_rootNames", null);
        setIntField(term33162, term33162.getClass(), "_mapperFeatures", 0);
        setField(term33162, term33162.getClass(), "_base", null);
        setField(term33161, term33161.getClass(), "_config", term33162);
        setField(term33161, term33161.getClass(), "_context", null);
        setField(term33161, term33161.getClass(), "_parserFactory", null);
        setBooleanField(term33161, term33161.getClass(), "_unwrapRoot", false);
        setField(term33161, term33161.getClass(), "_filter", null);
        setField(term33161, term33161.getClass(), "_valueType", null);
        setField(term33161, term33161.getClass(), "_rootDeserializer", null);
        setField(term33161, term33161.getClass(), "_valueToUpdate", null);
        setField(term33161, term33161.getClass(), "_schema", null);
        setField(term33161, term33161.getClass(), "_injectableValues", null);
        setField(term33161, term33161.getClass(), "_dataFormatReaders", null);
        setField(term33161, term33161.getClass(), "_rootDeserializers", null);
        term33163 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33163, term33163.getClass(), "_problemHandlers", null);
        setField(term33163, term33163.getClass(), "_nodeFactory", null);
        setIntField(term33163, term33163.getClass(), "_deserFeatures", 0);
        setIntField(term33163, term33163.getClass(), "_parserFeatures", 0);
        setIntField(term33163, term33163.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term33163, term33163.getClass(), "_formatReadFeatures", 0);
        setIntField(term33163, term33163.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term33163, term33163.getClass(), "_mixIns", null);
        setField(term33163, term33163.getClass(), "_subtypeResolver", null);
        setField(term33163, term33163.getClass(), "_rootName", null);
        setField(term33163, term33163.getClass(), "_view", null);
        setField(term33163, term33163.getClass(), "_attributes", null);
        setField(term33163, term33163.getClass(), "_rootNames", null);
        setIntField(term33163, term33163.getClass(), "_mapperFeatures", 0);
        setField(term33163, term33163.getClass(), "_base", null);
        term33164 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term33164, term33164.getClass(), "_jsonFactory", null);
        setField(term33164, term33164.getClass(), "_typeFactory", null);
        setField(term33164, term33164.getClass(), "_injectableValues", null);
        setField(term33164, term33164.getClass(), "_subtypeResolver", null);
        setField(term33164, term33164.getClass(), "_mixIns", null);
        setField(term33164, term33164.getClass(), "_serializationConfig", null);
        setField(term33164, term33164.getClass(), "_serializerProvider", null);
        setField(term33164, term33164.getClass(), "_serializerFactory", null);
        setField(term33164, term33164.getClass(), "_deserializationConfig", null);
        setField(term33164, term33164.getClass(), "_deserializationContext", null);
        setField(term33164, term33164.getClass(), "_registeredModuleTypes", null);
        setField(term33164, term33164.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term32175;
        args[1] = term32285;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33161));
        assertTrue(recursiveEquals(term32175, term33163));
        assertTrue(recursiveEquals(term32285, term33164));
    }

};


