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

public class Scope_getGlobalScope_125349874633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174;
     Object term1692;
     Object term1662;

    public Scope_getGlobalScope_125349874633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term175 = new HashMap();
        term174 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term188 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term174, term174.getClass(), "vars", term175);
        setField(term188, term188.getClass(), "vars", null);
        setField(term188, term188.getClass(), "parent", null);
        setIntField(term188, term188.getClass(), "depth", 0);
        setField(term188, term188.getClass(), "rootNode", null);
        setField(term188, term188.getClass(), "thisType", null);
        setBooleanField(term188, term188.getClass(), "isBottom", false);
        setField(term188, term188.getClass(), "arguments", null);
        setField(term174, term174.getClass(), "parent", term188);
        setIntField(term174, term174.getClass(), "depth", 1240914516);
        setIntField(term192, term192.getClass(), "type", 0);
        setField(term192, term192.getClass(), "next", null);
        setField(term192, term192.getClass(), "first", null);
        setField(term192, term192.getClass(), "last", null);
        setField(term192, term192.getClass(), "propListHead", null);
        setIntField(term192, term192.getClass(), "sourcePosition", 0);
        setField(term192, term192.getClass(), "jsType", null);
        setField(term192, term192.getClass(), "parent", null);
        setField(term174, term174.getClass(), "rootNode", term192);
        setField(term174, term174.getClass(), "thisType", null);
        setBooleanField(term174, term174.getClass(), "isBottom", false);
        setField(term174, term174.getClass(), "arguments", null);
        HashMap term1693 = new HashMap();
        term1692 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1694 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1692, term1692.getClass(), "vars", term1693);
        setField(term1694, term1694.getClass(), "vars", null);
        setField(term1694, term1694.getClass(), "parent", null);
        setIntField(term1694, term1694.getClass(), "depth", 0);
        setField(term1694, term1694.getClass(), "rootNode", null);
        setField(term1694, term1694.getClass(), "thisType", null);
        setBooleanField(term1694, term1694.getClass(), "isBottom", false);
        setField(term1694, term1694.getClass(), "arguments", null);
        setField(term1692, term1692.getClass(), "parent", term1694);
        setIntField(term1692, term1692.getClass(), "depth", 1240914516);
        setIntField(term1695, term1695.getClass(), "type", 0);
        setField(term1695, term1695.getClass(), "next", null);
        setField(term1695, term1695.getClass(), "first", null);
        setField(term1695, term1695.getClass(), "last", null);
        setField(term1695, term1695.getClass(), "propListHead", null);
        setIntField(term1695, term1695.getClass(), "sourcePosition", 0);
        setField(term1695, term1695.getClass(), "jsType", null);
        setField(term1695, term1695.getClass(), "parent", null);
        setField(term1692, term1692.getClass(), "rootNode", term1695);
        setField(term1692, term1692.getClass(), "thisType", null);
        setBooleanField(term1692, term1692.getClass(), "isBottom", false);
        setField(term1692, term1692.getClass(), "arguments", null);
        HashMap term1663 = new HashMap();
        term1662 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1668 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1662, term1662.getClass(), "vars", term1663);
        setField(term1668, term1668.getClass(), "vars", null);
        setField(term1668, term1668.getClass(), "parent", null);
        setIntField(term1668, term1668.getClass(), "depth", 0);
        setField(term1668, term1668.getClass(), "rootNode", null);
        setField(term1668, term1668.getClass(), "thisType", null);
        setBooleanField(term1668, term1668.getClass(), "isBottom", false);
        setField(term1668, term1668.getClass(), "arguments", null);
        setField(term1662, term1662.getClass(), "parent", term1668);
        setIntField(term1662, term1662.getClass(), "depth", 1240914516);
        setIntField(term1672, term1672.getClass(), "type", 0);
        setField(term1672, term1672.getClass(), "next", null);
        setField(term1672, term1672.getClass(), "first", null);
        setField(term1672, term1672.getClass(), "last", null);
        setField(term1672, term1672.getClass(), "propListHead", null);
        setIntField(term1672, term1672.getClass(), "sourcePosition", 0);
        setField(term1672, term1672.getClass(), "jsType", null);
        setField(term1672, term1672.getClass(), "parent", null);
        setField(term1662, term1662.getClass(), "rootNode", term1672);
        setField(term1662, term1662.getClass(), "thisType", null);
        setBooleanField(term1662, term1662.getClass(), "isBottom", false);
        setField(term1662, term1662.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getGlobalScope", argTypes, term174, args);
        assertTrue(recursiveEquals(term174, term1692));
        assertTrue(recursiveEquals(retValue, term1662));
    }

};


