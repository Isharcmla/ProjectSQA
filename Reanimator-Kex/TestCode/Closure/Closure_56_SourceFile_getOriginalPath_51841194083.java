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

public class SourceFile_getOriginalPath_51841194083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12576;
     Object term12582;

    public SourceFile_getOriginalPath_51841194083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12576 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term12576, term12576.getClass(), "originalPath", null);
        term12582 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term12582, term12582.getClass(), "fileName", null);
        setBooleanField(term12582, term12582.getClass(), "isExternFile", false);
        setField(term12582, term12582.getClass(), "originalPath", null);
        setField(term12582, term12582.getClass(), "lineOffsets", null);
        setIntField(term12582, term12582.getClass(), "lastOffset", 0);
        setIntField(term12582, term12582.getClass(), "lastLine", 0);
        setField(term12582, term12582.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOriginalPath", argTypes, term12576, args);
        assertTrue(recursiveEquals(term12576, term12582));
        assertTrue(recursiveEquals(retValue, null));
    }

};


