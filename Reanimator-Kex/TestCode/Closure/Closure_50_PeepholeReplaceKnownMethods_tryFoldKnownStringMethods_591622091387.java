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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2650879;
     Object term2650971;
     Object term2652295;
     Object term2652296;
     Object term2652238;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2650879 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2650971 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2651063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2651155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2651225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2650971, term2650971.getClass(), "type", 37);
        setIntField(term2651063, term2651063.getClass(), "type", 35);
        setField(term2651155, term2651155.getClass(), "next", term2651225);
        setIntField(term2651155, term2651155.getClass(), "type", 40);
        setField(term2651063, term2651063.getClass(), "first", term2651155);
        setField(term2650971, term2650971.getClass(), "first", term2651063);
        term2652295 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2652295, term2652295.getClass(), "currentTraversal", null);
        term2652296 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2652297 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2652298 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2652299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2652296, term2652296.getClass(), "str", null);
        setIntField(term2652296, term2652296.getClass(), "type", 37);
        setField(term2652296, term2652296.getClass(), "next", null);
        setField(term2652297, term2652297.getClass(), "str", null);
        setIntField(term2652297, term2652297.getClass(), "type", 35);
        setField(term2652297, term2652297.getClass(), "next", null);
        setField(term2652298, term2652298.getClass(), "str", null);
        setIntField(term2652298, term2652298.getClass(), "type", 40);
        setIntField(term2652299, term2652299.getClass(), "type", 0);
        setField(term2652299, term2652299.getClass(), "next", null);
        setField(term2652299, term2652299.getClass(), "first", null);
        setField(term2652299, term2652299.getClass(), "last", null);
        setField(term2652299, term2652299.getClass(), "propListHead", null);
        setIntField(term2652299, term2652299.getClass(), "sourcePosition", 0);
        setField(term2652299, term2652299.getClass(), "jsType", null);
        setField(term2652299, term2652299.getClass(), "parent", null);
        setField(term2652298, term2652298.getClass(), "next", term2652299);
        setField(term2652298, term2652298.getClass(), "first", null);
        setField(term2652298, term2652298.getClass(), "last", null);
        setField(term2652298, term2652298.getClass(), "propListHead", null);
        setIntField(term2652298, term2652298.getClass(), "sourcePosition", 0);
        setField(term2652298, term2652298.getClass(), "jsType", null);
        setField(term2652298, term2652298.getClass(), "parent", null);
        setField(term2652297, term2652297.getClass(), "first", term2652298);
        setField(term2652297, term2652297.getClass(), "last", null);
        setField(term2652297, term2652297.getClass(), "propListHead", null);
        setIntField(term2652297, term2652297.getClass(), "sourcePosition", 0);
        setField(term2652297, term2652297.getClass(), "jsType", null);
        setField(term2652297, term2652297.getClass(), "parent", null);
        setField(term2652296, term2652296.getClass(), "first", term2652297);
        setField(term2652296, term2652296.getClass(), "last", null);
        setField(term2652296, term2652296.getClass(), "propListHead", null);
        setIntField(term2652296, term2652296.getClass(), "sourcePosition", 0);
        setField(term2652296, term2652296.getClass(), "jsType", null);
        setField(term2652296, term2652296.getClass(), "parent", null);
        term2652238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2652240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2652242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2652244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2652238, term2652238.getClass(), "str", null);
        setIntField(term2652238, term2652238.getClass(), "type", 37);
        setField(term2652238, term2652238.getClass(), "next", null);
        setField(term2652240, term2652240.getClass(), "str", null);
        setIntField(term2652240, term2652240.getClass(), "type", 35);
        setField(term2652240, term2652240.getClass(), "next", null);
        setField(term2652242, term2652242.getClass(), "str", null);
        setIntField(term2652242, term2652242.getClass(), "type", 40);
        setIntField(term2652244, term2652244.getClass(), "type", 0);
        setField(term2652244, term2652244.getClass(), "next", null);
        setField(term2652244, term2652244.getClass(), "first", null);
        setField(term2652244, term2652244.getClass(), "last", null);
        setField(term2652244, term2652244.getClass(), "propListHead", null);
        setIntField(term2652244, term2652244.getClass(), "sourcePosition", 0);
        setField(term2652244, term2652244.getClass(), "jsType", null);
        setField(term2652244, term2652244.getClass(), "parent", null);
        setField(term2652242, term2652242.getClass(), "next", term2652244);
        setField(term2652242, term2652242.getClass(), "first", null);
        setField(term2652242, term2652242.getClass(), "last", null);
        setField(term2652242, term2652242.getClass(), "propListHead", null);
        setIntField(term2652242, term2652242.getClass(), "sourcePosition", 0);
        setField(term2652242, term2652242.getClass(), "jsType", null);
        setField(term2652242, term2652242.getClass(), "parent", null);
        setField(term2652240, term2652240.getClass(), "first", term2652242);
        setField(term2652240, term2652240.getClass(), "last", null);
        setField(term2652240, term2652240.getClass(), "propListHead", null);
        setIntField(term2652240, term2652240.getClass(), "sourcePosition", 0);
        setField(term2652240, term2652240.getClass(), "jsType", null);
        setField(term2652240, term2652240.getClass(), "parent", null);
        setField(term2652238, term2652238.getClass(), "first", term2652240);
        setField(term2652238, term2652238.getClass(), "last", null);
        setField(term2652238, term2652238.getClass(), "propListHead", null);
        setIntField(term2652238, term2652238.getClass(), "sourcePosition", 0);
        setField(term2652238, term2652238.getClass(), "jsType", null);
        setField(term2652238, term2652238.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2650971;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2650879, args);
        assertTrue(recursiveEquals(term2650879, term2652295));
        assertTrue(recursiveEquals(term2650971, term2652296));
        assertTrue(recursiveEquals(retValue, term2652238));
    }

};


