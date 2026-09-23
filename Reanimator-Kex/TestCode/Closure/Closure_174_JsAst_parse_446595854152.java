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

public class JsAst_parse_446595854152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159100;
     Object term159264;

    public JsAst_parse_446595854152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159100 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term159184 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term159184, term159184.getClass(), "code", null);
        setField(term159100, term159100.getClass(), "sourceFile", term159184);
        term159264 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term159356 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term159512 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term159264, term159264.getClass(), "parserConfig", term159356);
        setField(term159264, term159264.getClass(), "defaultErrorReporter", term159512);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term159264;
        callMethod(klass, "parse", argTypes, term159100, args);
    }

};


