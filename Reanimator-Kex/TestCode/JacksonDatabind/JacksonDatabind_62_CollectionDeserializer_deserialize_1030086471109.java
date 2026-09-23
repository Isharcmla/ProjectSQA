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

public class CollectionDeserializer_deserialize_1030086471109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53549;
     Object term53655;
     Object term54039;

    public CollectionDeserializer_deserialize_1030086471109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53549 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(term53549, term53549.getClass(), "_unwrapSingle", null);
        Class<? extends Object> term54671 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term54670 = ((Class) term54671).getDeclaredField((String) "VALUE_EMBEDDED_OBJECT");
        ((Field) term54670).setAccessible(true);
        Object enum43 = ((Field) term54670).get((Object) null);
        term53655 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term53775 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term53775, term53775.getClass(), "_currToken", enum43);
        setField(term53655, term53655.getClass(), "delegate", term53775);
        term54039 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = term53655;
        args[1] = term54039;
        args[2] = null;
        try {
            callMethod(klass, "deserialize", argTypes, term53549, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


