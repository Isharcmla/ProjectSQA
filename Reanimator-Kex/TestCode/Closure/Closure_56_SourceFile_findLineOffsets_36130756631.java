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

public class SourceFile_findLineOffsets_36130756631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;
     Object term2632;

    public SourceFile_findLineOffsets_36130756631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term211 = (int[]) newIntArray(3);
        setField(term185, term185.getClass(), "fileName", "MjGYSRKTNF");
        setBooleanField(term185, term185.getClass(), "isExternFile", false);
        setField(term185, term185.getClass(), "originalPath", "hRNSzYYIrc");
        setIntElement(term211, 0, 1585847225);
        setIntElement(term211, 1, 597278769);
        setIntElement(term211, 2, -1685132342);
        setField(term185, term185.getClass(), "lineOffsets", term211);
        setIntField(term185, term185.getClass(), "lastOffset", -1456670397);
        setIntField(term185, term185.getClass(), "lastLine", 1622346318);
        setField(term185, term185.getClass(), "code", "RMFIsYGgne");
        term2632 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term2637 = (int[]) newIntArray(1);
        setField(term2632, term2632.getClass(), "fileName", "MjGYSRKTNF");
        setBooleanField(term2632, term2632.getClass(), "isExternFile", false);
        setField(term2632, term2632.getClass(), "originalPath", "hRNSzYYIrc");
        setField(term2632, term2632.getClass(), "lineOffsets", term2637);
        setIntField(term2632, term2632.getClass(), "lastOffset", -1456670397);
        setIntField(term2632, term2632.getClass(), "lastLine", 1622346318);
        setField(term2632, term2632.getClass(), "code", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLineOffsets", argTypes, term185, args);
        assertTrue(recursiveEquals(term185, term2632));
    }

};


