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

public class PeepholeFoldConstants_tryReduceVoid_942546715108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18276;
     Object term18436;
     Object term18727;
     Object term18729;
     Object term18700;

    public PeepholeFoldConstants_tryReduceVoid_942546715108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18276 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term18366 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term18366, term18366.getClass(), "compiler", null);
        setField(term18276, term18276.getClass(), "currentTraversal", term18366);
        term18436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18506, term18506.getClass(), "type", 65);
        setField(term18436, term18436.getClass(), "first", term18506);
        setIntField(term18436, term18436.getClass(), "type", 65);
        term18727 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term18728 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term18728, term18728.getClass(), "compiler", null);
        setField(term18728, term18728.getClass(), "callback", null);
        setField(term18728, term18728.getClass(), "curNode", null);
        setField(term18728, term18728.getClass(), "scopes", null);
        setField(term18728, term18728.getClass(), "scopeRoots", null);
        setField(term18728, term18728.getClass(), "cfgs", null);
        setField(term18728, term18728.getClass(), "sourceName", null);
        setField(term18728, term18728.getClass(), "scopeCreator", null);
        setField(term18728, term18728.getClass(), "scopeCallback", null);
        setField(term18727, term18727.getClass(), "currentTraversal", term18728);
        term18729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18729, term18729.getClass(), "type", 65);
        setField(term18729, term18729.getClass(), "next", null);
        setIntField(term18730, term18730.getClass(), "type", 65);
        setField(term18730, term18730.getClass(), "next", null);
        setField(term18730, term18730.getClass(), "first", null);
        setField(term18730, term18730.getClass(), "last", null);
        setField(term18730, term18730.getClass(), "propListHead", null);
        setIntField(term18730, term18730.getClass(), "sourcePosition", 0);
        setField(term18730, term18730.getClass(), "jsType", null);
        setField(term18730, term18730.getClass(), "parent", null);
        setField(term18729, term18729.getClass(), "first", term18730);
        setField(term18729, term18729.getClass(), "last", null);
        setField(term18729, term18729.getClass(), "propListHead", null);
        setIntField(term18729, term18729.getClass(), "sourcePosition", 0);
        setField(term18729, term18729.getClass(), "jsType", null);
        setField(term18729, term18729.getClass(), "parent", null);
        term18700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18700, term18700.getClass(), "type", 65);
        setField(term18700, term18700.getClass(), "next", null);
        setIntField(term18702, term18702.getClass(), "type", 65);
        setField(term18702, term18702.getClass(), "next", null);
        setField(term18702, term18702.getClass(), "first", null);
        setField(term18702, term18702.getClass(), "last", null);
        setField(term18702, term18702.getClass(), "propListHead", null);
        setIntField(term18702, term18702.getClass(), "sourcePosition", 0);
        setField(term18702, term18702.getClass(), "jsType", null);
        setField(term18702, term18702.getClass(), "parent", null);
        setField(term18700, term18700.getClass(), "first", term18702);
        setField(term18700, term18700.getClass(), "last", null);
        setField(term18700, term18700.getClass(), "propListHead", null);
        setIntField(term18700, term18700.getClass(), "sourcePosition", 0);
        setField(term18700, term18700.getClass(), "jsType", null);
        setField(term18700, term18700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18436;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term18276, args);
        assertTrue(recursiveEquals(term18276, term18727));
        assertTrue(recursiveEquals(term18436, term18729));
        assertTrue(recursiveEquals(retValue, term18700));
    }

};


