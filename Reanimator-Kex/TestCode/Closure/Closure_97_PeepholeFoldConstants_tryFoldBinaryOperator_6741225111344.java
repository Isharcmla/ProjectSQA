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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442848;
     Object term442940;
     Object term443173;
     Object term443174;
     Object term443133;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442848 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term442940 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443032 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443124 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term443032, term443032.getClass(), "next", term443124);
        setIntField(term443032, term443032.getClass(), "type", 39);
        setField(term442940, term442940.getClass(), "first", term443032);
        setIntField(term442940, term442940.getClass(), "type", 11);
        term443173 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term443173, term443173.getClass(), "currentTraversal", null);
        term443174 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term443174, term443174.getClass(), "number", 0.0);
        setIntField(term443174, term443174.getClass(), "type", 11);
        setField(term443174, term443174.getClass(), "next", null);
        setDoubleField(term443175, term443175.getClass(), "number", 0.0);
        setIntField(term443175, term443175.getClass(), "type", 39);
        setDoubleField(term443176, term443176.getClass(), "number", 0.0);
        setIntField(term443176, term443176.getClass(), "type", 0);
        setField(term443176, term443176.getClass(), "next", null);
        setField(term443176, term443176.getClass(), "first", null);
        setField(term443176, term443176.getClass(), "last", null);
        setField(term443176, term443176.getClass(), "propListHead", null);
        setIntField(term443176, term443176.getClass(), "sourcePosition", 0);
        setField(term443176, term443176.getClass(), "jsType", null);
        setField(term443176, term443176.getClass(), "parent", null);
        setField(term443175, term443175.getClass(), "next", term443176);
        setField(term443175, term443175.getClass(), "first", null);
        setField(term443175, term443175.getClass(), "last", null);
        setField(term443175, term443175.getClass(), "propListHead", null);
        setIntField(term443175, term443175.getClass(), "sourcePosition", 0);
        setField(term443175, term443175.getClass(), "jsType", null);
        setField(term443175, term443175.getClass(), "parent", null);
        setField(term443174, term443174.getClass(), "first", term443175);
        setField(term443174, term443174.getClass(), "last", null);
        setField(term443174, term443174.getClass(), "propListHead", null);
        setIntField(term443174, term443174.getClass(), "sourcePosition", 0);
        setField(term443174, term443174.getClass(), "jsType", null);
        setField(term443174, term443174.getClass(), "parent", null);
        term443133 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443136 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term443139 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term443133, term443133.getClass(), "number", 0.0);
        setIntField(term443133, term443133.getClass(), "type", 11);
        setField(term443133, term443133.getClass(), "next", null);
        setDoubleField(term443136, term443136.getClass(), "number", 0.0);
        setIntField(term443136, term443136.getClass(), "type", 39);
        setDoubleField(term443139, term443139.getClass(), "number", 0.0);
        setIntField(term443139, term443139.getClass(), "type", 0);
        setField(term443139, term443139.getClass(), "next", null);
        setField(term443139, term443139.getClass(), "first", null);
        setField(term443139, term443139.getClass(), "last", null);
        setField(term443139, term443139.getClass(), "propListHead", null);
        setIntField(term443139, term443139.getClass(), "sourcePosition", 0);
        setField(term443139, term443139.getClass(), "jsType", null);
        setField(term443139, term443139.getClass(), "parent", null);
        setField(term443136, term443136.getClass(), "next", term443139);
        setField(term443136, term443136.getClass(), "first", null);
        setField(term443136, term443136.getClass(), "last", null);
        setField(term443136, term443136.getClass(), "propListHead", null);
        setIntField(term443136, term443136.getClass(), "sourcePosition", 0);
        setField(term443136, term443136.getClass(), "jsType", null);
        setField(term443136, term443136.getClass(), "parent", null);
        setField(term443133, term443133.getClass(), "first", term443136);
        setField(term443133, term443133.getClass(), "last", null);
        setField(term443133, term443133.getClass(), "propListHead", null);
        setIntField(term443133, term443133.getClass(), "sourcePosition", 0);
        setField(term443133, term443133.getClass(), "jsType", null);
        setField(term443133, term443133.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term442940;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term442848, args);
        assertTrue(recursiveEquals(term442848, term443173));
        assertTrue(recursiveEquals(term442940, term443174));
        assertTrue(recursiveEquals(retValue, term443133));
    }

};


