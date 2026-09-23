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

public class SourceMap_validate_163485975119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1956;
     Object term2079;

    public SourceMap_validate_163485975119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1956 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term2064 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(term1956, term1956.getClass(), "generator", term2064);
        term2079 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term2080 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapGeneratorV3"));
        setField(term2080, term2080.getClass(), "mappings", null);
        setField(term2080, term2080.getClass(), "sourceFileMap", null);
        setField(term2080, term2080.getClass(), "originalNameMap", null);
        setField(term2080, term2080.getClass(), "lastSourceFile", null);
        setIntField(term2080, term2080.getClass(), "lastSourceFileIndex", 0);
        setField(term2080, term2080.getClass(), "lastMapping", null);
        setField(term2080, term2080.getClass(), "offsetPosition", null);
        setField(term2080, term2080.getClass(), "prefixPosition", null);
        setField(term2079, term2079.getClass(), "generator", term2080);
        setField(term2079, term2079.getClass(), "prefixMappings", null);
        setField(term2079, term2079.getClass(), "sourceLocationFixupCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        callMethod(klass, "validate", argTypes, term1956, args);
        assertTrue(recursiveEquals(term1956, term2079));
    }

};


