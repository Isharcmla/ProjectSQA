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

public class CollectionDeserializer_deserialize_1030086471193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141675;
     Object term141781;
     Object term142155;

    public CollectionDeserializer_deserialize_1030086471193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141675 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term141675, term141675.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term143013 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term143012 = ((Class) term143013).getDeclaredField((String) "FIELD_NAME");
        ((Field) term143012).setAccessible(true);
        Object enum130 = ((Field) term143012).get((Object) null);
        term141781 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term141891 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term141891, term141891.getClass(), "_currToken", enum130);
        setField(term141781, term141781.getClass(), "delegate", term141891);
        term142155 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term142155, term142155.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term141781;
        args[1] = term142155;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term141675, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


