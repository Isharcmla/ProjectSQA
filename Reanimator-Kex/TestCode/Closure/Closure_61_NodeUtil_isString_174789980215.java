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

public class NodeUtil_isString_174789980215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1204;
     Object term11134;

    public NodeUtil_isString_174789980215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1204, term1204.getClass(), "type", 514511037);
        setIntField(term1206, term1206.getClass(), "type", -26316536);
        setIntField(term1208, term1208.getClass(), "type", 0);
        setField(term1208, term1208.getClass(), "next", null);
        setField(term1208, term1208.getClass(), "first", null);
        setField(term1208, term1208.getClass(), "last", null);
        setField(term1208, term1208.getClass(), "propListHead", null);
        setIntField(term1208, term1208.getClass(), "sourcePosition", 0);
        setField(term1208, term1208.getClass(), "jsType", null);
        setField(term1208, term1208.getClass(), "parent", null);
        setField(term1206, term1206.getClass(), "next", term1208);
        setIntField(term1211, term1211.getClass(), "type", 0);
        setField(term1211, term1211.getClass(), "next", null);
        setField(term1211, term1211.getClass(), "first", null);
        setField(term1211, term1211.getClass(), "last", null);
        setField(term1211, term1211.getClass(), "propListHead", null);
        setIntField(term1211, term1211.getClass(), "sourcePosition", 0);
        setField(term1211, term1211.getClass(), "jsType", null);
        setField(term1211, term1211.getClass(), "parent", null);
        setField(term1206, term1206.getClass(), "first", term1211);
        setIntField(term1214, term1214.getClass(), "type", 0);
        setField(term1214, term1214.getClass(), "next", null);
        setField(term1214, term1214.getClass(), "first", null);
        setField(term1214, term1214.getClass(), "last", null);
        setField(term1214, term1214.getClass(), "propListHead", null);
        setIntField(term1214, term1214.getClass(), "sourcePosition", 0);
        setField(term1214, term1214.getClass(), "jsType", null);
        setField(term1214, term1214.getClass(), "parent", null);
        setField(term1206, term1206.getClass(), "last", term1214);
        setField(term1206, term1206.getClass(), "propListHead", null);
        setIntField(term1206, term1206.getClass(), "sourcePosition", 0);
        setField(term1206, term1206.getClass(), "jsType", null);
        setField(term1206, term1206.getClass(), "parent", null);
        setField(term1204, term1204.getClass(), "next", term1206);
        setIntField(term1218, term1218.getClass(), "type", 0);
        setField(term1218, term1218.getClass(), "next", null);
        setField(term1218, term1218.getClass(), "first", null);
        setField(term1218, term1218.getClass(), "last", null);
        setField(term1218, term1218.getClass(), "propListHead", null);
        setIntField(term1218, term1218.getClass(), "sourcePosition", 0);
        setField(term1218, term1218.getClass(), "jsType", null);
        setField(term1218, term1218.getClass(), "parent", null);
        setField(term1204, term1204.getClass(), "first", term1218);
        setIntField(term1221, term1221.getClass(), "type", 0);
        setField(term1221, term1221.getClass(), "next", null);
        setField(term1221, term1221.getClass(), "first", null);
        setField(term1221, term1221.getClass(), "last", null);
        setField(term1221, term1221.getClass(), "propListHead", null);
        setIntField(term1221, term1221.getClass(), "sourcePosition", 0);
        setField(term1221, term1221.getClass(), "jsType", null);
        setField(term1221, term1221.getClass(), "parent", null);
        setField(term1204, term1204.getClass(), "last", term1221);
        setField(term1204, term1204.getClass(), "propListHead", null);
        setIntField(term1204, term1204.getClass(), "sourcePosition", 0);
        setField(term1204, term1204.getClass(), "jsType", null);
        setField(term1204, term1204.getClass(), "parent", null);
        term11134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11134, term11134.getClass(), "type", 514511037);
        setIntField(term11135, term11135.getClass(), "type", -26316536);
        setIntField(term11136, term11136.getClass(), "type", 0);
        setField(term11136, term11136.getClass(), "next", null);
        setField(term11136, term11136.getClass(), "first", null);
        setField(term11136, term11136.getClass(), "last", null);
        setField(term11136, term11136.getClass(), "propListHead", null);
        setIntField(term11136, term11136.getClass(), "sourcePosition", 0);
        setField(term11136, term11136.getClass(), "jsType", null);
        setField(term11136, term11136.getClass(), "parent", null);
        setField(term11135, term11135.getClass(), "next", term11136);
        setIntField(term11137, term11137.getClass(), "type", 0);
        setField(term11137, term11137.getClass(), "next", null);
        setField(term11137, term11137.getClass(), "first", null);
        setField(term11137, term11137.getClass(), "last", null);
        setField(term11137, term11137.getClass(), "propListHead", null);
        setIntField(term11137, term11137.getClass(), "sourcePosition", 0);
        setField(term11137, term11137.getClass(), "jsType", null);
        setField(term11137, term11137.getClass(), "parent", null);
        setField(term11135, term11135.getClass(), "first", term11137);
        setIntField(term11138, term11138.getClass(), "type", 0);
        setField(term11138, term11138.getClass(), "next", null);
        setField(term11138, term11138.getClass(), "first", null);
        setField(term11138, term11138.getClass(), "last", null);
        setField(term11138, term11138.getClass(), "propListHead", null);
        setIntField(term11138, term11138.getClass(), "sourcePosition", 0);
        setField(term11138, term11138.getClass(), "jsType", null);
        setField(term11138, term11138.getClass(), "parent", null);
        setField(term11135, term11135.getClass(), "last", term11138);
        setField(term11135, term11135.getClass(), "propListHead", null);
        setIntField(term11135, term11135.getClass(), "sourcePosition", 0);
        setField(term11135, term11135.getClass(), "jsType", null);
        setField(term11135, term11135.getClass(), "parent", null);
        setField(term11134, term11134.getClass(), "next", term11135);
        setIntField(term11139, term11139.getClass(), "type", 0);
        setField(term11139, term11139.getClass(), "next", null);
        setField(term11139, term11139.getClass(), "first", null);
        setField(term11139, term11139.getClass(), "last", null);
        setField(term11139, term11139.getClass(), "propListHead", null);
        setIntField(term11139, term11139.getClass(), "sourcePosition", 0);
        setField(term11139, term11139.getClass(), "jsType", null);
        setField(term11139, term11139.getClass(), "parent", null);
        setField(term11134, term11134.getClass(), "first", term11139);
        setIntField(term11140, term11140.getClass(), "type", 0);
        setField(term11140, term11140.getClass(), "next", null);
        setField(term11140, term11140.getClass(), "first", null);
        setField(term11140, term11140.getClass(), "last", null);
        setField(term11140, term11140.getClass(), "propListHead", null);
        setIntField(term11140, term11140.getClass(), "sourcePosition", 0);
        setField(term11140, term11140.getClass(), "jsType", null);
        setField(term11140, term11140.getClass(), "parent", null);
        setField(term11134, term11134.getClass(), "last", term11140);
        setField(term11134, term11134.getClass(), "propListHead", null);
        setIntField(term11134, term11134.getClass(), "sourcePosition", 0);
        setField(term11134, term11134.getClass(), "jsType", null);
        setField(term11134, term11134.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1204;
        Object retValue = callMethod(klass, "isString", argTypes, null, args);
        assertTrue(recursiveEquals(term1204, term11134));
        assertTrue(recursiveEquals(retValue, false));
    }

};


