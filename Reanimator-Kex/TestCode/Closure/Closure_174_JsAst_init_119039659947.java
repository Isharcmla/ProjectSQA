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

public class JsAst_init_119039659947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8079;
     Object term8748;
     Object term8751;

    public JsAst_init_119039659947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7991 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        term8079 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        term8748 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term8749 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term8750 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        setField(term8749, term8749.getClass(), "id", null);
        setField(term8748, term8748.getClass(), "inputId", term8749);
        setField(term8750, term8750.getClass(), "referenced", null);
        setField(term8750, term8750.getClass(), "fileName", null);
        setBooleanField(term8750, term8750.getClass(), "isExternFile", false);
        setField(term8750, term8750.getClass(), "originalPath", null);
        setField(term8750, term8750.getClass(), "lineOffsets", null);
        setField(term8750, term8750.getClass(), "code", null);
        setField(term8748, term8748.getClass(), "sourceFile", term8750);
        setField(term8748, term8748.getClass(), "fileName", null);
        setField(term8748, term8748.getClass(), "root", null);
        term8751 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        setField(term8751, term8751.getClass(), "referenced", null);
        setField(term8751, term8751.getClass(), "fileName", null);
        setBooleanField(term8751, term8751.getClass(), "isExternFile", false);
        setField(term8751, term8751.getClass(), "originalPath", null);
        setField(term8751, term8751.getClass(), "lineOffsets", null);
        setField(term8751, term8751.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = term8079;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8748));
        assertTrue(recursiveEquals(term8079, term8751));
    }

};


