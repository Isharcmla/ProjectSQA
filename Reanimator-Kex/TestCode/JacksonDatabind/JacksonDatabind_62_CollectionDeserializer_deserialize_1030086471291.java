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

public class CollectionDeserializer_deserialize_1030086471291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267632;
     Object term267786;

    public CollectionDeserializer_deserialize_1030086471291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term267680 = new Boolean(false);
        term267632 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term267632, term267632.getClass(), "_unwrapSingle", term267680);
        Class<? extends Object> term268778 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term268777 = ((Class) term268778).getDeclaredField((String) "VALUE_NUMBER_FLOAT");
        ((Field) term268777).setAccessible(true);
        Object enum253 = ((Field) term268777).get((Object) null);
        term267786 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term267892 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term268002 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(term268002, term268002.getClass(), "_currToken", enum253);
        setField(term267892, term267892.getClass(), "delegate", term268002);
        setField(term267786, term267786.getClass(), "delegate", term267892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term267786;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term267632, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


