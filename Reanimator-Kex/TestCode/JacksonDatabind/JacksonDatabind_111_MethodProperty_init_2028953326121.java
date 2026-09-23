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

public class MethodProperty_init_2028953326121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57733;
     Object term58071;
     Object term58219;
     Object term58375;

    public MethodProperty_init_2028953326121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57135 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term57235 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term57349 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term57505 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
        Object term57605 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term57135, term57135.getClass(), "_metadata", term57235);
        setIntField(term57135, term57135.getClass(), "_propertyIndex", 0);
        setField(term57135, term57135.getClass(), "_propName", null);
        setField(term57135, term57135.getClass(), "_type", term57349);
        setField(term57135, term57135.getClass(), "_wrapperName", null);
        setField(term57135, term57135.getClass(), "_contextAnnotations", term57505);
        setField(term57135, term57135.getClass(), "_viewMatcher", term57605);
        term57733 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term57875 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term57975 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term57733, term57733.getClass(), "_name", null);
        setBooleanField(term57733, term57733.getClass(), "_forSerialization", false);
        setField(term57733, term57733.getClass(), "_ctorParameters", null);
        setField(term57875, term57875.getClass(), "next", null);
        setField(term57875, term57875.getClass(), "value", null);
        setField(term57733, term57733.getClass(), "_setters", term57875);
        setField(term57733, term57733.getClass(), "_fields", null);
        setField(term57733, term57733.getClass(), "_getters", null);
        setField(term57733, term57733.getClass(), "_metadata", term57975);
        term58071 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term58219 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term58375 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term57733;
        args[1] = term58071;
        args[2] = term58219;
        args[3] = term58375;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


