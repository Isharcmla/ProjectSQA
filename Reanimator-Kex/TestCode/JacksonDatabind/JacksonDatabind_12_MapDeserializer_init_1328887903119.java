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

public class MapDeserializer_init_1328887903119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62005;
     Object term62253;

    public MapDeserializer_init_1328887903119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61459 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp$OfLong");
        Class<? extends Object> term62071 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsChars$ByteArrayViewVarHandle");
        Object term61423 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object term62053 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term61757 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        Object term61887 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term61423, term61423.getClass(), "_valueClass", term61459);
        setField(term62053, term62053.getClass(), "_class", term62071);
        setField(term61423, term61423.getClass(), "_mapType", term62053);
        setField(term61423, term61423.getClass(), "_keyDeserializer", null);
        setField(term61423, term61423.getClass(), "_valueDeserializer", term61757);
        setField(term61423, term61423.getClass(), "_valueTypeDeserializer", null);
        setField(term61423, term61423.getClass(), "_valueInstantiator", null);
        setField(term61423, term61423.getClass(), "_propertyBasedCreator", term61887);
        setField(term61423, term61423.getClass(), "_delegateDeserializer", null);
        setBooleanField(term61423, term61423.getClass(), "_hasDefaultCreator", false);
        setField(term61423, term61423.getClass(), "_ignorableProperties", null);
        term62005 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(term62005, term62005.getClass(), "_mapType", term62053);
        setField(term62005, term62005.getClass(), "_valueInstantiator", null);
        setField(term62005, term62005.getClass(), "_propertyBasedCreator", null);
        setField(term62005, term62005.getClass(), "_delegateDeserializer", null);
        setBooleanField(term62005, term62005.getClass(), "_hasDefaultCreator", false);
        term62253 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer"));
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
        args[0] = term62005;
        args[1] = term62253;
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


