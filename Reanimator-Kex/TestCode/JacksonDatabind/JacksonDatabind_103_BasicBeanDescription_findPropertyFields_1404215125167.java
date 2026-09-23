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

public class BasicBeanDescription_findPropertyFields_1404215125167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47745;

    public BasicBeanDescription_findPropertyFields_1404215125167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47745 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term47881 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term47991 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term48109 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term47745, term47745.getClass(), "_properties", null);
        setBooleanField(term47881, term47881.getClass(), "_collected", false);
        setField(term47881, term47881.getClass(), "_annotationIntrospector", null);
        setBooleanField(term47881, term47881.getClass(), "_forSerialization", false);
        setIntField(term47991, term47991.getClass(), "_mapperFeatures", -1);
        setField(term47881, term47881.getClass(), "_config", term47991);
        setField(term47881, term47881.getClass(), "_classDef", term48109);
        setField(term47745, term47745.getClass(), "_propCollector", term47881);
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
            callMethod(klass, "_findPropertyFields", argTypes, term47745, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


