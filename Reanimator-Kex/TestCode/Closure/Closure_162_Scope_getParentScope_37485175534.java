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

public class Scope_getParentScope_37485175534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;
     Object term1710;
     Object term1696;

    public Scope_getParentScope_37485175534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term197 = new HashMap();
        term196 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term210 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term196, term196.getClass(), "vars", term197);
        setField(term210, term210.getClass(), "vars", null);
        setField(term210, term210.getClass(), "parent", null);
        setIntField(term210, term210.getClass(), "depth", 0);
        setField(term210, term210.getClass(), "rootNode", null);
        setField(term210, term210.getClass(), "thisType", null);
        setBooleanField(term210, term210.getClass(), "isBottom", false);
        setField(term210, term210.getClass(), "arguments", null);
        setField(term196, term196.getClass(), "parent", term210);
        setIntField(term196, term196.getClass(), "depth", -505439934);
        setIntField(term214, term214.getClass(), "type", 0);
        setField(term214, term214.getClass(), "next", null);
        setField(term214, term214.getClass(), "first", null);
        setField(term214, term214.getClass(), "last", null);
        setField(term214, term214.getClass(), "propListHead", null);
        setIntField(term214, term214.getClass(), "sourcePosition", 0);
        setField(term214, term214.getClass(), "jsType", null);
        setField(term214, term214.getClass(), "parent", null);
        setField(term196, term196.getClass(), "rootNode", term214);
        setField(term196, term196.getClass(), "thisType", null);
        setBooleanField(term196, term196.getClass(), "isBottom", false);
        setField(term196, term196.getClass(), "arguments", null);
        HashMap term1711 = new HashMap();
        term1710 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1712 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1710, term1710.getClass(), "vars", term1711);
        setField(term1712, term1712.getClass(), "vars", null);
        setField(term1712, term1712.getClass(), "parent", null);
        setIntField(term1712, term1712.getClass(), "depth", 0);
        setField(term1712, term1712.getClass(), "rootNode", null);
        setField(term1712, term1712.getClass(), "thisType", null);
        setBooleanField(term1712, term1712.getClass(), "isBottom", false);
        setField(term1712, term1712.getClass(), "arguments", null);
        setField(term1710, term1710.getClass(), "parent", term1712);
        setIntField(term1710, term1710.getClass(), "depth", -505439934);
        setIntField(term1713, term1713.getClass(), "type", 0);
        setField(term1713, term1713.getClass(), "next", null);
        setField(term1713, term1713.getClass(), "first", null);
        setField(term1713, term1713.getClass(), "last", null);
        setField(term1713, term1713.getClass(), "propListHead", null);
        setIntField(term1713, term1713.getClass(), "sourcePosition", 0);
        setField(term1713, term1713.getClass(), "jsType", null);
        setField(term1713, term1713.getClass(), "parent", null);
        setField(term1710, term1710.getClass(), "rootNode", term1713);
        setField(term1710, term1710.getClass(), "thisType", null);
        setBooleanField(term1710, term1710.getClass(), "isBottom", false);
        setField(term1710, term1710.getClass(), "arguments", null);
        term1696 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term1696, term1696.getClass(), "vars", null);
        setField(term1696, term1696.getClass(), "parent", null);
        setIntField(term1696, term1696.getClass(), "depth", 0);
        setField(term1696, term1696.getClass(), "rootNode", null);
        setField(term1696, term1696.getClass(), "thisType", null);
        setBooleanField(term1696, term1696.getClass(), "isBottom", false);
        setField(term1696, term1696.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParentScope", argTypes, term196, args);
        assertTrue(recursiveEquals(term196, term1710));
        assertTrue(recursiveEquals(retValue, term1696));
    }

};


