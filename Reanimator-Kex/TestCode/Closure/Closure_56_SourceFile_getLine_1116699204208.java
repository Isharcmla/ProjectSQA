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

public class SourceFile_getLine_1116699204208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35355;
     Object term37124;

    public SourceFile_getLine_1116699204208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35355 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term35355, term35355.getClass(), "code", "");
        term37124 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term37124, term37124.getClass(), "file", null);
        setField(term37124, term37124.getClass(), "inputCharset", null);
        setField(term37124, term37124.getClass(), "fileName", null);
        setBooleanField(term37124, term37124.getClass(), "isExternFile", false);
        setField(term37124, term37124.getClass(), "originalPath", null);
        setField(term37124, term37124.getClass(), "lineOffsets", null);
        setIntField(term37124, term37124.getClass(), "lastOffset", 0);
        setIntField(term37124, term37124.getClass(), "lastLine", 0);
        setField(term37124, term37124.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getLine", argTypes, term35355, args);
        assertTrue(recursiveEquals(term35355, term37124));
        assertTrue(recursiveEquals(retValue, null));
    }

};


