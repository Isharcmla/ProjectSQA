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

public class FieldProperty_init_7956690657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18841;
     Object term19229;

    public FieldProperty_init_7956690657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18437 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term18551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term18707 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        setField(term18437, term18437.getClass(), "_metadata", null);
        setIntField(term18437, term18437.getClass(), "_propertyIndex", 0);
        setField(term18437, term18437.getClass(), "_propName", null);
        setField(term18437, term18437.getClass(), "_type", term18551);
        setField(term18437, term18437.getClass(), "_wrapperName", null);
        setField(term18437, term18437.getClass(), "_contextAnnotations", term18707);
        setField(term18437, term18437.getClass(), "_viewMatcher", null);
        term18841 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term18983 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term19083 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term18841, term18841.getClass(), "_fullName", null);
        setField(term18841, term18841.getClass(), "_annotationIntrospector", term18983);
        setField(term18841, term18841.getClass(), "_member", null);
        setField(term18841, term18841.getClass(), "_metadata", term19083);
        term19229 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
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
        args[0] = term18841;
        args[1] = null;
        args[2] = term19229;
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


