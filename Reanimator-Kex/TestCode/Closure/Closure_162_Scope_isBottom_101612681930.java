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
import java.util.HashMap;
import java.lang.Object;

public class Scope_isBottom_101612681930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108;
     Object term1619;

    public Scope_isBottom_101612681930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term109 = new HashMap();
        term108 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term122 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term108, term108.getClass(), "vars", term109);
        setField(term122, term122.getClass(), "vars", null);
        setField(term122, term122.getClass(), "parent", null);
        setIntField(term122, term122.getClass(), "depth", 0);
        setField(term122, term122.getClass(), "rootNode", null);
        setField(term122, term122.getClass(), "thisType", null);
        setBooleanField(term122, term122.getClass(), "isBottom", false);
        setField(term122, term122.getClass(), "arguments", null);
        setField(term108, term108.getClass(), "parent", term122);
        setIntField(term108, term108.getClass(), "depth", 458147407);
        setIntField(term126, term126.getClass(), "type", 0);
        setField(term126, term126.getClass(), "next", null);
        setField(term126, term126.getClass(), "first", null);
        setField(term126, term126.getClass(), "last", null);
        setField(term126, term126.getClass(), "propListHead", null);
        setIntField(term126, term126.getClass(), "sourcePosition", 0);
        setField(term126, term126.getClass(), "jsType", null);
        setField(term126, term126.getClass(), "parent", null);
        setField(term108, term108.getClass(), "rootNode", term126);
        setField(term108, term108.getClass(), "thisType", null);
        setBooleanField(term108, term108.getClass(), "isBottom", false);
        setField(term108, term108.getClass(), "arguments", null);
        HashMap term1620 = new HashMap();
        term1619 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1621 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1619, term1619.getClass(), "vars", term1620);
        setField(term1621, term1621.getClass(), "vars", null);
        setField(term1621, term1621.getClass(), "parent", null);
        setIntField(term1621, term1621.getClass(), "depth", 0);
        setField(term1621, term1621.getClass(), "rootNode", null);
        setField(term1621, term1621.getClass(), "thisType", null);
        setBooleanField(term1621, term1621.getClass(), "isBottom", false);
        setField(term1621, term1621.getClass(), "arguments", null);
        setField(term1619, term1619.getClass(), "parent", term1621);
        setIntField(term1619, term1619.getClass(), "depth", 458147407);
        setIntField(term1622, term1622.getClass(), "type", 0);
        setField(term1622, term1622.getClass(), "next", null);
        setField(term1622, term1622.getClass(), "first", null);
        setField(term1622, term1622.getClass(), "last", null);
        setField(term1622, term1622.getClass(), "propListHead", null);
        setIntField(term1622, term1622.getClass(), "sourcePosition", 0);
        setField(term1622, term1622.getClass(), "jsType", null);
        setField(term1622, term1622.getClass(), "parent", null);
        setField(term1619, term1619.getClass(), "rootNode", term1622);
        setField(term1619, term1619.getClass(), "thisType", null);
        setBooleanField(term1619, term1619.getClass(), "isBottom", false);
        setField(term1619, term1619.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBottom", argTypes, term108, args);
        assertTrue(recursiveEquals(term108, term1619));
    }

};


