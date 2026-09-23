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

public class CollectionDeserializer_deserialize_1030086471215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164894;
     Object term165148;
     Object term165412;

    public CollectionDeserializer_deserialize_1030086471215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164894 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term165036 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(term164894, term164894.getClass(), "_unwrapSingle", null);
        setField(term164894, term164894.getClass(), "_valueDeserializer", null);
        setField(term164894, term164894.getClass(), "_valueTypeDeserializer", term165036);
        Class<? extends Object> term166185 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term166184 = ((Class) term166185).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term166184).setAccessible(true);
        Object enum148 = ((Field) term166184).get((Object) null);
        term165148 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term165148, term165148.getClass(), "_currToken", enum148);
        term165412 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term165412, term165412.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term165148;
        args[1] = term165412;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term164894, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


