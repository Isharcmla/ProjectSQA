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

public class SourceFile_findLineOffsets_361307566298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49318;
     Object term52633;

    public SourceFile_findLineOffsets_361307566298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49318 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term49318, term49318.getClass(), "code", "");
        setField(term49318, term49318.getClass(), "lineOffsets", null);
        term52633 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        int[] term52634 = (int[]) newIntArray(1);
        setField(term52633, term52633.getClass(), "generator", null);
        setField(term52633, term52633.getClass(), "fileName", null);
        setBooleanField(term52633, term52633.getClass(), "isExternFile", false);
        setField(term52633, term52633.getClass(), "originalPath", null);
        setField(term52633, term52633.getClass(), "lineOffsets", term52634);
        setIntField(term52633, term52633.getClass(), "lastOffset", 0);
        setIntField(term52633, term52633.getClass(), "lastLine", 0);
        setField(term52633, term52633.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLineOffsets", argTypes, term49318, args);
        assertTrue(recursiveEquals(term49318, term52633));
    }

};


