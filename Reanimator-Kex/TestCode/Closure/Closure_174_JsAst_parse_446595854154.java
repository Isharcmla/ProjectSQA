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

public class JsAst_parse_446595854154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160426;
     Object term160590;

    public JsAst_parse_446595854154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160426 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term160510 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term160510, term160510.getClass(), "code", null);
        setField(term160426, term160426.getClass(), "sourceFile", term160510);
        term160590 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term160682 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term160790 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.ErrorCollector"));
        setField(term160590, term160590.getClass(), "parserConfig", term160682);
        setField(term160590, term160590.getClass(), "defaultErrorReporter", term160790);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term160590;
        callMethod(klass, "parse", argTypes, term160426, args);
    }

};


