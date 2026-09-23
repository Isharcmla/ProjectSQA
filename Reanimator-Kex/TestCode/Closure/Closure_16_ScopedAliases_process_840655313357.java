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

public class ScopedAliases_process_840655313357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244108;
     Object term244200;
     Object term245268;
     Object term245269;

    public ScopedAliases_process_840655313357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244108 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term244108, term244108.getClass(), "compiler", null);
        term244200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244292 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term244200, term244200.getClass(), "type", 0);
        setField(term244200, term244200.getClass(), "parent", null);
        setField(term244362, term244362.getClass(), "next", null);
        setIntField(term244362, term244362.getClass(), "type", 0);
        setField(term244362, term244362.getClass(), "first", null);
        setField(term244292, term244292.getClass(), "next", term244362);
        setIntField(term244292, term244292.getClass(), "type", 0);
        setField(term244546, term244546.getClass(), "next", null);
        setIntField(term244546, term244546.getClass(), "type", 0);
        setField(term244546, term244546.getClass(), "first", null);
        setField(term244454, term244454.getClass(), "next", term244546);
        setIntField(term244454, term244454.getClass(), "type", 0);
        setField(term244454, term244454.getClass(), "first", null);
        setField(term244292, term244292.getClass(), "first", term244454);
        setField(term244200, term244200.getClass(), "first", term244292);
        term245268 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term245268, term245268.getClass(), "compiler", null);
        setField(term245268, term245268.getClass(), "preprocessorSymbolTable", null);
        setField(term245268, term245268.getClass(), "transformationHandler", null);
        term245269 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term245270 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term245271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245272 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term245273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term245269, term245269.getClass(), "number", 0.0);
        setIntField(term245269, term245269.getClass(), "type", 0);
        setField(term245269, term245269.getClass(), "next", null);
        setDoubleField(term245270, term245270.getClass(), "number", 0.0);
        setIntField(term245270, term245270.getClass(), "type", 0);
        setIntField(term245271, term245271.getClass(), "type", 0);
        setField(term245271, term245271.getClass(), "next", null);
        setField(term245271, term245271.getClass(), "first", null);
        setField(term245271, term245271.getClass(), "last", null);
        setField(term245271, term245271.getClass(), "propListHead", null);
        setIntField(term245271, term245271.getClass(), "sourcePosition", 0);
        setField(term245271, term245271.getClass(), "jsType", null);
        setField(term245271, term245271.getClass(), "parent", null);
        setField(term245270, term245270.getClass(), "next", term245271);
        setDoubleField(term245272, term245272.getClass(), "number", 0.0);
        setIntField(term245272, term245272.getClass(), "type", 0);
        setDoubleField(term245273, term245273.getClass(), "number", 0.0);
        setIntField(term245273, term245273.getClass(), "type", 0);
        setField(term245273, term245273.getClass(), "next", null);
        setField(term245273, term245273.getClass(), "first", null);
        setField(term245273, term245273.getClass(), "last", null);
        setField(term245273, term245273.getClass(), "propListHead", null);
        setIntField(term245273, term245273.getClass(), "sourcePosition", 0);
        setField(term245273, term245273.getClass(), "jsType", null);
        setField(term245273, term245273.getClass(), "parent", null);
        setField(term245272, term245272.getClass(), "next", term245273);
        setField(term245272, term245272.getClass(), "first", null);
        setField(term245272, term245272.getClass(), "last", null);
        setField(term245272, term245272.getClass(), "propListHead", null);
        setIntField(term245272, term245272.getClass(), "sourcePosition", 0);
        setField(term245272, term245272.getClass(), "jsType", null);
        setField(term245272, term245272.getClass(), "parent", null);
        setField(term245270, term245270.getClass(), "first", term245272);
        setField(term245270, term245270.getClass(), "last", null);
        setField(term245270, term245270.getClass(), "propListHead", null);
        setIntField(term245270, term245270.getClass(), "sourcePosition", 0);
        setField(term245270, term245270.getClass(), "jsType", null);
        setField(term245270, term245270.getClass(), "parent", null);
        setField(term245269, term245269.getClass(), "first", term245270);
        setField(term245269, term245269.getClass(), "last", null);
        setField(term245269, term245269.getClass(), "propListHead", null);
        setIntField(term245269, term245269.getClass(), "sourcePosition", 0);
        setField(term245269, term245269.getClass(), "jsType", null);
        setField(term245269, term245269.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term244200;
        callMethod(klass, "process", argTypes, term244108, args);
        assertTrue(recursiveEquals(term244108, term245268));
        assertTrue(recursiveEquals(term244200, null));
    }

};


