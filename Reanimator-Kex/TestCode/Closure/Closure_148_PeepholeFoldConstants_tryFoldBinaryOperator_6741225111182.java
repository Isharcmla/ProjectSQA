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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279558;
     Object term279650;
     Object term280273;
     Object term280274;
     Object term280240;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279558 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term279650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term279742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term279834 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term279742, term279742.getClass(), "next", term279834);
        setIntField(term279742, term279742.getClass(), "type", 63);
        setField(term279650, term279650.getClass(), "first", term279742);
        setIntField(term279650, term279650.getClass(), "type", 35);
        term280273 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term280273, term280273.getClass(), "currentTraversal", null);
        term280274 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term280275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term280276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term280274, term280274.getClass(), "str", null);
        setIntField(term280274, term280274.getClass(), "type", 35);
        setField(term280274, term280274.getClass(), "next", null);
        setField(term280275, term280275.getClass(), "str", null);
        setIntField(term280275, term280275.getClass(), "type", 63);
        setField(term280276, term280276.getClass(), "str", null);
        setIntField(term280276, term280276.getClass(), "type", 0);
        setField(term280276, term280276.getClass(), "next", null);
        setField(term280276, term280276.getClass(), "first", null);
        setField(term280276, term280276.getClass(), "last", null);
        setField(term280276, term280276.getClass(), "propListHead", null);
        setIntField(term280276, term280276.getClass(), "sourcePosition", 0);
        setField(term280276, term280276.getClass(), "jsType", null);
        setField(term280276, term280276.getClass(), "parent", null);
        setField(term280275, term280275.getClass(), "next", term280276);
        setField(term280275, term280275.getClass(), "first", null);
        setField(term280275, term280275.getClass(), "last", null);
        setField(term280275, term280275.getClass(), "propListHead", null);
        setIntField(term280275, term280275.getClass(), "sourcePosition", 0);
        setField(term280275, term280275.getClass(), "jsType", null);
        setField(term280275, term280275.getClass(), "parent", null);
        setField(term280274, term280274.getClass(), "first", term280275);
        setField(term280274, term280274.getClass(), "last", null);
        setField(term280274, term280274.getClass(), "propListHead", null);
        setIntField(term280274, term280274.getClass(), "sourcePosition", 0);
        setField(term280274, term280274.getClass(), "jsType", null);
        setField(term280274, term280274.getClass(), "parent", null);
        term280240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term280242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term280244 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term280240, term280240.getClass(), "str", null);
        setIntField(term280240, term280240.getClass(), "type", 35);
        setField(term280240, term280240.getClass(), "next", null);
        setField(term280242, term280242.getClass(), "str", null);
        setIntField(term280242, term280242.getClass(), "type", 63);
        setField(term280244, term280244.getClass(), "str", null);
        setIntField(term280244, term280244.getClass(), "type", 0);
        setField(term280244, term280244.getClass(), "next", null);
        setField(term280244, term280244.getClass(), "first", null);
        setField(term280244, term280244.getClass(), "last", null);
        setField(term280244, term280244.getClass(), "propListHead", null);
        setIntField(term280244, term280244.getClass(), "sourcePosition", 0);
        setField(term280244, term280244.getClass(), "jsType", null);
        setField(term280244, term280244.getClass(), "parent", null);
        setField(term280242, term280242.getClass(), "next", term280244);
        setField(term280242, term280242.getClass(), "first", null);
        setField(term280242, term280242.getClass(), "last", null);
        setField(term280242, term280242.getClass(), "propListHead", null);
        setIntField(term280242, term280242.getClass(), "sourcePosition", 0);
        setField(term280242, term280242.getClass(), "jsType", null);
        setField(term280242, term280242.getClass(), "parent", null);
        setField(term280240, term280240.getClass(), "first", term280242);
        setField(term280240, term280240.getClass(), "last", null);
        setField(term280240, term280240.getClass(), "propListHead", null);
        setIntField(term280240, term280240.getClass(), "sourcePosition", 0);
        setField(term280240, term280240.getClass(), "jsType", null);
        setField(term280240, term280240.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term279650;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term279558, args);
        assertTrue(recursiveEquals(term279558, term280273));
        assertTrue(recursiveEquals(term279650, term280274));
        assertTrue(recursiveEquals(retValue, term280240));
    }

};


