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

public class NodeUtil_canBeSideEffected_2078426861630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58362;
     Object term58673;

    public NodeUtil_canBeSideEffected_2078426861630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58362 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term58362, term58362.getClass(), "type", 389427431);
        setIntField(term58454, term58454.getClass(), "type", 0);
        setField(term58454, term58454.getClass(), "first", null);
        setField(term58454, term58454.getClass(), "next", term58546);
        setField(term58362, term58362.getClass(), "first", term58454);
        term58673 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58674 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term58675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term58673, term58673.getClass(), "number", 0.0);
        setIntField(term58673, term58673.getClass(), "type", 389427431);
        setField(term58673, term58673.getClass(), "next", null);
        setDoubleField(term58674, term58674.getClass(), "number", 0.0);
        setIntField(term58674, term58674.getClass(), "type", 0);
        setDoubleField(term58675, term58675.getClass(), "number", 0.0);
        setIntField(term58675, term58675.getClass(), "type", 0);
        setField(term58675, term58675.getClass(), "next", null);
        setField(term58675, term58675.getClass(), "first", null);
        setField(term58675, term58675.getClass(), "last", null);
        setField(term58675, term58675.getClass(), "propListHead", null);
        setIntField(term58675, term58675.getClass(), "sourcePosition", 0);
        setField(term58675, term58675.getClass(), "jsType", null);
        setField(term58675, term58675.getClass(), "parent", null);
        setField(term58674, term58674.getClass(), "next", term58675);
        setField(term58674, term58674.getClass(), "first", null);
        setField(term58674, term58674.getClass(), "last", null);
        setField(term58674, term58674.getClass(), "propListHead", null);
        setIntField(term58674, term58674.getClass(), "sourcePosition", 0);
        setField(term58674, term58674.getClass(), "jsType", null);
        setField(term58674, term58674.getClass(), "parent", null);
        setField(term58673, term58673.getClass(), "first", term58674);
        setField(term58673, term58673.getClass(), "last", null);
        setField(term58673, term58673.getClass(), "propListHead", null);
        setIntField(term58673, term58673.getClass(), "sourcePosition", 0);
        setField(term58673, term58673.getClass(), "jsType", null);
        setField(term58673, term58673.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term58362;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term58362, term58673));
        assertTrue(recursiveEquals(retValue, false));
    }

};


