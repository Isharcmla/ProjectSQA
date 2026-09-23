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
import java.lang.String;
import java.lang.Object;

public class CollectionDeserializer_deserialize_1030086471101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45461;
     Object term45621;

    public CollectionDeserializer_deserialize_1030086471101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term45509 = new Boolean(false);
        term45461 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term45461, term45461.getClass(), "_unwrapSingle", term45509);
        Class<? extends Object> term46296 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term46295 = ((Class) term46296).getDeclaredField((String) "VALUE_NUMBER_FLOAT");
        ((Field) term46295).setAccessible(true);
        Object enum34 = ((Field) term46295).get((Object) null);
        term45621 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term45621, term45621.getClass(), "_currToken", enum34);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term45621;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term45461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


