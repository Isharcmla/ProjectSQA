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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262525;
     Object term262617;
     Object term263225;
     Object term263226;
     Object term263186;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262525 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term262617 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term262709 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term262801 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term262709, term262709.getClass(), "next", term262801);
        setIntField(term262709, term262709.getClass(), "type", 39);
        setField(term262617, term262617.getClass(), "first", term262709);
        setIntField(term262617, term262617.getClass(), "type", 9);
        term263225 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term263225, term263225.getClass(), "currentTraversal", null);
        term263226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term263227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term263228 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term263226, term263226.getClass(), "number", 0.0);
        setIntField(term263226, term263226.getClass(), "type", 9);
        setField(term263226, term263226.getClass(), "next", null);
        setDoubleField(term263227, term263227.getClass(), "number", 0.0);
        setIntField(term263227, term263227.getClass(), "type", 39);
        setField(term263228, term263228.getClass(), "str", null);
        setIntField(term263228, term263228.getClass(), "type", 0);
        setField(term263228, term263228.getClass(), "next", null);
        setField(term263228, term263228.getClass(), "first", null);
        setField(term263228, term263228.getClass(), "last", null);
        setField(term263228, term263228.getClass(), "propListHead", null);
        setIntField(term263228, term263228.getClass(), "sourcePosition", 0);
        setField(term263228, term263228.getClass(), "jsType", null);
        setField(term263228, term263228.getClass(), "parent", null);
        setField(term263227, term263227.getClass(), "next", term263228);
        setField(term263227, term263227.getClass(), "first", null);
        setField(term263227, term263227.getClass(), "last", null);
        setField(term263227, term263227.getClass(), "propListHead", null);
        setIntField(term263227, term263227.getClass(), "sourcePosition", 0);
        setField(term263227, term263227.getClass(), "jsType", null);
        setField(term263227, term263227.getClass(), "parent", null);
        setField(term263226, term263226.getClass(), "first", term263227);
        setField(term263226, term263226.getClass(), "last", null);
        setField(term263226, term263226.getClass(), "propListHead", null);
        setIntField(term263226, term263226.getClass(), "sourcePosition", 0);
        setField(term263226, term263226.getClass(), "jsType", null);
        setField(term263226, term263226.getClass(), "parent", null);
        term263186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term263189 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term263192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term263186, term263186.getClass(), "number", 0.0);
        setIntField(term263186, term263186.getClass(), "type", 9);
        setField(term263186, term263186.getClass(), "next", null);
        setDoubleField(term263189, term263189.getClass(), "number", 0.0);
        setIntField(term263189, term263189.getClass(), "type", 39);
        setField(term263192, term263192.getClass(), "str", null);
        setIntField(term263192, term263192.getClass(), "type", 0);
        setField(term263192, term263192.getClass(), "next", null);
        setField(term263192, term263192.getClass(), "first", null);
        setField(term263192, term263192.getClass(), "last", null);
        setField(term263192, term263192.getClass(), "propListHead", null);
        setIntField(term263192, term263192.getClass(), "sourcePosition", 0);
        setField(term263192, term263192.getClass(), "jsType", null);
        setField(term263192, term263192.getClass(), "parent", null);
        setField(term263189, term263189.getClass(), "next", term263192);
        setField(term263189, term263189.getClass(), "first", null);
        setField(term263189, term263189.getClass(), "last", null);
        setField(term263189, term263189.getClass(), "propListHead", null);
        setIntField(term263189, term263189.getClass(), "sourcePosition", 0);
        setField(term263189, term263189.getClass(), "jsType", null);
        setField(term263189, term263189.getClass(), "parent", null);
        setField(term263186, term263186.getClass(), "first", term263189);
        setField(term263186, term263186.getClass(), "last", null);
        setField(term263186, term263186.getClass(), "propListHead", null);
        setIntField(term263186, term263186.getClass(), "sourcePosition", 0);
        setField(term263186, term263186.getClass(), "jsType", null);
        setField(term263186, term263186.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term262617;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term262525, args);
        assertTrue(recursiveEquals(term262525, term263225));
        assertTrue(recursiveEquals(term262617, term263226));
        assertTrue(recursiveEquals(retValue, term263186));
    }

};


