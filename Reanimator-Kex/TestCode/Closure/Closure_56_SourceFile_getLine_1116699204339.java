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

public class SourceFile_getLine_1116699204339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58646;
     Object term59238;

    public SourceFile_getLine_1116699204339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58646 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term58646, term58646.getClass(), "code", "");
        setIntField(term58646, term58646.getClass(), "lastLine", -2147483648);
        setIntField(term58646, term58646.getClass(), "lastOffset", 0);
        term59238 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term59238, term59238.getClass(), "file", null);
        setField(term59238, term59238.getClass(), "inputCharset", null);
        setField(term59238, term59238.getClass(), "fileName", null);
        setBooleanField(term59238, term59238.getClass(), "isExternFile", false);
        setField(term59238, term59238.getClass(), "originalPath", null);
        setField(term59238, term59238.getClass(), "lineOffsets", null);
        setIntField(term59238, term59238.getClass(), "lastOffset", 0);
        setIntField(term59238, term59238.getClass(), "lastLine", -2147483648);
        setField(term59238, term59238.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "getLine", argTypes, term58646, args);
        assertTrue(recursiveEquals(term58646, term59238));
        assertTrue(recursiveEquals(retValue, null));
    }

};


