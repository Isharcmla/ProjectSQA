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

public class CollectionDeserializer_handleNonArray_782599076253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220827;
     Object term221071;
     Object term221335;

    public CollectionDeserializer_handleNonArray_782599076253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220827 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term220959 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term220827, term220827.getClass(), "_unwrapSingle", null);
        setField(term220827, term220827.getClass(), "_valueDeserializer", term220959);
        setField(term220827, term220827.getClass(), "_valueTypeDeserializer", null);
        Class<? extends Object> term221920 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term221919 = ((Class) term221920).getDeclaredField((String) "VALUE_NULL");
        ((Field) term221919).setAccessible(true);
        Object enum205 = ((Field) term221919).get((Object) null);
        term221071 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term221071, term221071.getClass(), "_currToken", enum205);
        term221335 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term221335, term221335.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term221071;
        args[1] = term221335;
        args[2] = null;
        try {
            callMethod(klass, "handleNonArray", argTypes, term220827, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


