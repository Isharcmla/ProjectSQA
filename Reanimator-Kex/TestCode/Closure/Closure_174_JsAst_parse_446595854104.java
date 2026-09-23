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

public class JsAst_parse_446595854104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67329;
     Object term67493;

    public JsAst_parse_446595854104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67329 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term67413 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term67413, term67413.getClass(), "code", null);
        setField(term67329, term67329.getClass(), "sourceFile", term67413);
        term67493 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term67585 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term67697 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term67493, term67493.getClass(), "parserConfig", term67585);
        setField(term67493, term67493.getClass(), "defaultErrorReporter", term67697);
        Object term67797 = newInstance(Class.forName("com.google.javascript.rhino.head.ContextFactory"));
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", term67797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term67493;
        try {
            callMethod(klass, "parse", argTypes, term67329, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


