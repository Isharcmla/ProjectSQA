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

public class ObjectIdValueProperty_init_189141968754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40877;
     Object term41107;
     Object term52474;
     Object term52480;
     Object term52484;

    public ObjectIdValueProperty_init_189141968754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40759 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term40759, term40759.getClass(), "_metadata", null);
        setIntField(term40759, term40759.getClass(), "_propertyIndex", 0);
        term40877 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term40969 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term40969, term40969.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term40877, term40877.getClass(), "propertyName", term40969);
        setField(term40877, term40877.getClass(), "_idType", null);
        setField(term40877, term40877.getClass(), "_deserializer", null);
        term41107 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term52474 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term52475 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term52476 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term52479 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term52475, term52475.getClass(), "_idType", null);
        setField(term52476, term52476.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term52476, term52476.getClass(), "_namespace", null);
        setField(term52476, term52476.getClass(), "_encodedSimple", null);
        setField(term52475, term52475.getClass(), "propertyName", term52476);
        setField(term52475, term52475.getClass(), "generator", null);
        setField(term52475, term52475.getClass(), "resolver", null);
        setField(term52475, term52475.getClass(), "_deserializer", null);
        setField(term52475, term52475.getClass(), "idProperty", null);
        setField(term52474, term52474.getClass(), "_objectIdReader", term52475);
        setField(term52474, term52474.getClass(), "_propName", term52476);
        setField(term52474, term52474.getClass(), "_type", null);
        setField(term52474, term52474.getClass(), "_wrapperName", null);
        setField(term52474, term52474.getClass(), "_contextAnnotations", null);
        setField(term52474, term52474.getClass(), "_valueDeserializer", null);
        setField(term52474, term52474.getClass(), "_valueTypeDeserializer", null);
        setField(term52474, term52474.getClass(), "_managedReferenceName", null);
        setField(term52474, term52474.getClass(), "_objectIdInfo", null);
        setField(term52474, term52474.getClass(), "_viewMatcher", null);
        setIntField(term52474, term52474.getClass(), "_propertyIndex", -1);
        setField(term52479, term52479.getClass(), "_required", null);
        setField(term52479, term52479.getClass(), "_description", null);
        setField(term52479, term52479.getClass(), "_index", null);
        setField(term52479, term52479.getClass(), "_defaultValue", null);
        setField(term52474, term52474.getClass(), "_metadata", term52479);
        setField(term52474, term52474.getClass(), "_format", null);
        term52480 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term52481 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term52480, term52480.getClass(), "_idType", null);
        setField(term52481, term52481.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term52481, term52481.getClass(), "_namespace", null);
        setField(term52481, term52481.getClass(), "_encodedSimple", null);
        setField(term52480, term52480.getClass(), "propertyName", term52481);
        setField(term52480, term52480.getClass(), "generator", null);
        setField(term52480, term52480.getClass(), "resolver", null);
        setField(term52480, term52480.getClass(), "_deserializer", null);
        setField(term52480, term52480.getClass(), "idProperty", null);
        term52484 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term52484, term52484.getClass(), "_required", null);
        setField(term52484, term52484.getClass(), "_description", null);
        setField(term52484, term52484.getClass(), "_index", null);
        setField(term52484, term52484.getClass(), "_defaultValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term40877;
        args[1] = term41107;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term52474));
        assertTrue(recursiveEquals(term40877, term52480));
        assertTrue(recursiveEquals(term41107, term52484));
    }

};


