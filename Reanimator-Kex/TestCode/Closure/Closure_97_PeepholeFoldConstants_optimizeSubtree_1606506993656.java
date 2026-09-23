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

public class PeepholeFoldConstants_optimizeSubtree_1606506993656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170567;
     Object term170637;
     Object term170664;
     Object term170665;
     Object term170639;

    public PeepholeFoldConstants_optimizeSubtree_1606506993656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170567 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term170637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term170637, term170637.getClass(), "type", 35);
        setField(term170637, term170637.getClass(), "first", term170637);
        setField(term170637, term170637.getClass(), "next", term170637);
        term170664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term170664, term170664.getClass(), "currentTraversal", null);
        term170665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term170665, term170665.getClass(), "type", 35);
        setField(term170665, term170665.getClass(), "next", term170665);
        setField(term170665, term170665.getClass(), "first", term170665);
        setField(term170665, term170665.getClass(), "last", null);
        setField(term170665, term170665.getClass(), "propListHead", null);
        setIntField(term170665, term170665.getClass(), "sourcePosition", 0);
        setField(term170665, term170665.getClass(), "jsType", null);
        setField(term170665, term170665.getClass(), "parent", null);
        term170639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term170639, term170639.getClass(), "type", 35);
        setField(term170639, term170639.getClass(), "next", term170639);
        setField(term170639, term170639.getClass(), "first", term170639);
        setField(term170639, term170639.getClass(), "last", null);
        setField(term170639, term170639.getClass(), "propListHead", null);
        setIntField(term170639, term170639.getClass(), "sourcePosition", 0);
        setField(term170639, term170639.getClass(), "jsType", null);
        setField(term170639, term170639.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term170637;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term170567, args);
        assertTrue(recursiveEquals(term170567, term170664));
        assertTrue(recursiveEquals(term170637, term170665));
        assertTrue(recursiveEquals(retValue, term170639));
    }

};


