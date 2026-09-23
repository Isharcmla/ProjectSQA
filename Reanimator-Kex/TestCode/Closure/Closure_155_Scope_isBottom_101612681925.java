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

public class Scope_isBottom_101612681925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term1476;

    public Scope_isBottom_101612681925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term127 = new HashMap();
        term126 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term140 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term126, term126.getClass(), "vars", term127);
        setField(term140, term140.getClass(), "vars", null);
        setField(term140, term140.getClass(), "parent", null);
        setIntField(term140, term140.getClass(), "depth", 0);
        setField(term140, term140.getClass(), "rootNode", null);
        setField(term140, term140.getClass(), "thisType", null);
        setBooleanField(term140, term140.getClass(), "isBottom", false);
        setField(term126, term126.getClass(), "parent", term140);
        setIntField(term126, term126.getClass(), "depth", -112921587);
        setIntField(term144, term144.getClass(), "type", 0);
        setField(term144, term144.getClass(), "next", null);
        setField(term144, term144.getClass(), "first", null);
        setField(term144, term144.getClass(), "last", null);
        setField(term144, term144.getClass(), "propListHead", null);
        setIntField(term144, term144.getClass(), "sourcePosition", 0);
        setField(term144, term144.getClass(), "jsType", null);
        setField(term144, term144.getClass(), "parent", null);
        setField(term126, term126.getClass(), "rootNode", term144);
        setField(term126, term126.getClass(), "thisType", null);
        setBooleanField(term126, term126.getClass(), "isBottom", false);
        HashMap term1477 = new HashMap();
        term1476 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1478 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1476, term1476.getClass(), "vars", term1477);
        setField(term1478, term1478.getClass(), "vars", null);
        setField(term1478, term1478.getClass(), "parent", null);
        setIntField(term1478, term1478.getClass(), "depth", 0);
        setField(term1478, term1478.getClass(), "rootNode", null);
        setField(term1478, term1478.getClass(), "thisType", null);
        setBooleanField(term1478, term1478.getClass(), "isBottom", false);
        setField(term1476, term1476.getClass(), "parent", term1478);
        setIntField(term1476, term1476.getClass(), "depth", -112921587);
        setIntField(term1479, term1479.getClass(), "type", 0);
        setField(term1479, term1479.getClass(), "next", null);
        setField(term1479, term1479.getClass(), "first", null);
        setField(term1479, term1479.getClass(), "last", null);
        setField(term1479, term1479.getClass(), "propListHead", null);
        setIntField(term1479, term1479.getClass(), "sourcePosition", 0);
        setField(term1479, term1479.getClass(), "jsType", null);
        setField(term1479, term1479.getClass(), "parent", null);
        setField(term1476, term1476.getClass(), "rootNode", term1479);
        setField(term1476, term1476.getClass(), "thisType", null);
        setBooleanField(term1476, term1476.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBottom", argTypes, term126, args);
        assertTrue(recursiveEquals(term126, term1476));
    }

};


