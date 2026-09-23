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

public class JsAst_parse_446595854113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82940;
     Object term83124;

    public JsAst_parse_446595854113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82940 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term83044 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term83044, term83044.getClass(), "code", null);
        setField(term82940, term82940.getClass(), "sourceFile", term83044);
        term83124 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term83216 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term83328 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term83124, term83124.getClass(), "parserConfig", term83216);
        setField(term83124, term83124.getClass(), "defaultErrorReporter", term83328);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term83124;
        try {
            callMethod(klass, "parse", argTypes, term82940, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


