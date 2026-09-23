package com.google.debugging.sourcemap;

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
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.debugging.sourcemap.EqualityUtils.*;

public class SourceMapConsumerV3_init_23298119216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2977;

    public SourceMapConsumerV3_init_23298119216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2977 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        setField(term2977, term2977.getClass(), "sources", null);
        setField(term2977, term2977.getClass(), "names", null);
        setIntField(term2977, term2977.getClass(), "lineCount", 0);
        setField(term2977, term2977.getClass(), "lines", null);
        setField(term2977, term2977.getClass(), "reverseSourceMapping", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2977));
    }

};


