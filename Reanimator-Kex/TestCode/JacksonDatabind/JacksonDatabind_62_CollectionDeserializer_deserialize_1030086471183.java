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

public class CollectionDeserializer_deserialize_1030086471183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127174;
     Object term127376;
     Object term127750;

    public CollectionDeserializer_deserialize_1030086471183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127174 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term127270 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term127174, term127174.getClass(), "_unwrapSingle", null);
        setField(term127174, term127174.getClass(), "_collectionType", term127270);
        Class<? extends Object> term128382 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term128381 = ((Class) term128382).getDeclaredField((String) "VALUE_STRING");
        ((Field) term128381).setAccessible(true);
        Object enum115 = ((Field) term128381).get((Object) null);
        term127376 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term127486 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term127486, term127486.getClass(), "_currToken", enum115);
        setField(term127376, term127376.getClass(), "delegate", term127486);
        term127750 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setIntField(term127750, term127750.getClass(), "_featureFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term127376;
        args[1] = term127750;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term127174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


