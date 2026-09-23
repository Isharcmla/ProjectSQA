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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ScopedAliases_hotSwapScript_8834170976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37889;
     Object term37981;
     Object term38739;
     Object term38740;

    public ScopedAliases_hotSwapScript_8834170976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37889 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term37889, term37889.getClass(), "compiler", null);
        term37981 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38073 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38235 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term37981, term37981.getClass(), "type", 0);
        setField(term37981, term37981.getClass(), "parent", null);
        setField(term38143, term38143.getClass(), "next", null);
        setIntField(term38143, term38143.getClass(), "type", 0);
        setField(term38143, term38143.getClass(), "first", null);
        setField(term38073, term38073.getClass(), "next", term38143);
        setIntField(term38073, term38073.getClass(), "type", 0);
        setField(term38235, term38235.getClass(), "next", null);
        setIntField(term38235, term38235.getClass(), "type", 0);
        setField(term38235, term38235.getClass(), "first", null);
        setField(term38073, term38073.getClass(), "first", term38235);
        setField(term37981, term37981.getClass(), "first", term38073);
        term38739 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term38739, term38739.getClass(), "compiler", null);
        setField(term38739, term38739.getClass(), "preprocessorSymbolTable", null);
        setField(term38739, term38739.getClass(), "transformationHandler", null);
        term38740 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term38742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38743 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term38740, term38740.getClass(), "number", 0.0);
        setIntField(term38740, term38740.getClass(), "type", 0);
        setField(term38740, term38740.getClass(), "next", null);
        setDoubleField(term38741, term38741.getClass(), "number", 0.0);
        setIntField(term38741, term38741.getClass(), "type", 0);
        setIntField(term38742, term38742.getClass(), "type", 0);
        setField(term38742, term38742.getClass(), "next", null);
        setField(term38742, term38742.getClass(), "first", null);
        setField(term38742, term38742.getClass(), "last", null);
        setField(term38742, term38742.getClass(), "propListHead", null);
        setIntField(term38742, term38742.getClass(), "sourcePosition", 0);
        setField(term38742, term38742.getClass(), "jsType", null);
        setField(term38742, term38742.getClass(), "parent", null);
        setField(term38741, term38741.getClass(), "next", term38742);
        setDoubleField(term38743, term38743.getClass(), "number", 0.0);
        setIntField(term38743, term38743.getClass(), "type", 0);
        setField(term38743, term38743.getClass(), "next", null);
        setField(term38743, term38743.getClass(), "first", null);
        setField(term38743, term38743.getClass(), "last", null);
        setField(term38743, term38743.getClass(), "propListHead", null);
        setIntField(term38743, term38743.getClass(), "sourcePosition", 0);
        setField(term38743, term38743.getClass(), "jsType", null);
        setField(term38743, term38743.getClass(), "parent", null);
        setField(term38741, term38741.getClass(), "first", term38743);
        setField(term38741, term38741.getClass(), "last", null);
        setField(term38741, term38741.getClass(), "propListHead", null);
        setIntField(term38741, term38741.getClass(), "sourcePosition", 0);
        setField(term38741, term38741.getClass(), "jsType", null);
        setField(term38741, term38741.getClass(), "parent", null);
        setField(term38740, term38740.getClass(), "first", term38741);
        setField(term38740, term38740.getClass(), "last", null);
        setField(term38740, term38740.getClass(), "propListHead", null);
        setIntField(term38740, term38740.getClass(), "sourcePosition", 0);
        setField(term38740, term38740.getClass(), "jsType", null);
        setField(term38740, term38740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term37981;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term37889, args);
        assertTrue(recursiveEquals(term37889, term38739));
        assertTrue(recursiveEquals(term37981, term38740));
    }

};


