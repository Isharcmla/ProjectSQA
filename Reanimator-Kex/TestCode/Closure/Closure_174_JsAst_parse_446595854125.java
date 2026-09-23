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

public class JsAst_parse_446595854125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100212;
     Object term100376;

    public JsAst_parse_446595854125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100212 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term100296 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term100296, term100296.getClass(), "code", null);
        setField(term100212, term100212.getClass(), "sourceFile", term100296);
        term100376 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term100468 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term100624 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term100376, term100376.getClass(), "parserConfig", term100468);
        setField(term100376, term100376.getClass(), "defaultErrorReporter", term100624);
        Object term100724 = newInstance(Class.forName("com.google.javascript.rhino.head.ContextFactory"));
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", term100724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term100376;
        try {
            callMethod(klass, "parse", argTypes, term100212, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


