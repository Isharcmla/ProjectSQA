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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3748318;
     Object term3748410;
     Object term3749728;
     Object term3749729;
     Object term3749571;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3748318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3748410 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3748502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3748594 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3748686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3748816 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3748410, term3748410.getClass(), "type", 37);
        setIntField(term3748502, term3748502.getClass(), "type", 35);
        setIntField(term3748686, term3748686.getClass(), "type", 40);
        setField(term3748686, term3748686.getClass(), "str", "charAt");
        setField(term3748594, term3748594.getClass(), "next", term3748686);
        setIntField(term3748594, term3748594.getClass(), "type", 40);
        setField(term3748502, term3748502.getClass(), "first", term3748594);
        setIntField(term3748816, term3748816.getClass(), "type", 40);
        setField(term3748502, term3748502.getClass(), "next", term3748816);
        setField(term3748410, term3748410.getClass(), "first", term3748502);
        term3749728 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3749728, term3749728.getClass(), "currentTraversal", null);
        term3749729 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3749730 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3749731 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3749732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3749733 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3749729, term3749729.getClass(), "number", 0.0);
        setIntField(term3749729, term3749729.getClass(), "type", 37);
        setField(term3749729, term3749729.getClass(), "next", null);
        setField(term3749730, term3749730.getClass(), "str", null);
        setIntField(term3749730, term3749730.getClass(), "type", 35);
        setDoubleField(term3749731, term3749731.getClass(), "number", 0.0);
        setIntField(term3749731, term3749731.getClass(), "type", 40);
        setField(term3749731, term3749731.getClass(), "next", null);
        setField(term3749731, term3749731.getClass(), "first", null);
        setField(term3749731, term3749731.getClass(), "last", null);
        setField(term3749731, term3749731.getClass(), "propListHead", null);
        setIntField(term3749731, term3749731.getClass(), "sourcePosition", 0);
        setField(term3749731, term3749731.getClass(), "jsType", null);
        setField(term3749731, term3749731.getClass(), "parent", null);
        setField(term3749730, term3749730.getClass(), "next", term3749731);
        setField(term3749732, term3749732.getClass(), "str", null);
        setIntField(term3749732, term3749732.getClass(), "type", 40);
        setField(term3749733, term3749733.getClass(), "str", "");
        setIntField(term3749733, term3749733.getClass(), "type", 40);
        setField(term3749733, term3749733.getClass(), "next", null);
        setField(term3749733, term3749733.getClass(), "first", null);
        setField(term3749733, term3749733.getClass(), "last", null);
        setField(term3749733, term3749733.getClass(), "propListHead", null);
        setIntField(term3749733, term3749733.getClass(), "sourcePosition", 0);
        setField(term3749733, term3749733.getClass(), "jsType", null);
        setField(term3749733, term3749733.getClass(), "parent", null);
        setField(term3749732, term3749732.getClass(), "next", term3749733);
        setField(term3749732, term3749732.getClass(), "first", null);
        setField(term3749732, term3749732.getClass(), "last", null);
        setField(term3749732, term3749732.getClass(), "propListHead", null);
        setIntField(term3749732, term3749732.getClass(), "sourcePosition", 0);
        setField(term3749732, term3749732.getClass(), "jsType", null);
        setField(term3749732, term3749732.getClass(), "parent", null);
        setField(term3749730, term3749730.getClass(), "first", term3749732);
        setField(term3749730, term3749730.getClass(), "last", null);
        setField(term3749730, term3749730.getClass(), "propListHead", null);
        setIntField(term3749730, term3749730.getClass(), "sourcePosition", 0);
        setField(term3749730, term3749730.getClass(), "jsType", null);
        setField(term3749730, term3749730.getClass(), "parent", null);
        setField(term3749729, term3749729.getClass(), "first", term3749730);
        setField(term3749729, term3749729.getClass(), "last", null);
        setField(term3749729, term3749729.getClass(), "propListHead", null);
        setIntField(term3749729, term3749729.getClass(), "sourcePosition", 0);
        setField(term3749729, term3749729.getClass(), "jsType", null);
        setField(term3749729, term3749729.getClass(), "parent", null);
        term3749571 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3749574 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3749576 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3749580 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3749582 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3749571, term3749571.getClass(), "number", 0.0);
        setIntField(term3749571, term3749571.getClass(), "type", 37);
        setField(term3749571, term3749571.getClass(), "next", null);
        setField(term3749574, term3749574.getClass(), "str", null);
        setIntField(term3749574, term3749574.getClass(), "type", 35);
        setDoubleField(term3749576, term3749576.getClass(), "number", 0.0);
        setIntField(term3749576, term3749576.getClass(), "type", 40);
        setField(term3749576, term3749576.getClass(), "next", null);
        setField(term3749576, term3749576.getClass(), "first", null);
        setField(term3749576, term3749576.getClass(), "last", null);
        setField(term3749576, term3749576.getClass(), "propListHead", null);
        setIntField(term3749576, term3749576.getClass(), "sourcePosition", 0);
        setField(term3749576, term3749576.getClass(), "jsType", null);
        setField(term3749576, term3749576.getClass(), "parent", null);
        setField(term3749574, term3749574.getClass(), "next", term3749576);
        setField(term3749580, term3749580.getClass(), "str", null);
        setIntField(term3749580, term3749580.getClass(), "type", 40);
        setField(term3749582, term3749582.getClass(), "str", "");
        setIntField(term3749582, term3749582.getClass(), "type", 40);
        setField(term3749582, term3749582.getClass(), "next", null);
        setField(term3749582, term3749582.getClass(), "first", null);
        setField(term3749582, term3749582.getClass(), "last", null);
        setField(term3749582, term3749582.getClass(), "propListHead", null);
        setIntField(term3749582, term3749582.getClass(), "sourcePosition", 0);
        setField(term3749582, term3749582.getClass(), "jsType", null);
        setField(term3749582, term3749582.getClass(), "parent", null);
        setField(term3749580, term3749580.getClass(), "next", term3749582);
        setField(term3749580, term3749580.getClass(), "first", null);
        setField(term3749580, term3749580.getClass(), "last", null);
        setField(term3749580, term3749580.getClass(), "propListHead", null);
        setIntField(term3749580, term3749580.getClass(), "sourcePosition", 0);
        setField(term3749580, term3749580.getClass(), "jsType", null);
        setField(term3749580, term3749580.getClass(), "parent", null);
        setField(term3749574, term3749574.getClass(), "first", term3749580);
        setField(term3749574, term3749574.getClass(), "last", null);
        setField(term3749574, term3749574.getClass(), "propListHead", null);
        setIntField(term3749574, term3749574.getClass(), "sourcePosition", 0);
        setField(term3749574, term3749574.getClass(), "jsType", null);
        setField(term3749574, term3749574.getClass(), "parent", null);
        setField(term3749571, term3749571.getClass(), "first", term3749574);
        setField(term3749571, term3749571.getClass(), "last", null);
        setField(term3749571, term3749571.getClass(), "propListHead", null);
        setIntField(term3749571, term3749571.getClass(), "sourcePosition", 0);
        setField(term3749571, term3749571.getClass(), "jsType", null);
        setField(term3749571, term3749571.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3748410;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3748318, args);
        assertTrue(recursiveEquals(term3748318, term3749728));
        assertTrue(recursiveEquals(term3748410, term3749729));
        assertTrue(recursiveEquals(retValue, term3749571));
    }

};


