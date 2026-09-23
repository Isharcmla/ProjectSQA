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

public class MappingIterator_readAll_1504926291242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201222;

    public MappingIterator_readAll_1504926291242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202467 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term202466 = ((Class) term202467).getDeclaredField((String) "VALUE_TRUE");
        ((Field) term202466).setAccessible(true);
        Object enum124 = ((Field) term202466).get((Object) null);
        term201222 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term201342 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term201630 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer"));
        setField(term201342, term201342.getClass(), "_currToken", enum124);
        setField(term201222, term201222.getClass(), "_parser", term201342);
        setBooleanField(term201222, term201222.getClass(), "_hasNextChecked", true);
        setField(term201222, term201222.getClass(), "_updatedValue", null);
        setField(term201222, term201222.getClass(), "_deserializer", term201630);
        setField(term201222, term201222.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term201222, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


