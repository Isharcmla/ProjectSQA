package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;

public class AsPropertyTypeDeserializer_init_65534182720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2652;
     Object term3137;
     Object term3138;

    public AsPropertyTypeDeserializer_init_65534182720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2652 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        term3137 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term3137, term3137.getClass(), "_inclusion", null);
        setField(term3137, term3137.getClass(), "_idResolver", null);
        setField(term3137, term3137.getClass(), "_baseType", null);
        setField(term3137, term3137.getClass(), "_property", null);
        setField(term3137, term3137.getClass(), "_defaultImpl", null);
        setField(term3137, term3137.getClass(), "_typePropertyName", null);
        setBooleanField(term3137, term3137.getClass(), "_typeIdVisible", false);
        setField(term3137, term3137.getClass(), "_deserializers", null);
        setField(term3137, term3137.getClass(), "_defaultImplDeserializer", null);
        term3138 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term3138, term3138.getClass(), "_inclusion", null);
        setField(term3138, term3138.getClass(), "_idResolver", null);
        setField(term3138, term3138.getClass(), "_baseType", null);
        setField(term3138, term3138.getClass(), "_property", null);
        setField(term3138, term3138.getClass(), "_defaultImpl", null);
        setField(term3138, term3138.getClass(), "_typePropertyName", null);
        setBooleanField(term3138, term3138.getClass(), "_typeIdVisible", false);
        setField(term3138, term3138.getClass(), "_deserializers", null);
        setField(term3138, term3138.getClass(), "_defaultImplDeserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Object[] args = new Object[2];
        args[0] = term2652;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3137));
        assertTrue(recursiveEquals(term2652, term3138));
    }

};


