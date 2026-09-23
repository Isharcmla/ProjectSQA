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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1206191;
     Object term1206283;
     Object term1208056;
     Object term1208057;
     Object term1207948;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1206191 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1206283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1206375 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1206467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term1206375, term1206375.getClass(), "type", 35);
        setField(term1206375, term1206375.getClass(), "first", term1206467);
        setField(term1206283, term1206283.getClass(), "first", term1206375);
        setIntField(term1206283, term1206283.getClass(), "type", 37);
        term1208056 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1208056, term1208056.getClass(), "currentTraversal", null);
        term1208057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1208058 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1208059 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term1208057, term1208057.getClass(), "number", 0.0);
        setIntField(term1208057, term1208057.getClass(), "type", 37);
        setField(term1208057, term1208057.getClass(), "next", null);
        setDoubleField(term1208058, term1208058.getClass(), "number", 0.0);
        setIntField(term1208058, term1208058.getClass(), "type", 35);
        setField(term1208058, term1208058.getClass(), "next", null);
        setDoubleField(term1208059, term1208059.getClass(), "number", 0.0);
        setIntField(term1208059, term1208059.getClass(), "type", 0);
        setField(term1208059, term1208059.getClass(), "next", null);
        setField(term1208059, term1208059.getClass(), "first", null);
        setField(term1208059, term1208059.getClass(), "last", null);
        setField(term1208059, term1208059.getClass(), "propListHead", null);
        setIntField(term1208059, term1208059.getClass(), "sourcePosition", 0);
        setField(term1208059, term1208059.getClass(), "jsType", null);
        setField(term1208059, term1208059.getClass(), "parent", null);
        setField(term1208058, term1208058.getClass(), "first", term1208059);
        setField(term1208058, term1208058.getClass(), "last", null);
        setField(term1208058, term1208058.getClass(), "propListHead", null);
        setIntField(term1208058, term1208058.getClass(), "sourcePosition", 0);
        setField(term1208058, term1208058.getClass(), "jsType", null);
        setField(term1208058, term1208058.getClass(), "parent", null);
        setField(term1208057, term1208057.getClass(), "first", term1208058);
        setField(term1208057, term1208057.getClass(), "last", null);
        setField(term1208057, term1208057.getClass(), "propListHead", null);
        setIntField(term1208057, term1208057.getClass(), "sourcePosition", 0);
        setField(term1208057, term1208057.getClass(), "jsType", null);
        setField(term1208057, term1208057.getClass(), "parent", null);
        term1207948 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1207951 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1207954 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term1207948, term1207948.getClass(), "number", 0.0);
        setIntField(term1207948, term1207948.getClass(), "type", 37);
        setField(term1207948, term1207948.getClass(), "next", null);
        setDoubleField(term1207951, term1207951.getClass(), "number", 0.0);
        setIntField(term1207951, term1207951.getClass(), "type", 35);
        setField(term1207951, term1207951.getClass(), "next", null);
        setDoubleField(term1207954, term1207954.getClass(), "number", 0.0);
        setIntField(term1207954, term1207954.getClass(), "type", 0);
        setField(term1207954, term1207954.getClass(), "next", null);
        setField(term1207954, term1207954.getClass(), "first", null);
        setField(term1207954, term1207954.getClass(), "last", null);
        setField(term1207954, term1207954.getClass(), "propListHead", null);
        setIntField(term1207954, term1207954.getClass(), "sourcePosition", 0);
        setField(term1207954, term1207954.getClass(), "jsType", null);
        setField(term1207954, term1207954.getClass(), "parent", null);
        setField(term1207951, term1207951.getClass(), "first", term1207954);
        setField(term1207951, term1207951.getClass(), "last", null);
        setField(term1207951, term1207951.getClass(), "propListHead", null);
        setIntField(term1207951, term1207951.getClass(), "sourcePosition", 0);
        setField(term1207951, term1207951.getClass(), "jsType", null);
        setField(term1207951, term1207951.getClass(), "parent", null);
        setField(term1207948, term1207948.getClass(), "first", term1207951);
        setField(term1207948, term1207948.getClass(), "last", null);
        setField(term1207948, term1207948.getClass(), "propListHead", null);
        setIntField(term1207948, term1207948.getClass(), "sourcePosition", 0);
        setField(term1207948, term1207948.getClass(), "jsType", null);
        setField(term1207948, term1207948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1206283;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term1206191, args);
        assertTrue(recursiveEquals(term1206191, term1208056));
        assertTrue(recursiveEquals(term1206283, term1208057));
        assertTrue(recursiveEquals(retValue, term1207948));
    }

};


