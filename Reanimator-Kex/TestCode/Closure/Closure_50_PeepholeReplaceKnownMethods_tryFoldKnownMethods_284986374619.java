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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3558417;
     Object term3558509;
     Object term3560067;
     Object term3560068;
     Object term3559776;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3558417 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3558509 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3558601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3558693 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3558785 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3558953 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3558601, term3558601.getClass(), "type", 35);
        setIntField(term3558785, term3558785.getClass(), "type", 40);
        setField(term3558785, term3558785.getClass(), "str", "substr");
        setField(term3558693, term3558693.getClass(), "next", term3558785);
        setIntField(term3558693, term3558693.getClass(), "type", 40);
        setField(term3558693, term3558693.getClass(), "str", "");
        setField(term3558601, term3558601.getClass(), "first", term3558693);
        setIntField(term3558953, term3558953.getClass(), "type", 39);
        setDoubleField(term3558953, term3558953.getClass(), "number", 4.7467945570144184E18);
        setField(term3558953, term3558953.getClass(), "next", null);
        setField(term3558601, term3558601.getClass(), "next", term3558953);
        setField(term3558509, term3558509.getClass(), "first", term3558601);
        setIntField(term3558509, term3558509.getClass(), "type", 37);
        term3560067 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3560067, term3560067.getClass(), "currentTraversal", null);
        term3560068 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3560069 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3560070 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3560071 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3560074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3560068, term3560068.getClass(), "str", null);
        setIntField(term3560068, term3560068.getClass(), "type", 37);
        setField(term3560068, term3560068.getClass(), "next", null);
        setField(term3560069, term3560069.getClass(), "str", null);
        setIntField(term3560069, term3560069.getClass(), "type", 35);
        setDoubleField(term3560070, term3560070.getClass(), "number", 4.7467945570144184E18);
        setIntField(term3560070, term3560070.getClass(), "type", 39);
        setField(term3560070, term3560070.getClass(), "next", null);
        setField(term3560070, term3560070.getClass(), "first", null);
        setField(term3560070, term3560070.getClass(), "last", null);
        setField(term3560070, term3560070.getClass(), "propListHead", null);
        setIntField(term3560070, term3560070.getClass(), "sourcePosition", 0);
        setField(term3560070, term3560070.getClass(), "jsType", null);
        setField(term3560070, term3560070.getClass(), "parent", null);
        setField(term3560069, term3560069.getClass(), "next", term3560070);
        setField(term3560071, term3560071.getClass(), "str", "");
        setIntField(term3560071, term3560071.getClass(), "type", 40);
        setField(term3560074, term3560074.getClass(), "str", "");
        setIntField(term3560074, term3560074.getClass(), "type", 40);
        setField(term3560074, term3560074.getClass(), "next", null);
        setField(term3560074, term3560074.getClass(), "first", null);
        setField(term3560074, term3560074.getClass(), "last", null);
        setField(term3560074, term3560074.getClass(), "propListHead", null);
        setIntField(term3560074, term3560074.getClass(), "sourcePosition", 0);
        setField(term3560074, term3560074.getClass(), "jsType", null);
        setField(term3560074, term3560074.getClass(), "parent", null);
        setField(term3560071, term3560071.getClass(), "next", term3560074);
        setField(term3560071, term3560071.getClass(), "first", null);
        setField(term3560071, term3560071.getClass(), "last", null);
        setField(term3560071, term3560071.getClass(), "propListHead", null);
        setIntField(term3560071, term3560071.getClass(), "sourcePosition", 0);
        setField(term3560071, term3560071.getClass(), "jsType", null);
        setField(term3560071, term3560071.getClass(), "parent", null);
        setField(term3560069, term3560069.getClass(), "first", term3560071);
        setField(term3560069, term3560069.getClass(), "last", null);
        setField(term3560069, term3560069.getClass(), "propListHead", null);
        setIntField(term3560069, term3560069.getClass(), "sourcePosition", 0);
        setField(term3560069, term3560069.getClass(), "jsType", null);
        setField(term3560069, term3560069.getClass(), "parent", null);
        setField(term3560068, term3560068.getClass(), "first", term3560069);
        setField(term3560068, term3560068.getClass(), "last", null);
        setField(term3560068, term3560068.getClass(), "propListHead", null);
        setIntField(term3560068, term3560068.getClass(), "sourcePosition", 0);
        setField(term3560068, term3560068.getClass(), "jsType", null);
        setField(term3560068, term3560068.getClass(), "parent", null);
        term3559776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3559778 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3559780 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3559784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3559788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3559776, term3559776.getClass(), "str", null);
        setIntField(term3559776, term3559776.getClass(), "type", 37);
        setField(term3559776, term3559776.getClass(), "next", null);
        setField(term3559778, term3559778.getClass(), "str", null);
        setIntField(term3559778, term3559778.getClass(), "type", 35);
        setDoubleField(term3559780, term3559780.getClass(), "number", 4.7467945570144184E18);
        setIntField(term3559780, term3559780.getClass(), "type", 39);
        setField(term3559780, term3559780.getClass(), "next", null);
        setField(term3559780, term3559780.getClass(), "first", null);
        setField(term3559780, term3559780.getClass(), "last", null);
        setField(term3559780, term3559780.getClass(), "propListHead", null);
        setIntField(term3559780, term3559780.getClass(), "sourcePosition", 0);
        setField(term3559780, term3559780.getClass(), "jsType", null);
        setField(term3559780, term3559780.getClass(), "parent", null);
        setField(term3559778, term3559778.getClass(), "next", term3559780);
        setField(term3559784, term3559784.getClass(), "str", "");
        setIntField(term3559784, term3559784.getClass(), "type", 40);
        setField(term3559788, term3559788.getClass(), "str", "");
        setIntField(term3559788, term3559788.getClass(), "type", 40);
        setField(term3559788, term3559788.getClass(), "next", null);
        setField(term3559788, term3559788.getClass(), "first", null);
        setField(term3559788, term3559788.getClass(), "last", null);
        setField(term3559788, term3559788.getClass(), "propListHead", null);
        setIntField(term3559788, term3559788.getClass(), "sourcePosition", 0);
        setField(term3559788, term3559788.getClass(), "jsType", null);
        setField(term3559788, term3559788.getClass(), "parent", null);
        setField(term3559784, term3559784.getClass(), "next", term3559788);
        setField(term3559784, term3559784.getClass(), "first", null);
        setField(term3559784, term3559784.getClass(), "last", null);
        setField(term3559784, term3559784.getClass(), "propListHead", null);
        setIntField(term3559784, term3559784.getClass(), "sourcePosition", 0);
        setField(term3559784, term3559784.getClass(), "jsType", null);
        setField(term3559784, term3559784.getClass(), "parent", null);
        setField(term3559778, term3559778.getClass(), "first", term3559784);
        setField(term3559778, term3559778.getClass(), "last", null);
        setField(term3559778, term3559778.getClass(), "propListHead", null);
        setIntField(term3559778, term3559778.getClass(), "sourcePosition", 0);
        setField(term3559778, term3559778.getClass(), "jsType", null);
        setField(term3559778, term3559778.getClass(), "parent", null);
        setField(term3559776, term3559776.getClass(), "first", term3559778);
        setField(term3559776, term3559776.getClass(), "last", null);
        setField(term3559776, term3559776.getClass(), "propListHead", null);
        setIntField(term3559776, term3559776.getClass(), "sourcePosition", 0);
        setField(term3559776, term3559776.getClass(), "jsType", null);
        setField(term3559776, term3559776.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3558509;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3558417, args);
        assertTrue(recursiveEquals(term3558417, term3560067));
        assertTrue(recursiveEquals(term3558509, term3560068));
        assertTrue(recursiveEquals(retValue, term3559776));
    }

};


