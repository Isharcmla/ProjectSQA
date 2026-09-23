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

public class CollectionDeserializer_deserialize_1030086471231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188305;
     Object term188459;

    public CollectionDeserializer_deserialize_1030086471231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term188353 = new Boolean(false);
        term188305 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term188305, term188305.getClass(), "_unwrapSingle", term188353);
        Class<? extends Object> term189453 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term189452 = ((Class) term189453).getDeclaredField((String) "VALUE_NUMBER_FLOAT");
        ((Field) term189452).setAccessible(true);
        Object enum172 = ((Field) term189452).get((Object) null);
        term188459 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term188565 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term188677 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term188677, term188677.getClass(), "_currToken", enum172);
        setField(term188565, term188565.getClass(), "delegate", term188677);
        setField(term188459, term188459.getClass(), "delegate", term188565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term188459;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term188305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


