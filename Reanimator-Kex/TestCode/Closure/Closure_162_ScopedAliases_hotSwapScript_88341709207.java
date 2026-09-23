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

public class ScopedAliases_hotSwapScript_88341709207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116121;
     Object term116293;

    public ScopedAliases_hotSwapScript_88341709207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116121 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term116201 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term116121, term116121.getClass(), "compiler", term116201);
        term116293 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116471 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term116293, term116293.getClass(), "type", 0);
        setField(term116293, term116293.getClass(), "parent", null);
        setField(term116385, term116385.getClass(), "next", null);
        setIntField(term116385, term116385.getClass(), "type", 0);
        setField(term116471, term116471.getClass(), "next", term116471);
        setIntField(term116471, term116471.getClass(), "type", 0);
        setField(term116471, term116471.getClass(), "first", null);
        setField(term116385, term116385.getClass(), "first", term116471);
        setField(term116293, term116293.getClass(), "first", term116385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term116293;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term116121, args);
    }

};


