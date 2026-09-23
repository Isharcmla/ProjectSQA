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

public class SourceMapConsumerV3_getOriginalMappingForEntry_50149137445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12711;
     Object term12845;
     Object term14659;
     Object term14660;

    public SourceMapConsumerV3_getOriginalMappingForEntry_50149137445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12711 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        term12845 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry"));
        term14659 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        setField(term14659, term14659.getClass(), "sources", null);
        setField(term14659, term14659.getClass(), "names", null);
        setIntField(term14659, term14659.getClass(), "lineCount", 0);
        setField(term14659, term14659.getClass(), "lines", null);
        setField(term14659, term14659.getClass(), "reverseSourceMapping", null);
        term14660 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry"));
        setIntField(term14660, term14660.getClass(), "column", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3$Entry");
        Object[] args = new Object[1];
        args[0] = term12845;
        Object retValue = callMethod(klass, "getOriginalMappingForEntry", argTypes, term12711, args);
        assertTrue(recursiveEquals(term12711, term14659));
        assertTrue(recursiveEquals(term12845, term14660));
        assertTrue(recursiveEquals(retValue, null));
    }

};


