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

public class JsAst_parse_446595854128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108031;
     Object term108215;

    public JsAst_parse_446595854128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108031 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term108135 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term108135, term108135.getClass(), "code", null);
        setField(term108031, term108031.getClass(), "sourceFile", term108135);
        Class<? extends Object> term113888 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term113887 = ((Class) term113888).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term113887).setAccessible(true);
        Object enum26 = ((Field) term113887).get((Object) null);
        term108215 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term108307 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term108607 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter"));
        setField(term108307, term108307.getClass(), "languageMode", enum26);
        setBooleanField(term108307, term108307.getClass(), "isIdeMode", false);
        setField(term108215, term108215.getClass(), "parserConfig", term108307);
        setField(term108215, term108215.getClass(), "defaultErrorReporter", term108607);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term108215;
        try {
            callMethod(klass, "parse", argTypes, term108031, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


