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
     Object term12529;

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
        term12529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12534 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12537 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12529, term12529.getClass(), "type", 633765954);
        setIntField(term12530, term12530.getClass(), "type", 34167717);
        setIntField(term12531, term12531.getClass(), "type", 0);
        setField(term12531, term12531.getClass(), "next", null);
        setField(term12531, term12531.getClass(), "first", null);
        setField(term12531, term12531.getClass(), "last", null);
        setField(term12531, term12531.getClass(), "propListHead", null);
        setIntField(term12531, term12531.getClass(), "sourcePosition", 0);
        setField(term12531, term12531.getClass(), "jsType", null);
        setField(term12531, term12531.getClass(), "parent", null);
        setField(term12530, term12530.getClass(), "next", term12531);
        setIntField(term12532, term12532.getClass(), "type", 0);
        setField(term12532, term12532.getClass(), "next", null);
        setField(term12532, term12532.getClass(), "first", null);
        setField(term12532, term12532.getClass(), "last", null);
        setField(term12532, term12532.getClass(), "propListHead", null);
        setIntField(term12532, term12532.getClass(), "sourcePosition", 0);
        setField(term12532, term12532.getClass(), "jsType", null);
        setField(term12532, term12532.getClass(), "parent", null);
        setField(term12530, term12530.getClass(), "first", term12532);
        setIntField(term12533, term12533.getClass(), "type", 0);
        setField(term12533, term12533.getClass(), "next", null);
        setField(term12533, term12533.getClass(), "first", null);
        setField(term12533, term12533.getClass(), "last", null);
        setField(term12533, term12533.getClass(), "propListHead", null);
        setIntField(term12533, term12533.getClass(), "sourcePosition", 0);
        setField(term12533, term12533.getClass(), "jsType", null);
        setField(term12533, term12533.getClass(), "parent", null);
        setField(term12530, term12530.getClass(), "last", term12533);
        setField(term12534, term12534.getClass(), "next", null);
        setIntField(term12534, term12534.getClass(), "type", 0);
        setIntField(term12534, term12534.getClass(), "intValue", 0);
        setField(term12534, term12534.getClass(), "objectValue", null);
        setField(term12530, term12530.getClass(), "propListHead", term12534);
        setIntField(term12530, term12530.getClass(), "sourcePosition", 385463636);
        setField(term12530, term12530.getClass(), "jsType", null);
        setField(term12530, term12530.getClass(), "parent", null);
        setField(term12529, term12529.getClass(), "next", term12530);
        setIntField(term12535, term12535.getClass(), "type", 0);
        setField(term12535, term12535.getClass(), "next", null);
        setField(term12535, term12535.getClass(), "first", null);
        setField(term12535, term12535.getClass(), "last", null);
        setField(term12535, term12535.getClass(), "propListHead", null);
        setIntField(term12535, term12535.getClass(), "sourcePosition", 0);
        setField(term12535, term12535.getClass(), "jsType", null);
        setField(term12535, term12535.getClass(), "parent", null);
        setField(term12529, term12529.getClass(), "first", term12535);
        setIntField(term12536, term12536.getClass(), "type", 0);
        setField(term12536, term12536.getClass(), "next", null);
        setField(term12536, term12536.getClass(), "first", null);
        setField(term12536, term12536.getClass(), "last", null);
        setField(term12536, term12536.getClass(), "propListHead", null);
        setIntField(term12536, term12536.getClass(), "sourcePosition", 0);
        setField(term12536, term12536.getClass(), "jsType", null);
        setField(term12536, term12536.getClass(), "parent", null);
        setField(term12529, term12529.getClass(), "last", term12536);
        setField(term12537, term12537.getClass(), "next", null);
        setIntField(term12537, term12537.getClass(), "type", 0);
        setIntField(term12537, term12537.getClass(), "intValue", 0);
        setField(term12537, term12537.getClass(), "objectValue", null);
        setField(term12529, term12529.getClass(), "propListHead", term12537);
        setIntField(term12529, term12529.getClass(), "sourcePosition", -1677599962);
        setField(term12529, term12529.getClass(), "jsType", null);
        setField(term12529, term12529.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1595;
        Object retValue = callMethod(klass, "isExprCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1595, term12529));
        assertTrue(recursiveEquals(retValue, false));
    }

};


