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
import java.lang.String;
import java.lang.Object;

public class CollectionDeserializer_deserialize_1030086471107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50806;
     Object term50918;
     Object term51182;

    public CollectionDeserializer_deserialize_1030086471107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50806 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term50806, term50806.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term51760 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term51759 = ((Class) term51760).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term51759).setAccessible(true);
        Object enum40 = ((Field) term51759).get((Object) null);
        term50918 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term50918, term50918.getClass(), "_currToken", enum40);
        term51182 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term50918;
        args[1] = term51182;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term50806, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


