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

public class SourceFile_findLineOffsets_361307566237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41682;
     Object term42059;

    public SourceFile_findLineOffsets_361307566237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41682 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term41682, term41682.getClass(), "code", "");
        setField(term41682, term41682.getClass(), "lineOffsets", null);
        term42059 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        int[] term42060 = (int[]) newIntArray(1);
        setField(term42059, term42059.getClass(), "file", null);
        setField(term42059, term42059.getClass(), "inputCharset", null);
        setField(term42059, term42059.getClass(), "fileName", null);
        setBooleanField(term42059, term42059.getClass(), "isExternFile", false);
        setField(term42059, term42059.getClass(), "originalPath", null);
        setField(term42059, term42059.getClass(), "lineOffsets", term42060);
        setIntField(term42059, term42059.getClass(), "lastOffset", 0);
        setIntField(term42059, term42059.getClass(), "lastLine", 0);
        setField(term42059, term42059.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLineOffsets", argTypes, term41682, args);
        assertTrue(recursiveEquals(term41682, term42059));
    }

};


