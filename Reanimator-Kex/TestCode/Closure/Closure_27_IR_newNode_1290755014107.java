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

public class IR_newNode_1290755014107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1295;
     Object term1322;

    public IR_newNode_1290755014107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1295, term1295.getClass(), "type", -1488938905);
        setIntField(term1297, term1297.getClass(), "type", 1916544127);
        setIntField(term1299, term1299.getClass(), "type", -1133405894);
        setIntField(term1301, term1301.getClass(), "type", 1289741214);
        setIntField(term1303, term1303.getClass(), "type", 243280944);
        setField(term1303, term1303.getClass(), "next", null);
        setField(term1303, term1303.getClass(), "first", null);
        setField(term1303, term1303.getClass(), "last", null);
        setField(term1303, term1303.getClass(), "propListHead", null);
        setIntField(term1303, term1303.getClass(), "sourcePosition", 0);
        setField(term1303, term1303.getClass(), "jsType", null);
        setField(term1303, term1303.getClass(), "parent", null);
        setField(term1301, term1301.getClass(), "next", term1303);
        setIntField(term1306, term1306.getClass(), "type", -726681073);
        setField(term1306, term1306.getClass(), "next", null);
        setField(term1306, term1306.getClass(), "first", null);
        setField(term1306, term1306.getClass(), "last", term1303);
        setField(term1306, term1306.getClass(), "propListHead", null);
        setIntField(term1306, term1306.getClass(), "sourcePosition", 0);
        setField(term1306, term1306.getClass(), "jsType", null);
        setField(term1306, term1306.getClass(), "parent", null);
        setField(term1301, term1301.getClass(), "first", term1306);
        setField(term1301, term1301.getClass(), "last", term1299);
        setField(term1301, term1301.getClass(), "propListHead", null);
        setIntField(term1301, term1301.getClass(), "sourcePosition", 0);
        setField(term1301, term1301.getClass(), "jsType", null);
        setField(term1301, term1301.getClass(), "parent", null);
        setField(term1299, term1299.getClass(), "next", term1301);
        setField(term1299, term1299.getClass(), "first", term1303);
        setIntField(term1310, term1310.getClass(), "type", -128490829);
        setIntField(term1312, term1312.getClass(), "type", 202214133);
        setField(term1312, term1312.getClass(), "next", null);
        setField(term1312, term1312.getClass(), "first", term1306);
        setField(term1312, term1312.getClass(), "last", term1301);
        setField(term1312, term1312.getClass(), "propListHead", null);
        setIntField(term1312, term1312.getClass(), "sourcePosition", 0);
        setField(term1312, term1312.getClass(), "jsType", null);
        setField(term1312, term1312.getClass(), "parent", null);
        setField(term1310, term1310.getClass(), "next", term1312);
        setField(term1310, term1310.getClass(), "first", term1297);
        setField(term1310, term1310.getClass(), "last", term1297);
        setField(term1310, term1310.getClass(), "propListHead", null);
        setIntField(term1310, term1310.getClass(), "sourcePosition", 0);
        setField(term1310, term1310.getClass(), "jsType", null);
        setField(term1310, term1310.getClass(), "parent", null);
        setField(term1299, term1299.getClass(), "last", term1310);
        setField(term1299, term1299.getClass(), "propListHead", null);
        setIntField(term1299, term1299.getClass(), "sourcePosition", 0);
        setField(term1299, term1299.getClass(), "jsType", null);
        setField(term1299, term1299.getClass(), "parent", null);
        setField(term1297, term1297.getClass(), "next", term1299);
        setIntField(term1317, term1317.getClass(), "type", 1543091617);
        setField(term1317, term1317.getClass(), "next", term1310);
        setField(term1317, term1317.getClass(), "first", term1312);
        setField(term1317, term1317.getClass(), "last", term1295);
        setField(term1317, term1317.getClass(), "propListHead", null);
        setIntField(term1317, term1317.getClass(), "sourcePosition", 0);
        setField(term1317, term1317.getClass(), "jsType", null);
        setField(term1317, term1317.getClass(), "parent", null);
        setField(term1297, term1297.getClass(), "first", term1317);
        setField(term1297, term1297.getClass(), "last", term1317);
        setField(term1297, term1297.getClass(), "propListHead", null);
        setIntField(term1297, term1297.getClass(), "sourcePosition", 0);
        setField(term1297, term1297.getClass(), "jsType", null);
        setField(term1297, term1297.getClass(), "parent", null);
        setField(term1295, term1295.getClass(), "next", term1297);
        setField(term1295, term1295.getClass(), "first", term1301);
        setField(term1295, term1295.getClass(), "last", term1303);
        setField(term1295, term1295.getClass(), "propListHead", null);
        setIntField(term1295, term1295.getClass(), "sourcePosition", 0);
        setField(term1295, term1295.getClass(), "jsType", null);
        setField(term1295, term1295.getClass(), "parent", null);
        term1322 = (Object[]) newArray("com.google.javascript.rhino.Node", 9);
        Object term1323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1323, term1323.getClass(), "type", -763166094);
        setIntField(term1325, term1325.getClass(), "type", -222941705);
        setIntField(term1327, term1327.getClass(), "type", 291864719);
        setIntField(term1329, term1329.getClass(), "type", -1549607466);
        setField(term1329, term1329.getClass(), "next", null);
        setField(term1329, term1329.getClass(), "first", null);
        setField(term1329, term1329.getClass(), "last", term1327);
        setField(term1329, term1329.getClass(), "propListHead", null);
        setIntField(term1329, term1329.getClass(), "sourcePosition", 0);
        setField(term1329, term1329.getClass(), "jsType", null);
        setField(term1329, term1329.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "next", term1329);
        setIntField(term1332, term1332.getClass(), "type", 853609788);
        setField(term1332, term1332.getClass(), "next", null);
        setField(term1332, term1332.getClass(), "first", null);
        setField(term1332, term1332.getClass(), "last", null);
        setField(term1332, term1332.getClass(), "propListHead", null);
        setIntField(term1332, term1332.getClass(), "sourcePosition", 0);
        setField(term1332, term1332.getClass(), "jsType", null);
        setField(term1332, term1332.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "first", term1332);
        setIntField(term1335, term1335.getClass(), "type", 1639448749);
        setField(term1335, term1335.getClass(), "next", null);
        setField(term1335, term1335.getClass(), "first", term1325);
        setField(term1335, term1335.getClass(), "last", term1325);
        setField(term1335, term1335.getClass(), "propListHead", null);
        setIntField(term1335, term1335.getClass(), "sourcePosition", 0);
        setField(term1335, term1335.getClass(), "jsType", null);
        setField(term1335, term1335.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "last", term1335);
        setField(term1327, term1327.getClass(), "propListHead", null);
        setIntField(term1327, term1327.getClass(), "sourcePosition", 0);
        setField(term1327, term1327.getClass(), "jsType", null);
        setField(term1327, term1327.getClass(), "parent", null);
        setField(term1325, term1325.getClass(), "next", term1327);
        setIntField(term1339, term1339.getClass(), "type", -975748721);
        setField(term1339, term1339.getClass(), "next", term1335);
        setIntField(term1341, term1341.getClass(), "type", 873659088);
        setField(term1341, term1341.getClass(), "next", term1339);
        setField(term1341, term1341.getClass(), "first", null);
        setField(term1341, term1341.getClass(), "last", term1329);
        setField(term1341, term1341.getClass(), "propListHead", null);
        setIntField(term1341, term1341.getClass(), "sourcePosition", 0);
        setField(term1341, term1341.getClass(), "jsType", null);
        setField(term1341, term1341.getClass(), "parent", null);
        setField(term1339, term1339.getClass(), "first", term1341);
        setField(term1339, term1339.getClass(), "last", term1323);
        setField(term1339, term1339.getClass(), "propListHead", null);
        setIntField(term1339, term1339.getClass(), "sourcePosition", 0);
        setField(term1339, term1339.getClass(), "jsType", null);
        setField(term1339, term1339.getClass(), "parent", null);
        setField(term1325, term1325.getClass(), "first", term1339);
        setField(term1325, term1325.getClass(), "last", term1339);
        setField(term1325, term1325.getClass(), "propListHead", null);
        setIntField(term1325, term1325.getClass(), "sourcePosition", 0);
        setField(term1325, term1325.getClass(), "jsType", null);
        setField(term1325, term1325.getClass(), "parent", null);
        setField(term1323, term1323.getClass(), "next", term1325);
        setField(term1323, term1323.getClass(), "first", term1329);
        setField(term1323, term1323.getClass(), "last", term1332);
        setField(term1323, term1323.getClass(), "propListHead", null);
        setIntField(term1323, term1323.getClass(), "sourcePosition", 0);
        setField(term1323, term1323.getClass(), "jsType", null);
        setField(term1323, term1323.getClass(), "parent", null);
        setElement(term1322, 0, term1323);
        setElement(term1322, 1, term1332);
        setElement(term1322, 2, term1325);
        setIntField(term1347, term1347.getClass(), "type", 723812297);
        setField(term1347, term1347.getClass(), "next", term1335);
        setField(term1347, term1347.getClass(), "first", term1339);
        setField(term1347, term1347.getClass(), "last", term1335);
        setField(term1347, term1347.getClass(), "propListHead", null);
        setIntField(term1347, term1347.getClass(), "sourcePosition", 0);
        setField(term1347, term1347.getClass(), "jsType", null);
        setField(term1347, term1347.getClass(), "parent", null);
        setElement(term1322, 3, term1347);
        setElement(term1322, 4, term1347);
        setElement(term1322, 5, term1341);
        setElement(term1322, 6, term1339);
        setElement(term1322, 7, term1327);
        setElement(term1322, 8, term1347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1295;
        args[1] = term1322;
        try {
            callMethod(klass, "newNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


