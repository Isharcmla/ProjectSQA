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

public class JsAst_parse_44659585476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20564;
     Object term20748;

    public JsAst_parse_44659585476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20564 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term20668 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term20668, term20668.getClass(), "code", null);
        setField(term20564, term20564.getClass(), "sourceFile", term20668);
        Class<? extends Object> term27285 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term27284 = ((Class) term27285).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term27284).setAccessible(true);
        Object enum5 = ((Field) term27284).get((Object) null);
        term20748 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term20840 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term21114 = newInstance(Class.forName("com.google.javascript.rhino.head.tools.ToolErrorReporter"));
        setField(term20840, term20840.getClass(), "languageMode", enum5);
        setBooleanField(term20840, term20840.getClass(), "isIdeMode", false);
        setField(term20748, term20748.getClass(), "parserConfig", term20840);
        setField(term20748, term20748.getClass(), "defaultErrorReporter", term21114);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term20748;
        try {
            callMethod(klass, "parse", argTypes, term20564, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


