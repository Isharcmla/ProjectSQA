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

public class SourceFile_getNumLines_1744244282354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61232;
     Object term61442;

    public SourceFile_getNumLines_1744244282354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61232 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term61232, term61232.getClass(), "lineOffsets", null);
        setField(term61232, term61232.getClass(), "code", "");
        term61442 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        int[] term61443 = (int[]) newIntArray(1);
        setField(term61442, term61442.getClass(), "generator", null);
        setField(term61442, term61442.getClass(), "fileName", null);
        setBooleanField(term61442, term61442.getClass(), "isExternFile", false);
        setField(term61442, term61442.getClass(), "originalPath", null);
        setField(term61442, term61442.getClass(), "lineOffsets", term61443);
        setIntField(term61442, term61442.getClass(), "lastOffset", 0);
        setIntField(term61442, term61442.getClass(), "lastLine", 0);
        setField(term61442, term61442.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumLines", argTypes, term61232, args);
        assertTrue(recursiveEquals(term61232, term61442));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


