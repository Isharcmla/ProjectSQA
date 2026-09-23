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

public class JsAst_parse_44659585482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34099;
     Object term34277;

    public JsAst_parse_44659585482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34099 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term34197 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term34197, term34197.getClass(), "code", null);
        setField(term34099, term34099.getClass(), "sourceFile", term34197);
        Class<? extends Object> term36432 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term36431 = ((Class) term36432).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term36431).setAccessible(true);
        Object enum12 = ((Field) term36431).get((Object) null);
        term34277 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term34369 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term34637 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term34369, term34369.getClass(), "languageMode", enum12);
        setBooleanField(term34369, term34369.getClass(), "isIdeMode", false);
        setField(term34277, term34277.getClass(), "parserConfig", term34369);
        setField(term34277, term34277.getClass(), "defaultErrorReporter", term34637);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term34277;
        try {
            callMethod(klass, "parse", argTypes, term34099, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


