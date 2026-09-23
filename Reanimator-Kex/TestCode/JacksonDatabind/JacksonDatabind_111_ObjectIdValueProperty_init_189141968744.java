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

public class ObjectIdValueProperty_init_189141968744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11711;
     Object term17583;
     Object term17589;

    public ObjectIdValueProperty_init_189141968744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11593 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term11593, term11593.getClass(), "_metadata", null);
        setIntField(term11593, term11593.getClass(), "_propertyIndex", 0);
        term11711 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term11803 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term11803, term11803.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term11711, term11711.getClass(), "propertyName", term11803);
        setField(term11711, term11711.getClass(), "_idType", null);
        setField(term11711, term11711.getClass(), "_deserializer", null);
        term17583 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term17584 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term17585 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term17588 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term17584, term17584.getClass(), "_idType", null);
        setField(term17585, term17585.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term17585, term17585.getClass(), "_namespace", null);
        setField(term17585, term17585.getClass(), "_encodedSimple", null);
        setField(term17584, term17584.getClass(), "propertyName", term17585);
        setField(term17584, term17584.getClass(), "generator", null);
        setField(term17584, term17584.getClass(), "resolver", null);
        setField(term17584, term17584.getClass(), "_deserializer", null);
        setField(term17584, term17584.getClass(), "idProperty", null);
        setField(term17583, term17583.getClass(), "_objectIdReader", term17584);
        setField(term17583, term17583.getClass(), "_propName", term17585);
        setField(term17583, term17583.getClass(), "_type", null);
        setField(term17583, term17583.getClass(), "_wrapperName", null);
        setField(term17583, term17583.getClass(), "_contextAnnotations", null);
        setField(term17583, term17583.getClass(), "_valueDeserializer", null);
        setField(term17583, term17583.getClass(), "_valueTypeDeserializer", null);
        setField(term17583, term17583.getClass(), "_nullProvider", null);
        setField(term17583, term17583.getClass(), "_managedReferenceName", null);
        setField(term17583, term17583.getClass(), "_objectIdInfo", null);
        setField(term17583, term17583.getClass(), "_viewMatcher", null);
        setIntField(term17583, term17583.getClass(), "_propertyIndex", -1);
        setField(term17588, term17588.getClass(), "_required", null);
        setField(term17588, term17588.getClass(), "_description", null);
        setField(term17588, term17588.getClass(), "_index", null);
        setField(term17588, term17588.getClass(), "_defaultValue", null);
        setField(term17588, term17588.getClass(), "_mergeInfo", null);
        setField(term17588, term17588.getClass(), "_valueNulls", null);
        setField(term17588, term17588.getClass(), "_contentNulls", null);
        setField(term17583, term17583.getClass(), "_metadata", term17588);
        setField(term17583, term17583.getClass(), "_propertyFormat", null);
        setField(term17583, term17583.getClass(), "_aliases", null);
        term17589 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term17590 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term17589, term17589.getClass(), "_idType", null);
        setField(term17590, term17590.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term17590, term17590.getClass(), "_namespace", null);
        setField(term17590, term17590.getClass(), "_encodedSimple", null);
        setField(term17589, term17589.getClass(), "propertyName", term17590);
        setField(term17589, term17589.getClass(), "generator", null);
        setField(term17589, term17589.getClass(), "resolver", null);
        setField(term17589, term17589.getClass(), "_deserializer", null);
        setField(term17589, term17589.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term11711;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17583));
        assertTrue(recursiveEquals(term11711, term17589));
    }

};


