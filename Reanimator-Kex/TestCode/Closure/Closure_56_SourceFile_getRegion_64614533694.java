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

public class SourceFile_getRegion_64614533694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13839;
     Object term13967;

    public SourceFile_getRegion_64614533694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13839 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term13839, term13839.getClass(), "code", "");
        term13967 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term13967, term13967.getClass(), "fileName", null);
        setBooleanField(term13967, term13967.getClass(), "isExternFile", false);
        setField(term13967, term13967.getClass(), "originalPath", null);
        setField(term13967, term13967.getClass(), "lineOffsets", null);
        setIntField(term13967, term13967.getClass(), "lastOffset", 0);
        setIntField(term13967, term13967.getClass(), "lastLine", 0);
        setField(term13967, term13967.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 4;
        Object retValue = callMethod(klass, "getRegion", argTypes, term13839, args);
        assertTrue(recursiveEquals(term13839, term13967));
        assertTrue(recursiveEquals(retValue, null));
    }

};


