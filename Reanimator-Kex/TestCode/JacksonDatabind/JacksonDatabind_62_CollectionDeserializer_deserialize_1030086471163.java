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

public class CollectionDeserializer_deserialize_1030086471163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100323;
     Object term100477;

    public CollectionDeserializer_deserialize_1030086471163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term100371 = new Boolean(true);
        term100323 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term100323, term100323.getClass(), "_unwrapSingle", term100371);
        Class<? extends Object> term101317 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term101316 = ((Class) term101317).getDeclaredField((String) "VALUE_NULL");
        ((Field) term101316).setAccessible(true);
        Object enum88 = ((Field) term101316).get((Object) null);
        term100477 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term100589 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term100589, term100589.getClass(), "_currToken", enum88);
        setField(term100477, term100477.getClass(), "delegate", term100589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term100477;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term100323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


