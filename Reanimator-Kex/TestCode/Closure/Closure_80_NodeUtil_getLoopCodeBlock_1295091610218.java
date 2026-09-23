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

public class NodeUtil_getLoopCodeBlock_1295091610218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1676;
     Object term12352;

    public NodeUtil_getLoopCodeBlock_1295091610218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1689 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1676, term1676.getClass(), "type", -100681578);
        setIntField(term1678, term1678.getClass(), "type", -896473214);
        setIntField(term1680, term1680.getClass(), "type", 0);
        setField(term1680, term1680.getClass(), "next", null);
        setField(term1680, term1680.getClass(), "first", null);
        setField(term1680, term1680.getClass(), "last", null);
        setField(term1680, term1680.getClass(), "propListHead", null);
        setIntField(term1680, term1680.getClass(), "sourcePosition", 0);
        setField(term1680, term1680.getClass(), "jsType", null);
        setField(term1680, term1680.getClass(), "parent", null);
        setField(term1678, term1678.getClass(), "next", term1680);
        setIntField(term1683, term1683.getClass(), "type", 0);
        setField(term1683, term1683.getClass(), "next", null);
        setField(term1683, term1683.getClass(), "first", null);
        setField(term1683, term1683.getClass(), "last", null);
        setField(term1683, term1683.getClass(), "propListHead", null);
        setIntField(term1683, term1683.getClass(), "sourcePosition", 0);
        setField(term1683, term1683.getClass(), "jsType", null);
        setField(term1683, term1683.getClass(), "parent", null);
        setField(term1678, term1678.getClass(), "first", term1683);
        setIntField(term1686, term1686.getClass(), "type", 0);
        setField(term1686, term1686.getClass(), "next", null);
        setField(term1686, term1686.getClass(), "first", null);
        setField(term1686, term1686.getClass(), "last", null);
        setField(term1686, term1686.getClass(), "propListHead", null);
        setIntField(term1686, term1686.getClass(), "sourcePosition", 0);
        setField(term1686, term1686.getClass(), "jsType", null);
        setField(term1686, term1686.getClass(), "parent", null);
        setField(term1678, term1678.getClass(), "last", term1686);
        setField(term1689, term1689.getClass(), "next", null);
        setIntField(term1689, term1689.getClass(), "type", 0);
        setIntField(term1689, term1689.getClass(), "intValue", 0);
        setField(term1689, term1689.getClass(), "objectValue", null);
        setField(term1678, term1678.getClass(), "propListHead", term1689);
        setIntField(term1678, term1678.getClass(), "sourcePosition", 2107679041);
        setField(term1678, term1678.getClass(), "jsType", null);
        setField(term1678, term1678.getClass(), "parent", null);
        setField(term1676, term1676.getClass(), "next", term1678);
        setIntField(term1693, term1693.getClass(), "type", 0);
        setField(term1693, term1693.getClass(), "next", null);
        setField(term1693, term1693.getClass(), "first", null);
        setField(term1693, term1693.getClass(), "last", null);
        setField(term1693, term1693.getClass(), "propListHead", null);
        setIntField(term1693, term1693.getClass(), "sourcePosition", 0);
        setField(term1693, term1693.getClass(), "jsType", null);
        setField(term1693, term1693.getClass(), "parent", null);
        setField(term1676, term1676.getClass(), "first", term1693);
        setIntField(term1696, term1696.getClass(), "type", 0);
        setField(term1696, term1696.getClass(), "next", null);
        setField(term1696, term1696.getClass(), "first", null);
        setField(term1696, term1696.getClass(), "last", null);
        setField(term1696, term1696.getClass(), "propListHead", null);
        setIntField(term1696, term1696.getClass(), "sourcePosition", 0);
        setField(term1696, term1696.getClass(), "jsType", null);
        setField(term1696, term1696.getClass(), "parent", null);
        setField(term1676, term1676.getClass(), "last", term1696);
        setField(term1699, term1699.getClass(), "next", null);
        setIntField(term1699, term1699.getClass(), "type", 0);
        setIntField(term1699, term1699.getClass(), "intValue", 0);
        setField(term1699, term1699.getClass(), "objectValue", null);
        setField(term1676, term1676.getClass(), "propListHead", term1699);
        setIntField(term1676, term1676.getClass(), "sourcePosition", 2040965507);
        setField(term1676, term1676.getClass(), "jsType", null);
        setField(term1676, term1676.getClass(), "parent", null);
        term12352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12357 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12360 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12352, term12352.getClass(), "type", -100681578);
        setIntField(term12353, term12353.getClass(), "type", -896473214);
        setIntField(term12354, term12354.getClass(), "type", 0);
        setField(term12354, term12354.getClass(), "next", null);
        setField(term12354, term12354.getClass(), "first", null);
        setField(term12354, term12354.getClass(), "last", null);
        setField(term12354, term12354.getClass(), "propListHead", null);
        setIntField(term12354, term12354.getClass(), "sourcePosition", 0);
        setField(term12354, term12354.getClass(), "jsType", null);
        setField(term12354, term12354.getClass(), "parent", null);
        setField(term12353, term12353.getClass(), "next", term12354);
        setIntField(term12355, term12355.getClass(), "type", 0);
        setField(term12355, term12355.getClass(), "next", null);
        setField(term12355, term12355.getClass(), "first", null);
        setField(term12355, term12355.getClass(), "last", null);
        setField(term12355, term12355.getClass(), "propListHead", null);
        setIntField(term12355, term12355.getClass(), "sourcePosition", 0);
        setField(term12355, term12355.getClass(), "jsType", null);
        setField(term12355, term12355.getClass(), "parent", null);
        setField(term12353, term12353.getClass(), "first", term12355);
        setIntField(term12356, term12356.getClass(), "type", 0);
        setField(term12356, term12356.getClass(), "next", null);
        setField(term12356, term12356.getClass(), "first", null);
        setField(term12356, term12356.getClass(), "last", null);
        setField(term12356, term12356.getClass(), "propListHead", null);
        setIntField(term12356, term12356.getClass(), "sourcePosition", 0);
        setField(term12356, term12356.getClass(), "jsType", null);
        setField(term12356, term12356.getClass(), "parent", null);
        setField(term12353, term12353.getClass(), "last", term12356);
        setField(term12357, term12357.getClass(), "next", null);
        setIntField(term12357, term12357.getClass(), "type", 0);
        setIntField(term12357, term12357.getClass(), "intValue", 0);
        setField(term12357, term12357.getClass(), "objectValue", null);
        setField(term12353, term12353.getClass(), "propListHead", term12357);
        setIntField(term12353, term12353.getClass(), "sourcePosition", 2107679041);
        setField(term12353, term12353.getClass(), "jsType", null);
        setField(term12353, term12353.getClass(), "parent", null);
        setField(term12352, term12352.getClass(), "next", term12353);
        setIntField(term12358, term12358.getClass(), "type", 0);
        setField(term12358, term12358.getClass(), "next", null);
        setField(term12358, term12358.getClass(), "first", null);
        setField(term12358, term12358.getClass(), "last", null);
        setField(term12358, term12358.getClass(), "propListHead", null);
        setIntField(term12358, term12358.getClass(), "sourcePosition", 0);
        setField(term12358, term12358.getClass(), "jsType", null);
        setField(term12358, term12358.getClass(), "parent", null);
        setField(term12352, term12352.getClass(), "first", term12358);
        setIntField(term12359, term12359.getClass(), "type", 0);
        setField(term12359, term12359.getClass(), "next", null);
        setField(term12359, term12359.getClass(), "first", null);
        setField(term12359, term12359.getClass(), "last", null);
        setField(term12359, term12359.getClass(), "propListHead", null);
        setIntField(term12359, term12359.getClass(), "sourcePosition", 0);
        setField(term12359, term12359.getClass(), "jsType", null);
        setField(term12359, term12359.getClass(), "parent", null);
        setField(term12352, term12352.getClass(), "last", term12359);
        setField(term12360, term12360.getClass(), "next", null);
        setIntField(term12360, term12360.getClass(), "type", 0);
        setIntField(term12360, term12360.getClass(), "intValue", 0);
        setField(term12360, term12360.getClass(), "objectValue", null);
        setField(term12352, term12352.getClass(), "propListHead", term12360);
        setIntField(term12352, term12352.getClass(), "sourcePosition", 2040965507);
        setField(term12352, term12352.getClass(), "jsType", null);
        setField(term12352, term12352.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1676;
        Object retValue = callMethod(klass, "getLoopCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1676, term12352));
        assertTrue(recursiveEquals(retValue, null));
    }

};


