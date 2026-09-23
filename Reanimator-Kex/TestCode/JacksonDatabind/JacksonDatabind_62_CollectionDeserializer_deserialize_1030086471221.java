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

public class CollectionDeserializer_deserialize_1030086471221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174553;
     Object term174821;
     Object term175085;

    public CollectionDeserializer_deserialize_1030086471221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174553 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term174701 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term174553, term174553.getClass(), "_unwrapSingle", null);
        setField(term174553, term174553.getClass(), "_valueDeserializer", null);
        setField(term174553, term174553.getClass(), "_valueTypeDeserializer", term174701);
        Class<? extends Object> term175838 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term175837 = ((Class) term175838).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term175837).setAccessible(true);
        Object enum157 = ((Field) term175837).get((Object) null);
        term174821 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term174821, term174821.getClass(), "_currToken", enum157);
        term175085 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term175085, term175085.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term174821;
        args[1] = term175085;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term174553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


