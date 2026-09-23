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

public class PeepholeFoldConstants_optimizeSubtree_16065069931387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473836;
     Object term473928;
     Object term518721;
     Object term518722;
     Object term518686;

    public PeepholeFoldConstants_optimizeSubtree_16065069931387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473836 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term473928 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term474020 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term473928, term473928.getClass(), "type", 32);
        setField(term473928, term473928.getClass(), "first", term474020);
        term518721 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term518721, term518721.getClass(), "currentTraversal", null);
        term518722 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term518723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term518722, term518722.getClass(), "number", 0.0);
        setIntField(term518722, term518722.getClass(), "type", 32);
        setField(term518722, term518722.getClass(), "next", null);
        setDoubleField(term518723, term518723.getClass(), "number", 0.0);
        setIntField(term518723, term518723.getClass(), "type", 0);
        setField(term518723, term518723.getClass(), "next", null);
        setField(term518723, term518723.getClass(), "first", null);
        setField(term518723, term518723.getClass(), "last", null);
        setField(term518723, term518723.getClass(), "propListHead", null);
        setIntField(term518723, term518723.getClass(), "sourcePosition", 0);
        setField(term518723, term518723.getClass(), "jsType", null);
        setField(term518723, term518723.getClass(), "parent", null);
        setField(term518722, term518722.getClass(), "first", term518723);
        setField(term518722, term518722.getClass(), "last", null);
        setField(term518722, term518722.getClass(), "propListHead", null);
        setIntField(term518722, term518722.getClass(), "sourcePosition", 0);
        setField(term518722, term518722.getClass(), "jsType", null);
        setField(term518722, term518722.getClass(), "parent", null);
        term518686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term518689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term518686, term518686.getClass(), "number", 0.0);
        setIntField(term518686, term518686.getClass(), "type", 32);
        setField(term518686, term518686.getClass(), "next", null);
        setDoubleField(term518689, term518689.getClass(), "number", 0.0);
        setIntField(term518689, term518689.getClass(), "type", 0);
        setField(term518689, term518689.getClass(), "next", null);
        setField(term518689, term518689.getClass(), "first", null);
        setField(term518689, term518689.getClass(), "last", null);
        setField(term518689, term518689.getClass(), "propListHead", null);
        setIntField(term518689, term518689.getClass(), "sourcePosition", 0);
        setField(term518689, term518689.getClass(), "jsType", null);
        setField(term518689, term518689.getClass(), "parent", null);
        setField(term518686, term518686.getClass(), "first", term518689);
        setField(term518686, term518686.getClass(), "last", null);
        setField(term518686, term518686.getClass(), "propListHead", null);
        setIntField(term518686, term518686.getClass(), "sourcePosition", 0);
        setField(term518686, term518686.getClass(), "jsType", null);
        setField(term518686, term518686.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term473928;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term473836, args);
        assertTrue(recursiveEquals(term473836, term518721));
        assertTrue(recursiveEquals(term473928, term518722));
        assertTrue(recursiveEquals(retValue, term518686));
    }

};


