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

public class NodeUtil_isFunctionAnonymous_1907643444162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1597;

    public NodeUtil_isFunctionAnonymous_1907643444162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1610 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1620 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1597, term1597.getClass(), "type", -271094506);
        setIntField(term1599, term1599.getClass(), "type", -763576148);
        setIntField(term1601, term1601.getClass(), "type", 0);
        setField(term1601, term1601.getClass(), "next", null);
        setField(term1601, term1601.getClass(), "first", null);
        setField(term1601, term1601.getClass(), "last", null);
        setField(term1601, term1601.getClass(), "propListHead", null);
        setIntField(term1601, term1601.getClass(), "sourcePosition", 0);
        setField(term1601, term1601.getClass(), "jsType", null);
        setField(term1601, term1601.getClass(), "parent", null);
        setField(term1599, term1599.getClass(), "next", term1601);
        setIntField(term1604, term1604.getClass(), "type", 0);
        setField(term1604, term1604.getClass(), "next", null);
        setField(term1604, term1604.getClass(), "first", null);
        setField(term1604, term1604.getClass(), "last", null);
        setField(term1604, term1604.getClass(), "propListHead", null);
        setIntField(term1604, term1604.getClass(), "sourcePosition", 0);
        setField(term1604, term1604.getClass(), "jsType", null);
        setField(term1604, term1604.getClass(), "parent", null);
        setField(term1599, term1599.getClass(), "first", term1604);
        setIntField(term1607, term1607.getClass(), "type", 0);
        setField(term1607, term1607.getClass(), "next", null);
        setField(term1607, term1607.getClass(), "first", null);
        setField(term1607, term1607.getClass(), "last", null);
        setField(term1607, term1607.getClass(), "propListHead", null);
        setIntField(term1607, term1607.getClass(), "sourcePosition", 0);
        setField(term1607, term1607.getClass(), "jsType", null);
        setField(term1607, term1607.getClass(), "parent", null);
        setField(term1599, term1599.getClass(), "last", term1607);
        setField(term1610, term1610.getClass(), "next", null);
        setIntField(term1610, term1610.getClass(), "type", 0);
        setIntField(term1610, term1610.getClass(), "intValue", 0);
        setField(term1610, term1610.getClass(), "objectValue", null);
        setField(term1599, term1599.getClass(), "propListHead", term1610);
        setIntField(term1599, term1599.getClass(), "sourcePosition", 452088587);
        setField(term1599, term1599.getClass(), "jsType", null);
        setField(term1599, term1599.getClass(), "parent", null);
        setField(term1597, term1597.getClass(), "next", term1599);
        setIntField(term1614, term1614.getClass(), "type", 0);
        setField(term1614, term1614.getClass(), "next", null);
        setField(term1614, term1614.getClass(), "first", null);
        setField(term1614, term1614.getClass(), "last", null);
        setField(term1614, term1614.getClass(), "propListHead", null);
        setIntField(term1614, term1614.getClass(), "sourcePosition", 0);
        setField(term1614, term1614.getClass(), "jsType", null);
        setField(term1614, term1614.getClass(), "parent", null);
        setField(term1597, term1597.getClass(), "first", term1614);
        setIntField(term1617, term1617.getClass(), "type", 0);
        setField(term1617, term1617.getClass(), "next", null);
        setField(term1617, term1617.getClass(), "first", null);
        setField(term1617, term1617.getClass(), "last", null);
        setField(term1617, term1617.getClass(), "propListHead", null);
        setIntField(term1617, term1617.getClass(), "sourcePosition", 0);
        setField(term1617, term1617.getClass(), "jsType", null);
        setField(term1617, term1617.getClass(), "parent", null);
        setField(term1597, term1597.getClass(), "last", term1617);
        setField(term1620, term1620.getClass(), "next", null);
        setIntField(term1620, term1620.getClass(), "type", 0);
        setIntField(term1620, term1620.getClass(), "intValue", 0);
        setField(term1620, term1620.getClass(), "objectValue", null);
        setField(term1597, term1597.getClass(), "propListHead", term1620);
        setIntField(term1597, term1597.getClass(), "sourcePosition", -1630069454);
        setField(term1597, term1597.getClass(), "jsType", null);
        setField(term1597, term1597.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1597;
        try {
            callMethod(klass, "isFunctionAnonymous", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


