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

public class NodeUtil_getLoopCodeBlock_1295091610221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1330;
     Object term11323;

    public NodeUtil_getLoopCodeBlock_1295091610221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1330, term1330.getClass(), "type", -1674430871);
        setIntField(term1332, term1332.getClass(), "type", 1862191391);
        setIntField(term1334, term1334.getClass(), "type", 0);
        setField(term1334, term1334.getClass(), "next", null);
        setField(term1334, term1334.getClass(), "first", null);
        setField(term1334, term1334.getClass(), "last", null);
        setField(term1334, term1334.getClass(), "propListHead", null);
        setIntField(term1334, term1334.getClass(), "sourcePosition", 0);
        setField(term1334, term1334.getClass(), "jsType", null);
        setField(term1334, term1334.getClass(), "parent", null);
        setField(term1332, term1332.getClass(), "next", term1334);
        setIntField(term1337, term1337.getClass(), "type", 0);
        setField(term1337, term1337.getClass(), "next", null);
        setField(term1337, term1337.getClass(), "first", null);
        setField(term1337, term1337.getClass(), "last", null);
        setField(term1337, term1337.getClass(), "propListHead", null);
        setIntField(term1337, term1337.getClass(), "sourcePosition", 0);
        setField(term1337, term1337.getClass(), "jsType", null);
        setField(term1337, term1337.getClass(), "parent", null);
        setField(term1332, term1332.getClass(), "first", term1337);
        setIntField(term1340, term1340.getClass(), "type", 0);
        setField(term1340, term1340.getClass(), "next", null);
        setField(term1340, term1340.getClass(), "first", null);
        setField(term1340, term1340.getClass(), "last", null);
        setField(term1340, term1340.getClass(), "propListHead", null);
        setIntField(term1340, term1340.getClass(), "sourcePosition", 0);
        setField(term1340, term1340.getClass(), "jsType", null);
        setField(term1340, term1340.getClass(), "parent", null);
        setField(term1332, term1332.getClass(), "last", term1340);
        setField(term1332, term1332.getClass(), "propListHead", null);
        setIntField(term1332, term1332.getClass(), "sourcePosition", 0);
        setField(term1332, term1332.getClass(), "jsType", null);
        setField(term1332, term1332.getClass(), "parent", null);
        setField(term1330, term1330.getClass(), "next", term1332);
        setIntField(term1344, term1344.getClass(), "type", 0);
        setField(term1344, term1344.getClass(), "next", null);
        setField(term1344, term1344.getClass(), "first", null);
        setField(term1344, term1344.getClass(), "last", null);
        setField(term1344, term1344.getClass(), "propListHead", null);
        setIntField(term1344, term1344.getClass(), "sourcePosition", 0);
        setField(term1344, term1344.getClass(), "jsType", null);
        setField(term1344, term1344.getClass(), "parent", null);
        setField(term1330, term1330.getClass(), "first", term1344);
        setIntField(term1347, term1347.getClass(), "type", 0);
        setField(term1347, term1347.getClass(), "next", null);
        setField(term1347, term1347.getClass(), "first", null);
        setField(term1347, term1347.getClass(), "last", null);
        setField(term1347, term1347.getClass(), "propListHead", null);
        setIntField(term1347, term1347.getClass(), "sourcePosition", 0);
        setField(term1347, term1347.getClass(), "jsType", null);
        setField(term1347, term1347.getClass(), "parent", null);
        setField(term1330, term1330.getClass(), "last", term1347);
        setField(term1330, term1330.getClass(), "propListHead", null);
        setIntField(term1330, term1330.getClass(), "sourcePosition", 0);
        setField(term1330, term1330.getClass(), "jsType", null);
        setField(term1330, term1330.getClass(), "parent", null);
        term11323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11323, term11323.getClass(), "type", -1674430871);
        setIntField(term11324, term11324.getClass(), "type", 1862191391);
        setIntField(term11325, term11325.getClass(), "type", 0);
        setField(term11325, term11325.getClass(), "next", null);
        setField(term11325, term11325.getClass(), "first", null);
        setField(term11325, term11325.getClass(), "last", null);
        setField(term11325, term11325.getClass(), "propListHead", null);
        setIntField(term11325, term11325.getClass(), "sourcePosition", 0);
        setField(term11325, term11325.getClass(), "jsType", null);
        setField(term11325, term11325.getClass(), "parent", null);
        setField(term11324, term11324.getClass(), "next", term11325);
        setIntField(term11326, term11326.getClass(), "type", 0);
        setField(term11326, term11326.getClass(), "next", null);
        setField(term11326, term11326.getClass(), "first", null);
        setField(term11326, term11326.getClass(), "last", null);
        setField(term11326, term11326.getClass(), "propListHead", null);
        setIntField(term11326, term11326.getClass(), "sourcePosition", 0);
        setField(term11326, term11326.getClass(), "jsType", null);
        setField(term11326, term11326.getClass(), "parent", null);
        setField(term11324, term11324.getClass(), "first", term11326);
        setIntField(term11327, term11327.getClass(), "type", 0);
        setField(term11327, term11327.getClass(), "next", null);
        setField(term11327, term11327.getClass(), "first", null);
        setField(term11327, term11327.getClass(), "last", null);
        setField(term11327, term11327.getClass(), "propListHead", null);
        setIntField(term11327, term11327.getClass(), "sourcePosition", 0);
        setField(term11327, term11327.getClass(), "jsType", null);
        setField(term11327, term11327.getClass(), "parent", null);
        setField(term11324, term11324.getClass(), "last", term11327);
        setField(term11324, term11324.getClass(), "propListHead", null);
        setIntField(term11324, term11324.getClass(), "sourcePosition", 0);
        setField(term11324, term11324.getClass(), "jsType", null);
        setField(term11324, term11324.getClass(), "parent", null);
        setField(term11323, term11323.getClass(), "next", term11324);
        setIntField(term11328, term11328.getClass(), "type", 0);
        setField(term11328, term11328.getClass(), "next", null);
        setField(term11328, term11328.getClass(), "first", null);
        setField(term11328, term11328.getClass(), "last", null);
        setField(term11328, term11328.getClass(), "propListHead", null);
        setIntField(term11328, term11328.getClass(), "sourcePosition", 0);
        setField(term11328, term11328.getClass(), "jsType", null);
        setField(term11328, term11328.getClass(), "parent", null);
        setField(term11323, term11323.getClass(), "first", term11328);
        setIntField(term11329, term11329.getClass(), "type", 0);
        setField(term11329, term11329.getClass(), "next", null);
        setField(term11329, term11329.getClass(), "first", null);
        setField(term11329, term11329.getClass(), "last", null);
        setField(term11329, term11329.getClass(), "propListHead", null);
        setIntField(term11329, term11329.getClass(), "sourcePosition", 0);
        setField(term11329, term11329.getClass(), "jsType", null);
        setField(term11329, term11329.getClass(), "parent", null);
        setField(term11323, term11323.getClass(), "last", term11329);
        setField(term11323, term11323.getClass(), "propListHead", null);
        setIntField(term11323, term11323.getClass(), "sourcePosition", 0);
        setField(term11323, term11323.getClass(), "jsType", null);
        setField(term11323, term11323.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1330;
        Object retValue = callMethod(klass, "getLoopCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1330, term11323));
        assertTrue(recursiveEquals(retValue, null));
    }

};


