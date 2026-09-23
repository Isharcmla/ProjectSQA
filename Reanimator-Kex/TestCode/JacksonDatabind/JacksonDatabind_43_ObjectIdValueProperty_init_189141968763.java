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

public class ObjectIdValueProperty_init_189141968763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78556;
     Object term78786;
     Object term83256;
     Object term83262;
     Object term83266;

    public ObjectIdValueProperty_init_189141968763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78438 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term78438, term78438.getClass(), "_metadata", null);
        setIntField(term78438, term78438.getClass(), "_propertyIndex", 0);
        term78556 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term78648 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term78648, term78648.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term78556, term78556.getClass(), "propertyName", term78648);
        setField(term78556, term78556.getClass(), "_idType", null);
        setField(term78556, term78556.getClass(), "_deserializer", null);
        term78786 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term83256 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term83257 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term83258 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term83261 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term83257, term83257.getClass(), "_idType", null);
        setField(term83258, term83258.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term83258, term83258.getClass(), "_namespace", null);
        setField(term83258, term83258.getClass(), "_encodedSimple", null);
        setField(term83257, term83257.getClass(), "propertyName", term83258);
        setField(term83257, term83257.getClass(), "generator", null);
        setField(term83257, term83257.getClass(), "resolver", null);
        setField(term83257, term83257.getClass(), "_deserializer", null);
        setField(term83257, term83257.getClass(), "idProperty", null);
        setField(term83256, term83256.getClass(), "_objectIdReader", term83257);
        setField(term83256, term83256.getClass(), "_propName", term83258);
        setField(term83256, term83256.getClass(), "_type", null);
        setField(term83256, term83256.getClass(), "_wrapperName", null);
        setField(term83256, term83256.getClass(), "_contextAnnotations", null);
        setField(term83256, term83256.getClass(), "_valueDeserializer", null);
        setField(term83256, term83256.getClass(), "_valueTypeDeserializer", null);
        setField(term83256, term83256.getClass(), "_managedReferenceName", null);
        setField(term83256, term83256.getClass(), "_objectIdInfo", null);
        setField(term83256, term83256.getClass(), "_viewMatcher", null);
        setIntField(term83256, term83256.getClass(), "_propertyIndex", -1);
        setField(term83261, term83261.getClass(), "_required", null);
        setField(term83261, term83261.getClass(), "_description", null);
        setField(term83261, term83261.getClass(), "_index", null);
        setField(term83261, term83261.getClass(), "_defaultValue", null);
        setField(term83256, term83256.getClass(), "_metadata", term83261);
        setField(term83256, term83256.getClass(), "_format", null);
        term83262 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term83263 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term83262, term83262.getClass(), "_idType", null);
        setField(term83263, term83263.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term83263, term83263.getClass(), "_namespace", null);
        setField(term83263, term83263.getClass(), "_encodedSimple", null);
        setField(term83262, term83262.getClass(), "propertyName", term83263);
        setField(term83262, term83262.getClass(), "generator", null);
        setField(term83262, term83262.getClass(), "resolver", null);
        setField(term83262, term83262.getClass(), "_deserializer", null);
        setField(term83262, term83262.getClass(), "idProperty", null);
        term83266 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term83266, term83266.getClass(), "_required", null);
        setField(term83266, term83266.getClass(), "_description", null);
        setField(term83266, term83266.getClass(), "_index", null);
        setField(term83266, term83266.getClass(), "_defaultValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term78556;
        args[1] = term78786;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term83256));
        assertTrue(recursiveEquals(term78556, term83262));
        assertTrue(recursiveEquals(term78786, term83266));
    }

};


