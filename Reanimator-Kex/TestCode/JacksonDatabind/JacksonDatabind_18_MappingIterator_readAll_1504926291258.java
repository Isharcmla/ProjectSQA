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

public class MappingIterator_readAll_1504926291258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222422;

    public MappingIterator_readAll_1504926291258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term223955 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term223954 = ((Class) term223955).getDeclaredField((String) "END_OBJECT");
        ((Field) term223954).setAccessible(true);
        Object enum136 = ((Field) term223954).get((Object) null);
        term222422 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term222542 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term222728 = newInstance(Class.forName("java.util.ArrayDeque$DeqIterator"));
        Object term222854 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer"));
        setField(term222542, term222542.getClass(), "_currToken", enum136);
        setField(term222422, term222422.getClass(), "_parser", term222542);
        setBooleanField(term222422, term222422.getClass(), "_hasNextChecked", false);
        setField(term222422, term222422.getClass(), "_updatedValue", term222728);
        setField(term222422, term222422.getClass(), "_deserializer", term222854);
        setField(term222422, term222422.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term222422, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


