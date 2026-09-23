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

public class SourceFile_getLineOffset_357025610209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36111;
     Object term37143;

    public SourceFile_getLineOffset_357025610209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36111 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term36111, term36111.getClass(), "lineOffsets", null);
        setField(term36111, term36111.getClass(), "code", "");
        term37143 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term37144 = (int[]) newIntArray(1);
        setField(term37143, term37143.getClass(), "fileName", null);
        setBooleanField(term37143, term37143.getClass(), "isExternFile", false);
        setField(term37143, term37143.getClass(), "originalPath", null);
        setField(term37143, term37143.getClass(), "lineOffsets", term37144);
        setIntField(term37143, term37143.getClass(), "lastOffset", 0);
        setIntField(term37143, term37143.getClass(), "lastLine", 0);
        setField(term37143, term37143.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object retValue = callMethod(klass, "getLineOffset", argTypes, term36111, args);
        assertTrue(recursiveEquals(term36111, term37143));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


