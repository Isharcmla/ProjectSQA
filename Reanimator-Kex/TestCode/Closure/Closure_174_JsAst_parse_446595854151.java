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

public class JsAst_parse_446595854151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154982;
     Object term155166;

    public JsAst_parse_446595854151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154982 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term155086 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term155086, term155086.getClass(), "code", null);
        setField(term154982, term154982.getClass(), "sourceFile", term155086);
        term155166 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term155258 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term155370 = newInstance(Class.forName("com.google.javascript.rhino.head.DefaultErrorReporter"));
        setField(term155166, term155166.getClass(), "parserConfig", term155258);
        setField(term155166, term155166.getClass(), "defaultErrorReporter", term155370);
        setField(null, Class.forName("com.google.javascript.rhino.head.ContextFactory"), "global", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term155166;
        try {
            callMethod(klass, "parse", argTypes, term154982, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


