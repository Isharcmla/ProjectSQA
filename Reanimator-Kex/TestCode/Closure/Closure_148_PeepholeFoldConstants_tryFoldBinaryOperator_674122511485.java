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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100865;
     Object term100957;
     Object term101494;
     Object term101495;
     Object term101437;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100865 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term100957 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term101049, term101049.getClass(), "next", term101141);
        setIntField(term101049, term101049.getClass(), "type", 0);
        setField(term100957, term100957.getClass(), "first", term101049);
        setIntField(term100957, term100957.getClass(), "type", 101);
        setField(term100957, term100957.getClass(), "parent", null);
        term101494 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term101494, term101494.getClass(), "currentTraversal", null);
        term101495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101496 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101497 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term101495, term101495.getClass(), "number", 0.0);
        setIntField(term101495, term101495.getClass(), "type", 101);
        setField(term101495, term101495.getClass(), "next", null);
        setDoubleField(term101496, term101496.getClass(), "number", 0.0);
        setIntField(term101496, term101496.getClass(), "type", 0);
        setField(term101497, term101497.getClass(), "str", null);
        setIntField(term101497, term101497.getClass(), "type", 0);
        setField(term101497, term101497.getClass(), "next", null);
        setField(term101497, term101497.getClass(), "first", null);
        setField(term101497, term101497.getClass(), "last", null);
        setField(term101497, term101497.getClass(), "propListHead", null);
        setIntField(term101497, term101497.getClass(), "sourcePosition", 0);
        setField(term101497, term101497.getClass(), "jsType", null);
        setField(term101497, term101497.getClass(), "parent", null);
        setField(term101496, term101496.getClass(), "next", term101497);
        setField(term101496, term101496.getClass(), "first", null);
        setField(term101496, term101496.getClass(), "last", null);
        setField(term101496, term101496.getClass(), "propListHead", null);
        setIntField(term101496, term101496.getClass(), "sourcePosition", 0);
        setField(term101496, term101496.getClass(), "jsType", null);
        setField(term101496, term101496.getClass(), "parent", null);
        setField(term101495, term101495.getClass(), "first", term101496);
        setField(term101495, term101495.getClass(), "last", null);
        setField(term101495, term101495.getClass(), "propListHead", null);
        setIntField(term101495, term101495.getClass(), "sourcePosition", 0);
        setField(term101495, term101495.getClass(), "jsType", null);
        setField(term101495, term101495.getClass(), "parent", null);
        term101437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101440 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term101437, term101437.getClass(), "number", 0.0);
        setIntField(term101437, term101437.getClass(), "type", 101);
        setField(term101437, term101437.getClass(), "next", null);
        setDoubleField(term101440, term101440.getClass(), "number", 0.0);
        setIntField(term101440, term101440.getClass(), "type", 0);
        setField(term101443, term101443.getClass(), "str", null);
        setIntField(term101443, term101443.getClass(), "type", 0);
        setField(term101443, term101443.getClass(), "next", null);
        setField(term101443, term101443.getClass(), "first", null);
        setField(term101443, term101443.getClass(), "last", null);
        setField(term101443, term101443.getClass(), "propListHead", null);
        setIntField(term101443, term101443.getClass(), "sourcePosition", 0);
        setField(term101443, term101443.getClass(), "jsType", null);
        setField(term101443, term101443.getClass(), "parent", null);
        setField(term101440, term101440.getClass(), "next", term101443);
        setField(term101440, term101440.getClass(), "first", null);
        setField(term101440, term101440.getClass(), "last", null);
        setField(term101440, term101440.getClass(), "propListHead", null);
        setIntField(term101440, term101440.getClass(), "sourcePosition", 0);
        setField(term101440, term101440.getClass(), "jsType", null);
        setField(term101440, term101440.getClass(), "parent", null);
        setField(term101437, term101437.getClass(), "first", term101440);
        setField(term101437, term101437.getClass(), "last", null);
        setField(term101437, term101437.getClass(), "propListHead", null);
        setIntField(term101437, term101437.getClass(), "sourcePosition", 0);
        setField(term101437, term101437.getClass(), "jsType", null);
        setField(term101437, term101437.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term100957;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term100865, args);
        assertTrue(recursiveEquals(term100865, term101494));
        assertTrue(recursiveEquals(term100957, term101495));
        assertTrue(recursiveEquals(retValue, term101437));
    }

};


