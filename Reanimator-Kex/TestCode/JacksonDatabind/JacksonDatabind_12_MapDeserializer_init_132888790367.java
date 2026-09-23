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

public class MapDeserializer_init_132888790367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28361;
     Object term28426;
     Object term28428;

    public MapDeserializer_init_132888790367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28361 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term28407 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term28361, term28361.getClass(), "_mapType", term28407);
        term28426 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term28427 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term28427, term28427.getClass(), "_keyType", null);
        setField(term28427, term28427.getClass(), "_valueType", null);
        setField(term28427, term28427.getClass(), "_canonicalName", null);
        setField(term28427, term28427.getClass(), "_class", null);
        setIntField(term28427, term28427.getClass(), "_hash", 0);
        setField(term28427, term28427.getClass(), "_valueHandler", null);
        setField(term28427, term28427.getClass(), "_typeHandler", null);
        setBooleanField(term28427, term28427.getClass(), "_asStatic", false);
        setField(term28426, term28426.getClass(), "_mapType", term28427);
        setField(term28426, term28426.getClass(), "_keyDeserializer", null);
        setBooleanField(term28426, term28426.getClass(), "_standardStringKey", true);
        setField(term28426, term28426.getClass(), "_valueDeserializer", null);
        setField(term28426, term28426.getClass(), "_valueTypeDeserializer", null);
        setField(term28426, term28426.getClass(), "_valueInstantiator", null);
        setBooleanField(term28426, term28426.getClass(), "_hasDefaultCreator", false);
        setField(term28426, term28426.getClass(), "_delegateDeserializer", null);
        setField(term28426, term28426.getClass(), "_propertyBasedCreator", null);
        setField(term28426, term28426.getClass(), "_ignorableProperties", null);
        setField(term28426, term28426.getClass(), "_valueClass", null);
        term28428 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term28429 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term28429, term28429.getClass(), "_keyType", null);
        setField(term28429, term28429.getClass(), "_valueType", null);
        setField(term28429, term28429.getClass(), "_canonicalName", null);
        setField(term28429, term28429.getClass(), "_class", null);
        setIntField(term28429, term28429.getClass(), "_hash", 0);
        setField(term28429, term28429.getClass(), "_valueHandler", null);
        setField(term28429, term28429.getClass(), "_typeHandler", null);
        setBooleanField(term28429, term28429.getClass(), "_asStatic", false);
        setField(term28428, term28428.getClass(), "_mapType", term28429);
        setField(term28428, term28428.getClass(), "_keyDeserializer", null);
        setBooleanField(term28428, term28428.getClass(), "_standardStringKey", false);
        setField(term28428, term28428.getClass(), "_valueDeserializer", null);
        setField(term28428, term28428.getClass(), "_valueTypeDeserializer", null);
        setField(term28428, term28428.getClass(), "_valueInstantiator", null);
        setBooleanField(term28428, term28428.getClass(), "_hasDefaultCreator", false);
        setField(term28428, term28428.getClass(), "_delegateDeserializer", null);
        setField(term28428, term28428.getClass(), "_propertyBasedCreator", null);
        setField(term28428, term28428.getClass(), "_ignorableProperties", null);
        setField(term28428, term28428.getClass(), "_valueClass", null);
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
        args[0] = term28361;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28426));
        assertTrue(recursiveEquals(term28361, null));
    }

};


