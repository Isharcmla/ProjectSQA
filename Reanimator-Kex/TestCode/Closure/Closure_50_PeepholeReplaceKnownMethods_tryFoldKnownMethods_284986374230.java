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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1180383;
     Object term1180475;
     Object term1181362;
     Object term1181363;
     Object term1181274;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1180383 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1180475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1180567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1180659 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1180567, term1180567.getClass(), "type", 35);
        setField(term1180567, term1180567.getClass(), "first", term1180659);
        setField(term1180475, term1180475.getClass(), "first", term1180567);
        setIntField(term1180475, term1180475.getClass(), "type", 37);
        term1181362 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1181362, term1181362.getClass(), "currentTraversal", null);
        term1181363 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1181364 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1181365 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term1181363, term1181363.getClass(), "str", null);
        setIntField(term1181363, term1181363.getClass(), "type", 37);
        setField(term1181363, term1181363.getClass(), "next", null);
        setField(term1181364, term1181364.getClass(), "str", null);
        setIntField(term1181364, term1181364.getClass(), "type", 35);
        setField(term1181364, term1181364.getClass(), "next", null);
        setField(term1181365, term1181365.getClass(), "str", null);
        setIntField(term1181365, term1181365.getClass(), "type", 0);
        setField(term1181365, term1181365.getClass(), "next", null);
        setField(term1181365, term1181365.getClass(), "first", null);
        setField(term1181365, term1181365.getClass(), "last", null);
        setField(term1181365, term1181365.getClass(), "propListHead", null);
        setIntField(term1181365, term1181365.getClass(), "sourcePosition", 0);
        setField(term1181365, term1181365.getClass(), "jsType", null);
        setField(term1181365, term1181365.getClass(), "parent", null);
        setField(term1181364, term1181364.getClass(), "first", term1181365);
        setField(term1181364, term1181364.getClass(), "last", null);
        setField(term1181364, term1181364.getClass(), "propListHead", null);
        setIntField(term1181364, term1181364.getClass(), "sourcePosition", 0);
        setField(term1181364, term1181364.getClass(), "jsType", null);
        setField(term1181364, term1181364.getClass(), "parent", null);
        setField(term1181363, term1181363.getClass(), "first", term1181364);
        setField(term1181363, term1181363.getClass(), "last", null);
        setField(term1181363, term1181363.getClass(), "propListHead", null);
        setIntField(term1181363, term1181363.getClass(), "sourcePosition", 0);
        setField(term1181363, term1181363.getClass(), "jsType", null);
        setField(term1181363, term1181363.getClass(), "parent", null);
        term1181274 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1181276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1181278 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term1181274, term1181274.getClass(), "str", null);
        setIntField(term1181274, term1181274.getClass(), "type", 37);
        setField(term1181274, term1181274.getClass(), "next", null);
        setField(term1181276, term1181276.getClass(), "str", null);
        setIntField(term1181276, term1181276.getClass(), "type", 35);
        setField(term1181276, term1181276.getClass(), "next", null);
        setField(term1181278, term1181278.getClass(), "str", null);
        setIntField(term1181278, term1181278.getClass(), "type", 0);
        setField(term1181278, term1181278.getClass(), "next", null);
        setField(term1181278, term1181278.getClass(), "first", null);
        setField(term1181278, term1181278.getClass(), "last", null);
        setField(term1181278, term1181278.getClass(), "propListHead", null);
        setIntField(term1181278, term1181278.getClass(), "sourcePosition", 0);
        setField(term1181278, term1181278.getClass(), "jsType", null);
        setField(term1181278, term1181278.getClass(), "parent", null);
        setField(term1181276, term1181276.getClass(), "first", term1181278);
        setField(term1181276, term1181276.getClass(), "last", null);
        setField(term1181276, term1181276.getClass(), "propListHead", null);
        setIntField(term1181276, term1181276.getClass(), "sourcePosition", 0);
        setField(term1181276, term1181276.getClass(), "jsType", null);
        setField(term1181276, term1181276.getClass(), "parent", null);
        setField(term1181274, term1181274.getClass(), "first", term1181276);
        setField(term1181274, term1181274.getClass(), "last", null);
        setField(term1181274, term1181274.getClass(), "propListHead", null);
        setIntField(term1181274, term1181274.getClass(), "sourcePosition", 0);
        setField(term1181274, term1181274.getClass(), "jsType", null);
        setField(term1181274, term1181274.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1180475;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term1180383, args);
        assertTrue(recursiveEquals(term1180383, term1181362));
        assertTrue(recursiveEquals(term1180475, term1181363));
        assertTrue(recursiveEquals(retValue, term1181274));
    }

};


