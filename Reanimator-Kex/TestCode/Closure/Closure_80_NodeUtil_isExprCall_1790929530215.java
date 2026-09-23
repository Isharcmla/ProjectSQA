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

public class NodeUtil_isExprCall_1790929530215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1595;
     Object term12235;

    public NodeUtil_isExprCall_1790929530215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1608 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1618 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1595, term1595.getClass(), "type", 633765954);
        setIntField(term1597, term1597.getClass(), "type", 34167717);
        setIntField(term1599, term1599.getClass(), "type", 0);
        setField(term1599, term1599.getClass(), "next", null);
        setField(term1599, term1599.getClass(), "first", null);
        setField(term1599, term1599.getClass(), "last", null);
        setField(term1599, term1599.getClass(), "propListHead", null);
        setIntField(term1599, term1599.getClass(), "sourcePosition", 0);
        setField(term1599, term1599.getClass(), "jsType", null);
        setField(term1599, term1599.getClass(), "parent", null);
        setField(term1597, term1597.getClass(), "next", term1599);
        setIntField(term1602, term1602.getClass(), "type", 0);
        setField(term1602, term1602.getClass(), "next", null);
        setField(term1602, term1602.getClass(), "first", null);
        setField(term1602, term1602.getClass(), "last", null);
        setField(term1602, term1602.getClass(), "propListHead", null);
        setIntField(term1602, term1602.getClass(), "sourcePosition", 0);
        setField(term1602, term1602.getClass(), "jsType", null);
        setField(term1602, term1602.getClass(), "parent", null);
        setField(term1597, term1597.getClass(), "first", term1602);
        setIntField(term1605, term1605.getClass(), "type", 0);
        setField(term1605, term1605.getClass(), "next", null);
        setField(term1605, term1605.getClass(), "first", null);
        setField(term1605, term1605.getClass(), "last", null);
        setField(term1605, term1605.getClass(), "propListHead", null);
        setIntField(term1605, term1605.getClass(), "sourcePosition", 0);
        setField(term1605, term1605.getClass(), "jsType", null);
        setField(term1605, term1605.getClass(), "parent", null);
        setField(term1597, term1597.getClass(), "last", term1605);
        setField(term1608, term1608.getClass(), "next", null);
        setIntField(term1608, term1608.getClass(), "type", 0);
        setIntField(term1608, term1608.getClass(), "intValue", 0);
        setField(term1608, term1608.getClass(), "objectValue", null);
        setField(term1597, term1597.getClass(), "propListHead", term1608);
        setIntField(term1597, term1597.getClass(), "sourcePosition", 385463636);
        setField(term1597, term1597.getClass(), "jsType", null);
        setField(term1597, term1597.getClass(), "parent", null);
        setField(term1595, term1595.getClass(), "next", term1597);
        setIntField(term1612, term1612.getClass(), "type", 0);
        setField(term1612, term1612.getClass(), "next", null);
        setField(term1612, term1612.getClass(), "first", null);
        setField(term1612, term1612.getClass(), "last", null);
        setField(term1612, term1612.getClass(), "propListHead", null);
        setIntField(term1612, term1612.getClass(), "sourcePosition", 0);
        setField(term1612, term1612.getClass(), "jsType", null);
        setField(term1612, term1612.getClass(), "parent", null);
        setField(term1595, term1595.getClass(), "first", term1612);
        setIntField(term1615, term1615.getClass(), "type", 0);
        setField(term1615, term1615.getClass(), "next", null);
        setField(term1615, term1615.getClass(), "first", null);
        setField(term1615, term1615.getClass(), "last", null);
        setField(term1615, term1615.getClass(), "propListHead", null);
        setIntField(term1615, term1615.getClass(), "sourcePosition", 0);
        setField(term1615, term1615.getClass(), "jsType", null);
        setField(term1615, term1615.getClass(), "parent", null);
        setField(term1595, term1595.getClass(), "last", term1615);
        setField(term1618, term1618.getClass(), "next", null);
        setIntField(term1618, term1618.getClass(), "type", 0);
        setIntField(term1618, term1618.getClass(), "intValue", 0);
        setField(term1618, term1618.getClass(), "objectValue", null);
        setField(term1595, term1595.getClass(), "propListHead", term1618);
        setIntField(term1595, term1595.getClass(), "sourcePosition", -1677599962);
        setField(term1595, term1595.getClass(), "jsType", null);
        setField(term1595, term1595.getClass(), "parent", null);
        term12235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12240 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12243 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12235, term12235.getClass(), "type", 633765954);
        setIntField(term12236, term12236.getClass(), "type", 34167717);
        setIntField(term12237, term12237.getClass(), "type", 0);
        setField(term12237, term12237.getClass(), "next", null);
        setField(term12237, term12237.getClass(), "first", null);
        setField(term12237, term12237.getClass(), "last", null);
        setField(term12237, term12237.getClass(), "propListHead", null);
        setIntField(term12237, term12237.getClass(), "sourcePosition", 0);
        setField(term12237, term12237.getClass(), "jsType", null);
        setField(term12237, term12237.getClass(), "parent", null);
        setField(term12236, term12236.getClass(), "next", term12237);
        setIntField(term12238, term12238.getClass(), "type", 0);
        setField(term12238, term12238.getClass(), "next", null);
        setField(term12238, term12238.getClass(), "first", null);
        setField(term12238, term12238.getClass(), "last", null);
        setField(term12238, term12238.getClass(), "propListHead", null);
        setIntField(term12238, term12238.getClass(), "sourcePosition", 0);
        setField(term12238, term12238.getClass(), "jsType", null);
        setField(term12238, term12238.getClass(), "parent", null);
        setField(term12236, term12236.getClass(), "first", term12238);
        setIntField(term12239, term12239.getClass(), "type", 0);
        setField(term12239, term12239.getClass(), "next", null);
        setField(term12239, term12239.getClass(), "first", null);
        setField(term12239, term12239.getClass(), "last", null);
        setField(term12239, term12239.getClass(), "propListHead", null);
        setIntField(term12239, term12239.getClass(), "sourcePosition", 0);
        setField(term12239, term12239.getClass(), "jsType", null);
        setField(term12239, term12239.getClass(), "parent", null);
        setField(term12236, term12236.getClass(), "last", term12239);
        setField(term12240, term12240.getClass(), "next", null);
        setIntField(term12240, term12240.getClass(), "type", 0);
        setIntField(term12240, term12240.getClass(), "intValue", 0);
        setField(term12240, term12240.getClass(), "objectValue", null);
        setField(term12236, term12236.getClass(), "propListHead", term12240);
        setIntField(term12236, term12236.getClass(), "sourcePosition", 385463636);
        setField(term12236, term12236.getClass(), "jsType", null);
        setField(term12236, term12236.getClass(), "parent", null);
        setField(term12235, term12235.getClass(), "next", term12236);
        setIntField(term12241, term12241.getClass(), "type", 0);
        setField(term12241, term12241.getClass(), "next", null);
        setField(term12241, term12241.getClass(), "first", null);
        setField(term12241, term12241.getClass(), "last", null);
        setField(term12241, term12241.getClass(), "propListHead", null);
        setIntField(term12241, term12241.getClass(), "sourcePosition", 0);
        setField(term12241, term12241.getClass(), "jsType", null);
        setField(term12241, term12241.getClass(), "parent", null);
        setField(term12235, term12235.getClass(), "first", term12241);
        setIntField(term12242, term12242.getClass(), "type", 0);
        setField(term12242, term12242.getClass(), "next", null);
        setField(term12242, term12242.getClass(), "first", null);
        setField(term12242, term12242.getClass(), "last", null);
        setField(term12242, term12242.getClass(), "propListHead", null);
        setIntField(term12242, term12242.getClass(), "sourcePosition", 0);
        setField(term12242, term12242.getClass(), "jsType", null);
        setField(term12242, term12242.getClass(), "parent", null);
        setField(term12235, term12235.getClass(), "last", term12242);
        setField(term12243, term12243.getClass(), "next", null);
        setIntField(term12243, term12243.getClass(), "type", 0);
        setIntField(term12243, term12243.getClass(), "intValue", 0);
        setField(term12243, term12243.getClass(), "objectValue", null);
        setField(term12235, term12235.getClass(), "propListHead", term12243);
        setIntField(term12235, term12235.getClass(), "sourcePosition", -1677599962);
        setField(term12235, term12235.getClass(), "jsType", null);
        setField(term12235, term12235.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1595;
        Object retValue = callMethod(klass, "isExprCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1595, term12235));
        assertTrue(recursiveEquals(retValue, false));
    }

};


