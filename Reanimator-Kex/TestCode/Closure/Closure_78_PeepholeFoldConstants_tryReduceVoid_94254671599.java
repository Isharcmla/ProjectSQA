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

public class PeepholeFoldConstants_tryReduceVoid_94254671599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16772;
     Object term16932;
     Object term17050;
     Object term17052;
     Object term17023;

    public PeepholeFoldConstants_tryReduceVoid_94254671599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16772 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term16862 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term16862, term16862.getClass(), "compiler", null);
        setField(term16772, term16772.getClass(), "currentTraversal", term16862);
        term16932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17002, term17002.getClass(), "type", 104);
        setField(term16932, term16932.getClass(), "first", term17002);
        setIntField(term16932, term16932.getClass(), "type", 104);
        term17050 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term17051 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term17051, term17051.getClass(), "compiler", null);
        setField(term17051, term17051.getClass(), "callback", null);
        setField(term17051, term17051.getClass(), "curNode", null);
        setField(term17051, term17051.getClass(), "scopes", null);
        setField(term17051, term17051.getClass(), "scopeRoots", null);
        setField(term17051, term17051.getClass(), "cfgs", null);
        setField(term17051, term17051.getClass(), "sourceName", null);
        setField(term17051, term17051.getClass(), "scopeCreator", null);
        setField(term17051, term17051.getClass(), "scopeCallback", null);
        setField(term17050, term17050.getClass(), "currentTraversal", term17051);
        term17052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17052, term17052.getClass(), "type", 104);
        setField(term17052, term17052.getClass(), "next", null);
        setIntField(term17053, term17053.getClass(), "type", 104);
        setField(term17053, term17053.getClass(), "next", null);
        setField(term17053, term17053.getClass(), "first", null);
        setField(term17053, term17053.getClass(), "last", null);
        setField(term17053, term17053.getClass(), "propListHead", null);
        setIntField(term17053, term17053.getClass(), "sourcePosition", 0);
        setField(term17053, term17053.getClass(), "jsType", null);
        setField(term17053, term17053.getClass(), "parent", null);
        setField(term17052, term17052.getClass(), "first", term17053);
        setField(term17052, term17052.getClass(), "last", null);
        setField(term17052, term17052.getClass(), "propListHead", null);
        setIntField(term17052, term17052.getClass(), "sourcePosition", 0);
        setField(term17052, term17052.getClass(), "jsType", null);
        setField(term17052, term17052.getClass(), "parent", null);
        term17023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17023, term17023.getClass(), "type", 104);
        setField(term17023, term17023.getClass(), "next", null);
        setIntField(term17025, term17025.getClass(), "type", 104);
        setField(term17025, term17025.getClass(), "next", null);
        setField(term17025, term17025.getClass(), "first", null);
        setField(term17025, term17025.getClass(), "last", null);
        setField(term17025, term17025.getClass(), "propListHead", null);
        setIntField(term17025, term17025.getClass(), "sourcePosition", 0);
        setField(term17025, term17025.getClass(), "jsType", null);
        setField(term17025, term17025.getClass(), "parent", null);
        setField(term17023, term17023.getClass(), "first", term17025);
        setField(term17023, term17023.getClass(), "last", null);
        setField(term17023, term17023.getClass(), "propListHead", null);
        setIntField(term17023, term17023.getClass(), "sourcePosition", 0);
        setField(term17023, term17023.getClass(), "jsType", null);
        setField(term17023, term17023.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16932;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term16772, args);
        assertTrue(recursiveEquals(term16772, term17050));
        assertTrue(recursiveEquals(term16932, term17052));
        assertTrue(recursiveEquals(retValue, term17023));
    }

};


