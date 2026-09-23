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

public class CollectionDeserializer_deserialize_1030086471257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227668;
     Object term227774;
     Object term228264;

    public CollectionDeserializer_deserialize_1030086471257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227668 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term227668, term227668.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term229180 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term229179 = ((Class) term229180).getDeclaredField((String) "START_OBJECT");
        ((Field) term229179).setAccessible(true);
        Object enum211 = ((Field) term229179).get((Object) null);
        term227774 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term227880 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term228000 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term228000, term228000.getClass(), "_currToken", enum211);
        setField(term227880, term227880.getClass(), "delegate", term228000);
        setField(term227774, term227774.getClass(), "delegate", term227880);
        term228264 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term228264, term228264.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term227774;
        args[1] = term228264;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term227668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


