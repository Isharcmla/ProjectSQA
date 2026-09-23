package com.google.javascript.rhino;

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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_addChildrenToBack_1557151497240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1245;
     Object term1272;

    public Node_addChildrenToBack_1557151497240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1245, term1245.getClass(), "type", 489201218);
        setIntField(term1247, term1247.getClass(), "type", 464181937);
        setIntField(term1249, term1249.getClass(), "type", -1455526612);
        setIntField(term1251, term1251.getClass(), "type", -941356098);
        setIntField(term1253, term1253.getClass(), "type", -201517446);
        setField(term1253, term1253.getClass(), "next", null);
        setField(term1253, term1253.getClass(), "first", null);
        setField(term1253, term1253.getClass(), "last", null);
        setField(term1253, term1253.getClass(), "propListHead", null);
        setIntField(term1253, term1253.getClass(), "sourcePosition", 0);
        setField(term1253, term1253.getClass(), "jsType", null);
        setField(term1253, term1253.getClass(), "parent", null);
        setField(term1251, term1251.getClass(), "next", term1253);
        setIntField(term1256, term1256.getClass(), "type", -97742366);
        setField(term1256, term1256.getClass(), "next", null);
        setField(term1256, term1256.getClass(), "first", null);
        setField(term1256, term1256.getClass(), "last", term1253);
        setField(term1256, term1256.getClass(), "propListHead", null);
        setIntField(term1256, term1256.getClass(), "sourcePosition", 0);
        setField(term1256, term1256.getClass(), "jsType", null);
        setField(term1256, term1256.getClass(), "parent", null);
        setField(term1251, term1251.getClass(), "first", term1256);
        setField(term1251, term1251.getClass(), "last", term1249);
        setField(term1251, term1251.getClass(), "propListHead", null);
        setIntField(term1251, term1251.getClass(), "sourcePosition", 0);
        setField(term1251, term1251.getClass(), "jsType", null);
        setField(term1251, term1251.getClass(), "parent", null);
        setField(term1249, term1249.getClass(), "next", term1251);
        setField(term1249, term1249.getClass(), "first", term1253);
        setIntField(term1260, term1260.getClass(), "type", 1374790203);
        setIntField(term1262, term1262.getClass(), "type", 1160010161);
        setField(term1262, term1262.getClass(), "next", null);
        setField(term1262, term1262.getClass(), "first", term1256);
        setField(term1262, term1262.getClass(), "last", term1251);
        setField(term1262, term1262.getClass(), "propListHead", null);
        setIntField(term1262, term1262.getClass(), "sourcePosition", 0);
        setField(term1262, term1262.getClass(), "jsType", null);
        setField(term1262, term1262.getClass(), "parent", null);
        setField(term1260, term1260.getClass(), "next", term1262);
        setField(term1260, term1260.getClass(), "first", term1247);
        setField(term1260, term1260.getClass(), "last", term1247);
        setField(term1260, term1260.getClass(), "propListHead", null);
        setIntField(term1260, term1260.getClass(), "sourcePosition", 0);
        setField(term1260, term1260.getClass(), "jsType", null);
        setField(term1260, term1260.getClass(), "parent", null);
        setField(term1249, term1249.getClass(), "last", term1260);
        setField(term1249, term1249.getClass(), "propListHead", null);
        setIntField(term1249, term1249.getClass(), "sourcePosition", 0);
        setField(term1249, term1249.getClass(), "jsType", null);
        setField(term1249, term1249.getClass(), "parent", null);
        setField(term1247, term1247.getClass(), "next", term1249);
        setIntField(term1267, term1267.getClass(), "type", -423900705);
        setField(term1267, term1267.getClass(), "next", term1260);
        setField(term1267, term1267.getClass(), "first", term1262);
        setField(term1267, term1267.getClass(), "last", term1245);
        setField(term1267, term1267.getClass(), "propListHead", null);
        setIntField(term1267, term1267.getClass(), "sourcePosition", 0);
        setField(term1267, term1267.getClass(), "jsType", null);
        setField(term1267, term1267.getClass(), "parent", null);
        setField(term1247, term1247.getClass(), "first", term1267);
        setField(term1247, term1247.getClass(), "last", term1267);
        setField(term1247, term1247.getClass(), "propListHead", null);
        setIntField(term1247, term1247.getClass(), "sourcePosition", 0);
        setField(term1247, term1247.getClass(), "jsType", null);
        setField(term1247, term1247.getClass(), "parent", null);
        setField(term1245, term1245.getClass(), "next", term1247);
        setField(term1245, term1245.getClass(), "first", term1251);
        setField(term1245, term1245.getClass(), "last", term1253);
        setField(term1245, term1245.getClass(), "propListHead", null);
        setIntField(term1245, term1245.getClass(), "sourcePosition", 0);
        setField(term1245, term1245.getClass(), "jsType", null);
        setField(term1245, term1245.getClass(), "parent", null);
        term1272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1272, term1272.getClass(), "type", -525570815);
        setIntField(term1274, term1274.getClass(), "type", 754055848);
        setIntField(term1276, term1276.getClass(), "type", -19246901);
        setIntField(term1278, term1278.getClass(), "type", -370828664);
        setIntField(term1280, term1280.getClass(), "type", 1168633950);
        setField(term1280, term1280.getClass(), "next", null);
        setField(term1280, term1280.getClass(), "first", null);
        setField(term1280, term1280.getClass(), "last", null);
        setField(term1280, term1280.getClass(), "propListHead", null);
        setIntField(term1280, term1280.getClass(), "sourcePosition", 0);
        setField(term1280, term1280.getClass(), "jsType", null);
        setField(term1280, term1280.getClass(), "parent", null);
        setField(term1278, term1278.getClass(), "next", term1280);
        setIntField(term1283, term1283.getClass(), "type", 1607082164);
        setField(term1283, term1283.getClass(), "next", null);
        setField(term1283, term1283.getClass(), "first", null);
        setField(term1283, term1283.getClass(), "last", term1280);
        setField(term1283, term1283.getClass(), "propListHead", null);
        setIntField(term1283, term1283.getClass(), "sourcePosition", 0);
        setField(term1283, term1283.getClass(), "jsType", null);
        setField(term1283, term1283.getClass(), "parent", null);
        setField(term1278, term1278.getClass(), "first", term1283);
        setField(term1278, term1278.getClass(), "last", term1276);
        setField(term1278, term1278.getClass(), "propListHead", null);
        setIntField(term1278, term1278.getClass(), "sourcePosition", 0);
        setField(term1278, term1278.getClass(), "jsType", null);
        setField(term1278, term1278.getClass(), "parent", null);
        setField(term1276, term1276.getClass(), "next", term1278);
        setField(term1276, term1276.getClass(), "first", term1280);
        setIntField(term1287, term1287.getClass(), "type", -1867239125);
        setIntField(term1289, term1289.getClass(), "type", 952869601);
        setField(term1289, term1289.getClass(), "next", null);
        setField(term1289, term1289.getClass(), "first", term1283);
        setField(term1289, term1289.getClass(), "last", term1278);
        setField(term1289, term1289.getClass(), "propListHead", null);
        setIntField(term1289, term1289.getClass(), "sourcePosition", 0);
        setField(term1289, term1289.getClass(), "jsType", null);
        setField(term1289, term1289.getClass(), "parent", null);
        setField(term1287, term1287.getClass(), "next", term1289);
        setField(term1287, term1287.getClass(), "first", term1274);
        setField(term1287, term1287.getClass(), "last", term1274);
        setField(term1287, term1287.getClass(), "propListHead", null);
        setIntField(term1287, term1287.getClass(), "sourcePosition", 0);
        setField(term1287, term1287.getClass(), "jsType", null);
        setField(term1287, term1287.getClass(), "parent", null);
        setField(term1276, term1276.getClass(), "last", term1287);
        setField(term1276, term1276.getClass(), "propListHead", null);
        setIntField(term1276, term1276.getClass(), "sourcePosition", 0);
        setField(term1276, term1276.getClass(), "jsType", null);
        setField(term1276, term1276.getClass(), "parent", null);
        setField(term1274, term1274.getClass(), "next", term1276);
        setIntField(term1294, term1294.getClass(), "type", 91958879);
        setField(term1294, term1294.getClass(), "next", term1287);
        setField(term1294, term1294.getClass(), "first", term1289);
        setField(term1294, term1294.getClass(), "last", term1272);
        setField(term1294, term1294.getClass(), "propListHead", null);
        setIntField(term1294, term1294.getClass(), "sourcePosition", 0);
        setField(term1294, term1294.getClass(), "jsType", null);
        setField(term1294, term1294.getClass(), "parent", null);
        setField(term1274, term1274.getClass(), "first", term1294);
        setField(term1274, term1274.getClass(), "last", term1294);
        setField(term1274, term1274.getClass(), "propListHead", null);
        setIntField(term1274, term1274.getClass(), "sourcePosition", 0);
        setField(term1274, term1274.getClass(), "jsType", null);
        setField(term1274, term1274.getClass(), "parent", null);
        setField(term1272, term1272.getClass(), "next", term1274);
        setField(term1272, term1272.getClass(), "first", term1278);
        setField(term1272, term1272.getClass(), "last", term1280);
        setField(term1272, term1272.getClass(), "propListHead", null);
        setIntField(term1272, term1272.getClass(), "sourcePosition", 0);
        setField(term1272, term1272.getClass(), "jsType", null);
        setField(term1272, term1272.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1272;
        try {
            callMethod(klass, "addChildrenToBack", argTypes, term1245, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


