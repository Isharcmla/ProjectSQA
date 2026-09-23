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

public class MethodProperty_init_202895332691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36548;

    public MethodProperty_init_202895332691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36320 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term36690 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term36320, term36320.getClass(), "_metadata", term36690);
        setIntField(term36320, term36320.getClass(), "_propertyIndex", 0);
        term36548 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term36640 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term36548, term36548.getClass(), "_name", term36640);
        setBooleanField(term36548, term36548.getClass(), "_forSerialization", false);
        setField(term36548, term36548.getClass(), "_ctorParameters", null);
        setField(term36548, term36548.getClass(), "_setters", null);
        setField(term36548, term36548.getClass(), "_fields", null);
        setField(term36548, term36548.getClass(), "_getters", null);
        setField(term36548, term36548.getClass(), "_metadata", term36690);
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
        args[0] = term36548;
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


