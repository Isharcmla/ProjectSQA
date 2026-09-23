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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147220;
     Object term147312;
     Object term147546;
     Object term147547;
     Object term147505;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147220 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term147312 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147404 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147496 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term147404, term147404.getClass(), "next", term147496);
        setField(term147312, term147312.getClass(), "first", term147404);
        setIntField(term147312, term147312.getClass(), "type", 52);
        term147546 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term147546, term147546.getClass(), "currentTraversal", null);
        term147547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term147547, term147547.getClass(), "number", 0.0);
        setIntField(term147547, term147547.getClass(), "type", 52);
        setField(term147547, term147547.getClass(), "next", null);
        setDoubleField(term147548, term147548.getClass(), "number", 0.0);
        setIntField(term147548, term147548.getClass(), "type", 0);
        setDoubleField(term147549, term147549.getClass(), "number", 0.0);
        setIntField(term147549, term147549.getClass(), "type", 0);
        setField(term147549, term147549.getClass(), "next", null);
        setField(term147549, term147549.getClass(), "first", null);
        setField(term147549, term147549.getClass(), "last", null);
        setField(term147549, term147549.getClass(), "propListHead", null);
        setIntField(term147549, term147549.getClass(), "sourcePosition", 0);
        setField(term147549, term147549.getClass(), "jsType", null);
        setField(term147549, term147549.getClass(), "parent", null);
        setField(term147548, term147548.getClass(), "next", term147549);
        setField(term147548, term147548.getClass(), "first", null);
        setField(term147548, term147548.getClass(), "last", null);
        setField(term147548, term147548.getClass(), "propListHead", null);
        setIntField(term147548, term147548.getClass(), "sourcePosition", 0);
        setField(term147548, term147548.getClass(), "jsType", null);
        setField(term147548, term147548.getClass(), "parent", null);
        setField(term147547, term147547.getClass(), "first", term147548);
        setField(term147547, term147547.getClass(), "last", null);
        setField(term147547, term147547.getClass(), "propListHead", null);
        setIntField(term147547, term147547.getClass(), "sourcePosition", 0);
        setField(term147547, term147547.getClass(), "jsType", null);
        setField(term147547, term147547.getClass(), "parent", null);
        term147505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147508 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term147505, term147505.getClass(), "number", 0.0);
        setIntField(term147505, term147505.getClass(), "type", 52);
        setField(term147505, term147505.getClass(), "next", null);
        setDoubleField(term147508, term147508.getClass(), "number", 0.0);
        setIntField(term147508, term147508.getClass(), "type", 0);
        setDoubleField(term147511, term147511.getClass(), "number", 0.0);
        setIntField(term147511, term147511.getClass(), "type", 0);
        setField(term147511, term147511.getClass(), "next", null);
        setField(term147511, term147511.getClass(), "first", null);
        setField(term147511, term147511.getClass(), "last", null);
        setField(term147511, term147511.getClass(), "propListHead", null);
        setIntField(term147511, term147511.getClass(), "sourcePosition", 0);
        setField(term147511, term147511.getClass(), "jsType", null);
        setField(term147511, term147511.getClass(), "parent", null);
        setField(term147508, term147508.getClass(), "next", term147511);
        setField(term147508, term147508.getClass(), "first", null);
        setField(term147508, term147508.getClass(), "last", null);
        setField(term147508, term147508.getClass(), "propListHead", null);
        setIntField(term147508, term147508.getClass(), "sourcePosition", 0);
        setField(term147508, term147508.getClass(), "jsType", null);
        setField(term147508, term147508.getClass(), "parent", null);
        setField(term147505, term147505.getClass(), "first", term147508);
        setField(term147505, term147505.getClass(), "last", null);
        setField(term147505, term147505.getClass(), "propListHead", null);
        setIntField(term147505, term147505.getClass(), "sourcePosition", 0);
        setField(term147505, term147505.getClass(), "jsType", null);
        setField(term147505, term147505.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term147312;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term147220, args);
        assertTrue(recursiveEquals(term147220, term147546));
        assertTrue(recursiveEquals(term147312, term147547));
        assertTrue(recursiveEquals(retValue, term147505));
    }

};


