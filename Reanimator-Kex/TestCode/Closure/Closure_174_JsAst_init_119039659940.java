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

public class JsAst_init_119039659940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6037;
     Object term7379;
     Object term7382;

    public JsAst_init_119039659940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5939 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        term6037 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        term7379 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term7380 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term7381 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term7380, term7380.getClass(), "id", null);
        setField(term7379, term7379.getClass(), "inputId", term7380);
        setField(term7381, term7381.getClass(), "file", null);
        setField(term7381, term7381.getClass(), "inputCharset", null);
        setField(term7381, term7381.getClass(), "fileName", null);
        setBooleanField(term7381, term7381.getClass(), "isExternFile", false);
        setField(term7381, term7381.getClass(), "originalPath", null);
        setField(term7381, term7381.getClass(), "lineOffsets", null);
        setField(term7381, term7381.getClass(), "code", null);
        setField(term7379, term7379.getClass(), "sourceFile", term7381);
        setField(term7379, term7379.getClass(), "fileName", null);
        setField(term7379, term7379.getClass(), "root", null);
        term7382 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term7382, term7382.getClass(), "file", null);
        setField(term7382, term7382.getClass(), "inputCharset", null);
        setField(term7382, term7382.getClass(), "fileName", null);
        setBooleanField(term7382, term7382.getClass(), "isExternFile", false);
        setField(term7382, term7382.getClass(), "originalPath", null);
        setField(term7382, term7382.getClass(), "lineOffsets", null);
        setField(term7382, term7382.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = term6037;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7379));
        assertTrue(recursiveEquals(term6037, term7382));
    }

};


