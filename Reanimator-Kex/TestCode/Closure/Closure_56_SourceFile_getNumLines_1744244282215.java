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

public class SourceFile_getNumLines_1744244282215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37531;
     Object term37906;

    public SourceFile_getNumLines_1744244282215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37531 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term37531, term37531.getClass(), "lineOffsets", null);
        setField(term37531, term37531.getClass(), "code", "");
        term37906 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        int[] term37907 = (int[]) newIntArray(1);
        setField(term37906, term37906.getClass(), "file", null);
        setField(term37906, term37906.getClass(), "inputCharset", null);
        setField(term37906, term37906.getClass(), "fileName", null);
        setBooleanField(term37906, term37906.getClass(), "isExternFile", false);
        setField(term37906, term37906.getClass(), "originalPath", null);
        setField(term37906, term37906.getClass(), "lineOffsets", term37907);
        setIntField(term37906, term37906.getClass(), "lastOffset", 0);
        setIntField(term37906, term37906.getClass(), "lastLine", 0);
        setField(term37906, term37906.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumLines", argTypes, term37531, args);
        assertTrue(recursiveEquals(term37531, term37906));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


