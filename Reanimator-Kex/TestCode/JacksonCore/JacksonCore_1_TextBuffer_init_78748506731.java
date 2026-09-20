package com.fasterxml.jackson.core.util;

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
import static com.fasterxml.jackson.core.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.util.EqualityUtils.*;

public class TextBuffer_init_78748506731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;

    public TextBuffer_init_78748506731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term106, term106.getClass(), "_allocator", null);
        setField(term106, term106.getClass(), "_inputBuffer", null);
        setIntField(term106, term106.getClass(), "_inputStart", 0);
        setIntField(term106, term106.getClass(), "_inputLen", 0);
        setField(term106, term106.getClass(), "_segments", null);
        setBooleanField(term106, term106.getClass(), "_hasSegments", false);
        setIntField(term106, term106.getClass(), "_segmentSize", 0);
        setField(term106, term106.getClass(), "_currentSegment", null);
        setIntField(term106, term106.getClass(), "_currentSize", 0);
        setField(term106, term106.getClass(), "_resultString", null);
        setField(term106, term106.getClass(), "_resultArray", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.TextBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term106));
    }

};
