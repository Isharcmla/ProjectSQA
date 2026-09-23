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

public class NodeUtil_maybeAddFinally_1429693753235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1687;

    public NodeUtil_maybeAddFinally_1429693753235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1687, term1687.getClass(), "type", -626779272);
        setIntField(term1689, term1689.getClass(), "type", -1288536479);
        setIntField(term1691, term1691.getClass(), "type", 0);
        setField(term1691, term1691.getClass(), "next", null);
        setField(term1691, term1691.getClass(), "first", null);
        setField(term1691, term1691.getClass(), "last", null);
        setField(term1691, term1691.getClass(), "propListHead", null);
        setIntField(term1691, term1691.getClass(), "sourcePosition", 0);
        setField(term1691, term1691.getClass(), "jsType", null);
        setField(term1691, term1691.getClass(), "parent", null);
        setField(term1689, term1689.getClass(), "next", term1691);
        setIntField(term1694, term1694.getClass(), "type", 0);
        setField(term1694, term1694.getClass(), "next", null);
        setField(term1694, term1694.getClass(), "first", null);
        setField(term1694, term1694.getClass(), "last", null);
        setField(term1694, term1694.getClass(), "propListHead", null);
        setIntField(term1694, term1694.getClass(), "sourcePosition", 0);
        setField(term1694, term1694.getClass(), "jsType", null);
        setField(term1694, term1694.getClass(), "parent", null);
        setField(term1689, term1689.getClass(), "first", term1694);
        setIntField(term1697, term1697.getClass(), "type", 0);
        setField(term1697, term1697.getClass(), "next", null);
        setField(term1697, term1697.getClass(), "first", null);
        setField(term1697, term1697.getClass(), "last", null);
        setField(term1697, term1697.getClass(), "propListHead", null);
        setIntField(term1697, term1697.getClass(), "sourcePosition", 0);
        setField(term1697, term1697.getClass(), "jsType", null);
        setField(term1697, term1697.getClass(), "parent", null);
        setField(term1689, term1689.getClass(), "last", term1697);
        setField(term1689, term1689.getClass(), "propListHead", null);
        setIntField(term1689, term1689.getClass(), "sourcePosition", 0);
        setField(term1689, term1689.getClass(), "jsType", null);
        setField(term1689, term1689.getClass(), "parent", null);
        setField(term1687, term1687.getClass(), "next", term1689);
        setIntField(term1701, term1701.getClass(), "type", 0);
        setField(term1701, term1701.getClass(), "next", null);
        setField(term1701, term1701.getClass(), "first", null);
        setField(term1701, term1701.getClass(), "last", null);
        setField(term1701, term1701.getClass(), "propListHead", null);
        setIntField(term1701, term1701.getClass(), "sourcePosition", 0);
        setField(term1701, term1701.getClass(), "jsType", null);
        setField(term1701, term1701.getClass(), "parent", null);
        setField(term1687, term1687.getClass(), "first", term1701);
        setIntField(term1704, term1704.getClass(), "type", 0);
        setField(term1704, term1704.getClass(), "next", null);
        setField(term1704, term1704.getClass(), "first", null);
        setField(term1704, term1704.getClass(), "last", null);
        setField(term1704, term1704.getClass(), "propListHead", null);
        setIntField(term1704, term1704.getClass(), "sourcePosition", 0);
        setField(term1704, term1704.getClass(), "jsType", null);
        setField(term1704, term1704.getClass(), "parent", null);
        setField(term1687, term1687.getClass(), "last", term1704);
        setField(term1687, term1687.getClass(), "propListHead", null);
        setIntField(term1687, term1687.getClass(), "sourcePosition", 0);
        setField(term1687, term1687.getClass(), "jsType", null);
        setField(term1687, term1687.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1687;
        try {
            callMethod(klass, "maybeAddFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


