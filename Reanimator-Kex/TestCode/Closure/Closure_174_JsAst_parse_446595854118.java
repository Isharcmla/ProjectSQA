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

public class JsAst_parse_446595854118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90825;
     Object term90989;

    public JsAst_parse_446595854118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90825 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term90909 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term90909, term90909.getClass(), "code", null);
        setField(term90825, term90825.getClass(), "sourceFile", term90909);
        term90989 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term91081 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term91199 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        setField(term90989, term90989.getClass(), "parserConfig", term91081);
        setField(term90989, term90989.getClass(), "defaultErrorReporter", term91199);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term90989;
        try {
            callMethod(klass, "parse", argTypes, term90825, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


