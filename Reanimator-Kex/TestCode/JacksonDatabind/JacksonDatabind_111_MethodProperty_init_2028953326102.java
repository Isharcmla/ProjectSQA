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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MethodProperty_init_2028953326102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44240;

    public MethodProperty_init_2028953326102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44012 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term44112 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term44012, term44012.getClass(), "_metadata", term44112);
        setIntField(term44012, term44012.getClass(), "_propertyIndex", 0);
        term44240 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term44332 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term44512 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term44612 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term44332, term44332.getClass(), "_simpleName", "");
        setField(term44240, term44240.getClass(), "_name", term44332);
        setBooleanField(term44240, term44240.getClass(), "_forSerialization", false);
        setField(term44240, term44240.getClass(), "_ctorParameters", null);
        setField(term44240, term44240.getClass(), "_setters", null);
        setField(term44240, term44240.getClass(), "_fields", null);
        setField(term44512, term44512.getClass(), "next", null);
        setField(term44512, term44512.getClass(), "value", null);
        setField(term44240, term44240.getClass(), "_getters", term44512);
        setField(term44240, term44240.getClass(), "_metadata", term44612);
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
        args[0] = term44240;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


