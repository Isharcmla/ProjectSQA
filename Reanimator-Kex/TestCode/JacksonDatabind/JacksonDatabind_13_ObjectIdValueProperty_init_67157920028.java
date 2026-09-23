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

public class ObjectIdValueProperty_init_67157920028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3988;
     Object term4661;
     Object term4667;

    public ObjectIdValueProperty_init_67157920028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3764 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term3856 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setIntField(term3764, term3764.getClass(), "_propertyIndex", 0);
        setField(term3764, term3764.getClass(), "_propName", term3856);
        term3988 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        term4661 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term4662 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term4661, term4661.getClass(), "_objectIdReader", null);
        setField(term4662, term4662.getClass(), "_simpleName", "");
        setField(term4662, term4662.getClass(), "_namespace", null);
        setField(term4662, term4662.getClass(), "_encodedSimple", null);
        setField(term4661, term4661.getClass(), "_propName", term4662);
        setField(term4661, term4661.getClass(), "_type", null);
        setField(term4661, term4661.getClass(), "_wrapperName", null);
        setField(term4661, term4661.getClass(), "_contextAnnotations", null);
        setField(term4661, term4661.getClass(), "_valueDeserializer", null);
        setField(term4661, term4661.getClass(), "_valueTypeDeserializer", null);
        setField(term4661, term4661.getClass(), "_nullProvider", null);
        setField(term4661, term4661.getClass(), "_metadata", null);
        setField(term4661, term4661.getClass(), "_managedReferenceName", null);
        setField(term4661, term4661.getClass(), "_objectIdInfo", null);
        setField(term4661, term4661.getClass(), "_viewMatcher", null);
        setIntField(term4661, term4661.getClass(), "_propertyIndex", 0);
        term4667 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term4667, term4667.getClass(), "_objectIdReader", null);
        setField(term4667, term4667.getClass(), "_propName", null);
        setField(term4667, term4667.getClass(), "_type", null);
        setField(term4667, term4667.getClass(), "_wrapperName", null);
        setField(term4667, term4667.getClass(), "_contextAnnotations", null);
        setField(term4667, term4667.getClass(), "_valueDeserializer", null);
        setField(term4667, term4667.getClass(), "_valueTypeDeserializer", null);
        setField(term4667, term4667.getClass(), "_nullProvider", null);
        setField(term4667, term4667.getClass(), "_metadata", null);
        setField(term4667, term4667.getClass(), "_managedReferenceName", null);
        setField(term4667, term4667.getClass(), "_objectIdInfo", null);
        setField(term4667, term4667.getClass(), "_viewMatcher", null);
        setIntField(term4667, term4667.getClass(), "_propertyIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3988;
        args[1] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4661));
        assertTrue(recursiveEquals(term3988, ""));
    }

};


