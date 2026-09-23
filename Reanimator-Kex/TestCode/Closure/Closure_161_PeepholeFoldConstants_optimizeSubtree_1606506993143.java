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

public class PeepholeFoldConstants_optimizeSubtree_1606506993143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23333;
     Object term23403;
     Object term23967;
     Object term23968;
     Object term23958;

    public PeepholeFoldConstants_optimizeSubtree_1606506993143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23333 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term23403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23403, term23403.getClass(), "type", 35);
        term23967 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term23967, term23967.getClass(), "currentTraversal", null);
        term23968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23968, term23968.getClass(), "type", 35);
        setField(term23968, term23968.getClass(), "next", null);
        setField(term23968, term23968.getClass(), "first", null);
        setField(term23968, term23968.getClass(), "last", null);
        setField(term23968, term23968.getClass(), "propListHead", null);
        setIntField(term23968, term23968.getClass(), "sourcePosition", 0);
        setField(term23968, term23968.getClass(), "jsType", null);
        setField(term23968, term23968.getClass(), "parent", null);
        term23958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23958, term23958.getClass(), "type", 35);
        setField(term23958, term23958.getClass(), "next", null);
        setField(term23958, term23958.getClass(), "first", null);
        setField(term23958, term23958.getClass(), "last", null);
        setField(term23958, term23958.getClass(), "propListHead", null);
        setIntField(term23958, term23958.getClass(), "sourcePosition", 0);
        setField(term23958, term23958.getClass(), "jsType", null);
        setField(term23958, term23958.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23403;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term23333, args);
        assertTrue(recursiveEquals(term23333, term23967));
        assertTrue(recursiveEquals(term23403, term23968));
        assertTrue(recursiveEquals(retValue, term23958));
    }

};


