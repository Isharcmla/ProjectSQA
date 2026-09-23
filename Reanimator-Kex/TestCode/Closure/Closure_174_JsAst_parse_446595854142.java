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

public class JsAst_parse_446595854142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133322;
     Object term133506;

    public JsAst_parse_446595854142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133322 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term133426 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term133426, term133426.getClass(), "code", null);
        setField(term133426, term133426.getClass(), "fileName", null);
        setField(term133322, term133322.getClass(), "sourceFile", term133426);
        Class<? extends Object> term141845 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term141844 = ((Class) term141845).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term141844).setAccessible(true);
        Object enum34 = ((Field) term141844).get((Object) null);
        term133506 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term133598 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term133866 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term133598, term133598.getClass(), "languageMode", enum34);
        setBooleanField(term133598, term133598.getClass(), "isIdeMode", false);
        setField(term133506, term133506.getClass(), "parserConfig", term133598);
        setField(term133506, term133506.getClass(), "defaultErrorReporter", term133866);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term133506;
        try {
            callMethod(klass, "parse", argTypes, term133322, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


