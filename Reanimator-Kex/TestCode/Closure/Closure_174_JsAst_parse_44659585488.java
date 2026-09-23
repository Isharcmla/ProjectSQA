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

public class JsAst_parse_44659585488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39315;
     Object term39479;

    public JsAst_parse_44659585488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39315 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term39399 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term39399, term39399.getClass(), "code", null);
        setField(term39315, term39315.getClass(), "sourceFile", term39399);
        term39479 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term39571 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term39689 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        setField(term39479, term39479.getClass(), "parserConfig", term39571);
        setField(term39479, term39479.getClass(), "defaultErrorReporter", term39689);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term39479;
        try {
            callMethod(klass, "parse", argTypes, term39315, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


