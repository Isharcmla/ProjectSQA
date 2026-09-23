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

public class SourceFile_getNumLines_1744244282202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34465;
     Object term36485;

    public SourceFile_getNumLines_1744244282202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34465 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term34465, term34465.getClass(), "lineOffsets", null);
        setField(term34465, term34465.getClass(), "code", "");
        term36485 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        int[] term36486 = (int[]) newIntArray(1);
        setField(term36485, term36485.getClass(), "fileName", null);
        setBooleanField(term36485, term36485.getClass(), "isExternFile", false);
        setField(term36485, term36485.getClass(), "originalPath", null);
        setField(term36485, term36485.getClass(), "lineOffsets", term36486);
        setIntField(term36485, term36485.getClass(), "lastOffset", 0);
        setIntField(term36485, term36485.getClass(), "lastLine", 0);
        setField(term36485, term36485.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumLines", argTypes, term34465, args);
        assertTrue(recursiveEquals(term34465, term36485));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


