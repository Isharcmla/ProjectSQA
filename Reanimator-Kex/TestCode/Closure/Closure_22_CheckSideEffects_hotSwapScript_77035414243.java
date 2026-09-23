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

public class CheckSideEffects_hotSwapScript_77035414243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18326;
     Object term18476;

    public CheckSideEffects_hotSwapScript_77035414243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18326 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term18406 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term18326, term18326.getClass(), "compiler", term18406);
        term18476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18476, term18476.getClass(), "type", 85);
        setField(term18476, term18476.getClass(), "parent", null);
        setField(term18546, term18546.getClass(), "next", null);
        setIntField(term18546, term18546.getClass(), "type", 0);
        setField(term18616, term18616.getClass(), "next", null);
        setIntField(term18616, term18616.getClass(), "type", 0);
        setField(term18616, term18616.getClass(), "first", null);
        setField(term18546, term18546.getClass(), "first", term18616);
        setField(term18476, term18476.getClass(), "first", term18546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term18476;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term18326, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


