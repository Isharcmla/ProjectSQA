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

public class CollectionDeserializer_deserialize_1030086471275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248257;
     Object term248519;
     Object term248783;

    public CollectionDeserializer_deserialize_1030086471275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248257 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term248399 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(term248257, term248257.getClass(), "_unwrapSingle", null);
        setField(term248257, term248257.getClass(), "_valueDeserializer", term248257);
        setField(term248257, term248257.getClass(), "_valueTypeDeserializer", term248399);
        Class<? extends Object> term249554 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term249553 = ((Class) term249554).getDeclaredField((String) "VALUE_TRUE");
        ((Field) term249553).setAccessible(true);
        Object enum232 = ((Field) term249553).get((Object) null);
        term248519 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term248519, term248519.getClass(), "_currToken", enum232);
        term248783 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term248783, term248783.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term248519;
        args[1] = term248783;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term248257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


