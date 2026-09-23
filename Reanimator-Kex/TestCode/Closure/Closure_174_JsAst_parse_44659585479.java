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

public class JsAst_parse_44659585479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32322;
     Object term32506;

    public JsAst_parse_44659585479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32322 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term32426 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term32426, term32426.getClass(), "code", null);
        setField(term32322, term32322.getClass(), "sourceFile", term32426);
        Class<? extends Object> term33464 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term33463 = ((Class) term33464).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term33463).setAccessible(true);
        Object enum9 = ((Field) term33463).get((Object) null);
        term32506 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term32598 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term32866 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term32598, term32598.getClass(), "languageMode", enum9);
        setBooleanField(term32598, term32598.getClass(), "isIdeMode", false);
        setField(term32506, term32506.getClass(), "parserConfig", term32598);
        setField(term32506, term32506.getClass(), "defaultErrorReporter", term32866);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term32506;
        try {
            callMethod(klass, "parse", argTypes, term32322, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


