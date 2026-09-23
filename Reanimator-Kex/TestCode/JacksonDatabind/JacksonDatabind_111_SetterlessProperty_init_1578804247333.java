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

public class SetterlessProperty_init_1578804247333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225861;

    public SetterlessProperty_init_1578804247333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term225633 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term225733 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term225633, term225633.getClass(), "_metadata", term225733);
        setIntField(term225633, term225633.getClass(), "_propertyIndex", 0);
        term225861 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term225953 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term226095 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term226237 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term226337 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term225861, term225861.getClass(), "_name", term225953);
        setBooleanField(term225861, term225861.getClass(), "_forSerialization", false);
        setField(term225861, term225861.getClass(), "_ctorParameters", null);
        setField(term226095, term226095.getClass(), "next", null);
        setField(term226095, term226095.getClass(), "value", null);
        setField(term225861, term225861.getClass(), "_setters", term226095);
        setField(term226237, term226237.getClass(), "value", null);
        setField(term226237, term226237.getClass(), "next", null);
        setField(term225861, term225861.getClass(), "_fields", term226237);
        setField(term225861, term225861.getClass(), "_getters", null);
        setField(term225861, term225861.getClass(), "_metadata", term226337);
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
        args[0] = term225861;
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


