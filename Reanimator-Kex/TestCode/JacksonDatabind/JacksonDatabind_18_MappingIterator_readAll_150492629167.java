package com.fasterxml.jackson.databind;

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
import java.lang.UnsupportedOperationException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_150492629167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28248;

    public MappingIterator_readAll_150492629167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30595 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term30594 = ((Class) term30595).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term30594).setAccessible(true);
        Object enum13 = ((Field) term30594).get((Object) null);
        term28248 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term28368 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term28684 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$LongDeser"));
        setField(term28368, term28368.getClass(), "_currToken", enum13);
        setField(term28248, term28248.getClass(), "_parser", term28368);
        setBooleanField(term28248, term28248.getClass(), "_hasNextChecked", false);
        setField(term28248, term28248.getClass(), "_updatedValue", "");
        setField(term28248, term28248.getClass(), "_deserializer", term28684);
        setField(term28248, term28248.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term28248, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


