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

public class NodeUtil_isAssign_1955286018217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246;
     Object term11198;

    public NodeUtil_isAssign_1955286018217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1246, term1246.getClass(), "type", -1220630391);
        setIntField(term1248, term1248.getClass(), "type", 40571662);
        setIntField(term1250, term1250.getClass(), "type", 0);
        setField(term1250, term1250.getClass(), "next", null);
        setField(term1250, term1250.getClass(), "first", null);
        setField(term1250, term1250.getClass(), "last", null);
        setField(term1250, term1250.getClass(), "propListHead", null);
        setIntField(term1250, term1250.getClass(), "sourcePosition", 0);
        setField(term1250, term1250.getClass(), "jsType", null);
        setField(term1250, term1250.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "next", term1250);
        setIntField(term1253, term1253.getClass(), "type", 0);
        setField(term1253, term1253.getClass(), "next", null);
        setField(term1253, term1253.getClass(), "first", null);
        setField(term1253, term1253.getClass(), "last", null);
        setField(term1253, term1253.getClass(), "propListHead", null);
        setIntField(term1253, term1253.getClass(), "sourcePosition", 0);
        setField(term1253, term1253.getClass(), "jsType", null);
        setField(term1253, term1253.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "first", term1253);
        setIntField(term1256, term1256.getClass(), "type", 0);
        setField(term1256, term1256.getClass(), "next", null);
        setField(term1256, term1256.getClass(), "first", null);
        setField(term1256, term1256.getClass(), "last", null);
        setField(term1256, term1256.getClass(), "propListHead", null);
        setIntField(term1256, term1256.getClass(), "sourcePosition", 0);
        setField(term1256, term1256.getClass(), "jsType", null);
        setField(term1256, term1256.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "last", term1256);
        setField(term1248, term1248.getClass(), "propListHead", null);
        setIntField(term1248, term1248.getClass(), "sourcePosition", 0);
        setField(term1248, term1248.getClass(), "jsType", null);
        setField(term1248, term1248.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "next", term1248);
        setIntField(term1260, term1260.getClass(), "type", 0);
        setField(term1260, term1260.getClass(), "next", null);
        setField(term1260, term1260.getClass(), "first", null);
        setField(term1260, term1260.getClass(), "last", null);
        setField(term1260, term1260.getClass(), "propListHead", null);
        setIntField(term1260, term1260.getClass(), "sourcePosition", 0);
        setField(term1260, term1260.getClass(), "jsType", null);
        setField(term1260, term1260.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "first", term1260);
        setIntField(term1263, term1263.getClass(), "type", 0);
        setField(term1263, term1263.getClass(), "next", null);
        setField(term1263, term1263.getClass(), "first", null);
        setField(term1263, term1263.getClass(), "last", null);
        setField(term1263, term1263.getClass(), "propListHead", null);
        setIntField(term1263, term1263.getClass(), "sourcePosition", 0);
        setField(term1263, term1263.getClass(), "jsType", null);
        setField(term1263, term1263.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "last", term1263);
        setField(term1246, term1246.getClass(), "propListHead", null);
        setIntField(term1246, term1246.getClass(), "sourcePosition", 0);
        setField(term1246, term1246.getClass(), "jsType", null);
        setField(term1246, term1246.getClass(), "parent", null);
        term11198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11198, term11198.getClass(), "type", -1220630391);
        setIntField(term11199, term11199.getClass(), "type", 40571662);
        setIntField(term11200, term11200.getClass(), "type", 0);
        setField(term11200, term11200.getClass(), "next", null);
        setField(term11200, term11200.getClass(), "first", null);
        setField(term11200, term11200.getClass(), "last", null);
        setField(term11200, term11200.getClass(), "propListHead", null);
        setIntField(term11200, term11200.getClass(), "sourcePosition", 0);
        setField(term11200, term11200.getClass(), "jsType", null);
        setField(term11200, term11200.getClass(), "parent", null);
        setField(term11199, term11199.getClass(), "next", term11200);
        setIntField(term11201, term11201.getClass(), "type", 0);
        setField(term11201, term11201.getClass(), "next", null);
        setField(term11201, term11201.getClass(), "first", null);
        setField(term11201, term11201.getClass(), "last", null);
        setField(term11201, term11201.getClass(), "propListHead", null);
        setIntField(term11201, term11201.getClass(), "sourcePosition", 0);
        setField(term11201, term11201.getClass(), "jsType", null);
        setField(term11201, term11201.getClass(), "parent", null);
        setField(term11199, term11199.getClass(), "first", term11201);
        setIntField(term11202, term11202.getClass(), "type", 0);
        setField(term11202, term11202.getClass(), "next", null);
        setField(term11202, term11202.getClass(), "first", null);
        setField(term11202, term11202.getClass(), "last", null);
        setField(term11202, term11202.getClass(), "propListHead", null);
        setIntField(term11202, term11202.getClass(), "sourcePosition", 0);
        setField(term11202, term11202.getClass(), "jsType", null);
        setField(term11202, term11202.getClass(), "parent", null);
        setField(term11199, term11199.getClass(), "last", term11202);
        setField(term11199, term11199.getClass(), "propListHead", null);
        setIntField(term11199, term11199.getClass(), "sourcePosition", 0);
        setField(term11199, term11199.getClass(), "jsType", null);
        setField(term11199, term11199.getClass(), "parent", null);
        setField(term11198, term11198.getClass(), "next", term11199);
        setIntField(term11203, term11203.getClass(), "type", 0);
        setField(term11203, term11203.getClass(), "next", null);
        setField(term11203, term11203.getClass(), "first", null);
        setField(term11203, term11203.getClass(), "last", null);
        setField(term11203, term11203.getClass(), "propListHead", null);
        setIntField(term11203, term11203.getClass(), "sourcePosition", 0);
        setField(term11203, term11203.getClass(), "jsType", null);
        setField(term11203, term11203.getClass(), "parent", null);
        setField(term11198, term11198.getClass(), "first", term11203);
        setIntField(term11204, term11204.getClass(), "type", 0);
        setField(term11204, term11204.getClass(), "next", null);
        setField(term11204, term11204.getClass(), "first", null);
        setField(term11204, term11204.getClass(), "last", null);
        setField(term11204, term11204.getClass(), "propListHead", null);
        setIntField(term11204, term11204.getClass(), "sourcePosition", 0);
        setField(term11204, term11204.getClass(), "jsType", null);
        setField(term11204, term11204.getClass(), "parent", null);
        setField(term11198, term11198.getClass(), "last", term11204);
        setField(term11198, term11198.getClass(), "propListHead", null);
        setIntField(term11198, term11198.getClass(), "sourcePosition", 0);
        setField(term11198, term11198.getClass(), "jsType", null);
        setField(term11198, term11198.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1246;
        Object retValue = callMethod(klass, "isAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term1246, term11198));
        assertTrue(recursiveEquals(retValue, false));
    }

};


