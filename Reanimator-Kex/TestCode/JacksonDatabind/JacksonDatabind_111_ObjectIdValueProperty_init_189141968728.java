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

public class ObjectIdValueProperty_init_189141968728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3752;
     Object term4515;
     Object term4521;

    public ObjectIdValueProperty_init_189141968728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3634 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        term3752 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        term4515 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term4516 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term4517 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term4520 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term4516, term4516.getClass(), "_idType", null);
        setField(term4516, term4516.getClass(), "propertyName", null);
        setField(term4516, term4516.getClass(), "generator", null);
        setField(term4516, term4516.getClass(), "resolver", null);
        setField(term4516, term4516.getClass(), "_deserializer", null);
        setField(term4516, term4516.getClass(), "idProperty", null);
        setField(term4515, term4515.getClass(), "_objectIdReader", term4516);
        setField(term4517, term4517.getClass(), "_simpleName", "");
        setField(term4517, term4517.getClass(), "_namespace", null);
        setField(term4517, term4517.getClass(), "_encodedSimple", null);
        setField(term4515, term4515.getClass(), "_propName", term4517);
        setField(term4515, term4515.getClass(), "_type", null);
        setField(term4515, term4515.getClass(), "_wrapperName", null);
        setField(term4515, term4515.getClass(), "_contextAnnotations", null);
        setField(term4515, term4515.getClass(), "_valueDeserializer", null);
        setField(term4515, term4515.getClass(), "_valueTypeDeserializer", null);
        setField(term4515, term4515.getClass(), "_nullProvider", null);
        setField(term4515, term4515.getClass(), "_managedReferenceName", null);
        setField(term4515, term4515.getClass(), "_objectIdInfo", null);
        setField(term4515, term4515.getClass(), "_viewMatcher", null);
        setIntField(term4515, term4515.getClass(), "_propertyIndex", -1);
        setField(term4520, term4520.getClass(), "_required", null);
        setField(term4520, term4520.getClass(), "_description", null);
        setField(term4520, term4520.getClass(), "_index", null);
        setField(term4520, term4520.getClass(), "_defaultValue", null);
        setField(term4520, term4520.getClass(), "_mergeInfo", null);
        setField(term4520, term4520.getClass(), "_valueNulls", null);
        setField(term4520, term4520.getClass(), "_contentNulls", null);
        setField(term4515, term4515.getClass(), "_metadata", term4520);
        setField(term4515, term4515.getClass(), "_propertyFormat", null);
        setField(term4515, term4515.getClass(), "_aliases", null);
        term4521 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term4521, term4521.getClass(), "_idType", null);
        setField(term4521, term4521.getClass(), "propertyName", null);
        setField(term4521, term4521.getClass(), "generator", null);
        setField(term4521, term4521.getClass(), "resolver", null);
        setField(term4521, term4521.getClass(), "_deserializer", null);
        setField(term4521, term4521.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term3752;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4515));
        assertTrue(recursiveEquals(term3752, term4521));
    }

};


