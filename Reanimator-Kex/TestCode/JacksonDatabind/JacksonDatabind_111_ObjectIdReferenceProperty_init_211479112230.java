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

public class ObjectIdReferenceProperty_init_211479112230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4070;
     Object term4292;
     Object term4294;

    public ObjectIdReferenceProperty_init_211479112230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3930 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        term4070 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        term4292 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        Object term4293 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(term4293, term4293.getClass(), "_forward", null);
        setField(term4293, term4293.getClass(), "_propName", null);
        setField(term4293, term4293.getClass(), "_type", null);
        setField(term4293, term4293.getClass(), "_wrapperName", null);
        setField(term4293, term4293.getClass(), "_contextAnnotations", null);
        setField(term4293, term4293.getClass(), "_valueDeserializer", null);
        setField(term4293, term4293.getClass(), "_valueTypeDeserializer", null);
        setField(term4293, term4293.getClass(), "_nullProvider", null);
        setField(term4293, term4293.getClass(), "_managedReferenceName", null);
        setField(term4293, term4293.getClass(), "_objectIdInfo", null);
        setField(term4293, term4293.getClass(), "_viewMatcher", null);
        setIntField(term4293, term4293.getClass(), "_propertyIndex", 0);
        setField(term4293, term4293.getClass(), "_metadata", null);
        setField(term4293, term4293.getClass(), "_propertyFormat", null);
        setField(term4293, term4293.getClass(), "_aliases", null);
        setField(term4292, term4292.getClass(), "_forward", term4293);
        setField(term4292, term4292.getClass(), "_propName", null);
        setField(term4292, term4292.getClass(), "_type", null);
        setField(term4292, term4292.getClass(), "_wrapperName", null);
        setField(term4292, term4292.getClass(), "_contextAnnotations", null);
        setField(term4292, term4292.getClass(), "_valueDeserializer", null);
        setField(term4292, term4292.getClass(), "_valueTypeDeserializer", null);
        setField(term4292, term4292.getClass(), "_nullProvider", null);
        setField(term4292, term4292.getClass(), "_managedReferenceName", null);
        setField(term4292, term4292.getClass(), "_objectIdInfo", null);
        setField(term4292, term4292.getClass(), "_viewMatcher", null);
        setIntField(term4292, term4292.getClass(), "_propertyIndex", 0);
        setField(term4292, term4292.getClass(), "_metadata", null);
        setField(term4292, term4292.getClass(), "_propertyFormat", null);
        setField(term4292, term4292.getClass(), "_aliases", null);
        term4294 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(term4294, term4294.getClass(), "_forward", null);
        setField(term4294, term4294.getClass(), "_propName", null);
        setField(term4294, term4294.getClass(), "_type", null);
        setField(term4294, term4294.getClass(), "_wrapperName", null);
        setField(term4294, term4294.getClass(), "_contextAnnotations", null);
        setField(term4294, term4294.getClass(), "_valueDeserializer", null);
        setField(term4294, term4294.getClass(), "_valueTypeDeserializer", null);
        setField(term4294, term4294.getClass(), "_nullProvider", null);
        setField(term4294, term4294.getClass(), "_managedReferenceName", null);
        setField(term4294, term4294.getClass(), "_objectIdInfo", null);
        setField(term4294, term4294.getClass(), "_viewMatcher", null);
        setIntField(term4294, term4294.getClass(), "_propertyIndex", 0);
        setField(term4294, term4294.getClass(), "_metadata", null);
        setField(term4294, term4294.getClass(), "_propertyFormat", null);
        setField(term4294, term4294.getClass(), "_aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo");
        Object[] args = new Object[2];
        args[0] = term4070;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4292));
        assertTrue(recursiveEquals(term4070, term4294));
    }

};


