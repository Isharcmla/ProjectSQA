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

public class MappingIterator_readAll_1504926291248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212133;

    public MappingIterator_readAll_1504926291248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213592 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term213591 = ((Class) term213592).getDeclaredField((String) "NANOSECONDS");
        ((Field) term213591).setAccessible(true);
        Object enum130 = ((Field) term213591).get((Object) null);
        term212133 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term212245 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term212429 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(term212133, term212133.getClass(), "_parser", term212245);
        setBooleanField(term212133, term212133.getClass(), "_hasNextChecked", true);
        setField(term212133, term212133.getClass(), "_updatedValue", enum130);
        setField(term212133, term212133.getClass(), "_deserializer", term212429);
        setField(term212133, term212133.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term212133, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


