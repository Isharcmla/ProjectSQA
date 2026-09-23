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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360293;
     Object term360385;
     Object term360661;
     Object term360662;
     Object term360617;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360293 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term360385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term360477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term360569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term360569, term360569.getClass(), "type", 40);
        setField(term360569, term360569.getClass(), "str", "");
        setField(term360477, term360477.getClass(), "next", term360569);
        setField(term360385, term360385.getClass(), "first", term360477);
        setIntField(term360385, term360385.getClass(), "type", 33);
        term360661 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term360661, term360661.getClass(), "currentTraversal", null);
        term360662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term360663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term360664 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term360662, term360662.getClass(), "number", 0.0);
        setIntField(term360662, term360662.getClass(), "type", 33);
        setField(term360662, term360662.getClass(), "next", null);
        setDoubleField(term360663, term360663.getClass(), "number", 0.0);
        setIntField(term360663, term360663.getClass(), "type", 0);
        setField(term360664, term360664.getClass(), "str", "");
        setIntField(term360664, term360664.getClass(), "type", 40);
        setField(term360664, term360664.getClass(), "next", null);
        setField(term360664, term360664.getClass(), "first", null);
        setField(term360664, term360664.getClass(), "last", null);
        setField(term360664, term360664.getClass(), "propListHead", null);
        setIntField(term360664, term360664.getClass(), "sourcePosition", 0);
        setField(term360664, term360664.getClass(), "jsType", null);
        setField(term360664, term360664.getClass(), "parent", null);
        setField(term360663, term360663.getClass(), "next", term360664);
        setField(term360663, term360663.getClass(), "first", null);
        setField(term360663, term360663.getClass(), "last", null);
        setField(term360663, term360663.getClass(), "propListHead", null);
        setIntField(term360663, term360663.getClass(), "sourcePosition", 0);
        setField(term360663, term360663.getClass(), "jsType", null);
        setField(term360663, term360663.getClass(), "parent", null);
        setField(term360662, term360662.getClass(), "first", term360663);
        setField(term360662, term360662.getClass(), "last", null);
        setField(term360662, term360662.getClass(), "propListHead", null);
        setIntField(term360662, term360662.getClass(), "sourcePosition", 0);
        setField(term360662, term360662.getClass(), "jsType", null);
        setField(term360662, term360662.getClass(), "parent", null);
        term360617 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term360620 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term360623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term360617, term360617.getClass(), "number", 0.0);
        setIntField(term360617, term360617.getClass(), "type", 33);
        setField(term360617, term360617.getClass(), "next", null);
        setDoubleField(term360620, term360620.getClass(), "number", 0.0);
        setIntField(term360620, term360620.getClass(), "type", 0);
        setField(term360623, term360623.getClass(), "str", "");
        setIntField(term360623, term360623.getClass(), "type", 40);
        setField(term360623, term360623.getClass(), "next", null);
        setField(term360623, term360623.getClass(), "first", null);
        setField(term360623, term360623.getClass(), "last", null);
        setField(term360623, term360623.getClass(), "propListHead", null);
        setIntField(term360623, term360623.getClass(), "sourcePosition", 0);
        setField(term360623, term360623.getClass(), "jsType", null);
        setField(term360623, term360623.getClass(), "parent", null);
        setField(term360620, term360620.getClass(), "next", term360623);
        setField(term360620, term360620.getClass(), "first", null);
        setField(term360620, term360620.getClass(), "last", null);
        setField(term360620, term360620.getClass(), "propListHead", null);
        setIntField(term360620, term360620.getClass(), "sourcePosition", 0);
        setField(term360620, term360620.getClass(), "jsType", null);
        setField(term360620, term360620.getClass(), "parent", null);
        setField(term360617, term360617.getClass(), "first", term360620);
        setField(term360617, term360617.getClass(), "last", null);
        setField(term360617, term360617.getClass(), "propListHead", null);
        setIntField(term360617, term360617.getClass(), "sourcePosition", 0);
        setField(term360617, term360617.getClass(), "jsType", null);
        setField(term360617, term360617.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term360385;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term360293, args);
        assertTrue(recursiveEquals(term360293, term360661));
        assertTrue(recursiveEquals(term360385, term360662));
        assertTrue(recursiveEquals(retValue, term360617));
    }

};


