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

public class MapDeserializer_init_132888790349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18863;
     Object term19270;
     Object term19271;

    public MapDeserializer_init_132888790349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18863 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        term19270 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term19270, term19270.getClass(), "_mapType", null);
        setField(term19270, term19270.getClass(), "_keyDeserializer", null);
        setBooleanField(term19270, term19270.getClass(), "_standardStringKey", true);
        setField(term19270, term19270.getClass(), "_valueDeserializer", null);
        setField(term19270, term19270.getClass(), "_valueTypeDeserializer", null);
        setField(term19270, term19270.getClass(), "_valueInstantiator", null);
        setBooleanField(term19270, term19270.getClass(), "_hasDefaultCreator", false);
        setField(term19270, term19270.getClass(), "_delegateDeserializer", null);
        setField(term19270, term19270.getClass(), "_propertyBasedCreator", null);
        setField(term19270, term19270.getClass(), "_ignorableProperties", null);
        setField(term19270, term19270.getClass(), "_valueClass", null);
        term19271 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term19271, term19271.getClass(), "_mapType", null);
        setField(term19271, term19271.getClass(), "_keyDeserializer", null);
        setBooleanField(term19271, term19271.getClass(), "_standardStringKey", false);
        setField(term19271, term19271.getClass(), "_valueDeserializer", null);
        setField(term19271, term19271.getClass(), "_valueTypeDeserializer", null);
        setField(term19271, term19271.getClass(), "_valueInstantiator", null);
        setBooleanField(term19271, term19271.getClass(), "_hasDefaultCreator", false);
        setField(term19271, term19271.getClass(), "_delegateDeserializer", null);
        setField(term19271, term19271.getClass(), "_propertyBasedCreator", null);
        setField(term19271, term19271.getClass(), "_ignorableProperties", null);
        setField(term19271, term19271.getClass(), "_valueClass", null);
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
        args[0] = term18863;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19270));
        assertTrue(recursiveEquals(term18863, null));
    }

};


