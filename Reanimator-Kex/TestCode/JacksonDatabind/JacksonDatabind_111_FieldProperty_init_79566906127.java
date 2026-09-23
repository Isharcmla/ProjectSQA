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

public class FieldProperty_init_79566906127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91399;
     Object term91789;

    public FieldProperty_init_79566906127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term91847 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term91893 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term91943 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term91989 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term91847, term91847.getClass(), "_metadata", null);
        setIntField(term91847, term91847.getClass(), "_propertyIndex", 0);
        setField(term91847, term91847.getClass(), "_propName", term91893);
        setField(term91847, term91847.getClass(), "_type", term91943);
        setField(term91847, term91847.getClass(), "_wrapperName", term91989);
        setField(term91847, term91847.getClass(), "_contextAnnotations", null);
        setField(term91847, term91847.getClass(), "_viewMatcher", null);
        term91399 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term91543 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term91643 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term91399, term91399.getClass(), "_fullName", null);
        setField(term91399, term91399.getClass(), "_annotationIntrospector", term91543);
        setField(term91399, term91399.getClass(), "_member", null);
        setField(term91399, term91399.getClass(), "_metadata", term91643);
        term91789 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term91789, term91789.getClass(), "_property", term91847);
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
        args[0] = term91399;
        args[1] = null;
        args[2] = term91789;
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


