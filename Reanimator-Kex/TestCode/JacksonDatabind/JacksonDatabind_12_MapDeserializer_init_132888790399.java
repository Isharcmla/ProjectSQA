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

public class MapDeserializer_init_132888790399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47987;
     Object term48059;
     Object term48061;

    public MapDeserializer_init_132888790399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47987 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term48040 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term47987, term47987.getClass(), "_mapType", term48040);
        term48059 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term48060 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term48060, term48060.getClass(), "_elementType", null);
        setField(term48060, term48060.getClass(), "_canonicalName", null);
        setField(term48060, term48060.getClass(), "_class", null);
        setIntField(term48060, term48060.getClass(), "_hash", 0);
        setField(term48060, term48060.getClass(), "_valueHandler", null);
        setField(term48060, term48060.getClass(), "_typeHandler", null);
        setBooleanField(term48060, term48060.getClass(), "_asStatic", false);
        setField(term48059, term48059.getClass(), "_mapType", term48060);
        setField(term48059, term48059.getClass(), "_keyDeserializer", null);
        setBooleanField(term48059, term48059.getClass(), "_standardStringKey", true);
        setField(term48059, term48059.getClass(), "_valueDeserializer", null);
        setField(term48059, term48059.getClass(), "_valueTypeDeserializer", null);
        setField(term48059, term48059.getClass(), "_valueInstantiator", null);
        setBooleanField(term48059, term48059.getClass(), "_hasDefaultCreator", false);
        setField(term48059, term48059.getClass(), "_delegateDeserializer", null);
        setField(term48059, term48059.getClass(), "_propertyBasedCreator", null);
        setField(term48059, term48059.getClass(), "_ignorableProperties", null);
        setField(term48059, term48059.getClass(), "_valueClass", null);
        term48061 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term48062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term48062, term48062.getClass(), "_elementType", null);
        setField(term48062, term48062.getClass(), "_canonicalName", null);
        setField(term48062, term48062.getClass(), "_class", null);
        setIntField(term48062, term48062.getClass(), "_hash", 0);
        setField(term48062, term48062.getClass(), "_valueHandler", null);
        setField(term48062, term48062.getClass(), "_typeHandler", null);
        setBooleanField(term48062, term48062.getClass(), "_asStatic", false);
        setField(term48061, term48061.getClass(), "_mapType", term48062);
        setField(term48061, term48061.getClass(), "_keyDeserializer", null);
        setBooleanField(term48061, term48061.getClass(), "_standardStringKey", false);
        setField(term48061, term48061.getClass(), "_valueDeserializer", null);
        setField(term48061, term48061.getClass(), "_valueTypeDeserializer", null);
        setField(term48061, term48061.getClass(), "_valueInstantiator", null);
        setBooleanField(term48061, term48061.getClass(), "_hasDefaultCreator", false);
        setField(term48061, term48061.getClass(), "_delegateDeserializer", null);
        setField(term48061, term48061.getClass(), "_propertyBasedCreator", null);
        setField(term48061, term48061.getClass(), "_ignorableProperties", null);
        setField(term48061, term48061.getClass(), "_valueClass", null);
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
        args[0] = term47987;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term48059));
        assertTrue(recursiveEquals(term47987, null));
    }

};


