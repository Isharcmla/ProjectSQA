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

public class FieldProperty_init_79566906119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80144;

    public FieldProperty_init_79566906119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80010 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        setField(term80010, term80010.getClass(), "_metadata", null);
        setIntField(term80010, term80010.getClass(), "_propertyIndex", 0);
        term80144 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term80236 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term80384 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term80518 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        setField(term80144, term80144.getClass(), "_fullName", term80236);
        setField(term80144, term80144.getClass(), "_annotationIntrospector", term80384);
        setField(term80144, term80144.getClass(), "_member", term80518);
        setField(term80144, term80144.getClass(), "_metadata", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField");
        Object[] args = new Object[5];
        args[0] = term80144;
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


