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

public class BasicBeanDescription_findPropertyFields_1404215125331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160584;

    public BasicBeanDescription_findPropertyFields_1404215125331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160584 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term160720 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term160830 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term160584, term160584.getClass(), "_properties", null);
        setBooleanField(term160720, term160720.getClass(), "_collected", false);
        setField(term160720, term160720.getClass(), "_annotationIntrospector", null);
        setBooleanField(term160720, term160720.getClass(), "_forSerialization", false);
        setIntField(term160830, term160830.getClass(), "_mapperFeatures", -1);
        setField(term160720, term160720.getClass(), "_config", term160830);
        setField(term160584, term160584.getClass(), "_propCollector", term160720);
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
            callMethod(klass, "_findPropertyFields", argTypes, term160584, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


