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

public class MappingIterator_readAll_1504926291118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69163;

    public MappingIterator_readAll_1504926291118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70350 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term70349 = ((Class) term70350).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term70349).setAccessible(true);
        Object enum44 = ((Field) term70349).get((Object) null);
        term69163 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term69283 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term69533 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        setField(term69283, term69283.getClass(), "_currToken", enum44);
        setField(term69163, term69163.getClass(), "_parser", term69283);
        setBooleanField(term69163, term69163.getClass(), "_hasNextChecked", false);
        setField(term69163, term69163.getClass(), "_updatedValue", null);
        setField(term69163, term69163.getClass(), "_deserializer", term69533);
        setField(term69163, term69163.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term69163, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


