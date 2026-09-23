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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_getprop_1085480561109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1372;
     Object term1399;

    public IR_getprop_1085480561109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1372, term1372.getClass(), "type", 433248783);
        setIntField(term1374, term1374.getClass(), "type", -507944154);
        setIntField(term1376, term1376.getClass(), "type", -1736183862);
        setIntField(term1378, term1378.getClass(), "type", 897010381);
        setIntField(term1380, term1380.getClass(), "type", -15712667);
        setField(term1380, term1380.getClass(), "next", null);
        setField(term1380, term1380.getClass(), "first", null);
        setField(term1380, term1380.getClass(), "last", null);
        setField(term1380, term1380.getClass(), "propListHead", null);
        setIntField(term1380, term1380.getClass(), "sourcePosition", 0);
        setField(term1380, term1380.getClass(), "jsType", null);
        setField(term1380, term1380.getClass(), "parent", null);
        setField(term1378, term1378.getClass(), "next", term1380);
        setIntField(term1383, term1383.getClass(), "type", 1964967720);
        setField(term1383, term1383.getClass(), "next", null);
        setField(term1383, term1383.getClass(), "first", null);
        setField(term1383, term1383.getClass(), "last", term1380);
        setField(term1383, term1383.getClass(), "propListHead", null);
        setIntField(term1383, term1383.getClass(), "sourcePosition", 0);
        setField(term1383, term1383.getClass(), "jsType", null);
        setField(term1383, term1383.getClass(), "parent", null);
        setField(term1378, term1378.getClass(), "first", term1383);
        setField(term1378, term1378.getClass(), "last", term1376);
        setField(term1378, term1378.getClass(), "propListHead", null);
        setIntField(term1378, term1378.getClass(), "sourcePosition", 0);
        setField(term1378, term1378.getClass(), "jsType", null);
        setField(term1378, term1378.getClass(), "parent", null);
        setField(term1376, term1376.getClass(), "next", term1378);
        setField(term1376, term1376.getClass(), "first", term1380);
        setIntField(term1387, term1387.getClass(), "type", -330897705);
        setIntField(term1389, term1389.getClass(), "type", 1065595802);
        setField(term1389, term1389.getClass(), "next", null);
        setField(term1389, term1389.getClass(), "first", term1383);
        setField(term1389, term1389.getClass(), "last", term1378);
        setField(term1389, term1389.getClass(), "propListHead", null);
        setIntField(term1389, term1389.getClass(), "sourcePosition", 0);
        setField(term1389, term1389.getClass(), "jsType", null);
        setField(term1389, term1389.getClass(), "parent", null);
        setField(term1387, term1387.getClass(), "next", term1389);
        setField(term1387, term1387.getClass(), "first", term1374);
        setField(term1387, term1387.getClass(), "last", term1374);
        setField(term1387, term1387.getClass(), "propListHead", null);
        setIntField(term1387, term1387.getClass(), "sourcePosition", 0);
        setField(term1387, term1387.getClass(), "jsType", null);
        setField(term1387, term1387.getClass(), "parent", null);
        setField(term1376, term1376.getClass(), "last", term1387);
        setField(term1376, term1376.getClass(), "propListHead", null);
        setIntField(term1376, term1376.getClass(), "sourcePosition", 0);
        setField(term1376, term1376.getClass(), "jsType", null);
        setField(term1376, term1376.getClass(), "parent", null);
        setField(term1374, term1374.getClass(), "next", term1376);
        setIntField(term1394, term1394.getClass(), "type", 21031843);
        setField(term1394, term1394.getClass(), "next", term1387);
        setField(term1394, term1394.getClass(), "first", term1389);
        setField(term1394, term1394.getClass(), "last", term1372);
        setField(term1394, term1394.getClass(), "propListHead", null);
        setIntField(term1394, term1394.getClass(), "sourcePosition", 0);
        setField(term1394, term1394.getClass(), "jsType", null);
        setField(term1394, term1394.getClass(), "parent", null);
        setField(term1374, term1374.getClass(), "first", term1394);
        setField(term1374, term1374.getClass(), "last", term1394);
        setField(term1374, term1374.getClass(), "propListHead", null);
        setIntField(term1374, term1374.getClass(), "sourcePosition", 0);
        setField(term1374, term1374.getClass(), "jsType", null);
        setField(term1374, term1374.getClass(), "parent", null);
        setField(term1372, term1372.getClass(), "next", term1374);
        setField(term1372, term1372.getClass(), "first", term1378);
        setField(term1372, term1372.getClass(), "last", term1380);
        setField(term1372, term1372.getClass(), "propListHead", null);
        setIntField(term1372, term1372.getClass(), "sourcePosition", 0);
        setField(term1372, term1372.getClass(), "jsType", null);
        setField(term1372, term1372.getClass(), "parent", null);
        term1399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1399, term1399.getClass(), "type", -380787857);
        setIntField(term1401, term1401.getClass(), "type", 319853052);
        setIntField(term1403, term1403.getClass(), "type", -1097563716);
        setIntField(term1405, term1405.getClass(), "type", 1572907769);
        setIntField(term1407, term1407.getClass(), "type", 1608016787);
        setField(term1407, term1407.getClass(), "next", null);
        setField(term1407, term1407.getClass(), "first", null);
        setField(term1407, term1407.getClass(), "last", null);
        setField(term1407, term1407.getClass(), "propListHead", null);
        setIntField(term1407, term1407.getClass(), "sourcePosition", 0);
        setField(term1407, term1407.getClass(), "jsType", null);
        setField(term1407, term1407.getClass(), "parent", null);
        setField(term1405, term1405.getClass(), "next", term1407);
        setIntField(term1410, term1410.getClass(), "type", -516303035);
        setField(term1410, term1410.getClass(), "next", null);
        setField(term1410, term1410.getClass(), "first", null);
        setField(term1410, term1410.getClass(), "last", term1407);
        setField(term1410, term1410.getClass(), "propListHead", null);
        setIntField(term1410, term1410.getClass(), "sourcePosition", 0);
        setField(term1410, term1410.getClass(), "jsType", null);
        setField(term1410, term1410.getClass(), "parent", null);
        setField(term1405, term1405.getClass(), "first", term1410);
        setField(term1405, term1405.getClass(), "last", term1403);
        setField(term1405, term1405.getClass(), "propListHead", null);
        setIntField(term1405, term1405.getClass(), "sourcePosition", 0);
        setField(term1405, term1405.getClass(), "jsType", null);
        setField(term1405, term1405.getClass(), "parent", null);
        setField(term1403, term1403.getClass(), "next", term1405);
        setField(term1403, term1403.getClass(), "first", term1407);
        setIntField(term1414, term1414.getClass(), "type", -2138825831);
        setIntField(term1416, term1416.getClass(), "type", 1454781562);
        setField(term1416, term1416.getClass(), "next", null);
        setField(term1416, term1416.getClass(), "first", term1410);
        setField(term1416, term1416.getClass(), "last", term1405);
        setField(term1416, term1416.getClass(), "propListHead", null);
        setIntField(term1416, term1416.getClass(), "sourcePosition", 0);
        setField(term1416, term1416.getClass(), "jsType", null);
        setField(term1416, term1416.getClass(), "parent", null);
        setField(term1414, term1414.getClass(), "next", term1416);
        setField(term1414, term1414.getClass(), "first", term1401);
        setField(term1414, term1414.getClass(), "last", term1401);
        setField(term1414, term1414.getClass(), "propListHead", null);
        setIntField(term1414, term1414.getClass(), "sourcePosition", 0);
        setField(term1414, term1414.getClass(), "jsType", null);
        setField(term1414, term1414.getClass(), "parent", null);
        setField(term1403, term1403.getClass(), "last", term1414);
        setField(term1403, term1403.getClass(), "propListHead", null);
        setIntField(term1403, term1403.getClass(), "sourcePosition", 0);
        setField(term1403, term1403.getClass(), "jsType", null);
        setField(term1403, term1403.getClass(), "parent", null);
        setField(term1401, term1401.getClass(), "next", term1403);
        setIntField(term1421, term1421.getClass(), "type", -27944011);
        setField(term1421, term1421.getClass(), "next", term1414);
        setField(term1421, term1421.getClass(), "first", term1416);
        setField(term1421, term1421.getClass(), "last", term1399);
        setField(term1421, term1421.getClass(), "propListHead", null);
        setIntField(term1421, term1421.getClass(), "sourcePosition", 0);
        setField(term1421, term1421.getClass(), "jsType", null);
        setField(term1421, term1421.getClass(), "parent", null);
        setField(term1401, term1401.getClass(), "first", term1421);
        setField(term1401, term1401.getClass(), "last", term1421);
        setField(term1401, term1401.getClass(), "propListHead", null);
        setIntField(term1401, term1401.getClass(), "sourcePosition", 0);
        setField(term1401, term1401.getClass(), "jsType", null);
        setField(term1401, term1401.getClass(), "parent", null);
        setField(term1399, term1399.getClass(), "next", term1401);
        setField(term1399, term1399.getClass(), "first", term1405);
        setField(term1399, term1399.getClass(), "last", term1407);
        setField(term1399, term1399.getClass(), "propListHead", null);
        setIntField(term1399, term1399.getClass(), "sourcePosition", 0);
        setField(term1399, term1399.getClass(), "jsType", null);
        setField(term1399, term1399.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1372;
        args[1] = term1399;
        try {
            callMethod(klass, "getprop", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


