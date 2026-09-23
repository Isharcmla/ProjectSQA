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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3214001;
     Object term3214093;
     Object term3215428;
     Object term3215429;
     Object term3215144;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3214001 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3214093 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3214185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3214277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3214369 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3214499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3214185, term3214185.getClass(), "type", 35);
        setIntField(term3214369, term3214369.getClass(), "type", 40);
        setField(term3214369, term3214369.getClass(), "str", "substring");
        setField(term3214277, term3214277.getClass(), "next", term3214369);
        setIntField(term3214277, term3214277.getClass(), "type", 40);
        setField(term3214185, term3214185.getClass(), "first", term3214277);
        setIntField(term3214499, term3214499.getClass(), "type", 40);
        setField(term3214185, term3214185.getClass(), "next", term3214499);
        setField(term3214093, term3214093.getClass(), "first", term3214185);
        setIntField(term3214093, term3214093.getClass(), "type", 37);
        term3215428 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3215428, term3215428.getClass(), "currentTraversal", null);
        term3215429 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3215429, term3215429.getClass(), "str", null);
        setIntField(term3215429, term3215429.getClass(), "type", 37);
        setField(term3215429, term3215429.getClass(), "next", null);
        setField(term3215430, term3215430.getClass(), "str", null);
        setIntField(term3215430, term3215430.getClass(), "type", 35);
        setField(term3215431, term3215431.getClass(), "str", null);
        setIntField(term3215431, term3215431.getClass(), "type", 40);
        setField(term3215431, term3215431.getClass(), "next", null);
        setField(term3215431, term3215431.getClass(), "first", null);
        setField(term3215431, term3215431.getClass(), "last", null);
        setField(term3215431, term3215431.getClass(), "propListHead", null);
        setIntField(term3215431, term3215431.getClass(), "sourcePosition", 0);
        setField(term3215431, term3215431.getClass(), "jsType", null);
        setField(term3215431, term3215431.getClass(), "parent", null);
        setField(term3215430, term3215430.getClass(), "next", term3215431);
        setField(term3215432, term3215432.getClass(), "str", null);
        setIntField(term3215432, term3215432.getClass(), "type", 40);
        setField(term3215433, term3215433.getClass(), "str", "");
        setIntField(term3215433, term3215433.getClass(), "type", 40);
        setField(term3215433, term3215433.getClass(), "next", null);
        setField(term3215433, term3215433.getClass(), "first", null);
        setField(term3215433, term3215433.getClass(), "last", null);
        setField(term3215433, term3215433.getClass(), "propListHead", null);
        setIntField(term3215433, term3215433.getClass(), "sourcePosition", 0);
        setField(term3215433, term3215433.getClass(), "jsType", null);
        setField(term3215433, term3215433.getClass(), "parent", null);
        setField(term3215432, term3215432.getClass(), "next", term3215433);
        setField(term3215432, term3215432.getClass(), "first", null);
        setField(term3215432, term3215432.getClass(), "last", null);
        setField(term3215432, term3215432.getClass(), "propListHead", null);
        setIntField(term3215432, term3215432.getClass(), "sourcePosition", 0);
        setField(term3215432, term3215432.getClass(), "jsType", null);
        setField(term3215432, term3215432.getClass(), "parent", null);
        setField(term3215430, term3215430.getClass(), "first", term3215432);
        setField(term3215430, term3215430.getClass(), "last", null);
        setField(term3215430, term3215430.getClass(), "propListHead", null);
        setIntField(term3215430, term3215430.getClass(), "sourcePosition", 0);
        setField(term3215430, term3215430.getClass(), "jsType", null);
        setField(term3215430, term3215430.getClass(), "parent", null);
        setField(term3215429, term3215429.getClass(), "first", term3215430);
        setField(term3215429, term3215429.getClass(), "last", null);
        setField(term3215429, term3215429.getClass(), "propListHead", null);
        setIntField(term3215429, term3215429.getClass(), "sourcePosition", 0);
        setField(term3215429, term3215429.getClass(), "jsType", null);
        setField(term3215429, term3215429.getClass(), "parent", null);
        term3215144 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215148 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215151 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215153 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3215144, term3215144.getClass(), "str", null);
        setIntField(term3215144, term3215144.getClass(), "type", 37);
        setField(term3215144, term3215144.getClass(), "next", null);
        setField(term3215146, term3215146.getClass(), "str", null);
        setIntField(term3215146, term3215146.getClass(), "type", 35);
        setField(term3215148, term3215148.getClass(), "str", null);
        setIntField(term3215148, term3215148.getClass(), "type", 40);
        setField(term3215148, term3215148.getClass(), "next", null);
        setField(term3215148, term3215148.getClass(), "first", null);
        setField(term3215148, term3215148.getClass(), "last", null);
        setField(term3215148, term3215148.getClass(), "propListHead", null);
        setIntField(term3215148, term3215148.getClass(), "sourcePosition", 0);
        setField(term3215148, term3215148.getClass(), "jsType", null);
        setField(term3215148, term3215148.getClass(), "parent", null);
        setField(term3215146, term3215146.getClass(), "next", term3215148);
        setField(term3215151, term3215151.getClass(), "str", null);
        setIntField(term3215151, term3215151.getClass(), "type", 40);
        setField(term3215153, term3215153.getClass(), "str", "");
        setIntField(term3215153, term3215153.getClass(), "type", 40);
        setField(term3215153, term3215153.getClass(), "next", null);
        setField(term3215153, term3215153.getClass(), "first", null);
        setField(term3215153, term3215153.getClass(), "last", null);
        setField(term3215153, term3215153.getClass(), "propListHead", null);
        setIntField(term3215153, term3215153.getClass(), "sourcePosition", 0);
        setField(term3215153, term3215153.getClass(), "jsType", null);
        setField(term3215153, term3215153.getClass(), "parent", null);
        setField(term3215151, term3215151.getClass(), "next", term3215153);
        setField(term3215151, term3215151.getClass(), "first", null);
        setField(term3215151, term3215151.getClass(), "last", null);
        setField(term3215151, term3215151.getClass(), "propListHead", null);
        setIntField(term3215151, term3215151.getClass(), "sourcePosition", 0);
        setField(term3215151, term3215151.getClass(), "jsType", null);
        setField(term3215151, term3215151.getClass(), "parent", null);
        setField(term3215146, term3215146.getClass(), "first", term3215151);
        setField(term3215146, term3215146.getClass(), "last", null);
        setField(term3215146, term3215146.getClass(), "propListHead", null);
        setIntField(term3215146, term3215146.getClass(), "sourcePosition", 0);
        setField(term3215146, term3215146.getClass(), "jsType", null);
        setField(term3215146, term3215146.getClass(), "parent", null);
        setField(term3215144, term3215144.getClass(), "first", term3215146);
        setField(term3215144, term3215144.getClass(), "last", null);
        setField(term3215144, term3215144.getClass(), "propListHead", null);
        setIntField(term3215144, term3215144.getClass(), "sourcePosition", 0);
        setField(term3215144, term3215144.getClass(), "jsType", null);
        setField(term3215144, term3215144.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3214093;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3214001, args);
        assertTrue(recursiveEquals(term3214001, term3215428));
        assertTrue(recursiveEquals(term3214093, term3215429));
        assertTrue(recursiveEquals(retValue, term3215144));
    }

};


