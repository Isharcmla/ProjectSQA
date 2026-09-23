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

public class MappingIterator_readAll_1504926291224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181561;

    public MappingIterator_readAll_1504926291224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term182806 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term182805 = ((Class) term182806).getDeclaredField((String) "START_OBJECT");
        ((Field) term182805).setAccessible(true);
        Object enum112 = ((Field) term182805).get((Object) null);
        term181561 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term181681 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term181969 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer"));
        setField(term181681, term181681.getClass(), "_currToken", enum112);
        setField(term181561, term181561.getClass(), "_parser", term181681);
        setBooleanField(term181561, term181561.getClass(), "_hasNextChecked", true);
        setField(term181561, term181561.getClass(), "_updatedValue", null);
        setField(term181561, term181561.getClass(), "_deserializer", term181969);
        setField(term181561, term181561.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term181561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


