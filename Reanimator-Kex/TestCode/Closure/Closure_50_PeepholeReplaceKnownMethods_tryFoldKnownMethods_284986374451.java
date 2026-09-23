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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3213122;
     Object term3213214;
     Object term3215108;
     Object term3215109;
     Object term3214852;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3213122 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3213214 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3213306 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3213398 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3213490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3213620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3213306, term3213306.getClass(), "type", 35);
        setIntField(term3213490, term3213490.getClass(), "type", 40);
        setField(term3213490, term3213490.getClass(), "str", "substr");
        setField(term3213398, term3213398.getClass(), "next", term3213490);
        setIntField(term3213398, term3213398.getClass(), "type", 40);
        setField(term3213306, term3213306.getClass(), "first", term3213398);
        setIntField(term3213620, term3213620.getClass(), "type", 40);
        setField(term3213306, term3213306.getClass(), "next", term3213620);
        setField(term3213214, term3213214.getClass(), "first", term3213306);
        setIntField(term3213214, term3213214.getClass(), "type", 37);
        term3215108 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3215108, term3215108.getClass(), "currentTraversal", null);
        term3215109 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215110 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215111 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215112 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3215109, term3215109.getClass(), "str", null);
        setIntField(term3215109, term3215109.getClass(), "type", 37);
        setField(term3215109, term3215109.getClass(), "next", null);
        setField(term3215110, term3215110.getClass(), "str", null);
        setIntField(term3215110, term3215110.getClass(), "type", 35);
        setField(term3215111, term3215111.getClass(), "str", null);
        setIntField(term3215111, term3215111.getClass(), "type", 40);
        setField(term3215111, term3215111.getClass(), "next", null);
        setField(term3215111, term3215111.getClass(), "first", null);
        setField(term3215111, term3215111.getClass(), "last", null);
        setField(term3215111, term3215111.getClass(), "propListHead", null);
        setIntField(term3215111, term3215111.getClass(), "sourcePosition", 0);
        setField(term3215111, term3215111.getClass(), "jsType", null);
        setField(term3215111, term3215111.getClass(), "parent", null);
        setField(term3215110, term3215110.getClass(), "next", term3215111);
        setField(term3215112, term3215112.getClass(), "str", null);
        setIntField(term3215112, term3215112.getClass(), "type", 40);
        setField(term3215113, term3215113.getClass(), "str", "");
        setIntField(term3215113, term3215113.getClass(), "type", 40);
        setField(term3215113, term3215113.getClass(), "next", null);
        setField(term3215113, term3215113.getClass(), "first", null);
        setField(term3215113, term3215113.getClass(), "last", null);
        setField(term3215113, term3215113.getClass(), "propListHead", null);
        setIntField(term3215113, term3215113.getClass(), "sourcePosition", 0);
        setField(term3215113, term3215113.getClass(), "jsType", null);
        setField(term3215113, term3215113.getClass(), "parent", null);
        setField(term3215112, term3215112.getClass(), "next", term3215113);
        setField(term3215112, term3215112.getClass(), "first", null);
        setField(term3215112, term3215112.getClass(), "last", null);
        setField(term3215112, term3215112.getClass(), "propListHead", null);
        setIntField(term3215112, term3215112.getClass(), "sourcePosition", 0);
        setField(term3215112, term3215112.getClass(), "jsType", null);
        setField(term3215112, term3215112.getClass(), "parent", null);
        setField(term3215110, term3215110.getClass(), "first", term3215112);
        setField(term3215110, term3215110.getClass(), "last", null);
        setField(term3215110, term3215110.getClass(), "propListHead", null);
        setIntField(term3215110, term3215110.getClass(), "sourcePosition", 0);
        setField(term3215110, term3215110.getClass(), "jsType", null);
        setField(term3215110, term3215110.getClass(), "parent", null);
        setField(term3215109, term3215109.getClass(), "first", term3215110);
        setField(term3215109, term3215109.getClass(), "last", null);
        setField(term3215109, term3215109.getClass(), "propListHead", null);
        setIntField(term3215109, term3215109.getClass(), "sourcePosition", 0);
        setField(term3215109, term3215109.getClass(), "jsType", null);
        setField(term3215109, term3215109.getClass(), "parent", null);
        term3214852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3214854 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3214856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3214859 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3214861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3214852, term3214852.getClass(), "str", null);
        setIntField(term3214852, term3214852.getClass(), "type", 37);
        setField(term3214852, term3214852.getClass(), "next", null);
        setField(term3214854, term3214854.getClass(), "str", null);
        setIntField(term3214854, term3214854.getClass(), "type", 35);
        setField(term3214856, term3214856.getClass(), "str", null);
        setIntField(term3214856, term3214856.getClass(), "type", 40);
        setField(term3214856, term3214856.getClass(), "next", null);
        setField(term3214856, term3214856.getClass(), "first", null);
        setField(term3214856, term3214856.getClass(), "last", null);
        setField(term3214856, term3214856.getClass(), "propListHead", null);
        setIntField(term3214856, term3214856.getClass(), "sourcePosition", 0);
        setField(term3214856, term3214856.getClass(), "jsType", null);
        setField(term3214856, term3214856.getClass(), "parent", null);
        setField(term3214854, term3214854.getClass(), "next", term3214856);
        setField(term3214859, term3214859.getClass(), "str", null);
        setIntField(term3214859, term3214859.getClass(), "type", 40);
        setField(term3214861, term3214861.getClass(), "str", "");
        setIntField(term3214861, term3214861.getClass(), "type", 40);
        setField(term3214861, term3214861.getClass(), "next", null);
        setField(term3214861, term3214861.getClass(), "first", null);
        setField(term3214861, term3214861.getClass(), "last", null);
        setField(term3214861, term3214861.getClass(), "propListHead", null);
        setIntField(term3214861, term3214861.getClass(), "sourcePosition", 0);
        setField(term3214861, term3214861.getClass(), "jsType", null);
        setField(term3214861, term3214861.getClass(), "parent", null);
        setField(term3214859, term3214859.getClass(), "next", term3214861);
        setField(term3214859, term3214859.getClass(), "first", null);
        setField(term3214859, term3214859.getClass(), "last", null);
        setField(term3214859, term3214859.getClass(), "propListHead", null);
        setIntField(term3214859, term3214859.getClass(), "sourcePosition", 0);
        setField(term3214859, term3214859.getClass(), "jsType", null);
        setField(term3214859, term3214859.getClass(), "parent", null);
        setField(term3214854, term3214854.getClass(), "first", term3214859);
        setField(term3214854, term3214854.getClass(), "last", null);
        setField(term3214854, term3214854.getClass(), "propListHead", null);
        setIntField(term3214854, term3214854.getClass(), "sourcePosition", 0);
        setField(term3214854, term3214854.getClass(), "jsType", null);
        setField(term3214854, term3214854.getClass(), "parent", null);
        setField(term3214852, term3214852.getClass(), "first", term3214854);
        setField(term3214852, term3214852.getClass(), "last", null);
        setField(term3214852, term3214852.getClass(), "propListHead", null);
        setIntField(term3214852, term3214852.getClass(), "sourcePosition", 0);
        setField(term3214852, term3214852.getClass(), "jsType", null);
        setField(term3214852, term3214852.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3213214;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3213122, args);
        assertTrue(recursiveEquals(term3213122, term3215108));
        assertTrue(recursiveEquals(term3213214, term3215109));
        assertTrue(recursiveEquals(retValue, term3214852));
    }

};


