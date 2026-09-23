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

public class PeepholeFoldConstants_optimizeSubtree_16065069932151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585892;
     Object term585962;
     Object term586512;
     Object term586513;
     Object term586497;

    public PeepholeFoldConstants_optimizeSubtree_16065069932151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585892 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term585962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term585962, term585962.getClass(), "type", 36);
        setField(term585962, term585962.getClass(), "first", term585962);
        term586512 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term586512, term586512.getClass(), "currentTraversal", null);
        term586513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term586513, term586513.getClass(), "type", 36);
        setField(term586513, term586513.getClass(), "next", null);
        setField(term586513, term586513.getClass(), "first", term586513);
        setField(term586513, term586513.getClass(), "last", null);
        setField(term586513, term586513.getClass(), "propListHead", null);
        setIntField(term586513, term586513.getClass(), "sourcePosition", 0);
        setField(term586513, term586513.getClass(), "jsType", null);
        setField(term586513, term586513.getClass(), "parent", null);
        term586497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term586497, term586497.getClass(), "type", 36);
        setField(term586497, term586497.getClass(), "next", null);
        setField(term586497, term586497.getClass(), "first", term586497);
        setField(term586497, term586497.getClass(), "last", null);
        setField(term586497, term586497.getClass(), "propListHead", null);
        setIntField(term586497, term586497.getClass(), "sourcePosition", 0);
        setField(term586497, term586497.getClass(), "jsType", null);
        setField(term586497, term586497.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term585962;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term585892, args);
        assertTrue(recursiveEquals(term585892, term586512));
        assertTrue(recursiveEquals(term585962, term586513));
        assertTrue(recursiveEquals(retValue, term586497));
    }

};


