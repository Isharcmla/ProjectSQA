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

public class NodeUtil_isVar_896854502209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433;
     Object term12039;

    public NodeUtil_isVar_896854502209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1446 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1456 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1433, term1433.getClass(), "type", -1794965320);
        setIntField(term1435, term1435.getClass(), "type", 1091954101);
        setIntField(term1437, term1437.getClass(), "type", 0);
        setField(term1437, term1437.getClass(), "next", null);
        setField(term1437, term1437.getClass(), "first", null);
        setField(term1437, term1437.getClass(), "last", null);
        setField(term1437, term1437.getClass(), "propListHead", null);
        setIntField(term1437, term1437.getClass(), "sourcePosition", 0);
        setField(term1437, term1437.getClass(), "jsType", null);
        setField(term1437, term1437.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "next", term1437);
        setIntField(term1440, term1440.getClass(), "type", 0);
        setField(term1440, term1440.getClass(), "next", null);
        setField(term1440, term1440.getClass(), "first", null);
        setField(term1440, term1440.getClass(), "last", null);
        setField(term1440, term1440.getClass(), "propListHead", null);
        setIntField(term1440, term1440.getClass(), "sourcePosition", 0);
        setField(term1440, term1440.getClass(), "jsType", null);
        setField(term1440, term1440.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "first", term1440);
        setIntField(term1443, term1443.getClass(), "type", 0);
        setField(term1443, term1443.getClass(), "next", null);
        setField(term1443, term1443.getClass(), "first", null);
        setField(term1443, term1443.getClass(), "last", null);
        setField(term1443, term1443.getClass(), "propListHead", null);
        setIntField(term1443, term1443.getClass(), "sourcePosition", 0);
        setField(term1443, term1443.getClass(), "jsType", null);
        setField(term1443, term1443.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "last", term1443);
        setField(term1446, term1446.getClass(), "next", null);
        setIntField(term1446, term1446.getClass(), "type", 0);
        setIntField(term1446, term1446.getClass(), "intValue", 0);
        setField(term1446, term1446.getClass(), "objectValue", null);
        setField(term1435, term1435.getClass(), "propListHead", term1446);
        setIntField(term1435, term1435.getClass(), "sourcePosition", 732174235);
        setField(term1435, term1435.getClass(), "jsType", null);
        setField(term1435, term1435.getClass(), "parent", null);
        setField(term1433, term1433.getClass(), "next", term1435);
        setIntField(term1450, term1450.getClass(), "type", 0);
        setField(term1450, term1450.getClass(), "next", null);
        setField(term1450, term1450.getClass(), "first", null);
        setField(term1450, term1450.getClass(), "last", null);
        setField(term1450, term1450.getClass(), "propListHead", null);
        setIntField(term1450, term1450.getClass(), "sourcePosition", 0);
        setField(term1450, term1450.getClass(), "jsType", null);
        setField(term1450, term1450.getClass(), "parent", null);
        setField(term1433, term1433.getClass(), "first", term1450);
        setIntField(term1453, term1453.getClass(), "type", 0);
        setField(term1453, term1453.getClass(), "next", null);
        setField(term1453, term1453.getClass(), "first", null);
        setField(term1453, term1453.getClass(), "last", null);
        setField(term1453, term1453.getClass(), "propListHead", null);
        setIntField(term1453, term1453.getClass(), "sourcePosition", 0);
        setField(term1453, term1453.getClass(), "jsType", null);
        setField(term1453, term1453.getClass(), "parent", null);
        setField(term1433, term1433.getClass(), "last", term1453);
        setField(term1456, term1456.getClass(), "next", null);
        setIntField(term1456, term1456.getClass(), "type", 0);
        setIntField(term1456, term1456.getClass(), "intValue", 0);
        setField(term1456, term1456.getClass(), "objectValue", null);
        setField(term1433, term1433.getClass(), "propListHead", term1456);
        setIntField(term1433, term1433.getClass(), "sourcePosition", 470895808);
        setField(term1433, term1433.getClass(), "jsType", null);
        setField(term1433, term1433.getClass(), "parent", null);
        term12039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12044 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12047 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12039, term12039.getClass(), "type", -1794965320);
        setIntField(term12040, term12040.getClass(), "type", 1091954101);
        setIntField(term12041, term12041.getClass(), "type", 0);
        setField(term12041, term12041.getClass(), "next", null);
        setField(term12041, term12041.getClass(), "first", null);
        setField(term12041, term12041.getClass(), "last", null);
        setField(term12041, term12041.getClass(), "propListHead", null);
        setIntField(term12041, term12041.getClass(), "sourcePosition", 0);
        setField(term12041, term12041.getClass(), "jsType", null);
        setField(term12041, term12041.getClass(), "parent", null);
        setField(term12040, term12040.getClass(), "next", term12041);
        setIntField(term12042, term12042.getClass(), "type", 0);
        setField(term12042, term12042.getClass(), "next", null);
        setField(term12042, term12042.getClass(), "first", null);
        setField(term12042, term12042.getClass(), "last", null);
        setField(term12042, term12042.getClass(), "propListHead", null);
        setIntField(term12042, term12042.getClass(), "sourcePosition", 0);
        setField(term12042, term12042.getClass(), "jsType", null);
        setField(term12042, term12042.getClass(), "parent", null);
        setField(term12040, term12040.getClass(), "first", term12042);
        setIntField(term12043, term12043.getClass(), "type", 0);
        setField(term12043, term12043.getClass(), "next", null);
        setField(term12043, term12043.getClass(), "first", null);
        setField(term12043, term12043.getClass(), "last", null);
        setField(term12043, term12043.getClass(), "propListHead", null);
        setIntField(term12043, term12043.getClass(), "sourcePosition", 0);
        setField(term12043, term12043.getClass(), "jsType", null);
        setField(term12043, term12043.getClass(), "parent", null);
        setField(term12040, term12040.getClass(), "last", term12043);
        setField(term12044, term12044.getClass(), "next", null);
        setIntField(term12044, term12044.getClass(), "type", 0);
        setIntField(term12044, term12044.getClass(), "intValue", 0);
        setField(term12044, term12044.getClass(), "objectValue", null);
        setField(term12040, term12040.getClass(), "propListHead", term12044);
        setIntField(term12040, term12040.getClass(), "sourcePosition", 732174235);
        setField(term12040, term12040.getClass(), "jsType", null);
        setField(term12040, term12040.getClass(), "parent", null);
        setField(term12039, term12039.getClass(), "next", term12040);
        setIntField(term12045, term12045.getClass(), "type", 0);
        setField(term12045, term12045.getClass(), "next", null);
        setField(term12045, term12045.getClass(), "first", null);
        setField(term12045, term12045.getClass(), "last", null);
        setField(term12045, term12045.getClass(), "propListHead", null);
        setIntField(term12045, term12045.getClass(), "sourcePosition", 0);
        setField(term12045, term12045.getClass(), "jsType", null);
        setField(term12045, term12045.getClass(), "parent", null);
        setField(term12039, term12039.getClass(), "first", term12045);
        setIntField(term12046, term12046.getClass(), "type", 0);
        setField(term12046, term12046.getClass(), "next", null);
        setField(term12046, term12046.getClass(), "first", null);
        setField(term12046, term12046.getClass(), "last", null);
        setField(term12046, term12046.getClass(), "propListHead", null);
        setIntField(term12046, term12046.getClass(), "sourcePosition", 0);
        setField(term12046, term12046.getClass(), "jsType", null);
        setField(term12046, term12046.getClass(), "parent", null);
        setField(term12039, term12039.getClass(), "last", term12046);
        setField(term12047, term12047.getClass(), "next", null);
        setIntField(term12047, term12047.getClass(), "type", 0);
        setIntField(term12047, term12047.getClass(), "intValue", 0);
        setField(term12047, term12047.getClass(), "objectValue", null);
        setField(term12039, term12039.getClass(), "propListHead", term12047);
        setIntField(term12039, term12039.getClass(), "sourcePosition", 470895808);
        setField(term12039, term12039.getClass(), "jsType", null);
        setField(term12039, term12039.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1433;
        Object retValue = callMethod(klass, "isVar", argTypes, null, args);
        assertTrue(recursiveEquals(term1433, term12039));
        assertTrue(recursiveEquals(retValue, false));
    }

};


