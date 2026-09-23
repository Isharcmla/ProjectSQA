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

public class SourceFile_getLine_1116699204113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16255;
     Object term16598;

    public SourceFile_getLine_1116699204113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16255 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term16255, term16255.getClass(), "code", "");
        setIntField(term16255, term16255.getClass(), "lastLine", -1610612737);
        setIntField(term16255, term16255.getClass(), "lastOffset", 0);
        term16598 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term16598, term16598.getClass(), "fileName", null);
        setBooleanField(term16598, term16598.getClass(), "isExternFile", false);
        setField(term16598, term16598.getClass(), "originalPath", null);
        setField(term16598, term16598.getClass(), "lineOffsets", null);
        setIntField(term16598, term16598.getClass(), "lastOffset", 0);
        setIntField(term16598, term16598.getClass(), "lastLine", -1610612737);
        setField(term16598, term16598.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1610612736;
        Object retValue = callMethod(klass, "getLine", argTypes, term16255, args);
        assertTrue(recursiveEquals(term16255, term16598));
        assertTrue(recursiveEquals(retValue, null));
    }

};


