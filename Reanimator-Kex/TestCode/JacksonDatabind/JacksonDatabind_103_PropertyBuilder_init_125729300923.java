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

public class PropertyBuilder_init_125729300923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11871;
     Object term11936;

    public PropertyBuilder_init_125729300923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11381 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term11487 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term11936 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term12010 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term11381, term11381.getClass(), "_config", term11487);
        setField(term11936, term11936.getClass(), "_annotationIntrospector", term12010);
        setField(term11936, term11936.getClass(), "_classInfo", null);
        setField(term11381, term11381.getClass(), "_beanDesc", term11936);
        term11871 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term11871;
        args[1] = term11936;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


