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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScopedAliases_hotSwapScript_8834170984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42471;
     Object term42621;

    public ScopedAliases_hotSwapScript_8834170984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42471 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term42551 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42471, term42471.getClass(), "compiler", term42551);
        term42621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42621, term42621.getClass(), "type", 0);
        setField(term42621, term42621.getClass(), "parent", null);
        setField(term42761, term42761.getClass(), "next", term42831);
        setIntField(term42761, term42761.getClass(), "type", 37);
        setField(term42761, term42761.getClass(), "first", null);
        setField(term42691, term42691.getClass(), "next", term42761);
        setIntField(term42691, term42691.getClass(), "type", 0);
        setField(term42901, term42901.getClass(), "next", null);
        setIntField(term42901, term42901.getClass(), "type", 0);
        setField(term42901, term42901.getClass(), "first", null);
        setField(term42691, term42691.getClass(), "first", term42901);
        setField(term42621, term42621.getClass(), "first", term42691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term42621;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term42471, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


