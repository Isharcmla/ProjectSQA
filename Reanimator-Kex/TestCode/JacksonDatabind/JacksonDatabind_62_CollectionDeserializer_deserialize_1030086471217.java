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

public class CollectionDeserializer_deserialize_1030086471217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168277;
     Object term168525;
     Object term168789;

    public CollectionDeserializer_deserialize_1030086471217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168277 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object term168405 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term168277, term168277.getClass(), "_unwrapSingle", null);
        setField(term168277, term168277.getClass(), "_valueDeserializer", term168405);
        setField(term168277, term168277.getClass(), "_valueTypeDeserializer", null);
        Class<? extends Object> term169369 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term169368 = ((Class) term169369).getDeclaredField((String) "VALUE_NULL");
        ((Field) term169368).setAccessible(true);
        Object enum151 = ((Field) term169368).get((Object) null);
        term168525 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term168525, term168525.getClass(), "_currToken", enum151);
        term168789 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term168789, term168789.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term168525;
        args[1] = term168789;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term168277, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


