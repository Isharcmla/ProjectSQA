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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3693810;
     Object term3693902;
     Object term3695235;
     Object term3695236;
     Object term3694925;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3693810 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3693902 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3693994 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3694086 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3694216 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3693994, term3693994.getClass(), "type", 35);
        setField(term3694086, term3694086.getClass(), "next", term3694086);
        setIntField(term3694086, term3694086.getClass(), "type", 40);
        setField(term3694086, term3694086.getClass(), "str", "indexOf");
        setField(term3693994, term3693994.getClass(), "first", term3694086);
        setIntField(term3694216, term3694216.getClass(), "type", 41);
        setField(term3694216, term3694216.getClass(), "next", term3694086);
        setField(term3693994, term3693994.getClass(), "next", term3694216);
        setField(term3693902, term3693902.getClass(), "first", term3693994);
        setIntField(term3693902, term3693902.getClass(), "type", 37);
        term3695235 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3695235, term3695235.getClass(), "currentTraversal", null);
        term3695236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3695237 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3695238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3695239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3695236, term3695236.getClass(), "str", null);
        setIntField(term3695236, term3695236.getClass(), "type", 37);
        setField(term3695236, term3695236.getClass(), "next", null);
        setField(term3695237, term3695237.getClass(), "str", null);
        setIntField(term3695237, term3695237.getClass(), "type", 35);
        setDoubleField(term3695238, term3695238.getClass(), "number", 0.0);
        setIntField(term3695238, term3695238.getClass(), "type", 41);
        setField(term3695239, term3695239.getClass(), "str", "");
        setIntField(term3695239, term3695239.getClass(), "type", 40);
        setField(term3695239, term3695239.getClass(), "next", term3695239);
        setField(term3695239, term3695239.getClass(), "first", null);
        setField(term3695239, term3695239.getClass(), "last", null);
        setField(term3695239, term3695239.getClass(), "propListHead", null);
        setIntField(term3695239, term3695239.getClass(), "sourcePosition", 0);
        setField(term3695239, term3695239.getClass(), "jsType", null);
        setField(term3695239, term3695239.getClass(), "parent", null);
        setField(term3695238, term3695238.getClass(), "next", term3695239);
        setField(term3695238, term3695238.getClass(), "first", null);
        setField(term3695238, term3695238.getClass(), "last", null);
        setField(term3695238, term3695238.getClass(), "propListHead", null);
        setIntField(term3695238, term3695238.getClass(), "sourcePosition", 0);
        setField(term3695238, term3695238.getClass(), "jsType", null);
        setField(term3695238, term3695238.getClass(), "parent", null);
        setField(term3695237, term3695237.getClass(), "next", term3695238);
        setField(term3695237, term3695237.getClass(), "first", term3695239);
        setField(term3695237, term3695237.getClass(), "last", null);
        setField(term3695237, term3695237.getClass(), "propListHead", null);
        setIntField(term3695237, term3695237.getClass(), "sourcePosition", 0);
        setField(term3695237, term3695237.getClass(), "jsType", null);
        setField(term3695237, term3695237.getClass(), "parent", null);
        setField(term3695236, term3695236.getClass(), "first", term3695237);
        setField(term3695236, term3695236.getClass(), "last", null);
        setField(term3695236, term3695236.getClass(), "propListHead", null);
        setIntField(term3695236, term3695236.getClass(), "sourcePosition", 0);
        setField(term3695236, term3695236.getClass(), "jsType", null);
        setField(term3695236, term3695236.getClass(), "parent", null);
        term3694925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3694927 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3694929 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3694932 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3694925, term3694925.getClass(), "str", null);
        setIntField(term3694925, term3694925.getClass(), "type", 37);
        setField(term3694925, term3694925.getClass(), "next", null);
        setField(term3694927, term3694927.getClass(), "str", null);
        setIntField(term3694927, term3694927.getClass(), "type", 35);
        setDoubleField(term3694929, term3694929.getClass(), "number", 0.0);
        setIntField(term3694929, term3694929.getClass(), "type", 41);
        setField(term3694932, term3694932.getClass(), "str", "");
        setIntField(term3694932, term3694932.getClass(), "type", 40);
        setField(term3694932, term3694932.getClass(), "next", term3694932);
        setField(term3694932, term3694932.getClass(), "first", null);
        setField(term3694932, term3694932.getClass(), "last", null);
        setField(term3694932, term3694932.getClass(), "propListHead", null);
        setIntField(term3694932, term3694932.getClass(), "sourcePosition", 0);
        setField(term3694932, term3694932.getClass(), "jsType", null);
        setField(term3694932, term3694932.getClass(), "parent", null);
        setField(term3694929, term3694929.getClass(), "next", term3694932);
        setField(term3694929, term3694929.getClass(), "first", null);
        setField(term3694929, term3694929.getClass(), "last", null);
        setField(term3694929, term3694929.getClass(), "propListHead", null);
        setIntField(term3694929, term3694929.getClass(), "sourcePosition", 0);
        setField(term3694929, term3694929.getClass(), "jsType", null);
        setField(term3694929, term3694929.getClass(), "parent", null);
        setField(term3694927, term3694927.getClass(), "next", term3694929);
        setField(term3694927, term3694927.getClass(), "first", term3694932);
        setField(term3694927, term3694927.getClass(), "last", null);
        setField(term3694927, term3694927.getClass(), "propListHead", null);
        setIntField(term3694927, term3694927.getClass(), "sourcePosition", 0);
        setField(term3694927, term3694927.getClass(), "jsType", null);
        setField(term3694927, term3694927.getClass(), "parent", null);
        setField(term3694925, term3694925.getClass(), "first", term3694927);
        setField(term3694925, term3694925.getClass(), "last", null);
        setField(term3694925, term3694925.getClass(), "propListHead", null);
        setIntField(term3694925, term3694925.getClass(), "sourcePosition", 0);
        setField(term3694925, term3694925.getClass(), "jsType", null);
        setField(term3694925, term3694925.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3693902;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3693810, args);
        assertTrue(recursiveEquals(term3693810, term3695235));
        assertTrue(recursiveEquals(term3693902, term3695236));
        assertTrue(recursiveEquals(retValue, term3694925));
    }

};


