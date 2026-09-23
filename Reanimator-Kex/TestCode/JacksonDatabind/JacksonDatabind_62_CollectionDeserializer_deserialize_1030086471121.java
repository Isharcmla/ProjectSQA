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

public class CollectionDeserializer_deserialize_1030086471121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63106;
     Object term63318;
     Object term63582;

    public CollectionDeserializer_deserialize_1030086471121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63106 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term63198 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term63106, term63106.getClass(), "_unwrapSingle", null);
        setField(term63106, term63106.getClass(), "_collectionType", term63198);
        Class<? extends Object> term64153 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term64152 = ((Class) term64153).getDeclaredField((String) "VALUE_NULL");
        ((Field) term64152).setAccessible(true);
        Object enum52 = ((Field) term64152).get((Object) null);
        term63318 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term63318, term63318.getClass(), "_currToken", enum52);
        term63582 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term63582, term63582.getClass(), "_featureFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term63318;
        args[1] = term63582;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term63106, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


