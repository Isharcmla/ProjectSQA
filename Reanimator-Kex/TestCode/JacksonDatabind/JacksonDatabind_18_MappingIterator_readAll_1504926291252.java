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

public class MappingIterator_readAll_1504926291252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216805;

    public MappingIterator_readAll_1504926291252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216805 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term216917 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term217029 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$ForwardingNode"));
        Object term217157 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        setField(term216805, term216805.getClass(), "_parser", term216917);
        setBooleanField(term216805, term216805.getClass(), "_hasNextChecked", true);
        setField(term216805, term216805.getClass(), "_updatedValue", term217029);
        setField(term216805, term216805.getClass(), "_deserializer", term217157);
        setField(term216805, term216805.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term216805, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


