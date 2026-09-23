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

public class JsAst_parse_44659585483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35268;
     Object term35474;

    public JsAst_parse_44659585483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35268 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term35356 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        setField(term35356, term35356.getClass(), "code", "");
        setField(term35268, term35268.getClass(), "sourceFile", term35356);
        Class<? extends Object> term37033 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term37032 = ((Class) term37033).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term37032).setAccessible(true);
        Object enum13 = ((Field) term37032).get((Object) null);
        term35474 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term35566 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term35834 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term35566, term35566.getClass(), "languageMode", enum13);
        setBooleanField(term35566, term35566.getClass(), "isIdeMode", false);
        setField(term35474, term35474.getClass(), "parserConfig", term35566);
        setField(term35474, term35474.getClass(), "defaultErrorReporter", term35834);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term35474;
        try {
            callMethod(klass, "parse", argTypes, term35268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


