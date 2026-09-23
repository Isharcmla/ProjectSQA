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

public class MapDeserializer_init_132888790375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32826;
     Object term33106;

    public MapDeserializer_init_132888790375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32612 = Class.forName((String) "java.util.stream.ReduceOps$4");
        Object term32576 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term32708 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term32576, term32576.getClass(), "_valueClass", term32612);
        setField(term32576, term32576.getClass(), "_mapType", term32708);
        setField(term32576, term32576.getClass(), "_keyDeserializer", null);
        setField(term32576, term32576.getClass(), "_valueDeserializer", null);
        setField(term32576, term32576.getClass(), "_valueTypeDeserializer", null);
        setField(term32576, term32576.getClass(), "_valueInstantiator", null);
        setField(term32576, term32576.getClass(), "_propertyBasedCreator", null);
        setField(term32576, term32576.getClass(), "_delegateDeserializer", null);
        setBooleanField(term32576, term32576.getClass(), "_hasDefaultCreator", false);
        setField(term32576, term32576.getClass(), "_ignorableProperties", null);
        Class<? extends Object> term32968 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        term32826 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term32932 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term32932, term32932.getClass(), "_class", term32968);
        setField(term32826, term32826.getClass(), "_mapType", term32932);
        setField(term32826, term32826.getClass(), "_valueInstantiator", null);
        setField(term32826, term32826.getClass(), "_propertyBasedCreator", null);
        setField(term32826, term32826.getClass(), "_delegateDeserializer", null);
        setBooleanField(term32826, term32826.getClass(), "_hasDefaultCreator", false);
        term33106 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD"));
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
        args[0] = term32826;
        args[1] = term33106;
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


