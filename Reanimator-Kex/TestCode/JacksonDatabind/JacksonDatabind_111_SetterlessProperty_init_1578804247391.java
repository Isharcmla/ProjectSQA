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

public class SetterlessProperty_init_1578804247391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295910;
     Object term296272;
     Object term296420;
     Object term296576;

    public SetterlessProperty_init_1578804247391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term295240 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term295340 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term295432 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term295524 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term295682 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
        Object term295782 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term295240, term295240.getClass(), "_metadata", term295340);
        setIntField(term295240, term295240.getClass(), "_propertyIndex", 0);
        setField(term295240, term295240.getClass(), "_propName", term295432);
        setField(term295240, term295240.getClass(), "_type", term295524);
        setField(term295240, term295240.getClass(), "_wrapperName", term295432);
        setField(term295240, term295240.getClass(), "_contextAnnotations", term295682);
        setField(term295240, term295240.getClass(), "_viewMatcher", term295782);
        term295910 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term296052 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term296152 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term295910, term295910.getClass(), "_name", null);
        setBooleanField(term295910, term295910.getClass(), "_forSerialization", true);
        setField(term295910, term295910.getClass(), "_getters", null);
        setField(term296052, term296052.getClass(), "value", null);
        setField(term296052, term296052.getClass(), "next", null);
        setField(term295910, term295910.getClass(), "_fields", term296052);
        setField(term295910, term295910.getClass(), "_metadata", term296152);
        term296272 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term296420 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term296576 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
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
        args[0] = term295910;
        args[1] = term296272;
        args[2] = term296420;
        args[3] = term296576;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


