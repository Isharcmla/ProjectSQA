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

public class SourceFile_getLine_1116699204240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42184;
     Object term42403;

    public SourceFile_getLine_1116699204240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42184 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term42184, term42184.getClass(), "code", "");
        setIntField(term42184, term42184.getClass(), "lastLine", 2147483647);
        term42403 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term42403, term42403.getClass(), "generator", null);
        setField(term42403, term42403.getClass(), "fileName", null);
        setBooleanField(term42403, term42403.getClass(), "isExternFile", false);
        setField(term42403, term42403.getClass(), "originalPath", null);
        setField(term42403, term42403.getClass(), "lineOffsets", null);
        setIntField(term42403, term42403.getClass(), "lastOffset", 0);
        setIntField(term42403, term42403.getClass(), "lastLine", 2147483647);
        setField(term42403, term42403.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483646;
        Object retValue = callMethod(klass, "getLine", argTypes, term42184, args);
        assertTrue(recursiveEquals(term42184, term42403));
        assertTrue(recursiveEquals(retValue, null));
    }

};


