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

public class MapDeserializer_init_24806901946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18451;
     Object term18679;
     Object term18680;

    public MapDeserializer_init_24806901946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18451 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        term18679 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term18679, term18679.getClass(), "_mapType", null);
        setField(term18679, term18679.getClass(), "_keyDeserializer", null);
        setBooleanField(term18679, term18679.getClass(), "_standardStringKey", false);
        setField(term18679, term18679.getClass(), "_valueDeserializer", null);
        setField(term18679, term18679.getClass(), "_valueTypeDeserializer", null);
        setField(term18679, term18679.getClass(), "_valueInstantiator", null);
        setBooleanField(term18679, term18679.getClass(), "_hasDefaultCreator", false);
        setField(term18679, term18679.getClass(), "_delegateDeserializer", null);
        setField(term18679, term18679.getClass(), "_propertyBasedCreator", null);
        setField(term18679, term18679.getClass(), "_ignorableProperties", null);
        setField(term18679, term18679.getClass(), "_valueClass", null);
        term18680 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term18680, term18680.getClass(), "_mapType", null);
        setField(term18680, term18680.getClass(), "_keyDeserializer", null);
        setBooleanField(term18680, term18680.getClass(), "_standardStringKey", false);
        setField(term18680, term18680.getClass(), "_valueDeserializer", null);
        setField(term18680, term18680.getClass(), "_valueTypeDeserializer", null);
        setField(term18680, term18680.getClass(), "_valueInstantiator", null);
        setBooleanField(term18680, term18680.getClass(), "_hasDefaultCreator", false);
        setField(term18680, term18680.getClass(), "_delegateDeserializer", null);
        setField(term18680, term18680.getClass(), "_propertyBasedCreator", null);
        setField(term18680, term18680.getClass(), "_ignorableProperties", null);
        setField(term18680, term18680.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Object[] args = new Object[1];
        args[0] = term18451;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18679));
        assertTrue(recursiveEquals(term18451, term18680));
    }

};


