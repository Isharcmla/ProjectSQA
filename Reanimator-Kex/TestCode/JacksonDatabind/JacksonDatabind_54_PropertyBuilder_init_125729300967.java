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

public class PropertyBuilder_init_125729300967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59243;
     Object term59479;

    public PropertyBuilder_init_125729300967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59031 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term59137 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term59031, term59031.getClass(), "_config", term59137);
        setField(term59031, term59031.getClass(), "_beanDesc", null);
        term59243 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term59349 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term59349, term59349.getClass(), "_overrides", null);
        setField(term59243, term59243.getClass(), "_configOverrides", term59349);
        setField(term59243, term59243.getClass(), "_serializationInclusion", null);
        term59479 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term59585 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term59733 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term59851 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term59967 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term59585, term59585.getClass(), "_class", null);
        setField(term59479, term59479.getClass(), "_type", term59585);
        setField(term59479, term59479.getClass(), "_annotationIntrospector", term59733);
        setField(term59967, term59967.getClass(), "_annotations", null);
        setField(term59851, term59851.getClass(), "_classAnnotations", term59967);
        setField(term59479, term59479.getClass(), "_classInfo", term59851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term59243;
        args[1] = term59479;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


