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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2666542;
     Object term2666634;
     Object term2667823;
     Object term2667824;
     Object term2667653;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2666542 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2666634 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2666726 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2666818 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2666910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2666726, term2666726.getClass(), "type", 35);
        setIntField(term2666910, term2666910.getClass(), "type", 40);
        setField(term2666910, term2666910.getClass(), "str", "");
        setField(term2666818, term2666818.getClass(), "next", term2666910);
        setIntField(term2666818, term2666818.getClass(), "type", 40);
        setField(term2666726, term2666726.getClass(), "first", term2666818);
        setField(term2666726, term2666726.getClass(), "next", term2666910);
        setField(term2666634, term2666634.getClass(), "first", term2666726);
        setIntField(term2666634, term2666634.getClass(), "type", 37);
        term2667823 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2667823, term2667823.getClass(), "currentTraversal", null);
        term2667824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2667825 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2667826 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2667829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2667824, term2667824.getClass(), "str", null);
        setIntField(term2667824, term2667824.getClass(), "type", 37);
        setField(term2667824, term2667824.getClass(), "next", null);
        setField(term2667825, term2667825.getClass(), "str", null);
        setIntField(term2667825, term2667825.getClass(), "type", 35);
        setField(term2667826, term2667826.getClass(), "str", "");
        setIntField(term2667826, term2667826.getClass(), "type", 40);
        setField(term2667826, term2667826.getClass(), "next", null);
        setField(term2667826, term2667826.getClass(), "first", null);
        setField(term2667826, term2667826.getClass(), "last", null);
        setField(term2667826, term2667826.getClass(), "propListHead", null);
        setIntField(term2667826, term2667826.getClass(), "sourcePosition", 0);
        setField(term2667826, term2667826.getClass(), "jsType", null);
        setField(term2667826, term2667826.getClass(), "parent", null);
        setField(term2667825, term2667825.getClass(), "next", term2667826);
        setField(term2667829, term2667829.getClass(), "str", null);
        setIntField(term2667829, term2667829.getClass(), "type", 40);
        setField(term2667829, term2667829.getClass(), "next", term2667826);
        setField(term2667829, term2667829.getClass(), "first", null);
        setField(term2667829, term2667829.getClass(), "last", null);
        setField(term2667829, term2667829.getClass(), "propListHead", null);
        setIntField(term2667829, term2667829.getClass(), "sourcePosition", 0);
        setField(term2667829, term2667829.getClass(), "jsType", null);
        setField(term2667829, term2667829.getClass(), "parent", null);
        setField(term2667825, term2667825.getClass(), "first", term2667829);
        setField(term2667825, term2667825.getClass(), "last", null);
        setField(term2667825, term2667825.getClass(), "propListHead", null);
        setIntField(term2667825, term2667825.getClass(), "sourcePosition", 0);
        setField(term2667825, term2667825.getClass(), "jsType", null);
        setField(term2667825, term2667825.getClass(), "parent", null);
        setField(term2667824, term2667824.getClass(), "first", term2667825);
        setField(term2667824, term2667824.getClass(), "last", null);
        setField(term2667824, term2667824.getClass(), "propListHead", null);
        setIntField(term2667824, term2667824.getClass(), "sourcePosition", 0);
        setField(term2667824, term2667824.getClass(), "jsType", null);
        setField(term2667824, term2667824.getClass(), "parent", null);
        term2667653 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2667655 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2667657 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2667662 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2667653, term2667653.getClass(), "str", null);
        setIntField(term2667653, term2667653.getClass(), "type", 37);
        setField(term2667653, term2667653.getClass(), "next", null);
        setField(term2667655, term2667655.getClass(), "str", null);
        setIntField(term2667655, term2667655.getClass(), "type", 35);
        setField(term2667657, term2667657.getClass(), "str", "");
        setIntField(term2667657, term2667657.getClass(), "type", 40);
        setField(term2667657, term2667657.getClass(), "next", null);
        setField(term2667657, term2667657.getClass(), "first", null);
        setField(term2667657, term2667657.getClass(), "last", null);
        setField(term2667657, term2667657.getClass(), "propListHead", null);
        setIntField(term2667657, term2667657.getClass(), "sourcePosition", 0);
        setField(term2667657, term2667657.getClass(), "jsType", null);
        setField(term2667657, term2667657.getClass(), "parent", null);
        setField(term2667655, term2667655.getClass(), "next", term2667657);
        setField(term2667662, term2667662.getClass(), "str", null);
        setIntField(term2667662, term2667662.getClass(), "type", 40);
        setField(term2667662, term2667662.getClass(), "next", term2667657);
        setField(term2667662, term2667662.getClass(), "first", null);
        setField(term2667662, term2667662.getClass(), "last", null);
        setField(term2667662, term2667662.getClass(), "propListHead", null);
        setIntField(term2667662, term2667662.getClass(), "sourcePosition", 0);
        setField(term2667662, term2667662.getClass(), "jsType", null);
        setField(term2667662, term2667662.getClass(), "parent", null);
        setField(term2667655, term2667655.getClass(), "first", term2667662);
        setField(term2667655, term2667655.getClass(), "last", null);
        setField(term2667655, term2667655.getClass(), "propListHead", null);
        setIntField(term2667655, term2667655.getClass(), "sourcePosition", 0);
        setField(term2667655, term2667655.getClass(), "jsType", null);
        setField(term2667655, term2667655.getClass(), "parent", null);
        setField(term2667653, term2667653.getClass(), "first", term2667655);
        setField(term2667653, term2667653.getClass(), "last", null);
        setField(term2667653, term2667653.getClass(), "propListHead", null);
        setIntField(term2667653, term2667653.getClass(), "sourcePosition", 0);
        setField(term2667653, term2667653.getClass(), "jsType", null);
        setField(term2667653, term2667653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2666634;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term2666542, args);
        assertTrue(recursiveEquals(term2666542, term2667823));
        assertTrue(recursiveEquals(term2666634, term2667824));
        assertTrue(recursiveEquals(retValue, term2667653));
    }

};


