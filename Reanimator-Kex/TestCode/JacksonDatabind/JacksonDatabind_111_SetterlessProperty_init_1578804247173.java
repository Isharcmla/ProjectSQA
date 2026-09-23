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

public class SetterlessProperty_init_1578804247173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94485;
     Object term94631;
     Object term94777;

    public SetterlessProperty_init_1578804247173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term94153 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term94535 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term94357 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term94153, term94153.getClass(), "_metadata", term94535);
        setIntField(term94153, term94153.getClass(), "_propertyIndex", 0);
        setField(term94153, term94153.getClass(), "_propName", null);
        setField(term94153, term94153.getClass(), "_type", term94357);
        setField(term94153, term94153.getClass(), "_wrapperName", null);
        setField(term94153, term94153.getClass(), "_contextAnnotations", null);
        setField(term94153, term94153.getClass(), "_viewMatcher", null);
        term94485 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term94485, term94485.getClass(), "_name", null);
        setBooleanField(term94485, term94485.getClass(), "_forSerialization", false);
        setField(term94485, term94485.getClass(), "_ctorParameters", null);
        setField(term94485, term94485.getClass(), "_setters", null);
        setField(term94485, term94485.getClass(), "_fields", null);
        setField(term94485, term94485.getClass(), "_getters", null);
        setField(term94485, term94485.getClass(), "_metadata", term94535);
        term94631 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term94777 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
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
        args[0] = term94485;
        args[1] = term94631;
        args[2] = term94777;
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


