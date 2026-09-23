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

public class Scope_getGlobalScope_125349874628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;
     Object term1549;
     Object term1519;

    public Scope_getGlobalScope_125349874628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term193 = new HashMap();
        term192 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term206 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term192, term192.getClass(), "vars", term193);
        setField(term206, term206.getClass(), "vars", null);
        setField(term206, term206.getClass(), "parent", null);
        setIntField(term206, term206.getClass(), "depth", 0);
        setField(term206, term206.getClass(), "rootNode", null);
        setField(term206, term206.getClass(), "thisType", null);
        setBooleanField(term206, term206.getClass(), "isBottom", false);
        setField(term192, term192.getClass(), "parent", term206);
        setIntField(term192, term192.getClass(), "depth", -1888585309);
        setIntField(term210, term210.getClass(), "type", 0);
        setField(term210, term210.getClass(), "next", null);
        setField(term210, term210.getClass(), "first", null);
        setField(term210, term210.getClass(), "last", null);
        setField(term210, term210.getClass(), "propListHead", null);
        setIntField(term210, term210.getClass(), "sourcePosition", 0);
        setField(term210, term210.getClass(), "jsType", null);
        setField(term210, term210.getClass(), "parent", null);
        setField(term192, term192.getClass(), "rootNode", term210);
        setField(term192, term192.getClass(), "thisType", null);
        setBooleanField(term192, term192.getClass(), "isBottom", false);
        HashMap term1550 = new HashMap();
        term1549 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1551 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1549, term1549.getClass(), "vars", term1550);
        setField(term1551, term1551.getClass(), "vars", null);
        setField(term1551, term1551.getClass(), "parent", null);
        setIntField(term1551, term1551.getClass(), "depth", 0);
        setField(term1551, term1551.getClass(), "rootNode", null);
        setField(term1551, term1551.getClass(), "thisType", null);
        setBooleanField(term1551, term1551.getClass(), "isBottom", false);
        setField(term1549, term1549.getClass(), "parent", term1551);
        setIntField(term1549, term1549.getClass(), "depth", -1888585309);
        setIntField(term1552, term1552.getClass(), "type", 0);
        setField(term1552, term1552.getClass(), "next", null);
        setField(term1552, term1552.getClass(), "first", null);
        setField(term1552, term1552.getClass(), "last", null);
        setField(term1552, term1552.getClass(), "propListHead", null);
        setIntField(term1552, term1552.getClass(), "sourcePosition", 0);
        setField(term1552, term1552.getClass(), "jsType", null);
        setField(term1552, term1552.getClass(), "parent", null);
        setField(term1549, term1549.getClass(), "rootNode", term1552);
        setField(term1549, term1549.getClass(), "thisType", null);
        setBooleanField(term1549, term1549.getClass(), "isBottom", false);
        HashMap term1520 = new HashMap();
        term1519 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1525 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1519, term1519.getClass(), "vars", term1520);
        setField(term1525, term1525.getClass(), "vars", null);
        setField(term1525, term1525.getClass(), "parent", null);
        setIntField(term1525, term1525.getClass(), "depth", 0);
        setField(term1525, term1525.getClass(), "rootNode", null);
        setField(term1525, term1525.getClass(), "thisType", null);
        setBooleanField(term1525, term1525.getClass(), "isBottom", false);
        setField(term1519, term1519.getClass(), "parent", term1525);
        setIntField(term1519, term1519.getClass(), "depth", -1888585309);
        setIntField(term1529, term1529.getClass(), "type", 0);
        setField(term1529, term1529.getClass(), "next", null);
        setField(term1529, term1529.getClass(), "first", null);
        setField(term1529, term1529.getClass(), "last", null);
        setField(term1529, term1529.getClass(), "propListHead", null);
        setIntField(term1529, term1529.getClass(), "sourcePosition", 0);
        setField(term1529, term1529.getClass(), "jsType", null);
        setField(term1529, term1529.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "rootNode", term1529);
        setField(term1519, term1519.getClass(), "thisType", null);
        setBooleanField(term1519, term1519.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getGlobalScope", argTypes, term192, args);
        assertTrue(recursiveEquals(term192, term1549));
        assertTrue(recursiveEquals(retValue, term1519));
    }

};


