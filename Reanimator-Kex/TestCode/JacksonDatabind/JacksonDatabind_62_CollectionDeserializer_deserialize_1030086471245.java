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

public class CollectionDeserializer_deserialize_1030086471245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209380;
     Object term209486;

    public CollectionDeserializer_deserialize_1030086471245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209380 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Class<? extends Object> term210543 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term210542 = ((Class) term210543).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term210542).setAccessible(true);
        Object enum193 = ((Field) term210542).get((Object) null);
        term209486 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term209592 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term209704 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term209704, term209704.getClass(), "_currToken", enum193);
        setField(term209592, term209592.getClass(), "delegate", term209704);
        setField(term209486, term209486.getClass(), "delegate", term209592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term209486;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term209380, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


