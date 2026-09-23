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

public class SourceFile_getLine_1116699204236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41511;
     Object term42038;

    public SourceFile_getLine_1116699204236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41511 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term41511, term41511.getClass(), "code", "");
        setIntField(term41511, term41511.getClass(), "lastLine", -2147483648);
        setIntField(term41511, term41511.getClass(), "lastOffset", 0);
        term42038 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term42038, term42038.getClass(), "generator", null);
        setField(term42038, term42038.getClass(), "fileName", null);
        setBooleanField(term42038, term42038.getClass(), "isExternFile", false);
        setField(term42038, term42038.getClass(), "originalPath", null);
        setField(term42038, term42038.getClass(), "lineOffsets", null);
        setIntField(term42038, term42038.getClass(), "lastOffset", 0);
        setIntField(term42038, term42038.getClass(), "lastLine", -2147483648);
        setField(term42038, term42038.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "getLine", argTypes, term41511, args);
        assertTrue(recursiveEquals(term41511, term42038));
        assertTrue(recursiveEquals(retValue, null));
    }

};


