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

public class PeepholeFoldConstants_tryReduceVoid_94254671588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15676;
     Object term15836;
     Object term16312;
     Object term16314;
     Object term16285;

    public PeepholeFoldConstants_tryReduceVoid_94254671588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15676 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term15766 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term15766, term15766.getClass(), "compiler", null);
        setField(term15676, term15676.getClass(), "currentTraversal", term15766);
        term15836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15906, term15906.getClass(), "type", 56);
        setField(term15836, term15836.getClass(), "first", term15906);
        setIntField(term15836, term15836.getClass(), "type", 56);
        term16312 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term16313 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term16313, term16313.getClass(), "compiler", null);
        setField(term16313, term16313.getClass(), "callback", null);
        setField(term16313, term16313.getClass(), "curNode", null);
        setField(term16313, term16313.getClass(), "scopes", null);
        setField(term16313, term16313.getClass(), "scopeRoots", null);
        setField(term16313, term16313.getClass(), "cfgs", null);
        setField(term16313, term16313.getClass(), "sourceName", null);
        setField(term16313, term16313.getClass(), "scopeCreator", null);
        setField(term16313, term16313.getClass(), "scopeCallback", null);
        setField(term16312, term16312.getClass(), "currentTraversal", term16313);
        term16314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16314, term16314.getClass(), "type", 56);
        setField(term16314, term16314.getClass(), "next", null);
        setIntField(term16315, term16315.getClass(), "type", 56);
        setField(term16315, term16315.getClass(), "next", null);
        setField(term16315, term16315.getClass(), "first", null);
        setField(term16315, term16315.getClass(), "last", null);
        setField(term16315, term16315.getClass(), "propListHead", null);
        setIntField(term16315, term16315.getClass(), "sourcePosition", 0);
        setField(term16315, term16315.getClass(), "jsType", null);
        setField(term16315, term16315.getClass(), "parent", null);
        setField(term16314, term16314.getClass(), "first", term16315);
        setField(term16314, term16314.getClass(), "last", null);
        setField(term16314, term16314.getClass(), "propListHead", null);
        setIntField(term16314, term16314.getClass(), "sourcePosition", 0);
        setField(term16314, term16314.getClass(), "jsType", null);
        setField(term16314, term16314.getClass(), "parent", null);
        term16285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16285, term16285.getClass(), "type", 56);
        setField(term16285, term16285.getClass(), "next", null);
        setIntField(term16287, term16287.getClass(), "type", 56);
        setField(term16287, term16287.getClass(), "next", null);
        setField(term16287, term16287.getClass(), "first", null);
        setField(term16287, term16287.getClass(), "last", null);
        setField(term16287, term16287.getClass(), "propListHead", null);
        setIntField(term16287, term16287.getClass(), "sourcePosition", 0);
        setField(term16287, term16287.getClass(), "jsType", null);
        setField(term16287, term16287.getClass(), "parent", null);
        setField(term16285, term16285.getClass(), "first", term16287);
        setField(term16285, term16285.getClass(), "last", null);
        setField(term16285, term16285.getClass(), "propListHead", null);
        setIntField(term16285, term16285.getClass(), "sourcePosition", 0);
        setField(term16285, term16285.getClass(), "jsType", null);
        setField(term16285, term16285.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15836;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term15676, args);
        assertTrue(recursiveEquals(term15676, term16312));
        assertTrue(recursiveEquals(term15836, term16314));
        assertTrue(recursiveEquals(retValue, term16285));
    }

};


