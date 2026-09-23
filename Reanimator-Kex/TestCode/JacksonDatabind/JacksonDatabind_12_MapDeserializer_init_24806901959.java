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

public class MapDeserializer_init_24806901959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23144;
     Object term24235;
     Object term24237;

    public MapDeserializer_init_24806901959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23144 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term23197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term23144, term23144.getClass(), "_mapType", term23197);
        term24235 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term24236 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term24236, term24236.getClass(), "_elementType", null);
        setField(term24236, term24236.getClass(), "_canonicalName", null);
        setField(term24236, term24236.getClass(), "_class", null);
        setIntField(term24236, term24236.getClass(), "_hash", 0);
        setField(term24236, term24236.getClass(), "_valueHandler", null);
        setField(term24236, term24236.getClass(), "_typeHandler", null);
        setBooleanField(term24236, term24236.getClass(), "_asStatic", false);
        setField(term24235, term24235.getClass(), "_mapType", term24236);
        setField(term24235, term24235.getClass(), "_keyDeserializer", null);
        setBooleanField(term24235, term24235.getClass(), "_standardStringKey", false);
        setField(term24235, term24235.getClass(), "_valueDeserializer", null);
        setField(term24235, term24235.getClass(), "_valueTypeDeserializer", null);
        setField(term24235, term24235.getClass(), "_valueInstantiator", null);
        setBooleanField(term24235, term24235.getClass(), "_hasDefaultCreator", false);
        setField(term24235, term24235.getClass(), "_delegateDeserializer", null);
        setField(term24235, term24235.getClass(), "_propertyBasedCreator", null);
        setField(term24235, term24235.getClass(), "_ignorableProperties", null);
        setField(term24235, term24235.getClass(), "_valueClass", null);
        term24237 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term24238 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term24238, term24238.getClass(), "_elementType", null);
        setField(term24238, term24238.getClass(), "_canonicalName", null);
        setField(term24238, term24238.getClass(), "_class", null);
        setIntField(term24238, term24238.getClass(), "_hash", 0);
        setField(term24238, term24238.getClass(), "_valueHandler", null);
        setField(term24238, term24238.getClass(), "_typeHandler", null);
        setBooleanField(term24238, term24238.getClass(), "_asStatic", false);
        setField(term24237, term24237.getClass(), "_mapType", term24238);
        setField(term24237, term24237.getClass(), "_keyDeserializer", null);
        setBooleanField(term24237, term24237.getClass(), "_standardStringKey", false);
        setField(term24237, term24237.getClass(), "_valueDeserializer", null);
        setField(term24237, term24237.getClass(), "_valueTypeDeserializer", null);
        setField(term24237, term24237.getClass(), "_valueInstantiator", null);
        setBooleanField(term24237, term24237.getClass(), "_hasDefaultCreator", false);
        setField(term24237, term24237.getClass(), "_delegateDeserializer", null);
        setField(term24237, term24237.getClass(), "_propertyBasedCreator", null);
        setField(term24237, term24237.getClass(), "_ignorableProperties", null);
        setField(term24237, term24237.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Object[] args = new Object[1];
        args[0] = term23144;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24235));
        assertTrue(recursiveEquals(term23144, term24237));
    }

};


