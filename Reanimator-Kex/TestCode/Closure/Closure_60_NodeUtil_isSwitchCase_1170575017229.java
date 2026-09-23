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

public class NodeUtil_isSwitchCase_1170575017229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1519;
     Object term13616;

    public NodeUtil_isSwitchCase_1170575017229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1519, term1519.getClass(), "type", -497534255);
        setIntField(term1521, term1521.getClass(), "type", -1955400589);
        setIntField(term1523, term1523.getClass(), "type", 0);
        setField(term1523, term1523.getClass(), "next", null);
        setField(term1523, term1523.getClass(), "first", null);
        setField(term1523, term1523.getClass(), "last", null);
        setField(term1523, term1523.getClass(), "propListHead", null);
        setIntField(term1523, term1523.getClass(), "sourcePosition", 0);
        setField(term1523, term1523.getClass(), "jsType", null);
        setField(term1523, term1523.getClass(), "parent", null);
        setField(term1521, term1521.getClass(), "next", term1523);
        setIntField(term1526, term1526.getClass(), "type", 0);
        setField(term1526, term1526.getClass(), "next", null);
        setField(term1526, term1526.getClass(), "first", null);
        setField(term1526, term1526.getClass(), "last", null);
        setField(term1526, term1526.getClass(), "propListHead", null);
        setIntField(term1526, term1526.getClass(), "sourcePosition", 0);
        setField(term1526, term1526.getClass(), "jsType", null);
        setField(term1526, term1526.getClass(), "parent", null);
        setField(term1521, term1521.getClass(), "first", term1526);
        setIntField(term1529, term1529.getClass(), "type", 0);
        setField(term1529, term1529.getClass(), "next", null);
        setField(term1529, term1529.getClass(), "first", null);
        setField(term1529, term1529.getClass(), "last", null);
        setField(term1529, term1529.getClass(), "propListHead", null);
        setIntField(term1529, term1529.getClass(), "sourcePosition", 0);
        setField(term1529, term1529.getClass(), "jsType", null);
        setField(term1529, term1529.getClass(), "parent", null);
        setField(term1521, term1521.getClass(), "last", term1529);
        setField(term1521, term1521.getClass(), "propListHead", null);
        setIntField(term1521, term1521.getClass(), "sourcePosition", 0);
        setField(term1521, term1521.getClass(), "jsType", null);
        setField(term1521, term1521.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "next", term1521);
        setIntField(term1533, term1533.getClass(), "type", 0);
        setField(term1533, term1533.getClass(), "next", null);
        setField(term1533, term1533.getClass(), "first", null);
        setField(term1533, term1533.getClass(), "last", null);
        setField(term1533, term1533.getClass(), "propListHead", null);
        setIntField(term1533, term1533.getClass(), "sourcePosition", 0);
        setField(term1533, term1533.getClass(), "jsType", null);
        setField(term1533, term1533.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "first", term1533);
        setIntField(term1536, term1536.getClass(), "type", 0);
        setField(term1536, term1536.getClass(), "next", null);
        setField(term1536, term1536.getClass(), "first", null);
        setField(term1536, term1536.getClass(), "last", null);
        setField(term1536, term1536.getClass(), "propListHead", null);
        setIntField(term1536, term1536.getClass(), "sourcePosition", 0);
        setField(term1536, term1536.getClass(), "jsType", null);
        setField(term1536, term1536.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "last", term1536);
        setField(term1519, term1519.getClass(), "propListHead", null);
        setIntField(term1519, term1519.getClass(), "sourcePosition", 0);
        setField(term1519, term1519.getClass(), "jsType", null);
        setField(term1519, term1519.getClass(), "parent", null);
        term13616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13616, term13616.getClass(), "type", -497534255);
        setIntField(term13617, term13617.getClass(), "type", -1955400589);
        setIntField(term13618, term13618.getClass(), "type", 0);
        setField(term13618, term13618.getClass(), "next", null);
        setField(term13618, term13618.getClass(), "first", null);
        setField(term13618, term13618.getClass(), "last", null);
        setField(term13618, term13618.getClass(), "propListHead", null);
        setIntField(term13618, term13618.getClass(), "sourcePosition", 0);
        setField(term13618, term13618.getClass(), "jsType", null);
        setField(term13618, term13618.getClass(), "parent", null);
        setField(term13617, term13617.getClass(), "next", term13618);
        setIntField(term13619, term13619.getClass(), "type", 0);
        setField(term13619, term13619.getClass(), "next", null);
        setField(term13619, term13619.getClass(), "first", null);
        setField(term13619, term13619.getClass(), "last", null);
        setField(term13619, term13619.getClass(), "propListHead", null);
        setIntField(term13619, term13619.getClass(), "sourcePosition", 0);
        setField(term13619, term13619.getClass(), "jsType", null);
        setField(term13619, term13619.getClass(), "parent", null);
        setField(term13617, term13617.getClass(), "first", term13619);
        setIntField(term13620, term13620.getClass(), "type", 0);
        setField(term13620, term13620.getClass(), "next", null);
        setField(term13620, term13620.getClass(), "first", null);
        setField(term13620, term13620.getClass(), "last", null);
        setField(term13620, term13620.getClass(), "propListHead", null);
        setIntField(term13620, term13620.getClass(), "sourcePosition", 0);
        setField(term13620, term13620.getClass(), "jsType", null);
        setField(term13620, term13620.getClass(), "parent", null);
        setField(term13617, term13617.getClass(), "last", term13620);
        setField(term13617, term13617.getClass(), "propListHead", null);
        setIntField(term13617, term13617.getClass(), "sourcePosition", 0);
        setField(term13617, term13617.getClass(), "jsType", null);
        setField(term13617, term13617.getClass(), "parent", null);
        setField(term13616, term13616.getClass(), "next", term13617);
        setIntField(term13621, term13621.getClass(), "type", 0);
        setField(term13621, term13621.getClass(), "next", null);
        setField(term13621, term13621.getClass(), "first", null);
        setField(term13621, term13621.getClass(), "last", null);
        setField(term13621, term13621.getClass(), "propListHead", null);
        setIntField(term13621, term13621.getClass(), "sourcePosition", 0);
        setField(term13621, term13621.getClass(), "jsType", null);
        setField(term13621, term13621.getClass(), "parent", null);
        setField(term13616, term13616.getClass(), "first", term13621);
        setIntField(term13622, term13622.getClass(), "type", 0);
        setField(term13622, term13622.getClass(), "next", null);
        setField(term13622, term13622.getClass(), "first", null);
        setField(term13622, term13622.getClass(), "last", null);
        setField(term13622, term13622.getClass(), "propListHead", null);
        setIntField(term13622, term13622.getClass(), "sourcePosition", 0);
        setField(term13622, term13622.getClass(), "jsType", null);
        setField(term13622, term13622.getClass(), "parent", null);
        setField(term13616, term13616.getClass(), "last", term13622);
        setField(term13616, term13616.getClass(), "propListHead", null);
        setIntField(term13616, term13616.getClass(), "sourcePosition", 0);
        setField(term13616, term13616.getClass(), "jsType", null);
        setField(term13616, term13616.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1519;
        Object retValue = callMethod(klass, "isSwitchCase", argTypes, null, args);
        assertTrue(recursiveEquals(term1519, term13616));
        assertTrue(recursiveEquals(retValue, false));
    }

};


