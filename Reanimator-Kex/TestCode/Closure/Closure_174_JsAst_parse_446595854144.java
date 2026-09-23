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

public class JsAst_parse_446595854144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137930;
     Object term138094;

    public JsAst_parse_446595854144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137930 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term138014 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term138014, term138014.getClass(), "code", null);
        setField(term137930, term137930.getClass(), "sourceFile", term138014);
        term138094 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term138186 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term138298 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term138094, term138094.getClass(), "parserConfig", term138186);
        setField(term138094, term138094.getClass(), "defaultErrorReporter", term138298);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term138094;
        try {
            callMethod(klass, "parse", argTypes, term137930, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


