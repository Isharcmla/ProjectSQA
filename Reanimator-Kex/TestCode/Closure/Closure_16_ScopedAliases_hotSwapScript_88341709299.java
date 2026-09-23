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

public class ScopedAliases_hotSwapScript_88341709299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195404;
     Object term195496;
     Object term196607;
     Object term196608;

    public ScopedAliases_hotSwapScript_88341709299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195404 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term195404, term195404.getClass(), "compiler", null);
        term195496 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195588 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195680 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195772 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195864 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term195496, term195496.getClass(), "type", 0);
        setField(term195496, term195496.getClass(), "parent", null);
        setField(term195680, term195680.getClass(), "next", null);
        setIntField(term195680, term195680.getClass(), "type", 37);
        setField(term195772, term195772.getClass(), "next", null);
        setIntField(term195772, term195772.getClass(), "type", 0);
        setField(term195772, term195772.getClass(), "first", null);
        setField(term195680, term195680.getClass(), "first", term195772);
        setField(term195588, term195588.getClass(), "next", term195680);
        setIntField(term195588, term195588.getClass(), "type", 0);
        setField(term195864, term195864.getClass(), "next", null);
        setIntField(term195864, term195864.getClass(), "type", 0);
        setField(term195864, term195864.getClass(), "first", null);
        setField(term195588, term195588.getClass(), "first", term195864);
        setField(term195496, term195496.getClass(), "first", term195588);
        term196607 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term196607, term196607.getClass(), "compiler", null);
        setField(term196607, term196607.getClass(), "preprocessorSymbolTable", null);
        setField(term196607, term196607.getClass(), "transformationHandler", null);
        term196608 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term196609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term196610 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term196611 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term196612 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term196608, term196608.getClass(), "number", 0.0);
        setIntField(term196608, term196608.getClass(), "type", 0);
        setField(term196608, term196608.getClass(), "next", null);
        setDoubleField(term196609, term196609.getClass(), "number", 0.0);
        setIntField(term196609, term196609.getClass(), "type", 0);
        setDoubleField(term196610, term196610.getClass(), "number", 0.0);
        setIntField(term196610, term196610.getClass(), "type", 37);
        setField(term196610, term196610.getClass(), "next", null);
        setDoubleField(term196611, term196611.getClass(), "number", 0.0);
        setIntField(term196611, term196611.getClass(), "type", 0);
        setField(term196611, term196611.getClass(), "next", null);
        setField(term196611, term196611.getClass(), "first", null);
        setField(term196611, term196611.getClass(), "last", null);
        setField(term196611, term196611.getClass(), "propListHead", null);
        setIntField(term196611, term196611.getClass(), "sourcePosition", 0);
        setField(term196611, term196611.getClass(), "jsType", null);
        setField(term196611, term196611.getClass(), "parent", null);
        setField(term196610, term196610.getClass(), "first", term196611);
        setField(term196610, term196610.getClass(), "last", null);
        setField(term196610, term196610.getClass(), "propListHead", null);
        setIntField(term196610, term196610.getClass(), "sourcePosition", 0);
        setField(term196610, term196610.getClass(), "jsType", null);
        setField(term196610, term196610.getClass(), "parent", null);
        setField(term196609, term196609.getClass(), "next", term196610);
        setDoubleField(term196612, term196612.getClass(), "number", 0.0);
        setIntField(term196612, term196612.getClass(), "type", 0);
        setField(term196612, term196612.getClass(), "next", null);
        setField(term196612, term196612.getClass(), "first", null);
        setField(term196612, term196612.getClass(), "last", null);
        setField(term196612, term196612.getClass(), "propListHead", null);
        setIntField(term196612, term196612.getClass(), "sourcePosition", 0);
        setField(term196612, term196612.getClass(), "jsType", null);
        setField(term196612, term196612.getClass(), "parent", null);
        setField(term196609, term196609.getClass(), "first", term196612);
        setField(term196609, term196609.getClass(), "last", null);
        setField(term196609, term196609.getClass(), "propListHead", null);
        setIntField(term196609, term196609.getClass(), "sourcePosition", 0);
        setField(term196609, term196609.getClass(), "jsType", null);
        setField(term196609, term196609.getClass(), "parent", null);
        setField(term196608, term196608.getClass(), "first", term196609);
        setField(term196608, term196608.getClass(), "last", null);
        setField(term196608, term196608.getClass(), "propListHead", null);
        setIntField(term196608, term196608.getClass(), "sourcePosition", 0);
        setField(term196608, term196608.getClass(), "jsType", null);
        setField(term196608, term196608.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term195496;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term195404, args);
        assertTrue(recursiveEquals(term195404, term196607));
        assertTrue(recursiveEquals(term195496, term196608));
    }

};


