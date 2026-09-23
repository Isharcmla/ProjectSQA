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

public class BasicBeanDescription_init_908883251127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23435;

    public BasicBeanDescription_init_908883251127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23189 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term23299 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term23189, term23189.getClass(), "_type", null);
        setField(term23189, term23189.getClass(), "_propCollector", null);
        setField(term23189, term23189.getClass(), "_config", term23299);
        term23435 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term23545 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term23435, term23435.getClass(), "_type", null);
        setField(term23435, term23435.getClass(), "_classDef", null);
        setField(term23435, term23435.getClass(), "_config", term23545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Object[] args = new Object[1];
        args[0] = term23435;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


