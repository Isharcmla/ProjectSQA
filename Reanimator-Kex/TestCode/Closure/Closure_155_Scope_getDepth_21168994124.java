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

public class Scope_getDepth_21168994124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term1457;

    public Scope_getDepth_21168994124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term105 = new HashMap();
        term104 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term118 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term104, term104.getClass(), "vars", term105);
        setField(term118, term118.getClass(), "vars", null);
        setField(term118, term118.getClass(), "parent", null);
        setIntField(term118, term118.getClass(), "depth", 0);
        setField(term118, term118.getClass(), "rootNode", null);
        setField(term118, term118.getClass(), "thisType", null);
        setBooleanField(term118, term118.getClass(), "isBottom", false);
        setField(term104, term104.getClass(), "parent", term118);
        setIntField(term104, term104.getClass(), "depth", -184153539);
        setIntField(term122, term122.getClass(), "type", 0);
        setField(term122, term122.getClass(), "next", null);
        setField(term122, term122.getClass(), "first", null);
        setField(term122, term122.getClass(), "last", null);
        setField(term122, term122.getClass(), "propListHead", null);
        setIntField(term122, term122.getClass(), "sourcePosition", 0);
        setField(term122, term122.getClass(), "jsType", null);
        setField(term122, term122.getClass(), "parent", null);
        setField(term104, term104.getClass(), "rootNode", term122);
        setField(term104, term104.getClass(), "thisType", null);
        setBooleanField(term104, term104.getClass(), "isBottom", false);
        HashMap term1458 = new HashMap();
        term1457 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1459 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1457, term1457.getClass(), "vars", term1458);
        setField(term1459, term1459.getClass(), "vars", null);
        setField(term1459, term1459.getClass(), "parent", null);
        setIntField(term1459, term1459.getClass(), "depth", 0);
        setField(term1459, term1459.getClass(), "rootNode", null);
        setField(term1459, term1459.getClass(), "thisType", null);
        setBooleanField(term1459, term1459.getClass(), "isBottom", false);
        setField(term1457, term1457.getClass(), "parent", term1459);
        setIntField(term1457, term1457.getClass(), "depth", -184153539);
        setIntField(term1460, term1460.getClass(), "type", 0);
        setField(term1460, term1460.getClass(), "next", null);
        setField(term1460, term1460.getClass(), "first", null);
        setField(term1460, term1460.getClass(), "last", null);
        setField(term1460, term1460.getClass(), "propListHead", null);
        setIntField(term1460, term1460.getClass(), "sourcePosition", 0);
        setField(term1460, term1460.getClass(), "jsType", null);
        setField(term1460, term1460.getClass(), "parent", null);
        setField(term1457, term1457.getClass(), "rootNode", term1460);
        setField(term1457, term1457.getClass(), "thisType", null);
        setBooleanField(term1457, term1457.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDepth", argTypes, term104, args);
        assertTrue(recursiveEquals(term104, term1457));
        assertTrue(recursiveEquals(retValue, -184153539));
    }

};


