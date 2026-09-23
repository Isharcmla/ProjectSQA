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

public class JsAst_parse_446595854132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118986;
     Object term119150;

    public JsAst_parse_446595854132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118986 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term119070 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term119070, term119070.getClass(), "code", null);
        setField(term118986, term118986.getClass(), "sourceFile", term119070);
        term119150 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term119242 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term119398 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term119150, term119150.getClass(), "parserConfig", term119242);
        setField(term119150, term119150.getClass(), "defaultErrorReporter", term119398);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term119150;
        try {
            callMethod(klass, "parse", argTypes, term118986, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


