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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3653987;
     Object term3654079;
     Object term3655776;
     Object term3655777;
     Object term3655455;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3653987 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3654079 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3654171 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3654263 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3654355 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3654523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3654171, term3654171.getClass(), "type", 35);
        setIntField(term3654355, term3654355.getClass(), "type", 40);
        setField(term3654355, term3654355.getClass(), "str", "substring");
        setField(term3654263, term3654263.getClass(), "next", term3654355);
        setIntField(term3654263, term3654263.getClass(), "type", 40);
        setField(term3654263, term3654263.getClass(), "str", "");
        setField(term3654171, term3654171.getClass(), "first", term3654263);
        setIntField(term3654523, term3654523.getClass(), "type", 39);
        setDoubleField(term3654523, term3654523.getClass(), "number", -3.4587643536311583E18);
        setField(term3654523, term3654523.getClass(), "next", null);
        setField(term3654171, term3654171.getClass(), "next", term3654523);
        setField(term3654079, term3654079.getClass(), "first", term3654171);
        setIntField(term3654079, term3654079.getClass(), "type", 37);
        term3655776 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3655776, term3655776.getClass(), "currentTraversal", null);
        term3655777 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655778 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3655780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3655777, term3655777.getClass(), "str", null);
        setIntField(term3655777, term3655777.getClass(), "type", 37);
        setField(term3655777, term3655777.getClass(), "next", null);
        setField(term3655778, term3655778.getClass(), "str", null);
        setIntField(term3655778, term3655778.getClass(), "type", 35);
        setDoubleField(term3655779, term3655779.getClass(), "number", -3.4587643536311583E18);
        setIntField(term3655779, term3655779.getClass(), "type", 39);
        setField(term3655779, term3655779.getClass(), "next", null);
        setField(term3655779, term3655779.getClass(), "first", null);
        setField(term3655779, term3655779.getClass(), "last", null);
        setField(term3655779, term3655779.getClass(), "propListHead", null);
        setIntField(term3655779, term3655779.getClass(), "sourcePosition", 0);
        setField(term3655779, term3655779.getClass(), "jsType", null);
        setField(term3655779, term3655779.getClass(), "parent", null);
        setField(term3655778, term3655778.getClass(), "next", term3655779);
        setField(term3655780, term3655780.getClass(), "str", "");
        setIntField(term3655780, term3655780.getClass(), "type", 40);
        setField(term3655783, term3655783.getClass(), "str", "");
        setIntField(term3655783, term3655783.getClass(), "type", 40);
        setField(term3655783, term3655783.getClass(), "next", null);
        setField(term3655783, term3655783.getClass(), "first", null);
        setField(term3655783, term3655783.getClass(), "last", null);
        setField(term3655783, term3655783.getClass(), "propListHead", null);
        setIntField(term3655783, term3655783.getClass(), "sourcePosition", 0);
        setField(term3655783, term3655783.getClass(), "jsType", null);
        setField(term3655783, term3655783.getClass(), "parent", null);
        setField(term3655780, term3655780.getClass(), "next", term3655783);
        setField(term3655780, term3655780.getClass(), "first", null);
        setField(term3655780, term3655780.getClass(), "last", null);
        setField(term3655780, term3655780.getClass(), "propListHead", null);
        setIntField(term3655780, term3655780.getClass(), "sourcePosition", 0);
        setField(term3655780, term3655780.getClass(), "jsType", null);
        setField(term3655780, term3655780.getClass(), "parent", null);
        setField(term3655778, term3655778.getClass(), "first", term3655780);
        setField(term3655778, term3655778.getClass(), "last", null);
        setField(term3655778, term3655778.getClass(), "propListHead", null);
        setIntField(term3655778, term3655778.getClass(), "sourcePosition", 0);
        setField(term3655778, term3655778.getClass(), "jsType", null);
        setField(term3655778, term3655778.getClass(), "parent", null);
        setField(term3655777, term3655777.getClass(), "first", term3655778);
        setField(term3655777, term3655777.getClass(), "last", null);
        setField(term3655777, term3655777.getClass(), "propListHead", null);
        setIntField(term3655777, term3655777.getClass(), "sourcePosition", 0);
        setField(term3655777, term3655777.getClass(), "jsType", null);
        setField(term3655777, term3655777.getClass(), "parent", null);
        term3655455 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3655463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3655455, term3655455.getClass(), "str", null);
        setIntField(term3655455, term3655455.getClass(), "type", 37);
        setField(term3655455, term3655455.getClass(), "next", null);
        setField(term3655457, term3655457.getClass(), "str", null);
        setIntField(term3655457, term3655457.getClass(), "type", 35);
        setDoubleField(term3655459, term3655459.getClass(), "number", -3.4587643536311583E18);
        setIntField(term3655459, term3655459.getClass(), "type", 39);
        setField(term3655459, term3655459.getClass(), "next", null);
        setField(term3655459, term3655459.getClass(), "first", null);
        setField(term3655459, term3655459.getClass(), "last", null);
        setField(term3655459, term3655459.getClass(), "propListHead", null);
        setIntField(term3655459, term3655459.getClass(), "sourcePosition", 0);
        setField(term3655459, term3655459.getClass(), "jsType", null);
        setField(term3655459, term3655459.getClass(), "parent", null);
        setField(term3655457, term3655457.getClass(), "next", term3655459);
        setField(term3655463, term3655463.getClass(), "str", "");
        setIntField(term3655463, term3655463.getClass(), "type", 40);
        setField(term3655467, term3655467.getClass(), "str", "");
        setIntField(term3655467, term3655467.getClass(), "type", 40);
        setField(term3655467, term3655467.getClass(), "next", null);
        setField(term3655467, term3655467.getClass(), "first", null);
        setField(term3655467, term3655467.getClass(), "last", null);
        setField(term3655467, term3655467.getClass(), "propListHead", null);
        setIntField(term3655467, term3655467.getClass(), "sourcePosition", 0);
        setField(term3655467, term3655467.getClass(), "jsType", null);
        setField(term3655467, term3655467.getClass(), "parent", null);
        setField(term3655463, term3655463.getClass(), "next", term3655467);
        setField(term3655463, term3655463.getClass(), "first", null);
        setField(term3655463, term3655463.getClass(), "last", null);
        setField(term3655463, term3655463.getClass(), "propListHead", null);
        setIntField(term3655463, term3655463.getClass(), "sourcePosition", 0);
        setField(term3655463, term3655463.getClass(), "jsType", null);
        setField(term3655463, term3655463.getClass(), "parent", null);
        setField(term3655457, term3655457.getClass(), "first", term3655463);
        setField(term3655457, term3655457.getClass(), "last", null);
        setField(term3655457, term3655457.getClass(), "propListHead", null);
        setIntField(term3655457, term3655457.getClass(), "sourcePosition", 0);
        setField(term3655457, term3655457.getClass(), "jsType", null);
        setField(term3655457, term3655457.getClass(), "parent", null);
        setField(term3655455, term3655455.getClass(), "first", term3655457);
        setField(term3655455, term3655455.getClass(), "last", null);
        setField(term3655455, term3655455.getClass(), "propListHead", null);
        setIntField(term3655455, term3655455.getClass(), "sourcePosition", 0);
        setField(term3655455, term3655455.getClass(), "jsType", null);
        setField(term3655455, term3655455.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3654079;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3653987, args);
        assertTrue(recursiveEquals(term3653987, term3655776));
        assertTrue(recursiveEquals(term3654079, term3655777));
        assertTrue(recursiveEquals(retValue, term3655455));
    }

};


