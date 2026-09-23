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

public class SourceFile_getLineOffset_357025610286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47274;
     Object term50754;

    public SourceFile_getLineOffset_357025610286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47274 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term47274, term47274.getClass(), "lineOffsets", null);
        setField(term47274, term47274.getClass(), "code", "");
        term50754 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        int[] term50755 = (int[]) newIntArray(1);
        setField(term50754, term50754.getClass(), "file", null);
        setField(term50754, term50754.getClass(), "inputCharset", null);
        setField(term50754, term50754.getClass(), "fileName", null);
        setBooleanField(term50754, term50754.getClass(), "isExternFile", false);
        setField(term50754, term50754.getClass(), "originalPath", null);
        setField(term50754, term50754.getClass(), "lineOffsets", term50755);
        setIntField(term50754, term50754.getClass(), "lastOffset", 0);
        setIntField(term50754, term50754.getClass(), "lastLine", 0);
        setField(term50754, term50754.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object retValue = callMethod(klass, "getLineOffset", argTypes, term47274, args);
        assertTrue(recursiveEquals(term47274, term50754));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


