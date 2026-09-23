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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MapDeserializer_init_132888790361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25245;
     Object term25383;

    public MapDeserializer_init_132888790361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25031 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ReduceKeysTask");
        Object term24995 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term25127 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term24995, term24995.getClass(), "_valueClass", term25031);
        setField(term24995, term24995.getClass(), "_mapType", term25127);
        setField(term24995, term24995.getClass(), "_keyDeserializer", null);
        setField(term24995, term24995.getClass(), "_valueDeserializer", null);
        setField(term24995, term24995.getClass(), "_valueTypeDeserializer", null);
        setField(term24995, term24995.getClass(), "_valueInstantiator", null);
        setField(term24995, term24995.getClass(), "_propertyBasedCreator", null);
        setField(term24995, term24995.getClass(), "_delegateDeserializer", null);
        setBooleanField(term24995, term24995.getClass(), "_hasDefaultCreator", false);
        setField(term24995, term24995.getClass(), "_ignorableProperties", null);
        term25245 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term25245, term25245.getClass(), "_mapType", null);
        setField(term25245, term25245.getClass(), "_valueInstantiator", null);
        setField(term25245, term25245.getClass(), "_propertyBasedCreator", null);
        setField(term25245, term25245.getClass(), "_delegateDeserializer", null);
        setBooleanField(term25245, term25245.getClass(), "_hasDefaultCreator", false);
        term25383 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD"));
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
        args[0] = term25245;
        args[1] = term25383;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


