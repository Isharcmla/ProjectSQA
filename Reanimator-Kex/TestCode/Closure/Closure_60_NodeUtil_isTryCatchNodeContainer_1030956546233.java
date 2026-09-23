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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isTryCatchNodeContainer_1030956546233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1624;

    public NodeUtil_isTryCatchNodeContainer_1030956546233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1624, term1624.getClass(), "type", -1631048635);
        setIntField(term1626, term1626.getClass(), "type", -146564963);
        setIntField(term1628, term1628.getClass(), "type", 0);
        setField(term1628, term1628.getClass(), "next", null);
        setField(term1628, term1628.getClass(), "first", null);
        setField(term1628, term1628.getClass(), "last", null);
        setField(term1628, term1628.getClass(), "propListHead", null);
        setIntField(term1628, term1628.getClass(), "sourcePosition", 0);
        setField(term1628, term1628.getClass(), "jsType", null);
        setField(term1628, term1628.getClass(), "parent", null);
        setField(term1626, term1626.getClass(), "next", term1628);
        setIntField(term1631, term1631.getClass(), "type", 0);
        setField(term1631, term1631.getClass(), "next", null);
        setField(term1631, term1631.getClass(), "first", null);
        setField(term1631, term1631.getClass(), "last", null);
        setField(term1631, term1631.getClass(), "propListHead", null);
        setIntField(term1631, term1631.getClass(), "sourcePosition", 0);
        setField(term1631, term1631.getClass(), "jsType", null);
        setField(term1631, term1631.getClass(), "parent", null);
        setField(term1626, term1626.getClass(), "first", term1631);
        setIntField(term1634, term1634.getClass(), "type", 0);
        setField(term1634, term1634.getClass(), "next", null);
        setField(term1634, term1634.getClass(), "first", null);
        setField(term1634, term1634.getClass(), "last", null);
        setField(term1634, term1634.getClass(), "propListHead", null);
        setIntField(term1634, term1634.getClass(), "sourcePosition", 0);
        setField(term1634, term1634.getClass(), "jsType", null);
        setField(term1634, term1634.getClass(), "parent", null);
        setField(term1626, term1626.getClass(), "last", term1634);
        setField(term1626, term1626.getClass(), "propListHead", null);
        setIntField(term1626, term1626.getClass(), "sourcePosition", 0);
        setField(term1626, term1626.getClass(), "jsType", null);
        setField(term1626, term1626.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "next", term1626);
        setIntField(term1638, term1638.getClass(), "type", 0);
        setField(term1638, term1638.getClass(), "next", null);
        setField(term1638, term1638.getClass(), "first", null);
        setField(term1638, term1638.getClass(), "last", null);
        setField(term1638, term1638.getClass(), "propListHead", null);
        setIntField(term1638, term1638.getClass(), "sourcePosition", 0);
        setField(term1638, term1638.getClass(), "jsType", null);
        setField(term1638, term1638.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "first", term1638);
        setIntField(term1641, term1641.getClass(), "type", 0);
        setField(term1641, term1641.getClass(), "next", null);
        setField(term1641, term1641.getClass(), "first", null);
        setField(term1641, term1641.getClass(), "last", null);
        setField(term1641, term1641.getClass(), "propListHead", null);
        setIntField(term1641, term1641.getClass(), "sourcePosition", 0);
        setField(term1641, term1641.getClass(), "jsType", null);
        setField(term1641, term1641.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "last", term1641);
        setField(term1624, term1624.getClass(), "propListHead", null);
        setIntField(term1624, term1624.getClass(), "sourcePosition", 0);
        setField(term1624, term1624.getClass(), "jsType", null);
        setField(term1624, term1624.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1624;
        try {
            callMethod(klass, "isTryCatchNodeContainer", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


