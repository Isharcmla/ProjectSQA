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

public class CollectionDeserializer_deserialize_1030086471169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109202;
     Object term109308;
     Object term109692;

    public CollectionDeserializer_deserialize_1030086471169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109202 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term109202, term109202.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term110490 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term110489 = ((Class) term110490).getDeclaredField((String) "FIELD_NAME");
        ((Field) term110489).setAccessible(true);
        Object enum97 = ((Field) term110489).get((Object) null);
        term109308 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term109428 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term109428, term109428.getClass(), "_currToken", enum97);
        setField(term109308, term109308.getClass(), "delegate", term109428);
        term109692 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term109692, term109692.getClass(), "_featureFlags", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term109308;
        args[1] = term109692;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term109202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


