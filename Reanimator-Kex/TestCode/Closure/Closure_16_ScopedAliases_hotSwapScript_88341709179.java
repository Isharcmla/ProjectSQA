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

public class ScopedAliases_hotSwapScript_88341709179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108846;
     Object term108938;
     Object term109236;
     Object term109237;

    public ScopedAliases_hotSwapScript_88341709179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108846 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term108846, term108846.getClass(), "compiler", null);
        term108938 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term108938, term108938.getClass(), "type", 105);
        setField(term108938, term108938.getClass(), "parent", null);
        term109236 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term109236, term109236.getClass(), "compiler", null);
        setField(term109236, term109236.getClass(), "preprocessorSymbolTable", null);
        setField(term109236, term109236.getClass(), "transformationHandler", null);
        term109237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term109237, term109237.getClass(), "number", 0.0);
        setIntField(term109237, term109237.getClass(), "type", 105);
        setField(term109237, term109237.getClass(), "next", null);
        setField(term109237, term109237.getClass(), "first", null);
        setField(term109237, term109237.getClass(), "last", null);
        setField(term109237, term109237.getClass(), "propListHead", null);
        setIntField(term109237, term109237.getClass(), "sourcePosition", 0);
        setField(term109237, term109237.getClass(), "jsType", null);
        setField(term109237, term109237.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term108938;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term108846, args);
        assertTrue(recursiveEquals(term108846, term109236));
        assertTrue(recursiveEquals(term108938, term109237));
    }

};


