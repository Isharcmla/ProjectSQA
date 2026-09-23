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

public class ObjectIdValueProperty_init_189141968726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3506;
     Object term4268;
     Object term4274;

    public ObjectIdValueProperty_init_189141968726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3388 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        term3506 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        term4268 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term4269 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term4270 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term4273 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term4269, term4269.getClass(), "_idType", null);
        setField(term4269, term4269.getClass(), "propertyName", null);
        setField(term4269, term4269.getClass(), "generator", null);
        setField(term4269, term4269.getClass(), "resolver", null);
        setField(term4269, term4269.getClass(), "_deserializer", null);
        setField(term4269, term4269.getClass(), "idProperty", null);
        setField(term4268, term4268.getClass(), "_objectIdReader", term4269);
        setField(term4270, term4270.getClass(), "_simpleName", "");
        setField(term4270, term4270.getClass(), "_namespace", null);
        setField(term4270, term4270.getClass(), "_encodedSimple", null);
        setField(term4268, term4268.getClass(), "_propName", term4270);
        setField(term4268, term4268.getClass(), "_type", null);
        setField(term4268, term4268.getClass(), "_wrapperName", null);
        setField(term4268, term4268.getClass(), "_contextAnnotations", null);
        setField(term4268, term4268.getClass(), "_valueDeserializer", null);
        setField(term4268, term4268.getClass(), "_valueTypeDeserializer", null);
        setField(term4268, term4268.getClass(), "_managedReferenceName", null);
        setField(term4268, term4268.getClass(), "_objectIdInfo", null);
        setField(term4268, term4268.getClass(), "_viewMatcher", null);
        setIntField(term4268, term4268.getClass(), "_propertyIndex", -1);
        setField(term4273, term4273.getClass(), "_required", null);
        setField(term4273, term4273.getClass(), "_description", null);
        setField(term4273, term4273.getClass(), "_index", null);
        setField(term4273, term4273.getClass(), "_defaultValue", null);
        setField(term4268, term4268.getClass(), "_metadata", term4273);
        setField(term4268, term4268.getClass(), "_format", null);
        term4274 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term4274, term4274.getClass(), "_idType", null);
        setField(term4274, term4274.getClass(), "propertyName", null);
        setField(term4274, term4274.getClass(), "generator", null);
        setField(term4274, term4274.getClass(), "resolver", null);
        setField(term4274, term4274.getClass(), "_deserializer", null);
        setField(term4274, term4274.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term3506;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4268));
        assertTrue(recursiveEquals(term3506, term4274));
    }

};


