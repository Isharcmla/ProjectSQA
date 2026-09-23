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
import com.fasterxml.jackson.databind.JsonMappingException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class CollectionDeserializer_deserialize_1030086471239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199836;
     Object term200096;
     Object term200360;

    public CollectionDeserializer_deserialize_1030086471239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199836 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object term199976 = newInstance(Class.forName("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer"));
        setField(term199836, term199836.getClass(), "_unwrapSingle", null);
        setField(term199836, term199836.getClass(), "_valueDeserializer", term199976);
        setField(term199836, term199836.getClass(), "_valueTypeDeserializer", null);
        Class<? extends Object> term202243 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term202242 = ((Class) term202243).getDeclaredField((String) "VALUE_FALSE");
        ((Field) term202242).setAccessible(true);
        Object enum184 = ((Field) term202242).get((Object) null);
        term200096 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term200096, term200096.getClass(), "_currToken", enum184);
        term200360 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term200360, term200360.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term200096;
        args[1] = term200360;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term199836, args);
            assertTrue(false);
        }
        catch (JsonMappingException e) {
        }

    }

};


