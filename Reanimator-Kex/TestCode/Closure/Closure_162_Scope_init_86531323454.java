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
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Scope_init_86531323454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4795;
     Object term4887;
     Object term5382;
     Object term5386;
     Object term5387;

    public Scope_init_86531323454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4577 = new HashMap();
        Object term4529 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term4651 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term4721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4529, term4529.getClass(), "vars", term4577);
        setField(term4529, term4529.getClass(), "parent", term4651);
        setField(term4529, term4529.getClass(), "rootNode", term4721);
        term4795 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4795, term4795.getClass(), "rootNode", null);
        term4887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        LinkedHashMap term5383 = new LinkedHashMap();
        term5382 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term5384 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term5385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term5382, term5382.getClass(), "vars", term5383);
        setField(term5384, term5384.getClass(), "vars", null);
        setField(term5384, term5384.getClass(), "parent", null);
        setIntField(term5384, term5384.getClass(), "depth", 0);
        setField(term5384, term5384.getClass(), "rootNode", null);
        setField(term5384, term5384.getClass(), "thisType", null);
        setBooleanField(term5384, term5384.getClass(), "isBottom", false);
        setField(term5384, term5384.getClass(), "arguments", null);
        setField(term5382, term5382.getClass(), "parent", term5384);
        setIntField(term5382, term5382.getClass(), "depth", 1);
        setDoubleField(term5385, term5385.getClass(), "number", 0.0);
        setIntField(term5385, term5385.getClass(), "type", 0);
        setField(term5385, term5385.getClass(), "next", null);
        setField(term5385, term5385.getClass(), "first", null);
        setField(term5385, term5385.getClass(), "last", null);
        setField(term5385, term5385.getClass(), "propListHead", null);
        setIntField(term5385, term5385.getClass(), "sourcePosition", 0);
        setField(term5385, term5385.getClass(), "jsType", null);
        setField(term5385, term5385.getClass(), "parent", null);
        setField(term5382, term5382.getClass(), "rootNode", term5385);
        setField(term5382, term5382.getClass(), "thisType", null);
        setBooleanField(term5382, term5382.getClass(), "isBottom", false);
        setField(term5382, term5382.getClass(), "arguments", null);
        term5386 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term5386, term5386.getClass(), "vars", null);
        setField(term5386, term5386.getClass(), "parent", null);
        setIntField(term5386, term5386.getClass(), "depth", 0);
        setField(term5386, term5386.getClass(), "rootNode", null);
        setField(term5386, term5386.getClass(), "thisType", null);
        setBooleanField(term5386, term5386.getClass(), "isBottom", false);
        setField(term5386, term5386.getClass(), "arguments", null);
        term5387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term5387, term5387.getClass(), "number", 0.0);
        setIntField(term5387, term5387.getClass(), "type", 0);
        setField(term5387, term5387.getClass(), "next", null);
        setField(term5387, term5387.getClass(), "first", null);
        setField(term5387, term5387.getClass(), "last", null);
        setField(term5387, term5387.getClass(), "propListHead", null);
        setIntField(term5387, term5387.getClass(), "sourcePosition", 0);
        setField(term5387, term5387.getClass(), "jsType", null);
        setField(term5387, term5387.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term4795;
        args[1] = term4887;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5382));
        assertTrue(recursiveEquals(term4795, term5386));
        assertTrue(recursiveEquals(term4887, term5387));
    }

};


