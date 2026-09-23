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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;

public class FieldProperty_init_48147476036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5673;
     Object term5861;
     Object term5862;

    public FieldProperty_init_48147476036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5673 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        term5861 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        setField(term5861, term5861.getClass(), "_annotated", null);
        setField(term5861, term5861.getClass(), "_field", null);
        setBooleanField(term5861, term5861.getClass(), "_skipNulls", false);
        setField(term5861, term5861.getClass(), "_propName", null);
        setField(term5861, term5861.getClass(), "_type", null);
        setField(term5861, term5861.getClass(), "_wrapperName", null);
        setField(term5861, term5861.getClass(), "_contextAnnotations", null);
        setField(term5861, term5861.getClass(), "_valueDeserializer", null);
        setField(term5861, term5861.getClass(), "_valueTypeDeserializer", null);
        setField(term5861, term5861.getClass(), "_nullProvider", null);
        setField(term5861, term5861.getClass(), "_managedReferenceName", null);
        setField(term5861, term5861.getClass(), "_objectIdInfo", null);
        setField(term5861, term5861.getClass(), "_viewMatcher", null);
        setIntField(term5861, term5861.getClass(), "_propertyIndex", 0);
        setField(term5861, term5861.getClass(), "_metadata", null);
        setField(term5861, term5861.getClass(), "_propertyFormat", null);
        setField(term5861, term5861.getClass(), "_aliases", null);
        term5862 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        setField(term5862, term5862.getClass(), "_annotated", null);
        setField(term5862, term5862.getClass(), "_field", null);
        setBooleanField(term5862, term5862.getClass(), "_skipNulls", false);
        setField(term5862, term5862.getClass(), "_propName", null);
        setField(term5862, term5862.getClass(), "_type", null);
        setField(term5862, term5862.getClass(), "_wrapperName", null);
        setField(term5862, term5862.getClass(), "_contextAnnotations", null);
        setField(term5862, term5862.getClass(), "_valueDeserializer", null);
        setField(term5862, term5862.getClass(), "_valueTypeDeserializer", null);
        setField(term5862, term5862.getClass(), "_nullProvider", null);
        setField(term5862, term5862.getClass(), "_managedReferenceName", null);
        setField(term5862, term5862.getClass(), "_objectIdInfo", null);
        setField(term5862, term5862.getClass(), "_viewMatcher", null);
        setIntField(term5862, term5862.getClass(), "_propertyIndex", 0);
        setField(term5862, term5862.getClass(), "_metadata", null);
        setField(term5862, term5862.getClass(), "_propertyFormat", null);
        setField(term5862, term5862.getClass(), "_aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.FieldProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term5673;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5861));
        assertTrue(recursiveEquals(term5673, term5862));
    }

};


