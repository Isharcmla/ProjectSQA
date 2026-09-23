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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsAst_parse_44659585469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13335;
     Object term13537;

    public JsAst_parse_44659585469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13335 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term13419 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term13419, term13419.getClass(), "code", "");
        setField(term13335, term13335.getClass(), "sourceFile", term13419);
        term13537 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term13629 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term13747 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        setField(term13537, term13537.getClass(), "parserConfig", term13629);
        setField(term13537, term13537.getClass(), "defaultErrorReporter", term13747);
        Object term13847 = newInstance(Class.forName("com.google.javascript.rhino.head.ContextFactory"));
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", term13847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term13537;
        try {
            callMethod(klass, "parse", argTypes, term13335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


