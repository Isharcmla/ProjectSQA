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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1194549;
     Object term1194641;
     Object term1194872;
     Object term1194873;
     Object term1194827;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1194549 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1194641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1194733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1194825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term1194641, term1194641.getClass(), "type", 37);
        setIntField(term1194733, term1194733.getClass(), "type", 35);
        setField(term1194733, term1194733.getClass(), "first", term1194825);
        setField(term1194641, term1194641.getClass(), "first", term1194733);
        term1194872 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1194872, term1194872.getClass(), "currentTraversal", null);
        term1194873 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1194874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1194875 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term1194873, term1194873.getClass(), "number", 0.0);
        setIntField(term1194873, term1194873.getClass(), "type", 37);
        setField(term1194873, term1194873.getClass(), "next", null);
        setDoubleField(term1194874, term1194874.getClass(), "number", 0.0);
        setIntField(term1194874, term1194874.getClass(), "type", 35);
        setField(term1194874, term1194874.getClass(), "next", null);
        setDoubleField(term1194875, term1194875.getClass(), "number", 0.0);
        setIntField(term1194875, term1194875.getClass(), "type", 0);
        setField(term1194875, term1194875.getClass(), "next", null);
        setField(term1194875, term1194875.getClass(), "first", null);
        setField(term1194875, term1194875.getClass(), "last", null);
        setField(term1194875, term1194875.getClass(), "propListHead", null);
        setIntField(term1194875, term1194875.getClass(), "sourcePosition", 0);
        setField(term1194875, term1194875.getClass(), "jsType", null);
        setField(term1194875, term1194875.getClass(), "parent", null);
        setField(term1194874, term1194874.getClass(), "first", term1194875);
        setField(term1194874, term1194874.getClass(), "last", null);
        setField(term1194874, term1194874.getClass(), "propListHead", null);
        setIntField(term1194874, term1194874.getClass(), "sourcePosition", 0);
        setField(term1194874, term1194874.getClass(), "jsType", null);
        setField(term1194874, term1194874.getClass(), "parent", null);
        setField(term1194873, term1194873.getClass(), "first", term1194874);
        setField(term1194873, term1194873.getClass(), "last", null);
        setField(term1194873, term1194873.getClass(), "propListHead", null);
        setIntField(term1194873, term1194873.getClass(), "sourcePosition", 0);
        setField(term1194873, term1194873.getClass(), "jsType", null);
        setField(term1194873, term1194873.getClass(), "parent", null);
        term1194827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1194830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1194833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term1194827, term1194827.getClass(), "number", 0.0);
        setIntField(term1194827, term1194827.getClass(), "type", 37);
        setField(term1194827, term1194827.getClass(), "next", null);
        setDoubleField(term1194830, term1194830.getClass(), "number", 0.0);
        setIntField(term1194830, term1194830.getClass(), "type", 35);
        setField(term1194830, term1194830.getClass(), "next", null);
        setDoubleField(term1194833, term1194833.getClass(), "number", 0.0);
        setIntField(term1194833, term1194833.getClass(), "type", 0);
        setField(term1194833, term1194833.getClass(), "next", null);
        setField(term1194833, term1194833.getClass(), "first", null);
        setField(term1194833, term1194833.getClass(), "last", null);
        setField(term1194833, term1194833.getClass(), "propListHead", null);
        setIntField(term1194833, term1194833.getClass(), "sourcePosition", 0);
        setField(term1194833, term1194833.getClass(), "jsType", null);
        setField(term1194833, term1194833.getClass(), "parent", null);
        setField(term1194830, term1194830.getClass(), "first", term1194833);
        setField(term1194830, term1194830.getClass(), "last", null);
        setField(term1194830, term1194830.getClass(), "propListHead", null);
        setIntField(term1194830, term1194830.getClass(), "sourcePosition", 0);
        setField(term1194830, term1194830.getClass(), "jsType", null);
        setField(term1194830, term1194830.getClass(), "parent", null);
        setField(term1194827, term1194827.getClass(), "first", term1194830);
        setField(term1194827, term1194827.getClass(), "last", null);
        setField(term1194827, term1194827.getClass(), "propListHead", null);
        setIntField(term1194827, term1194827.getClass(), "sourcePosition", 0);
        setField(term1194827, term1194827.getClass(), "jsType", null);
        setField(term1194827, term1194827.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1194641;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1194549, args);
        assertTrue(recursiveEquals(term1194549, term1194872));
        assertTrue(recursiveEquals(term1194641, term1194873));
        assertTrue(recursiveEquals(retValue, term1194827));
    }

};


