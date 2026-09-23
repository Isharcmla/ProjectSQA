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

public class JsAst_parse_446595854129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109464;
     Object term109648;

    public JsAst_parse_446595854129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109464 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term109568 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term109568, term109568.getClass(), "code", null);
        setField(term109568, term109568.getClass(), "fileName", null);
        setField(term109464, term109464.getClass(), "sourceFile", term109568);
        Class<? extends Object> term118125 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term118124 = ((Class) term118125).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term118124).setAccessible(true);
        Object enum28 = ((Field) term118124).get((Object) null);
        term109648 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term109740 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term110008 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term109740, term109740.getClass(), "languageMode", enum28);
        setBooleanField(term109740, term109740.getClass(), "isIdeMode", false);
        setField(term109648, term109648.getClass(), "parserConfig", term109740);
        setField(term109648, term109648.getClass(), "defaultErrorReporter", term110008);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term109648;
        try {
            callMethod(klass, "parse", argTypes, term109464, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


