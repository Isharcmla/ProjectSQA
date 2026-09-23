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

public class SourceFile_getNumLines_1744244282175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32217;
     Object term32298;

    public SourceFile_getNumLines_1744244282175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32217 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term32217, term32217.getClass(), "lineOffsets", null);
        setField(term32217, term32217.getClass(), "code", "");
        term32298 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term32299 = (int[]) newIntArray(1);
        setField(term32298, term32298.getClass(), "fileName", null);
        setBooleanField(term32298, term32298.getClass(), "isExternFile", false);
        setField(term32298, term32298.getClass(), "originalPath", null);
        setField(term32298, term32298.getClass(), "lineOffsets", term32299);
        setIntField(term32298, term32298.getClass(), "lastOffset", 0);
        setIntField(term32298, term32298.getClass(), "lastLine", 0);
        setField(term32298, term32298.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumLines", argTypes, term32217, args);
        assertTrue(recursiveEquals(term32217, term32298));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


