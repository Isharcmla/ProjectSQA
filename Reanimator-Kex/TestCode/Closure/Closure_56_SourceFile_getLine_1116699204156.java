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

public class SourceFile_getLine_1116699204156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29249;
     Object term29398;

    public SourceFile_getLine_1116699204156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29249 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term29249, term29249.getClass(), "code", "");
        setIntField(term29249, term29249.getClass(), "lastLine", -2147483648);
        setIntField(term29249, term29249.getClass(), "lastOffset", 0);
        term29398 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term29398, term29398.getClass(), "fileName", null);
        setBooleanField(term29398, term29398.getClass(), "isExternFile", false);
        setField(term29398, term29398.getClass(), "originalPath", null);
        setField(term29398, term29398.getClass(), "lineOffsets", null);
        setIntField(term29398, term29398.getClass(), "lastOffset", 0);
        setIntField(term29398, term29398.getClass(), "lastLine", -2147483648);
        setField(term29398, term29398.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "getLine", argTypes, term29249, args);
        assertTrue(recursiveEquals(term29249, term29398));
        assertTrue(recursiveEquals(retValue, null));
    }

};


