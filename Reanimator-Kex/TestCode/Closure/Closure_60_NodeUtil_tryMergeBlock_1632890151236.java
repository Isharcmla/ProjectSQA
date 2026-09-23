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

public class NodeUtil_tryMergeBlock_1632890151236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1708;

    public NodeUtil_tryMergeBlock_1632890151236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1708, term1708.getClass(), "type", 1595814906);
        setIntField(term1710, term1710.getClass(), "type", 1605456363);
        setIntField(term1712, term1712.getClass(), "type", 0);
        setField(term1712, term1712.getClass(), "next", null);
        setField(term1712, term1712.getClass(), "first", null);
        setField(term1712, term1712.getClass(), "last", null);
        setField(term1712, term1712.getClass(), "propListHead", null);
        setIntField(term1712, term1712.getClass(), "sourcePosition", 0);
        setField(term1712, term1712.getClass(), "jsType", null);
        setField(term1712, term1712.getClass(), "parent", null);
        setField(term1710, term1710.getClass(), "next", term1712);
        setIntField(term1715, term1715.getClass(), "type", 0);
        setField(term1715, term1715.getClass(), "next", null);
        setField(term1715, term1715.getClass(), "first", null);
        setField(term1715, term1715.getClass(), "last", null);
        setField(term1715, term1715.getClass(), "propListHead", null);
        setIntField(term1715, term1715.getClass(), "sourcePosition", 0);
        setField(term1715, term1715.getClass(), "jsType", null);
        setField(term1715, term1715.getClass(), "parent", null);
        setField(term1710, term1710.getClass(), "first", term1715);
        setIntField(term1718, term1718.getClass(), "type", 0);
        setField(term1718, term1718.getClass(), "next", null);
        setField(term1718, term1718.getClass(), "first", null);
        setField(term1718, term1718.getClass(), "last", null);
        setField(term1718, term1718.getClass(), "propListHead", null);
        setIntField(term1718, term1718.getClass(), "sourcePosition", 0);
        setField(term1718, term1718.getClass(), "jsType", null);
        setField(term1718, term1718.getClass(), "parent", null);
        setField(term1710, term1710.getClass(), "last", term1718);
        setField(term1710, term1710.getClass(), "propListHead", null);
        setIntField(term1710, term1710.getClass(), "sourcePosition", 0);
        setField(term1710, term1710.getClass(), "jsType", null);
        setField(term1710, term1710.getClass(), "parent", null);
        setField(term1708, term1708.getClass(), "next", term1710);
        setIntField(term1722, term1722.getClass(), "type", 0);
        setField(term1722, term1722.getClass(), "next", null);
        setField(term1722, term1722.getClass(), "first", null);
        setField(term1722, term1722.getClass(), "last", null);
        setField(term1722, term1722.getClass(), "propListHead", null);
        setIntField(term1722, term1722.getClass(), "sourcePosition", 0);
        setField(term1722, term1722.getClass(), "jsType", null);
        setField(term1722, term1722.getClass(), "parent", null);
        setField(term1708, term1708.getClass(), "first", term1722);
        setIntField(term1725, term1725.getClass(), "type", 0);
        setField(term1725, term1725.getClass(), "next", null);
        setField(term1725, term1725.getClass(), "first", null);
        setField(term1725, term1725.getClass(), "last", null);
        setField(term1725, term1725.getClass(), "propListHead", null);
        setIntField(term1725, term1725.getClass(), "sourcePosition", 0);
        setField(term1725, term1725.getClass(), "jsType", null);
        setField(term1725, term1725.getClass(), "parent", null);
        setField(term1708, term1708.getClass(), "last", term1725);
        setField(term1708, term1708.getClass(), "propListHead", null);
        setIntField(term1708, term1708.getClass(), "sourcePosition", 0);
        setField(term1708, term1708.getClass(), "jsType", null);
        setField(term1708, term1708.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1708;
        try {
            callMethod(klass, "tryMergeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


