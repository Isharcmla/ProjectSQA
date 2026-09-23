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
import java.util.ArrayList;

public class BasicBeanDescription_findPropertyFields_1404215125289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130602;

    public BasicBeanDescription_findPropertyFields_1404215125289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term131018 = new ArrayList();
        term130602 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term130738 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term130848 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term130966 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term130602, term130602.getClass(), "_properties", null);
        setBooleanField(term130738, term130738.getClass(), "_collected", false);
        setField(term130738, term130738.getClass(), "_annotationIntrospector", null);
        setBooleanField(term130738, term130738.getClass(), "_forSerialization", false);
        setIntField(term130848, term130848.getClass(), "_mapperFeatures", -1);
        setField(term130738, term130738.getClass(), "_config", term130848);
        setField(term130966, term130966.getClass(), "_fields", term131018);
        setField(term130738, term130738.getClass(), "_classDef", term130966);
        setField(term130602, term130602.getClass(), "_propCollector", term130738);
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
            callMethod(klass, "_findPropertyFields", argTypes, term130602, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


