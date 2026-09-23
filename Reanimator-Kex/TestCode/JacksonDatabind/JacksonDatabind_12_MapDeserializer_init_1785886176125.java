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

public class MapDeserializer_init_1785886176125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67702;
     Object term67974;
     Object term68116;

    public MapDeserializer_init_1785886176125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67478 = Class.forName((String) "java.lang.InstantiationError");
        Object term67442 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term67574 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term67442, term67442.getClass(), "_valueClass", term67478);
        setField(term67442, term67442.getClass(), "_mapType", term67574);
        setField(term67442, term67442.getClass(), "_keyDeserializer", null);
        setField(term67442, term67442.getClass(), "_valueDeserializer", null);
        setField(term67442, term67442.getClass(), "_valueTypeDeserializer", null);
        setField(term67442, term67442.getClass(), "_valueInstantiator", null);
        setBooleanField(term67442, term67442.getClass(), "_hasDefaultCreator", false);
        setField(term67442, term67442.getClass(), "_delegateDeserializer", null);
        setField(term67442, term67442.getClass(), "_propertyBasedCreator", null);
        term67702 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object term67832 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(term67702, term67702.getClass(), "_defaultCreator", term67832);
        term67974 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD"));
        term68116 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.KeyDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term67702;
        args[2] = term67974;
        args[3] = null;
        args[4] = term68116;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


