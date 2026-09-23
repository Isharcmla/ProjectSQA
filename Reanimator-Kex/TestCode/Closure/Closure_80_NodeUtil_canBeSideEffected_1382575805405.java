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

public class NodeUtil_canBeSideEffected_1382575805405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37757;
     Object term37875;

    public NodeUtil_canBeSideEffected_1382575805405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term37757, term37757.getClass(), "type", 0);
        setField(term37757, term37757.getClass(), "first", term37849);
        term37875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37876 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term37875, term37875.getClass(), "type", 0);
        setField(term37875, term37875.getClass(), "next", null);
        setDoubleField(term37876, term37876.getClass(), "number", 0.0);
        setIntField(term37876, term37876.getClass(), "type", 0);
        setField(term37876, term37876.getClass(), "next", null);
        setField(term37876, term37876.getClass(), "first", null);
        setField(term37876, term37876.getClass(), "last", null);
        setField(term37876, term37876.getClass(), "propListHead", null);
        setIntField(term37876, term37876.getClass(), "sourcePosition", 0);
        setField(term37876, term37876.getClass(), "jsType", null);
        setField(term37876, term37876.getClass(), "parent", null);
        setField(term37875, term37875.getClass(), "first", term37876);
        setField(term37875, term37875.getClass(), "last", null);
        setField(term37875, term37875.getClass(), "propListHead", null);
        setIntField(term37875, term37875.getClass(), "sourcePosition", 0);
        setField(term37875, term37875.getClass(), "jsType", null);
        setField(term37875, term37875.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37757;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term37757, term37875));
    }

};


