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

public class NodeUtil_isControlStructureCodeBlock_763580606169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1302;
     Object term1329;

    public NodeUtil_isControlStructureCodeBlock_763580606169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1315 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1325 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1302, term1302.getClass(), "type", 797203987);
        setIntField(term1304, term1304.getClass(), "type", 1406617209);
        setIntField(term1306, term1306.getClass(), "type", 0);
        setField(term1306, term1306.getClass(), "next", null);
        setField(term1306, term1306.getClass(), "first", null);
        setField(term1306, term1306.getClass(), "last", null);
        setField(term1306, term1306.getClass(), "propListHead", null);
        setIntField(term1306, term1306.getClass(), "sourcePosition", 0);
        setField(term1306, term1306.getClass(), "jsType", null);
        setField(term1306, term1306.getClass(), "parent", null);
        setField(term1304, term1304.getClass(), "next", term1306);
        setIntField(term1309, term1309.getClass(), "type", 0);
        setField(term1309, term1309.getClass(), "next", null);
        setField(term1309, term1309.getClass(), "first", null);
        setField(term1309, term1309.getClass(), "last", null);
        setField(term1309, term1309.getClass(), "propListHead", null);
        setIntField(term1309, term1309.getClass(), "sourcePosition", 0);
        setField(term1309, term1309.getClass(), "jsType", null);
        setField(term1309, term1309.getClass(), "parent", null);
        setField(term1304, term1304.getClass(), "first", term1309);
        setIntField(term1312, term1312.getClass(), "type", 0);
        setField(term1312, term1312.getClass(), "next", null);
        setField(term1312, term1312.getClass(), "first", null);
        setField(term1312, term1312.getClass(), "last", null);
        setField(term1312, term1312.getClass(), "propListHead", null);
        setIntField(term1312, term1312.getClass(), "sourcePosition", 0);
        setField(term1312, term1312.getClass(), "jsType", null);
        setField(term1312, term1312.getClass(), "parent", null);
        setField(term1304, term1304.getClass(), "last", term1312);
        setField(term1315, term1315.getClass(), "next", null);
        setIntField(term1315, term1315.getClass(), "type", 0);
        setIntField(term1315, term1315.getClass(), "intValue", 0);
        setField(term1315, term1315.getClass(), "objectValue", null);
        setField(term1304, term1304.getClass(), "propListHead", term1315);
        setIntField(term1304, term1304.getClass(), "sourcePosition", -1999787419);
        setField(term1304, term1304.getClass(), "jsType", null);
        setField(term1304, term1304.getClass(), "parent", null);
        setField(term1302, term1302.getClass(), "next", term1304);
        setIntField(term1319, term1319.getClass(), "type", 0);
        setField(term1319, term1319.getClass(), "next", null);
        setField(term1319, term1319.getClass(), "first", null);
        setField(term1319, term1319.getClass(), "last", null);
        setField(term1319, term1319.getClass(), "propListHead", null);
        setIntField(term1319, term1319.getClass(), "sourcePosition", 0);
        setField(term1319, term1319.getClass(), "jsType", null);
        setField(term1319, term1319.getClass(), "parent", null);
        setField(term1302, term1302.getClass(), "first", term1319);
        setIntField(term1322, term1322.getClass(), "type", 0);
        setField(term1322, term1322.getClass(), "next", null);
        setField(term1322, term1322.getClass(), "first", null);
        setField(term1322, term1322.getClass(), "last", null);
        setField(term1322, term1322.getClass(), "propListHead", null);
        setIntField(term1322, term1322.getClass(), "sourcePosition", 0);
        setField(term1322, term1322.getClass(), "jsType", null);
        setField(term1322, term1322.getClass(), "parent", null);
        setField(term1302, term1302.getClass(), "last", term1322);
        setField(term1325, term1325.getClass(), "next", null);
        setIntField(term1325, term1325.getClass(), "type", 0);
        setIntField(term1325, term1325.getClass(), "intValue", 0);
        setField(term1325, term1325.getClass(), "objectValue", null);
        setField(term1302, term1302.getClass(), "propListHead", term1325);
        setIntField(term1302, term1302.getClass(), "sourcePosition", -1224443634);
        setField(term1302, term1302.getClass(), "jsType", null);
        setField(term1302, term1302.getClass(), "parent", null);
        term1329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1342 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1352 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1329, term1329.getClass(), "type", -1973791064);
        setIntField(term1331, term1331.getClass(), "type", 1633913667);
        setIntField(term1333, term1333.getClass(), "type", 0);
        setField(term1333, term1333.getClass(), "next", null);
        setField(term1333, term1333.getClass(), "first", null);
        setField(term1333, term1333.getClass(), "last", null);
        setField(term1333, term1333.getClass(), "propListHead", null);
        setIntField(term1333, term1333.getClass(), "sourcePosition", 0);
        setField(term1333, term1333.getClass(), "jsType", null);
        setField(term1333, term1333.getClass(), "parent", null);
        setField(term1331, term1331.getClass(), "next", term1333);
        setIntField(term1336, term1336.getClass(), "type", 0);
        setField(term1336, term1336.getClass(), "next", null);
        setField(term1336, term1336.getClass(), "first", null);
        setField(term1336, term1336.getClass(), "last", null);
        setField(term1336, term1336.getClass(), "propListHead", null);
        setIntField(term1336, term1336.getClass(), "sourcePosition", 0);
        setField(term1336, term1336.getClass(), "jsType", null);
        setField(term1336, term1336.getClass(), "parent", null);
        setField(term1331, term1331.getClass(), "first", term1336);
        setIntField(term1339, term1339.getClass(), "type", 0);
        setField(term1339, term1339.getClass(), "next", null);
        setField(term1339, term1339.getClass(), "first", null);
        setField(term1339, term1339.getClass(), "last", null);
        setField(term1339, term1339.getClass(), "propListHead", null);
        setIntField(term1339, term1339.getClass(), "sourcePosition", 0);
        setField(term1339, term1339.getClass(), "jsType", null);
        setField(term1339, term1339.getClass(), "parent", null);
        setField(term1331, term1331.getClass(), "last", term1339);
        setField(term1342, term1342.getClass(), "next", null);
        setIntField(term1342, term1342.getClass(), "type", 0);
        setIntField(term1342, term1342.getClass(), "intValue", 0);
        setField(term1342, term1342.getClass(), "objectValue", null);
        setField(term1331, term1331.getClass(), "propListHead", term1342);
        setIntField(term1331, term1331.getClass(), "sourcePosition", 612177768);
        setField(term1331, term1331.getClass(), "jsType", null);
        setField(term1331, term1331.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "next", term1331);
        setIntField(term1346, term1346.getClass(), "type", 0);
        setField(term1346, term1346.getClass(), "next", null);
        setField(term1346, term1346.getClass(), "first", null);
        setField(term1346, term1346.getClass(), "last", null);
        setField(term1346, term1346.getClass(), "propListHead", null);
        setIntField(term1346, term1346.getClass(), "sourcePosition", 0);
        setField(term1346, term1346.getClass(), "jsType", null);
        setField(term1346, term1346.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "first", term1346);
        setIntField(term1349, term1349.getClass(), "type", 0);
        setField(term1349, term1349.getClass(), "next", null);
        setField(term1349, term1349.getClass(), "first", null);
        setField(term1349, term1349.getClass(), "last", null);
        setField(term1349, term1349.getClass(), "propListHead", null);
        setIntField(term1349, term1349.getClass(), "sourcePosition", 0);
        setField(term1349, term1349.getClass(), "jsType", null);
        setField(term1349, term1349.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "last", term1349);
        setField(term1352, term1352.getClass(), "next", null);
        setIntField(term1352, term1352.getClass(), "type", 0);
        setIntField(term1352, term1352.getClass(), "intValue", 0);
        setField(term1352, term1352.getClass(), "objectValue", null);
        setField(term1329, term1329.getClass(), "propListHead", term1352);
        setIntField(term1329, term1329.getClass(), "sourcePosition", -1626451656);
        setField(term1329, term1329.getClass(), "jsType", null);
        setField(term1329, term1329.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1302;
        args[1] = term1329;
        try {
            callMethod(klass, "isControlStructureCodeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


