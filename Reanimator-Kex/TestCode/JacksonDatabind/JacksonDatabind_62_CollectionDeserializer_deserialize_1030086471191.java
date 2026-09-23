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

public class CollectionDeserializer_deserialize_1030086471191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138455;
     Object term138609;

    public CollectionDeserializer_deserialize_1030086471191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term138503 = new Boolean(true);
        term138455 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term138455, term138455.getClass(), "_unwrapSingle", term138503);
        Class<? extends Object> term139564 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term139563 = ((Class) term139564).getDeclaredField((String) "VALUE_EMBEDDED_OBJECT");
        ((Field) term139563).setAccessible(true);
        Object enum127 = ((Field) term139563).get((Object) null);
        term138609 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term138715 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term138835 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term138835, term138835.getClass(), "_currToken", enum127);
        setField(term138715, term138715.getClass(), "delegate", term138835);
        setField(term138609, term138609.getClass(), "delegate", term138715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term138609;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term138455, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


