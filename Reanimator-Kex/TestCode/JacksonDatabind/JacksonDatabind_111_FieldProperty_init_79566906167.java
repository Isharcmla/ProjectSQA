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

public class FieldProperty_init_79566906167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131298;
     Object term131718;

    public FieldProperty_init_79566906167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term130950 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term131050 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term131164 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term130950, term130950.getClass(), "_metadata", term131050);
        setIntField(term130950, term130950.getClass(), "_propertyIndex", 0);
        setField(term130950, term130950.getClass(), "_propName", null);
        setField(term130950, term130950.getClass(), "_type", term131164);
        setField(term130950, term130950.getClass(), "_wrapperName", null);
        setField(term130950, term130950.getClass(), "_contextAnnotations", null);
        setField(term130950, term130950.getClass(), "_viewMatcher", null);
        term131298 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term131390 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term131576 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term131390, term131390.getClass(), "_simpleName", "");
        setField(term131298, term131298.getClass(), "_fullName", term131390);
        setField(term131298, term131298.getClass(), "_annotationIntrospector", term131576);
        setField(term131298, term131298.getClass(), "_member", null);
        setField(term131298, term131298.getClass(), "_metadata", null);
        term131718 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
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
        args[0] = term131298;
        args[1] = null;
        args[2] = term131718;
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


