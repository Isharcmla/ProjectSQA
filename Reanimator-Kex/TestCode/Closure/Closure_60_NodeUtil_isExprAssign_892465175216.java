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

public class NodeUtil_isExprAssign_892465175216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1225;
     Object term11166;

    public NodeUtil_isExprAssign_892465175216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1225, term1225.getClass(), "type", 1237549886);
        setIntField(term1227, term1227.getClass(), "type", -1556527718);
        setIntField(term1229, term1229.getClass(), "type", 0);
        setField(term1229, term1229.getClass(), "next", null);
        setField(term1229, term1229.getClass(), "first", null);
        setField(term1229, term1229.getClass(), "last", null);
        setField(term1229, term1229.getClass(), "propListHead", null);
        setIntField(term1229, term1229.getClass(), "sourcePosition", 0);
        setField(term1229, term1229.getClass(), "jsType", null);
        setField(term1229, term1229.getClass(), "parent", null);
        setField(term1227, term1227.getClass(), "next", term1229);
        setIntField(term1232, term1232.getClass(), "type", 0);
        setField(term1232, term1232.getClass(), "next", null);
        setField(term1232, term1232.getClass(), "first", null);
        setField(term1232, term1232.getClass(), "last", null);
        setField(term1232, term1232.getClass(), "propListHead", null);
        setIntField(term1232, term1232.getClass(), "sourcePosition", 0);
        setField(term1232, term1232.getClass(), "jsType", null);
        setField(term1232, term1232.getClass(), "parent", null);
        setField(term1227, term1227.getClass(), "first", term1232);
        setIntField(term1235, term1235.getClass(), "type", 0);
        setField(term1235, term1235.getClass(), "next", null);
        setField(term1235, term1235.getClass(), "first", null);
        setField(term1235, term1235.getClass(), "last", null);
        setField(term1235, term1235.getClass(), "propListHead", null);
        setIntField(term1235, term1235.getClass(), "sourcePosition", 0);
        setField(term1235, term1235.getClass(), "jsType", null);
        setField(term1235, term1235.getClass(), "parent", null);
        setField(term1227, term1227.getClass(), "last", term1235);
        setField(term1227, term1227.getClass(), "propListHead", null);
        setIntField(term1227, term1227.getClass(), "sourcePosition", 0);
        setField(term1227, term1227.getClass(), "jsType", null);
        setField(term1227, term1227.getClass(), "parent", null);
        setField(term1225, term1225.getClass(), "next", term1227);
        setIntField(term1239, term1239.getClass(), "type", 0);
        setField(term1239, term1239.getClass(), "next", null);
        setField(term1239, term1239.getClass(), "first", null);
        setField(term1239, term1239.getClass(), "last", null);
        setField(term1239, term1239.getClass(), "propListHead", null);
        setIntField(term1239, term1239.getClass(), "sourcePosition", 0);
        setField(term1239, term1239.getClass(), "jsType", null);
        setField(term1239, term1239.getClass(), "parent", null);
        setField(term1225, term1225.getClass(), "first", term1239);
        setIntField(term1242, term1242.getClass(), "type", 0);
        setField(term1242, term1242.getClass(), "next", null);
        setField(term1242, term1242.getClass(), "first", null);
        setField(term1242, term1242.getClass(), "last", null);
        setField(term1242, term1242.getClass(), "propListHead", null);
        setIntField(term1242, term1242.getClass(), "sourcePosition", 0);
        setField(term1242, term1242.getClass(), "jsType", null);
        setField(term1242, term1242.getClass(), "parent", null);
        setField(term1225, term1225.getClass(), "last", term1242);
        setField(term1225, term1225.getClass(), "propListHead", null);
        setIntField(term1225, term1225.getClass(), "sourcePosition", 0);
        setField(term1225, term1225.getClass(), "jsType", null);
        setField(term1225, term1225.getClass(), "parent", null);
        term11166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11166, term11166.getClass(), "type", 1237549886);
        setIntField(term11167, term11167.getClass(), "type", -1556527718);
        setIntField(term11168, term11168.getClass(), "type", 0);
        setField(term11168, term11168.getClass(), "next", null);
        setField(term11168, term11168.getClass(), "first", null);
        setField(term11168, term11168.getClass(), "last", null);
        setField(term11168, term11168.getClass(), "propListHead", null);
        setIntField(term11168, term11168.getClass(), "sourcePosition", 0);
        setField(term11168, term11168.getClass(), "jsType", null);
        setField(term11168, term11168.getClass(), "parent", null);
        setField(term11167, term11167.getClass(), "next", term11168);
        setIntField(term11169, term11169.getClass(), "type", 0);
        setField(term11169, term11169.getClass(), "next", null);
        setField(term11169, term11169.getClass(), "first", null);
        setField(term11169, term11169.getClass(), "last", null);
        setField(term11169, term11169.getClass(), "propListHead", null);
        setIntField(term11169, term11169.getClass(), "sourcePosition", 0);
        setField(term11169, term11169.getClass(), "jsType", null);
        setField(term11169, term11169.getClass(), "parent", null);
        setField(term11167, term11167.getClass(), "first", term11169);
        setIntField(term11170, term11170.getClass(), "type", 0);
        setField(term11170, term11170.getClass(), "next", null);
        setField(term11170, term11170.getClass(), "first", null);
        setField(term11170, term11170.getClass(), "last", null);
        setField(term11170, term11170.getClass(), "propListHead", null);
        setIntField(term11170, term11170.getClass(), "sourcePosition", 0);
        setField(term11170, term11170.getClass(), "jsType", null);
        setField(term11170, term11170.getClass(), "parent", null);
        setField(term11167, term11167.getClass(), "last", term11170);
        setField(term11167, term11167.getClass(), "propListHead", null);
        setIntField(term11167, term11167.getClass(), "sourcePosition", 0);
        setField(term11167, term11167.getClass(), "jsType", null);
        setField(term11167, term11167.getClass(), "parent", null);
        setField(term11166, term11166.getClass(), "next", term11167);
        setIntField(term11171, term11171.getClass(), "type", 0);
        setField(term11171, term11171.getClass(), "next", null);
        setField(term11171, term11171.getClass(), "first", null);
        setField(term11171, term11171.getClass(), "last", null);
        setField(term11171, term11171.getClass(), "propListHead", null);
        setIntField(term11171, term11171.getClass(), "sourcePosition", 0);
        setField(term11171, term11171.getClass(), "jsType", null);
        setField(term11171, term11171.getClass(), "parent", null);
        setField(term11166, term11166.getClass(), "first", term11171);
        setIntField(term11172, term11172.getClass(), "type", 0);
        setField(term11172, term11172.getClass(), "next", null);
        setField(term11172, term11172.getClass(), "first", null);
        setField(term11172, term11172.getClass(), "last", null);
        setField(term11172, term11172.getClass(), "propListHead", null);
        setIntField(term11172, term11172.getClass(), "sourcePosition", 0);
        setField(term11172, term11172.getClass(), "jsType", null);
        setField(term11172, term11172.getClass(), "parent", null);
        setField(term11166, term11166.getClass(), "last", term11172);
        setField(term11166, term11166.getClass(), "propListHead", null);
        setIntField(term11166, term11166.getClass(), "sourcePosition", 0);
        setField(term11166, term11166.getClass(), "jsType", null);
        setField(term11166, term11166.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1225;
        Object retValue = callMethod(klass, "isExprAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term1225, term11166));
        assertTrue(recursiveEquals(retValue, false));
    }

};


