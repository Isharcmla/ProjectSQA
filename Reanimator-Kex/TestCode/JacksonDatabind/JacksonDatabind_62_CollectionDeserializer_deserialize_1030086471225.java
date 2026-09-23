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

public class CollectionDeserializer_deserialize_1030086471225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180016;
     Object term180266;

    public CollectionDeserializer_deserialize_1030086471225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term180064 = new Boolean(false);
        term180016 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object term180160 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term180016, term180016.getClass(), "_unwrapSingle", term180064);
        setField(term180016, term180016.getClass(), "_collectionType", term180160);
        Class<? extends Object> term181092 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term181091 = ((Class) term181092).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term181091).setAccessible(true);
        Object enum163 = ((Field) term181091).get((Object) null);
        term180266 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term180378 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term180378, term180378.getClass(), "_currToken", enum163);
        setField(term180266, term180266.getClass(), "delegate", term180378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term180266;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term180016, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


