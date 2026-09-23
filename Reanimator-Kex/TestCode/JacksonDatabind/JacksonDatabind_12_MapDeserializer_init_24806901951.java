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

public class MapDeserializer_init_24806901951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19589;
     Object term19651;
     Object term19653;

    public MapDeserializer_init_24806901951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19589 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term19637 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term19589, term19589.getClass(), "_mapType", term19637);
        term19651 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term19652 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term19652, term19652.getClass(), "_componentType", null);
        setField(term19652, term19652.getClass(), "_emptyArray", null);
        setField(term19652, term19652.getClass(), "_canonicalName", null);
        setField(term19652, term19652.getClass(), "_class", null);
        setIntField(term19652, term19652.getClass(), "_hash", 0);
        setField(term19652, term19652.getClass(), "_valueHandler", null);
        setField(term19652, term19652.getClass(), "_typeHandler", null);
        setBooleanField(term19652, term19652.getClass(), "_asStatic", false);
        setField(term19651, term19651.getClass(), "_mapType", term19652);
        setField(term19651, term19651.getClass(), "_keyDeserializer", null);
        setBooleanField(term19651, term19651.getClass(), "_standardStringKey", false);
        setField(term19651, term19651.getClass(), "_valueDeserializer", null);
        setField(term19651, term19651.getClass(), "_valueTypeDeserializer", null);
        setField(term19651, term19651.getClass(), "_valueInstantiator", null);
        setBooleanField(term19651, term19651.getClass(), "_hasDefaultCreator", false);
        setField(term19651, term19651.getClass(), "_delegateDeserializer", null);
        setField(term19651, term19651.getClass(), "_propertyBasedCreator", null);
        setField(term19651, term19651.getClass(), "_ignorableProperties", null);
        setField(term19651, term19651.getClass(), "_valueClass", null);
        term19653 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term19654 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term19654, term19654.getClass(), "_componentType", null);
        setField(term19654, term19654.getClass(), "_emptyArray", null);
        setField(term19654, term19654.getClass(), "_canonicalName", null);
        setField(term19654, term19654.getClass(), "_class", null);
        setIntField(term19654, term19654.getClass(), "_hash", 0);
        setField(term19654, term19654.getClass(), "_valueHandler", null);
        setField(term19654, term19654.getClass(), "_typeHandler", null);
        setBooleanField(term19654, term19654.getClass(), "_asStatic", false);
        setField(term19653, term19653.getClass(), "_mapType", term19654);
        setField(term19653, term19653.getClass(), "_keyDeserializer", null);
        setBooleanField(term19653, term19653.getClass(), "_standardStringKey", false);
        setField(term19653, term19653.getClass(), "_valueDeserializer", null);
        setField(term19653, term19653.getClass(), "_valueTypeDeserializer", null);
        setField(term19653, term19653.getClass(), "_valueInstantiator", null);
        setBooleanField(term19653, term19653.getClass(), "_hasDefaultCreator", false);
        setField(term19653, term19653.getClass(), "_delegateDeserializer", null);
        setField(term19653, term19653.getClass(), "_propertyBasedCreator", null);
        setField(term19653, term19653.getClass(), "_ignorableProperties", null);
        setField(term19653, term19653.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Object[] args = new Object[1];
        args[0] = term19589;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19651));
        assertTrue(recursiveEquals(term19589, term19653));
    }

};


