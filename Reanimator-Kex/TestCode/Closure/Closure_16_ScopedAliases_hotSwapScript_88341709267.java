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

public class ScopedAliases_hotSwapScript_88341709267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171201;
     Object term171271;
     Object term172048;
     Object term172049;

    public ScopedAliases_hotSwapScript_88341709267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171201 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term171201, term171201.getClass(), "compiler", null);
        term171271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term171271, term171271.getClass(), "type", 0);
        setField(term171271, term171271.getClass(), "parent", null);
        setField(term171411, term171411.getClass(), "next", null);
        setIntField(term171411, term171411.getClass(), "type", 105);
        setField(term171341, term171341.getClass(), "next", term171411);
        setIntField(term171341, term171341.getClass(), "type", 0);
        setField(term171481, term171481.getClass(), "next", null);
        setIntField(term171481, term171481.getClass(), "type", 0);
        setField(term171481, term171481.getClass(), "first", null);
        setField(term171341, term171341.getClass(), "first", term171481);
        setField(term171271, term171271.getClass(), "first", term171341);
        term172048 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term172048, term172048.getClass(), "compiler", null);
        setField(term172048, term172048.getClass(), "preprocessorSymbolTable", null);
        setField(term172048, term172048.getClass(), "transformationHandler", null);
        term172049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term172049, term172049.getClass(), "type", 0);
        setField(term172049, term172049.getClass(), "next", null);
        setIntField(term172050, term172050.getClass(), "type", 0);
        setIntField(term172051, term172051.getClass(), "type", 105);
        setField(term172051, term172051.getClass(), "next", null);
        setField(term172051, term172051.getClass(), "first", null);
        setField(term172051, term172051.getClass(), "last", null);
        setField(term172051, term172051.getClass(), "propListHead", null);
        setIntField(term172051, term172051.getClass(), "sourcePosition", 0);
        setField(term172051, term172051.getClass(), "jsType", null);
        setField(term172051, term172051.getClass(), "parent", null);
        setField(term172050, term172050.getClass(), "next", term172051);
        setIntField(term172052, term172052.getClass(), "type", 0);
        setField(term172052, term172052.getClass(), "next", null);
        setField(term172052, term172052.getClass(), "first", null);
        setField(term172052, term172052.getClass(), "last", null);
        setField(term172052, term172052.getClass(), "propListHead", null);
        setIntField(term172052, term172052.getClass(), "sourcePosition", 0);
        setField(term172052, term172052.getClass(), "jsType", null);
        setField(term172052, term172052.getClass(), "parent", null);
        setField(term172050, term172050.getClass(), "first", term172052);
        setField(term172050, term172050.getClass(), "last", null);
        setField(term172050, term172050.getClass(), "propListHead", null);
        setIntField(term172050, term172050.getClass(), "sourcePosition", 0);
        setField(term172050, term172050.getClass(), "jsType", null);
        setField(term172050, term172050.getClass(), "parent", null);
        setField(term172049, term172049.getClass(), "first", term172050);
        setField(term172049, term172049.getClass(), "last", null);
        setField(term172049, term172049.getClass(), "propListHead", null);
        setIntField(term172049, term172049.getClass(), "sourcePosition", 0);
        setField(term172049, term172049.getClass(), "jsType", null);
        setField(term172049, term172049.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term171271;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term171201, args);
        assertTrue(recursiveEquals(term171201, term172048));
        assertTrue(recursiveEquals(term171271, term172049));
    }

};


