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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SourceFile_getNumLines_1744244282342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59341;

    public SourceFile_getNumLines_1744244282342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59341 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term59445 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term59341, term59341.getClass(), "lineOffsets", null);
        setField(term59341, term59341.getClass(), "referenced", term59445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNumLines", argTypes, term59341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


