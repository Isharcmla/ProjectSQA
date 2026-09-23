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

public class JsAst_parse_44659585498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51614;
     Object term51798;

    public JsAst_parse_44659585498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51614 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term51718 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term51718, term51718.getClass(), "code", null);
        setField(term51614, term51614.getClass(), "sourceFile", term51718);
        term51798 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term51890 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term52002 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term51798, term51798.getClass(), "parserConfig", term51890);
        setField(term51798, term51798.getClass(), "defaultErrorReporter", term52002);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term51798;
        try {
            callMethod(klass, "parse", argTypes, term51614, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


