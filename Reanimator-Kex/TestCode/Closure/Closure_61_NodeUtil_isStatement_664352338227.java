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
import java.lang.Object;

public class NodeUtil_isStatement_664352338227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1477;

    public NodeUtil_isStatement_664352338227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1477, term1477.getClass(), "type", -1777140369);
        setIntField(term1479, term1479.getClass(), "type", 1010721666);
        setIntField(term1481, term1481.getClass(), "type", 0);
        setField(term1481, term1481.getClass(), "next", null);
        setField(term1481, term1481.getClass(), "first", null);
        setField(term1481, term1481.getClass(), "last", null);
        setField(term1481, term1481.getClass(), "propListHead", null);
        setIntField(term1481, term1481.getClass(), "sourcePosition", 0);
        setField(term1481, term1481.getClass(), "jsType", null);
        setField(term1481, term1481.getClass(), "parent", null);
        setField(term1479, term1479.getClass(), "next", term1481);
        setIntField(term1484, term1484.getClass(), "type", 0);
        setField(term1484, term1484.getClass(), "next", null);
        setField(term1484, term1484.getClass(), "first", null);
        setField(term1484, term1484.getClass(), "last", null);
        setField(term1484, term1484.getClass(), "propListHead", null);
        setIntField(term1484, term1484.getClass(), "sourcePosition", 0);
        setField(term1484, term1484.getClass(), "jsType", null);
        setField(term1484, term1484.getClass(), "parent", null);
        setField(term1479, term1479.getClass(), "first", term1484);
        setIntField(term1487, term1487.getClass(), "type", 0);
        setField(term1487, term1487.getClass(), "next", null);
        setField(term1487, term1487.getClass(), "first", null);
        setField(term1487, term1487.getClass(), "last", null);
        setField(term1487, term1487.getClass(), "propListHead", null);
        setIntField(term1487, term1487.getClass(), "sourcePosition", 0);
        setField(term1487, term1487.getClass(), "jsType", null);
        setField(term1487, term1487.getClass(), "parent", null);
        setField(term1479, term1479.getClass(), "last", term1487);
        setField(term1479, term1479.getClass(), "propListHead", null);
        setIntField(term1479, term1479.getClass(), "sourcePosition", 0);
        setField(term1479, term1479.getClass(), "jsType", null);
        setField(term1479, term1479.getClass(), "parent", null);
        setField(term1477, term1477.getClass(), "next", term1479);
        setIntField(term1491, term1491.getClass(), "type", 0);
        setField(term1491, term1491.getClass(), "next", null);
        setField(term1491, term1491.getClass(), "first", null);
        setField(term1491, term1491.getClass(), "last", null);
        setField(term1491, term1491.getClass(), "propListHead", null);
        setIntField(term1491, term1491.getClass(), "sourcePosition", 0);
        setField(term1491, term1491.getClass(), "jsType", null);
        setField(term1491, term1491.getClass(), "parent", null);
        setField(term1477, term1477.getClass(), "first", term1491);
        setIntField(term1494, term1494.getClass(), "type", 0);
        setField(term1494, term1494.getClass(), "next", null);
        setField(term1494, term1494.getClass(), "first", null);
        setField(term1494, term1494.getClass(), "last", null);
        setField(term1494, term1494.getClass(), "propListHead", null);
        setIntField(term1494, term1494.getClass(), "sourcePosition", 0);
        setField(term1494, term1494.getClass(), "jsType", null);
        setField(term1494, term1494.getClass(), "parent", null);
        setField(term1477, term1477.getClass(), "last", term1494);
        setField(term1477, term1477.getClass(), "propListHead", null);
        setIntField(term1477, term1477.getClass(), "sourcePosition", 0);
        setField(term1477, term1477.getClass(), "jsType", null);
        setField(term1477, term1477.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1477;
        try {
            callMethod(klass, "isStatement", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


