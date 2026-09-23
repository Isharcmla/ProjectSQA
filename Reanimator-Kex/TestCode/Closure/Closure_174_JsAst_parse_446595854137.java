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

public class JsAst_parse_446595854137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124061;
     Object term124263;

    public JsAst_parse_446595854137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124061 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term124145 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term124145, term124145.getClass(), "code", "");
        setField(term124145, term124145.getClass(), "fileName", null);
        setField(term124061, term124061.getClass(), "sourceFile", term124145);
        Class<? extends Object> term131777 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term131776 = ((Class) term131777).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term131776).setAccessible(true);
        Object enum31 = ((Field) term131776).get((Object) null);
        term124263 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term124355 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term124623 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term124355, term124355.getClass(), "languageMode", enum31);
        setBooleanField(term124355, term124355.getClass(), "isIdeMode", false);
        setField(term124263, term124263.getClass(), "parserConfig", term124355);
        setField(term124263, term124263.getClass(), "defaultErrorReporter", term124623);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term124263;
        try {
            callMethod(klass, "parse", argTypes, term124061, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


