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

public class CollectionDeserializer_deserialize_1030086471247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212468;
     Object term212580;
     Object term212844;

    public CollectionDeserializer_deserialize_1030086471247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212468 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        setField(term212468, term212468.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term213436 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term213435 = ((Class) term213436).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term213435).setAccessible(true);
        Object enum196 = ((Field) term213435).get((Object) null);
        term212580 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term212580, term212580.getClass(), "_currToken", enum196);
        term212844 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term212580;
        args[1] = term212844;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term212468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


