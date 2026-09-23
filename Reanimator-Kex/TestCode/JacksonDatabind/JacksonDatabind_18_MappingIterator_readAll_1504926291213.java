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

public class MappingIterator_readAll_1504926291213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167901;

    public MappingIterator_readAll_1504926291213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167901 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term167954 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object term168025 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(term167901, term167901.getClass(), "_parser", term167954);
        setBooleanField(term167901, term167901.getClass(), "_hasNextChecked", true);
        setField(term167901, term167901.getClass(), "_updatedValue", term167954);
        setField(term167901, term167901.getClass(), "_deserializer", term168025);
        setField(term167901, term167901.getClass(), "_context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term167901, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


