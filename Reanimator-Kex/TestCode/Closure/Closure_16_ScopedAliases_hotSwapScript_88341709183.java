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

public class ScopedAliases_hotSwapScript_88341709183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110264;
     Object term110334;
     Object term111653;
     Object term111654;

    public ScopedAliases_hotSwapScript_88341709183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110264 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term110264, term110264.getClass(), "compiler", null);
        term110334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term110636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term110334, term110334.getClass(), "type", 0);
        setField(term110334, term110334.getClass(), "parent", null);
        setField(term110474, term110474.getClass(), "next", null);
        setIntField(term110474, term110474.getClass(), "type", 37);
        setField(term110566, term110566.getClass(), "next", null);
        setIntField(term110566, term110566.getClass(), "type", 0);
        setField(term110566, term110566.getClass(), "first", null);
        setField(term110474, term110474.getClass(), "first", term110566);
        setField(term110404, term110404.getClass(), "next", term110474);
        setIntField(term110404, term110404.getClass(), "type", 0);
        setField(term110636, term110636.getClass(), "next", null);
        setIntField(term110636, term110636.getClass(), "type", 0);
        setField(term110636, term110636.getClass(), "first", null);
        setField(term110404, term110404.getClass(), "first", term110636);
        setField(term110334, term110334.getClass(), "first", term110404);
        term111653 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term111653, term111653.getClass(), "compiler", null);
        setField(term111653, term111653.getClass(), "preprocessorSymbolTable", null);
        setField(term111653, term111653.getClass(), "transformationHandler", null);
        term111654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term111658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term111654, term111654.getClass(), "type", 0);
        setField(term111654, term111654.getClass(), "next", null);
        setIntField(term111655, term111655.getClass(), "type", 0);
        setIntField(term111656, term111656.getClass(), "type", 37);
        setField(term111656, term111656.getClass(), "next", null);
        setDoubleField(term111657, term111657.getClass(), "number", 0.0);
        setIntField(term111657, term111657.getClass(), "type", 0);
        setField(term111657, term111657.getClass(), "next", null);
        setField(term111657, term111657.getClass(), "first", null);
        setField(term111657, term111657.getClass(), "last", null);
        setField(term111657, term111657.getClass(), "propListHead", null);
        setIntField(term111657, term111657.getClass(), "sourcePosition", 0);
        setField(term111657, term111657.getClass(), "jsType", null);
        setField(term111657, term111657.getClass(), "parent", null);
        setField(term111656, term111656.getClass(), "first", term111657);
        setField(term111656, term111656.getClass(), "last", null);
        setField(term111656, term111656.getClass(), "propListHead", null);
        setIntField(term111656, term111656.getClass(), "sourcePosition", 0);
        setField(term111656, term111656.getClass(), "jsType", null);
        setField(term111656, term111656.getClass(), "parent", null);
        setField(term111655, term111655.getClass(), "next", term111656);
        setIntField(term111658, term111658.getClass(), "type", 0);
        setField(term111658, term111658.getClass(), "next", null);
        setField(term111658, term111658.getClass(), "first", null);
        setField(term111658, term111658.getClass(), "last", null);
        setField(term111658, term111658.getClass(), "propListHead", null);
        setIntField(term111658, term111658.getClass(), "sourcePosition", 0);
        setField(term111658, term111658.getClass(), "jsType", null);
        setField(term111658, term111658.getClass(), "parent", null);
        setField(term111655, term111655.getClass(), "first", term111658);
        setField(term111655, term111655.getClass(), "last", null);
        setField(term111655, term111655.getClass(), "propListHead", null);
        setIntField(term111655, term111655.getClass(), "sourcePosition", 0);
        setField(term111655, term111655.getClass(), "jsType", null);
        setField(term111655, term111655.getClass(), "parent", null);
        setField(term111654, term111654.getClass(), "first", term111655);
        setField(term111654, term111654.getClass(), "last", null);
        setField(term111654, term111654.getClass(), "propListHead", null);
        setIntField(term111654, term111654.getClass(), "sourcePosition", 0);
        setField(term111654, term111654.getClass(), "jsType", null);
        setField(term111654, term111654.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term110334;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term110264, args);
        assertTrue(recursiveEquals(term110264, term111653));
        assertTrue(recursiveEquals(term110334, term111654));
    }

};


