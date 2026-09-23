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

public class SourceFile_getLine_111669920460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7909;
     Object term8134;

    public SourceFile_getLine_111669920460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7909 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term7909, term7909.getClass(), "code", "");
        setIntField(term7909, term7909.getClass(), "lastLine", 2147483647);
        term8134 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term8134, term8134.getClass(), "fileName", null);
        setBooleanField(term8134, term8134.getClass(), "isExternFile", false);
        setField(term8134, term8134.getClass(), "originalPath", null);
        setField(term8134, term8134.getClass(), "lineOffsets", null);
        setIntField(term8134, term8134.getClass(), "lastOffset", 0);
        setIntField(term8134, term8134.getClass(), "lastLine", 2147483647);
        setField(term8134, term8134.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "getLine", argTypes, term7909, args);
        assertTrue(recursiveEquals(term7909, term8134));
        assertTrue(recursiveEquals(retValue, null));
    }

};


