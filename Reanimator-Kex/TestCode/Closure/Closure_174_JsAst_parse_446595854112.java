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

public class JsAst_parse_446595854112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77312;
     Object term77476;

    public JsAst_parse_446595854112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77312 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term77396 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term77396, term77396.getClass(), "code", null);
        setField(term77312, term77312.getClass(), "sourceFile", term77396);
        term77476 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term77568 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term77686 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        setField(term77476, term77476.getClass(), "parserConfig", term77568);
        setField(term77476, term77476.getClass(), "defaultErrorReporter", term77686);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term77476;
        try {
            callMethod(klass, "parse", argTypes, term77312, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


