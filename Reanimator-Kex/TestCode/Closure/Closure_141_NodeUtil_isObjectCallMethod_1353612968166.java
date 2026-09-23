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

public class NodeUtil_isObjectCallMethod_1353612968166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1678;
     Object term10228;

    public NodeUtil_isObjectCallMethod_1353612968166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1691 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1678, term1678.getClass(), "type", 852806940);
        setIntField(term1680, term1680.getClass(), "type", -64893740);
        setIntField(term1682, term1682.getClass(), "type", 0);
        setField(term1682, term1682.getClass(), "next", null);
        setField(term1682, term1682.getClass(), "first", null);
        setField(term1682, term1682.getClass(), "last", null);
        setField(term1682, term1682.getClass(), "propListHead", null);
        setIntField(term1682, term1682.getClass(), "sourcePosition", 0);
        setField(term1682, term1682.getClass(), "jsType", null);
        setField(term1682, term1682.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "next", term1682);
        setIntField(term1685, term1685.getClass(), "type", 0);
        setField(term1685, term1685.getClass(), "next", null);
        setField(term1685, term1685.getClass(), "first", null);
        setField(term1685, term1685.getClass(), "last", null);
        setField(term1685, term1685.getClass(), "propListHead", null);
        setIntField(term1685, term1685.getClass(), "sourcePosition", 0);
        setField(term1685, term1685.getClass(), "jsType", null);
        setField(term1685, term1685.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "first", term1685);
        setIntField(term1688, term1688.getClass(), "type", 0);
        setField(term1688, term1688.getClass(), "next", null);
        setField(term1688, term1688.getClass(), "first", null);
        setField(term1688, term1688.getClass(), "last", null);
        setField(term1688, term1688.getClass(), "propListHead", null);
        setIntField(term1688, term1688.getClass(), "sourcePosition", 0);
        setField(term1688, term1688.getClass(), "jsType", null);
        setField(term1688, term1688.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "last", term1688);
        setField(term1691, term1691.getClass(), "next", null);
        setIntField(term1691, term1691.getClass(), "type", 0);
        setIntField(term1691, term1691.getClass(), "intValue", 0);
        setField(term1691, term1691.getClass(), "objectValue", null);
        setField(term1680, term1680.getClass(), "propListHead", term1691);
        setIntField(term1680, term1680.getClass(), "sourcePosition", -83178716);
        setField(term1680, term1680.getClass(), "jsType", null);
        setField(term1680, term1680.getClass(), "parent", null);
        setField(term1678, term1678.getClass(), "next", term1680);
        setIntField(term1695, term1695.getClass(), "type", 0);
        setField(term1695, term1695.getClass(), "next", null);
        setField(term1695, term1695.getClass(), "first", null);
        setField(term1695, term1695.getClass(), "last", null);
        setField(term1695, term1695.getClass(), "propListHead", null);
        setIntField(term1695, term1695.getClass(), "sourcePosition", 0);
        setField(term1695, term1695.getClass(), "jsType", null);
        setField(term1695, term1695.getClass(), "parent", null);
        setField(term1678, term1678.getClass(), "first", term1695);
        setIntField(term1698, term1698.getClass(), "type", 0);
        setField(term1698, term1698.getClass(), "next", null);
        setField(term1698, term1698.getClass(), "first", null);
        setField(term1698, term1698.getClass(), "last", null);
        setField(term1698, term1698.getClass(), "propListHead", null);
        setIntField(term1698, term1698.getClass(), "sourcePosition", 0);
        setField(term1698, term1698.getClass(), "jsType", null);
        setField(term1698, term1698.getClass(), "parent", null);
        setField(term1678, term1678.getClass(), "last", term1698);
        setField(term1701, term1701.getClass(), "next", null);
        setIntField(term1701, term1701.getClass(), "type", 0);
        setIntField(term1701, term1701.getClass(), "intValue", 0);
        setField(term1701, term1701.getClass(), "objectValue", null);
        setField(term1678, term1678.getClass(), "propListHead", term1701);
        setIntField(term1678, term1678.getClass(), "sourcePosition", -1292704466);
        setField(term1678, term1678.getClass(), "jsType", null);
        setField(term1678, term1678.getClass(), "parent", null);
        term10228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10233 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10236 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10228, term10228.getClass(), "type", 852806940);
        setIntField(term10229, term10229.getClass(), "type", -64893740);
        setIntField(term10230, term10230.getClass(), "type", 0);
        setField(term10230, term10230.getClass(), "next", null);
        setField(term10230, term10230.getClass(), "first", null);
        setField(term10230, term10230.getClass(), "last", null);
        setField(term10230, term10230.getClass(), "propListHead", null);
        setIntField(term10230, term10230.getClass(), "sourcePosition", 0);
        setField(term10230, term10230.getClass(), "jsType", null);
        setField(term10230, term10230.getClass(), "parent", null);
        setField(term10229, term10229.getClass(), "next", term10230);
        setIntField(term10231, term10231.getClass(), "type", 0);
        setField(term10231, term10231.getClass(), "next", null);
        setField(term10231, term10231.getClass(), "first", null);
        setField(term10231, term10231.getClass(), "last", null);
        setField(term10231, term10231.getClass(), "propListHead", null);
        setIntField(term10231, term10231.getClass(), "sourcePosition", 0);
        setField(term10231, term10231.getClass(), "jsType", null);
        setField(term10231, term10231.getClass(), "parent", null);
        setField(term10229, term10229.getClass(), "first", term10231);
        setIntField(term10232, term10232.getClass(), "type", 0);
        setField(term10232, term10232.getClass(), "next", null);
        setField(term10232, term10232.getClass(), "first", null);
        setField(term10232, term10232.getClass(), "last", null);
        setField(term10232, term10232.getClass(), "propListHead", null);
        setIntField(term10232, term10232.getClass(), "sourcePosition", 0);
        setField(term10232, term10232.getClass(), "jsType", null);
        setField(term10232, term10232.getClass(), "parent", null);
        setField(term10229, term10229.getClass(), "last", term10232);
        setField(term10233, term10233.getClass(), "next", null);
        setIntField(term10233, term10233.getClass(), "type", 0);
        setIntField(term10233, term10233.getClass(), "intValue", 0);
        setField(term10233, term10233.getClass(), "objectValue", null);
        setField(term10229, term10229.getClass(), "propListHead", term10233);
        setIntField(term10229, term10229.getClass(), "sourcePosition", -83178716);
        setField(term10229, term10229.getClass(), "jsType", null);
        setField(term10229, term10229.getClass(), "parent", null);
        setField(term10228, term10228.getClass(), "next", term10229);
        setIntField(term10234, term10234.getClass(), "type", 0);
        setField(term10234, term10234.getClass(), "next", null);
        setField(term10234, term10234.getClass(), "first", null);
        setField(term10234, term10234.getClass(), "last", null);
        setField(term10234, term10234.getClass(), "propListHead", null);
        setIntField(term10234, term10234.getClass(), "sourcePosition", 0);
        setField(term10234, term10234.getClass(), "jsType", null);
        setField(term10234, term10234.getClass(), "parent", null);
        setField(term10228, term10228.getClass(), "first", term10234);
        setIntField(term10235, term10235.getClass(), "type", 0);
        setField(term10235, term10235.getClass(), "next", null);
        setField(term10235, term10235.getClass(), "first", null);
        setField(term10235, term10235.getClass(), "last", null);
        setField(term10235, term10235.getClass(), "propListHead", null);
        setIntField(term10235, term10235.getClass(), "sourcePosition", 0);
        setField(term10235, term10235.getClass(), "jsType", null);
        setField(term10235, term10235.getClass(), "parent", null);
        setField(term10228, term10228.getClass(), "last", term10235);
        setField(term10236, term10236.getClass(), "next", null);
        setIntField(term10236, term10236.getClass(), "type", 0);
        setIntField(term10236, term10236.getClass(), "intValue", 0);
        setField(term10236, term10236.getClass(), "objectValue", null);
        setField(term10228, term10228.getClass(), "propListHead", term10236);
        setIntField(term10228, term10228.getClass(), "sourcePosition", -1292704466);
        setField(term10228, term10228.getClass(), "jsType", null);
        setField(term10228, term10228.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1678;
        args[1] = "uuaPigETmJ";
        callMethod(klass, "isObjectCallMethod", argTypes, null, args);
        assertTrue(recursiveEquals(term1678, term10228));
    }

};


