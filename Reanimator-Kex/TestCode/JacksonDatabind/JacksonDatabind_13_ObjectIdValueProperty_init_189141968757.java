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

public class ObjectIdValueProperty_init_189141968757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30266;
     Object term34497;
     Object term34503;

    public ObjectIdValueProperty_init_189141968757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30148 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setIntField(term30148, term30148.getClass(), "_propertyIndex", 0);
        term30266 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term30358 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term30492 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term30358, term30358.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term30266, term30266.getClass(), "propertyName", term30358);
        setField(term30266, term30266.getClass(), "_idType", term30492);
        setField(term30266, term30266.getClass(), "_deserializer", null);
        term34497 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term34498 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term34499 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term34500 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term34499, term34499.getClass(), "_componentType", null);
        setField(term34499, term34499.getClass(), "_emptyArray", null);
        setField(term34499, term34499.getClass(), "_canonicalName", null);
        setField(term34499, term34499.getClass(), "_class", null);
        setIntField(term34499, term34499.getClass(), "_hash", 0);
        setField(term34499, term34499.getClass(), "_valueHandler", null);
        setField(term34499, term34499.getClass(), "_typeHandler", null);
        setBooleanField(term34499, term34499.getClass(), "_asStatic", false);
        setField(term34498, term34498.getClass(), "_idType", term34499);
        setField(term34500, term34500.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term34500, term34500.getClass(), "_namespace", null);
        setField(term34500, term34500.getClass(), "_encodedSimple", null);
        setField(term34498, term34498.getClass(), "propertyName", term34500);
        setField(term34498, term34498.getClass(), "generator", null);
        setField(term34498, term34498.getClass(), "resolver", null);
        setField(term34498, term34498.getClass(), "_deserializer", null);
        setField(term34498, term34498.getClass(), "idProperty", null);
        setField(term34497, term34497.getClass(), "_objectIdReader", term34498);
        setField(term34497, term34497.getClass(), "_propName", term34500);
        setField(term34497, term34497.getClass(), "_type", term34499);
        setField(term34497, term34497.getClass(), "_wrapperName", null);
        setField(term34497, term34497.getClass(), "_contextAnnotations", null);
        setField(term34497, term34497.getClass(), "_valueDeserializer", null);
        setField(term34497, term34497.getClass(), "_valueTypeDeserializer", null);
        setField(term34497, term34497.getClass(), "_nullProvider", null);
        setField(term34497, term34497.getClass(), "_metadata", null);
        setField(term34497, term34497.getClass(), "_managedReferenceName", null);
        setField(term34497, term34497.getClass(), "_objectIdInfo", null);
        setField(term34497, term34497.getClass(), "_viewMatcher", null);
        setIntField(term34497, term34497.getClass(), "_propertyIndex", -1);
        term34503 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term34504 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term34505 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term34504, term34504.getClass(), "_componentType", null);
        setField(term34504, term34504.getClass(), "_emptyArray", null);
        setField(term34504, term34504.getClass(), "_canonicalName", null);
        setField(term34504, term34504.getClass(), "_class", null);
        setIntField(term34504, term34504.getClass(), "_hash", 0);
        setField(term34504, term34504.getClass(), "_valueHandler", null);
        setField(term34504, term34504.getClass(), "_typeHandler", null);
        setBooleanField(term34504, term34504.getClass(), "_asStatic", false);
        setField(term34503, term34503.getClass(), "_idType", term34504);
        setField(term34505, term34505.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term34505, term34505.getClass(), "_namespace", null);
        setField(term34505, term34505.getClass(), "_encodedSimple", null);
        setField(term34503, term34503.getClass(), "propertyName", term34505);
        setField(term34503, term34503.getClass(), "generator", null);
        setField(term34503, term34503.getClass(), "resolver", null);
        setField(term34503, term34503.getClass(), "_deserializer", null);
        setField(term34503, term34503.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term30266;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34497));
        assertTrue(recursiveEquals(term30266, term34503));
    }

};


