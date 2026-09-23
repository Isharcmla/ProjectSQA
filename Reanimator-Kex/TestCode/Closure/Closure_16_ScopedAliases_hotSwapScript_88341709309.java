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

public class ScopedAliases_hotSwapScript_88341709309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202958;
     Object term203028;
     Object term203798;
     Object term203799;

    public ScopedAliases_hotSwapScript_88341709309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202958 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term202958, term202958.getClass(), "compiler", null);
        term203028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term203028, term203028.getClass(), "type", 0);
        setField(term203028, term203028.getClass(), "parent", null);
        setField(term203168, term203168.getClass(), "next", null);
        setIntField(term203168, term203168.getClass(), "type", 105);
        setField(term203098, term203098.getClass(), "next", term203168);
        setIntField(term203098, term203098.getClass(), "type", 0);
        setField(term203238, term203238.getClass(), "next", null);
        setIntField(term203238, term203238.getClass(), "type", 0);
        setField(term203238, term203238.getClass(), "first", null);
        setField(term203098, term203098.getClass(), "first", term203238);
        setField(term203028, term203028.getClass(), "first", term203098);
        term203798 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term203798, term203798.getClass(), "compiler", null);
        setField(term203798, term203798.getClass(), "preprocessorSymbolTable", null);
        setField(term203798, term203798.getClass(), "transformationHandler", null);
        term203799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term203799, term203799.getClass(), "type", 0);
        setField(term203799, term203799.getClass(), "next", null);
        setIntField(term203800, term203800.getClass(), "type", 0);
        setIntField(term203801, term203801.getClass(), "type", 105);
        setField(term203801, term203801.getClass(), "next", null);
        setField(term203801, term203801.getClass(), "first", null);
        setField(term203801, term203801.getClass(), "last", null);
        setField(term203801, term203801.getClass(), "propListHead", null);
        setIntField(term203801, term203801.getClass(), "sourcePosition", 0);
        setField(term203801, term203801.getClass(), "jsType", null);
        setField(term203801, term203801.getClass(), "parent", null);
        setField(term203800, term203800.getClass(), "next", term203801);
        setIntField(term203802, term203802.getClass(), "type", 0);
        setField(term203802, term203802.getClass(), "next", null);
        setField(term203802, term203802.getClass(), "first", null);
        setField(term203802, term203802.getClass(), "last", null);
        setField(term203802, term203802.getClass(), "propListHead", null);
        setIntField(term203802, term203802.getClass(), "sourcePosition", 0);
        setField(term203802, term203802.getClass(), "jsType", null);
        setField(term203802, term203802.getClass(), "parent", null);
        setField(term203800, term203800.getClass(), "first", term203802);
        setField(term203800, term203800.getClass(), "last", null);
        setField(term203800, term203800.getClass(), "propListHead", null);
        setIntField(term203800, term203800.getClass(), "sourcePosition", 0);
        setField(term203800, term203800.getClass(), "jsType", null);
        setField(term203800, term203800.getClass(), "parent", null);
        setField(term203799, term203799.getClass(), "first", term203800);
        setField(term203799, term203799.getClass(), "last", null);
        setField(term203799, term203799.getClass(), "propListHead", null);
        setIntField(term203799, term203799.getClass(), "sourcePosition", 0);
        setField(term203799, term203799.getClass(), "jsType", null);
        setField(term203799, term203799.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term203028;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term202958, args);
        assertTrue(recursiveEquals(term202958, term203798));
        assertTrue(recursiveEquals(term203028, term203799));
    }

};


