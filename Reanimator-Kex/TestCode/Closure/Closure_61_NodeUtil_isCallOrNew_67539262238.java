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

public class NodeUtil_isCallOrNew_67539262238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1750;
     Object term13698;

    public NodeUtil_isCallOrNew_67539262238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1750, term1750.getClass(), "type", -1112119058);
        setIntField(term1752, term1752.getClass(), "type", -98060427);
        setIntField(term1754, term1754.getClass(), "type", 0);
        setField(term1754, term1754.getClass(), "next", null);
        setField(term1754, term1754.getClass(), "first", null);
        setField(term1754, term1754.getClass(), "last", null);
        setField(term1754, term1754.getClass(), "propListHead", null);
        setIntField(term1754, term1754.getClass(), "sourcePosition", 0);
        setField(term1754, term1754.getClass(), "jsType", null);
        setField(term1754, term1754.getClass(), "parent", null);
        setField(term1752, term1752.getClass(), "next", term1754);
        setIntField(term1757, term1757.getClass(), "type", 0);
        setField(term1757, term1757.getClass(), "next", null);
        setField(term1757, term1757.getClass(), "first", null);
        setField(term1757, term1757.getClass(), "last", null);
        setField(term1757, term1757.getClass(), "propListHead", null);
        setIntField(term1757, term1757.getClass(), "sourcePosition", 0);
        setField(term1757, term1757.getClass(), "jsType", null);
        setField(term1757, term1757.getClass(), "parent", null);
        setField(term1752, term1752.getClass(), "first", term1757);
        setIntField(term1760, term1760.getClass(), "type", 0);
        setField(term1760, term1760.getClass(), "next", null);
        setField(term1760, term1760.getClass(), "first", null);
        setField(term1760, term1760.getClass(), "last", null);
        setField(term1760, term1760.getClass(), "propListHead", null);
        setIntField(term1760, term1760.getClass(), "sourcePosition", 0);
        setField(term1760, term1760.getClass(), "jsType", null);
        setField(term1760, term1760.getClass(), "parent", null);
        setField(term1752, term1752.getClass(), "last", term1760);
        setField(term1752, term1752.getClass(), "propListHead", null);
        setIntField(term1752, term1752.getClass(), "sourcePosition", 0);
        setField(term1752, term1752.getClass(), "jsType", null);
        setField(term1752, term1752.getClass(), "parent", null);
        setField(term1750, term1750.getClass(), "next", term1752);
        setIntField(term1764, term1764.getClass(), "type", 0);
        setField(term1764, term1764.getClass(), "next", null);
        setField(term1764, term1764.getClass(), "first", null);
        setField(term1764, term1764.getClass(), "last", null);
        setField(term1764, term1764.getClass(), "propListHead", null);
        setIntField(term1764, term1764.getClass(), "sourcePosition", 0);
        setField(term1764, term1764.getClass(), "jsType", null);
        setField(term1764, term1764.getClass(), "parent", null);
        setField(term1750, term1750.getClass(), "first", term1764);
        setIntField(term1767, term1767.getClass(), "type", 0);
        setField(term1767, term1767.getClass(), "next", null);
        setField(term1767, term1767.getClass(), "first", null);
        setField(term1767, term1767.getClass(), "last", null);
        setField(term1767, term1767.getClass(), "propListHead", null);
        setIntField(term1767, term1767.getClass(), "sourcePosition", 0);
        setField(term1767, term1767.getClass(), "jsType", null);
        setField(term1767, term1767.getClass(), "parent", null);
        setField(term1750, term1750.getClass(), "last", term1767);
        setField(term1750, term1750.getClass(), "propListHead", null);
        setIntField(term1750, term1750.getClass(), "sourcePosition", 0);
        setField(term1750, term1750.getClass(), "jsType", null);
        setField(term1750, term1750.getClass(), "parent", null);
        term13698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13698, term13698.getClass(), "type", -1112119058);
        setIntField(term13699, term13699.getClass(), "type", -98060427);
        setIntField(term13700, term13700.getClass(), "type", 0);
        setField(term13700, term13700.getClass(), "next", null);
        setField(term13700, term13700.getClass(), "first", null);
        setField(term13700, term13700.getClass(), "last", null);
        setField(term13700, term13700.getClass(), "propListHead", null);
        setIntField(term13700, term13700.getClass(), "sourcePosition", 0);
        setField(term13700, term13700.getClass(), "jsType", null);
        setField(term13700, term13700.getClass(), "parent", null);
        setField(term13699, term13699.getClass(), "next", term13700);
        setIntField(term13701, term13701.getClass(), "type", 0);
        setField(term13701, term13701.getClass(), "next", null);
        setField(term13701, term13701.getClass(), "first", null);
        setField(term13701, term13701.getClass(), "last", null);
        setField(term13701, term13701.getClass(), "propListHead", null);
        setIntField(term13701, term13701.getClass(), "sourcePosition", 0);
        setField(term13701, term13701.getClass(), "jsType", null);
        setField(term13701, term13701.getClass(), "parent", null);
        setField(term13699, term13699.getClass(), "first", term13701);
        setIntField(term13702, term13702.getClass(), "type", 0);
        setField(term13702, term13702.getClass(), "next", null);
        setField(term13702, term13702.getClass(), "first", null);
        setField(term13702, term13702.getClass(), "last", null);
        setField(term13702, term13702.getClass(), "propListHead", null);
        setIntField(term13702, term13702.getClass(), "sourcePosition", 0);
        setField(term13702, term13702.getClass(), "jsType", null);
        setField(term13702, term13702.getClass(), "parent", null);
        setField(term13699, term13699.getClass(), "last", term13702);
        setField(term13699, term13699.getClass(), "propListHead", null);
        setIntField(term13699, term13699.getClass(), "sourcePosition", 0);
        setField(term13699, term13699.getClass(), "jsType", null);
        setField(term13699, term13699.getClass(), "parent", null);
        setField(term13698, term13698.getClass(), "next", term13699);
        setIntField(term13703, term13703.getClass(), "type", 0);
        setField(term13703, term13703.getClass(), "next", null);
        setField(term13703, term13703.getClass(), "first", null);
        setField(term13703, term13703.getClass(), "last", null);
        setField(term13703, term13703.getClass(), "propListHead", null);
        setIntField(term13703, term13703.getClass(), "sourcePosition", 0);
        setField(term13703, term13703.getClass(), "jsType", null);
        setField(term13703, term13703.getClass(), "parent", null);
        setField(term13698, term13698.getClass(), "first", term13703);
        setIntField(term13704, term13704.getClass(), "type", 0);
        setField(term13704, term13704.getClass(), "next", null);
        setField(term13704, term13704.getClass(), "first", null);
        setField(term13704, term13704.getClass(), "last", null);
        setField(term13704, term13704.getClass(), "propListHead", null);
        setIntField(term13704, term13704.getClass(), "sourcePosition", 0);
        setField(term13704, term13704.getClass(), "jsType", null);
        setField(term13704, term13704.getClass(), "parent", null);
        setField(term13698, term13698.getClass(), "last", term13704);
        setField(term13698, term13698.getClass(), "propListHead", null);
        setIntField(term13698, term13698.getClass(), "sourcePosition", 0);
        setField(term13698, term13698.getClass(), "jsType", null);
        setField(term13698, term13698.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1750;
        Object retValue = callMethod(klass, "isCallOrNew", argTypes, null, args);
        assertTrue(recursiveEquals(term1750, term13698));
        assertTrue(recursiveEquals(retValue, false));
    }

};


