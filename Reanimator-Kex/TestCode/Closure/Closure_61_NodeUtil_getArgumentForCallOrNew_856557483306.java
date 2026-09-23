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
import java.lang.Integer;

public class NodeUtil_getArgumentForCallOrNew_856557483306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3561;
     Object term3582;

    public NodeUtil_getArgumentForCallOrNew_856557483306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3561, term3561.getClass(), "type", -1674851914);
        setIntField(term3563, term3563.getClass(), "type", 1115327577);
        setIntField(term3565, term3565.getClass(), "type", 0);
        setField(term3565, term3565.getClass(), "next", null);
        setField(term3565, term3565.getClass(), "first", null);
        setField(term3565, term3565.getClass(), "last", null);
        setField(term3565, term3565.getClass(), "propListHead", null);
        setIntField(term3565, term3565.getClass(), "sourcePosition", 0);
        setField(term3565, term3565.getClass(), "jsType", null);
        setField(term3565, term3565.getClass(), "parent", null);
        setField(term3563, term3563.getClass(), "next", term3565);
        setIntField(term3568, term3568.getClass(), "type", 0);
        setField(term3568, term3568.getClass(), "next", null);
        setField(term3568, term3568.getClass(), "first", null);
        setField(term3568, term3568.getClass(), "last", null);
        setField(term3568, term3568.getClass(), "propListHead", null);
        setIntField(term3568, term3568.getClass(), "sourcePosition", 0);
        setField(term3568, term3568.getClass(), "jsType", null);
        setField(term3568, term3568.getClass(), "parent", null);
        setField(term3563, term3563.getClass(), "first", term3568);
        setIntField(term3571, term3571.getClass(), "type", 0);
        setField(term3571, term3571.getClass(), "next", null);
        setField(term3571, term3571.getClass(), "first", null);
        setField(term3571, term3571.getClass(), "last", null);
        setField(term3571, term3571.getClass(), "propListHead", null);
        setIntField(term3571, term3571.getClass(), "sourcePosition", 0);
        setField(term3571, term3571.getClass(), "jsType", null);
        setField(term3571, term3571.getClass(), "parent", null);
        setField(term3563, term3563.getClass(), "last", term3571);
        setField(term3563, term3563.getClass(), "propListHead", null);
        setIntField(term3563, term3563.getClass(), "sourcePosition", 0);
        setField(term3563, term3563.getClass(), "jsType", null);
        setField(term3563, term3563.getClass(), "parent", null);
        setField(term3561, term3561.getClass(), "next", term3563);
        setIntField(term3575, term3575.getClass(), "type", 0);
        setField(term3575, term3575.getClass(), "next", null);
        setField(term3575, term3575.getClass(), "first", null);
        setField(term3575, term3575.getClass(), "last", null);
        setField(term3575, term3575.getClass(), "propListHead", null);
        setIntField(term3575, term3575.getClass(), "sourcePosition", 0);
        setField(term3575, term3575.getClass(), "jsType", null);
        setField(term3575, term3575.getClass(), "parent", null);
        setField(term3561, term3561.getClass(), "first", term3575);
        setIntField(term3578, term3578.getClass(), "type", 0);
        setField(term3578, term3578.getClass(), "next", null);
        setField(term3578, term3578.getClass(), "first", null);
        setField(term3578, term3578.getClass(), "last", null);
        setField(term3578, term3578.getClass(), "propListHead", null);
        setIntField(term3578, term3578.getClass(), "sourcePosition", 0);
        setField(term3578, term3578.getClass(), "jsType", null);
        setField(term3578, term3578.getClass(), "parent", null);
        setField(term3561, term3561.getClass(), "last", term3578);
        setField(term3561, term3561.getClass(), "propListHead", null);
        setIntField(term3561, term3561.getClass(), "sourcePosition", 0);
        setField(term3561, term3561.getClass(), "jsType", null);
        setField(term3561, term3561.getClass(), "parent", null);
        term3582 = new Integer(-826239685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3561;
        args[1] = term3582;
        try {
            callMethod(klass, "getArgumentForCallOrNew", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


