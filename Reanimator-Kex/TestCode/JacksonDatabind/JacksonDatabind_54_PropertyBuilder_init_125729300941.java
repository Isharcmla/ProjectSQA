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

public class PropertyBuilder_init_125729300941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25780;
     Object term26016;

    public PropertyBuilder_init_125729300941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25438 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term25544 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term25674 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term25438, term25438.getClass(), "_config", term25544);
        setField(term25438, term25438.getClass(), "_beanDesc", term25674);
        term25780 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term25886 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term25886, term25886.getClass(), "_overrides", null);
        setField(term25780, term25780.getClass(), "_configOverrides", term25886);
        setField(term25780, term25780.getClass(), "_serializationInclusion", null);
        term26016 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term26130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term26278 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term26396 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term26130, term26130.getClass(), "_class", null);
        setField(term26016, term26016.getClass(), "_type", term26130);
        setField(term26016, term26016.getClass(), "_annotationIntrospector", term26278);
        setField(term26016, term26016.getClass(), "_classInfo", term26396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term25780;
        args[1] = term26016;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


