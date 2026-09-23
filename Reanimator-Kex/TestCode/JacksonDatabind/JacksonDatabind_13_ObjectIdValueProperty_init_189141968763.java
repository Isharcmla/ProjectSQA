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
     Object term48402;
     Object term52528;
     Object term52533;

    public ObjectIdValueProperty_init_189141968763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48284 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setIntField(term48284, term48284.getClass(), "_propertyIndex", 0);
        term48402 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term48494 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term48494, term48494.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term48402, term48402.getClass(), "propertyName", term48494);
        setField(term48402, term48402.getClass(), "_idType", null);
        setField(term48402, term48402.getClass(), "_deserializer", null);
        term52528 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term52529 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term52530 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term52529, term52529.getClass(), "_idType", null);
        setField(term52530, term52530.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term52530, term52530.getClass(), "_namespace", null);
        setField(term52530, term52530.getClass(), "_encodedSimple", null);
        setField(term52529, term52529.getClass(), "propertyName", term52530);
        setField(term52529, term52529.getClass(), "generator", null);
        setField(term52529, term52529.getClass(), "resolver", null);
        setField(term52529, term52529.getClass(), "_deserializer", null);
        setField(term52529, term52529.getClass(), "idProperty", null);
        setField(term52528, term52528.getClass(), "_objectIdReader", term52529);
        setField(term52528, term52528.getClass(), "_propName", term52530);
        setField(term52528, term52528.getClass(), "_type", null);
        setField(term52528, term52528.getClass(), "_wrapperName", null);
        setField(term52528, term52528.getClass(), "_contextAnnotations", null);
        setField(term52528, term52528.getClass(), "_valueDeserializer", null);
        setField(term52528, term52528.getClass(), "_valueTypeDeserializer", null);
        setField(term52528, term52528.getClass(), "_nullProvider", null);
        setField(term52528, term52528.getClass(), "_metadata", null);
        setField(term52528, term52528.getClass(), "_managedReferenceName", null);
        setField(term52528, term52528.getClass(), "_objectIdInfo", null);
        setField(term52528, term52528.getClass(), "_viewMatcher", null);
        setIntField(term52528, term52528.getClass(), "_propertyIndex", -1);
        term52533 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term52534 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term52533, term52533.getClass(), "_idType", null);
        setField(term52534, term52534.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term52534, term52534.getClass(), "_namespace", null);
        setField(term52534, term52534.getClass(), "_encodedSimple", null);
        setField(term52533, term52533.getClass(), "propertyName", term52534);
        setField(term52533, term52533.getClass(), "generator", null);
        setField(term52533, term52533.getClass(), "resolver", null);
        setField(term52533, term52533.getClass(), "_deserializer", null);
        setField(term52533, term52533.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term48402;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term52528));
        assertTrue(recursiveEquals(term48402, term52533));
    }

};


