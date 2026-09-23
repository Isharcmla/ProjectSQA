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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544412;
     Object term544504;
     Object term544724;
     Object term544725;
     Object term544695;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544412 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term544504 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term544596 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term544688 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term544596, term544596.getClass(), "next", term544688);
        setIntField(term544596, term544596.getClass(), "type", 39);
        setField(term544504, term544504.getClass(), "first", term544596);
        setIntField(term544504, term544504.getClass(), "type", 19);
        term544724 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term544724, term544724.getClass(), "currentTraversal", null);
        term544725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term544726 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term544727 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term544725, term544725.getClass(), "str", null);
        setIntField(term544725, term544725.getClass(), "type", 19);
        setField(term544725, term544725.getClass(), "next", null);
        setField(term544726, term544726.getClass(), "str", null);
        setIntField(term544726, term544726.getClass(), "type", 39);
        setField(term544727, term544727.getClass(), "str", null);
        setIntField(term544727, term544727.getClass(), "type", 0);
        setField(term544727, term544727.getClass(), "next", null);
        setField(term544727, term544727.getClass(), "first", null);
        setField(term544727, term544727.getClass(), "last", null);
        setField(term544727, term544727.getClass(), "propListHead", null);
        setIntField(term544727, term544727.getClass(), "sourcePosition", 0);
        setField(term544727, term544727.getClass(), "jsType", null);
        setField(term544727, term544727.getClass(), "parent", null);
        setField(term544726, term544726.getClass(), "next", term544727);
        setField(term544726, term544726.getClass(), "first", null);
        setField(term544726, term544726.getClass(), "last", null);
        setField(term544726, term544726.getClass(), "propListHead", null);
        setIntField(term544726, term544726.getClass(), "sourcePosition", 0);
        setField(term544726, term544726.getClass(), "jsType", null);
        setField(term544726, term544726.getClass(), "parent", null);
        setField(term544725, term544725.getClass(), "first", term544726);
        setField(term544725, term544725.getClass(), "last", null);
        setField(term544725, term544725.getClass(), "propListHead", null);
        setIntField(term544725, term544725.getClass(), "sourcePosition", 0);
        setField(term544725, term544725.getClass(), "jsType", null);
        setField(term544725, term544725.getClass(), "parent", null);
        term544695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term544697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term544699 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term544695, term544695.getClass(), "str", null);
        setIntField(term544695, term544695.getClass(), "type", 19);
        setField(term544695, term544695.getClass(), "next", null);
        setField(term544697, term544697.getClass(), "str", null);
        setIntField(term544697, term544697.getClass(), "type", 39);
        setField(term544699, term544699.getClass(), "str", null);
        setIntField(term544699, term544699.getClass(), "type", 0);
        setField(term544699, term544699.getClass(), "next", null);
        setField(term544699, term544699.getClass(), "first", null);
        setField(term544699, term544699.getClass(), "last", null);
        setField(term544699, term544699.getClass(), "propListHead", null);
        setIntField(term544699, term544699.getClass(), "sourcePosition", 0);
        setField(term544699, term544699.getClass(), "jsType", null);
        setField(term544699, term544699.getClass(), "parent", null);
        setField(term544697, term544697.getClass(), "next", term544699);
        setField(term544697, term544697.getClass(), "first", null);
        setField(term544697, term544697.getClass(), "last", null);
        setField(term544697, term544697.getClass(), "propListHead", null);
        setIntField(term544697, term544697.getClass(), "sourcePosition", 0);
        setField(term544697, term544697.getClass(), "jsType", null);
        setField(term544697, term544697.getClass(), "parent", null);
        setField(term544695, term544695.getClass(), "first", term544697);
        setField(term544695, term544695.getClass(), "last", null);
        setField(term544695, term544695.getClass(), "propListHead", null);
        setIntField(term544695, term544695.getClass(), "sourcePosition", 0);
        setField(term544695, term544695.getClass(), "jsType", null);
        setField(term544695, term544695.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term544504;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term544412, args);
        assertTrue(recursiveEquals(term544412, term544724));
        assertTrue(recursiveEquals(term544504, term544725));
        assertTrue(recursiveEquals(retValue, term544695));
    }

};


