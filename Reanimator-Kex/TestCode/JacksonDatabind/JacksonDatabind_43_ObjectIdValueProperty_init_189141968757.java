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

public class ObjectIdValueProperty_init_189141968757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59266;
     Object term63867;
     Object term63873;

    public ObjectIdValueProperty_init_189141968757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59148 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term59148, term59148.getClass(), "_metadata", null);
        setIntField(term59148, term59148.getClass(), "_propertyIndex", 0);
        term59266 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term59358 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term59358, term59358.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term59266, term59266.getClass(), "propertyName", term59358);
        setField(term59266, term59266.getClass(), "_idType", null);
        setField(term59266, term59266.getClass(), "_deserializer", null);
        term63867 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term63868 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term63869 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term63872 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term63868, term63868.getClass(), "_idType", null);
        setField(term63869, term63869.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term63869, term63869.getClass(), "_namespace", null);
        setField(term63869, term63869.getClass(), "_encodedSimple", null);
        setField(term63868, term63868.getClass(), "propertyName", term63869);
        setField(term63868, term63868.getClass(), "generator", null);
        setField(term63868, term63868.getClass(), "resolver", null);
        setField(term63868, term63868.getClass(), "_deserializer", null);
        setField(term63868, term63868.getClass(), "idProperty", null);
        setField(term63867, term63867.getClass(), "_objectIdReader", term63868);
        setField(term63867, term63867.getClass(), "_propName", term63869);
        setField(term63867, term63867.getClass(), "_type", null);
        setField(term63867, term63867.getClass(), "_wrapperName", null);
        setField(term63867, term63867.getClass(), "_contextAnnotations", null);
        setField(term63867, term63867.getClass(), "_valueDeserializer", null);
        setField(term63867, term63867.getClass(), "_valueTypeDeserializer", null);
        setField(term63867, term63867.getClass(), "_managedReferenceName", null);
        setField(term63867, term63867.getClass(), "_objectIdInfo", null);
        setField(term63867, term63867.getClass(), "_viewMatcher", null);
        setIntField(term63867, term63867.getClass(), "_propertyIndex", -1);
        setField(term63872, term63872.getClass(), "_required", null);
        setField(term63872, term63872.getClass(), "_description", null);
        setField(term63872, term63872.getClass(), "_index", null);
        setField(term63872, term63872.getClass(), "_defaultValue", null);
        setField(term63867, term63867.getClass(), "_metadata", term63872);
        setField(term63867, term63867.getClass(), "_format", null);
        term63873 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term63874 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term63873, term63873.getClass(), "_idType", null);
        setField(term63874, term63874.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term63874, term63874.getClass(), "_namespace", null);
        setField(term63874, term63874.getClass(), "_encodedSimple", null);
        setField(term63873, term63873.getClass(), "propertyName", term63874);
        setField(term63873, term63873.getClass(), "generator", null);
        setField(term63873, term63873.getClass(), "resolver", null);
        setField(term63873, term63873.getClass(), "_deserializer", null);
        setField(term63873, term63873.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term59266;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term63867));
        assertTrue(recursiveEquals(term59266, term63873));
    }

};


