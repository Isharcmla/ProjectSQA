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

public class CheckSideEffects_hotSwapScript_77035414234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13676;
     Object term13826;

    public CheckSideEffects_hotSwapScript_77035414234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13676 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term13756 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13676, term13676.getClass(), "compiler", term13756);
        term13826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term13826, term13826.getClass(), "type", 0);
        setField(term13826, term13826.getClass(), "parent", null);
        setField(term13896, term13896.getClass(), "next", term13896);
        setIntField(term13896, term13896.getClass(), "type", 0);
        setField(term13896, term13896.getClass(), "first", term13988);
        setField(term13826, term13826.getClass(), "first", term13896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term13826;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term13676, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


