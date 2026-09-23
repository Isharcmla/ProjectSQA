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

public class BasicBeanDescription_findPropertyFields_1404215125285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127004;

    public BasicBeanDescription_findPropertyFields_1404215125285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127004 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term127140 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term127250 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term127368 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term127004, term127004.getClass(), "_properties", null);
        setBooleanField(term127140, term127140.getClass(), "_collected", false);
        setField(term127140, term127140.getClass(), "_annotationIntrospector", null);
        setBooleanField(term127140, term127140.getClass(), "_forSerialization", false);
        setIntField(term127250, term127250.getClass(), "_mapperFeatures", -1);
        setField(term127140, term127140.getClass(), "_config", term127250);
        setField(term127368, term127368.getClass(), "_fields", null);
        setField(term127368, term127368.getClass(), "_type", null);
        setField(term127140, term127140.getClass(), "_classDef", term127368);
        setField(term127004, term127004.getClass(), "_propCollector", term127140);
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
            callMethod(klass, "_findPropertyFields", argTypes, term127004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


