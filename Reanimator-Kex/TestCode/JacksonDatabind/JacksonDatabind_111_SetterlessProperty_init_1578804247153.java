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

public class SetterlessProperty_init_1578804247153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78678;
     Object term78926;

    public SetterlessProperty_init_1578804247153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78989 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term79039 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term79085 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term78989, term78989.getClass(), "_metadata", term79039);
        setIntField(term78989, term78989.getClass(), "_propertyIndex", 0);
        setField(term78989, term78989.getClass(), "_propName", null);
        setField(term78989, term78989.getClass(), "_type", null);
        setField(term78989, term78989.getClass(), "_wrapperName", term79085);
        setField(term78989, term78989.getClass(), "_contextAnnotations", null);
        setField(term78989, term78989.getClass(), "_viewMatcher", null);
        term78678 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term78778 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term78678, term78678.getClass(), "_name", null);
        setBooleanField(term78678, term78678.getClass(), "_forSerialization", false);
        setField(term78678, term78678.getClass(), "_ctorParameters", null);
        setField(term78678, term78678.getClass(), "_setters", null);
        setField(term78678, term78678.getClass(), "_fields", null);
        setField(term78678, term78678.getClass(), "_getters", null);
        setField(term78678, term78678.getClass(), "_metadata", term78778);
        term78926 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(term78926, term78926.getClass(), "_property", term78989);
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
        args[0] = term78678;
        args[1] = null;
        args[2] = term78926;
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


