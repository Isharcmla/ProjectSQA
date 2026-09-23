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

public class MapDeserializer_init_132888790355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21074;
     Object term21656;
     Object term21658;

    public MapDeserializer_init_132888790355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21074 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term21127 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term21074, term21074.getClass(), "_mapType", term21127);
        term21656 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term21657 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term21657, term21657.getClass(), "_elementType", null);
        setField(term21657, term21657.getClass(), "_canonicalName", null);
        setField(term21657, term21657.getClass(), "_class", null);
        setIntField(term21657, term21657.getClass(), "_hash", 0);
        setField(term21657, term21657.getClass(), "_valueHandler", null);
        setField(term21657, term21657.getClass(), "_typeHandler", null);
        setBooleanField(term21657, term21657.getClass(), "_asStatic", false);
        setField(term21656, term21656.getClass(), "_mapType", term21657);
        setField(term21656, term21656.getClass(), "_keyDeserializer", null);
        setBooleanField(term21656, term21656.getClass(), "_standardStringKey", true);
        setField(term21656, term21656.getClass(), "_valueDeserializer", null);
        setField(term21656, term21656.getClass(), "_valueTypeDeserializer", null);
        setField(term21656, term21656.getClass(), "_valueInstantiator", null);
        setBooleanField(term21656, term21656.getClass(), "_hasDefaultCreator", false);
        setField(term21656, term21656.getClass(), "_delegateDeserializer", null);
        setField(term21656, term21656.getClass(), "_propertyBasedCreator", null);
        setField(term21656, term21656.getClass(), "_ignorableProperties", null);
        setField(term21656, term21656.getClass(), "_valueClass", null);
        term21658 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term21659 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term21659, term21659.getClass(), "_elementType", null);
        setField(term21659, term21659.getClass(), "_canonicalName", null);
        setField(term21659, term21659.getClass(), "_class", null);
        setIntField(term21659, term21659.getClass(), "_hash", 0);
        setField(term21659, term21659.getClass(), "_valueHandler", null);
        setField(term21659, term21659.getClass(), "_typeHandler", null);
        setBooleanField(term21659, term21659.getClass(), "_asStatic", false);
        setField(term21658, term21658.getClass(), "_mapType", term21659);
        setField(term21658, term21658.getClass(), "_keyDeserializer", null);
        setBooleanField(term21658, term21658.getClass(), "_standardStringKey", false);
        setField(term21658, term21658.getClass(), "_valueDeserializer", null);
        setField(term21658, term21658.getClass(), "_valueTypeDeserializer", null);
        setField(term21658, term21658.getClass(), "_valueInstantiator", null);
        setBooleanField(term21658, term21658.getClass(), "_hasDefaultCreator", false);
        setField(term21658, term21658.getClass(), "_delegateDeserializer", null);
        setField(term21658, term21658.getClass(), "_propertyBasedCreator", null);
        setField(term21658, term21658.getClass(), "_ignorableProperties", null);
        setField(term21658, term21658.getClass(), "_valueClass", null);
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
        args[0] = term21074;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21656));
        assertTrue(recursiveEquals(term21074, null));
    }

};


