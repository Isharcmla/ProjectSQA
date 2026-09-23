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

public class SourceFile_getLine_1116699204349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60302;
     Object term60613;

    public SourceFile_getLine_1116699204349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60302 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term60302, term60302.getClass(), "code", "");
        setIntField(term60302, term60302.getClass(), "lastLine", 0);
        setIntField(term60302, term60302.getClass(), "lastOffset", 0);
        term60613 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term60613, term60613.getClass(), "file", null);
        setField(term60613, term60613.getClass(), "inputCharset", null);
        setField(term60613, term60613.getClass(), "fileName", null);
        setBooleanField(term60613, term60613.getClass(), "isExternFile", false);
        setField(term60613, term60613.getClass(), "originalPath", null);
        setField(term60613, term60613.getClass(), "lineOffsets", null);
        setIntField(term60613, term60613.getClass(), "lastOffset", 0);
        setIntField(term60613, term60613.getClass(), "lastLine", 0);
        setField(term60613, term60613.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getLine", argTypes, term60302, args);
        assertTrue(recursiveEquals(term60302, term60613));
        assertTrue(recursiveEquals(retValue, null));
    }

};


