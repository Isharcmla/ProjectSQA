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

public class FieldProperty_init_79566906175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135025;
     Object term135505;
     Object term135653;

    public FieldProperty_init_79566906175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term134699 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term134799 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term134891 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term134699, term134699.getClass(), "_metadata", term134799);
        setIntField(term134699, term134699.getClass(), "_propertyIndex", 0);
        setField(term134699, term134699.getClass(), "_propName", null);
        setField(term134699, term134699.getClass(), "_type", null);
        setField(term134699, term134699.getClass(), "_wrapperName", term134891);
        setField(term134699, term134699.getClass(), "_contextAnnotations", null);
        setField(term134699, term134699.getClass(), "_viewMatcher", null);
        term135025 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term135173 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term135307 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        Object term135407 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term135025, term135025.getClass(), "_fullName", null);
        setField(term135025, term135025.getClass(), "_annotationIntrospector", term135173);
        setField(term135025, term135025.getClass(), "_member", term135307);
        setField(term135025, term135025.getClass(), "_metadata", term135407);
        term135505 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term135653 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
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
        args[0] = term135025;
        args[1] = term135505;
        args[2] = term135653;
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


