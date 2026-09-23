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
     Object term12646;

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
        term12646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12651 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12654 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12646, term12646.getClass(), "type", -100681578);
        setIntField(term12647, term12647.getClass(), "type", -896473214);
        setIntField(term12648, term12648.getClass(), "type", 0);
        setField(term12648, term12648.getClass(), "next", null);
        setField(term12648, term12648.getClass(), "first", null);
        setField(term12648, term12648.getClass(), "last", null);
        setField(term12648, term12648.getClass(), "propListHead", null);
        setIntField(term12648, term12648.getClass(), "sourcePosition", 0);
        setField(term12648, term12648.getClass(), "jsType", null);
        setField(term12648, term12648.getClass(), "parent", null);
        setField(term12647, term12647.getClass(), "next", term12648);
        setIntField(term12649, term12649.getClass(), "type", 0);
        setField(term12649, term12649.getClass(), "next", null);
        setField(term12649, term12649.getClass(), "first", null);
        setField(term12649, term12649.getClass(), "last", null);
        setField(term12649, term12649.getClass(), "propListHead", null);
        setIntField(term12649, term12649.getClass(), "sourcePosition", 0);
        setField(term12649, term12649.getClass(), "jsType", null);
        setField(term12649, term12649.getClass(), "parent", null);
        setField(term12647, term12647.getClass(), "first", term12649);
        setIntField(term12650, term12650.getClass(), "type", 0);
        setField(term12650, term12650.getClass(), "next", null);
        setField(term12650, term12650.getClass(), "first", null);
        setField(term12650, term12650.getClass(), "last", null);
        setField(term12650, term12650.getClass(), "propListHead", null);
        setIntField(term12650, term12650.getClass(), "sourcePosition", 0);
        setField(term12650, term12650.getClass(), "jsType", null);
        setField(term12650, term12650.getClass(), "parent", null);
        setField(term12647, term12647.getClass(), "last", term12650);
        setField(term12651, term12651.getClass(), "next", null);
        setIntField(term12651, term12651.getClass(), "type", 0);
        setIntField(term12651, term12651.getClass(), "intValue", 0);
        setField(term12651, term12651.getClass(), "objectValue", null);
        setField(term12647, term12647.getClass(), "propListHead", term12651);
        setIntField(term12647, term12647.getClass(), "sourcePosition", 2107679041);
        setField(term12647, term12647.getClass(), "jsType", null);
        setField(term12647, term12647.getClass(), "parent", null);
        setField(term12646, term12646.getClass(), "next", term12647);
        setIntField(term12652, term12652.getClass(), "type", 0);
        setField(term12652, term12652.getClass(), "next", null);
        setField(term12652, term12652.getClass(), "first", null);
        setField(term12652, term12652.getClass(), "last", null);
        setField(term12652, term12652.getClass(), "propListHead", null);
        setIntField(term12652, term12652.getClass(), "sourcePosition", 0);
        setField(term12652, term12652.getClass(), "jsType", null);
        setField(term12652, term12652.getClass(), "parent", null);
        setField(term12646, term12646.getClass(), "first", term12652);
        setIntField(term12653, term12653.getClass(), "type", 0);
        setField(term12653, term12653.getClass(), "next", null);
        setField(term12653, term12653.getClass(), "first", null);
        setField(term12653, term12653.getClass(), "last", null);
        setField(term12653, term12653.getClass(), "propListHead", null);
        setIntField(term12653, term12653.getClass(), "sourcePosition", 0);
        setField(term12653, term12653.getClass(), "jsType", null);
        setField(term12653, term12653.getClass(), "parent", null);
        setField(term12646, term12646.getClass(), "last", term12653);
        setField(term12654, term12654.getClass(), "next", null);
        setIntField(term12654, term12654.getClass(), "type", 0);
        setIntField(term12654, term12654.getClass(), "intValue", 0);
        setField(term12654, term12654.getClass(), "objectValue", null);
        setField(term12646, term12646.getClass(), "propListHead", term12654);
        setIntField(term12646, term12646.getClass(), "sourcePosition", 2040965507);
        setField(term12646, term12646.getClass(), "jsType", null);
        setField(term12646, term12646.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1676;
        Object retValue = callMethod(klass, "getLoopCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1676, term12646));
        assertTrue(recursiveEquals(retValue, null));
    }

};


