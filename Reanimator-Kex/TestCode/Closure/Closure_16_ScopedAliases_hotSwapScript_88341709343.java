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

public class ScopedAliases_hotSwapScript_88341709343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232457;
     Object term232549;
     Object term233808;
     Object term233809;

    public ScopedAliases_hotSwapScript_88341709343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232457 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term232457, term232457.getClass(), "compiler", null);
        term232549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term232619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term232689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term232781 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term232873 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term232965 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term232549, term232549.getClass(), "type", 0);
        setField(term232549, term232549.getClass(), "parent", null);
        setField(term232781, term232781.getClass(), "next", null);
        setIntField(term232781, term232781.getClass(), "type", 0);
        setField(term232781, term232781.getClass(), "first", null);
        setField(term232689, term232689.getClass(), "next", term232781);
        setIntField(term232689, term232689.getClass(), "type", 37);
        setField(term232873, term232873.getClass(), "next", null);
        setIntField(term232873, term232873.getClass(), "type", 0);
        setField(term232873, term232873.getClass(), "first", null);
        setField(term232689, term232689.getClass(), "first", term232873);
        setField(term232619, term232619.getClass(), "next", term232689);
        setIntField(term232619, term232619.getClass(), "type", 0);
        setField(term232965, term232965.getClass(), "next", null);
        setIntField(term232965, term232965.getClass(), "type", 0);
        setField(term232965, term232965.getClass(), "first", null);
        setField(term232619, term232619.getClass(), "first", term232965);
        setField(term232549, term232549.getClass(), "first", term232619);
        term233808 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term233808, term233808.getClass(), "compiler", null);
        setField(term233808, term233808.getClass(), "preprocessorSymbolTable", null);
        setField(term233808, term233808.getClass(), "transformationHandler", null);
        term233809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term233811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term233812 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233813 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233814 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term233809, term233809.getClass(), "number", 0.0);
        setIntField(term233809, term233809.getClass(), "type", 0);
        setField(term233809, term233809.getClass(), "next", null);
        setIntField(term233810, term233810.getClass(), "type", 0);
        setIntField(term233811, term233811.getClass(), "type", 37);
        setDoubleField(term233812, term233812.getClass(), "number", 0.0);
        setIntField(term233812, term233812.getClass(), "type", 0);
        setField(term233812, term233812.getClass(), "next", null);
        setField(term233812, term233812.getClass(), "first", null);
        setField(term233812, term233812.getClass(), "last", null);
        setField(term233812, term233812.getClass(), "propListHead", null);
        setIntField(term233812, term233812.getClass(), "sourcePosition", 0);
        setField(term233812, term233812.getClass(), "jsType", null);
        setField(term233812, term233812.getClass(), "parent", null);
        setField(term233811, term233811.getClass(), "next", term233812);
        setDoubleField(term233813, term233813.getClass(), "number", 0.0);
        setIntField(term233813, term233813.getClass(), "type", 0);
        setField(term233813, term233813.getClass(), "next", null);
        setField(term233813, term233813.getClass(), "first", null);
        setField(term233813, term233813.getClass(), "last", null);
        setField(term233813, term233813.getClass(), "propListHead", null);
        setIntField(term233813, term233813.getClass(), "sourcePosition", 0);
        setField(term233813, term233813.getClass(), "jsType", null);
        setField(term233813, term233813.getClass(), "parent", null);
        setField(term233811, term233811.getClass(), "first", term233813);
        setField(term233811, term233811.getClass(), "last", null);
        setField(term233811, term233811.getClass(), "propListHead", null);
        setIntField(term233811, term233811.getClass(), "sourcePosition", 0);
        setField(term233811, term233811.getClass(), "jsType", null);
        setField(term233811, term233811.getClass(), "parent", null);
        setField(term233810, term233810.getClass(), "next", term233811);
        setDoubleField(term233814, term233814.getClass(), "number", 0.0);
        setIntField(term233814, term233814.getClass(), "type", 0);
        setField(term233814, term233814.getClass(), "next", null);
        setField(term233814, term233814.getClass(), "first", null);
        setField(term233814, term233814.getClass(), "last", null);
        setField(term233814, term233814.getClass(), "propListHead", null);
        setIntField(term233814, term233814.getClass(), "sourcePosition", 0);
        setField(term233814, term233814.getClass(), "jsType", null);
        setField(term233814, term233814.getClass(), "parent", null);
        setField(term233810, term233810.getClass(), "first", term233814);
        setField(term233810, term233810.getClass(), "last", null);
        setField(term233810, term233810.getClass(), "propListHead", null);
        setIntField(term233810, term233810.getClass(), "sourcePosition", 0);
        setField(term233810, term233810.getClass(), "jsType", null);
        setField(term233810, term233810.getClass(), "parent", null);
        setField(term233809, term233809.getClass(), "first", term233810);
        setField(term233809, term233809.getClass(), "last", null);
        setField(term233809, term233809.getClass(), "propListHead", null);
        setIntField(term233809, term233809.getClass(), "sourcePosition", 0);
        setField(term233809, term233809.getClass(), "jsType", null);
        setField(term233809, term233809.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term232549;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term232457, args);
        assertTrue(recursiveEquals(term232457, term233808));
        assertTrue(recursiveEquals(term232549, term233809));
    }

};


