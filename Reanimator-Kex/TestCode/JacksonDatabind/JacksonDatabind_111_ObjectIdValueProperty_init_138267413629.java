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

public class ObjectIdValueProperty_init_138267413629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4505;
     Object term4526;
     Object term4527;

    public ObjectIdValueProperty_init_138267413629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4505 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        term4526 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term4526, term4526.getClass(), "_objectIdReader", null);
        setField(term4526, term4526.getClass(), "_propName", null);
        setField(term4526, term4526.getClass(), "_type", null);
        setField(term4526, term4526.getClass(), "_wrapperName", null);
        setField(term4526, term4526.getClass(), "_contextAnnotations", null);
        setField(term4526, term4526.getClass(), "_valueDeserializer", null);
        setField(term4526, term4526.getClass(), "_valueTypeDeserializer", null);
        setField(term4526, term4526.getClass(), "_nullProvider", null);
        setField(term4526, term4526.getClass(), "_managedReferenceName", null);
        setField(term4526, term4526.getClass(), "_objectIdInfo", null);
        setField(term4526, term4526.getClass(), "_viewMatcher", null);
        setIntField(term4526, term4526.getClass(), "_propertyIndex", 0);
        setField(term4526, term4526.getClass(), "_metadata", null);
        setField(term4526, term4526.getClass(), "_propertyFormat", null);
        setField(term4526, term4526.getClass(), "_aliases", null);
        term4527 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term4527, term4527.getClass(), "_objectIdReader", null);
        setField(term4527, term4527.getClass(), "_propName", null);
        setField(term4527, term4527.getClass(), "_type", null);
        setField(term4527, term4527.getClass(), "_wrapperName", null);
        setField(term4527, term4527.getClass(), "_contextAnnotations", null);
        setField(term4527, term4527.getClass(), "_valueDeserializer", null);
        setField(term4527, term4527.getClass(), "_valueTypeDeserializer", null);
        setField(term4527, term4527.getClass(), "_nullProvider", null);
        setField(term4527, term4527.getClass(), "_managedReferenceName", null);
        setField(term4527, term4527.getClass(), "_objectIdInfo", null);
        setField(term4527, term4527.getClass(), "_viewMatcher", null);
        setIntField(term4527, term4527.getClass(), "_propertyIndex", 0);
        setField(term4527, term4527.getClass(), "_metadata", null);
        setField(term4527, term4527.getClass(), "_propertyFormat", null);
        setField(term4527, term4527.getClass(), "_aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term4505;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4526));
        assertTrue(recursiveEquals(term4505, term4527));
    }

};


