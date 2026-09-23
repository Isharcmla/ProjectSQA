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

public class SourceFile_getCodeReader_1811141872201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34310;
     Object term36469;
     Object term36463;

    public SourceFile_getCodeReader_1811141872201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34310 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term34310, term34310.getClass(), "code", "");
        term36469 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term36469, term36469.getClass(), "generator", null);
        setField(term36469, term36469.getClass(), "fileName", null);
        setBooleanField(term36469, term36469.getClass(), "isExternFile", false);
        setField(term36469, term36469.getClass(), "originalPath", null);
        setField(term36469, term36469.getClass(), "lineOffsets", null);
        setIntField(term36469, term36469.getClass(), "lastOffset", 0);
        setIntField(term36469, term36469.getClass(), "lastLine", 0);
        setField(term36469, term36469.getClass(), "code", "");
        term36463 = newInstance(Class.forName("java.io.StringReader"));
        setField(term36463, term36463.getClass(), "str", "");
        setIntField(term36463, term36463.getClass(), "length", 0);
        setIntField(term36463, term36463.getClass(), "next", 0);
        setIntField(term36463, term36463.getClass(), "mark", 0);
        setField(term36463, term36463.getClass(), "lock", term36463);
        setField(term36463, term36463.getClass(), "skipBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCodeReader", argTypes, term34310, args);
        assertTrue(recursiveEquals(term34310, term36469));
        assertTrue(recursiveEquals(retValue, term36463));
    }

};


