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
import java.lang.ClassCastException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MethodProperty_init_202895332684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32652;

    public MethodProperty_init_202895332684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32524 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        term32652 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term32744 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term32886 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term33012 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        Object term33132 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term32652, term32652.getClass(), "_name", term32744);
        setBooleanField(term32652, term32652.getClass(), "_forSerialization", false);
        setField(term33012, term33012.getClass(), "_owner", term33132);
        setField(term32886, term32886.getClass(), "value", term33012);
        setField(term32886, term32886.getClass(), "next", null);
        setField(term32652, term32652.getClass(), "_ctorParameters", term32886);
        setField(term32652, term32652.getClass(), "_annotationIntrospector", null);
        setField(term32652, term32652.getClass(), "_metadata", null);
        setField(term32652, term32652.getClass(), "_getters", term32886);
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
        args[0] = term32652;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


