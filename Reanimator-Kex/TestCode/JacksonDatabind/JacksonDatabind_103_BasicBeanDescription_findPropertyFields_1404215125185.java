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

public class BasicBeanDescription_findPropertyFields_1404215125185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61174;

    public BasicBeanDescription_findPropertyFields_1404215125185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61174 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term61310 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term61420 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term61538 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term61174, term61174.getClass(), "_properties", null);
        setBooleanField(term61310, term61310.getClass(), "_collected", false);
        setField(term61310, term61310.getClass(), "_annotationIntrospector", null);
        setBooleanField(term61310, term61310.getClass(), "_forSerialization", false);
        setIntField(term61420, term61420.getClass(), "_mapperFeatures", -1);
        setField(term61310, term61310.getClass(), "_config", term61420);
        setField(term61538, term61538.getClass(), "_fields", null);
        setField(term61538, term61538.getClass(), "_type", null);
        setField(term61310, term61310.getClass(), "_classDef", term61538);
        setField(term61174, term61174.getClass(), "_propCollector", term61310);
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
            callMethod(klass, "_findPropertyFields", argTypes, term61174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


