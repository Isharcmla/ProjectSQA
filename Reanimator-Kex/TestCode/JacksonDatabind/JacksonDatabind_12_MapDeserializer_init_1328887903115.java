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

public class MapDeserializer_init_1328887903115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58832;
     Object term59090;

    public MapDeserializer_init_1328887903115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58614 = Class.forName((String) "java.util.PropertyPermissionCollection$1");
        Object term58578 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term58714 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term58578, term58578.getClass(), "_valueClass", term58614);
        setField(term58578, term58578.getClass(), "_mapType", term58714);
        setField(term58578, term58578.getClass(), "_keyDeserializer", null);
        setField(term58578, term58578.getClass(), "_valueDeserializer", null);
        setField(term58578, term58578.getClass(), "_valueTypeDeserializer", null);
        setField(term58578, term58578.getClass(), "_valueInstantiator", null);
        setField(term58578, term58578.getClass(), "_propertyBasedCreator", null);
        setField(term58578, term58578.getClass(), "_delegateDeserializer", null);
        setBooleanField(term58578, term58578.getClass(), "_hasDefaultCreator", false);
        setField(term58578, term58578.getClass(), "_ignorableProperties", null);
        Class<? extends Object> term58966 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor$Base");
        term58832 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term58930 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term58930, term58930.getClass(), "_class", term58966);
        setField(term58832, term58832.getClass(), "_mapType", term58930);
        setField(term58832, term58832.getClass(), "_valueInstantiator", null);
        setField(term58832, term58832.getClass(), "_propertyBasedCreator", null);
        setField(term58832, term58832.getClass(), "_delegateDeserializer", null);
        setBooleanField(term58832, term58832.getClass(), "_hasDefaultCreator", false);
        term59090 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
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
        args[0] = term58832;
        args[1] = term59090;
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


