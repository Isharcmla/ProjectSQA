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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsAst_parse_44659585471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14198;
     Object term14400;

    public JsAst_parse_44659585471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14198 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term14282 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term14282, term14282.getClass(), "code", "");
        setField(term14198, term14198.getClass(), "sourceFile", term14282);
        term14400 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term14492 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term14400, term14400.getClass(), "parserConfig", term14492);
        setField(term14400, term14400.getClass(), "defaultErrorReporter", null);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term14400;
        try {
            callMethod(klass, "parse", argTypes, term14198, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


