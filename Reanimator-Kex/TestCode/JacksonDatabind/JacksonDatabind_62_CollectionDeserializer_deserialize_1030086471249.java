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

public class CollectionDeserializer_deserialize_1030086471249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214447;
     Object term214715;

    public CollectionDeserializer_deserialize_1030086471249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term214495 = new Boolean(false);
        term214447 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        Object term214609 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term214447, term214447.getClass(), "_unwrapSingle", term214495);
        setField(term214447, term214447.getClass(), "_collectionType", term214609);
        Class<? extends Object> term215731 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term215730 = ((Class) term215731).getDeclaredField((String) "VALUE_FALSE");
        ((Field) term215730).setAccessible(true);
        Object enum199 = ((Field) term215730).get((Object) null);
        term214715 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term214821 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term214933 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term214933, term214933.getClass(), "_currToken", enum199);
        setField(term214821, term214821.getClass(), "delegate", term214933);
        setField(term214715, term214715.getClass(), "delegate", term214821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term214715;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term214447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


