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

public class CollectionDeserializer_deserialize_1030086471235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193306;
     Object term193412;
     Object term193786;

    public CollectionDeserializer_deserialize_1030086471235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193306 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        setField(term193306, term193306.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term194452 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term194451 = ((Class) term194452).getDeclaredField((String) "VALUE_FALSE");
        ((Field) term194451).setAccessible(true);
        Object enum178 = ((Field) term194451).get((Object) null);
        term193412 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term193522 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term193522, term193522.getClass(), "_currToken", enum178);
        setField(term193412, term193412.getClass(), "delegate", term193522);
        term193786 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term193412;
        args[1] = term193786;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term193306, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


