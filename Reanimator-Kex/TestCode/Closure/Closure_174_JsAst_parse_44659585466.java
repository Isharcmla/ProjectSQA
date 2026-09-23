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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsAst_parse_44659585466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11938;
     Object term12140;

    public JsAst_parse_44659585466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11938 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term12022 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term12022, term12022.getClass(), "code", "");
        setField(term11938, term11938.getClass(), "sourceFile", term12022);
        term12140 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term12232 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term12388 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term12140, term12140.getClass(), "parserConfig", term12232);
        setField(term12140, term12140.getClass(), "defaultErrorReporter", term12388);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term12140;
        try {
            callMethod(klass, "parse", argTypes, term11938, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


