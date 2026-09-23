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

public class JsAst_parse_446595854153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159734;
     Object term159898;

    public JsAst_parse_446595854153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159734 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term159818 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term159818, term159818.getClass(), "code", null);
        setField(term159734, term159734.getClass(), "sourceFile", term159818);
        term159898 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term159990 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term160146 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term159898, term159898.getClass(), "parserConfig", term159990);
        setField(term159898, term159898.getClass(), "defaultErrorReporter", term160146);
        Object term160246 = newInstance(Class.forName("com.google.javascript.rhino.head.ContextFactory"));
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", term160246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term159898;
        callMethod(klass, "parse", argTypes, term159734, args);
    }

};


