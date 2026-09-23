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

public class NodeUtil_containsCall_2124673690243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1855;
     Object term14205;

    public NodeUtil_containsCall_2124673690243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1855, term1855.getClass(), "type", 848428785);
        setIntField(term1857, term1857.getClass(), "type", -752378450);
        setIntField(term1859, term1859.getClass(), "type", 0);
        setField(term1859, term1859.getClass(), "next", null);
        setField(term1859, term1859.getClass(), "first", null);
        setField(term1859, term1859.getClass(), "last", null);
        setField(term1859, term1859.getClass(), "propListHead", null);
        setIntField(term1859, term1859.getClass(), "sourcePosition", 0);
        setField(term1859, term1859.getClass(), "jsType", null);
        setField(term1859, term1859.getClass(), "parent", null);
        setField(term1857, term1857.getClass(), "next", term1859);
        setIntField(term1862, term1862.getClass(), "type", 0);
        setField(term1862, term1862.getClass(), "next", null);
        setField(term1862, term1862.getClass(), "first", null);
        setField(term1862, term1862.getClass(), "last", null);
        setField(term1862, term1862.getClass(), "propListHead", null);
        setIntField(term1862, term1862.getClass(), "sourcePosition", 0);
        setField(term1862, term1862.getClass(), "jsType", null);
        setField(term1862, term1862.getClass(), "parent", null);
        setField(term1857, term1857.getClass(), "first", term1862);
        setIntField(term1865, term1865.getClass(), "type", 0);
        setField(term1865, term1865.getClass(), "next", null);
        setField(term1865, term1865.getClass(), "first", null);
        setField(term1865, term1865.getClass(), "last", null);
        setField(term1865, term1865.getClass(), "propListHead", null);
        setIntField(term1865, term1865.getClass(), "sourcePosition", 0);
        setField(term1865, term1865.getClass(), "jsType", null);
        setField(term1865, term1865.getClass(), "parent", null);
        setField(term1857, term1857.getClass(), "last", term1865);
        setField(term1857, term1857.getClass(), "propListHead", null);
        setIntField(term1857, term1857.getClass(), "sourcePosition", 0);
        setField(term1857, term1857.getClass(), "jsType", null);
        setField(term1857, term1857.getClass(), "parent", null);
        setField(term1855, term1855.getClass(), "next", term1857);
        setIntField(term1869, term1869.getClass(), "type", 0);
        setField(term1869, term1869.getClass(), "next", null);
        setField(term1869, term1869.getClass(), "first", null);
        setField(term1869, term1869.getClass(), "last", null);
        setField(term1869, term1869.getClass(), "propListHead", null);
        setIntField(term1869, term1869.getClass(), "sourcePosition", 0);
        setField(term1869, term1869.getClass(), "jsType", null);
        setField(term1869, term1869.getClass(), "parent", null);
        setField(term1855, term1855.getClass(), "first", term1869);
        setIntField(term1872, term1872.getClass(), "type", 0);
        setField(term1872, term1872.getClass(), "next", null);
        setField(term1872, term1872.getClass(), "first", null);
        setField(term1872, term1872.getClass(), "last", null);
        setField(term1872, term1872.getClass(), "propListHead", null);
        setIntField(term1872, term1872.getClass(), "sourcePosition", 0);
        setField(term1872, term1872.getClass(), "jsType", null);
        setField(term1872, term1872.getClass(), "parent", null);
        setField(term1855, term1855.getClass(), "last", term1872);
        setField(term1855, term1855.getClass(), "propListHead", null);
        setIntField(term1855, term1855.getClass(), "sourcePosition", 0);
        setField(term1855, term1855.getClass(), "jsType", null);
        setField(term1855, term1855.getClass(), "parent", null);
        term14205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14205, term14205.getClass(), "type", 848428785);
        setIntField(term14206, term14206.getClass(), "type", -752378450);
        setIntField(term14207, term14207.getClass(), "type", 0);
        setField(term14207, term14207.getClass(), "next", null);
        setField(term14207, term14207.getClass(), "first", null);
        setField(term14207, term14207.getClass(), "last", null);
        setField(term14207, term14207.getClass(), "propListHead", null);
        setIntField(term14207, term14207.getClass(), "sourcePosition", 0);
        setField(term14207, term14207.getClass(), "jsType", null);
        setField(term14207, term14207.getClass(), "parent", null);
        setField(term14206, term14206.getClass(), "next", term14207);
        setIntField(term14208, term14208.getClass(), "type", 0);
        setField(term14208, term14208.getClass(), "next", null);
        setField(term14208, term14208.getClass(), "first", null);
        setField(term14208, term14208.getClass(), "last", null);
        setField(term14208, term14208.getClass(), "propListHead", null);
        setIntField(term14208, term14208.getClass(), "sourcePosition", 0);
        setField(term14208, term14208.getClass(), "jsType", null);
        setField(term14208, term14208.getClass(), "parent", null);
        setField(term14206, term14206.getClass(), "first", term14208);
        setIntField(term14209, term14209.getClass(), "type", 0);
        setField(term14209, term14209.getClass(), "next", null);
        setField(term14209, term14209.getClass(), "first", null);
        setField(term14209, term14209.getClass(), "last", null);
        setField(term14209, term14209.getClass(), "propListHead", null);
        setIntField(term14209, term14209.getClass(), "sourcePosition", 0);
        setField(term14209, term14209.getClass(), "jsType", null);
        setField(term14209, term14209.getClass(), "parent", null);
        setField(term14206, term14206.getClass(), "last", term14209);
        setField(term14206, term14206.getClass(), "propListHead", null);
        setIntField(term14206, term14206.getClass(), "sourcePosition", 0);
        setField(term14206, term14206.getClass(), "jsType", null);
        setField(term14206, term14206.getClass(), "parent", null);
        setField(term14205, term14205.getClass(), "next", term14206);
        setIntField(term14210, term14210.getClass(), "type", 0);
        setField(term14210, term14210.getClass(), "next", null);
        setField(term14210, term14210.getClass(), "first", null);
        setField(term14210, term14210.getClass(), "last", null);
        setField(term14210, term14210.getClass(), "propListHead", null);
        setIntField(term14210, term14210.getClass(), "sourcePosition", 0);
        setField(term14210, term14210.getClass(), "jsType", null);
        setField(term14210, term14210.getClass(), "parent", null);
        setField(term14205, term14205.getClass(), "first", term14210);
        setIntField(term14211, term14211.getClass(), "type", 0);
        setField(term14211, term14211.getClass(), "next", null);
        setField(term14211, term14211.getClass(), "first", null);
        setField(term14211, term14211.getClass(), "last", null);
        setField(term14211, term14211.getClass(), "propListHead", null);
        setIntField(term14211, term14211.getClass(), "sourcePosition", 0);
        setField(term14211, term14211.getClass(), "jsType", null);
        setField(term14211, term14211.getClass(), "parent", null);
        setField(term14205, term14205.getClass(), "last", term14211);
        setField(term14205, term14205.getClass(), "propListHead", null);
        setIntField(term14205, term14205.getClass(), "sourcePosition", 0);
        setField(term14205, term14205.getClass(), "jsType", null);
        setField(term14205, term14205.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1855;
        callMethod(klass, "containsCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1855, term14205));
    }

};


