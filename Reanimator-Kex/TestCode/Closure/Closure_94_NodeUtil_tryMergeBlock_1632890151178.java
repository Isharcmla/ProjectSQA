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

public class NodeUtil_tryMergeBlock_1632890151178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1626;

    public NodeUtil_tryMergeBlock_1632890151178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1639 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1649 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1626, term1626.getClass(), "type", 1038029515);
        setIntField(term1628, term1628.getClass(), "type", 1431951992);
        setIntField(term1630, term1630.getClass(), "type", 0);
        setField(term1630, term1630.getClass(), "next", null);
        setField(term1630, term1630.getClass(), "first", null);
        setField(term1630, term1630.getClass(), "last", null);
        setField(term1630, term1630.getClass(), "propListHead", null);
        setIntField(term1630, term1630.getClass(), "sourcePosition", 0);
        setField(term1630, term1630.getClass(), "jsType", null);
        setField(term1630, term1630.getClass(), "parent", null);
        setField(term1628, term1628.getClass(), "next", term1630);
        setIntField(term1633, term1633.getClass(), "type", 0);
        setField(term1633, term1633.getClass(), "next", null);
        setField(term1633, term1633.getClass(), "first", null);
        setField(term1633, term1633.getClass(), "last", null);
        setField(term1633, term1633.getClass(), "propListHead", null);
        setIntField(term1633, term1633.getClass(), "sourcePosition", 0);
        setField(term1633, term1633.getClass(), "jsType", null);
        setField(term1633, term1633.getClass(), "parent", null);
        setField(term1628, term1628.getClass(), "first", term1633);
        setIntField(term1636, term1636.getClass(), "type", 0);
        setField(term1636, term1636.getClass(), "next", null);
        setField(term1636, term1636.getClass(), "first", null);
        setField(term1636, term1636.getClass(), "last", null);
        setField(term1636, term1636.getClass(), "propListHead", null);
        setIntField(term1636, term1636.getClass(), "sourcePosition", 0);
        setField(term1636, term1636.getClass(), "jsType", null);
        setField(term1636, term1636.getClass(), "parent", null);
        setField(term1628, term1628.getClass(), "last", term1636);
        setField(term1639, term1639.getClass(), "next", null);
        setIntField(term1639, term1639.getClass(), "type", 0);
        setIntField(term1639, term1639.getClass(), "intValue", 0);
        setField(term1639, term1639.getClass(), "objectValue", null);
        setField(term1628, term1628.getClass(), "propListHead", term1639);
        setIntField(term1628, term1628.getClass(), "sourcePosition", 401203924);
        setField(term1628, term1628.getClass(), "jsType", null);
        setField(term1628, term1628.getClass(), "parent", null);
        setField(term1626, term1626.getClass(), "next", term1628);
        setIntField(term1643, term1643.getClass(), "type", 0);
        setField(term1643, term1643.getClass(), "next", null);
        setField(term1643, term1643.getClass(), "first", null);
        setField(term1643, term1643.getClass(), "last", null);
        setField(term1643, term1643.getClass(), "propListHead", null);
        setIntField(term1643, term1643.getClass(), "sourcePosition", 0);
        setField(term1643, term1643.getClass(), "jsType", null);
        setField(term1643, term1643.getClass(), "parent", null);
        setField(term1626, term1626.getClass(), "first", term1643);
        setIntField(term1646, term1646.getClass(), "type", 0);
        setField(term1646, term1646.getClass(), "next", null);
        setField(term1646, term1646.getClass(), "first", null);
        setField(term1646, term1646.getClass(), "last", null);
        setField(term1646, term1646.getClass(), "propListHead", null);
        setIntField(term1646, term1646.getClass(), "sourcePosition", 0);
        setField(term1646, term1646.getClass(), "jsType", null);
        setField(term1646, term1646.getClass(), "parent", null);
        setField(term1626, term1626.getClass(), "last", term1646);
        setField(term1649, term1649.getClass(), "next", null);
        setIntField(term1649, term1649.getClass(), "type", 0);
        setIntField(term1649, term1649.getClass(), "intValue", 0);
        setField(term1649, term1649.getClass(), "objectValue", null);
        setField(term1626, term1626.getClass(), "propListHead", term1649);
        setIntField(term1626, term1626.getClass(), "sourcePosition", -1212399479);
        setField(term1626, term1626.getClass(), "jsType", null);
        setField(term1626, term1626.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1626;
        try {
            callMethod(klass, "tryMergeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


