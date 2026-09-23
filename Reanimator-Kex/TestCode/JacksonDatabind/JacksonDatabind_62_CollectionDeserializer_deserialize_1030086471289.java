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

public class CollectionDeserializer_deserialize_1030086471289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265325;
     Object term265431;
     Object term265815;

    public CollectionDeserializer_deserialize_1030086471289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265325 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term265325, term265325.getClass(), "_unwrapSingle", null);
        setField(term265325, term265325.getClass(), "_valueDeserializer", null);
        setField(term265325, term265325.getClass(), "_valueTypeDeserializer", null);
        Class<? extends Object> term266650 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term266649 = ((Class) term266650).getDeclaredField((String) "START_OBJECT");
        ((Field) term266649).setAccessible(true);
        Object enum250 = ((Field) term266649).get((Object) null);
        term265431 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term265551 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term265551, term265551.getClass(), "_currToken", enum250);
        setField(term265431, term265431.getClass(), "delegate", term265551);
        term265815 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term265815, term265815.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term265431;
        args[1] = term265815;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term265325, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


