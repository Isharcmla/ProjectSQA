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

public class ScopedAliases_hotSwapScript_88341709265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169177;
     Object term169269;
     Object term170585;
     Object term170586;

    public ScopedAliases_hotSwapScript_88341709265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169177 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term169177, term169177.getClass(), "compiler", null);
        term169269 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term169339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term169593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term169685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term169269, term169269.getClass(), "type", 0);
        setField(term169269, term169269.getClass(), "parent", null);
        setField(term169409, term169409.getClass(), "next", term169501);
        setIntField(term169409, term169409.getClass(), "type", 37);
        setField(term169593, term169593.getClass(), "next", null);
        setIntField(term169593, term169593.getClass(), "type", 0);
        setField(term169593, term169593.getClass(), "first", null);
        setField(term169409, term169409.getClass(), "first", term169593);
        setField(term169339, term169339.getClass(), "next", term169409);
        setIntField(term169339, term169339.getClass(), "type", 0);
        setField(term169685, term169685.getClass(), "next", null);
        setIntField(term169685, term169685.getClass(), "type", 0);
        setField(term169685, term169685.getClass(), "first", null);
        setField(term169339, term169339.getClass(), "first", term169685);
        setField(term169269, term169269.getClass(), "first", term169339);
        term170585 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term170585, term170585.getClass(), "compiler", null);
        setField(term170585, term170585.getClass(), "preprocessorSymbolTable", null);
        setField(term170585, term170585.getClass(), "transformationHandler", null);
        term170586 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term170588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term170589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term170586, term170586.getClass(), "number", 0.0);
        setIntField(term170586, term170586.getClass(), "type", 0);
        setField(term170586, term170586.getClass(), "next", null);
        setIntField(term170587, term170587.getClass(), "type", 0);
        setIntField(term170588, term170588.getClass(), "type", 37);
        setDoubleField(term170589, term170589.getClass(), "number", 0.0);
        setIntField(term170589, term170589.getClass(), "type", 0);
        setField(term170589, term170589.getClass(), "next", null);
        setField(term170589, term170589.getClass(), "first", null);
        setField(term170589, term170589.getClass(), "last", null);
        setField(term170589, term170589.getClass(), "propListHead", null);
        setIntField(term170589, term170589.getClass(), "sourcePosition", 0);
        setField(term170589, term170589.getClass(), "jsType", null);
        setField(term170589, term170589.getClass(), "parent", null);
        setField(term170588, term170588.getClass(), "next", term170589);
        setDoubleField(term170590, term170590.getClass(), "number", 0.0);
        setIntField(term170590, term170590.getClass(), "type", 0);
        setField(term170590, term170590.getClass(), "next", null);
        setField(term170590, term170590.getClass(), "first", null);
        setField(term170590, term170590.getClass(), "last", null);
        setField(term170590, term170590.getClass(), "propListHead", null);
        setIntField(term170590, term170590.getClass(), "sourcePosition", 0);
        setField(term170590, term170590.getClass(), "jsType", null);
        setField(term170590, term170590.getClass(), "parent", null);
        setField(term170588, term170588.getClass(), "first", term170590);
        setField(term170588, term170588.getClass(), "last", null);
        setField(term170588, term170588.getClass(), "propListHead", null);
        setIntField(term170588, term170588.getClass(), "sourcePosition", 0);
        setField(term170588, term170588.getClass(), "jsType", null);
        setField(term170588, term170588.getClass(), "parent", null);
        setField(term170587, term170587.getClass(), "next", term170588);
        setDoubleField(term170591, term170591.getClass(), "number", 0.0);
        setIntField(term170591, term170591.getClass(), "type", 0);
        setField(term170591, term170591.getClass(), "next", null);
        setField(term170591, term170591.getClass(), "first", null);
        setField(term170591, term170591.getClass(), "last", null);
        setField(term170591, term170591.getClass(), "propListHead", null);
        setIntField(term170591, term170591.getClass(), "sourcePosition", 0);
        setField(term170591, term170591.getClass(), "jsType", null);
        setField(term170591, term170591.getClass(), "parent", null);
        setField(term170587, term170587.getClass(), "first", term170591);
        setField(term170587, term170587.getClass(), "last", null);
        setField(term170587, term170587.getClass(), "propListHead", null);
        setIntField(term170587, term170587.getClass(), "sourcePosition", 0);
        setField(term170587, term170587.getClass(), "jsType", null);
        setField(term170587, term170587.getClass(), "parent", null);
        setField(term170586, term170586.getClass(), "first", term170587);
        setField(term170586, term170586.getClass(), "last", null);
        setField(term170586, term170586.getClass(), "propListHead", null);
        setIntField(term170586, term170586.getClass(), "sourcePosition", 0);
        setField(term170586, term170586.getClass(), "jsType", null);
        setField(term170586, term170586.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term169269;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term169177, args);
        assertTrue(recursiveEquals(term169177, term170585));
        assertTrue(recursiveEquals(term169269, term170586));
    }

};


