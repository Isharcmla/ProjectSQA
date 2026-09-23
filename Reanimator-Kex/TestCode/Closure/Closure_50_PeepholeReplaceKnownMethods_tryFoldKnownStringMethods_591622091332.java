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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2629154;
     Object term2629246;
     Object term2629648;
     Object term2629649;
     Object term2629590;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2629154 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2629246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2629338 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2629408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629500 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2629246, term2629246.getClass(), "type", 37);
        setIntField(term2629338, term2629338.getClass(), "type", 35);
        setField(term2629408, term2629408.getClass(), "next", term2629500);
        setIntField(term2629408, term2629408.getClass(), "type", 40);
        setField(term2629338, term2629338.getClass(), "first", term2629408);
        setField(term2629246, term2629246.getClass(), "first", term2629338);
        term2629648 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2629648, term2629648.getClass(), "currentTraversal", null);
        term2629649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2629650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2629651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term2629649, term2629649.getClass(), "number", 0.0);
        setIntField(term2629649, term2629649.getClass(), "type", 37);
        setField(term2629649, term2629649.getClass(), "next", null);
        setField(term2629650, term2629650.getClass(), "str", null);
        setIntField(term2629650, term2629650.getClass(), "type", 35);
        setField(term2629650, term2629650.getClass(), "next", null);
        setIntField(term2629651, term2629651.getClass(), "type", 40);
        setField(term2629652, term2629652.getClass(), "str", null);
        setIntField(term2629652, term2629652.getClass(), "type", 0);
        setField(term2629652, term2629652.getClass(), "next", null);
        setField(term2629652, term2629652.getClass(), "first", null);
        setField(term2629652, term2629652.getClass(), "last", null);
        setField(term2629652, term2629652.getClass(), "propListHead", null);
        setIntField(term2629652, term2629652.getClass(), "sourcePosition", 0);
        setField(term2629652, term2629652.getClass(), "jsType", null);
        setField(term2629652, term2629652.getClass(), "parent", null);
        setField(term2629651, term2629651.getClass(), "next", term2629652);
        setField(term2629651, term2629651.getClass(), "first", null);
        setField(term2629651, term2629651.getClass(), "last", null);
        setField(term2629651, term2629651.getClass(), "propListHead", null);
        setIntField(term2629651, term2629651.getClass(), "sourcePosition", 0);
        setField(term2629651, term2629651.getClass(), "jsType", null);
        setField(term2629651, term2629651.getClass(), "parent", null);
        setField(term2629650, term2629650.getClass(), "first", term2629651);
        setField(term2629650, term2629650.getClass(), "last", null);
        setField(term2629650, term2629650.getClass(), "propListHead", null);
        setIntField(term2629650, term2629650.getClass(), "sourcePosition", 0);
        setField(term2629650, term2629650.getClass(), "jsType", null);
        setField(term2629650, term2629650.getClass(), "parent", null);
        setField(term2629649, term2629649.getClass(), "first", term2629650);
        setField(term2629649, term2629649.getClass(), "last", null);
        setField(term2629649, term2629649.getClass(), "propListHead", null);
        setIntField(term2629649, term2629649.getClass(), "sourcePosition", 0);
        setField(term2629649, term2629649.getClass(), "jsType", null);
        setField(term2629649, term2629649.getClass(), "parent", null);
        term2629590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2629593 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2629595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629597 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term2629590, term2629590.getClass(), "number", 0.0);
        setIntField(term2629590, term2629590.getClass(), "type", 37);
        setField(term2629590, term2629590.getClass(), "next", null);
        setField(term2629593, term2629593.getClass(), "str", null);
        setIntField(term2629593, term2629593.getClass(), "type", 35);
        setField(term2629593, term2629593.getClass(), "next", null);
        setIntField(term2629595, term2629595.getClass(), "type", 40);
        setField(term2629597, term2629597.getClass(), "str", null);
        setIntField(term2629597, term2629597.getClass(), "type", 0);
        setField(term2629597, term2629597.getClass(), "next", null);
        setField(term2629597, term2629597.getClass(), "first", null);
        setField(term2629597, term2629597.getClass(), "last", null);
        setField(term2629597, term2629597.getClass(), "propListHead", null);
        setIntField(term2629597, term2629597.getClass(), "sourcePosition", 0);
        setField(term2629597, term2629597.getClass(), "jsType", null);
        setField(term2629597, term2629597.getClass(), "parent", null);
        setField(term2629595, term2629595.getClass(), "next", term2629597);
        setField(term2629595, term2629595.getClass(), "first", null);
        setField(term2629595, term2629595.getClass(), "last", null);
        setField(term2629595, term2629595.getClass(), "propListHead", null);
        setIntField(term2629595, term2629595.getClass(), "sourcePosition", 0);
        setField(term2629595, term2629595.getClass(), "jsType", null);
        setField(term2629595, term2629595.getClass(), "parent", null);
        setField(term2629593, term2629593.getClass(), "first", term2629595);
        setField(term2629593, term2629593.getClass(), "last", null);
        setField(term2629593, term2629593.getClass(), "propListHead", null);
        setIntField(term2629593, term2629593.getClass(), "sourcePosition", 0);
        setField(term2629593, term2629593.getClass(), "jsType", null);
        setField(term2629593, term2629593.getClass(), "parent", null);
        setField(term2629590, term2629590.getClass(), "first", term2629593);
        setField(term2629590, term2629590.getClass(), "last", null);
        setField(term2629590, term2629590.getClass(), "propListHead", null);
        setIntField(term2629590, term2629590.getClass(), "sourcePosition", 0);
        setField(term2629590, term2629590.getClass(), "jsType", null);
        setField(term2629590, term2629590.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2629246;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2629154, args);
        assertTrue(recursiveEquals(term2629154, term2629648));
        assertTrue(recursiveEquals(term2629246, term2629649));
        assertTrue(recursiveEquals(retValue, term2629590));
    }

};


