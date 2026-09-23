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

public class SourceFile_isExtern_205401298141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021;
     Object term4044;

    public SourceFile_isExtern_205401298141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1021 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term1047 = (int[]) newIntArray(5);
        setField(term1021, term1021.getClass(), "fileName", "aKnKipADSo");
        setBooleanField(term1021, term1021.getClass(), "isExternFile", false);
        setField(term1021, term1021.getClass(), "originalPath", "wSQxaModmm");
        setIntElement(term1047, 0, 1551099402);
        setIntElement(term1047, 1, -2027534003);
        setIntElement(term1047, 2, 1063420942);
        setIntElement(term1047, 3, 1375330971);
        setIntElement(term1047, 4, -478195677);
        setField(term1021, term1021.getClass(), "lineOffsets", term1047);
        setIntField(term1021, term1021.getClass(), "lastOffset", 972867650);
        setIntField(term1021, term1021.getClass(), "lastLine", 1655935355);
        setField(term1021, term1021.getClass(), "code", "UlajhuVLaP");
        term4044 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term4049 = (int[]) newIntArray(5);
        setField(term4044, term4044.getClass(), "fileName", "aKnKipADSo");
        setBooleanField(term4044, term4044.getClass(), "isExternFile", false);
        setField(term4044, term4044.getClass(), "originalPath", "wSQxaModmm");
        setIntElement(term4049, 0, 1551099402);
        setIntElement(term4049, 1, -2027534003);
        setIntElement(term4049, 2, 1063420942);
        setIntElement(term4049, 3, 1375330971);
        setIntElement(term4049, 4, -478195677);
        setField(term4044, term4044.getClass(), "lineOffsets", term4049);
        setIntField(term4044, term4044.getClass(), "lastOffset", 972867650);
        setIntField(term4044, term4044.getClass(), "lastLine", 1655935355);
        setField(term4044, term4044.getClass(), "code", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExtern", argTypes, term1021, args);
        assertTrue(recursiveEquals(term1021, term4044));
    }

};


