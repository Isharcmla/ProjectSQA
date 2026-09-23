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
import java.lang.Object;

public class JsAst_clearAst_91404382019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3491;
     Object term3617;

    public JsAst_clearAst_91404382019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3491 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term3595 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term3491, term3491.getClass(), "root", null);
        setField(term3491, term3491.getClass(), "sourceFile", term3595);
        term3617 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term3618 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term3617, term3617.getClass(), "inputId", null);
        setField(term3618, term3618.getClass(), "generator", null);
        setField(term3618, term3618.getClass(), "fileName", null);
        setBooleanField(term3618, term3618.getClass(), "isExternFile", false);
        setField(term3618, term3618.getClass(), "originalPath", null);
        setField(term3618, term3618.getClass(), "lineOffsets", null);
        setField(term3618, term3618.getClass(), "code", null);
        setField(term3617, term3617.getClass(), "sourceFile", term3618);
        setField(term3617, term3617.getClass(), "fileName", null);
        setField(term3617, term3617.getClass(), "root", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearAst", argTypes, term3491, args);
        assertTrue(recursiveEquals(term3491, term3617));
    }

};


