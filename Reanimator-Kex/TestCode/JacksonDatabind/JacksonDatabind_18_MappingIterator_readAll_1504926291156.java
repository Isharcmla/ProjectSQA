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

public class MappingIterator_readAll_1504926291156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104754;

    public MappingIterator_readAll_1504926291156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106365 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term106364 = ((Class) term106365).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term106364).setAccessible(true);
        Object enum65 = ((Field) term106364).get((Object) null);
        term104754 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term104874 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term105060 = newInstance(Class.forName("java.util.stream.IntPipeline$3$1"));
        Object term105222 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$LongDeser"));
        setField(term104874, term104874.getClass(), "_currToken", enum65);
        setField(term104754, term104754.getClass(), "_parser", term104874);
        setBooleanField(term104754, term104754.getClass(), "_hasNextChecked", false);
        setField(term104754, term104754.getClass(), "_updatedValue", term105060);
        setField(term104754, term104754.getClass(), "_deserializer", term105222);
        setField(term104754, term104754.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term104754, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


