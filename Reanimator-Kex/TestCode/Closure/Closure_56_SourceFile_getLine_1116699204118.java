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

public class SourceFile_getLine_1116699204118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16799;
     Object term17206;

    public SourceFile_getLine_1116699204118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16799 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term16799, term16799.getClass(), "code", "");
        setIntField(term16799, term16799.getClass(), "lastLine", 1073741825);
        term17206 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term17206, term17206.getClass(), "fileName", null);
        setBooleanField(term17206, term17206.getClass(), "isExternFile", false);
        setField(term17206, term17206.getClass(), "originalPath", null);
        setField(term17206, term17206.getClass(), "lineOffsets", null);
        setIntField(term17206, term17206.getClass(), "lastOffset", 0);
        setIntField(term17206, term17206.getClass(), "lastLine", 1073741825);
        setField(term17206, term17206.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1073741824;
        Object retValue = callMethod(klass, "getLine", argTypes, term16799, args);
        assertTrue(recursiveEquals(term16799, term17206));
        assertTrue(recursiveEquals(retValue, null));
    }

};


