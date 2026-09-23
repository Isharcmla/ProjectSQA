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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MapDeserializer_init_132888790381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38940;
     Object term39218;

    public MapDeserializer_init_132888790381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38578 = Class.forName((String) "java.util.TreeMap$NavigableSubMap$EntrySetView");
        Object term38542 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term38674 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term38822 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(term38542, term38542.getClass(), "_valueClass", term38578);
        setField(term38542, term38542.getClass(), "_mapType", term38674);
        setField(term38542, term38542.getClass(), "_keyDeserializer", null);
        setField(term38542, term38542.getClass(), "_valueDeserializer", null);
        setField(term38542, term38542.getClass(), "_valueTypeDeserializer", term38822);
        setField(term38542, term38542.getClass(), "_valueInstantiator", null);
        setField(term38542, term38542.getClass(), "_propertyBasedCreator", null);
        setField(term38542, term38542.getClass(), "_delegateDeserializer", null);
        setBooleanField(term38542, term38542.getClass(), "_hasDefaultCreator", false);
        setField(term38542, term38542.getClass(), "_ignorableProperties", null);
        Class<? extends Object> term39068 = Class.forName((String) "java.lang.Long");
        term38940 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term39032 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term39032, term39032.getClass(), "_class", term39068);
        setField(term38940, term38940.getClass(), "_mapType", term39032);
        setField(term38940, term38940.getClass(), "_valueInstantiator", null);
        setField(term38940, term38940.getClass(), "_propertyBasedCreator", null);
        setField(term38940, term38940.getClass(), "_delegateDeserializer", null);
        setBooleanField(term38940, term38940.getClass(), "_hasDefaultCreator", false);
        term39218 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD"));
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
        args[0] = term38940;
        args[1] = term39218;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


