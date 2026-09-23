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

public class JsAst_parse_446595854107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67967;
     Object term68131;

    public JsAst_parse_446595854107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67967 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term68051 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term68051, term68051.getClass(), "code", null);
        setField(term67967, term67967.getClass(), "sourceFile", term68051);
        term68131 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term68223 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term68341 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        setField(term68131, term68131.getClass(), "parserConfig", term68223);
        setField(term68131, term68131.getClass(), "defaultErrorReporter", term68341);
        Object term68441 = newInstance(Class.forName("com.google.javascript.rhino.head.ContextFactory"));
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", term68441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term68131;
        try {
            callMethod(klass, "parse", argTypes, term67967, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


