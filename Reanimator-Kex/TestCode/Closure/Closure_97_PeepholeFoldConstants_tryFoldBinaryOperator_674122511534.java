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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142344;
     Object term142436;
     Object term142710;
     Object term142711;
     Object term142668;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142344 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term142436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142528 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142620 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term142528, term142528.getClass(), "next", term142620);
        setIntField(term142528, term142528.getClass(), "type", 39);
        setField(term142436, term142436.getClass(), "first", term142528);
        setIntField(term142436, term142436.getClass(), "type", 9);
        term142710 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term142710, term142710.getClass(), "currentTraversal", null);
        term142711 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142713 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term142711, term142711.getClass(), "number", 0.0);
        setIntField(term142711, term142711.getClass(), "type", 9);
        setField(term142711, term142711.getClass(), "next", null);
        setDoubleField(term142712, term142712.getClass(), "number", 0.0);
        setIntField(term142712, term142712.getClass(), "type", 39);
        setDoubleField(term142713, term142713.getClass(), "number", 0.0);
        setIntField(term142713, term142713.getClass(), "type", 0);
        setField(term142713, term142713.getClass(), "next", null);
        setField(term142713, term142713.getClass(), "first", null);
        setField(term142713, term142713.getClass(), "last", null);
        setField(term142713, term142713.getClass(), "propListHead", null);
        setIntField(term142713, term142713.getClass(), "sourcePosition", 0);
        setField(term142713, term142713.getClass(), "jsType", null);
        setField(term142713, term142713.getClass(), "parent", null);
        setField(term142712, term142712.getClass(), "next", term142713);
        setField(term142712, term142712.getClass(), "first", null);
        setField(term142712, term142712.getClass(), "last", null);
        setField(term142712, term142712.getClass(), "propListHead", null);
        setIntField(term142712, term142712.getClass(), "sourcePosition", 0);
        setField(term142712, term142712.getClass(), "jsType", null);
        setField(term142712, term142712.getClass(), "parent", null);
        setField(term142711, term142711.getClass(), "first", term142712);
        setField(term142711, term142711.getClass(), "last", null);
        setField(term142711, term142711.getClass(), "propListHead", null);
        setIntField(term142711, term142711.getClass(), "sourcePosition", 0);
        setField(term142711, term142711.getClass(), "jsType", null);
        setField(term142711, term142711.getClass(), "parent", null);
        term142668 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142674 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term142668, term142668.getClass(), "number", 0.0);
        setIntField(term142668, term142668.getClass(), "type", 9);
        setField(term142668, term142668.getClass(), "next", null);
        setDoubleField(term142671, term142671.getClass(), "number", 0.0);
        setIntField(term142671, term142671.getClass(), "type", 39);
        setDoubleField(term142674, term142674.getClass(), "number", 0.0);
        setIntField(term142674, term142674.getClass(), "type", 0);
        setField(term142674, term142674.getClass(), "next", null);
        setField(term142674, term142674.getClass(), "first", null);
        setField(term142674, term142674.getClass(), "last", null);
        setField(term142674, term142674.getClass(), "propListHead", null);
        setIntField(term142674, term142674.getClass(), "sourcePosition", 0);
        setField(term142674, term142674.getClass(), "jsType", null);
        setField(term142674, term142674.getClass(), "parent", null);
        setField(term142671, term142671.getClass(), "next", term142674);
        setField(term142671, term142671.getClass(), "first", null);
        setField(term142671, term142671.getClass(), "last", null);
        setField(term142671, term142671.getClass(), "propListHead", null);
        setIntField(term142671, term142671.getClass(), "sourcePosition", 0);
        setField(term142671, term142671.getClass(), "jsType", null);
        setField(term142671, term142671.getClass(), "parent", null);
        setField(term142668, term142668.getClass(), "first", term142671);
        setField(term142668, term142668.getClass(), "last", null);
        setField(term142668, term142668.getClass(), "propListHead", null);
        setIntField(term142668, term142668.getClass(), "sourcePosition", 0);
        setField(term142668, term142668.getClass(), "jsType", null);
        setField(term142668, term142668.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term142436;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term142344, args);
        assertTrue(recursiveEquals(term142344, term142710));
        assertTrue(recursiveEquals(term142436, term142711));
        assertTrue(recursiveEquals(retValue, term142668));
    }

};


