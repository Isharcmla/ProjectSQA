package com.fasterxml.jackson.databind.introspect;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasicBeanDescription_findPropertyFields_1404215125307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142924;

    public BasicBeanDescription_findPropertyFields_1404215125307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142924 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term143060 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term143170 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term143288 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term142924, term142924.getClass(), "_properties", null);
        setBooleanField(term143060, term143060.getClass(), "_collected", false);
        setField(term143060, term143060.getClass(), "_annotationIntrospector", null);
        setBooleanField(term143060, term143060.getClass(), "_forSerialization", true);
        setIntField(term143170, term143170.getClass(), "_mapperFeatures", 0);
        setField(term143060, term143060.getClass(), "_config", term143170);
        setField(term143060, term143060.getClass(), "_classDef", term143288);
        setField(term142924, term142924.getClass(), "_propCollector", term143060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "_findPropertyFields", argTypes, term142924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


