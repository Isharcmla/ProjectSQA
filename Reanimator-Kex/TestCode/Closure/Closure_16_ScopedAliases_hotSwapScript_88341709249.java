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

public class ScopedAliases_hotSwapScript_88341709249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157172;
     Object term157264;
     Object term158374;
     Object term158375;

    public ScopedAliases_hotSwapScript_88341709249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157172 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term157172, term157172.getClass(), "compiler", null);
        term157264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term157264, term157264.getClass(), "type", 105);
        setField(term157264, term157264.getClass(), "parent", null);
        term158374 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term158374, term158374.getClass(), "compiler", null);
        setField(term158374, term158374.getClass(), "preprocessorSymbolTable", null);
        setField(term158374, term158374.getClass(), "transformationHandler", null);
        term158375 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term158375, term158375.getClass(), "number", 0.0);
        setIntField(term158375, term158375.getClass(), "type", 105);
        setField(term158375, term158375.getClass(), "next", null);
        setField(term158375, term158375.getClass(), "first", null);
        setField(term158375, term158375.getClass(), "last", null);
        setField(term158375, term158375.getClass(), "propListHead", null);
        setIntField(term158375, term158375.getClass(), "sourcePosition", 0);
        setField(term158375, term158375.getClass(), "jsType", null);
        setField(term158375, term158375.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term157264;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term157172, args);
        assertTrue(recursiveEquals(term157172, term158374));
        assertTrue(recursiveEquals(term157264, term158375));
    }

};


