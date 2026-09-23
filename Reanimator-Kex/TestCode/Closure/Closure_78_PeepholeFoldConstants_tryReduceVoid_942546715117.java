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

public class PeepholeFoldConstants_tryReduceVoid_942546715117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19886;
     Object term20046;
     Object term20414;
     Object term20416;
     Object term20387;

    public PeepholeFoldConstants_tryReduceVoid_942546715117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19886 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term19976 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term19976, term19976.getClass(), "compiler", null);
        setField(term19886, term19886.getClass(), "currentTraversal", term19976);
        term20046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20116, term20116.getClass(), "type", 78);
        setField(term20046, term20046.getClass(), "first", term20116);
        setIntField(term20046, term20046.getClass(), "type", 78);
        term20414 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term20415 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term20415, term20415.getClass(), "compiler", null);
        setField(term20415, term20415.getClass(), "callback", null);
        setField(term20415, term20415.getClass(), "curNode", null);
        setField(term20415, term20415.getClass(), "scopes", null);
        setField(term20415, term20415.getClass(), "scopeRoots", null);
        setField(term20415, term20415.getClass(), "cfgs", null);
        setField(term20415, term20415.getClass(), "sourceName", null);
        setField(term20415, term20415.getClass(), "scopeCreator", null);
        setField(term20415, term20415.getClass(), "scopeCallback", null);
        setField(term20414, term20414.getClass(), "currentTraversal", term20415);
        term20416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20416, term20416.getClass(), "type", 78);
        setField(term20416, term20416.getClass(), "next", null);
        setIntField(term20417, term20417.getClass(), "type", 78);
        setField(term20417, term20417.getClass(), "next", null);
        setField(term20417, term20417.getClass(), "first", null);
        setField(term20417, term20417.getClass(), "last", null);
        setField(term20417, term20417.getClass(), "propListHead", null);
        setIntField(term20417, term20417.getClass(), "sourcePosition", 0);
        setField(term20417, term20417.getClass(), "jsType", null);
        setField(term20417, term20417.getClass(), "parent", null);
        setField(term20416, term20416.getClass(), "first", term20417);
        setField(term20416, term20416.getClass(), "last", null);
        setField(term20416, term20416.getClass(), "propListHead", null);
        setIntField(term20416, term20416.getClass(), "sourcePosition", 0);
        setField(term20416, term20416.getClass(), "jsType", null);
        setField(term20416, term20416.getClass(), "parent", null);
        term20387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20387, term20387.getClass(), "type", 78);
        setField(term20387, term20387.getClass(), "next", null);
        setIntField(term20389, term20389.getClass(), "type", 78);
        setField(term20389, term20389.getClass(), "next", null);
        setField(term20389, term20389.getClass(), "first", null);
        setField(term20389, term20389.getClass(), "last", null);
        setField(term20389, term20389.getClass(), "propListHead", null);
        setIntField(term20389, term20389.getClass(), "sourcePosition", 0);
        setField(term20389, term20389.getClass(), "jsType", null);
        setField(term20389, term20389.getClass(), "parent", null);
        setField(term20387, term20387.getClass(), "first", term20389);
        setField(term20387, term20387.getClass(), "last", null);
        setField(term20387, term20387.getClass(), "propListHead", null);
        setIntField(term20387, term20387.getClass(), "sourcePosition", 0);
        setField(term20387, term20387.getClass(), "jsType", null);
        setField(term20387, term20387.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20046;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term19886, args);
        assertTrue(recursiveEquals(term19886, term20414));
        assertTrue(recursiveEquals(term20046, term20416));
        assertTrue(recursiveEquals(retValue, term20387));
    }

};


