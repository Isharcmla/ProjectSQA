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

public class JsAst_parse_446595854100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55684;
     Object term55848;

    public JsAst_parse_446595854100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55684 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term55768 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term55768, term55768.getClass(), "code", null);
        setField(term55684, term55684.getClass(), "sourceFile", term55768);
        term55848 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term55940 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term56096 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term55848, term55848.getClass(), "parserConfig", term55940);
        setField(term55848, term55848.getClass(), "defaultErrorReporter", term56096);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term55848;
        try {
            callMethod(klass, "parse", argTypes, term55684, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


