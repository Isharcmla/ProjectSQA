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

public class MapDeserializer_init_248069019117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60584;
     Object term60644;
     Object term60646;

    public MapDeserializer_init_248069019117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60584 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term60630 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term60584, term60584.getClass(), "_mapType", term60630);
        term60644 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term60645 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term60645, term60645.getClass(), "_keyType", null);
        setField(term60645, term60645.getClass(), "_valueType", null);
        setField(term60645, term60645.getClass(), "_canonicalName", null);
        setField(term60645, term60645.getClass(), "_class", null);
        setIntField(term60645, term60645.getClass(), "_hash", 0);
        setField(term60645, term60645.getClass(), "_valueHandler", null);
        setField(term60645, term60645.getClass(), "_typeHandler", null);
        setBooleanField(term60645, term60645.getClass(), "_asStatic", false);
        setField(term60644, term60644.getClass(), "_mapType", term60645);
        setField(term60644, term60644.getClass(), "_keyDeserializer", null);
        setBooleanField(term60644, term60644.getClass(), "_standardStringKey", false);
        setField(term60644, term60644.getClass(), "_valueDeserializer", null);
        setField(term60644, term60644.getClass(), "_valueTypeDeserializer", null);
        setField(term60644, term60644.getClass(), "_valueInstantiator", null);
        setBooleanField(term60644, term60644.getClass(), "_hasDefaultCreator", false);
        setField(term60644, term60644.getClass(), "_delegateDeserializer", null);
        setField(term60644, term60644.getClass(), "_propertyBasedCreator", null);
        setField(term60644, term60644.getClass(), "_ignorableProperties", null);
        setField(term60644, term60644.getClass(), "_valueClass", null);
        term60646 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term60647 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term60647, term60647.getClass(), "_keyType", null);
        setField(term60647, term60647.getClass(), "_valueType", null);
        setField(term60647, term60647.getClass(), "_canonicalName", null);
        setField(term60647, term60647.getClass(), "_class", null);
        setIntField(term60647, term60647.getClass(), "_hash", 0);
        setField(term60647, term60647.getClass(), "_valueHandler", null);
        setField(term60647, term60647.getClass(), "_typeHandler", null);
        setBooleanField(term60647, term60647.getClass(), "_asStatic", false);
        setField(term60646, term60646.getClass(), "_mapType", term60647);
        setField(term60646, term60646.getClass(), "_keyDeserializer", null);
        setBooleanField(term60646, term60646.getClass(), "_standardStringKey", false);
        setField(term60646, term60646.getClass(), "_valueDeserializer", null);
        setField(term60646, term60646.getClass(), "_valueTypeDeserializer", null);
        setField(term60646, term60646.getClass(), "_valueInstantiator", null);
        setBooleanField(term60646, term60646.getClass(), "_hasDefaultCreator", false);
        setField(term60646, term60646.getClass(), "_delegateDeserializer", null);
        setField(term60646, term60646.getClass(), "_propertyBasedCreator", null);
        setField(term60646, term60646.getClass(), "_ignorableProperties", null);
        setField(term60646, term60646.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Object[] args = new Object[1];
        args[0] = term60584;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term60644));
        assertTrue(recursiveEquals(term60584, term60646));
    }

};


