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

public class CollectionDeserializer_deserialize_1030086471283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256973;
     Object term257127;

    public CollectionDeserializer_deserialize_1030086471283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term257021 = new Boolean(false);
        term256973 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        setField(term256973, term256973.getClass(), "_unwrapSingle", term257021);
        Class<? extends Object> term258093 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term258092 = ((Class) term258093).getDeclaredField((String) "VALUE_STRING");
        ((Field) term258092).setAccessible(true);
        Object enum241 = ((Field) term258092).get((Object) null);
        term257127 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term257233 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term257345 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term257345, term257345.getClass(), "_currToken", enum241);
        setField(term257233, term257233.getClass(), "delegate", term257345);
        setField(term257127, term257127.getClass(), "delegate", term257233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term257127;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term256973, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


