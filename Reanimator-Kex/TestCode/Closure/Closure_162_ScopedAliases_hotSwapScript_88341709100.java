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

public class ScopedAliases_hotSwapScript_88341709100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51911;
     Object term51981;
     Object term53075;
     Object term53076;

    public ScopedAliases_hotSwapScript_88341709100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51911 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term51911, term51911.getClass(), "compiler", null);
        term51981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52141 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term51981, term51981.getClass(), "type", 0);
        setField(term51981, term51981.getClass(), "parent", null);
        setField(term52051, term52051.getClass(), "next", null);
        setIntField(term52051, term52051.getClass(), "type", 0);
        setField(term52051, term52051.getClass(), "first", term52141);
        setField(term51981, term51981.getClass(), "first", term52051);
        term53075 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term53075, term53075.getClass(), "compiler", null);
        setField(term53075, term53075.getClass(), "preprocessorSymbolTable", null);
        setField(term53075, term53075.getClass(), "transformationHandler", null);
        term53076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53078 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term53076, term53076.getClass(), "type", 0);
        setField(term53076, term53076.getClass(), "next", null);
        setIntField(term53077, term53077.getClass(), "type", 0);
        setField(term53077, term53077.getClass(), "next", null);
        setIntField(term53078, term53078.getClass(), "encodedSourceStart", 0);
        setIntField(term53078, term53078.getClass(), "encodedSourceEnd", 0);
        setField(term53078, term53078.getClass(), "sourceName", null);
        setIntField(term53078, term53078.getClass(), "baseLineno", 0);
        setIntField(term53078, term53078.getClass(), "endLineno", 0);
        setField(term53078, term53078.getClass(), "functions", null);
        setField(term53078, term53078.getClass(), "regexps", null);
        setField(term53078, term53078.getClass(), "itsVariables", null);
        setField(term53078, term53078.getClass(), "itsConst", null);
        setField(term53078, term53078.getClass(), "itsVariableNames", null);
        setIntField(term53078, term53078.getClass(), "varStart", 0);
        setField(term53078, term53078.getClass(), "compilerData", null);
        setIntField(term53078, term53078.getClass(), "type", 0);
        setField(term53078, term53078.getClass(), "next", null);
        setField(term53078, term53078.getClass(), "first", null);
        setField(term53078, term53078.getClass(), "last", null);
        setField(term53078, term53078.getClass(), "propListHead", null);
        setIntField(term53078, term53078.getClass(), "sourcePosition", 0);
        setField(term53078, term53078.getClass(), "jsType", null);
        setField(term53078, term53078.getClass(), "parent", null);
        setField(term53077, term53077.getClass(), "first", term53078);
        setField(term53077, term53077.getClass(), "last", null);
        setField(term53077, term53077.getClass(), "propListHead", null);
        setIntField(term53077, term53077.getClass(), "sourcePosition", 0);
        setField(term53077, term53077.getClass(), "jsType", null);
        setField(term53077, term53077.getClass(), "parent", null);
        setField(term53076, term53076.getClass(), "first", term53077);
        setField(term53076, term53076.getClass(), "last", null);
        setField(term53076, term53076.getClass(), "propListHead", null);
        setIntField(term53076, term53076.getClass(), "sourcePosition", 0);
        setField(term53076, term53076.getClass(), "jsType", null);
        setField(term53076, term53076.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term51981;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term51911, args);
        assertTrue(recursiveEquals(term51911, term53075));
        assertTrue(recursiveEquals(term51981, term53076));
    }

};


