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
import java.lang.Object;

public class JsAst_parse_44659585496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50794;
     Object term50978;

    public JsAst_parse_44659585496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50794 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term50898 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term50898, term50898.getClass(), "code", null);
        setField(term50794, term50794.getClass(), "sourceFile", term50898);
        term50978 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term51070 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term51182 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term50978, term50978.getClass(), "parserConfig", term51070);
        setField(term50978, term50978.getClass(), "defaultErrorReporter", term51182);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term50978;
        try {
            callMethod(klass, "parse", argTypes, term50794, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


