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

public class FieldProperty_init_79566906157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118094;
     Object term118370;
     Object term118518;
     Object term118674;

    public FieldProperty_init_79566906157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term117676 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term117776 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term117868 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term118370 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term117676, term117676.getClass(), "_metadata", term117776);
        setIntField(term117676, term117676.getClass(), "_propertyIndex", 0);
        setField(term117676, term117676.getClass(), "_propName", term117868);
        setField(term117676, term117676.getClass(), "_type", term118370);
        setField(term117676, term117676.getClass(), "_wrapperName", null);
        setField(term117676, term117676.getClass(), "_contextAnnotations", null);
        setField(term117676, term117676.getClass(), "_viewMatcher", null);
        term118094 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term118186 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term118324 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term118186, term118186.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term118094, term118094.getClass(), "_fullName", term118186);
        setField(term118094, term118094.getClass(), "_annotationIntrospector", null);
        setField(term118094, term118094.getClass(), "_metadata", term118324);
        term118518 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term118674 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
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
        args[0] = term118094;
        args[1] = term118370;
        args[2] = term118518;
        args[3] = term118674;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


