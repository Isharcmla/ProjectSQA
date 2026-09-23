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

public class SourceFile_getLine_1116699204305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53385;
     Object term53758;

    public SourceFile_getLine_1116699204305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53385 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term53385, term53385.getClass(), "code", "");
        setIntField(term53385, term53385.getClass(), "lastLine", 1);
        term53758 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term53758, term53758.getClass(), "generator", null);
        setField(term53758, term53758.getClass(), "fileName", null);
        setBooleanField(term53758, term53758.getClass(), "isExternFile", false);
        setField(term53758, term53758.getClass(), "originalPath", null);
        setField(term53758, term53758.getClass(), "lineOffsets", null);
        setIntField(term53758, term53758.getClass(), "lastOffset", 0);
        setIntField(term53758, term53758.getClass(), "lastLine", 0);
        setField(term53758, term53758.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getLine", argTypes, term53385, args);
        assertTrue(recursiveEquals(term53385, term53758));
        assertTrue(recursiveEquals(retValue, null));
    }

};


