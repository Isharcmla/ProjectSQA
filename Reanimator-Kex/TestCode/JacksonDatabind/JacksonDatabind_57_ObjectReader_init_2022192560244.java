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

public class ObjectReader_init_2022192560244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32592;
     Object term32702;
     Object term33205;
     Object term33207;
     Object term33208;

    public ObjectReader_init_2022192560244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32390 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term32500 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term32390, term32390.getClass(), "_config", term32500);
        term32592 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term32702 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term33205 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term33206 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33206, term33206.getClass(), "_problemHandlers", null);
        setField(term33206, term33206.getClass(), "_nodeFactory", null);
        setIntField(term33206, term33206.getClass(), "_deserFeatures", 0);
        setIntField(term33206, term33206.getClass(), "_parserFeatures", 0);
        setIntField(term33206, term33206.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term33206, term33206.getClass(), "_formatReadFeatures", 0);
        setIntField(term33206, term33206.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term33206, term33206.getClass(), "_mixIns", null);
        setField(term33206, term33206.getClass(), "_subtypeResolver", null);
        setField(term33206, term33206.getClass(), "_rootName", null);
        setField(term33206, term33206.getClass(), "_view", null);
        setField(term33206, term33206.getClass(), "_attributes", null);
        setField(term33206, term33206.getClass(), "_rootNames", null);
        setIntField(term33206, term33206.getClass(), "_mapperFeatures", 0);
        setField(term33206, term33206.getClass(), "_base", null);
        setField(term33205, term33205.getClass(), "_config", term33206);
        setField(term33205, term33205.getClass(), "_context", null);
        setField(term33205, term33205.getClass(), "_parserFactory", null);
        setBooleanField(term33205, term33205.getClass(), "_unwrapRoot", false);
        setField(term33205, term33205.getClass(), "_filter", null);
        setField(term33205, term33205.getClass(), "_valueType", null);
        setField(term33205, term33205.getClass(), "_rootDeserializer", null);
        setField(term33205, term33205.getClass(), "_valueToUpdate", null);
        setField(term33205, term33205.getClass(), "_schema", null);
        setField(term33205, term33205.getClass(), "_injectableValues", null);
        setField(term33205, term33205.getClass(), "_dataFormatReaders", null);
        setField(term33205, term33205.getClass(), "_rootDeserializers", null);
        term33207 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33207, term33207.getClass(), "_problemHandlers", null);
        setField(term33207, term33207.getClass(), "_nodeFactory", null);
        setIntField(term33207, term33207.getClass(), "_deserFeatures", 0);
        setIntField(term33207, term33207.getClass(), "_parserFeatures", 0);
        setIntField(term33207, term33207.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term33207, term33207.getClass(), "_formatReadFeatures", 0);
        setIntField(term33207, term33207.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term33207, term33207.getClass(), "_mixIns", null);
        setField(term33207, term33207.getClass(), "_subtypeResolver", null);
        setField(term33207, term33207.getClass(), "_rootName", null);
        setField(term33207, term33207.getClass(), "_view", null);
        setField(term33207, term33207.getClass(), "_attributes", null);
        setField(term33207, term33207.getClass(), "_rootNames", null);
        setIntField(term33207, term33207.getClass(), "_mapperFeatures", 0);
        setField(term33207, term33207.getClass(), "_base", null);
        term33208 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term33208, term33208.getClass(), "_config", null);
        setField(term33208, term33208.getClass(), "_context", null);
        setField(term33208, term33208.getClass(), "_parserFactory", null);
        setBooleanField(term33208, term33208.getClass(), "_unwrapRoot", false);
        setField(term33208, term33208.getClass(), "_filter", null);
        setField(term33208, term33208.getClass(), "_valueType", null);
        setField(term33208, term33208.getClass(), "_rootDeserializer", null);
        setField(term33208, term33208.getClass(), "_valueToUpdate", null);
        setField(term33208, term33208.getClass(), "_schema", null);
        setField(term33208, term33208.getClass(), "_injectableValues", null);
        setField(term33208, term33208.getClass(), "_dataFormatReaders", null);
        setField(term33208, term33208.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        argTypes[7] = Class.forName("com.fasterxml.jackson.databind.deser.DataFormatReaders");
        Object[] args = new Object[8];
        args[0] = term32592;
        args[1] = term32702;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33205));
        assertTrue(recursiveEquals(term32592, term33207));
        assertTrue(recursiveEquals(term32702, term33208));
    }

};


