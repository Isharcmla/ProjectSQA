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

public class SetterlessProperty_init_1578804247276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179153;

    public SetterlessProperty_init_1578804247276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term179025 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        term179153 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term179295 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term179437 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term179537 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term179153, term179153.getClass(), "_name", null);
        setBooleanField(term179153, term179153.getClass(), "_forSerialization", false);
        setField(term179153, term179153.getClass(), "_ctorParameters", null);
        setField(term179153, term179153.getClass(), "_setters", null);
        setField(term179295, term179295.getClass(), "value", null);
        setField(term179295, term179295.getClass(), "next", null);
        setField(term179153, term179153.getClass(), "_fields", term179295);
        setField(term179437, term179437.getClass(), "next", null);
        setField(term179437, term179437.getClass(), "value", null);
        setField(term179153, term179153.getClass(), "_getters", term179437);
        setField(term179153, term179153.getClass(), "_metadata", term179537);
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
        args[0] = term179153;
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


