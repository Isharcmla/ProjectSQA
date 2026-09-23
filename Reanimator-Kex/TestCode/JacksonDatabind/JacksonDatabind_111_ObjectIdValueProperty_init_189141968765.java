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

public class ObjectIdValueProperty_init_189141968765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64322;
     Object term64552;
     Object term72955;
     Object term72961;
     Object term72965;

    public ObjectIdValueProperty_init_189141968765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64204 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term64204, term64204.getClass(), "_metadata", null);
        setIntField(term64204, term64204.getClass(), "_propertyIndex", 0);
        term64322 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term64414 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term64414, term64414.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term64322, term64322.getClass(), "propertyName", term64414);
        setField(term64322, term64322.getClass(), "_idType", null);
        setField(term64322, term64322.getClass(), "_deserializer", null);
        term64552 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term72955 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term72956 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term72957 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term72960 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term72956, term72956.getClass(), "_idType", null);
        setField(term72957, term72957.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term72957, term72957.getClass(), "_namespace", null);
        setField(term72957, term72957.getClass(), "_encodedSimple", null);
        setField(term72956, term72956.getClass(), "propertyName", term72957);
        setField(term72956, term72956.getClass(), "generator", null);
        setField(term72956, term72956.getClass(), "resolver", null);
        setField(term72956, term72956.getClass(), "_deserializer", null);
        setField(term72956, term72956.getClass(), "idProperty", null);
        setField(term72955, term72955.getClass(), "_objectIdReader", term72956);
        setField(term72955, term72955.getClass(), "_propName", term72957);
        setField(term72955, term72955.getClass(), "_type", null);
        setField(term72955, term72955.getClass(), "_wrapperName", null);
        setField(term72955, term72955.getClass(), "_contextAnnotations", null);
        setField(term72955, term72955.getClass(), "_valueDeserializer", null);
        setField(term72955, term72955.getClass(), "_valueTypeDeserializer", null);
        setField(term72955, term72955.getClass(), "_nullProvider", null);
        setField(term72955, term72955.getClass(), "_managedReferenceName", null);
        setField(term72955, term72955.getClass(), "_objectIdInfo", null);
        setField(term72955, term72955.getClass(), "_viewMatcher", null);
        setIntField(term72955, term72955.getClass(), "_propertyIndex", -1);
        setField(term72960, term72960.getClass(), "_required", null);
        setField(term72960, term72960.getClass(), "_description", null);
        setField(term72960, term72960.getClass(), "_index", null);
        setField(term72960, term72960.getClass(), "_defaultValue", null);
        setField(term72960, term72960.getClass(), "_mergeInfo", null);
        setField(term72960, term72960.getClass(), "_valueNulls", null);
        setField(term72960, term72960.getClass(), "_contentNulls", null);
        setField(term72955, term72955.getClass(), "_metadata", term72960);
        setField(term72955, term72955.getClass(), "_propertyFormat", null);
        setField(term72955, term72955.getClass(), "_aliases", null);
        term72961 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term72962 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term72961, term72961.getClass(), "_idType", null);
        setField(term72962, term72962.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term72962, term72962.getClass(), "_namespace", null);
        setField(term72962, term72962.getClass(), "_encodedSimple", null);
        setField(term72961, term72961.getClass(), "propertyName", term72962);
        setField(term72961, term72961.getClass(), "generator", null);
        setField(term72961, term72961.getClass(), "resolver", null);
        setField(term72961, term72961.getClass(), "_deserializer", null);
        setField(term72961, term72961.getClass(), "idProperty", null);
        term72965 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term72965, term72965.getClass(), "_required", null);
        setField(term72965, term72965.getClass(), "_description", null);
        setField(term72965, term72965.getClass(), "_index", null);
        setField(term72965, term72965.getClass(), "_defaultValue", null);
        setField(term72965, term72965.getClass(), "_mergeInfo", null);
        setField(term72965, term72965.getClass(), "_valueNulls", null);
        setField(term72965, term72965.getClass(), "_contentNulls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term64322;
        args[1] = term64552;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term72955));
        assertTrue(recursiveEquals(term64322, term72961));
        assertTrue(recursiveEquals(term64552, term72965));
    }

};


