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

public class SourceFile_getRegion_646145336287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47442;
     Object term50775;

    public SourceFile_getRegion_646145336287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47442 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term47442, term47442.getClass(), "code", "");
        term50775 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term50775, term50775.getClass(), "generator", null);
        setField(term50775, term50775.getClass(), "fileName", null);
        setBooleanField(term50775, term50775.getClass(), "isExternFile", false);
        setField(term50775, term50775.getClass(), "originalPath", null);
        setField(term50775, term50775.getClass(), "lineOffsets", null);
        setIntField(term50775, term50775.getClass(), "lastOffset", 0);
        setIntField(term50775, term50775.getClass(), "lastLine", 0);
        setField(term50775, term50775.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "getRegion", argTypes, term47442, args);
        assertTrue(recursiveEquals(term47442, term50775));
        assertTrue(recursiveEquals(retValue, null));
    }

};


