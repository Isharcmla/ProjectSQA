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

public class NodeUtil_isExprCall_1790929530218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1267;
     Object term11230;

    public NodeUtil_isExprCall_1790929530218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1267, term1267.getClass(), "type", 797203987);
        setIntField(term1269, term1269.getClass(), "type", 1406617209);
        setIntField(term1271, term1271.getClass(), "type", 0);
        setField(term1271, term1271.getClass(), "next", null);
        setField(term1271, term1271.getClass(), "first", null);
        setField(term1271, term1271.getClass(), "last", null);
        setField(term1271, term1271.getClass(), "propListHead", null);
        setIntField(term1271, term1271.getClass(), "sourcePosition", 0);
        setField(term1271, term1271.getClass(), "jsType", null);
        setField(term1271, term1271.getClass(), "parent", null);
        setField(term1269, term1269.getClass(), "next", term1271);
        setIntField(term1274, term1274.getClass(), "type", 0);
        setField(term1274, term1274.getClass(), "next", null);
        setField(term1274, term1274.getClass(), "first", null);
        setField(term1274, term1274.getClass(), "last", null);
        setField(term1274, term1274.getClass(), "propListHead", null);
        setIntField(term1274, term1274.getClass(), "sourcePosition", 0);
        setField(term1274, term1274.getClass(), "jsType", null);
        setField(term1274, term1274.getClass(), "parent", null);
        setField(term1269, term1269.getClass(), "first", term1274);
        setIntField(term1277, term1277.getClass(), "type", 0);
        setField(term1277, term1277.getClass(), "next", null);
        setField(term1277, term1277.getClass(), "first", null);
        setField(term1277, term1277.getClass(), "last", null);
        setField(term1277, term1277.getClass(), "propListHead", null);
        setIntField(term1277, term1277.getClass(), "sourcePosition", 0);
        setField(term1277, term1277.getClass(), "jsType", null);
        setField(term1277, term1277.getClass(), "parent", null);
        setField(term1269, term1269.getClass(), "last", term1277);
        setField(term1269, term1269.getClass(), "propListHead", null);
        setIntField(term1269, term1269.getClass(), "sourcePosition", 0);
        setField(term1269, term1269.getClass(), "jsType", null);
        setField(term1269, term1269.getClass(), "parent", null);
        setField(term1267, term1267.getClass(), "next", term1269);
        setIntField(term1281, term1281.getClass(), "type", 0);
        setField(term1281, term1281.getClass(), "next", null);
        setField(term1281, term1281.getClass(), "first", null);
        setField(term1281, term1281.getClass(), "last", null);
        setField(term1281, term1281.getClass(), "propListHead", null);
        setIntField(term1281, term1281.getClass(), "sourcePosition", 0);
        setField(term1281, term1281.getClass(), "jsType", null);
        setField(term1281, term1281.getClass(), "parent", null);
        setField(term1267, term1267.getClass(), "first", term1281);
        setIntField(term1284, term1284.getClass(), "type", 0);
        setField(term1284, term1284.getClass(), "next", null);
        setField(term1284, term1284.getClass(), "first", null);
        setField(term1284, term1284.getClass(), "last", null);
        setField(term1284, term1284.getClass(), "propListHead", null);
        setIntField(term1284, term1284.getClass(), "sourcePosition", 0);
        setField(term1284, term1284.getClass(), "jsType", null);
        setField(term1284, term1284.getClass(), "parent", null);
        setField(term1267, term1267.getClass(), "last", term1284);
        setField(term1267, term1267.getClass(), "propListHead", null);
        setIntField(term1267, term1267.getClass(), "sourcePosition", 0);
        setField(term1267, term1267.getClass(), "jsType", null);
        setField(term1267, term1267.getClass(), "parent", null);
        term11230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11230, term11230.getClass(), "type", 797203987);
        setIntField(term11231, term11231.getClass(), "type", 1406617209);
        setIntField(term11232, term11232.getClass(), "type", 0);
        setField(term11232, term11232.getClass(), "next", null);
        setField(term11232, term11232.getClass(), "first", null);
        setField(term11232, term11232.getClass(), "last", null);
        setField(term11232, term11232.getClass(), "propListHead", null);
        setIntField(term11232, term11232.getClass(), "sourcePosition", 0);
        setField(term11232, term11232.getClass(), "jsType", null);
        setField(term11232, term11232.getClass(), "parent", null);
        setField(term11231, term11231.getClass(), "next", term11232);
        setIntField(term11233, term11233.getClass(), "type", 0);
        setField(term11233, term11233.getClass(), "next", null);
        setField(term11233, term11233.getClass(), "first", null);
        setField(term11233, term11233.getClass(), "last", null);
        setField(term11233, term11233.getClass(), "propListHead", null);
        setIntField(term11233, term11233.getClass(), "sourcePosition", 0);
        setField(term11233, term11233.getClass(), "jsType", null);
        setField(term11233, term11233.getClass(), "parent", null);
        setField(term11231, term11231.getClass(), "first", term11233);
        setIntField(term11234, term11234.getClass(), "type", 0);
        setField(term11234, term11234.getClass(), "next", null);
        setField(term11234, term11234.getClass(), "first", null);
        setField(term11234, term11234.getClass(), "last", null);
        setField(term11234, term11234.getClass(), "propListHead", null);
        setIntField(term11234, term11234.getClass(), "sourcePosition", 0);
        setField(term11234, term11234.getClass(), "jsType", null);
        setField(term11234, term11234.getClass(), "parent", null);
        setField(term11231, term11231.getClass(), "last", term11234);
        setField(term11231, term11231.getClass(), "propListHead", null);
        setIntField(term11231, term11231.getClass(), "sourcePosition", 0);
        setField(term11231, term11231.getClass(), "jsType", null);
        setField(term11231, term11231.getClass(), "parent", null);
        setField(term11230, term11230.getClass(), "next", term11231);
        setIntField(term11235, term11235.getClass(), "type", 0);
        setField(term11235, term11235.getClass(), "next", null);
        setField(term11235, term11235.getClass(), "first", null);
        setField(term11235, term11235.getClass(), "last", null);
        setField(term11235, term11235.getClass(), "propListHead", null);
        setIntField(term11235, term11235.getClass(), "sourcePosition", 0);
        setField(term11235, term11235.getClass(), "jsType", null);
        setField(term11235, term11235.getClass(), "parent", null);
        setField(term11230, term11230.getClass(), "first", term11235);
        setIntField(term11236, term11236.getClass(), "type", 0);
        setField(term11236, term11236.getClass(), "next", null);
        setField(term11236, term11236.getClass(), "first", null);
        setField(term11236, term11236.getClass(), "last", null);
        setField(term11236, term11236.getClass(), "propListHead", null);
        setIntField(term11236, term11236.getClass(), "sourcePosition", 0);
        setField(term11236, term11236.getClass(), "jsType", null);
        setField(term11236, term11236.getClass(), "parent", null);
        setField(term11230, term11230.getClass(), "last", term11236);
        setField(term11230, term11230.getClass(), "propListHead", null);
        setIntField(term11230, term11230.getClass(), "sourcePosition", 0);
        setField(term11230, term11230.getClass(), "jsType", null);
        setField(term11230, term11230.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1267;
        Object retValue = callMethod(klass, "isExprCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1267, term11230));
        assertTrue(recursiveEquals(retValue, false));
    }

};


