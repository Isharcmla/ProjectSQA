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
import java.lang.Object;

public class ObjectIdValueProperty_init_67157920035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6100;
     Object term6112;
     Object term6116;

    public ObjectIdValueProperty_init_67157920035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6100 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setIntField(term6100, term6100.getClass(), "_propertyIndex", 0);
        setField(term6100, term6100.getClass(), "_propName", null);
        term6112 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term6113 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term6112, term6112.getClass(), "_objectIdReader", null);
        setField(term6113, term6113.getClass(), "_simpleName", "");
        setField(term6113, term6113.getClass(), "_namespace", null);
        setField(term6113, term6113.getClass(), "_encodedSimple", null);
        setField(term6112, term6112.getClass(), "_propName", term6113);
        setField(term6112, term6112.getClass(), "_type", null);
        setField(term6112, term6112.getClass(), "_wrapperName", null);
        setField(term6112, term6112.getClass(), "_contextAnnotations", null);
        setField(term6112, term6112.getClass(), "_valueDeserializer", null);
        setField(term6112, term6112.getClass(), "_valueTypeDeserializer", null);
        setField(term6112, term6112.getClass(), "_nullProvider", null);
        setField(term6112, term6112.getClass(), "_metadata", null);
        setField(term6112, term6112.getClass(), "_managedReferenceName", null);
        setField(term6112, term6112.getClass(), "_objectIdInfo", null);
        setField(term6112, term6112.getClass(), "_viewMatcher", null);
        setIntField(term6112, term6112.getClass(), "_propertyIndex", 0);
        term6116 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term6116, term6116.getClass(), "_objectIdReader", null);
        setField(term6116, term6116.getClass(), "_propName", null);
        setField(term6116, term6116.getClass(), "_type", null);
        setField(term6116, term6116.getClass(), "_wrapperName", null);
        setField(term6116, term6116.getClass(), "_contextAnnotations", null);
        setField(term6116, term6116.getClass(), "_valueDeserializer", null);
        setField(term6116, term6116.getClass(), "_valueTypeDeserializer", null);
        setField(term6116, term6116.getClass(), "_nullProvider", null);
        setField(term6116, term6116.getClass(), "_metadata", null);
        setField(term6116, term6116.getClass(), "_managedReferenceName", null);
        setField(term6116, term6116.getClass(), "_objectIdInfo", null);
        setField(term6116, term6116.getClass(), "_viewMatcher", null);
        setIntField(term6116, term6116.getClass(), "_propertyIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term6100;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6112));
        assertTrue(recursiveEquals(term6100, null));
    }

};


