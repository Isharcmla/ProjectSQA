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

public class ObjectIdReferenceProperty_init_196249136832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4287;
     Object term4516;
     Object term4517;

    public ObjectIdReferenceProperty_init_196249136832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4287 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        term4516 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(term4516, term4516.getClass(), "_forward", null);
        setField(term4516, term4516.getClass(), "_propName", null);
        setField(term4516, term4516.getClass(), "_type", null);
        setField(term4516, term4516.getClass(), "_wrapperName", null);
        setField(term4516, term4516.getClass(), "_contextAnnotations", null);
        setField(term4516, term4516.getClass(), "_valueDeserializer", null);
        setField(term4516, term4516.getClass(), "_valueTypeDeserializer", null);
        setField(term4516, term4516.getClass(), "_nullProvider", null);
        setField(term4516, term4516.getClass(), "_managedReferenceName", null);
        setField(term4516, term4516.getClass(), "_objectIdInfo", null);
        setField(term4516, term4516.getClass(), "_viewMatcher", null);
        setIntField(term4516, term4516.getClass(), "_propertyIndex", 0);
        setField(term4516, term4516.getClass(), "_metadata", null);
        setField(term4516, term4516.getClass(), "_propertyFormat", null);
        setField(term4516, term4516.getClass(), "_aliases", null);
        term4517 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(term4517, term4517.getClass(), "_forward", null);
        setField(term4517, term4517.getClass(), "_propName", null);
        setField(term4517, term4517.getClass(), "_type", null);
        setField(term4517, term4517.getClass(), "_wrapperName", null);
        setField(term4517, term4517.getClass(), "_contextAnnotations", null);
        setField(term4517, term4517.getClass(), "_valueDeserializer", null);
        setField(term4517, term4517.getClass(), "_valueTypeDeserializer", null);
        setField(term4517, term4517.getClass(), "_nullProvider", null);
        setField(term4517, term4517.getClass(), "_managedReferenceName", null);
        setField(term4517, term4517.getClass(), "_objectIdInfo", null);
        setField(term4517, term4517.getClass(), "_viewMatcher", null);
        setIntField(term4517, term4517.getClass(), "_propertyIndex", 0);
        setField(term4517, term4517.getClass(), "_metadata", null);
        setField(term4517, term4517.getClass(), "_propertyFormat", null);
        setField(term4517, term4517.getClass(), "_aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term4287;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4516));
        assertTrue(recursiveEquals(term4287, term4517));
    }

};


