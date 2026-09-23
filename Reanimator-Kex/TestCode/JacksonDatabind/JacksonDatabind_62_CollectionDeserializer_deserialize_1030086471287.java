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

public class CollectionDeserializer_deserialize_1030086471287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261109;
     Object term261377;

    public CollectionDeserializer_deserialize_1030086471287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term261157 = new Boolean(false);
        term261109 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term261271 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term261109, term261109.getClass(), "_unwrapSingle", term261157);
        setField(term261109, term261109.getClass(), "_collectionType", term261271);
        Class<? extends Object> term263455 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term263454 = ((Class) term263455).getDeclaredField((String) "VALUE_FALSE");
        ((Field) term263454).setAccessible(true);
        Object enum247 = ((Field) term263454).get((Object) null);
        term261377 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term261483 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term261603 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term261603, term261603.getClass(), "_currToken", enum247);
        setField(term261483, term261483.getClass(), "delegate", term261603);
        setField(term261377, term261377.getClass(), "delegate", term261483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term261377;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term261109, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


