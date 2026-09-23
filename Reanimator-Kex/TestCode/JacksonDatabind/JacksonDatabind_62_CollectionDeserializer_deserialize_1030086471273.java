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

public class CollectionDeserializer_deserialize_1030086471273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245447;
     Object term245601;

    public CollectionDeserializer_deserialize_1030086471273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term245495 = new Boolean(true);
        term245447 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        setField(term245447, term245447.getClass(), "_unwrapSingle", term245495);
        Class<? extends Object> term246443 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term246442 = ((Class) term246443).getDeclaredField((String) "VALUE_TRUE");
        ((Field) term246442).setAccessible(true);
        Object enum229 = ((Field) term246442).get((Object) null);
        term245601 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term245713 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term245713, term245713.getClass(), "_currToken", enum229);
        setField(term245601, term245601.getClass(), "delegate", term245713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term245601;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term245447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


