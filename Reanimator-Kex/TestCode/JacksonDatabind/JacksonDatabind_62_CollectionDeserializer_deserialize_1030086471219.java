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

public class CollectionDeserializer_deserialize_1030086471219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171235;
     Object term171487;
     Object term171861;

    public CollectionDeserializer_deserialize_1030086471219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171235 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term171381 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term171235, term171235.getClass(), "_unwrapSingle", null);
        setField(term171235, term171235.getClass(), "_valueDeserializer", null);
        setField(term171235, term171235.getClass(), "_valueTypeDeserializer", term171381);
        Class<? extends Object> term172731 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term172730 = ((Class) term172731).getDeclaredField((String) "VALUE_STRING");
        ((Field) term172730).setAccessible(true);
        Object enum154 = ((Field) term172730).get((Object) null);
        term171487 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term171597 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term171597, term171597.getClass(), "_currToken", enum154);
        setField(term171487, term171487.getClass(), "delegate", term171597);
        term171861 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term171861, term171861.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term171487;
        args[1] = term171861;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term171235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


