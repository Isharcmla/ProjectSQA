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

public class PeepholeFoldConstants_optimizeSubtree_16065069931378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470349;
     Object term470441;
     Object term517857;
     Object term517858;
     Object term517733;

    public PeepholeFoldConstants_optimizeSubtree_16065069931378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470349 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term470441 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term470533 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term470625 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term470441, term470441.getClass(), "type", 35);
        setField(term470533, term470533.getClass(), "next", term470625);
        setIntField(term470533, term470533.getClass(), "type", 63);
        setField(term470441, term470441.getClass(), "first", term470533);
        term517857 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term517857, term517857.getClass(), "currentTraversal", null);
        term517858 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term517858, term517858.getClass(), "number", 0.0);
        setIntField(term517858, term517858.getClass(), "type", 35);
        setField(term517858, term517858.getClass(), "next", null);
        setDoubleField(term517859, term517859.getClass(), "number", 0.0);
        setIntField(term517859, term517859.getClass(), "type", 63);
        setDoubleField(term517860, term517860.getClass(), "number", 0.0);
        setIntField(term517860, term517860.getClass(), "type", 0);
        setField(term517860, term517860.getClass(), "next", null);
        setField(term517860, term517860.getClass(), "first", null);
        setField(term517860, term517860.getClass(), "last", null);
        setField(term517860, term517860.getClass(), "propListHead", null);
        setIntField(term517860, term517860.getClass(), "sourcePosition", 0);
        setField(term517860, term517860.getClass(), "jsType", null);
        setField(term517860, term517860.getClass(), "parent", null);
        setField(term517859, term517859.getClass(), "next", term517860);
        setField(term517859, term517859.getClass(), "first", null);
        setField(term517859, term517859.getClass(), "last", null);
        setField(term517859, term517859.getClass(), "propListHead", null);
        setIntField(term517859, term517859.getClass(), "sourcePosition", 0);
        setField(term517859, term517859.getClass(), "jsType", null);
        setField(term517859, term517859.getClass(), "parent", null);
        setField(term517858, term517858.getClass(), "first", term517859);
        setField(term517858, term517858.getClass(), "last", null);
        setField(term517858, term517858.getClass(), "propListHead", null);
        setIntField(term517858, term517858.getClass(), "sourcePosition", 0);
        setField(term517858, term517858.getClass(), "jsType", null);
        setField(term517858, term517858.getClass(), "parent", null);
        term517733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517736 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term517733, term517733.getClass(), "number", 0.0);
        setIntField(term517733, term517733.getClass(), "type", 35);
        setField(term517733, term517733.getClass(), "next", null);
        setDoubleField(term517736, term517736.getClass(), "number", 0.0);
        setIntField(term517736, term517736.getClass(), "type", 63);
        setDoubleField(term517739, term517739.getClass(), "number", 0.0);
        setIntField(term517739, term517739.getClass(), "type", 0);
        setField(term517739, term517739.getClass(), "next", null);
        setField(term517739, term517739.getClass(), "first", null);
        setField(term517739, term517739.getClass(), "last", null);
        setField(term517739, term517739.getClass(), "propListHead", null);
        setIntField(term517739, term517739.getClass(), "sourcePosition", 0);
        setField(term517739, term517739.getClass(), "jsType", null);
        setField(term517739, term517739.getClass(), "parent", null);
        setField(term517736, term517736.getClass(), "next", term517739);
        setField(term517736, term517736.getClass(), "first", null);
        setField(term517736, term517736.getClass(), "last", null);
        setField(term517736, term517736.getClass(), "propListHead", null);
        setIntField(term517736, term517736.getClass(), "sourcePosition", 0);
        setField(term517736, term517736.getClass(), "jsType", null);
        setField(term517736, term517736.getClass(), "parent", null);
        setField(term517733, term517733.getClass(), "first", term517736);
        setField(term517733, term517733.getClass(), "last", null);
        setField(term517733, term517733.getClass(), "propListHead", null);
        setIntField(term517733, term517733.getClass(), "sourcePosition", 0);
        setField(term517733, term517733.getClass(), "jsType", null);
        setField(term517733, term517733.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term470441;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term470349, args);
        assertTrue(recursiveEquals(term470349, term517857));
        assertTrue(recursiveEquals(term470441, term517858));
        assertTrue(recursiveEquals(retValue, term517733));
    }

};


