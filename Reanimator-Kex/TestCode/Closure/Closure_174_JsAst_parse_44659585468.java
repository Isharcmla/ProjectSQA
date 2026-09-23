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

public class JsAst_parse_44659585468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12957;

    public JsAst_parse_44659585468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12957 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term13045 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term13133 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term13221 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        setField(term13133, term13133.getClass(), "referenced", term13221);
        setField(term13045, term13045.getClass(), "referenced", term13133);
        setField(term12957, term12957.getClass(), "sourceFile", term13045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parse", argTypes, term12957, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


