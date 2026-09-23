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

public class ObjectReader_init_1619648465308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110501;
     Object term110611;
     Object term110649;
     Object term110651;
     Object term110652;

    public ObjectReader_init_1619648465308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term110099 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term110247 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term110409 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ByteDeser"));
        setField(term110099, term110099.getClass(), "_config", null);
        setField(term110099, term110099.getClass(), "_context", term110247);
        setField(term110099, term110099.getClass(), "_rootDeserializers", null);
        setField(term110099, term110099.getClass(), "_parserFactory", null);
        setField(term110099, term110099.getClass(), "_rootNames", null);
        setField(term110099, term110099.getClass(), "_valueType", null);
        setField(term110099, term110099.getClass(), "_rootDeserializer", term110409);
        setField(term110099, term110099.getClass(), "_valueToUpdate", null);
        setField(term110099, term110099.getClass(), "_schema", null);
        setField(term110099, term110099.getClass(), "_injectableValues", null);
        term110501 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term110501, term110501.getClass(), "_context", null);
        setField(term110501, term110501.getClass(), "_rootDeserializers", null);
        setField(term110501, term110501.getClass(), "_parserFactory", null);
        setField(term110501, term110501.getClass(), "_rootNames", null);
        setField(term110501, term110501.getClass(), "_valueType", null);
        setField(term110501, term110501.getClass(), "_rootDeserializer", null);
        setField(term110501, term110501.getClass(), "_valueToUpdate", null);
        setField(term110501, term110501.getClass(), "_schema", null);
        setField(term110501, term110501.getClass(), "_injectableValues", null);
        term110611 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term110611, term110611.getClass(), "_rootName", null);
        setIntField(term110611, term110611.getClass(), "_deserFeatures", -1);
        term110649 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term110650 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term110650, term110650.getClass(), "_deserFeatures", -1);
        setField(term110650, term110650.getClass(), "_problemHandlers", null);
        setField(term110650, term110650.getClass(), "_nodeFactory", null);
        setIntField(term110650, term110650.getClass(), "_parserFeatures", 0);
        setIntField(term110650, term110650.getClass(), "_parserFeaturesToChange", 0);
        setField(term110650, term110650.getClass(), "_mixInAnnotations", null);
        setField(term110650, term110650.getClass(), "_subtypeResolver", null);
        setField(term110650, term110650.getClass(), "_rootName", null);
        setField(term110650, term110650.getClass(), "_view", null);
        setField(term110650, term110650.getClass(), "_attributes", null);
        setIntField(term110650, term110650.getClass(), "_mapperFeatures", 0);
        setField(term110650, term110650.getClass(), "_base", null);
        setField(term110649, term110649.getClass(), "_config", term110650);
        setField(term110649, term110649.getClass(), "_context", null);
        setField(term110649, term110649.getClass(), "_parserFactory", null);
        setBooleanField(term110649, term110649.getClass(), "_unwrapRoot", true);
        setField(term110649, term110649.getClass(), "_valueType", null);
        setField(term110649, term110649.getClass(), "_rootDeserializer", null);
        setField(term110649, term110649.getClass(), "_valueToUpdate", null);
        setField(term110649, term110649.getClass(), "_schema", null);
        setField(term110649, term110649.getClass(), "_injectableValues", null);
        setField(term110649, term110649.getClass(), "_dataFormatReaders", null);
        setField(term110649, term110649.getClass(), "_rootDeserializers", null);
        setField(term110649, term110649.getClass(), "_rootNames", null);
        term110651 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term110651, term110651.getClass(), "_deserFeatures", -1);
        setField(term110651, term110651.getClass(), "_problemHandlers", null);
        setField(term110651, term110651.getClass(), "_nodeFactory", null);
        setIntField(term110651, term110651.getClass(), "_parserFeatures", 0);
        setIntField(term110651, term110651.getClass(), "_parserFeaturesToChange", 0);
        setField(term110651, term110651.getClass(), "_mixInAnnotations", null);
        setField(term110651, term110651.getClass(), "_subtypeResolver", null);
        setField(term110651, term110651.getClass(), "_rootName", null);
        setField(term110651, term110651.getClass(), "_view", null);
        setField(term110651, term110651.getClass(), "_attributes", null);
        setIntField(term110651, term110651.getClass(), "_mapperFeatures", 0);
        setField(term110651, term110651.getClass(), "_base", null);
        term110652 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term110652, term110652.getClass(), "_config", null);
        setField(term110652, term110652.getClass(), "_context", null);
        setField(term110652, term110652.getClass(), "_parserFactory", null);
        setBooleanField(term110652, term110652.getClass(), "_unwrapRoot", false);
        setField(term110652, term110652.getClass(), "_valueType", null);
        setField(term110652, term110652.getClass(), "_rootDeserializer", null);
        setField(term110652, term110652.getClass(), "_valueToUpdate", null);
        setField(term110652, term110652.getClass(), "_schema", null);
        setField(term110652, term110652.getClass(), "_injectableValues", null);
        setField(term110652, term110652.getClass(), "_dataFormatReaders", null);
        setField(term110652, term110652.getClass(), "_rootDeserializers", null);
        setField(term110652, term110652.getClass(), "_rootNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term110501;
        args[1] = term110611;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term110649));
        assertTrue(recursiveEquals(term110501, term110651));
        assertTrue(recursiveEquals(term110611, term110652));
    }

};


