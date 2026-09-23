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
import java.lang.Object;

public class MethodProperty_init_205515932739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7291;
     Object term7474;
     Object term7491;
     Object term7496;
     Object term7500;

    public MethodProperty_init_205515932739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7291 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term7341 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term7291, term7291.getClass(), "_metadata", term7341);
        setField(term7291, term7291.getClass(), "_propertyFormat", null);
        setIntField(term7291, term7291.getClass(), "_propertyIndex", 0);
        setField(term7291, term7291.getClass(), "_propName", null);
        setField(term7291, term7291.getClass(), "_type", null);
        setField(term7291, term7291.getClass(), "_wrapperName", null);
        setField(term7291, term7291.getClass(), "_contextAnnotations", null);
        setField(term7291, term7291.getClass(), "_valueTypeDeserializer", null);
        setField(term7291, term7291.getClass(), "_managedReferenceName", "");
        term7474 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.NioPathDeserializer"));
        term7491 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term7492 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.NioPathDeserializer"));
        Object term7495 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term7491, term7491.getClass(), "_annotated", null);
        setField(term7491, term7491.getClass(), "_setter", null);
        setBooleanField(term7491, term7491.getClass(), "_skipNulls", false);
        setField(term7491, term7491.getClass(), "_propName", null);
        setField(term7491, term7491.getClass(), "_type", null);
        setField(term7491, term7491.getClass(), "_wrapperName", null);
        setField(term7491, term7491.getClass(), "_contextAnnotations", null);
        setField(term7492, term7492.getClass(), "_valueClass", null);
        setField(term7491, term7491.getClass(), "_valueDeserializer", term7492);
        setField(term7491, term7491.getClass(), "_valueTypeDeserializer", null);
        setField(term7491, term7491.getClass(), "_nullProvider", null);
        setField(term7491, term7491.getClass(), "_managedReferenceName", "");
        setField(term7491, term7491.getClass(), "_objectIdInfo", null);
        setField(term7491, term7491.getClass(), "_viewMatcher", null);
        setIntField(term7491, term7491.getClass(), "_propertyIndex", 0);
        setField(term7495, term7495.getClass(), "_required", null);
        setField(term7495, term7495.getClass(), "_description", null);
        setField(term7495, term7495.getClass(), "_index", null);
        setField(term7495, term7495.getClass(), "_defaultValue", null);
        setField(term7495, term7495.getClass(), "_mergeInfo", null);
        setField(term7495, term7495.getClass(), "_valueNulls", null);
        setField(term7495, term7495.getClass(), "_contentNulls", null);
        setField(term7491, term7491.getClass(), "_metadata", term7495);
        setField(term7491, term7491.getClass(), "_propertyFormat", null);
        setField(term7491, term7491.getClass(), "_aliases", null);
        term7496 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term7499 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term7496, term7496.getClass(), "_annotated", null);
        setField(term7496, term7496.getClass(), "_setter", null);
        setBooleanField(term7496, term7496.getClass(), "_skipNulls", false);
        setField(term7496, term7496.getClass(), "_propName", null);
        setField(term7496, term7496.getClass(), "_type", null);
        setField(term7496, term7496.getClass(), "_wrapperName", null);
        setField(term7496, term7496.getClass(), "_contextAnnotations", null);
        setField(term7496, term7496.getClass(), "_valueDeserializer", null);
        setField(term7496, term7496.getClass(), "_valueTypeDeserializer", null);
        setField(term7496, term7496.getClass(), "_nullProvider", null);
        setField(term7496, term7496.getClass(), "_managedReferenceName", "");
        setField(term7496, term7496.getClass(), "_objectIdInfo", null);
        setField(term7496, term7496.getClass(), "_viewMatcher", null);
        setIntField(term7496, term7496.getClass(), "_propertyIndex", 0);
        setField(term7499, term7499.getClass(), "_required", null);
        setField(term7499, term7499.getClass(), "_description", null);
        setField(term7499, term7499.getClass(), "_index", null);
        setField(term7499, term7499.getClass(), "_defaultValue", null);
        setField(term7499, term7499.getClass(), "_mergeInfo", null);
        setField(term7499, term7499.getClass(), "_valueNulls", null);
        setField(term7499, term7499.getClass(), "_contentNulls", null);
        setField(term7496, term7496.getClass(), "_metadata", term7499);
        setField(term7496, term7496.getClass(), "_propertyFormat", null);
        setField(term7496, term7496.getClass(), "_aliases", null);
        term7500 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.NioPathDeserializer"));
        setField(term7500, term7500.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term7291;
        args[1] = term7474;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7491));
        assertTrue(recursiveEquals(term7291, term7496));
        assertTrue(recursiveEquals(term7474, term7500));
    }

};


