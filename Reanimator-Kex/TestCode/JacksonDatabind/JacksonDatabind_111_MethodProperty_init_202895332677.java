package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MethodProperty_init_202895332677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28508;

    public MethodProperty_init_202895332677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28380 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        term28508 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term28600 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term28742 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term28890 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term28508, term28508.getClass(), "_name", term28600);
        setBooleanField(term28508, term28508.getClass(), "_forSerialization", false);
        setField(term28508, term28508.getClass(), "_ctorParameters", null);
        setField(term28742, term28742.getClass(), "next", null);
        setField(term28742, term28742.getClass(), "value", null);
        setField(term28508, term28508.getClass(), "_setters", term28742);
        setField(term28508, term28508.getClass(), "_fields", null);
        setField(term28508, term28508.getClass(), "_getters", null);
        setField(term28508, term28508.getClass(), "_metadata", null);
        setField(term28508, term28508.getClass(), "_annotationIntrospector", term28890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term28508;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


