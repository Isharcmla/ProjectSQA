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

public class JsAst_init_119039659929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4764;
     Object term5214;
     Object term5217;

    public JsAst_init_119039659929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4660 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        term4764 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        term5214 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term5215 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term5216 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term5215, term5215.getClass(), "id", null);
        setField(term5214, term5214.getClass(), "inputId", term5215);
        setField(term5216, term5216.getClass(), "generator", null);
        setField(term5216, term5216.getClass(), "fileName", null);
        setBooleanField(term5216, term5216.getClass(), "isExternFile", false);
        setField(term5216, term5216.getClass(), "originalPath", null);
        setField(term5216, term5216.getClass(), "lineOffsets", null);
        setField(term5216, term5216.getClass(), "code", null);
        setField(term5214, term5214.getClass(), "sourceFile", term5216);
        setField(term5214, term5214.getClass(), "fileName", null);
        setField(term5214, term5214.getClass(), "root", null);
        term5217 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term5217, term5217.getClass(), "generator", null);
        setField(term5217, term5217.getClass(), "fileName", null);
        setBooleanField(term5217, term5217.getClass(), "isExternFile", false);
        setField(term5217, term5217.getClass(), "originalPath", null);
        setField(term5217, term5217.getClass(), "lineOffsets", null);
        setField(term5217, term5217.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = term4764;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5214));
        assertTrue(recursiveEquals(term4764, term5217));
    }

};


