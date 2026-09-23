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

public class CollectionDeserializer_deserialize_1030086471203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153923;
     Object term154077;

    public CollectionDeserializer_deserialize_1030086471203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term153971 = new Boolean(false);
        term153923 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term153923, term153923.getClass(), "_unwrapSingle", term153971);
        Class<? extends Object> term155019 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term155018 = ((Class) term155019).getDeclaredField((String) "VALUE_NUMBER_FLOAT");
        ((Field) term155018).setAccessible(true);
        Object enum142 = ((Field) term155018).get((Object) null);
        term154077 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term154183 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term154303 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term154303, term154303.getClass(), "_currToken", enum142);
        setField(term154183, term154183.getClass(), "delegate", term154303);
        setField(term154077, term154077.getClass(), "delegate", term154183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term154077;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term153923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


