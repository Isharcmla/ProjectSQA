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

public class SetterlessProperty_init_1578804247385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285539;
     Object term285833;
     Object term286304;

    public SetterlessProperty_init_1578804247385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term285896 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term285946 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term285992 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term286052 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term286098 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term286148 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term285896, term285896.getClass(), "_metadata", term285946);
        setIntField(term285896, term285896.getClass(), "_propertyIndex", 0);
        setField(term285896, term285896.getClass(), "_propName", term285992);
        setField(term285896, term285896.getClass(), "_type", term286052);
        setField(term285896, term285896.getClass(), "_wrapperName", term286098);
        setField(term285896, term285896.getClass(), "_contextAnnotations", null);
        setField(term285896, term285896.getClass(), "_viewMatcher", term286148);
        term285539 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term285687 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term285539, term285539.getClass(), "_name", null);
        setBooleanField(term285539, term285539.getClass(), "_forSerialization", true);
        setField(term285539, term285539.getClass(), "_getters", null);
        setField(term285539, term285539.getClass(), "_fields", null);
        setField(term285539, term285539.getClass(), "_metadata", null);
        setField(term285539, term285539.getClass(), "_annotationIntrospector", term285687);
        term285833 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term285833, term285833.getClass(), "_property", term285896);
        term286304 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneAnnotation"));
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
        args[0] = term285539;
        args[1] = null;
        args[2] = term285833;
        args[3] = term286304;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


