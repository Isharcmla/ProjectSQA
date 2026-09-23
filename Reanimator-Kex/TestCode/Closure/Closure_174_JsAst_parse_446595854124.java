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

public class JsAst_parse_446595854124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99524;
     Object term99688;

    public JsAst_parse_446595854124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99524 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term99608 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term99608, term99608.getClass(), "code", null);
        setField(term99524, term99524.getClass(), "sourceFile", term99608);
        term99688 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term99780 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term99936 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term99688, term99688.getClass(), "parserConfig", term99780);
        setField(term99688, term99688.getClass(), "defaultErrorReporter", term99936);
        Object term100036 = newInstance(Class.forName("com.google.javascript.rhino.head.ContextFactory"));
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", term100036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term99688;
        try {
            callMethod(klass, "parse", argTypes, term99524, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


