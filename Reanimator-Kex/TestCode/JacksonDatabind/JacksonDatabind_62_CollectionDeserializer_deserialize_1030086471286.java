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

public class CollectionDeserializer_deserialize_1030086471286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259915;
     Object term260159;
     Object term260423;

    public CollectionDeserializer_deserialize_1030086471286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259915 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term260047 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term259915, term259915.getClass(), "_unwrapSingle", null);
        setField(term259915, term259915.getClass(), "_valueDeserializer", term260047);
        setField(term259915, term259915.getClass(), "_valueTypeDeserializer", null);
        Class<? extends Object> term262548 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term262547 = ((Class) term262548).getDeclaredField((String) "END_OBJECT");
        ((Field) term262547).setAccessible(true);
        Object enum245 = ((Field) term262547).get((Object) null);
        term260159 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term260159, term260159.getClass(), "_currToken", enum245);
        term260423 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term260423, term260423.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term260159;
        args[1] = term260423;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term259915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


