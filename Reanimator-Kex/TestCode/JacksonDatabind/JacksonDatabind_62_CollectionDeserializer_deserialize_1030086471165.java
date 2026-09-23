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

public class CollectionDeserializer_deserialize_1030086471165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102321;
     Object term102585;

    public CollectionDeserializer_deserialize_1030086471165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term102369 = new Boolean(false);
        term102321 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term102473 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term102321, term102321.getClass(), "_unwrapSingle", term102369);
        setField(term102321, term102321.getClass(), "_collectionType", term102473);
        Class<? extends Object> term103239 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term103238 = ((Class) term103239).getDeclaredField((String) "VALUE_STRING");
        ((Field) term103238).setAccessible(true);
        Object enum91 = ((Field) term103238).get((Object) null);
        term102585 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term102585, term102585.getClass(), "_currToken", enum91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term102585;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term102321, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


