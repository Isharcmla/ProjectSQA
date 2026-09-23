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

public class MethodProperty_init_80473717636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6329;
     Object term6929;
     Object term6930;

    public MethodProperty_init_80473717636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6329 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        term6929 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        setField(term6929, term6929.getClass(), "_annotated", null);
        setField(term6929, term6929.getClass(), "_setter", null);
        setBooleanField(term6929, term6929.getClass(), "_skipNulls", false);
        setField(term6929, term6929.getClass(), "_propName", null);
        setField(term6929, term6929.getClass(), "_type", null);
        setField(term6929, term6929.getClass(), "_wrapperName", null);
        setField(term6929, term6929.getClass(), "_contextAnnotations", null);
        setField(term6929, term6929.getClass(), "_valueDeserializer", null);
        setField(term6929, term6929.getClass(), "_valueTypeDeserializer", null);
        setField(term6929, term6929.getClass(), "_nullProvider", null);
        setField(term6929, term6929.getClass(), "_managedReferenceName", null);
        setField(term6929, term6929.getClass(), "_objectIdInfo", null);
        setField(term6929, term6929.getClass(), "_viewMatcher", null);
        setIntField(term6929, term6929.getClass(), "_propertyIndex", 0);
        setField(term6929, term6929.getClass(), "_metadata", null);
        setField(term6929, term6929.getClass(), "_propertyFormat", null);
        setField(term6929, term6929.getClass(), "_aliases", null);
        term6930 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        setField(term6930, term6930.getClass(), "_annotated", null);
        setField(term6930, term6930.getClass(), "_setter", null);
        setBooleanField(term6930, term6930.getClass(), "_skipNulls", false);
        setField(term6930, term6930.getClass(), "_propName", null);
        setField(term6930, term6930.getClass(), "_type", null);
        setField(term6930, term6930.getClass(), "_wrapperName", null);
        setField(term6930, term6930.getClass(), "_contextAnnotations", null);
        setField(term6930, term6930.getClass(), "_valueDeserializer", null);
        setField(term6930, term6930.getClass(), "_valueTypeDeserializer", null);
        setField(term6930, term6930.getClass(), "_nullProvider", null);
        setField(term6930, term6930.getClass(), "_managedReferenceName", null);
        setField(term6930, term6930.getClass(), "_objectIdInfo", null);
        setField(term6930, term6930.getClass(), "_viewMatcher", null);
        setIntField(term6930, term6930.getClass(), "_propertyIndex", 0);
        setField(term6930, term6930.getClass(), "_metadata", null);
        setField(term6930, term6930.getClass(), "_propertyFormat", null);
        setField(term6930, term6930.getClass(), "_aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term6329;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6929));
        assertTrue(recursiveEquals(term6329, term6930));
    }

};


