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

public class NodeUtil_isSwitchCase_1170575017173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1437;
     Object term10389;

    public NodeUtil_isSwitchCase_1170575017173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1450 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1460 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1437, term1437.getClass(), "type", -1518419301);
        setIntField(term1439, term1439.getClass(), "type", -1698809299);
        setIntField(term1441, term1441.getClass(), "type", 0);
        setField(term1441, term1441.getClass(), "next", null);
        setField(term1441, term1441.getClass(), "first", null);
        setField(term1441, term1441.getClass(), "last", null);
        setField(term1441, term1441.getClass(), "propListHead", null);
        setIntField(term1441, term1441.getClass(), "sourcePosition", 0);
        setField(term1441, term1441.getClass(), "jsType", null);
        setField(term1441, term1441.getClass(), "parent", null);
        setField(term1439, term1439.getClass(), "next", term1441);
        setIntField(term1444, term1444.getClass(), "type", 0);
        setField(term1444, term1444.getClass(), "next", null);
        setField(term1444, term1444.getClass(), "first", null);
        setField(term1444, term1444.getClass(), "last", null);
        setField(term1444, term1444.getClass(), "propListHead", null);
        setIntField(term1444, term1444.getClass(), "sourcePosition", 0);
        setField(term1444, term1444.getClass(), "jsType", null);
        setField(term1444, term1444.getClass(), "parent", null);
        setField(term1439, term1439.getClass(), "first", term1444);
        setIntField(term1447, term1447.getClass(), "type", 0);
        setField(term1447, term1447.getClass(), "next", null);
        setField(term1447, term1447.getClass(), "first", null);
        setField(term1447, term1447.getClass(), "last", null);
        setField(term1447, term1447.getClass(), "propListHead", null);
        setIntField(term1447, term1447.getClass(), "sourcePosition", 0);
        setField(term1447, term1447.getClass(), "jsType", null);
        setField(term1447, term1447.getClass(), "parent", null);
        setField(term1439, term1439.getClass(), "last", term1447);
        setField(term1450, term1450.getClass(), "next", null);
        setIntField(term1450, term1450.getClass(), "type", 0);
        setIntField(term1450, term1450.getClass(), "intValue", 0);
        setField(term1450, term1450.getClass(), "objectValue", null);
        setField(term1439, term1439.getClass(), "propListHead", term1450);
        setIntField(term1439, term1439.getClass(), "sourcePosition", 1543696412);
        setField(term1439, term1439.getClass(), "jsType", null);
        setField(term1439, term1439.getClass(), "parent", null);
        setField(term1437, term1437.getClass(), "next", term1439);
        setIntField(term1454, term1454.getClass(), "type", 0);
        setField(term1454, term1454.getClass(), "next", null);
        setField(term1454, term1454.getClass(), "first", null);
        setField(term1454, term1454.getClass(), "last", null);
        setField(term1454, term1454.getClass(), "propListHead", null);
        setIntField(term1454, term1454.getClass(), "sourcePosition", 0);
        setField(term1454, term1454.getClass(), "jsType", null);
        setField(term1454, term1454.getClass(), "parent", null);
        setField(term1437, term1437.getClass(), "first", term1454);
        setIntField(term1457, term1457.getClass(), "type", 0);
        setField(term1457, term1457.getClass(), "next", null);
        setField(term1457, term1457.getClass(), "first", null);
        setField(term1457, term1457.getClass(), "last", null);
        setField(term1457, term1457.getClass(), "propListHead", null);
        setIntField(term1457, term1457.getClass(), "sourcePosition", 0);
        setField(term1457, term1457.getClass(), "jsType", null);
        setField(term1457, term1457.getClass(), "parent", null);
        setField(term1437, term1437.getClass(), "last", term1457);
        setField(term1460, term1460.getClass(), "next", null);
        setIntField(term1460, term1460.getClass(), "type", 0);
        setIntField(term1460, term1460.getClass(), "intValue", 0);
        setField(term1460, term1460.getClass(), "objectValue", null);
        setField(term1437, term1437.getClass(), "propListHead", term1460);
        setIntField(term1437, term1437.getClass(), "sourcePosition", -1385748168);
        setField(term1437, term1437.getClass(), "jsType", null);
        setField(term1437, term1437.getClass(), "parent", null);
        term10389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10394 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10397 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10389, term10389.getClass(), "type", -1518419301);
        setIntField(term10390, term10390.getClass(), "type", -1698809299);
        setIntField(term10391, term10391.getClass(), "type", 0);
        setField(term10391, term10391.getClass(), "next", null);
        setField(term10391, term10391.getClass(), "first", null);
        setField(term10391, term10391.getClass(), "last", null);
        setField(term10391, term10391.getClass(), "propListHead", null);
        setIntField(term10391, term10391.getClass(), "sourcePosition", 0);
        setField(term10391, term10391.getClass(), "jsType", null);
        setField(term10391, term10391.getClass(), "parent", null);
        setField(term10390, term10390.getClass(), "next", term10391);
        setIntField(term10392, term10392.getClass(), "type", 0);
        setField(term10392, term10392.getClass(), "next", null);
        setField(term10392, term10392.getClass(), "first", null);
        setField(term10392, term10392.getClass(), "last", null);
        setField(term10392, term10392.getClass(), "propListHead", null);
        setIntField(term10392, term10392.getClass(), "sourcePosition", 0);
        setField(term10392, term10392.getClass(), "jsType", null);
        setField(term10392, term10392.getClass(), "parent", null);
        setField(term10390, term10390.getClass(), "first", term10392);
        setIntField(term10393, term10393.getClass(), "type", 0);
        setField(term10393, term10393.getClass(), "next", null);
        setField(term10393, term10393.getClass(), "first", null);
        setField(term10393, term10393.getClass(), "last", null);
        setField(term10393, term10393.getClass(), "propListHead", null);
        setIntField(term10393, term10393.getClass(), "sourcePosition", 0);
        setField(term10393, term10393.getClass(), "jsType", null);
        setField(term10393, term10393.getClass(), "parent", null);
        setField(term10390, term10390.getClass(), "last", term10393);
        setField(term10394, term10394.getClass(), "next", null);
        setIntField(term10394, term10394.getClass(), "type", 0);
        setIntField(term10394, term10394.getClass(), "intValue", 0);
        setField(term10394, term10394.getClass(), "objectValue", null);
        setField(term10390, term10390.getClass(), "propListHead", term10394);
        setIntField(term10390, term10390.getClass(), "sourcePosition", 1543696412);
        setField(term10390, term10390.getClass(), "jsType", null);
        setField(term10390, term10390.getClass(), "parent", null);
        setField(term10389, term10389.getClass(), "next", term10390);
        setIntField(term10395, term10395.getClass(), "type", 0);
        setField(term10395, term10395.getClass(), "next", null);
        setField(term10395, term10395.getClass(), "first", null);
        setField(term10395, term10395.getClass(), "last", null);
        setField(term10395, term10395.getClass(), "propListHead", null);
        setIntField(term10395, term10395.getClass(), "sourcePosition", 0);
        setField(term10395, term10395.getClass(), "jsType", null);
        setField(term10395, term10395.getClass(), "parent", null);
        setField(term10389, term10389.getClass(), "first", term10395);
        setIntField(term10396, term10396.getClass(), "type", 0);
        setField(term10396, term10396.getClass(), "next", null);
        setField(term10396, term10396.getClass(), "first", null);
        setField(term10396, term10396.getClass(), "last", null);
        setField(term10396, term10396.getClass(), "propListHead", null);
        setIntField(term10396, term10396.getClass(), "sourcePosition", 0);
        setField(term10396, term10396.getClass(), "jsType", null);
        setField(term10396, term10396.getClass(), "parent", null);
        setField(term10389, term10389.getClass(), "last", term10396);
        setField(term10397, term10397.getClass(), "next", null);
        setIntField(term10397, term10397.getClass(), "type", 0);
        setIntField(term10397, term10397.getClass(), "intValue", 0);
        setField(term10397, term10397.getClass(), "objectValue", null);
        setField(term10389, term10389.getClass(), "propListHead", term10397);
        setIntField(term10389, term10389.getClass(), "sourcePosition", -1385748168);
        setField(term10389, term10389.getClass(), "jsType", null);
        setField(term10389, term10389.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1437;
        Object retValue = callMethod(klass, "isSwitchCase", argTypes, null, args);
        assertTrue(recursiveEquals(term1437, term10389));
        assertTrue(recursiveEquals(retValue, false));
    }

};


