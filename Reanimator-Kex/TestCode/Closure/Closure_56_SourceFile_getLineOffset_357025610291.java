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

public class SourceFile_getLineOffset_357025610291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48104;
     Object term51632;

    public SourceFile_getLineOffset_357025610291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48104 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term48104, term48104.getClass(), "lineOffsets", null);
        setField(term48104, term48104.getClass(), "code", "");
        term51632 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        int[] term51633 = (int[]) newIntArray(1);
        setField(term51632, term51632.getClass(), "generator", null);
        setField(term51632, term51632.getClass(), "fileName", null);
        setBooleanField(term51632, term51632.getClass(), "isExternFile", false);
        setField(term51632, term51632.getClass(), "originalPath", null);
        setField(term51632, term51632.getClass(), "lineOffsets", term51633);
        setIntField(term51632, term51632.getClass(), "lastOffset", 0);
        setIntField(term51632, term51632.getClass(), "lastLine", 0);
        setField(term51632, term51632.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object retValue = callMethod(klass, "getLineOffset", argTypes, term48104, args);
        assertTrue(recursiveEquals(term48104, term51632));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


