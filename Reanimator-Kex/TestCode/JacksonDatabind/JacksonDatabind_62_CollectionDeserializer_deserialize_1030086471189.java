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

public class CollectionDeserializer_deserialize_1030086471189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136257;
     Object term136363;
     Object term136853;

    public CollectionDeserializer_deserialize_1030086471189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136257 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term136257, term136257.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term137484 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term137483 = ((Class) term137484).getDeclaredField((String) "START_OBJECT");
        ((Field) term137483).setAccessible(true);
        Object enum124 = ((Field) term137483).get((Object) null);
        term136363 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term136469 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term136589 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term136589, term136589.getClass(), "_currToken", enum124);
        setField(term136469, term136469.getClass(), "delegate", term136589);
        setField(term136363, term136363.getClass(), "delegate", term136469);
        term136853 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term136363;
        args[1] = term136853;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term136257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


