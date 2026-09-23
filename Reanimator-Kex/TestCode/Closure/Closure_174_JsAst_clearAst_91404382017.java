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

public class JsAst_clearAst_91404382017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3110;
     Object term3601;

    public JsAst_clearAst_91404382017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3110 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term3214 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term3110, term3110.getClass(), "root", null);
        setField(term3110, term3110.getClass(), "sourceFile", term3214);
        term3601 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term3602 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term3601, term3601.getClass(), "inputId", null);
        setField(term3602, term3602.getClass(), "fileName", null);
        setBooleanField(term3602, term3602.getClass(), "isExternFile", false);
        setField(term3602, term3602.getClass(), "originalPath", null);
        setField(term3602, term3602.getClass(), "lineOffsets", null);
        setField(term3602, term3602.getClass(), "code", null);
        setField(term3601, term3601.getClass(), "sourceFile", term3602);
        setField(term3601, term3601.getClass(), "fileName", null);
        setField(term3601, term3601.getClass(), "root", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearAst", argTypes, term3110, args);
        assertTrue(recursiveEquals(term3110, term3601));
    }

};


