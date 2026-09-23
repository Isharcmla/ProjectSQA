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
     Object term16011;
     Object term16161;

    public CheckSideEffects_hotSwapScript_77035414243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16011 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term16091 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16011, term16011.getClass(), "compiler", term16091);
        term16161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16323 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16161, term16161.getClass(), "type", 0);
        setField(term16161, term16161.getClass(), "parent", null);
        setField(term16231, term16231.getClass(), "next", term16231);
        setIntField(term16231, term16231.getClass(), "type", 0);
        setField(term16231, term16231.getClass(), "first", term16323);
        setField(term16161, term16161.getClass(), "first", term16231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term16161;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term16011, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


