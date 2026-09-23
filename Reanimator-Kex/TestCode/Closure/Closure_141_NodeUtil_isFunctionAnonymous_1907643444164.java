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

public class NodeUtil_isFunctionAnonymous_1907643444164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1624;

    public NodeUtil_isFunctionAnonymous_1907643444164() {
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
        Object term1637 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1647 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1624, term1624.getClass(), "type", 1038029515);
        setIntField(term1626, term1626.getClass(), "type", 1431951992);
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
        setField(term1637, term1637.getClass(), "next", null);
        setIntField(term1637, term1637.getClass(), "type", 0);
        setIntField(term1637, term1637.getClass(), "intValue", 0);
        setField(term1637, term1637.getClass(), "objectValue", null);
        setField(term1626, term1626.getClass(), "propListHead", term1637);
        setIntField(term1626, term1626.getClass(), "sourcePosition", 401203924);
        setField(term1626, term1626.getClass(), "jsType", null);
        setField(term1626, term1626.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "next", term1626);
        setIntField(term1641, term1641.getClass(), "type", 0);
        setField(term1641, term1641.getClass(), "next", null);
        setField(term1641, term1641.getClass(), "first", null);
        setField(term1641, term1641.getClass(), "last", null);
        setField(term1641, term1641.getClass(), "propListHead", null);
        setIntField(term1641, term1641.getClass(), "sourcePosition", 0);
        setField(term1641, term1641.getClass(), "jsType", null);
        setField(term1641, term1641.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "first", term1641);
        setIntField(term1644, term1644.getClass(), "type", 0);
        setField(term1644, term1644.getClass(), "next", null);
        setField(term1644, term1644.getClass(), "first", null);
        setField(term1644, term1644.getClass(), "last", null);
        setField(term1644, term1644.getClass(), "propListHead", null);
        setIntField(term1644, term1644.getClass(), "sourcePosition", 0);
        setField(term1644, term1644.getClass(), "jsType", null);
        setField(term1644, term1644.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "last", term1644);
        setField(term1647, term1647.getClass(), "next", null);
        setIntField(term1647, term1647.getClass(), "type", 0);
        setIntField(term1647, term1647.getClass(), "intValue", 0);
        setField(term1647, term1647.getClass(), "objectValue", null);
        setField(term1624, term1624.getClass(), "propListHead", term1647);
        setIntField(term1624, term1624.getClass(), "sourcePosition", -1212399479);
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
            callMethod(klass, "isFunctionAnonymous", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


