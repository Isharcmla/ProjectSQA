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

public class ObjectIdValueProperty_init_189141968764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58447;
     Object term68504;
     Object term68510;

    public ObjectIdValueProperty_init_189141968764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58229 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term58329 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term58229, term58229.getClass(), "_metadata", term58329);
        setIntField(term58229, term58229.getClass(), "_propertyIndex", 0);
        term58447 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term58539 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term58539, term58539.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term58447, term58447.getClass(), "propertyName", term58539);
        setField(term58447, term58447.getClass(), "_idType", null);
        setField(term58447, term58447.getClass(), "_deserializer", null);
        term68504 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term68505 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term68506 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term68509 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term68505, term68505.getClass(), "_idType", null);
        setField(term68506, term68506.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term68506, term68506.getClass(), "_namespace", null);
        setField(term68506, term68506.getClass(), "_encodedSimple", null);
        setField(term68505, term68505.getClass(), "propertyName", term68506);
        setField(term68505, term68505.getClass(), "generator", null);
        setField(term68505, term68505.getClass(), "resolver", null);
        setField(term68505, term68505.getClass(), "_deserializer", null);
        setField(term68505, term68505.getClass(), "idProperty", null);
        setField(term68504, term68504.getClass(), "_objectIdReader", term68505);
        setField(term68504, term68504.getClass(), "_propName", term68506);
        setField(term68504, term68504.getClass(), "_type", null);
        setField(term68504, term68504.getClass(), "_wrapperName", null);
        setField(term68504, term68504.getClass(), "_contextAnnotations", null);
        setField(term68504, term68504.getClass(), "_valueDeserializer", null);
        setField(term68504, term68504.getClass(), "_valueTypeDeserializer", null);
        setField(term68504, term68504.getClass(), "_nullProvider", null);
        setField(term68504, term68504.getClass(), "_managedReferenceName", null);
        setField(term68504, term68504.getClass(), "_objectIdInfo", null);
        setField(term68504, term68504.getClass(), "_viewMatcher", null);
        setIntField(term68504, term68504.getClass(), "_propertyIndex", -1);
        setField(term68509, term68509.getClass(), "_required", null);
        setField(term68509, term68509.getClass(), "_description", null);
        setField(term68509, term68509.getClass(), "_index", null);
        setField(term68509, term68509.getClass(), "_defaultValue", null);
        setField(term68509, term68509.getClass(), "_mergeInfo", null);
        setField(term68509, term68509.getClass(), "_valueNulls", null);
        setField(term68509, term68509.getClass(), "_contentNulls", null);
        setField(term68504, term68504.getClass(), "_metadata", term68509);
        setField(term68504, term68504.getClass(), "_propertyFormat", null);
        setField(term68504, term68504.getClass(), "_aliases", null);
        term68510 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term68511 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term68510, term68510.getClass(), "_idType", null);
        setField(term68511, term68511.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term68511, term68511.getClass(), "_namespace", null);
        setField(term68511, term68511.getClass(), "_encodedSimple", null);
        setField(term68510, term68510.getClass(), "propertyName", term68511);
        setField(term68510, term68510.getClass(), "generator", null);
        setField(term68510, term68510.getClass(), "resolver", null);
        setField(term68510, term68510.getClass(), "_deserializer", null);
        setField(term68510, term68510.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term58447;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term68504));
        assertTrue(recursiveEquals(term58447, term68510));
    }

};


