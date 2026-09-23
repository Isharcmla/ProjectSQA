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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsAst_parse_44659585453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8173;
     Object term8337;

    public JsAst_parse_44659585453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8173 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term8257 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term8257, term8257.getClass(), "code", null);
        setField(term8173, term8173.getClass(), "sourceFile", term8257);
        term8337 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term8429 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term8337, term8337.getClass(), "parserConfig", term8429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = term8337;
        try {
            callMethod(klass, "parse", argTypes, term8173, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


