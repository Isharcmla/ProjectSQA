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
import java.lang.String;
import java.lang.Object;

public class StringCollectionDeserializer_deserialize_206844653863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23759;
     Object term23871;
     Object term24135;

    public StringCollectionDeserializer_deserialize_206844653863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23759 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        setField(term23759, term23759.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term24710 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term24709 = ((Class) term24710).getDeclaredField((String) "END_OBJECT");
        ((Field) term24709).setAccessible(true);
        Object enum10 = ((Field) term24709).get((Object) null);
        term23871 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(term23871, term23871.getClass(), "_currToken", enum10);
        term24135 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term23871;
        args[1] = term24135;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term23759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


