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

public class MapDeserializer_init_24806901971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29337;
     Object term29397;
     Object term29399;

    public MapDeserializer_init_24806901971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29337 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term29383 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term29337, term29337.getClass(), "_mapType", term29383);
        term29397 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term29398 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term29398, term29398.getClass(), "_keyType", null);
        setField(term29398, term29398.getClass(), "_valueType", null);
        setField(term29398, term29398.getClass(), "_canonicalName", null);
        setField(term29398, term29398.getClass(), "_class", null);
        setIntField(term29398, term29398.getClass(), "_hash", 0);
        setField(term29398, term29398.getClass(), "_valueHandler", null);
        setField(term29398, term29398.getClass(), "_typeHandler", null);
        setBooleanField(term29398, term29398.getClass(), "_asStatic", false);
        setField(term29397, term29397.getClass(), "_mapType", term29398);
        setField(term29397, term29397.getClass(), "_keyDeserializer", null);
        setBooleanField(term29397, term29397.getClass(), "_standardStringKey", false);
        setField(term29397, term29397.getClass(), "_valueDeserializer", null);
        setField(term29397, term29397.getClass(), "_valueTypeDeserializer", null);
        setField(term29397, term29397.getClass(), "_valueInstantiator", null);
        setBooleanField(term29397, term29397.getClass(), "_hasDefaultCreator", false);
        setField(term29397, term29397.getClass(), "_delegateDeserializer", null);
        setField(term29397, term29397.getClass(), "_propertyBasedCreator", null);
        setField(term29397, term29397.getClass(), "_ignorableProperties", null);
        setField(term29397, term29397.getClass(), "_valueClass", null);
        term29399 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term29400 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term29400, term29400.getClass(), "_keyType", null);
        setField(term29400, term29400.getClass(), "_valueType", null);
        setField(term29400, term29400.getClass(), "_canonicalName", null);
        setField(term29400, term29400.getClass(), "_class", null);
        setIntField(term29400, term29400.getClass(), "_hash", 0);
        setField(term29400, term29400.getClass(), "_valueHandler", null);
        setField(term29400, term29400.getClass(), "_typeHandler", null);
        setBooleanField(term29400, term29400.getClass(), "_asStatic", false);
        setField(term29399, term29399.getClass(), "_mapType", term29400);
        setField(term29399, term29399.getClass(), "_keyDeserializer", null);
        setBooleanField(term29399, term29399.getClass(), "_standardStringKey", false);
        setField(term29399, term29399.getClass(), "_valueDeserializer", null);
        setField(term29399, term29399.getClass(), "_valueTypeDeserializer", null);
        setField(term29399, term29399.getClass(), "_valueInstantiator", null);
        setBooleanField(term29399, term29399.getClass(), "_hasDefaultCreator", false);
        setField(term29399, term29399.getClass(), "_delegateDeserializer", null);
        setField(term29399, term29399.getClass(), "_propertyBasedCreator", null);
        setField(term29399, term29399.getClass(), "_ignorableProperties", null);
        setField(term29399, term29399.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Object[] args = new Object[1];
        args[0] = term29337;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29397));
        assertTrue(recursiveEquals(term29337, term29399));
    }

};


