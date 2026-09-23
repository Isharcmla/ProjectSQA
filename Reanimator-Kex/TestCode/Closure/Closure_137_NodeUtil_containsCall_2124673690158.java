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

public class NodeUtil_containsCall_2124673690158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1489;
     Object term9412;

    public NodeUtil_containsCall_2124673690158() {
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
        term9412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9417 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9420 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9412, term9412.getClass(), "type", 1816273440);
        setIntField(term9413, term9413.getClass(), "type", 109078154);
        setIntField(term9414, term9414.getClass(), "type", 0);
        setField(term9414, term9414.getClass(), "next", null);
        setField(term9414, term9414.getClass(), "first", null);
        setField(term9414, term9414.getClass(), "last", null);
        setField(term9414, term9414.getClass(), "propListHead", null);
        setIntField(term9414, term9414.getClass(), "sourcePosition", 0);
        setField(term9414, term9414.getClass(), "jsType", null);
        setField(term9414, term9414.getClass(), "parent", null);
        setField(term9413, term9413.getClass(), "next", term9414);
        setIntField(term9415, term9415.getClass(), "type", 0);
        setField(term9415, term9415.getClass(), "next", null);
        setField(term9415, term9415.getClass(), "first", null);
        setField(term9415, term9415.getClass(), "last", null);
        setField(term9415, term9415.getClass(), "propListHead", null);
        setIntField(term9415, term9415.getClass(), "sourcePosition", 0);
        setField(term9415, term9415.getClass(), "jsType", null);
        setField(term9415, term9415.getClass(), "parent", null);
        setField(term9413, term9413.getClass(), "first", term9415);
        setIntField(term9416, term9416.getClass(), "type", 0);
        setField(term9416, term9416.getClass(), "next", null);
        setField(term9416, term9416.getClass(), "first", null);
        setField(term9416, term9416.getClass(), "last", null);
        setField(term9416, term9416.getClass(), "propListHead", null);
        setIntField(term9416, term9416.getClass(), "sourcePosition", 0);
        setField(term9416, term9416.getClass(), "jsType", null);
        setField(term9416, term9416.getClass(), "parent", null);
        setField(term9413, term9413.getClass(), "last", term9416);
        setField(term9417, term9417.getClass(), "next", null);
        setIntField(term9417, term9417.getClass(), "type", 0);
        setIntField(term9417, term9417.getClass(), "intValue", 0);
        setField(term9417, term9417.getClass(), "objectValue", null);
        setField(term9413, term9413.getClass(), "propListHead", term9417);
        setIntField(term9413, term9413.getClass(), "sourcePosition", -995785731);
        setField(term9413, term9413.getClass(), "jsType", null);
        setField(term9413, term9413.getClass(), "parent", null);
        setField(term9412, term9412.getClass(), "next", term9413);
        setIntField(term9418, term9418.getClass(), "type", 0);
        setField(term9418, term9418.getClass(), "next", null);
        setField(term9418, term9418.getClass(), "first", null);
        setField(term9418, term9418.getClass(), "last", null);
        setField(term9418, term9418.getClass(), "propListHead", null);
        setIntField(term9418, term9418.getClass(), "sourcePosition", 0);
        setField(term9418, term9418.getClass(), "jsType", null);
        setField(term9418, term9418.getClass(), "parent", null);
        setField(term9412, term9412.getClass(), "first", term9418);
        setIntField(term9419, term9419.getClass(), "type", 0);
        setField(term9419, term9419.getClass(), "next", null);
        setField(term9419, term9419.getClass(), "first", null);
        setField(term9419, term9419.getClass(), "last", null);
        setField(term9419, term9419.getClass(), "propListHead", null);
        setIntField(term9419, term9419.getClass(), "sourcePosition", 0);
        setField(term9419, term9419.getClass(), "jsType", null);
        setField(term9419, term9419.getClass(), "parent", null);
        setField(term9412, term9412.getClass(), "last", term9419);
        setField(term9420, term9420.getClass(), "next", null);
        setIntField(term9420, term9420.getClass(), "type", 0);
        setIntField(term9420, term9420.getClass(), "intValue", 0);
        setField(term9420, term9420.getClass(), "objectValue", null);
        setField(term9412, term9412.getClass(), "propListHead", term9420);
        setIntField(term9412, term9412.getClass(), "sourcePosition", 1349815364);
        setField(term9412, term9412.getClass(), "jsType", null);
        setField(term9412, term9412.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1489;
        callMethod(klass, "containsCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1489, term9412));
    }

};


