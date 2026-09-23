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

public class ObjectIdValueProperty_init_189141968738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8882;
     Object term10301;
     Object term10307;

    public ObjectIdValueProperty_init_189141968738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8764 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term8764, term8764.getClass(), "_metadata", null);
        setIntField(term8764, term8764.getClass(), "_propertyIndex", 0);
        term8882 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term8974 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term8974, term8974.getClass(), "_simpleName", "");
        setField(term8882, term8882.getClass(), "propertyName", term8974);
        setField(term8882, term8882.getClass(), "_idType", null);
        setField(term8882, term8882.getClass(), "_deserializer", null);
        term10301 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term10302 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term10303 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term10306 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term10302, term10302.getClass(), "_idType", null);
        setField(term10303, term10303.getClass(), "_simpleName", "");
        setField(term10303, term10303.getClass(), "_namespace", null);
        setField(term10303, term10303.getClass(), "_encodedSimple", null);
        setField(term10302, term10302.getClass(), "propertyName", term10303);
        setField(term10302, term10302.getClass(), "generator", null);
        setField(term10302, term10302.getClass(), "resolver", null);
        setField(term10302, term10302.getClass(), "_deserializer", null);
        setField(term10302, term10302.getClass(), "idProperty", null);
        setField(term10301, term10301.getClass(), "_objectIdReader", term10302);
        setField(term10301, term10301.getClass(), "_propName", term10303);
        setField(term10301, term10301.getClass(), "_type", null);
        setField(term10301, term10301.getClass(), "_wrapperName", null);
        setField(term10301, term10301.getClass(), "_contextAnnotations", null);
        setField(term10301, term10301.getClass(), "_valueDeserializer", null);
        setField(term10301, term10301.getClass(), "_valueTypeDeserializer", null);
        setField(term10301, term10301.getClass(), "_nullProvider", null);
        setField(term10301, term10301.getClass(), "_managedReferenceName", null);
        setField(term10301, term10301.getClass(), "_objectIdInfo", null);
        setField(term10301, term10301.getClass(), "_viewMatcher", null);
        setIntField(term10301, term10301.getClass(), "_propertyIndex", -1);
        setField(term10306, term10306.getClass(), "_required", null);
        setField(term10306, term10306.getClass(), "_description", null);
        setField(term10306, term10306.getClass(), "_index", null);
        setField(term10306, term10306.getClass(), "_defaultValue", null);
        setField(term10306, term10306.getClass(), "_mergeInfo", null);
        setField(term10306, term10306.getClass(), "_valueNulls", null);
        setField(term10306, term10306.getClass(), "_contentNulls", null);
        setField(term10301, term10301.getClass(), "_metadata", term10306);
        setField(term10301, term10301.getClass(), "_propertyFormat", null);
        setField(term10301, term10301.getClass(), "_aliases", null);
        term10307 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term10308 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term10307, term10307.getClass(), "_idType", null);
        setField(term10308, term10308.getClass(), "_simpleName", "");
        setField(term10308, term10308.getClass(), "_namespace", null);
        setField(term10308, term10308.getClass(), "_encodedSimple", null);
        setField(term10307, term10307.getClass(), "propertyName", term10308);
        setField(term10307, term10307.getClass(), "generator", null);
        setField(term10307, term10307.getClass(), "resolver", null);
        setField(term10307, term10307.getClass(), "_deserializer", null);
        setField(term10307, term10307.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term8882;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10301));
        assertTrue(recursiveEquals(term8882, term10307));
    }

};


