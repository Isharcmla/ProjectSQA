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

public class BasicBeanDescription_init_908883251162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44224;

    public BasicBeanDescription_init_908883251162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43602 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term43716 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term43822 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term43970 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term44088 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term43602, term43602.getClass(), "_type", term43716);
        setField(term43602, term43602.getClass(), "_propCollector", null);
        setField(term43602, term43602.getClass(), "_config", term43822);
        setField(term43602, term43602.getClass(), "_annotationIntrospector", term43970);
        setField(term43602, term43602.getClass(), "_classInfo", term44088);
        term44224 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term44338 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term44456 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term44604 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term44224, term44224.getClass(), "_type", term44338);
        setField(term44224, term44224.getClass(), "_classDef", term44456);
        setField(term44224, term44224.getClass(), "_config", null);
        setField(term44224, term44224.getClass(), "_annotationIntrospector", term44604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Object[] args = new Object[1];
        args[0] = term44224;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


