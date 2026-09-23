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

public class SourceFile_findLineOffsets_361307566206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35056;
     Object term37085;

    public SourceFile_findLineOffsets_361307566206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35056 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term35056, term35056.getClass(), "code", "");
        term37085 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        int[] term37086 = (int[]) newIntArray(1);
        setField(term37085, term37085.getClass(), "fileName", null);
        setBooleanField(term37085, term37085.getClass(), "isExternFile", false);
        setField(term37085, term37085.getClass(), "originalPath", null);
        setField(term37085, term37085.getClass(), "lineOffsets", term37086);
        setIntField(term37085, term37085.getClass(), "lastOffset", 0);
        setIntField(term37085, term37085.getClass(), "lastLine", 0);
        setField(term37085, term37085.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLineOffsets", argTypes, term35056, args);
        assertTrue(recursiveEquals(term35056, term37085));
    }

};


