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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3514195;
     Object term3514287;
     Object term3515591;
     Object term3515592;
     Object term3515357;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3514195 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3514287 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3514379 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3514471 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3514563 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3514691 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term3514379, term3514379.getClass(), "type", 35);
        setIntField(term3514563, term3514563.getClass(), "type", 40);
        setField(term3514563, term3514563.getClass(), "str", "");
        setField(term3514471, term3514471.getClass(), "next", term3514563);
        setIntField(term3514471, term3514471.getClass(), "type", 40);
        setField(term3514379, term3514379.getClass(), "first", term3514471);
        setIntField(term3514691, term3514691.getClass(), "type", 41);
        setField(term3514379, term3514379.getClass(), "next", term3514691);
        setField(term3514287, term3514287.getClass(), "first", term3514379);
        setIntField(term3514287, term3514287.getClass(), "type", 37);
        term3515591 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3515591, term3515591.getClass(), "currentTraversal", null);
        term3515592 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3515593 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3515594 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term3515595 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3515596 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3515592, term3515592.getClass(), "str", null);
        setIntField(term3515592, term3515592.getClass(), "type", 37);
        setField(term3515592, term3515592.getClass(), "next", null);
        setField(term3515593, term3515593.getClass(), "str", null);
        setIntField(term3515593, term3515593.getClass(), "type", 35);
        setIntField(term3515594, term3515594.getClass(), "encodedSourceStart", 0);
        setIntField(term3515594, term3515594.getClass(), "encodedSourceEnd", 0);
        setField(term3515594, term3515594.getClass(), "sourceName", null);
        setIntField(term3515594, term3515594.getClass(), "baseLineno", 0);
        setIntField(term3515594, term3515594.getClass(), "endLineno", 0);
        setField(term3515594, term3515594.getClass(), "functions", null);
        setField(term3515594, term3515594.getClass(), "regexps", null);
        setField(term3515594, term3515594.getClass(), "itsVariables", null);
        setField(term3515594, term3515594.getClass(), "itsConst", null);
        setField(term3515594, term3515594.getClass(), "itsVariableNames", null);
        setIntField(term3515594, term3515594.getClass(), "varStart", 0);
        setField(term3515594, term3515594.getClass(), "compilerData", null);
        setIntField(term3515594, term3515594.getClass(), "type", 41);
        setField(term3515594, term3515594.getClass(), "next", null);
        setField(term3515594, term3515594.getClass(), "first", null);
        setField(term3515594, term3515594.getClass(), "last", null);
        setField(term3515594, term3515594.getClass(), "propListHead", null);
        setIntField(term3515594, term3515594.getClass(), "sourcePosition", 0);
        setField(term3515594, term3515594.getClass(), "jsType", null);
        setField(term3515594, term3515594.getClass(), "parent", null);
        setField(term3515593, term3515593.getClass(), "next", term3515594);
        setField(term3515595, term3515595.getClass(), "str", null);
        setIntField(term3515595, term3515595.getClass(), "type", 40);
        setField(term3515596, term3515596.getClass(), "str", "");
        setIntField(term3515596, term3515596.getClass(), "type", 40);
        setField(term3515596, term3515596.getClass(), "next", null);
        setField(term3515596, term3515596.getClass(), "first", null);
        setField(term3515596, term3515596.getClass(), "last", null);
        setField(term3515596, term3515596.getClass(), "propListHead", null);
        setIntField(term3515596, term3515596.getClass(), "sourcePosition", 0);
        setField(term3515596, term3515596.getClass(), "jsType", null);
        setField(term3515596, term3515596.getClass(), "parent", null);
        setField(term3515595, term3515595.getClass(), "next", term3515596);
        setField(term3515595, term3515595.getClass(), "first", null);
        setField(term3515595, term3515595.getClass(), "last", null);
        setField(term3515595, term3515595.getClass(), "propListHead", null);
        setIntField(term3515595, term3515595.getClass(), "sourcePosition", 0);
        setField(term3515595, term3515595.getClass(), "jsType", null);
        setField(term3515595, term3515595.getClass(), "parent", null);
        setField(term3515593, term3515593.getClass(), "first", term3515595);
        setField(term3515593, term3515593.getClass(), "last", null);
        setField(term3515593, term3515593.getClass(), "propListHead", null);
        setIntField(term3515593, term3515593.getClass(), "sourcePosition", 0);
        setField(term3515593, term3515593.getClass(), "jsType", null);
        setField(term3515593, term3515593.getClass(), "parent", null);
        setField(term3515592, term3515592.getClass(), "first", term3515593);
        setField(term3515592, term3515592.getClass(), "last", null);
        setField(term3515592, term3515592.getClass(), "propListHead", null);
        setIntField(term3515592, term3515592.getClass(), "sourcePosition", 0);
        setField(term3515592, term3515592.getClass(), "jsType", null);
        setField(term3515592, term3515592.getClass(), "parent", null);
        term3515357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3515359 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3515361 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term3515369 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3515371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3515357, term3515357.getClass(), "str", null);
        setIntField(term3515357, term3515357.getClass(), "type", 37);
        setField(term3515357, term3515357.getClass(), "next", null);
        setField(term3515359, term3515359.getClass(), "str", null);
        setIntField(term3515359, term3515359.getClass(), "type", 35);
        setIntField(term3515361, term3515361.getClass(), "encodedSourceStart", 0);
        setIntField(term3515361, term3515361.getClass(), "encodedSourceEnd", 0);
        setField(term3515361, term3515361.getClass(), "sourceName", null);
        setIntField(term3515361, term3515361.getClass(), "baseLineno", 0);
        setIntField(term3515361, term3515361.getClass(), "endLineno", 0);
        setField(term3515361, term3515361.getClass(), "functions", null);
        setField(term3515361, term3515361.getClass(), "regexps", null);
        setField(term3515361, term3515361.getClass(), "itsVariables", null);
        setField(term3515361, term3515361.getClass(), "itsConst", null);
        setField(term3515361, term3515361.getClass(), "itsVariableNames", null);
        setIntField(term3515361, term3515361.getClass(), "varStart", 0);
        setField(term3515361, term3515361.getClass(), "compilerData", null);
        setIntField(term3515361, term3515361.getClass(), "type", 41);
        setField(term3515361, term3515361.getClass(), "next", null);
        setField(term3515361, term3515361.getClass(), "first", null);
        setField(term3515361, term3515361.getClass(), "last", null);
        setField(term3515361, term3515361.getClass(), "propListHead", null);
        setIntField(term3515361, term3515361.getClass(), "sourcePosition", 0);
        setField(term3515361, term3515361.getClass(), "jsType", null);
        setField(term3515361, term3515361.getClass(), "parent", null);
        setField(term3515359, term3515359.getClass(), "next", term3515361);
        setField(term3515369, term3515369.getClass(), "str", null);
        setIntField(term3515369, term3515369.getClass(), "type", 40);
        setField(term3515371, term3515371.getClass(), "str", "");
        setIntField(term3515371, term3515371.getClass(), "type", 40);
        setField(term3515371, term3515371.getClass(), "next", null);
        setField(term3515371, term3515371.getClass(), "first", null);
        setField(term3515371, term3515371.getClass(), "last", null);
        setField(term3515371, term3515371.getClass(), "propListHead", null);
        setIntField(term3515371, term3515371.getClass(), "sourcePosition", 0);
        setField(term3515371, term3515371.getClass(), "jsType", null);
        setField(term3515371, term3515371.getClass(), "parent", null);
        setField(term3515369, term3515369.getClass(), "next", term3515371);
        setField(term3515369, term3515369.getClass(), "first", null);
        setField(term3515369, term3515369.getClass(), "last", null);
        setField(term3515369, term3515369.getClass(), "propListHead", null);
        setIntField(term3515369, term3515369.getClass(), "sourcePosition", 0);
        setField(term3515369, term3515369.getClass(), "jsType", null);
        setField(term3515369, term3515369.getClass(), "parent", null);
        setField(term3515359, term3515359.getClass(), "first", term3515369);
        setField(term3515359, term3515359.getClass(), "last", null);
        setField(term3515359, term3515359.getClass(), "propListHead", null);
        setIntField(term3515359, term3515359.getClass(), "sourcePosition", 0);
        setField(term3515359, term3515359.getClass(), "jsType", null);
        setField(term3515359, term3515359.getClass(), "parent", null);
        setField(term3515357, term3515357.getClass(), "first", term3515359);
        setField(term3515357, term3515357.getClass(), "last", null);
        setField(term3515357, term3515357.getClass(), "propListHead", null);
        setIntField(term3515357, term3515357.getClass(), "sourcePosition", 0);
        setField(term3515357, term3515357.getClass(), "jsType", null);
        setField(term3515357, term3515357.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3514287;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3514195, args);
        assertTrue(recursiveEquals(term3514195, term3515591));
        assertTrue(recursiveEquals(term3514287, term3515592));
        assertTrue(recursiveEquals(retValue, term3515357));
    }

};


