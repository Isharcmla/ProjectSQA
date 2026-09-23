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

public class CollectionDeserializer_deserialize_1030086471159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95297;
     Object term95403;
     Object term95777;

    public CollectionDeserializer_deserialize_1030086471159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95297 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term95297, term95297.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term96449 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term96448 = ((Class) term96449).getDeclaredField((String) "VALUE_EMBEDDED_OBJECT");
        ((Field) term96448).setAccessible(true);
        Object enum82 = ((Field) term96448).get((Object) null);
        term95403 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term95513 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term95513, term95513.getClass(), "_currToken", enum82);
        setField(term95403, term95403.getClass(), "delegate", term95513);
        term95777 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term95403;
        args[1] = term95777;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term95297, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


