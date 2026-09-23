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

public class CollectionDeserializer_deserialize_1030086471271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243435;
     Object term243681;

    public CollectionDeserializer_deserialize_1030086471271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term243483 = new Boolean(false);
        term243435 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        Object term243575 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term243435, term243435.getClass(), "_unwrapSingle", term243483);
        setField(term243435, term243435.getClass(), "_collectionType", term243575);
        Class<? extends Object> term244475 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term244474 = ((Class) term244475).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term244474).setAccessible(true);
        Object enum226 = ((Field) term244474).get((Object) null);
        term243681 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term243801 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term243801, term243801.getClass(), "_currToken", enum226);
        setField(term243681, term243681.getClass(), "delegate", term243801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term243681;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term243435, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


