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

public class SourceFile_getCodeReader_181114187233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341;
     Object term2917;
     Object term2901;

    public SourceFile_getCodeReader_181114187233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term367 = (int[]) newIntArray(1);
        setField(term341, term341.getClass(), "fileName", "LQFpaHEwXR");
        setBooleanField(term341, term341.getClass(), "isExternFile", true);
        setField(term341, term341.getClass(), "originalPath", "oVcInYnLWB");
        setIntElement(term367, 0, 1135664017);
        setField(term341, term341.getClass(), "lineOffsets", term367);
        setIntField(term341, term341.getClass(), "lastOffset", 590364439);
        setIntField(term341, term341.getClass(), "lastLine", 865208305);
        setField(term341, term341.getClass(), "code", "aJlieCFVtF");
        term2917 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term2922 = (int[]) newIntArray(1);
        setField(term2917, term2917.getClass(), "fileName", "LQFpaHEwXR");
        setBooleanField(term2917, term2917.getClass(), "isExternFile", true);
        setField(term2917, term2917.getClass(), "originalPath", "oVcInYnLWB");
        setIntElement(term2922, 0, 1135664017);
        setField(term2917, term2917.getClass(), "lineOffsets", term2922);
        setIntField(term2917, term2917.getClass(), "lastOffset", 590364439);
        setIntField(term2917, term2917.getClass(), "lastLine", 865208305);
        setField(term2917, term2917.getClass(), "code", "aJlieCFVtF");
        term2901 = newInstance(Class.forName("java.io.StringReader"));
        setField(term2901, term2901.getClass(), "str", "aJlieCFVtF");
        setIntField(term2901, term2901.getClass(), "length", 10);
        setIntField(term2901, term2901.getClass(), "next", 0);
        setIntField(term2901, term2901.getClass(), "mark", 0);
        setField(term2901, term2901.getClass(), "lock", term2901);
        setField(term2901, term2901.getClass(), "skipBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCodeReader", argTypes, term341, args);
        assertTrue(recursiveEquals(term341, term2917));
        assertTrue(recursiveEquals(retValue, term2901));
    }

};


