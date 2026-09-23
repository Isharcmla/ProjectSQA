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

public class MappingIterator_readAll_1504926291204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159653;

    public MappingIterator_readAll_1504926291204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term161124 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term161123 = ((Class) term161124).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term161123).setAccessible(true);
        Object enum92 = ((Field) term161123).get((Object) null);
        term159653 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term159773 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term160047 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        setField(term159773, term159773.getClass(), "_currToken", enum92);
        setField(term159653, term159653.getClass(), "_parser", term159773);
        setBooleanField(term159653, term159653.getClass(), "_hasNextChecked", false);
        setField(term159653, term159653.getClass(), "_updatedValue", "START_ARRAY");
        setField(term159653, term159653.getClass(), "_deserializer", term160047);
        setField(term159653, term159653.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term159653, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


