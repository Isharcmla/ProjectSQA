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

public class FieldProperty_init_79566906132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95200;
     Object term95562;
     Object term95704;

    public FieldProperty_init_79566906132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term94702 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term94794 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term94908 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term95066 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        setField(term94702, term94702.getClass(), "_metadata", null);
        setIntField(term94702, term94702.getClass(), "_propertyIndex", 0);
        setField(term94702, term94702.getClass(), "_propName", term94794);
        setField(term94702, term94702.getClass(), "_type", term94908);
        setField(term94702, term94702.getClass(), "_wrapperName", null);
        setField(term94702, term94702.getClass(), "_contextAnnotations", term95066);
        setField(term94702, term94702.getClass(), "_viewMatcher", null);
        term95200 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term95348 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term95448 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term95200, term95200.getClass(), "_fullName", null);
        setField(term95200, term95200.getClass(), "_annotationIntrospector", term95348);
        setField(term95200, term95200.getClass(), "_member", null);
        setField(term95200, term95200.getClass(), "_metadata", term95448);
        term95562 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        term95704 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
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
        args[0] = term95200;
        args[1] = term95562;
        args[2] = term95704;
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


