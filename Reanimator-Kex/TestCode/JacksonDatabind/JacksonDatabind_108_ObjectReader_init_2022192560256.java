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

public class ObjectReader_init_2022192560256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34101;
     Object term34211;
     Object term34711;
     Object term34713;
     Object term34714;

    public ObjectReader_init_2022192560256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33899 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term34009 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33899, term33899.getClass(), "_config", term34009);
        term34101 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term34211 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term34711 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term34712 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term34712, term34712.getClass(), "_problemHandlers", null);
        setField(term34712, term34712.getClass(), "_nodeFactory", null);
        setIntField(term34712, term34712.getClass(), "_deserFeatures", 0);
        setIntField(term34712, term34712.getClass(), "_parserFeatures", 0);
        setIntField(term34712, term34712.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term34712, term34712.getClass(), "_formatReadFeatures", 0);
        setIntField(term34712, term34712.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term34712, term34712.getClass(), "_mixIns", null);
        setField(term34712, term34712.getClass(), "_subtypeResolver", null);
        setField(term34712, term34712.getClass(), "_rootName", null);
        setField(term34712, term34712.getClass(), "_view", null);
        setField(term34712, term34712.getClass(), "_attributes", null);
        setField(term34712, term34712.getClass(), "_rootNames", null);
        setField(term34712, term34712.getClass(), "_configOverrides", null);
        setIntField(term34712, term34712.getClass(), "_mapperFeatures", 0);
        setField(term34712, term34712.getClass(), "_base", null);
        setField(term34711, term34711.getClass(), "_config", term34712);
        setField(term34711, term34711.getClass(), "_context", null);
        setField(term34711, term34711.getClass(), "_parserFactory", null);
        setBooleanField(term34711, term34711.getClass(), "_unwrapRoot", false);
        setField(term34711, term34711.getClass(), "_filter", null);
        setField(term34711, term34711.getClass(), "_valueType", null);
        setField(term34711, term34711.getClass(), "_rootDeserializer", null);
        setField(term34711, term34711.getClass(), "_valueToUpdate", null);
        setField(term34711, term34711.getClass(), "_schema", null);
        setField(term34711, term34711.getClass(), "_injectableValues", null);
        setField(term34711, term34711.getClass(), "_dataFormatReaders", null);
        setField(term34711, term34711.getClass(), "_rootDeserializers", null);
        term34713 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term34713, term34713.getClass(), "_problemHandlers", null);
        setField(term34713, term34713.getClass(), "_nodeFactory", null);
        setIntField(term34713, term34713.getClass(), "_deserFeatures", 0);
        setIntField(term34713, term34713.getClass(), "_parserFeatures", 0);
        setIntField(term34713, term34713.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term34713, term34713.getClass(), "_formatReadFeatures", 0);
        setIntField(term34713, term34713.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term34713, term34713.getClass(), "_mixIns", null);
        setField(term34713, term34713.getClass(), "_subtypeResolver", null);
        setField(term34713, term34713.getClass(), "_rootName", null);
        setField(term34713, term34713.getClass(), "_view", null);
        setField(term34713, term34713.getClass(), "_attributes", null);
        setField(term34713, term34713.getClass(), "_rootNames", null);
        setField(term34713, term34713.getClass(), "_configOverrides", null);
        setIntField(term34713, term34713.getClass(), "_mapperFeatures", 0);
        setField(term34713, term34713.getClass(), "_base", null);
        term34714 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term34714, term34714.getClass(), "_config", null);
        setField(term34714, term34714.getClass(), "_context", null);
        setField(term34714, term34714.getClass(), "_parserFactory", null);
        setBooleanField(term34714, term34714.getClass(), "_unwrapRoot", false);
        setField(term34714, term34714.getClass(), "_filter", null);
        setField(term34714, term34714.getClass(), "_valueType", null);
        setField(term34714, term34714.getClass(), "_rootDeserializer", null);
        setField(term34714, term34714.getClass(), "_valueToUpdate", null);
        setField(term34714, term34714.getClass(), "_schema", null);
        setField(term34714, term34714.getClass(), "_injectableValues", null);
        setField(term34714, term34714.getClass(), "_dataFormatReaders", null);
        setField(term34714, term34714.getClass(), "_rootDeserializers", null);
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
        args[0] = term34101;
        args[1] = term34211;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34711));
        assertTrue(recursiveEquals(term34101, term34713));
        assertTrue(recursiveEquals(term34211, term34714));
    }

};


