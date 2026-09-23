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

public class SourceFile_findLineOffsets_36130756667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9306;
     Object term9611;

    public SourceFile_findLineOffsets_36130756667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9306 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term9199 = (int[]) newIntArray(0);
        setField(term9306, term9306.getClass(), "code", "");
        setField(term9306, term9306.getClass(), "lineOffsets", term9199);
        term9611 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term9612 = (int[]) newIntArray(1);
        setField(term9611, term9611.getClass(), "fileName", null);
        setBooleanField(term9611, term9611.getClass(), "isExternFile", false);
        setField(term9611, term9611.getClass(), "originalPath", null);
        setField(term9611, term9611.getClass(), "lineOffsets", term9612);
        setIntField(term9611, term9611.getClass(), "lastOffset", 0);
        setIntField(term9611, term9611.getClass(), "lastLine", 0);
        setField(term9611, term9611.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLineOffsets", argTypes, term9306, args);
        assertTrue(recursiveEquals(term9306, term9611));
    }

};


