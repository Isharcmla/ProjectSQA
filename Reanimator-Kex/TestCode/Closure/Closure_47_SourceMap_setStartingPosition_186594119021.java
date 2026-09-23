package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class SourceMap_setStartingPosition_186594119021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2174;
     Object term2311;

    public SourceMap_setStartingPosition_186594119021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2174 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term2282 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        setField(term2174, term2174.getClass(), "generator", term2282);
        term2311 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term2312 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV1"));
        Object term2313 = newInstance(Class.forName("com.google.debugging.sourcemap.FilePosition"));
        setField(term2312, term2312.getClass(), "mappings", null);
        setField(term2312, term2312.getClass(), "lastMapping", null);
        setIntField(term2313, term2313.getClass(), "line", 0);
        setIntField(term2313, term2313.getClass(), "column", 0);
        setField(term2312, term2312.getClass(), "offsetPosition", term2313);
        setField(term2312, term2312.getClass(), "prefixPosition", null);
        setField(term2311, term2311.getClass(), "generator", term2312);
        setField(term2311, term2311.getClass(), "prefixMappings", null);
        setField(term2311, term2311.getClass(), "sourceLocationFixupCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0;
        callMethod(klass, "setStartingPosition", argTypes, term2174, args);
        assertTrue(recursiveEquals(term2174, term2311));
    }

};


