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

public class JsAst_parse_446595854147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150434;
     Object term150598;

    public JsAst_parse_446595854147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150434 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term150518 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term150518, term150518.getClass(), "code", null);
        setField(term150434, term150434.getClass(), "sourceFile", term150518);
        term150598 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term150690 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term150808 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        setField(term150598, term150598.getClass(), "parserConfig", term150690);
        setField(term150598, term150598.getClass(), "defaultErrorReporter", term150808);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term150598;
        try {
            callMethod(klass, "parse", argTypes, term150434, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


