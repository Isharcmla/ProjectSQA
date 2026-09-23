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

public class MapDeserializer_init_132888790391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45136;
     Object term45203;
     Object term45205;

    public MapDeserializer_init_132888790391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45136 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term45184 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term45136, term45136.getClass(), "_mapType", term45184);
        term45203 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term45204 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term45204, term45204.getClass(), "_componentType", null);
        setField(term45204, term45204.getClass(), "_emptyArray", null);
        setField(term45204, term45204.getClass(), "_canonicalName", null);
        setField(term45204, term45204.getClass(), "_class", null);
        setIntField(term45204, term45204.getClass(), "_hash", 0);
        setField(term45204, term45204.getClass(), "_valueHandler", null);
        setField(term45204, term45204.getClass(), "_typeHandler", null);
        setBooleanField(term45204, term45204.getClass(), "_asStatic", false);
        setField(term45203, term45203.getClass(), "_mapType", term45204);
        setField(term45203, term45203.getClass(), "_keyDeserializer", null);
        setBooleanField(term45203, term45203.getClass(), "_standardStringKey", true);
        setField(term45203, term45203.getClass(), "_valueDeserializer", null);
        setField(term45203, term45203.getClass(), "_valueTypeDeserializer", null);
        setField(term45203, term45203.getClass(), "_valueInstantiator", null);
        setBooleanField(term45203, term45203.getClass(), "_hasDefaultCreator", false);
        setField(term45203, term45203.getClass(), "_delegateDeserializer", null);
        setField(term45203, term45203.getClass(), "_propertyBasedCreator", null);
        setField(term45203, term45203.getClass(), "_ignorableProperties", null);
        setField(term45203, term45203.getClass(), "_valueClass", null);
        term45205 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term45206 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term45206, term45206.getClass(), "_componentType", null);
        setField(term45206, term45206.getClass(), "_emptyArray", null);
        setField(term45206, term45206.getClass(), "_canonicalName", null);
        setField(term45206, term45206.getClass(), "_class", null);
        setIntField(term45206, term45206.getClass(), "_hash", 0);
        setField(term45206, term45206.getClass(), "_valueHandler", null);
        setField(term45206, term45206.getClass(), "_typeHandler", null);
        setBooleanField(term45206, term45206.getClass(), "_asStatic", false);
        setField(term45205, term45205.getClass(), "_mapType", term45206);
        setField(term45205, term45205.getClass(), "_keyDeserializer", null);
        setBooleanField(term45205, term45205.getClass(), "_standardStringKey", false);
        setField(term45205, term45205.getClass(), "_valueDeserializer", null);
        setField(term45205, term45205.getClass(), "_valueTypeDeserializer", null);
        setField(term45205, term45205.getClass(), "_valueInstantiator", null);
        setBooleanField(term45205, term45205.getClass(), "_hasDefaultCreator", false);
        setField(term45205, term45205.getClass(), "_delegateDeserializer", null);
        setField(term45205, term45205.getClass(), "_propertyBasedCreator", null);
        setField(term45205, term45205.getClass(), "_ignorableProperties", null);
        setField(term45205, term45205.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.KeyDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[4] = Class.forName("java.util.HashSet");
        Object[] args = new Object[5];
        args[0] = term45136;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45203));
        assertTrue(recursiveEquals(term45136, null));
    }

};


