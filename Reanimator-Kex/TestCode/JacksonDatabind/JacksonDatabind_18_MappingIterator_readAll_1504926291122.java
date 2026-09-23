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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73276;

    public MappingIterator_readAll_1504926291122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74663 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term74662 = ((Class) term74663).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term74662).setAccessible(true);
        Object enum47 = ((Field) term74662).get((Object) null);
        term73276 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term73396 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term73646 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term73794 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term73396, term73396.getClass(), "_currToken", enum47);
        setField(term73276, term73276.getClass(), "_parser", term73396);
        setBooleanField(term73276, term73276.getClass(), "_hasNextChecked", false);
        setField(term73276, term73276.getClass(), "_updatedValue", null);
        setField(term73276, term73276.getClass(), "_deserializer", term73646);
        setField(term73276, term73276.getClass(), "_context", term73794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term73276, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


