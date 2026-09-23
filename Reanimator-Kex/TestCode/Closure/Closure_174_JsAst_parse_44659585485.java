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
import java.lang.String;

public class JsAst_parse_44659585485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37648;
     Object term37826;

    public JsAst_parse_44659585485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37648 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term37746 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term37746, term37746.getClass(), "code", null);
        setField(term37648, term37648.getClass(), "sourceFile", term37746);
        Class<? extends Object> term38801 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term38800 = ((Class) term38801).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term38800).setAccessible(true);
        Object enum15 = ((Field) term38800).get((Object) null);
        term37826 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term37918 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term38182 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.ErrorCollector"));
        setField(term37918, term37918.getClass(), "languageMode", enum15);
        setBooleanField(term37918, term37918.getClass(), "isIdeMode", false);
        setField(term37826, term37826.getClass(), "parserConfig", term37918);
        setField(term37826, term37826.getClass(), "defaultErrorReporter", term38182);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term37826;
        try {
            callMethod(klass, "parse", argTypes, term37648, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


