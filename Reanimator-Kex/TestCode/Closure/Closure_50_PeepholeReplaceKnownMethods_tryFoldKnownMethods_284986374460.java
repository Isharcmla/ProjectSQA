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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3218444;
     Object term3218536;
     Object term3219447;
     Object term3219448;
     Object term3219249;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3218444 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3218536 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3218628 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3218720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3218812 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3218942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3218628, term3218628.getClass(), "type", 35);
        setIntField(term3218812, term3218812.getClass(), "type", 40);
        setField(term3218812, term3218812.getClass(), "str", "");
        setField(term3218720, term3218720.getClass(), "next", term3218812);
        setIntField(term3218720, term3218720.getClass(), "type", 40);
        setField(term3218628, term3218628.getClass(), "first", term3218720);
        setIntField(term3218942, term3218942.getClass(), "type", 41);
        setField(term3218628, term3218628.getClass(), "next", term3218942);
        setField(term3218536, term3218536.getClass(), "first", term3218628);
        setIntField(term3218536, term3218536.getClass(), "type", 37);
        term3219447 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3219447, term3219447.getClass(), "currentTraversal", null);
        term3219448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219449 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219450 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3219451 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3219448, term3219448.getClass(), "str", null);
        setIntField(term3219448, term3219448.getClass(), "type", 37);
        setField(term3219448, term3219448.getClass(), "next", null);
        setField(term3219449, term3219449.getClass(), "str", null);
        setIntField(term3219449, term3219449.getClass(), "type", 35);
        setDoubleField(term3219450, term3219450.getClass(), "number", 0.0);
        setIntField(term3219450, term3219450.getClass(), "type", 41);
        setField(term3219450, term3219450.getClass(), "next", null);
        setField(term3219450, term3219450.getClass(), "first", null);
        setField(term3219450, term3219450.getClass(), "last", null);
        setField(term3219450, term3219450.getClass(), "propListHead", null);
        setIntField(term3219450, term3219450.getClass(), "sourcePosition", 0);
        setField(term3219450, term3219450.getClass(), "jsType", null);
        setField(term3219450, term3219450.getClass(), "parent", null);
        setField(term3219449, term3219449.getClass(), "next", term3219450);
        setField(term3219451, term3219451.getClass(), "str", null);
        setIntField(term3219451, term3219451.getClass(), "type", 40);
        setField(term3219452, term3219452.getClass(), "str", "");
        setIntField(term3219452, term3219452.getClass(), "type", 40);
        setField(term3219452, term3219452.getClass(), "next", null);
        setField(term3219452, term3219452.getClass(), "first", null);
        setField(term3219452, term3219452.getClass(), "last", null);
        setField(term3219452, term3219452.getClass(), "propListHead", null);
        setIntField(term3219452, term3219452.getClass(), "sourcePosition", 0);
        setField(term3219452, term3219452.getClass(), "jsType", null);
        setField(term3219452, term3219452.getClass(), "parent", null);
        setField(term3219451, term3219451.getClass(), "next", term3219452);
        setField(term3219451, term3219451.getClass(), "first", null);
        setField(term3219451, term3219451.getClass(), "last", null);
        setField(term3219451, term3219451.getClass(), "propListHead", null);
        setIntField(term3219451, term3219451.getClass(), "sourcePosition", 0);
        setField(term3219451, term3219451.getClass(), "jsType", null);
        setField(term3219451, term3219451.getClass(), "parent", null);
        setField(term3219449, term3219449.getClass(), "first", term3219451);
        setField(term3219449, term3219449.getClass(), "last", null);
        setField(term3219449, term3219449.getClass(), "propListHead", null);
        setIntField(term3219449, term3219449.getClass(), "sourcePosition", 0);
        setField(term3219449, term3219449.getClass(), "jsType", null);
        setField(term3219449, term3219449.getClass(), "parent", null);
        setField(term3219448, term3219448.getClass(), "first", term3219449);
        setField(term3219448, term3219448.getClass(), "last", null);
        setField(term3219448, term3219448.getClass(), "propListHead", null);
        setIntField(term3219448, term3219448.getClass(), "sourcePosition", 0);
        setField(term3219448, term3219448.getClass(), "jsType", null);
        setField(term3219448, term3219448.getClass(), "parent", null);
        term3219249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219251 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219253 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3219257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3219249, term3219249.getClass(), "str", null);
        setIntField(term3219249, term3219249.getClass(), "type", 37);
        setField(term3219249, term3219249.getClass(), "next", null);
        setField(term3219251, term3219251.getClass(), "str", null);
        setIntField(term3219251, term3219251.getClass(), "type", 35);
        setDoubleField(term3219253, term3219253.getClass(), "number", 0.0);
        setIntField(term3219253, term3219253.getClass(), "type", 41);
        setField(term3219253, term3219253.getClass(), "next", null);
        setField(term3219253, term3219253.getClass(), "first", null);
        setField(term3219253, term3219253.getClass(), "last", null);
        setField(term3219253, term3219253.getClass(), "propListHead", null);
        setIntField(term3219253, term3219253.getClass(), "sourcePosition", 0);
        setField(term3219253, term3219253.getClass(), "jsType", null);
        setField(term3219253, term3219253.getClass(), "parent", null);
        setField(term3219251, term3219251.getClass(), "next", term3219253);
        setField(term3219257, term3219257.getClass(), "str", null);
        setIntField(term3219257, term3219257.getClass(), "type", 40);
        setField(term3219259, term3219259.getClass(), "str", "");
        setIntField(term3219259, term3219259.getClass(), "type", 40);
        setField(term3219259, term3219259.getClass(), "next", null);
        setField(term3219259, term3219259.getClass(), "first", null);
        setField(term3219259, term3219259.getClass(), "last", null);
        setField(term3219259, term3219259.getClass(), "propListHead", null);
        setIntField(term3219259, term3219259.getClass(), "sourcePosition", 0);
        setField(term3219259, term3219259.getClass(), "jsType", null);
        setField(term3219259, term3219259.getClass(), "parent", null);
        setField(term3219257, term3219257.getClass(), "next", term3219259);
        setField(term3219257, term3219257.getClass(), "first", null);
        setField(term3219257, term3219257.getClass(), "last", null);
        setField(term3219257, term3219257.getClass(), "propListHead", null);
        setIntField(term3219257, term3219257.getClass(), "sourcePosition", 0);
        setField(term3219257, term3219257.getClass(), "jsType", null);
        setField(term3219257, term3219257.getClass(), "parent", null);
        setField(term3219251, term3219251.getClass(), "first", term3219257);
        setField(term3219251, term3219251.getClass(), "last", null);
        setField(term3219251, term3219251.getClass(), "propListHead", null);
        setIntField(term3219251, term3219251.getClass(), "sourcePosition", 0);
        setField(term3219251, term3219251.getClass(), "jsType", null);
        setField(term3219251, term3219251.getClass(), "parent", null);
        setField(term3219249, term3219249.getClass(), "first", term3219251);
        setField(term3219249, term3219249.getClass(), "last", null);
        setField(term3219249, term3219249.getClass(), "propListHead", null);
        setIntField(term3219249, term3219249.getClass(), "sourcePosition", 0);
        setField(term3219249, term3219249.getClass(), "jsType", null);
        setField(term3219249, term3219249.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3218536;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3218444, args);
        assertTrue(recursiveEquals(term3218444, term3219447));
        assertTrue(recursiveEquals(term3218536, term3219448));
        assertTrue(recursiveEquals(retValue, term3219249));
    }

};


