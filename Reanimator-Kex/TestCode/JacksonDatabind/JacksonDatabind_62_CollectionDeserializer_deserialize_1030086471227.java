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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

public class CollectionDeserializer_deserialize_1030086471227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182144;
     Object term182402;

    public CollectionDeserializer_deserialize_1030086471227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term182192 = new Boolean(false);
        term182144 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object term182290 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term182144, term182144.getClass(), "_unwrapSingle", term182192);
        setField(term182144, term182144.getClass(), "_collectionType", term182290);
        Class<? extends Object> term183058 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term183057 = ((Class) term183058).getDeclaredField((String) "VALUE_STRING");
        ((Field) term183057).setAccessible(true);
        Object enum166 = ((Field) term183057).get((Object) null);
        term182402 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term182402, term182402.getClass(), "_currToken", enum166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term182402;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term182144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


