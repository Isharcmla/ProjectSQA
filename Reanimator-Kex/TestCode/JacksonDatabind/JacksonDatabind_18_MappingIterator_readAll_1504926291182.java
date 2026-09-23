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

public class MappingIterator_readAll_1504926291182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134918;

    public MappingIterator_readAll_1504926291182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term136599 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term136598 = ((Class) term136599).getDeclaredField((String) "VALUE_NUMBER_INT");
        ((Field) term136598).setAccessible(true);
        Object enum83 = ((Field) term136598).get((Object) null);
        term134918 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term135038 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term135258 = newInstance(Class.forName("java.util.stream.Streams$ConcatSpliterator$OfLong"));
        Object term135420 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$LongDeser"));
        setField(term135038, term135038.getClass(), "_currToken", enum83);
        setField(term134918, term134918.getClass(), "_parser", term135038);
        setBooleanField(term134918, term134918.getClass(), "_hasNextChecked", false);
        setField(term134918, term134918.getClass(), "_updatedValue", term135258);
        setField(term134918, term134918.getClass(), "_deserializer", term135420);
        setField(term134918, term134918.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term134918, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


