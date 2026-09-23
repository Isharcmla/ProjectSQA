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

public class NodeUtil_isThis_1377192847159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1489;
     Object term9355;

    public NodeUtil_isThis_1377192847159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1502 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1512 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1489, term1489.getClass(), "type", 1816273440);
        setIntField(term1491, term1491.getClass(), "type", 109078154);
        setIntField(term1493, term1493.getClass(), "type", 0);
        setField(term1493, term1493.getClass(), "next", null);
        setField(term1493, term1493.getClass(), "first", null);
        setField(term1493, term1493.getClass(), "last", null);
        setField(term1493, term1493.getClass(), "propListHead", null);
        setIntField(term1493, term1493.getClass(), "sourcePosition", 0);
        setField(term1493, term1493.getClass(), "jsType", null);
        setField(term1493, term1493.getClass(), "parent", null);
        setField(term1491, term1491.getClass(), "next", term1493);
        setIntField(term1496, term1496.getClass(), "type", 0);
        setField(term1496, term1496.getClass(), "next", null);
        setField(term1496, term1496.getClass(), "first", null);
        setField(term1496, term1496.getClass(), "last", null);
        setField(term1496, term1496.getClass(), "propListHead", null);
        setIntField(term1496, term1496.getClass(), "sourcePosition", 0);
        setField(term1496, term1496.getClass(), "jsType", null);
        setField(term1496, term1496.getClass(), "parent", null);
        setField(term1491, term1491.getClass(), "first", term1496);
        setIntField(term1499, term1499.getClass(), "type", 0);
        setField(term1499, term1499.getClass(), "next", null);
        setField(term1499, term1499.getClass(), "first", null);
        setField(term1499, term1499.getClass(), "last", null);
        setField(term1499, term1499.getClass(), "propListHead", null);
        setIntField(term1499, term1499.getClass(), "sourcePosition", 0);
        setField(term1499, term1499.getClass(), "jsType", null);
        setField(term1499, term1499.getClass(), "parent", null);
        setField(term1491, term1491.getClass(), "last", term1499);
        setField(term1502, term1502.getClass(), "next", null);
        setIntField(term1502, term1502.getClass(), "type", 0);
        setIntField(term1502, term1502.getClass(), "intValue", 0);
        setField(term1502, term1502.getClass(), "objectValue", null);
        setField(term1491, term1491.getClass(), "propListHead", term1502);
        setIntField(term1491, term1491.getClass(), "sourcePosition", -995785731);
        setField(term1491, term1491.getClass(), "jsType", null);
        setField(term1491, term1491.getClass(), "parent", null);
        setField(term1489, term1489.getClass(), "next", term1491);
        setIntField(term1506, term1506.getClass(), "type", 0);
        setField(term1506, term1506.getClass(), "next", null);
        setField(term1506, term1506.getClass(), "first", null);
        setField(term1506, term1506.getClass(), "last", null);
        setField(term1506, term1506.getClass(), "propListHead", null);
        setIntField(term1506, term1506.getClass(), "sourcePosition", 0);
        setField(term1506, term1506.getClass(), "jsType", null);
        setField(term1506, term1506.getClass(), "parent", null);
        setField(term1489, term1489.getClass(), "first", term1506);
        setIntField(term1509, term1509.getClass(), "type", 0);
        setField(term1509, term1509.getClass(), "next", null);
        setField(term1509, term1509.getClass(), "first", null);
        setField(term1509, term1509.getClass(), "last", null);
        setField(term1509, term1509.getClass(), "propListHead", null);
        setIntField(term1509, term1509.getClass(), "sourcePosition", 0);
        setField(term1509, term1509.getClass(), "jsType", null);
        setField(term1509, term1509.getClass(), "parent", null);
        setField(term1489, term1489.getClass(), "last", term1509);
        setField(term1512, term1512.getClass(), "next", null);
        setIntField(term1512, term1512.getClass(), "type", 0);
        setIntField(term1512, term1512.getClass(), "intValue", 0);
        setField(term1512, term1512.getClass(), "objectValue", null);
        setField(term1489, term1489.getClass(), "propListHead", term1512);
        setIntField(term1489, term1489.getClass(), "sourcePosition", 1349815364);
        setField(term1489, term1489.getClass(), "jsType", null);
        setField(term1489, term1489.getClass(), "parent", null);
        term9355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9360 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9363 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9355, term9355.getClass(), "type", 1816273440);
        setIntField(term9356, term9356.getClass(), "type", 109078154);
        setIntField(term9357, term9357.getClass(), "type", 0);
        setField(term9357, term9357.getClass(), "next", null);
        setField(term9357, term9357.getClass(), "first", null);
        setField(term9357, term9357.getClass(), "last", null);
        setField(term9357, term9357.getClass(), "propListHead", null);
        setIntField(term9357, term9357.getClass(), "sourcePosition", 0);
        setField(term9357, term9357.getClass(), "jsType", null);
        setField(term9357, term9357.getClass(), "parent", null);
        setField(term9356, term9356.getClass(), "next", term9357);
        setIntField(term9358, term9358.getClass(), "type", 0);
        setField(term9358, term9358.getClass(), "next", null);
        setField(term9358, term9358.getClass(), "first", null);
        setField(term9358, term9358.getClass(), "last", null);
        setField(term9358, term9358.getClass(), "propListHead", null);
        setIntField(term9358, term9358.getClass(), "sourcePosition", 0);
        setField(term9358, term9358.getClass(), "jsType", null);
        setField(term9358, term9358.getClass(), "parent", null);
        setField(term9356, term9356.getClass(), "first", term9358);
        setIntField(term9359, term9359.getClass(), "type", 0);
        setField(term9359, term9359.getClass(), "next", null);
        setField(term9359, term9359.getClass(), "first", null);
        setField(term9359, term9359.getClass(), "last", null);
        setField(term9359, term9359.getClass(), "propListHead", null);
        setIntField(term9359, term9359.getClass(), "sourcePosition", 0);
        setField(term9359, term9359.getClass(), "jsType", null);
        setField(term9359, term9359.getClass(), "parent", null);
        setField(term9356, term9356.getClass(), "last", term9359);
        setField(term9360, term9360.getClass(), "next", null);
        setIntField(term9360, term9360.getClass(), "type", 0);
        setIntField(term9360, term9360.getClass(), "intValue", 0);
        setField(term9360, term9360.getClass(), "objectValue", null);
        setField(term9356, term9356.getClass(), "propListHead", term9360);
        setIntField(term9356, term9356.getClass(), "sourcePosition", -995785731);
        setField(term9356, term9356.getClass(), "jsType", null);
        setField(term9356, term9356.getClass(), "parent", null);
        setField(term9355, term9355.getClass(), "next", term9356);
        setIntField(term9361, term9361.getClass(), "type", 0);
        setField(term9361, term9361.getClass(), "next", null);
        setField(term9361, term9361.getClass(), "first", null);
        setField(term9361, term9361.getClass(), "last", null);
        setField(term9361, term9361.getClass(), "propListHead", null);
        setIntField(term9361, term9361.getClass(), "sourcePosition", 0);
        setField(term9361, term9361.getClass(), "jsType", null);
        setField(term9361, term9361.getClass(), "parent", null);
        setField(term9355, term9355.getClass(), "first", term9361);
        setIntField(term9362, term9362.getClass(), "type", 0);
        setField(term9362, term9362.getClass(), "next", null);
        setField(term9362, term9362.getClass(), "first", null);
        setField(term9362, term9362.getClass(), "last", null);
        setField(term9362, term9362.getClass(), "propListHead", null);
        setIntField(term9362, term9362.getClass(), "sourcePosition", 0);
        setField(term9362, term9362.getClass(), "jsType", null);
        setField(term9362, term9362.getClass(), "parent", null);
        setField(term9355, term9355.getClass(), "last", term9362);
        setField(term9363, term9363.getClass(), "next", null);
        setIntField(term9363, term9363.getClass(), "type", 0);
        setIntField(term9363, term9363.getClass(), "intValue", 0);
        setField(term9363, term9363.getClass(), "objectValue", null);
        setField(term9355, term9355.getClass(), "propListHead", term9363);
        setIntField(term9355, term9355.getClass(), "sourcePosition", 1349815364);
        setField(term9355, term9355.getClass(), "jsType", null);
        setField(term9355, term9355.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1489;
        Object retValue = callMethod(klass, "isThis", argTypes, null, args);
        assertTrue(recursiveEquals(term1489, term9355));
        assertTrue(recursiveEquals(retValue, false));
    }

};


