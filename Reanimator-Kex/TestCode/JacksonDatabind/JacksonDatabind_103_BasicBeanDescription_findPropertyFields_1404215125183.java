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

public class BasicBeanDescription_findPropertyFields_1404215125183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59347;

    public BasicBeanDescription_findPropertyFields_1404215125183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59347 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term59483 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term59593 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term59347, term59347.getClass(), "_properties", null);
        setBooleanField(term59483, term59483.getClass(), "_collected", false);
        setField(term59483, term59483.getClass(), "_annotationIntrospector", null);
        setBooleanField(term59483, term59483.getClass(), "_forSerialization", false);
        setIntField(term59593, term59593.getClass(), "_mapperFeatures", -1);
        setField(term59483, term59483.getClass(), "_config", term59593);
        setField(term59347, term59347.getClass(), "_propCollector", term59483);
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
            callMethod(klass, "_findPropertyFields", argTypes, term59347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


