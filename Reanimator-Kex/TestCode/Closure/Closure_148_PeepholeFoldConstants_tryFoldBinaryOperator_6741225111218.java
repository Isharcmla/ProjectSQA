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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289479;
     Object term289571;
     Object term289796;
     Object term289797;
     Object term289762;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289479 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term289571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term289663 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term289755 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term289663, term289663.getClass(), "next", term289755);
        setField(term289571, term289571.getClass(), "first", term289663);
        setIntField(term289571, term289571.getClass(), "type", 15);
        term289796 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term289796, term289796.getClass(), "currentTraversal", null);
        term289797 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term289798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term289799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term289797, term289797.getClass(), "str", null);
        setIntField(term289797, term289797.getClass(), "type", 15);
        setField(term289797, term289797.getClass(), "next", null);
        setField(term289798, term289798.getClass(), "str", null);
        setIntField(term289798, term289798.getClass(), "type", 0);
        setField(term289799, term289799.getClass(), "str", null);
        setIntField(term289799, term289799.getClass(), "type", 0);
        setField(term289799, term289799.getClass(), "next", null);
        setField(term289799, term289799.getClass(), "first", null);
        setField(term289799, term289799.getClass(), "last", null);
        setField(term289799, term289799.getClass(), "propListHead", null);
        setIntField(term289799, term289799.getClass(), "sourcePosition", 0);
        setField(term289799, term289799.getClass(), "jsType", null);
        setField(term289799, term289799.getClass(), "parent", null);
        setField(term289798, term289798.getClass(), "next", term289799);
        setField(term289798, term289798.getClass(), "first", null);
        setField(term289798, term289798.getClass(), "last", null);
        setField(term289798, term289798.getClass(), "propListHead", null);
        setIntField(term289798, term289798.getClass(), "sourcePosition", 0);
        setField(term289798, term289798.getClass(), "jsType", null);
        setField(term289798, term289798.getClass(), "parent", null);
        setField(term289797, term289797.getClass(), "first", term289798);
        setField(term289797, term289797.getClass(), "last", null);
        setField(term289797, term289797.getClass(), "propListHead", null);
        setIntField(term289797, term289797.getClass(), "sourcePosition", 0);
        setField(term289797, term289797.getClass(), "jsType", null);
        setField(term289797, term289797.getClass(), "parent", null);
        term289762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term289764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term289766 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term289762, term289762.getClass(), "str", null);
        setIntField(term289762, term289762.getClass(), "type", 15);
        setField(term289762, term289762.getClass(), "next", null);
        setField(term289764, term289764.getClass(), "str", null);
        setIntField(term289764, term289764.getClass(), "type", 0);
        setField(term289766, term289766.getClass(), "str", null);
        setIntField(term289766, term289766.getClass(), "type", 0);
        setField(term289766, term289766.getClass(), "next", null);
        setField(term289766, term289766.getClass(), "first", null);
        setField(term289766, term289766.getClass(), "last", null);
        setField(term289766, term289766.getClass(), "propListHead", null);
        setIntField(term289766, term289766.getClass(), "sourcePosition", 0);
        setField(term289766, term289766.getClass(), "jsType", null);
        setField(term289766, term289766.getClass(), "parent", null);
        setField(term289764, term289764.getClass(), "next", term289766);
        setField(term289764, term289764.getClass(), "first", null);
        setField(term289764, term289764.getClass(), "last", null);
        setField(term289764, term289764.getClass(), "propListHead", null);
        setIntField(term289764, term289764.getClass(), "sourcePosition", 0);
        setField(term289764, term289764.getClass(), "jsType", null);
        setField(term289764, term289764.getClass(), "parent", null);
        setField(term289762, term289762.getClass(), "first", term289764);
        setField(term289762, term289762.getClass(), "last", null);
        setField(term289762, term289762.getClass(), "propListHead", null);
        setIntField(term289762, term289762.getClass(), "sourcePosition", 0);
        setField(term289762, term289762.getClass(), "jsType", null);
        setField(term289762, term289762.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term289571;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term289479, args);
        assertTrue(recursiveEquals(term289479, term289796));
        assertTrue(recursiveEquals(term289571, term289797));
        assertTrue(recursiveEquals(retValue, term289762));
    }

};


