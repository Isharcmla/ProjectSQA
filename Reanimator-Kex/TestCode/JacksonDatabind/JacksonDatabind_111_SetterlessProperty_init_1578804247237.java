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

public class SetterlessProperty_init_1578804247237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146226;
     Object term146616;
     Object term146774;

    public SetterlessProperty_init_1578804247237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145554 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term145654 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term145746 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term145842 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term145998 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term146098 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term145554, term145554.getClass(), "_metadata", term145654);
        setIntField(term145554, term145554.getClass(), "_propertyIndex", 0);
        setField(term145554, term145554.getClass(), "_propName", term145746);
        setField(term145554, term145554.getClass(), "_type", term145842);
        setField(term145554, term145554.getClass(), "_wrapperName", term145746);
        setField(term145554, term145554.getClass(), "_contextAnnotations", term145998);
        setField(term145554, term145554.getClass(), "_viewMatcher", term146098);
        term146226 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term146368 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term146468 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term146226, term146226.getClass(), "_name", null);
        setBooleanField(term146226, term146226.getClass(), "_forSerialization", false);
        setField(term146226, term146226.getClass(), "_ctorParameters", null);
        setField(term146368, term146368.getClass(), "next", null);
        setField(term146368, term146368.getClass(), "value", null);
        setField(term146226, term146226.getClass(), "_setters", term146368);
        setField(term146226, term146226.getClass(), "_fields", null);
        setField(term146226, term146226.getClass(), "_getters", null);
        setField(term146226, term146226.getClass(), "_metadata", term146468);
        term146616 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term146774 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
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
        args[0] = term146226;
        args[1] = null;
        args[2] = term146616;
        args[3] = term146774;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


