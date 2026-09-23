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

public class SourceFile_getRegion_646145336300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49640;
     Object term53017;

    public SourceFile_getRegion_646145336300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49640 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term49640, term49640.getClass(), "code", "");
        term53017 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term53017, term53017.getClass(), "file", null);
        setField(term53017, term53017.getClass(), "inputCharset", null);
        setField(term53017, term53017.getClass(), "fileName", null);
        setBooleanField(term53017, term53017.getClass(), "isExternFile", false);
        setField(term53017, term53017.getClass(), "originalPath", null);
        setField(term53017, term53017.getClass(), "lineOffsets", null);
        setIntField(term53017, term53017.getClass(), "lastOffset", 0);
        setIntField(term53017, term53017.getClass(), "lastLine", 0);
        setField(term53017, term53017.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "getRegion", argTypes, term49640, args);
        assertTrue(recursiveEquals(term49640, term53017));
        assertTrue(recursiveEquals(retValue, null));
    }

};


