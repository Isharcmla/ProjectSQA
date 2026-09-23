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

public class SourceMap_setWrapperPrefix_80753460919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2435;
     Object term2628;

    public SourceMap_setWrapperPrefix_80753460919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2435 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        term2628 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term2629 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term2628, term2628.getClass(), "mappings", null);
        setField(term2628, term2628.getClass(), "offsetPosition", null);
        setIntField(term2629, term2629.getClass(), "lineNumber", 0);
        setIntField(term2629, term2629.getClass(), "characterIndex", 30);
        setField(term2628, term2628.getClass(), "prefixPosition", term2629);
        setField(term2628, term2628.getClass(), "lastSourceFile", null);
        setField(term2628, term2628.getClass(), "lastSourceFileEscaped", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                              ";
        callMethod(klass, "setWrapperPrefix", argTypes, term2435, args);
        assertTrue(recursiveEquals(term2435, term2628));
    }

};


