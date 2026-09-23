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

public class CollectionDeserializer_deserialize_1030086471177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120958;
     Object term121118;

    public CollectionDeserializer_deserialize_1030086471177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term121006 = new Boolean(false);
        term120958 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        setField(term120958, term120958.getClass(), "_unwrapSingle", term121006);
        Class<? extends Object> term121763 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term121762 = ((Class) term121763).getDeclaredField((String) "FIELD_NAME");
        ((Field) term121762).setAccessible(true);
        Object enum109 = ((Field) term121762).get((Object) null);
        term121118 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term121118, term121118.getClass(), "_currToken", enum109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term121118;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term120958, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


