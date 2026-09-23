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

public class BasicBeanDescription_findPropertyFields_1404215125283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125007;

    public BasicBeanDescription_findPropertyFields_1404215125283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125007 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term125143 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term125253 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term125371 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term125007, term125007.getClass(), "_properties", null);
        setBooleanField(term125143, term125143.getClass(), "_collected", false);
        setField(term125143, term125143.getClass(), "_annotationIntrospector", null);
        setBooleanField(term125143, term125143.getClass(), "_forSerialization", false);
        setIntField(term125253, term125253.getClass(), "_mapperFeatures", -1);
        setField(term125143, term125143.getClass(), "_config", term125253);
        setField(term125371, term125371.getClass(), "_fields", null);
        setField(term125371, term125371.getClass(), "_type", null);
        setField(term125371, term125371.getClass(), "_memberMethods", null);
        setField(term125143, term125143.getClass(), "_classDef", term125371);
        setField(term125007, term125007.getClass(), "_propCollector", term125143);
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
            callMethod(klass, "_findPropertyFields", argTypes, term125007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


