package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;

public class MethodProperty_init_211251158237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6513;
     Object term6937;
     Object term6938;

    public MethodProperty_init_211251158237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6513 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        term6937 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        setField(term6937, term6937.getClass(), "_annotated", null);
        setField(term6937, term6937.getClass(), "_setter", null);
        setBooleanField(term6937, term6937.getClass(), "_skipNulls", false);
        setField(term6937, term6937.getClass(), "_propName", null);
        setField(term6937, term6937.getClass(), "_type", null);
        setField(term6937, term6937.getClass(), "_wrapperName", null);
        setField(term6937, term6937.getClass(), "_contextAnnotations", null);
        setField(term6937, term6937.getClass(), "_valueDeserializer", null);
        setField(term6937, term6937.getClass(), "_valueTypeDeserializer", null);
        setField(term6937, term6937.getClass(), "_nullProvider", null);
        setField(term6937, term6937.getClass(), "_managedReferenceName", null);
        setField(term6937, term6937.getClass(), "_objectIdInfo", null);
        setField(term6937, term6937.getClass(), "_viewMatcher", null);
        setIntField(term6937, term6937.getClass(), "_propertyIndex", 0);
        setField(term6937, term6937.getClass(), "_metadata", null);
        setField(term6937, term6937.getClass(), "_propertyFormat", null);
        setField(term6937, term6937.getClass(), "_aliases", null);
        term6938 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        setField(term6938, term6938.getClass(), "_annotated", null);
        setField(term6938, term6938.getClass(), "_setter", null);
        setBooleanField(term6938, term6938.getClass(), "_skipNulls", false);
        setField(term6938, term6938.getClass(), "_propName", null);
        setField(term6938, term6938.getClass(), "_type", null);
        setField(term6938, term6938.getClass(), "_wrapperName", null);
        setField(term6938, term6938.getClass(), "_contextAnnotations", null);
        setField(term6938, term6938.getClass(), "_valueDeserializer", null);
        setField(term6938, term6938.getClass(), "_valueTypeDeserializer", null);
        setField(term6938, term6938.getClass(), "_nullProvider", null);
        setField(term6938, term6938.getClass(), "_managedReferenceName", null);
        setField(term6938, term6938.getClass(), "_objectIdInfo", null);
        setField(term6938, term6938.getClass(), "_viewMatcher", null);
        setIntField(term6938, term6938.getClass(), "_propertyIndex", 0);
        setField(term6938, term6938.getClass(), "_metadata", null);
        setField(term6938, term6938.getClass(), "_propertyFormat", null);
        setField(term6938, term6938.getClass(), "_aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        argTypes[1] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[2];
        args[0] = term6513;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6937));
        assertTrue(recursiveEquals(term6513, term6938));
    }

};


