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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307870;
     Object term307962;
     Object term308625;
     Object term308626;
     Object term308565;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307870 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term307962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term308054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term308146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term308054, term308054.getClass(), "next", term308146);
        setIntField(term308054, term308054.getClass(), "type", 0);
        setField(term307962, term307962.getClass(), "first", term308054);
        setIntField(term307962, term307962.getClass(), "type", 100);
        setField(term307962, term307962.getClass(), "parent", null);
        term308625 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term308625, term308625.getClass(), "currentTraversal", null);
        term308626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term308627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term308628 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term308626, term308626.getClass(), "number", 0.0);
        setIntField(term308626, term308626.getClass(), "type", 100);
        setField(term308626, term308626.getClass(), "next", null);
        setDoubleField(term308627, term308627.getClass(), "number", 0.0);
        setIntField(term308627, term308627.getClass(), "type", 0);
        setDoubleField(term308628, term308628.getClass(), "number", 0.0);
        setIntField(term308628, term308628.getClass(), "type", 0);
        setField(term308628, term308628.getClass(), "next", null);
        setField(term308628, term308628.getClass(), "first", null);
        setField(term308628, term308628.getClass(), "last", null);
        setField(term308628, term308628.getClass(), "propListHead", null);
        setIntField(term308628, term308628.getClass(), "sourcePosition", 0);
        setField(term308628, term308628.getClass(), "jsType", null);
        setField(term308628, term308628.getClass(), "parent", null);
        setField(term308627, term308627.getClass(), "next", term308628);
        setField(term308627, term308627.getClass(), "first", null);
        setField(term308627, term308627.getClass(), "last", null);
        setField(term308627, term308627.getClass(), "propListHead", null);
        setIntField(term308627, term308627.getClass(), "sourcePosition", 0);
        setField(term308627, term308627.getClass(), "jsType", null);
        setField(term308627, term308627.getClass(), "parent", null);
        setField(term308626, term308626.getClass(), "first", term308627);
        setField(term308626, term308626.getClass(), "last", null);
        setField(term308626, term308626.getClass(), "propListHead", null);
        setIntField(term308626, term308626.getClass(), "sourcePosition", 0);
        setField(term308626, term308626.getClass(), "jsType", null);
        setField(term308626, term308626.getClass(), "parent", null);
        term308565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term308568 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term308571 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term308565, term308565.getClass(), "number", 0.0);
        setIntField(term308565, term308565.getClass(), "type", 100);
        setField(term308565, term308565.getClass(), "next", null);
        setDoubleField(term308568, term308568.getClass(), "number", 0.0);
        setIntField(term308568, term308568.getClass(), "type", 0);
        setDoubleField(term308571, term308571.getClass(), "number", 0.0);
        setIntField(term308571, term308571.getClass(), "type", 0);
        setField(term308571, term308571.getClass(), "next", null);
        setField(term308571, term308571.getClass(), "first", null);
        setField(term308571, term308571.getClass(), "last", null);
        setField(term308571, term308571.getClass(), "propListHead", null);
        setIntField(term308571, term308571.getClass(), "sourcePosition", 0);
        setField(term308571, term308571.getClass(), "jsType", null);
        setField(term308571, term308571.getClass(), "parent", null);
        setField(term308568, term308568.getClass(), "next", term308571);
        setField(term308568, term308568.getClass(), "first", null);
        setField(term308568, term308568.getClass(), "last", null);
        setField(term308568, term308568.getClass(), "propListHead", null);
        setIntField(term308568, term308568.getClass(), "sourcePosition", 0);
        setField(term308568, term308568.getClass(), "jsType", null);
        setField(term308568, term308568.getClass(), "parent", null);
        setField(term308565, term308565.getClass(), "first", term308568);
        setField(term308565, term308565.getClass(), "last", null);
        setField(term308565, term308565.getClass(), "propListHead", null);
        setIntField(term308565, term308565.getClass(), "sourcePosition", 0);
        setField(term308565, term308565.getClass(), "jsType", null);
        setField(term308565, term308565.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term307962;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term307870, args);
        assertTrue(recursiveEquals(term307870, term308625));
        assertTrue(recursiveEquals(term307962, term308626));
        assertTrue(recursiveEquals(retValue, term308565));
    }

};


