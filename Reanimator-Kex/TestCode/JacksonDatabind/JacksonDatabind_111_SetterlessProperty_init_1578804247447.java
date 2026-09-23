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

public class SetterlessProperty_init_1578804247447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373883;
     Object term374221;
     Object term374363;
     Object term374882;

    public SetterlessProperty_init_1578804247447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term374426 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term374476 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term374522 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term374570 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term374616 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term374674 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term374724 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term374426, term374426.getClass(), "_metadata", term374476);
        setIntField(term374426, term374426.getClass(), "_propertyIndex", 0);
        setField(term374426, term374426.getClass(), "_propName", term374522);
        setField(term374426, term374426.getClass(), "_type", term374570);
        setField(term374426, term374426.getClass(), "_wrapperName", term374616);
        setField(term374426, term374426.getClass(), "_contextAnnotations", term374674);
        setField(term374426, term374426.getClass(), "_viewMatcher", term374724);
        term373883 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term374025 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term374125 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term373883, term373883.getClass(), "_name", null);
        setBooleanField(term373883, term373883.getClass(), "_forSerialization", true);
        setField(term373883, term373883.getClass(), "_getters", null);
        setField(term374025, term374025.getClass(), "value", null);
        setField(term374025, term374025.getClass(), "next", null);
        setField(term373883, term373883.getClass(), "_fields", term374025);
        setField(term373883, term373883.getClass(), "_metadata", term374125);
        term374221 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term374363 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(term374363, term374363.getClass(), "_property", term374426);
        term374882 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
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
        args[0] = term373883;
        args[1] = term374221;
        args[2] = term374363;
        args[3] = term374882;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


