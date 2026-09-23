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

public class BasicBeanDescription_findPropertyFields_1404215125273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116741;

    public BasicBeanDescription_findPropertyFields_1404215125273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116741 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term116877 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term116987 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term117105 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term116741, term116741.getClass(), "_properties", null);
        setBooleanField(term116877, term116877.getClass(), "_collected", false);
        setField(term116877, term116877.getClass(), "_annotationIntrospector", null);
        setBooleanField(term116877, term116877.getClass(), "_forSerialization", true);
        setIntField(term116987, term116987.getClass(), "_mapperFeatures", -1);
        setField(term116877, term116877.getClass(), "_config", term116987);
        setField(term116877, term116877.getClass(), "_classDef", term117105);
        setField(term116741, term116741.getClass(), "_propCollector", term116877);
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
            callMethod(klass, "_findPropertyFields", argTypes, term116741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


