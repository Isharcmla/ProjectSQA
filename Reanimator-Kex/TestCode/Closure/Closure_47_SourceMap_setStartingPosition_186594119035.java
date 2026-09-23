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

public class SourceMap_setStartingPosition_186594119035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8365;
     Object term8804;

    public SourceMap_setStartingPosition_186594119035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8365 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term8473 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(term8365, term8365.getClass(), "generator", term8473);
        term8804 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term8805 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        Object term8806 = newInstance(Class.forName("com.google.debugging.sourcemap.FilePosition"));
        setField(term8805, term8805.getClass(), "mappings", null);
        setField(term8805, term8805.getClass(), "sourceFileMap", null);
        setField(term8805, term8805.getClass(), "originalNameMap", null);
        setField(term8805, term8805.getClass(), "lastSourceFile", null);
        setIntField(term8805, term8805.getClass(), "lastSourceFileIndex", 0);
        setField(term8805, term8805.getClass(), "lastMapping", null);
        setIntField(term8806, term8806.getClass(), "line", 0);
        setIntField(term8806, term8806.getClass(), "column", 0);
        setField(term8805, term8805.getClass(), "offsetPosition", term8806);
        setField(term8805, term8805.getClass(), "prefixPosition", null);
        setField(term8804, term8804.getClass(), "generator", term8805);
        setField(term8804, term8804.getClass(), "prefixMappings", null);
        setField(term8804, term8804.getClass(), "sourceLocationFixupCache", null);
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
        callMethod(klass, "setStartingPosition", argTypes, term8365, args);
        assertTrue(recursiveEquals(term8365, term8804));
    }

};


