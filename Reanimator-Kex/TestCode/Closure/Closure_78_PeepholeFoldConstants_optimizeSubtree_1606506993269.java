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

public class PeepholeFoldConstants_optimizeSubtree_1606506993269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43861;
     Object term43931;
     Object term43983;
     Object term43984;
     Object term43967;

    public PeepholeFoldConstants_optimizeSubtree_1606506993269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term43931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43931, term43931.getClass(), "type", 42);
        setField(term43931, term43931.getClass(), "first", term43931);
        term43983 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term43983, term43983.getClass(), "currentTraversal", null);
        term43984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43984, term43984.getClass(), "type", 42);
        setField(term43984, term43984.getClass(), "next", null);
        setField(term43984, term43984.getClass(), "first", term43984);
        setField(term43984, term43984.getClass(), "last", null);
        setField(term43984, term43984.getClass(), "propListHead", null);
        setIntField(term43984, term43984.getClass(), "sourcePosition", 0);
        setField(term43984, term43984.getClass(), "jsType", null);
        setField(term43984, term43984.getClass(), "parent", null);
        term43967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43967, term43967.getClass(), "type", 42);
        setField(term43967, term43967.getClass(), "next", null);
        setField(term43967, term43967.getClass(), "first", term43967);
        setField(term43967, term43967.getClass(), "last", null);
        setField(term43967, term43967.getClass(), "propListHead", null);
        setIntField(term43967, term43967.getClass(), "sourcePosition", 0);
        setField(term43967, term43967.getClass(), "jsType", null);
        setField(term43967, term43967.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43931;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term43861, args);
        assertTrue(recursiveEquals(term43861, term43983));
        assertTrue(recursiveEquals(term43931, term43984));
        assertTrue(recursiveEquals(retValue, term43967));
    }

};


