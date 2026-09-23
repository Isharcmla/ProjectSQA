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
import java.lang.Object;

public class NodeUtil_removeChild_1104348502154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327;
     Object term1354;

    public NodeUtil_removeChild_1104348502154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1340 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1350 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1327, term1327.getClass(), "type", -1973791064);
        setIntField(term1329, term1329.getClass(), "type", 1633913667);
        setIntField(term1331, term1331.getClass(), "type", 0);
        setField(term1331, term1331.getClass(), "next", null);
        setField(term1331, term1331.getClass(), "first", null);
        setField(term1331, term1331.getClass(), "last", null);
        setField(term1331, term1331.getClass(), "propListHead", null);
        setIntField(term1331, term1331.getClass(), "sourcePosition", 0);
        setField(term1331, term1331.getClass(), "jsType", null);
        setField(term1331, term1331.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "next", term1331);
        setIntField(term1334, term1334.getClass(), "type", 0);
        setField(term1334, term1334.getClass(), "next", null);
        setField(term1334, term1334.getClass(), "first", null);
        setField(term1334, term1334.getClass(), "last", null);
        setField(term1334, term1334.getClass(), "propListHead", null);
        setIntField(term1334, term1334.getClass(), "sourcePosition", 0);
        setField(term1334, term1334.getClass(), "jsType", null);
        setField(term1334, term1334.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "first", term1334);
        setIntField(term1337, term1337.getClass(), "type", 0);
        setField(term1337, term1337.getClass(), "next", null);
        setField(term1337, term1337.getClass(), "first", null);
        setField(term1337, term1337.getClass(), "last", null);
        setField(term1337, term1337.getClass(), "propListHead", null);
        setIntField(term1337, term1337.getClass(), "sourcePosition", 0);
        setField(term1337, term1337.getClass(), "jsType", null);
        setField(term1337, term1337.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "last", term1337);
        setField(term1340, term1340.getClass(), "next", null);
        setIntField(term1340, term1340.getClass(), "type", 0);
        setIntField(term1340, term1340.getClass(), "intValue", 0);
        setField(term1340, term1340.getClass(), "objectValue", null);
        setField(term1329, term1329.getClass(), "propListHead", term1340);
        setIntField(term1329, term1329.getClass(), "sourcePosition", 612177768);
        setField(term1329, term1329.getClass(), "jsType", null);
        setField(term1329, term1329.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "next", term1329);
        setIntField(term1344, term1344.getClass(), "type", 0);
        setField(term1344, term1344.getClass(), "next", null);
        setField(term1344, term1344.getClass(), "first", null);
        setField(term1344, term1344.getClass(), "last", null);
        setField(term1344, term1344.getClass(), "propListHead", null);
        setIntField(term1344, term1344.getClass(), "sourcePosition", 0);
        setField(term1344, term1344.getClass(), "jsType", null);
        setField(term1344, term1344.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "first", term1344);
        setIntField(term1347, term1347.getClass(), "type", 0);
        setField(term1347, term1347.getClass(), "next", null);
        setField(term1347, term1347.getClass(), "first", null);
        setField(term1347, term1347.getClass(), "last", null);
        setField(term1347, term1347.getClass(), "propListHead", null);
        setIntField(term1347, term1347.getClass(), "sourcePosition", 0);
        setField(term1347, term1347.getClass(), "jsType", null);
        setField(term1347, term1347.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "last", term1347);
        setField(term1350, term1350.getClass(), "next", null);
        setIntField(term1350, term1350.getClass(), "type", 0);
        setIntField(term1350, term1350.getClass(), "intValue", 0);
        setField(term1350, term1350.getClass(), "objectValue", null);
        setField(term1327, term1327.getClass(), "propListHead", term1350);
        setIntField(term1327, term1327.getClass(), "sourcePosition", -1626451656);
        setField(term1327, term1327.getClass(), "jsType", null);
        setField(term1327, term1327.getClass(), "parent", null);
        term1354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1377 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1354, term1354.getClass(), "type", 2634669);
        setIntField(term1356, term1356.getClass(), "type", 313459791);
        setIntField(term1358, term1358.getClass(), "type", 0);
        setField(term1358, term1358.getClass(), "next", null);
        setField(term1358, term1358.getClass(), "first", null);
        setField(term1358, term1358.getClass(), "last", null);
        setField(term1358, term1358.getClass(), "propListHead", null);
        setIntField(term1358, term1358.getClass(), "sourcePosition", 0);
        setField(term1358, term1358.getClass(), "jsType", null);
        setField(term1358, term1358.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "next", term1358);
        setIntField(term1361, term1361.getClass(), "type", 0);
        setField(term1361, term1361.getClass(), "next", null);
        setField(term1361, term1361.getClass(), "first", null);
        setField(term1361, term1361.getClass(), "last", null);
        setField(term1361, term1361.getClass(), "propListHead", null);
        setIntField(term1361, term1361.getClass(), "sourcePosition", 0);
        setField(term1361, term1361.getClass(), "jsType", null);
        setField(term1361, term1361.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "first", term1361);
        setIntField(term1364, term1364.getClass(), "type", 0);
        setField(term1364, term1364.getClass(), "next", null);
        setField(term1364, term1364.getClass(), "first", null);
        setField(term1364, term1364.getClass(), "last", null);
        setField(term1364, term1364.getClass(), "propListHead", null);
        setIntField(term1364, term1364.getClass(), "sourcePosition", 0);
        setField(term1364, term1364.getClass(), "jsType", null);
        setField(term1364, term1364.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "last", term1364);
        setField(term1367, term1367.getClass(), "next", null);
        setIntField(term1367, term1367.getClass(), "type", 0);
        setIntField(term1367, term1367.getClass(), "intValue", 0);
        setField(term1367, term1367.getClass(), "objectValue", null);
        setField(term1356, term1356.getClass(), "propListHead", term1367);
        setIntField(term1356, term1356.getClass(), "sourcePosition", 794352120);
        setField(term1356, term1356.getClass(), "jsType", null);
        setField(term1356, term1356.getClass(), "parent", null);
        setField(term1354, term1354.getClass(), "next", term1356);
        setIntField(term1371, term1371.getClass(), "type", 0);
        setField(term1371, term1371.getClass(), "next", null);
        setField(term1371, term1371.getClass(), "first", null);
        setField(term1371, term1371.getClass(), "last", null);
        setField(term1371, term1371.getClass(), "propListHead", null);
        setIntField(term1371, term1371.getClass(), "sourcePosition", 0);
        setField(term1371, term1371.getClass(), "jsType", null);
        setField(term1371, term1371.getClass(), "parent", null);
        setField(term1354, term1354.getClass(), "first", term1371);
        setIntField(term1374, term1374.getClass(), "type", 0);
        setField(term1374, term1374.getClass(), "next", null);
        setField(term1374, term1374.getClass(), "first", null);
        setField(term1374, term1374.getClass(), "last", null);
        setField(term1374, term1374.getClass(), "propListHead", null);
        setIntField(term1374, term1374.getClass(), "sourcePosition", 0);
        setField(term1374, term1374.getClass(), "jsType", null);
        setField(term1374, term1374.getClass(), "parent", null);
        setField(term1354, term1354.getClass(), "last", term1374);
        setField(term1377, term1377.getClass(), "next", null);
        setIntField(term1377, term1377.getClass(), "type", 0);
        setIntField(term1377, term1377.getClass(), "intValue", 0);
        setField(term1377, term1377.getClass(), "objectValue", null);
        setField(term1354, term1354.getClass(), "propListHead", term1377);
        setIntField(term1354, term1354.getClass(), "sourcePosition", 340719678);
        setField(term1354, term1354.getClass(), "jsType", null);
        setField(term1354, term1354.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1327;
        args[1] = term1354;
        try {
            callMethod(klass, "removeChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


