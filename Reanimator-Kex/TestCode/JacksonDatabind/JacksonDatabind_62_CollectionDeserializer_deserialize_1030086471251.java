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

public class CollectionDeserializer_deserialize_1030086471251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217614;
     Object term217874;
     Object term218138;

    public CollectionDeserializer_deserialize_1030086471251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217614 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term217762 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(term217614, term217614.getClass(), "_unwrapSingle", null);
        setField(term217614, term217614.getClass(), "_valueDeserializer", term217614);
        setField(term217614, term217614.getClass(), "_valueTypeDeserializer", term217762);
        Class<? extends Object> term218971 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term218970 = ((Class) term218971).getDeclaredField((String) "VALUE_TRUE");
        ((Field) term218970).setAccessible(true);
        Object enum202 = ((Field) term218970).get((Object) null);
        term217874 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term217874, term217874.getClass(), "_currToken", enum202);
        term218138 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term218138, term218138.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term217874;
        args[1] = term218138;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term217614, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


