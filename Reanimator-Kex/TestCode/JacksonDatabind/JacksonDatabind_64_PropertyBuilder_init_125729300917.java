package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PropertyBuilder_init_125729300917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8249;
     Object term8379;

    public PropertyBuilder_init_125729300917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8037 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term8143 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term8037, term8037.getClass(), "_config", term8143);
        setField(term8037, term8037.getClass(), "_beanDesc", null);
        term8249 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term8379 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term8249;
        args[1] = term8379;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


