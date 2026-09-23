package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;
import java.lang.Object;

public class MapDeserializer_init_24806901995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45853;
     Object term45916;
     Object term45918;

    public MapDeserializer_init_24806901995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45853 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term45902 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term45853, term45853.getClass(), "_mapType", term45902);
        term45916 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term45917 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term45917, term45917.getClass(), "_typeParameters", null);
        setField(term45917, term45917.getClass(), "_typeNames", null);
        setField(term45917, term45917.getClass(), "_canonicalName", null);
        setField(term45917, term45917.getClass(), "_class", null);
        setIntField(term45917, term45917.getClass(), "_hash", 0);
        setField(term45917, term45917.getClass(), "_valueHandler", null);
        setField(term45917, term45917.getClass(), "_typeHandler", null);
        setBooleanField(term45917, term45917.getClass(), "_asStatic", false);
        setField(term45916, term45916.getClass(), "_mapType", term45917);
        setField(term45916, term45916.getClass(), "_keyDeserializer", null);
        setBooleanField(term45916, term45916.getClass(), "_standardStringKey", false);
        setField(term45916, term45916.getClass(), "_valueDeserializer", null);
        setField(term45916, term45916.getClass(), "_valueTypeDeserializer", null);
        setField(term45916, term45916.getClass(), "_valueInstantiator", null);
        setBooleanField(term45916, term45916.getClass(), "_hasDefaultCreator", false);
        setField(term45916, term45916.getClass(), "_delegateDeserializer", null);
        setField(term45916, term45916.getClass(), "_propertyBasedCreator", null);
        setField(term45916, term45916.getClass(), "_ignorableProperties", null);
        setField(term45916, term45916.getClass(), "_valueClass", null);
        term45918 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term45919 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term45919, term45919.getClass(), "_typeParameters", null);
        setField(term45919, term45919.getClass(), "_typeNames", null);
        setField(term45919, term45919.getClass(), "_canonicalName", null);
        setField(term45919, term45919.getClass(), "_class", null);
        setIntField(term45919, term45919.getClass(), "_hash", 0);
        setField(term45919, term45919.getClass(), "_valueHandler", null);
        setField(term45919, term45919.getClass(), "_typeHandler", null);
        setBooleanField(term45919, term45919.getClass(), "_asStatic", false);
        setField(term45918, term45918.getClass(), "_mapType", term45919);
        setField(term45918, term45918.getClass(), "_keyDeserializer", null);
        setBooleanField(term45918, term45918.getClass(), "_standardStringKey", false);
        setField(term45918, term45918.getClass(), "_valueDeserializer", null);
        setField(term45918, term45918.getClass(), "_valueTypeDeserializer", null);
        setField(term45918, term45918.getClass(), "_valueInstantiator", null);
        setBooleanField(term45918, term45918.getClass(), "_hasDefaultCreator", false);
        setField(term45918, term45918.getClass(), "_delegateDeserializer", null);
        setField(term45918, term45918.getClass(), "_propertyBasedCreator", null);
        setField(term45918, term45918.getClass(), "_ignorableProperties", null);
        setField(term45918, term45918.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Object[] args = new Object[1];
        args[0] = term45853;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45916));
        assertTrue(recursiveEquals(term45853, term45918));
    }

};


