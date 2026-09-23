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

public class SetterlessProperty_init_1578804247331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224228;

    public SetterlessProperty_init_1578804247331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term224100 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        term224228 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term224320 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term224462 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term224604 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term224746 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term224888 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term225030 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term224228, term224228.getClass(), "_name", term224320);
        setBooleanField(term224228, term224228.getClass(), "_forSerialization", false);
        setField(term224228, term224228.getClass(), "_ctorParameters", null);
        setField(term224462, term224462.getClass(), "next", null);
        setField(term224462, term224462.getClass(), "value", null);
        setField(term224228, term224228.getClass(), "_setters", term224462);
        setField(term224228, term224228.getClass(), "_fields", null);
        setField(term224604, term224604.getClass(), "next", null);
        setField(term224604, term224604.getClass(), "value", null);
        setField(term224228, term224228.getClass(), "_getters", term224604);
        setField(term224228, term224228.getClass(), "_metadata", null);
        setField(term224888, term224888.getClass(), "_primary", term225030);
        setField(term224746, term224746.getClass(), "_primary", term224888);
        setField(term224228, term224228.getClass(), "_annotationIntrospector", term224746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term224228;
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


