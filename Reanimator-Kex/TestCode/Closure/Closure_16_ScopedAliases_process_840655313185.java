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

public class ScopedAliases_process_840655313185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112244;
     Object term112336;
     Object term113262;
     Object term113263;

    public ScopedAliases_process_840655313185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112244 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term112244, term112244.getClass(), "compiler", null);
        term112336 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term112428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term112520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term112612 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term112336, term112336.getClass(), "type", 37);
        setField(term112336, term112336.getClass(), "parent", null);
        setField(term112520, term112520.getClass(), "next", null);
        setIntField(term112520, term112520.getClass(), "type", 0);
        setField(term112520, term112520.getClass(), "first", null);
        setField(term112428, term112428.getClass(), "next", term112520);
        setIntField(term112428, term112428.getClass(), "type", 0);
        setField(term112612, term112612.getClass(), "next", null);
        setIntField(term112612, term112612.getClass(), "type", 0);
        setField(term112612, term112612.getClass(), "first", null);
        setField(term112428, term112428.getClass(), "first", term112612);
        setField(term112336, term112336.getClass(), "first", term112428);
        term113262 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term113262, term113262.getClass(), "compiler", null);
        setField(term113262, term113262.getClass(), "preprocessorSymbolTable", null);
        setField(term113262, term113262.getClass(), "transformationHandler", null);
        term113263 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113264 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113265 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term113266 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term113263, term113263.getClass(), "number", 0.0);
        setIntField(term113263, term113263.getClass(), "type", 37);
        setField(term113263, term113263.getClass(), "next", null);
        setDoubleField(term113264, term113264.getClass(), "number", 0.0);
        setIntField(term113264, term113264.getClass(), "type", 0);
        setDoubleField(term113265, term113265.getClass(), "number", 0.0);
        setIntField(term113265, term113265.getClass(), "type", 0);
        setField(term113265, term113265.getClass(), "next", null);
        setField(term113265, term113265.getClass(), "first", null);
        setField(term113265, term113265.getClass(), "last", null);
        setField(term113265, term113265.getClass(), "propListHead", null);
        setIntField(term113265, term113265.getClass(), "sourcePosition", 0);
        setField(term113265, term113265.getClass(), "jsType", null);
        setField(term113265, term113265.getClass(), "parent", null);
        setField(term113264, term113264.getClass(), "next", term113265);
        setDoubleField(term113266, term113266.getClass(), "number", 0.0);
        setIntField(term113266, term113266.getClass(), "type", 0);
        setField(term113266, term113266.getClass(), "next", null);
        setField(term113266, term113266.getClass(), "first", null);
        setField(term113266, term113266.getClass(), "last", null);
        setField(term113266, term113266.getClass(), "propListHead", null);
        setIntField(term113266, term113266.getClass(), "sourcePosition", 0);
        setField(term113266, term113266.getClass(), "jsType", null);
        setField(term113266, term113266.getClass(), "parent", null);
        setField(term113264, term113264.getClass(), "first", term113266);
        setField(term113264, term113264.getClass(), "last", null);
        setField(term113264, term113264.getClass(), "propListHead", null);
        setIntField(term113264, term113264.getClass(), "sourcePosition", 0);
        setField(term113264, term113264.getClass(), "jsType", null);
        setField(term113264, term113264.getClass(), "parent", null);
        setField(term113263, term113263.getClass(), "first", term113264);
        setField(term113263, term113263.getClass(), "last", null);
        setField(term113263, term113263.getClass(), "propListHead", null);
        setIntField(term113263, term113263.getClass(), "sourcePosition", 0);
        setField(term113263, term113263.getClass(), "jsType", null);
        setField(term113263, term113263.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term112336;
        callMethod(klass, "process", argTypes, term112244, args);
        assertTrue(recursiveEquals(term112244, term113262));
        assertTrue(recursiveEquals(term112336, null));
    }

};


