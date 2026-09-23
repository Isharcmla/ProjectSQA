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

public class SetterlessProperty_init_1578804247379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281418;

    public SetterlessProperty_init_1578804247379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term281190 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term281290 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term281190, term281190.getClass(), "_metadata", term281290);
        setIntField(term281190, term281190.getClass(), "_propertyIndex", 0);
        term281418 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term281510 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term281652 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term281418, term281418.getClass(), "_name", term281510);
        setBooleanField(term281418, term281418.getClass(), "_forSerialization", true);
        setField(term281418, term281418.getClass(), "_getters", null);
        setField(term281652, term281652.getClass(), "value", null);
        setField(term281652, term281652.getClass(), "next", null);
        setField(term281418, term281418.getClass(), "_fields", term281652);
        setField(term281418, term281418.getClass(), "_metadata", null);
        setField(term281418, term281418.getClass(), "_annotationIntrospector", null);
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
        args[0] = term281418;
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


