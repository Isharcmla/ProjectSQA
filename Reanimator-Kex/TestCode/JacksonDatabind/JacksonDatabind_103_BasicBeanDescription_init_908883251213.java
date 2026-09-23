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

public class BasicBeanDescription_init_908883251213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78592;

    public BasicBeanDescription_init_908883251213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78072 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term78172 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term78592 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term78645 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term78524 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term78072, term78072.getClass(), "_type", term78172);
        setField(term78592, term78592.getClass(), "_type", null);
        setField(term78592, term78592.getClass(), "_classDef", null);
        setField(term78592, term78592.getClass(), "_config", term78645);
        setField(term78072, term78072.getClass(), "_propCollector", term78592);
        setField(term78072, term78072.getClass(), "_config", term78524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Object[] args = new Object[1];
        args[0] = term78592;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


