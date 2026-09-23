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

public class JsAst_parse_446595854155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161405;
     Object term161607;

    public JsAst_parse_446595854155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161405 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term161489 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term161489, term161489.getClass(), "code", "");
        setField(term161489, term161489.getClass(), "fileName", null);
        setField(term161405, term161405.getClass(), "sourceFile", term161489);
        Class<? extends Object> term162013 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term162012 = ((Class) term162013).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term162012).setAccessible(true);
        Object enum36 = ((Field) term162012).get((Object) null);
        term161607 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term161699 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term162011 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        setField(term161699, term161699.getClass(), "languageMode", enum36);
        setBooleanField(term161699, term161699.getClass(), "isIdeMode", false);
        setField(term161607, term161607.getClass(), "parserConfig", term161699);
        setField(term161607, term161607.getClass(), "defaultErrorReporter", term162011);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term161607;
        callMethod(klass, "parse", argTypes, term161405, args);
    }

};


