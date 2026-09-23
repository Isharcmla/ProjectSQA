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

public class ObjectIdValueProperty_init_189141968761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72158;
     Object term76759;
     Object term76765;

    public ObjectIdValueProperty_init_189141968761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72040 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term72040, term72040.getClass(), "_metadata", null);
        setIntField(term72040, term72040.getClass(), "_propertyIndex", 0);
        term72158 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term72250 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term72250, term72250.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term72158, term72158.getClass(), "propertyName", term72250);
        setField(term72158, term72158.getClass(), "_idType", null);
        setField(term72158, term72158.getClass(), "_deserializer", null);
        term76759 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term76760 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term76761 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term76764 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term76760, term76760.getClass(), "_idType", null);
        setField(term76761, term76761.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term76761, term76761.getClass(), "_namespace", null);
        setField(term76761, term76761.getClass(), "_encodedSimple", null);
        setField(term76760, term76760.getClass(), "propertyName", term76761);
        setField(term76760, term76760.getClass(), "generator", null);
        setField(term76760, term76760.getClass(), "resolver", null);
        setField(term76760, term76760.getClass(), "_deserializer", null);
        setField(term76760, term76760.getClass(), "idProperty", null);
        setField(term76759, term76759.getClass(), "_objectIdReader", term76760);
        setField(term76759, term76759.getClass(), "_propName", term76761);
        setField(term76759, term76759.getClass(), "_type", null);
        setField(term76759, term76759.getClass(), "_wrapperName", null);
        setField(term76759, term76759.getClass(), "_contextAnnotations", null);
        setField(term76759, term76759.getClass(), "_valueDeserializer", null);
        setField(term76759, term76759.getClass(), "_valueTypeDeserializer", null);
        setField(term76759, term76759.getClass(), "_managedReferenceName", null);
        setField(term76759, term76759.getClass(), "_objectIdInfo", null);
        setField(term76759, term76759.getClass(), "_viewMatcher", null);
        setIntField(term76759, term76759.getClass(), "_propertyIndex", -1);
        setField(term76764, term76764.getClass(), "_required", null);
        setField(term76764, term76764.getClass(), "_description", null);
        setField(term76764, term76764.getClass(), "_index", null);
        setField(term76764, term76764.getClass(), "_defaultValue", null);
        setField(term76759, term76759.getClass(), "_metadata", term76764);
        setField(term76759, term76759.getClass(), "_format", null);
        term76765 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term76766 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term76765, term76765.getClass(), "_idType", null);
        setField(term76766, term76766.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term76766, term76766.getClass(), "_namespace", null);
        setField(term76766, term76766.getClass(), "_encodedSimple", null);
        setField(term76765, term76765.getClass(), "propertyName", term76766);
        setField(term76765, term76765.getClass(), "generator", null);
        setField(term76765, term76765.getClass(), "resolver", null);
        setField(term76765, term76765.getClass(), "_deserializer", null);
        setField(term76765, term76765.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term72158;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term76759));
        assertTrue(recursiveEquals(term72158, term76765));
    }

};


