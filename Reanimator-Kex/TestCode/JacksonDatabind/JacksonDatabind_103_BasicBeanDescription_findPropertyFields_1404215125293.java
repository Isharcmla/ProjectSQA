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

public class BasicBeanDescription_findPropertyFields_1404215125293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133283;

    public BasicBeanDescription_findPropertyFields_1404215125293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133283 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term133419 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term133529 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term133647 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term133283, term133283.getClass(), "_properties", null);
        setBooleanField(term133419, term133419.getClass(), "_collected", false);
        setField(term133419, term133419.getClass(), "_annotationIntrospector", null);
        setBooleanField(term133419, term133419.getClass(), "_forSerialization", false);
        setIntField(term133529, term133529.getClass(), "_mapperFeatures", -1);
        setField(term133419, term133419.getClass(), "_config", term133529);
        setField(term133647, term133647.getClass(), "_fields", null);
        setField(term133647, term133647.getClass(), "_type", null);
        setField(term133419, term133419.getClass(), "_classDef", term133647);
        setField(term133283, term133283.getClass(), "_propCollector", term133419);
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
            callMethod(klass, "_findPropertyFields", argTypes, term133283, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


