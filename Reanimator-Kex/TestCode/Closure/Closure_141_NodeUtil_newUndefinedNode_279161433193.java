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

public class NodeUtil_newUndefinedNode_279161433193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13802;

    public NodeUtil_newUndefinedNode_279161433193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13804 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term13802, term13802.getClass(), "type", 122);
        setField(term13802, term13802.getClass(), "next", null);
        setDoubleField(term13804, term13804.getClass(), "number", 0.0);
        setIntField(term13804, term13804.getClass(), "type", 39);
        setField(term13804, term13804.getClass(), "next", null);
        setField(term13804, term13804.getClass(), "first", null);
        setField(term13804, term13804.getClass(), "last", null);
        setField(term13804, term13804.getClass(), "propListHead", null);
        setIntField(term13804, term13804.getClass(), "sourcePosition", -1);
        setField(term13804, term13804.getClass(), "jsType", null);
        setField(term13804, term13804.getClass(), "parent", term13802);
        setField(term13802, term13802.getClass(), "first", term13804);
        setField(term13802, term13802.getClass(), "last", term13804);
        setField(term13802, term13802.getClass(), "propListHead", null);
        setIntField(term13802, term13802.getClass(), "sourcePosition", -1);
        setField(term13802, term13802.getClass(), "jsType", null);
        setField(term13802, term13802.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "newUndefinedNode", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term13802));
    }

};


