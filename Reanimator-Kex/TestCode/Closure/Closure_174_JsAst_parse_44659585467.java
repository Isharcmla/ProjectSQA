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

public class JsAst_parse_44659585467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12511;
     Object term12675;

    public JsAst_parse_44659585467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12511 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term12595 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term12595, term12595.getClass(), "code", null);
        setField(term12511, term12511.getClass(), "sourceFile", term12595);
        term12675 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term12767 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term12675, term12675.getClass(), "parserConfig", term12767);
        setField(term12675, term12675.getClass(), "defaultErrorReporter", null);
        Object term12867 = newInstance(Class.forName("com.google.javascript.rhino.head.ContextFactory"));
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", term12867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term12675;
        try {
            callMethod(klass, "parse", argTypes, term12511, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


