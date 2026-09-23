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
import java.lang.String;

public class JsAst_parse_446595854110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72798;
     Object term72962;

    public JsAst_parse_446595854110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72798 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term72882 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term72882, term72882.getClass(), "code", null);
        setField(term72882, term72882.getClass(), "fileName", null);
        setField(term72798, term72798.getClass(), "sourceFile", term72882);
        Class<? extends Object> term82085 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term82084 = ((Class) term82085).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term82084).setAccessible(true);
        Object enum22 = ((Field) term82084).get((Object) null);
        term72962 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term73054 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term73322 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term73054, term73054.getClass(), "languageMode", enum22);
        setBooleanField(term73054, term73054.getClass(), "isIdeMode", true);
        setField(term72962, term72962.getClass(), "parserConfig", term73054);
        setField(term72962, term72962.getClass(), "defaultErrorReporter", term73322);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term72962;
        try {
            callMethod(klass, "parse", argTypes, term72798, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


