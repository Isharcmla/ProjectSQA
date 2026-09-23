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

public class JsAst_parse_446595854119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91650;
     Object term91834;

    public JsAst_parse_446595854119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91650 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term91754 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term91754, term91754.getClass(), "code", null);
        setField(term91650, term91650.getClass(), "sourceFile", term91754);
        term91834 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term91926 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term92034 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.ErrorCollector"));
        setField(term91834, term91834.getClass(), "parserConfig", term91926);
        setField(term91834, term91834.getClass(), "defaultErrorReporter", term92034);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term91834;
        try {
            callMethod(klass, "parse", argTypes, term91650, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


