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

public class ObjectIdValueProperty_init_189141968748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28383;
     Object term33828;
     Object term33834;

    public ObjectIdValueProperty_init_189141968748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28265 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term28265, term28265.getClass(), "_metadata", null);
        setIntField(term28265, term28265.getClass(), "_propertyIndex", 0);
        term28383 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term28475 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term28475, term28475.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term28383, term28383.getClass(), "propertyName", term28475);
        setField(term28383, term28383.getClass(), "_idType", null);
        setField(term28383, term28383.getClass(), "_deserializer", null);
        term33828 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term33829 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term33830 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term33833 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term33829, term33829.getClass(), "_idType", null);
        setField(term33830, term33830.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term33830, term33830.getClass(), "_namespace", null);
        setField(term33830, term33830.getClass(), "_encodedSimple", null);
        setField(term33829, term33829.getClass(), "propertyName", term33830);
        setField(term33829, term33829.getClass(), "generator", null);
        setField(term33829, term33829.getClass(), "resolver", null);
        setField(term33829, term33829.getClass(), "_deserializer", null);
        setField(term33829, term33829.getClass(), "idProperty", null);
        setField(term33828, term33828.getClass(), "_objectIdReader", term33829);
        setField(term33828, term33828.getClass(), "_propName", term33830);
        setField(term33828, term33828.getClass(), "_type", null);
        setField(term33828, term33828.getClass(), "_wrapperName", null);
        setField(term33828, term33828.getClass(), "_contextAnnotations", null);
        setField(term33828, term33828.getClass(), "_valueDeserializer", null);
        setField(term33828, term33828.getClass(), "_valueTypeDeserializer", null);
        setField(term33828, term33828.getClass(), "_managedReferenceName", null);
        setField(term33828, term33828.getClass(), "_objectIdInfo", null);
        setField(term33828, term33828.getClass(), "_viewMatcher", null);
        setIntField(term33828, term33828.getClass(), "_propertyIndex", -1);
        setField(term33833, term33833.getClass(), "_required", null);
        setField(term33833, term33833.getClass(), "_description", null);
        setField(term33833, term33833.getClass(), "_index", null);
        setField(term33833, term33833.getClass(), "_defaultValue", null);
        setField(term33828, term33828.getClass(), "_metadata", term33833);
        setField(term33828, term33828.getClass(), "_format", null);
        term33834 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term33835 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term33834, term33834.getClass(), "_idType", null);
        setField(term33835, term33835.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term33835, term33835.getClass(), "_namespace", null);
        setField(term33835, term33835.getClass(), "_encodedSimple", null);
        setField(term33834, term33834.getClass(), "propertyName", term33835);
        setField(term33834, term33834.getClass(), "generator", null);
        setField(term33834, term33834.getClass(), "resolver", null);
        setField(term33834, term33834.getClass(), "_deserializer", null);
        setField(term33834, term33834.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term28383;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33828));
        assertTrue(recursiveEquals(term28383, term33834));
    }

};


