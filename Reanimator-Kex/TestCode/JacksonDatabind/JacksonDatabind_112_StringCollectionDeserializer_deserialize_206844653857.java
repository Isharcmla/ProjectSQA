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

public class StringCollectionDeserializer_deserialize_206844653857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16732;
     Object term16992;

    public StringCollectionDeserializer_deserialize_206844653857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term16780 = new Boolean(false);
        term16732 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object term16880 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term16732, term16732.getClass(), "_unwrapSingle", term16780);
        setField(term16732, term16732.getClass(), "_containerType", term16880);
        Class<? extends Object> term19036 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term19035 = ((Class) term19036).getDeclaredField((String) "VALUE_EMBEDDED_OBJECT");
        ((Field) term19035).setAccessible(true);
        Object enum7 = ((Field) term19035).get((Object) null);
        term16992 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term16992, term16992.getClass(), "_currToken", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term16992;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term16732, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


