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

public class NodeUtil_canBeSideEffected_1382575805187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646;
     Object term8728;

    public NodeUtil_canBeSideEffected_1382575805187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term646, term646.getClass(), "type", 2009020256);
        setIntField(term648, term648.getClass(), "type", 474518942);
        setIntField(term650, term650.getClass(), "type", 0);
        setField(term650, term650.getClass(), "next", null);
        setField(term650, term650.getClass(), "first", null);
        setField(term650, term650.getClass(), "last", null);
        setField(term650, term650.getClass(), "propListHead", null);
        setIntField(term650, term650.getClass(), "sourcePosition", 0);
        setField(term650, term650.getClass(), "jsType", null);
        setField(term650, term650.getClass(), "parent", null);
        setField(term648, term648.getClass(), "next", term650);
        setIntField(term653, term653.getClass(), "type", 0);
        setField(term653, term653.getClass(), "next", null);
        setField(term653, term653.getClass(), "first", null);
        setField(term653, term653.getClass(), "last", null);
        setField(term653, term653.getClass(), "propListHead", null);
        setIntField(term653, term653.getClass(), "sourcePosition", 0);
        setField(term653, term653.getClass(), "jsType", null);
        setField(term653, term653.getClass(), "parent", null);
        setField(term648, term648.getClass(), "first", term653);
        setIntField(term656, term656.getClass(), "type", 0);
        setField(term656, term656.getClass(), "next", null);
        setField(term656, term656.getClass(), "first", null);
        setField(term656, term656.getClass(), "last", null);
        setField(term656, term656.getClass(), "propListHead", null);
        setIntField(term656, term656.getClass(), "sourcePosition", 0);
        setField(term656, term656.getClass(), "jsType", null);
        setField(term656, term656.getClass(), "parent", null);
        setField(term648, term648.getClass(), "last", term656);
        setField(term648, term648.getClass(), "propListHead", null);
        setIntField(term648, term648.getClass(), "sourcePosition", 0);
        setField(term648, term648.getClass(), "jsType", null);
        setField(term648, term648.getClass(), "parent", null);
        setField(term646, term646.getClass(), "next", term648);
        setIntField(term660, term660.getClass(), "type", 0);
        setField(term660, term660.getClass(), "next", null);
        setField(term660, term660.getClass(), "first", null);
        setField(term660, term660.getClass(), "last", null);
        setField(term660, term660.getClass(), "propListHead", null);
        setIntField(term660, term660.getClass(), "sourcePosition", 0);
        setField(term660, term660.getClass(), "jsType", null);
        setField(term660, term660.getClass(), "parent", null);
        setField(term646, term646.getClass(), "first", term660);
        setIntField(term663, term663.getClass(), "type", 0);
        setField(term663, term663.getClass(), "next", null);
        setField(term663, term663.getClass(), "first", null);
        setField(term663, term663.getClass(), "last", null);
        setField(term663, term663.getClass(), "propListHead", null);
        setIntField(term663, term663.getClass(), "sourcePosition", 0);
        setField(term663, term663.getClass(), "jsType", null);
        setField(term663, term663.getClass(), "parent", null);
        setField(term646, term646.getClass(), "last", term663);
        setField(term646, term646.getClass(), "propListHead", null);
        setIntField(term646, term646.getClass(), "sourcePosition", 0);
        setField(term646, term646.getClass(), "jsType", null);
        setField(term646, term646.getClass(), "parent", null);
        term8728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8728, term8728.getClass(), "type", 2009020256);
        setIntField(term8729, term8729.getClass(), "type", 474518942);
        setIntField(term8730, term8730.getClass(), "type", 0);
        setField(term8730, term8730.getClass(), "next", null);
        setField(term8730, term8730.getClass(), "first", null);
        setField(term8730, term8730.getClass(), "last", null);
        setField(term8730, term8730.getClass(), "propListHead", null);
        setIntField(term8730, term8730.getClass(), "sourcePosition", 0);
        setField(term8730, term8730.getClass(), "jsType", null);
        setField(term8730, term8730.getClass(), "parent", null);
        setField(term8729, term8729.getClass(), "next", term8730);
        setIntField(term8731, term8731.getClass(), "type", 0);
        setField(term8731, term8731.getClass(), "next", null);
        setField(term8731, term8731.getClass(), "first", null);
        setField(term8731, term8731.getClass(), "last", null);
        setField(term8731, term8731.getClass(), "propListHead", null);
        setIntField(term8731, term8731.getClass(), "sourcePosition", 0);
        setField(term8731, term8731.getClass(), "jsType", null);
        setField(term8731, term8731.getClass(), "parent", null);
        setField(term8729, term8729.getClass(), "first", term8731);
        setIntField(term8732, term8732.getClass(), "type", 0);
        setField(term8732, term8732.getClass(), "next", null);
        setField(term8732, term8732.getClass(), "first", null);
        setField(term8732, term8732.getClass(), "last", null);
        setField(term8732, term8732.getClass(), "propListHead", null);
        setIntField(term8732, term8732.getClass(), "sourcePosition", 0);
        setField(term8732, term8732.getClass(), "jsType", null);
        setField(term8732, term8732.getClass(), "parent", null);
        setField(term8729, term8729.getClass(), "last", term8732);
        setField(term8729, term8729.getClass(), "propListHead", null);
        setIntField(term8729, term8729.getClass(), "sourcePosition", 0);
        setField(term8729, term8729.getClass(), "jsType", null);
        setField(term8729, term8729.getClass(), "parent", null);
        setField(term8728, term8728.getClass(), "next", term8729);
        setIntField(term8733, term8733.getClass(), "type", 0);
        setField(term8733, term8733.getClass(), "next", null);
        setField(term8733, term8733.getClass(), "first", null);
        setField(term8733, term8733.getClass(), "last", null);
        setField(term8733, term8733.getClass(), "propListHead", null);
        setIntField(term8733, term8733.getClass(), "sourcePosition", 0);
        setField(term8733, term8733.getClass(), "jsType", null);
        setField(term8733, term8733.getClass(), "parent", null);
        setField(term8728, term8728.getClass(), "first", term8733);
        setIntField(term8734, term8734.getClass(), "type", 0);
        setField(term8734, term8734.getClass(), "next", null);
        setField(term8734, term8734.getClass(), "first", null);
        setField(term8734, term8734.getClass(), "last", null);
        setField(term8734, term8734.getClass(), "propListHead", null);
        setIntField(term8734, term8734.getClass(), "sourcePosition", 0);
        setField(term8734, term8734.getClass(), "jsType", null);
        setField(term8734, term8734.getClass(), "parent", null);
        setField(term8728, term8728.getClass(), "last", term8734);
        setField(term8728, term8728.getClass(), "propListHead", null);
        setIntField(term8728, term8728.getClass(), "sourcePosition", 0);
        setField(term8728, term8728.getClass(), "jsType", null);
        setField(term8728, term8728.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term646;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term646, term8728));
    }

};


