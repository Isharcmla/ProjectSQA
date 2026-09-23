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

public class CollectionDeserializer_deserialize_1030086471171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112287;
     Object term112393;
     Object term112769;

    public CollectionDeserializer_deserialize_1030086471171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112287 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term112287, term112287.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term113441 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term113440 = ((Class) term113441).getDeclaredField((String) "VALUE_EMBEDDED_OBJECT");
        ((Field) term113440).setAccessible(true);
        Object enum100 = ((Field) term113440).get((Object) null);
        term112393 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term112505 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term112505, term112505.getClass(), "_currToken", enum100);
        setField(term112393, term112393.getClass(), "delegate", term112505);
        term112769 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term112393;
        args[1] = term112769;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term112287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


