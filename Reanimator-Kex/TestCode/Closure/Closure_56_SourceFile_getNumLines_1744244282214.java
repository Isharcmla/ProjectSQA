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

public class SourceFile_getNumLines_1744244282214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37381;
     Object term37885;

    public SourceFile_getNumLines_1744244282214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37381 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term37381, term37381.getClass(), "lineOffsets", null);
        setField(term37381, term37381.getClass(), "code", "");
        term37885 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        int[] term37886 = (int[]) newIntArray(1);
        setField(term37885, term37885.getClass(), "generator", null);
        setField(term37885, term37885.getClass(), "fileName", null);
        setBooleanField(term37885, term37885.getClass(), "isExternFile", false);
        setField(term37885, term37885.getClass(), "originalPath", null);
        setField(term37885, term37885.getClass(), "lineOffsets", term37886);
        setIntField(term37885, term37885.getClass(), "lastOffset", 0);
        setIntField(term37885, term37885.getClass(), "lastLine", 0);
        setField(term37885, term37885.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumLines", argTypes, term37381, args);
        assertTrue(recursiveEquals(term37381, term37885));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


