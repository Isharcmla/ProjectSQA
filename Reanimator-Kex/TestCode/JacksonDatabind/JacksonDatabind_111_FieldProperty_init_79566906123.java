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

public class FieldProperty_init_79566906123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83150;
     Object term83494;
     Object term83640;
     Object term83756;

    public FieldProperty_init_79566906123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82476 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        Object term82576 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term82668 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term82760 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term82916 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term83016 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term82476, term82476.getClass(), "_metadata", term82576);
        setIntField(term82476, term82476.getClass(), "_propertyIndex", 0);
        setField(term82476, term82476.getClass(), "_propName", term82668);
        setField(term82476, term82476.getClass(), "_type", null);
        setField(term82476, term82476.getClass(), "_wrapperName", term82760);
        setField(term82476, term82476.getClass(), "_contextAnnotations", term82916);
        setField(term82476, term82476.getClass(), "_viewMatcher", term83016);
        term83150 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term83242 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term83380 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term83242, term83242.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term83150, term83150.getClass(), "_fullName", term83242);
        setField(term83150, term83150.getClass(), "_annotationIntrospector", null);
        setField(term83150, term83150.getClass(), "_metadata", term83380);
        term83494 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term83640 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        term83756 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term83150;
        args[1] = term83494;
        args[2] = term83640;
        args[3] = term83756;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


