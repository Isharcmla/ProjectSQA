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

public class SetterlessProperty_init_1578804247339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234681;

    public SetterlessProperty_init_1578804247339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term234453 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term234553 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term234453, term234453.getClass(), "_metadata", term234553);
        setIntField(term234453, term234453.getClass(), "_propertyIndex", 0);
        term234681 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term234773 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term234953 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term235095 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term235195 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term234773, term234773.getClass(), "_simpleName", "");
        setField(term234681, term234681.getClass(), "_name", term234773);
        setBooleanField(term234681, term234681.getClass(), "_forSerialization", false);
        setField(term234681, term234681.getClass(), "_ctorParameters", null);
        setField(term234953, term234953.getClass(), "next", null);
        setField(term234953, term234953.getClass(), "value", null);
        setField(term234681, term234681.getClass(), "_setters", term234953);
        setField(term235095, term235095.getClass(), "value", null);
        setField(term235095, term235095.getClass(), "next", null);
        setField(term234681, term234681.getClass(), "_fields", term235095);
        setField(term234681, term234681.getClass(), "_getters", null);
        setField(term234681, term234681.getClass(), "_metadata", term235195);
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
        args[0] = term234681;
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


