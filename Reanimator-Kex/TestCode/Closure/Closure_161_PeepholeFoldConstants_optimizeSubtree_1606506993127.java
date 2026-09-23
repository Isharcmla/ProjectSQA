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

public class PeepholeFoldConstants_optimizeSubtree_1606506993127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21004;
     Object term21074;
     Object term21085;
     Object term21086;
     Object term21076;

    public PeepholeFoldConstants_optimizeSubtree_1606506993127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21004 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term21074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21074, term21074.getClass(), "type", 93);
        term21085 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term21085, term21085.getClass(), "currentTraversal", null);
        term21086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21086, term21086.getClass(), "type", 93);
        setField(term21086, term21086.getClass(), "next", null);
        setField(term21086, term21086.getClass(), "first", null);
        setField(term21086, term21086.getClass(), "last", null);
        setField(term21086, term21086.getClass(), "propListHead", null);
        setIntField(term21086, term21086.getClass(), "sourcePosition", 0);
        setField(term21086, term21086.getClass(), "jsType", null);
        setField(term21086, term21086.getClass(), "parent", null);
        term21076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21076, term21076.getClass(), "type", 93);
        setField(term21076, term21076.getClass(), "next", null);
        setField(term21076, term21076.getClass(), "first", null);
        setField(term21076, term21076.getClass(), "last", null);
        setField(term21076, term21076.getClass(), "propListHead", null);
        setIntField(term21076, term21076.getClass(), "sourcePosition", 0);
        setField(term21076, term21076.getClass(), "jsType", null);
        setField(term21076, term21076.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21074;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term21004, args);
        assertTrue(recursiveEquals(term21004, term21085));
        assertTrue(recursiveEquals(term21074, term21086));
        assertTrue(recursiveEquals(retValue, term21076));
    }

};


