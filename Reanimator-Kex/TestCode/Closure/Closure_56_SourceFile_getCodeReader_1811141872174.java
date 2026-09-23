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

public class SourceFile_getCodeReader_1811141872174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32060;
     Object term32282;

    public SourceFile_getCodeReader_1811141872174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32060 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term32060, term32060.getClass(), "code", "");
        term32282 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term32282, term32282.getClass(), "file", null);
        setField(term32282, term32282.getClass(), "inputCharset", null);
        setField(term32282, term32282.getClass(), "fileName", null);
        setBooleanField(term32282, term32282.getClass(), "isExternFile", false);
        setField(term32282, term32282.getClass(), "originalPath", null);
        setField(term32282, term32282.getClass(), "lineOffsets", null);
        setIntField(term32282, term32282.getClass(), "lastOffset", 0);
        setIntField(term32282, term32282.getClass(), "lastLine", 0);
        setField(term32282, term32282.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCodeReader", argTypes, term32060, args);
        assertTrue(recursiveEquals(term32060, term32282));
    }

};


