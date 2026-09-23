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
import java.lang.String;

public class JsAst_parse_44659585475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19338;
     Object term19522;

    public JsAst_parse_44659585475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19338 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term19442 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term19442, term19442.getClass(), "code", null);
        setField(term19338, term19338.getClass(), "sourceFile", term19442);
        Class<? extends Object> term26350 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term26349 = ((Class) term26350).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term26349).setAccessible(true);
        Object enum3 = ((Field) term26349).get((Object) null);
        term19522 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term19614 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term19882 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term19614, term19614.getClass(), "languageMode", enum3);
        setBooleanField(term19614, term19614.getClass(), "isIdeMode", false);
        setField(term19522, term19522.getClass(), "parserConfig", term19614);
        setField(term19522, term19522.getClass(), "defaultErrorReporter", term19882);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term19522;
        try {
            callMethod(klass, "parse", argTypes, term19338, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


