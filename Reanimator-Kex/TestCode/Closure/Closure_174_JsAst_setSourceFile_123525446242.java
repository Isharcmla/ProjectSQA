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

public class JsAst_setSourceFile_123525446242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6310;
     Object term6432;
     Object term7644;
     Object term7650;

    public JsAst_setSourceFile_123525446242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6310 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        setField(term6310, term6310.getClass(), "fileName", "");
        term6432 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term6432, term6432.getClass(), "fileName", "");
        term7644 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term7645 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term7644, term7644.getClass(), "inputId", null);
        setField(term7645, term7645.getClass(), "fileName", "");
        setBooleanField(term7645, term7645.getClass(), "isExternFile", false);
        setField(term7645, term7645.getClass(), "originalPath", null);
        setField(term7645, term7645.getClass(), "lineOffsets", null);
        setField(term7645, term7645.getClass(), "code", null);
        setField(term7644, term7644.getClass(), "sourceFile", term7645);
        setField(term7644, term7644.getClass(), "fileName", "");
        setField(term7644, term7644.getClass(), "root", null);
        term7650 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term7650, term7650.getClass(), "fileName", "");
        setBooleanField(term7650, term7650.getClass(), "isExternFile", false);
        setField(term7650, term7650.getClass(), "originalPath", null);
        setField(term7650, term7650.getClass(), "lineOffsets", null);
        setField(term7650, term7650.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = term6432;
        callMethod(klass, "setSourceFile", argTypes, term6310, args);
        assertTrue(recursiveEquals(term6310, term7644));
        assertTrue(recursiveEquals(term6432, term7650));
    }

};


