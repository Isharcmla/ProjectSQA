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

public class SetterlessProperty_init_1578804247441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369214;
     Object term369314;
     Object term369462;
     Object term369578;

    public SetterlessProperty_init_1578804247441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term368530 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term368630 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term368722 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term368828 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term368986 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term369086 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term368530, term368530.getClass(), "_metadata", term368630);
        setIntField(term368530, term368530.getClass(), "_propertyIndex", 0);
        setField(term368530, term368530.getClass(), "_propName", term368722);
        setField(term368530, term368530.getClass(), "_type", term368828);
        setField(term368530, term368530.getClass(), "_wrapperName", term368722);
        setField(term368530, term368530.getClass(), "_contextAnnotations", term368986);
        setField(term368530, term368530.getClass(), "_viewMatcher", term369086);
        term369214 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term369214, term369214.getClass(), "_name", null);
        setBooleanField(term369214, term369214.getClass(), "_forSerialization", true);
        setField(term369214, term369214.getClass(), "_getters", null);
        setField(term369214, term369214.getClass(), "_fields", null);
        setField(term369214, term369214.getClass(), "_metadata", null);
        setField(term369214, term369214.getClass(), "_annotationIntrospector", null);
        term369314 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term369462 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        term369578 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term369214;
        args[1] = term369314;
        args[2] = term369462;
        args[3] = term369578;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


