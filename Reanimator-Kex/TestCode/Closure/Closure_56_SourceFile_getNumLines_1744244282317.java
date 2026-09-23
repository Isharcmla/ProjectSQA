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

public class SourceFile_getNumLines_1744244282317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55121;
     Object term55191;

    public SourceFile_getNumLines_1744244282317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55121 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term55121, term55121.getClass(), "lineOffsets", null);
        setField(term55121, term55121.getClass(), "code", "");
        term55191 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        int[] term55192 = (int[]) newIntArray(1);
        setField(term55191, term55191.getClass(), "fileName", null);
        setBooleanField(term55191, term55191.getClass(), "isExternFile", false);
        setField(term55191, term55191.getClass(), "originalPath", null);
        setField(term55191, term55191.getClass(), "lineOffsets", term55192);
        setIntField(term55191, term55191.getClass(), "lastOffset", 0);
        setIntField(term55191, term55191.getClass(), "lastLine", 0);
        setField(term55191, term55191.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumLines", argTypes, term55121, args);
        assertTrue(recursiveEquals(term55121, term55191));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


