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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473431;
     Object term473523;
     Object term518681;
     Object term518682;
     Object term518625;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473431 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term473523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term473615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term473707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term473615, term473615.getClass(), "next", term473707);
        setIntField(term473615, term473615.getClass(), "type", 0);
        setField(term473523, term473523.getClass(), "first", term473615);
        setIntField(term473523, term473523.getClass(), "type", 101);
        setField(term473523, term473523.getClass(), "parent", null);
        term518681 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term518681, term518681.getClass(), "currentTraversal", null);
        term518682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term518682, term518682.getClass(), "str", null);
        setIntField(term518682, term518682.getClass(), "type", 101);
        setField(term518682, term518682.getClass(), "next", null);
        setField(term518683, term518683.getClass(), "str", null);
        setIntField(term518683, term518683.getClass(), "type", 0);
        setDoubleField(term518684, term518684.getClass(), "number", 0.0);
        setIntField(term518684, term518684.getClass(), "type", 0);
        setField(term518684, term518684.getClass(), "next", null);
        setField(term518684, term518684.getClass(), "first", null);
        setField(term518684, term518684.getClass(), "last", null);
        setField(term518684, term518684.getClass(), "propListHead", null);
        setIntField(term518684, term518684.getClass(), "sourcePosition", 0);
        setField(term518684, term518684.getClass(), "jsType", null);
        setField(term518684, term518684.getClass(), "parent", null);
        setField(term518683, term518683.getClass(), "next", term518684);
        setField(term518683, term518683.getClass(), "first", null);
        setField(term518683, term518683.getClass(), "last", null);
        setField(term518683, term518683.getClass(), "propListHead", null);
        setIntField(term518683, term518683.getClass(), "sourcePosition", 0);
        setField(term518683, term518683.getClass(), "jsType", null);
        setField(term518683, term518683.getClass(), "parent", null);
        setField(term518682, term518682.getClass(), "first", term518683);
        setField(term518682, term518682.getClass(), "last", null);
        setField(term518682, term518682.getClass(), "propListHead", null);
        setIntField(term518682, term518682.getClass(), "sourcePosition", 0);
        setField(term518682, term518682.getClass(), "jsType", null);
        setField(term518682, term518682.getClass(), "parent", null);
        term518625 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518627 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term518629 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term518625, term518625.getClass(), "str", null);
        setIntField(term518625, term518625.getClass(), "type", 101);
        setField(term518625, term518625.getClass(), "next", null);
        setField(term518627, term518627.getClass(), "str", null);
        setIntField(term518627, term518627.getClass(), "type", 0);
        setDoubleField(term518629, term518629.getClass(), "number", 0.0);
        setIntField(term518629, term518629.getClass(), "type", 0);
        setField(term518629, term518629.getClass(), "next", null);
        setField(term518629, term518629.getClass(), "first", null);
        setField(term518629, term518629.getClass(), "last", null);
        setField(term518629, term518629.getClass(), "propListHead", null);
        setIntField(term518629, term518629.getClass(), "sourcePosition", 0);
        setField(term518629, term518629.getClass(), "jsType", null);
        setField(term518629, term518629.getClass(), "parent", null);
        setField(term518627, term518627.getClass(), "next", term518629);
        setField(term518627, term518627.getClass(), "first", null);
        setField(term518627, term518627.getClass(), "last", null);
        setField(term518627, term518627.getClass(), "propListHead", null);
        setIntField(term518627, term518627.getClass(), "sourcePosition", 0);
        setField(term518627, term518627.getClass(), "jsType", null);
        setField(term518627, term518627.getClass(), "parent", null);
        setField(term518625, term518625.getClass(), "first", term518627);
        setField(term518625, term518625.getClass(), "last", null);
        setField(term518625, term518625.getClass(), "propListHead", null);
        setIntField(term518625, term518625.getClass(), "sourcePosition", 0);
        setField(term518625, term518625.getClass(), "jsType", null);
        setField(term518625, term518625.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term473523;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term473431, args);
        assertTrue(recursiveEquals(term473431, term518681));
        assertTrue(recursiveEquals(term473523, term518682));
        assertTrue(recursiveEquals(retValue, term518625));
    }

};


