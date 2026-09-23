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

public class SourceFile_findLineOffsets_361307566181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32848;
     Object term33166;

    public SourceFile_findLineOffsets_361307566181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32848 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term32848, term32848.getClass(), "code", "");
        term33166 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        int[] term33167 = (int[]) newIntArray(1);
        setField(term33166, term33166.getClass(), "file", null);
        setField(term33166, term33166.getClass(), "inputCharset", null);
        setField(term33166, term33166.getClass(), "fileName", null);
        setBooleanField(term33166, term33166.getClass(), "isExternFile", false);
        setField(term33166, term33166.getClass(), "originalPath", null);
        setField(term33166, term33166.getClass(), "lineOffsets", term33167);
        setIntField(term33166, term33166.getClass(), "lastOffset", 0);
        setIntField(term33166, term33166.getClass(), "lastLine", 0);
        setField(term33166, term33166.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLineOffsets", argTypes, term32848, args);
        assertTrue(recursiveEquals(term32848, term33166));
    }

};


