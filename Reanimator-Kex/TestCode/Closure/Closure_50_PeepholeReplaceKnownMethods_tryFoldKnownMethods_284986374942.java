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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3790324;
     Object term3790416;
     Object term3791256;
     Object term3791257;
     Object term3790915;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3790324 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3790416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3790508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3790600 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3790692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3790860 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3790508, term3790508.getClass(), "type", 35);
        setIntField(term3790692, term3790692.getClass(), "type", 40);
        setField(term3790692, term3790692.getClass(), "str", "indexOf");
        setField(term3790600, term3790600.getClass(), "next", term3790692);
        setIntField(term3790600, term3790600.getClass(), "type", 40);
        setField(term3790600, term3790600.getClass(), "str", "");
        setField(term3790508, term3790508.getClass(), "first", term3790600);
        setIntField(term3790860, term3790860.getClass(), "type", 43);
        setField(term3790860, term3790860.getClass(), "next", term3790692);
        setField(term3790508, term3790508.getClass(), "next", term3790860);
        setField(term3790416, term3790416.getClass(), "first", term3790508);
        setIntField(term3790416, term3790416.getClass(), "type", 37);
        term3791256 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3791256, term3791256.getClass(), "currentTraversal", null);
        term3791257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3791258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3791259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3791260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3791262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3791257, term3791257.getClass(), "str", null);
        setIntField(term3791257, term3791257.getClass(), "type", 37);
        setField(term3791257, term3791257.getClass(), "next", null);
        setField(term3791258, term3791258.getClass(), "str", null);
        setIntField(term3791258, term3791258.getClass(), "type", 35);
        setField(term3791259, term3791259.getClass(), "str", null);
        setIntField(term3791259, term3791259.getClass(), "type", 43);
        setField(term3791260, term3791260.getClass(), "str", "");
        setIntField(term3791260, term3791260.getClass(), "type", 40);
        setField(term3791260, term3791260.getClass(), "next", null);
        setField(term3791260, term3791260.getClass(), "first", null);
        setField(term3791260, term3791260.getClass(), "last", null);
        setField(term3791260, term3791260.getClass(), "propListHead", null);
        setIntField(term3791260, term3791260.getClass(), "sourcePosition", 0);
        setField(term3791260, term3791260.getClass(), "jsType", null);
        setField(term3791260, term3791260.getClass(), "parent", null);
        setField(term3791259, term3791259.getClass(), "next", term3791260);
        setField(term3791259, term3791259.getClass(), "first", null);
        setField(term3791259, term3791259.getClass(), "last", null);
        setField(term3791259, term3791259.getClass(), "propListHead", null);
        setIntField(term3791259, term3791259.getClass(), "sourcePosition", 0);
        setField(term3791259, term3791259.getClass(), "jsType", null);
        setField(term3791259, term3791259.getClass(), "parent", null);
        setField(term3791258, term3791258.getClass(), "next", term3791259);
        setField(term3791262, term3791262.getClass(), "str", "");
        setIntField(term3791262, term3791262.getClass(), "type", 40);
        setField(term3791262, term3791262.getClass(), "next", term3791260);
        setField(term3791262, term3791262.getClass(), "first", null);
        setField(term3791262, term3791262.getClass(), "last", null);
        setField(term3791262, term3791262.getClass(), "propListHead", null);
        setIntField(term3791262, term3791262.getClass(), "sourcePosition", 0);
        setField(term3791262, term3791262.getClass(), "jsType", null);
        setField(term3791262, term3791262.getClass(), "parent", null);
        setField(term3791258, term3791258.getClass(), "first", term3791262);
        setField(term3791258, term3791258.getClass(), "last", null);
        setField(term3791258, term3791258.getClass(), "propListHead", null);
        setIntField(term3791258, term3791258.getClass(), "sourcePosition", 0);
        setField(term3791258, term3791258.getClass(), "jsType", null);
        setField(term3791258, term3791258.getClass(), "parent", null);
        setField(term3791257, term3791257.getClass(), "first", term3791258);
        setField(term3791257, term3791257.getClass(), "last", null);
        setField(term3791257, term3791257.getClass(), "propListHead", null);
        setIntField(term3791257, term3791257.getClass(), "sourcePosition", 0);
        setField(term3791257, term3791257.getClass(), "jsType", null);
        setField(term3791257, term3791257.getClass(), "parent", null);
        term3790915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3790917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3790919 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3790921 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3790926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3790915, term3790915.getClass(), "str", null);
        setIntField(term3790915, term3790915.getClass(), "type", 37);
        setField(term3790915, term3790915.getClass(), "next", null);
        setField(term3790917, term3790917.getClass(), "str", null);
        setIntField(term3790917, term3790917.getClass(), "type", 35);
        setField(term3790919, term3790919.getClass(), "str", null);
        setIntField(term3790919, term3790919.getClass(), "type", 43);
        setField(term3790921, term3790921.getClass(), "str", "");
        setIntField(term3790921, term3790921.getClass(), "type", 40);
        setField(term3790921, term3790921.getClass(), "next", null);
        setField(term3790921, term3790921.getClass(), "first", null);
        setField(term3790921, term3790921.getClass(), "last", null);
        setField(term3790921, term3790921.getClass(), "propListHead", null);
        setIntField(term3790921, term3790921.getClass(), "sourcePosition", 0);
        setField(term3790921, term3790921.getClass(), "jsType", null);
        setField(term3790921, term3790921.getClass(), "parent", null);
        setField(term3790919, term3790919.getClass(), "next", term3790921);
        setField(term3790919, term3790919.getClass(), "first", null);
        setField(term3790919, term3790919.getClass(), "last", null);
        setField(term3790919, term3790919.getClass(), "propListHead", null);
        setIntField(term3790919, term3790919.getClass(), "sourcePosition", 0);
        setField(term3790919, term3790919.getClass(), "jsType", null);
        setField(term3790919, term3790919.getClass(), "parent", null);
        setField(term3790917, term3790917.getClass(), "next", term3790919);
        setField(term3790926, term3790926.getClass(), "str", "");
        setIntField(term3790926, term3790926.getClass(), "type", 40);
        setField(term3790926, term3790926.getClass(), "next", term3790921);
        setField(term3790926, term3790926.getClass(), "first", null);
        setField(term3790926, term3790926.getClass(), "last", null);
        setField(term3790926, term3790926.getClass(), "propListHead", null);
        setIntField(term3790926, term3790926.getClass(), "sourcePosition", 0);
        setField(term3790926, term3790926.getClass(), "jsType", null);
        setField(term3790926, term3790926.getClass(), "parent", null);
        setField(term3790917, term3790917.getClass(), "first", term3790926);
        setField(term3790917, term3790917.getClass(), "last", null);
        setField(term3790917, term3790917.getClass(), "propListHead", null);
        setIntField(term3790917, term3790917.getClass(), "sourcePosition", 0);
        setField(term3790917, term3790917.getClass(), "jsType", null);
        setField(term3790917, term3790917.getClass(), "parent", null);
        setField(term3790915, term3790915.getClass(), "first", term3790917);
        setField(term3790915, term3790915.getClass(), "last", null);
        setField(term3790915, term3790915.getClass(), "propListHead", null);
        setIntField(term3790915, term3790915.getClass(), "sourcePosition", 0);
        setField(term3790915, term3790915.getClass(), "jsType", null);
        setField(term3790915, term3790915.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3790416;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3790324, args);
        assertTrue(recursiveEquals(term3790324, term3791256));
        assertTrue(recursiveEquals(term3790416, term3791257));
        assertTrue(recursiveEquals(retValue, term3790915));
    }

};


