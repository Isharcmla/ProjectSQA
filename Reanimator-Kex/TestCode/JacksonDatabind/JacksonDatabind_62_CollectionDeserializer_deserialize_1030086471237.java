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

public class CollectionDeserializer_deserialize_1030086471237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196274;
     Object term196546;
     Object term196930;

    public CollectionDeserializer_deserialize_1030086471237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196274 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term196440 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        setField(term196274, term196274.getClass(), "_unwrapSingle", null);
        setField(term196274, term196274.getClass(), "_valueDeserializer", term196440);
        setField(term196274, term196274.getClass(), "_valueTypeDeserializer", null);
        Class<? extends Object> term197861 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term197860 = ((Class) term197861).getDeclaredField((String) "VALUE_NUMBER_FLOAT");
        ((Field) term197860).setAccessible(true);
        Object enum181 = ((Field) term197860).get((Object) null);
        term196546 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term196666 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term196666, term196666.getClass(), "_currToken", enum181);
        setField(term196546, term196546.getClass(), "delegate", term196666);
        term196930 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term196930, term196930.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term196546;
        args[1] = term196930;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term196274, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


