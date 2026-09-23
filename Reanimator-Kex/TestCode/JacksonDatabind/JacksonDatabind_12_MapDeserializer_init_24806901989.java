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

public class MapDeserializer_init_24806901989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44722;
     Object term44811;
     Object term44813;

    public MapDeserializer_init_24806901989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44722 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term44775 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term44722, term44722.getClass(), "_mapType", term44775);
        term44811 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term44812 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term44812, term44812.getClass(), "_elementType", null);
        setField(term44812, term44812.getClass(), "_canonicalName", null);
        setField(term44812, term44812.getClass(), "_class", null);
        setIntField(term44812, term44812.getClass(), "_hash", 0);
        setField(term44812, term44812.getClass(), "_valueHandler", null);
        setField(term44812, term44812.getClass(), "_typeHandler", null);
        setBooleanField(term44812, term44812.getClass(), "_asStatic", false);
        setField(term44811, term44811.getClass(), "_mapType", term44812);
        setField(term44811, term44811.getClass(), "_keyDeserializer", null);
        setBooleanField(term44811, term44811.getClass(), "_standardStringKey", false);
        setField(term44811, term44811.getClass(), "_valueDeserializer", null);
        setField(term44811, term44811.getClass(), "_valueTypeDeserializer", null);
        setField(term44811, term44811.getClass(), "_valueInstantiator", null);
        setBooleanField(term44811, term44811.getClass(), "_hasDefaultCreator", false);
        setField(term44811, term44811.getClass(), "_delegateDeserializer", null);
        setField(term44811, term44811.getClass(), "_propertyBasedCreator", null);
        setField(term44811, term44811.getClass(), "_ignorableProperties", null);
        setField(term44811, term44811.getClass(), "_valueClass", null);
        term44813 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term44814 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term44814, term44814.getClass(), "_elementType", null);
        setField(term44814, term44814.getClass(), "_canonicalName", null);
        setField(term44814, term44814.getClass(), "_class", null);
        setIntField(term44814, term44814.getClass(), "_hash", 0);
        setField(term44814, term44814.getClass(), "_valueHandler", null);
        setField(term44814, term44814.getClass(), "_typeHandler", null);
        setBooleanField(term44814, term44814.getClass(), "_asStatic", false);
        setField(term44813, term44813.getClass(), "_mapType", term44814);
        setField(term44813, term44813.getClass(), "_keyDeserializer", null);
        setBooleanField(term44813, term44813.getClass(), "_standardStringKey", false);
        setField(term44813, term44813.getClass(), "_valueDeserializer", null);
        setField(term44813, term44813.getClass(), "_valueTypeDeserializer", null);
        setField(term44813, term44813.getClass(), "_valueInstantiator", null);
        setBooleanField(term44813, term44813.getClass(), "_hasDefaultCreator", false);
        setField(term44813, term44813.getClass(), "_delegateDeserializer", null);
        setField(term44813, term44813.getClass(), "_propertyBasedCreator", null);
        setField(term44813, term44813.getClass(), "_ignorableProperties", null);
        setField(term44813, term44813.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Object[] args = new Object[1];
        args[0] = term44722;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44811));
        assertTrue(recursiveEquals(term44722, term44813));
    }

};


