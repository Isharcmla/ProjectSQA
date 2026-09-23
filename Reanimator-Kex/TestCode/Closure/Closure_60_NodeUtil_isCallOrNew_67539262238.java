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
     Object term14166;

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
        term14166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14166, term14166.getClass(), "type", -1112119058);
        setIntField(term14167, term14167.getClass(), "type", -98060427);
        setIntField(term14168, term14168.getClass(), "type", 0);
        setField(term14168, term14168.getClass(), "next", null);
        setField(term14168, term14168.getClass(), "first", null);
        setField(term14168, term14168.getClass(), "last", null);
        setField(term14168, term14168.getClass(), "propListHead", null);
        setIntField(term14168, term14168.getClass(), "sourcePosition", 0);
        setField(term14168, term14168.getClass(), "jsType", null);
        setField(term14168, term14168.getClass(), "parent", null);
        setField(term14167, term14167.getClass(), "next", term14168);
        setIntField(term14169, term14169.getClass(), "type", 0);
        setField(term14169, term14169.getClass(), "next", null);
        setField(term14169, term14169.getClass(), "first", null);
        setField(term14169, term14169.getClass(), "last", null);
        setField(term14169, term14169.getClass(), "propListHead", null);
        setIntField(term14169, term14169.getClass(), "sourcePosition", 0);
        setField(term14169, term14169.getClass(), "jsType", null);
        setField(term14169, term14169.getClass(), "parent", null);
        setField(term14167, term14167.getClass(), "first", term14169);
        setIntField(term14170, term14170.getClass(), "type", 0);
        setField(term14170, term14170.getClass(), "next", null);
        setField(term14170, term14170.getClass(), "first", null);
        setField(term14170, term14170.getClass(), "last", null);
        setField(term14170, term14170.getClass(), "propListHead", null);
        setIntField(term14170, term14170.getClass(), "sourcePosition", 0);
        setField(term14170, term14170.getClass(), "jsType", null);
        setField(term14170, term14170.getClass(), "parent", null);
        setField(term14167, term14167.getClass(), "last", term14170);
        setField(term14167, term14167.getClass(), "propListHead", null);
        setIntField(term14167, term14167.getClass(), "sourcePosition", 0);
        setField(term14167, term14167.getClass(), "jsType", null);
        setField(term14167, term14167.getClass(), "parent", null);
        setField(term14166, term14166.getClass(), "next", term14167);
        setIntField(term14171, term14171.getClass(), "type", 0);
        setField(term14171, term14171.getClass(), "next", null);
        setField(term14171, term14171.getClass(), "first", null);
        setField(term14171, term14171.getClass(), "last", null);
        setField(term14171, term14171.getClass(), "propListHead", null);
        setIntField(term14171, term14171.getClass(), "sourcePosition", 0);
        setField(term14171, term14171.getClass(), "jsType", null);
        setField(term14171, term14171.getClass(), "parent", null);
        setField(term14166, term14166.getClass(), "first", term14171);
        setIntField(term14172, term14172.getClass(), "type", 0);
        setField(term14172, term14172.getClass(), "next", null);
        setField(term14172, term14172.getClass(), "first", null);
        setField(term14172, term14172.getClass(), "last", null);
        setField(term14172, term14172.getClass(), "propListHead", null);
        setIntField(term14172, term14172.getClass(), "sourcePosition", 0);
        setField(term14172, term14172.getClass(), "jsType", null);
        setField(term14172, term14172.getClass(), "parent", null);
        setField(term14166, term14166.getClass(), "last", term14172);
        setField(term14166, term14166.getClass(), "propListHead", null);
        setIntField(term14166, term14166.getClass(), "sourcePosition", 0);
        setField(term14166, term14166.getClass(), "jsType", null);
        setField(term14166, term14166.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1750;
        Object retValue = callMethod(klass, "isCallOrNew", argTypes, null, args);
        assertTrue(recursiveEquals(term1750, term14166));
        assertTrue(recursiveEquals(retValue, false));
    }

};


