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

public class JsAst_parse_44659585489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39977;
     Object term40145;

    public JsAst_parse_44659585489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39977 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term40065 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        setField(term40065, term40065.getClass(), "code", null);
        setField(term39977, term39977.getClass(), "sourceFile", term40065);
        Class<? extends Object> term44662 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term44661 = ((Class) term44662).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term44661).setAccessible(true);
        Object enum17 = ((Field) term44661).get((Object) null);
        term40145 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term40237 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term40549 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term40237, term40237.getClass(), "languageMode", enum17);
        setBooleanField(term40237, term40237.getClass(), "isIdeMode", false);
        setField(term40145, term40145.getClass(), "parserConfig", term40237);
        setField(term40145, term40145.getClass(), "defaultErrorReporter", term40549);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term40145;
        try {
            callMethod(klass, "parse", argTypes, term39977, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


