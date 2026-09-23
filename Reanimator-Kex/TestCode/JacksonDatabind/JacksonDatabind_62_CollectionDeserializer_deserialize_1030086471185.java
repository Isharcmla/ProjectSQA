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

public class CollectionDeserializer_deserialize_1030086471185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130363;
     Object term130635;
     Object term130899;

    public CollectionDeserializer_deserialize_1030086471185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term130411 = new Boolean(false);
        term130363 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object term130515 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term130363, term130363.getClass(), "_unwrapSingle", term130411);
        setField(term130515, term130515.getClass(), "_class", null);
        setField(term130363, term130363.getClass(), "_collectionType", term130515);
        Class<? extends Object> term131433 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term131432 = ((Class) term131433).getDeclaredField((String) "VALUE_NULL");
        ((Field) term131432).setAccessible(true);
        Object enum118 = ((Field) term131432).get((Object) null);
        term130635 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term130635, term130635.getClass(), "_currToken", enum118);
        term130899 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term130635;
        args[1] = term130899;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term130363, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


