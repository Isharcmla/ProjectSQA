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
import java.lang.Boolean;

public class BasicBeanDescription_findPropertyFields_1404215125327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157263;

    public BasicBeanDescription_findPropertyFields_1404215125327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term157675 = new Boolean(false);
        term157263 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term157399 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term157509 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term157627 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term157263, term157263.getClass(), "_properties", null);
        setBooleanField(term157399, term157399.getClass(), "_collected", false);
        setField(term157399, term157399.getClass(), "_annotationIntrospector", null);
        setBooleanField(term157399, term157399.getClass(), "_forSerialization", false);
        setIntField(term157509, term157509.getClass(), "_mapperFeatures", -1);
        setField(term157399, term157399.getClass(), "_config", term157509);
        setField(term157627, term157627.getClass(), "_fields", null);
        setField(term157627, term157627.getClass(), "_type", null);
        setField(term157627, term157627.getClass(), "_memberMethods", null);
        setField(term157627, term157627.getClass(), "_nonStaticInnerClass", term157675);
        setField(term157399, term157399.getClass(), "_classDef", term157627);
        setBooleanField(term157399, term157399.getClass(), "_useAnnotations", false);
        setField(term157263, term157263.getClass(), "_propCollector", term157399);
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
            callMethod(klass, "_findPropertyFields", argTypes, term157263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


