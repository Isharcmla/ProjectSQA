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

public class NodeUtil_isCall_1870270415237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1729;
     Object term13660;

    public NodeUtil_isCall_1870270415237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1729, term1729.getClass(), "type", -2093862988);
        setIntField(term1731, term1731.getClass(), "type", -1695750603);
        setIntField(term1733, term1733.getClass(), "type", 0);
        setField(term1733, term1733.getClass(), "next", null);
        setField(term1733, term1733.getClass(), "first", null);
        setField(term1733, term1733.getClass(), "last", null);
        setField(term1733, term1733.getClass(), "propListHead", null);
        setIntField(term1733, term1733.getClass(), "sourcePosition", 0);
        setField(term1733, term1733.getClass(), "jsType", null);
        setField(term1733, term1733.getClass(), "parent", null);
        setField(term1731, term1731.getClass(), "next", term1733);
        setIntField(term1736, term1736.getClass(), "type", 0);
        setField(term1736, term1736.getClass(), "next", null);
        setField(term1736, term1736.getClass(), "first", null);
        setField(term1736, term1736.getClass(), "last", null);
        setField(term1736, term1736.getClass(), "propListHead", null);
        setIntField(term1736, term1736.getClass(), "sourcePosition", 0);
        setField(term1736, term1736.getClass(), "jsType", null);
        setField(term1736, term1736.getClass(), "parent", null);
        setField(term1731, term1731.getClass(), "first", term1736);
        setIntField(term1739, term1739.getClass(), "type", 0);
        setField(term1739, term1739.getClass(), "next", null);
        setField(term1739, term1739.getClass(), "first", null);
        setField(term1739, term1739.getClass(), "last", null);
        setField(term1739, term1739.getClass(), "propListHead", null);
        setIntField(term1739, term1739.getClass(), "sourcePosition", 0);
        setField(term1739, term1739.getClass(), "jsType", null);
        setField(term1739, term1739.getClass(), "parent", null);
        setField(term1731, term1731.getClass(), "last", term1739);
        setField(term1731, term1731.getClass(), "propListHead", null);
        setIntField(term1731, term1731.getClass(), "sourcePosition", 0);
        setField(term1731, term1731.getClass(), "jsType", null);
        setField(term1731, term1731.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "next", term1731);
        setIntField(term1743, term1743.getClass(), "type", 0);
        setField(term1743, term1743.getClass(), "next", null);
        setField(term1743, term1743.getClass(), "first", null);
        setField(term1743, term1743.getClass(), "last", null);
        setField(term1743, term1743.getClass(), "propListHead", null);
        setIntField(term1743, term1743.getClass(), "sourcePosition", 0);
        setField(term1743, term1743.getClass(), "jsType", null);
        setField(term1743, term1743.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "first", term1743);
        setIntField(term1746, term1746.getClass(), "type", 0);
        setField(term1746, term1746.getClass(), "next", null);
        setField(term1746, term1746.getClass(), "first", null);
        setField(term1746, term1746.getClass(), "last", null);
        setField(term1746, term1746.getClass(), "propListHead", null);
        setIntField(term1746, term1746.getClass(), "sourcePosition", 0);
        setField(term1746, term1746.getClass(), "jsType", null);
        setField(term1746, term1746.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "last", term1746);
        setField(term1729, term1729.getClass(), "propListHead", null);
        setIntField(term1729, term1729.getClass(), "sourcePosition", 0);
        setField(term1729, term1729.getClass(), "jsType", null);
        setField(term1729, term1729.getClass(), "parent", null);
        term13660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13660, term13660.getClass(), "type", -2093862988);
        setIntField(term13661, term13661.getClass(), "type", -1695750603);
        setIntField(term13662, term13662.getClass(), "type", 0);
        setField(term13662, term13662.getClass(), "next", null);
        setField(term13662, term13662.getClass(), "first", null);
        setField(term13662, term13662.getClass(), "last", null);
        setField(term13662, term13662.getClass(), "propListHead", null);
        setIntField(term13662, term13662.getClass(), "sourcePosition", 0);
        setField(term13662, term13662.getClass(), "jsType", null);
        setField(term13662, term13662.getClass(), "parent", null);
        setField(term13661, term13661.getClass(), "next", term13662);
        setIntField(term13663, term13663.getClass(), "type", 0);
        setField(term13663, term13663.getClass(), "next", null);
        setField(term13663, term13663.getClass(), "first", null);
        setField(term13663, term13663.getClass(), "last", null);
        setField(term13663, term13663.getClass(), "propListHead", null);
        setIntField(term13663, term13663.getClass(), "sourcePosition", 0);
        setField(term13663, term13663.getClass(), "jsType", null);
        setField(term13663, term13663.getClass(), "parent", null);
        setField(term13661, term13661.getClass(), "first", term13663);
        setIntField(term13664, term13664.getClass(), "type", 0);
        setField(term13664, term13664.getClass(), "next", null);
        setField(term13664, term13664.getClass(), "first", null);
        setField(term13664, term13664.getClass(), "last", null);
        setField(term13664, term13664.getClass(), "propListHead", null);
        setIntField(term13664, term13664.getClass(), "sourcePosition", 0);
        setField(term13664, term13664.getClass(), "jsType", null);
        setField(term13664, term13664.getClass(), "parent", null);
        setField(term13661, term13661.getClass(), "last", term13664);
        setField(term13661, term13661.getClass(), "propListHead", null);
        setIntField(term13661, term13661.getClass(), "sourcePosition", 0);
        setField(term13661, term13661.getClass(), "jsType", null);
        setField(term13661, term13661.getClass(), "parent", null);
        setField(term13660, term13660.getClass(), "next", term13661);
        setIntField(term13665, term13665.getClass(), "type", 0);
        setField(term13665, term13665.getClass(), "next", null);
        setField(term13665, term13665.getClass(), "first", null);
        setField(term13665, term13665.getClass(), "last", null);
        setField(term13665, term13665.getClass(), "propListHead", null);
        setIntField(term13665, term13665.getClass(), "sourcePosition", 0);
        setField(term13665, term13665.getClass(), "jsType", null);
        setField(term13665, term13665.getClass(), "parent", null);
        setField(term13660, term13660.getClass(), "first", term13665);
        setIntField(term13666, term13666.getClass(), "type", 0);
        setField(term13666, term13666.getClass(), "next", null);
        setField(term13666, term13666.getClass(), "first", null);
        setField(term13666, term13666.getClass(), "last", null);
        setField(term13666, term13666.getClass(), "propListHead", null);
        setIntField(term13666, term13666.getClass(), "sourcePosition", 0);
        setField(term13666, term13666.getClass(), "jsType", null);
        setField(term13666, term13666.getClass(), "parent", null);
        setField(term13660, term13660.getClass(), "last", term13666);
        setField(term13660, term13660.getClass(), "propListHead", null);
        setIntField(term13660, term13660.getClass(), "sourcePosition", 0);
        setField(term13660, term13660.getClass(), "jsType", null);
        setField(term13660, term13660.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1729;
        Object retValue = callMethod(klass, "isCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1729, term13660));
        assertTrue(recursiveEquals(retValue, false));
    }

};


