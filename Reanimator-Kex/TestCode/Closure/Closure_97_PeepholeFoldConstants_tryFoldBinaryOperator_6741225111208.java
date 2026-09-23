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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368094;
     Object term368186;
     Object term368420;
     Object term368421;
     Object term368379;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368094 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term368186 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term368278 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term368370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term368278, term368278.getClass(), "next", term368370);
        setField(term368186, term368186.getClass(), "first", term368278);
        setIntField(term368186, term368186.getClass(), "type", 15);
        term368420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term368420, term368420.getClass(), "currentTraversal", null);
        term368421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term368422 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term368423 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term368421, term368421.getClass(), "number", 0.0);
        setIntField(term368421, term368421.getClass(), "type", 15);
        setField(term368421, term368421.getClass(), "next", null);
        setDoubleField(term368422, term368422.getClass(), "number", 0.0);
        setIntField(term368422, term368422.getClass(), "type", 0);
        setDoubleField(term368423, term368423.getClass(), "number", 0.0);
        setIntField(term368423, term368423.getClass(), "type", 0);
        setField(term368423, term368423.getClass(), "next", null);
        setField(term368423, term368423.getClass(), "first", null);
        setField(term368423, term368423.getClass(), "last", null);
        setField(term368423, term368423.getClass(), "propListHead", null);
        setIntField(term368423, term368423.getClass(), "sourcePosition", 0);
        setField(term368423, term368423.getClass(), "jsType", null);
        setField(term368423, term368423.getClass(), "parent", null);
        setField(term368422, term368422.getClass(), "next", term368423);
        setField(term368422, term368422.getClass(), "first", null);
        setField(term368422, term368422.getClass(), "last", null);
        setField(term368422, term368422.getClass(), "propListHead", null);
        setIntField(term368422, term368422.getClass(), "sourcePosition", 0);
        setField(term368422, term368422.getClass(), "jsType", null);
        setField(term368422, term368422.getClass(), "parent", null);
        setField(term368421, term368421.getClass(), "first", term368422);
        setField(term368421, term368421.getClass(), "last", null);
        setField(term368421, term368421.getClass(), "propListHead", null);
        setIntField(term368421, term368421.getClass(), "sourcePosition", 0);
        setField(term368421, term368421.getClass(), "jsType", null);
        setField(term368421, term368421.getClass(), "parent", null);
        term368379 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term368382 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term368385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term368379, term368379.getClass(), "number", 0.0);
        setIntField(term368379, term368379.getClass(), "type", 15);
        setField(term368379, term368379.getClass(), "next", null);
        setDoubleField(term368382, term368382.getClass(), "number", 0.0);
        setIntField(term368382, term368382.getClass(), "type", 0);
        setDoubleField(term368385, term368385.getClass(), "number", 0.0);
        setIntField(term368385, term368385.getClass(), "type", 0);
        setField(term368385, term368385.getClass(), "next", null);
        setField(term368385, term368385.getClass(), "first", null);
        setField(term368385, term368385.getClass(), "last", null);
        setField(term368385, term368385.getClass(), "propListHead", null);
        setIntField(term368385, term368385.getClass(), "sourcePosition", 0);
        setField(term368385, term368385.getClass(), "jsType", null);
        setField(term368385, term368385.getClass(), "parent", null);
        setField(term368382, term368382.getClass(), "next", term368385);
        setField(term368382, term368382.getClass(), "first", null);
        setField(term368382, term368382.getClass(), "last", null);
        setField(term368382, term368382.getClass(), "propListHead", null);
        setIntField(term368382, term368382.getClass(), "sourcePosition", 0);
        setField(term368382, term368382.getClass(), "jsType", null);
        setField(term368382, term368382.getClass(), "parent", null);
        setField(term368379, term368379.getClass(), "first", term368382);
        setField(term368379, term368379.getClass(), "last", null);
        setField(term368379, term368379.getClass(), "propListHead", null);
        setIntField(term368379, term368379.getClass(), "sourcePosition", 0);
        setField(term368379, term368379.getClass(), "jsType", null);
        setField(term368379, term368379.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term368186;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term368094, args);
        assertTrue(recursiveEquals(term368094, term368420));
        assertTrue(recursiveEquals(term368186, term368421));
        assertTrue(recursiveEquals(retValue, term368379));
    }

};


