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

public class SourceFile_getLine_1116699204230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40445;
     Object term40907;

    public SourceFile_getLine_1116699204230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40445 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term40445, term40445.getClass(), "code", "");
        setIntField(term40445, term40445.getClass(), "lastLine", 0);
        setIntField(term40445, term40445.getClass(), "lastOffset", 0);
        term40907 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term40907, term40907.getClass(), "generator", null);
        setField(term40907, term40907.getClass(), "fileName", null);
        setBooleanField(term40907, term40907.getClass(), "isExternFile", false);
        setField(term40907, term40907.getClass(), "originalPath", null);
        setField(term40907, term40907.getClass(), "lineOffsets", null);
        setIntField(term40907, term40907.getClass(), "lastOffset", 0);
        setIntField(term40907, term40907.getClass(), "lastLine", 0);
        setField(term40907, term40907.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getLine", argTypes, term40445, args);
        assertTrue(recursiveEquals(term40445, term40907));
        assertTrue(recursiveEquals(retValue, null));
    }

};


