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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MappingIterator_readAll_1504926291194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149536;

    public MappingIterator_readAll_1504926291194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149536 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term149656 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term149768 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$ForwardingNode"));
        Object term149896 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        setField(term149536, term149536.getClass(), "_parser", term149656);
        setBooleanField(term149536, term149536.getClass(), "_hasNextChecked", true);
        setField(term149536, term149536.getClass(), "_updatedValue", term149768);
        setField(term149536, term149536.getClass(), "_deserializer", term149896);
        setField(term149536, term149536.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term149536, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


