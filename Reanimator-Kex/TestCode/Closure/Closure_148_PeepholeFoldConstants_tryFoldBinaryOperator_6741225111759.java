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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456895;
     Object term456987;
     Object term457682;
     Object term457683;
     Object term457631;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456895 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term456987 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term457079 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term457171 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term457079, term457079.getClass(), "next", term457171);
        setField(term456987, term456987.getClass(), "first", term457079);
        setIntField(term456987, term456987.getClass(), "type", 14);
        term457682 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term457682, term457682.getClass(), "currentTraversal", null);
        term457683 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term457684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term457685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term457683, term457683.getClass(), "number", 0.0);
        setIntField(term457683, term457683.getClass(), "type", 14);
        setField(term457683, term457683.getClass(), "next", null);
        setDoubleField(term457684, term457684.getClass(), "number", 0.0);
        setIntField(term457684, term457684.getClass(), "type", 0);
        setDoubleField(term457685, term457685.getClass(), "number", 0.0);
        setIntField(term457685, term457685.getClass(), "type", 0);
        setField(term457685, term457685.getClass(), "next", null);
        setField(term457685, term457685.getClass(), "first", null);
        setField(term457685, term457685.getClass(), "last", null);
        setField(term457685, term457685.getClass(), "propListHead", null);
        setIntField(term457685, term457685.getClass(), "sourcePosition", 0);
        setField(term457685, term457685.getClass(), "jsType", null);
        setField(term457685, term457685.getClass(), "parent", null);
        setField(term457684, term457684.getClass(), "next", term457685);
        setField(term457684, term457684.getClass(), "first", null);
        setField(term457684, term457684.getClass(), "last", null);
        setField(term457684, term457684.getClass(), "propListHead", null);
        setIntField(term457684, term457684.getClass(), "sourcePosition", 0);
        setField(term457684, term457684.getClass(), "jsType", null);
        setField(term457684, term457684.getClass(), "parent", null);
        setField(term457683, term457683.getClass(), "first", term457684);
        setField(term457683, term457683.getClass(), "last", null);
        setField(term457683, term457683.getClass(), "propListHead", null);
        setIntField(term457683, term457683.getClass(), "sourcePosition", 0);
        setField(term457683, term457683.getClass(), "jsType", null);
        setField(term457683, term457683.getClass(), "parent", null);
        term457631 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term457634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term457637 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term457631, term457631.getClass(), "number", 0.0);
        setIntField(term457631, term457631.getClass(), "type", 14);
        setField(term457631, term457631.getClass(), "next", null);
        setDoubleField(term457634, term457634.getClass(), "number", 0.0);
        setIntField(term457634, term457634.getClass(), "type", 0);
        setDoubleField(term457637, term457637.getClass(), "number", 0.0);
        setIntField(term457637, term457637.getClass(), "type", 0);
        setField(term457637, term457637.getClass(), "next", null);
        setField(term457637, term457637.getClass(), "first", null);
        setField(term457637, term457637.getClass(), "last", null);
        setField(term457637, term457637.getClass(), "propListHead", null);
        setIntField(term457637, term457637.getClass(), "sourcePosition", 0);
        setField(term457637, term457637.getClass(), "jsType", null);
        setField(term457637, term457637.getClass(), "parent", null);
        setField(term457634, term457634.getClass(), "next", term457637);
        setField(term457634, term457634.getClass(), "first", null);
        setField(term457634, term457634.getClass(), "last", null);
        setField(term457634, term457634.getClass(), "propListHead", null);
        setIntField(term457634, term457634.getClass(), "sourcePosition", 0);
        setField(term457634, term457634.getClass(), "jsType", null);
        setField(term457634, term457634.getClass(), "parent", null);
        setField(term457631, term457631.getClass(), "first", term457634);
        setField(term457631, term457631.getClass(), "last", null);
        setField(term457631, term457631.getClass(), "propListHead", null);
        setIntField(term457631, term457631.getClass(), "sourcePosition", 0);
        setField(term457631, term457631.getClass(), "jsType", null);
        setField(term457631, term457631.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term456987;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term456895, args);
        assertTrue(recursiveEquals(term456895, term457682));
        assertTrue(recursiveEquals(term456987, term457683));
        assertTrue(recursiveEquals(retValue, term457631));
    }

};


