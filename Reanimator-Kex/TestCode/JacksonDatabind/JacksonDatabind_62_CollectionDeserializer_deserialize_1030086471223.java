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

public class CollectionDeserializer_deserialize_1030086471223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177711;
     Object term177817;
     Object term178193;

    public CollectionDeserializer_deserialize_1030086471223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177711 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term177711, term177711.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term179051 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term179050 = ((Class) term179051).getDeclaredField((String) "FIELD_NAME");
        ((Field) term179050).setAccessible(true);
        Object enum160 = ((Field) term179050).get((Object) null);
        term177817 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term177929 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term177929, term177929.getClass(), "_currToken", enum160);
        setField(term177817, term177817.getClass(), "delegate", term177929);
        term178193 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term178193, term178193.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term177817;
        args[1] = term178193;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term177711, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


