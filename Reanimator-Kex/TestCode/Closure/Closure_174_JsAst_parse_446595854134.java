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

public class JsAst_parse_446595854134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119563;
     Object term119747;

    public JsAst_parse_446595854134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119563 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term119667 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term119667, term119667.getClass(), "code", null);
        setField(term119563, term119563.getClass(), "sourceFile", term119667);
        term119747 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term119839 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term119957 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        setField(term119747, term119747.getClass(), "parserConfig", term119839);
        setField(term119747, term119747.getClass(), "defaultErrorReporter", term119957);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term119747;
        try {
            callMethod(klass, "parse", argTypes, term119563, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


