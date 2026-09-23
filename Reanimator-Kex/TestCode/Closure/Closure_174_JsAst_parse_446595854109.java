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

public class JsAst_parse_446595854109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72134;
     Object term72298;

    public JsAst_parse_446595854109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72134 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term72218 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term72218, term72218.getClass(), "code", null);
        setField(term72134, term72134.getClass(), "sourceFile", term72218);
        term72298 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term72390 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term72502 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term72298, term72298.getClass(), "parserConfig", term72390);
        setField(term72298, term72298.getClass(), "defaultErrorReporter", term72502);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term72298;
        try {
            callMethod(klass, "parse", argTypes, term72134, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


