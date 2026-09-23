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

public class ObjectIdValueProperty_init_189141968739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9306;
     Object term13423;
     Object term13429;

    public ObjectIdValueProperty_init_189141968739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9188 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term9188, term9188.getClass(), "_metadata", null);
        setIntField(term9188, term9188.getClass(), "_propertyIndex", 0);
        term9306 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term9398 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term9398, term9398.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term9306, term9306.getClass(), "propertyName", term9398);
        setField(term9306, term9306.getClass(), "_idType", null);
        setField(term9306, term9306.getClass(), "_deserializer", null);
        term13423 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term13424 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term13425 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term13428 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term13424, term13424.getClass(), "_idType", null);
        setField(term13425, term13425.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term13425, term13425.getClass(), "_namespace", null);
        setField(term13425, term13425.getClass(), "_encodedSimple", null);
        setField(term13424, term13424.getClass(), "propertyName", term13425);
        setField(term13424, term13424.getClass(), "generator", null);
        setField(term13424, term13424.getClass(), "resolver", null);
        setField(term13424, term13424.getClass(), "_deserializer", null);
        setField(term13424, term13424.getClass(), "idProperty", null);
        setField(term13423, term13423.getClass(), "_objectIdReader", term13424);
        setField(term13423, term13423.getClass(), "_propName", term13425);
        setField(term13423, term13423.getClass(), "_type", null);
        setField(term13423, term13423.getClass(), "_wrapperName", null);
        setField(term13423, term13423.getClass(), "_contextAnnotations", null);
        setField(term13423, term13423.getClass(), "_valueDeserializer", null);
        setField(term13423, term13423.getClass(), "_valueTypeDeserializer", null);
        setField(term13423, term13423.getClass(), "_managedReferenceName", null);
        setField(term13423, term13423.getClass(), "_objectIdInfo", null);
        setField(term13423, term13423.getClass(), "_viewMatcher", null);
        setIntField(term13423, term13423.getClass(), "_propertyIndex", -1);
        setField(term13428, term13428.getClass(), "_required", null);
        setField(term13428, term13428.getClass(), "_description", null);
        setField(term13428, term13428.getClass(), "_index", null);
        setField(term13428, term13428.getClass(), "_defaultValue", null);
        setField(term13423, term13423.getClass(), "_metadata", term13428);
        setField(term13423, term13423.getClass(), "_format", null);
        term13429 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term13430 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term13429, term13429.getClass(), "_idType", null);
        setField(term13430, term13430.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term13430, term13430.getClass(), "_namespace", null);
        setField(term13430, term13430.getClass(), "_encodedSimple", null);
        setField(term13429, term13429.getClass(), "propertyName", term13430);
        setField(term13429, term13429.getClass(), "generator", null);
        setField(term13429, term13429.getClass(), "resolver", null);
        setField(term13429, term13429.getClass(), "_deserializer", null);
        setField(term13429, term13429.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term9306;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13423));
        assertTrue(recursiveEquals(term9306, term13429));
    }

};


