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

public class SetterlessProperty_init_1578804247231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141258;
     Object term141506;
     Object term141622;

    public SetterlessProperty_init_1578804247231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term140776 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        Object term140876 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term140968 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term141124 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations"));
        setField(term140776, term140776.getClass(), "_metadata", term140876);
        setIntField(term140776, term140776.getClass(), "_propertyIndex", 0);
        setField(term140776, term140776.getClass(), "_propName", term140968);
        setField(term140776, term140776.getClass(), "_type", null);
        setField(term140776, term140776.getClass(), "_wrapperName", null);
        setField(term140776, term140776.getClass(), "_contextAnnotations", term141124);
        setField(term140776, term140776.getClass(), "_viewMatcher", null);
        term141258 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term141358 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term141258, term141258.getClass(), "_fullName", null);
        setField(term141258, term141258.getClass(), "_annotationIntrospector", null);
        setField(term141258, term141258.getClass(), "_metadata", term141358);
        term141506 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        term141622 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
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
        args[0] = term141258;
        args[1] = null;
        args[2] = term141506;
        args[3] = term141622;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


