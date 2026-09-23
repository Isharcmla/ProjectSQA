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

public class SetterlessProperty_init_1578804247439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366458;
     Object term366990;
     Object term367148;

    public SetterlessProperty_init_1578804247439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term365676 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term365776 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term365868 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term365982 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term366074 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term366230 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        Object term366330 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.ViewMatcher"));
        setField(term365676, term365676.getClass(), "_metadata", term365776);
        setIntField(term365676, term365676.getClass(), "_propertyIndex", 0);
        setField(term365676, term365676.getClass(), "_propName", term365868);
        setField(term365676, term365676.getClass(), "_type", term365982);
        setField(term365676, term365676.getClass(), "_wrapperName", term366074);
        setField(term365676, term365676.getClass(), "_contextAnnotations", term366230);
        setField(term365676, term365676.getClass(), "_viewMatcher", term366330);
        term366458 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term366600 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term366742 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term366842 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term366458, term366458.getClass(), "_name", null);
        setBooleanField(term366458, term366458.getClass(), "_forSerialization", false);
        setField(term366458, term366458.getClass(), "_ctorParameters", null);
        setField(term366600, term366600.getClass(), "next", null);
        setField(term366600, term366600.getClass(), "value", null);
        setField(term366458, term366458.getClass(), "_setters", term366600);
        setField(term366458, term366458.getClass(), "_fields", null);
        setField(term366742, term366742.getClass(), "next", null);
        setField(term366742, term366742.getClass(), "value", null);
        setField(term366458, term366458.getClass(), "_getters", term366742);
        setField(term366458, term366458.getClass(), "_metadata", term366842);
        term366990 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        term367148 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$TwoAnnotations"));
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
        args[0] = term366458;
        args[1] = null;
        args[2] = term366990;
        args[3] = term367148;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


