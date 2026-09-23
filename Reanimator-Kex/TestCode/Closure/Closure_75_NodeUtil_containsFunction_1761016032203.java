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

public class NodeUtil_containsFunction_1761016032203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1271;
     Object term11700;

    public NodeUtil_containsFunction_1761016032203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1284 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1294 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1271, term1271.getClass(), "type", 990883365);
        setIntField(term1273, term1273.getClass(), "type", 514511037);
        setIntField(term1275, term1275.getClass(), "type", 0);
        setField(term1275, term1275.getClass(), "next", null);
        setField(term1275, term1275.getClass(), "first", null);
        setField(term1275, term1275.getClass(), "last", null);
        setField(term1275, term1275.getClass(), "propListHead", null);
        setIntField(term1275, term1275.getClass(), "sourcePosition", 0);
        setField(term1275, term1275.getClass(), "jsType", null);
        setField(term1275, term1275.getClass(), "parent", null);
        setField(term1273, term1273.getClass(), "next", term1275);
        setIntField(term1278, term1278.getClass(), "type", 0);
        setField(term1278, term1278.getClass(), "next", null);
        setField(term1278, term1278.getClass(), "first", null);
        setField(term1278, term1278.getClass(), "last", null);
        setField(term1278, term1278.getClass(), "propListHead", null);
        setIntField(term1278, term1278.getClass(), "sourcePosition", 0);
        setField(term1278, term1278.getClass(), "jsType", null);
        setField(term1278, term1278.getClass(), "parent", null);
        setField(term1273, term1273.getClass(), "first", term1278);
        setIntField(term1281, term1281.getClass(), "type", 0);
        setField(term1281, term1281.getClass(), "next", null);
        setField(term1281, term1281.getClass(), "first", null);
        setField(term1281, term1281.getClass(), "last", null);
        setField(term1281, term1281.getClass(), "propListHead", null);
        setIntField(term1281, term1281.getClass(), "sourcePosition", 0);
        setField(term1281, term1281.getClass(), "jsType", null);
        setField(term1281, term1281.getClass(), "parent", null);
        setField(term1273, term1273.getClass(), "last", term1281);
        setField(term1284, term1284.getClass(), "next", null);
        setIntField(term1284, term1284.getClass(), "type", 0);
        setIntField(term1284, term1284.getClass(), "intValue", 0);
        setField(term1284, term1284.getClass(), "objectValue", null);
        setField(term1273, term1273.getClass(), "propListHead", term1284);
        setIntField(term1273, term1273.getClass(), "sourcePosition", 1467356494);
        setField(term1273, term1273.getClass(), "jsType", null);
        setField(term1273, term1273.getClass(), "parent", null);
        setField(term1271, term1271.getClass(), "next", term1273);
        setIntField(term1288, term1288.getClass(), "type", 0);
        setField(term1288, term1288.getClass(), "next", null);
        setField(term1288, term1288.getClass(), "first", null);
        setField(term1288, term1288.getClass(), "last", null);
        setField(term1288, term1288.getClass(), "propListHead", null);
        setIntField(term1288, term1288.getClass(), "sourcePosition", 0);
        setField(term1288, term1288.getClass(), "jsType", null);
        setField(term1288, term1288.getClass(), "parent", null);
        setField(term1271, term1271.getClass(), "first", term1288);
        setIntField(term1291, term1291.getClass(), "type", 0);
        setField(term1291, term1291.getClass(), "next", null);
        setField(term1291, term1291.getClass(), "first", null);
        setField(term1291, term1291.getClass(), "last", null);
        setField(term1291, term1291.getClass(), "propListHead", null);
        setIntField(term1291, term1291.getClass(), "sourcePosition", 0);
        setField(term1291, term1291.getClass(), "jsType", null);
        setField(term1291, term1291.getClass(), "parent", null);
        setField(term1271, term1271.getClass(), "last", term1291);
        setField(term1294, term1294.getClass(), "next", null);
        setIntField(term1294, term1294.getClass(), "type", 0);
        setIntField(term1294, term1294.getClass(), "intValue", 0);
        setField(term1294, term1294.getClass(), "objectValue", null);
        setField(term1271, term1271.getClass(), "propListHead", term1294);
        setIntField(term1271, term1271.getClass(), "sourcePosition", -26316536);
        setField(term1271, term1271.getClass(), "jsType", null);
        setField(term1271, term1271.getClass(), "parent", null);
        term11700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11705 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11708 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11700, term11700.getClass(), "type", 990883365);
        setIntField(term11701, term11701.getClass(), "type", 514511037);
        setIntField(term11702, term11702.getClass(), "type", 0);
        setField(term11702, term11702.getClass(), "next", null);
        setField(term11702, term11702.getClass(), "first", null);
        setField(term11702, term11702.getClass(), "last", null);
        setField(term11702, term11702.getClass(), "propListHead", null);
        setIntField(term11702, term11702.getClass(), "sourcePosition", 0);
        setField(term11702, term11702.getClass(), "jsType", null);
        setField(term11702, term11702.getClass(), "parent", null);
        setField(term11701, term11701.getClass(), "next", term11702);
        setIntField(term11703, term11703.getClass(), "type", 0);
        setField(term11703, term11703.getClass(), "next", null);
        setField(term11703, term11703.getClass(), "first", null);
        setField(term11703, term11703.getClass(), "last", null);
        setField(term11703, term11703.getClass(), "propListHead", null);
        setIntField(term11703, term11703.getClass(), "sourcePosition", 0);
        setField(term11703, term11703.getClass(), "jsType", null);
        setField(term11703, term11703.getClass(), "parent", null);
        setField(term11701, term11701.getClass(), "first", term11703);
        setIntField(term11704, term11704.getClass(), "type", 0);
        setField(term11704, term11704.getClass(), "next", null);
        setField(term11704, term11704.getClass(), "first", null);
        setField(term11704, term11704.getClass(), "last", null);
        setField(term11704, term11704.getClass(), "propListHead", null);
        setIntField(term11704, term11704.getClass(), "sourcePosition", 0);
        setField(term11704, term11704.getClass(), "jsType", null);
        setField(term11704, term11704.getClass(), "parent", null);
        setField(term11701, term11701.getClass(), "last", term11704);
        setField(term11705, term11705.getClass(), "next", null);
        setIntField(term11705, term11705.getClass(), "type", 0);
        setIntField(term11705, term11705.getClass(), "intValue", 0);
        setField(term11705, term11705.getClass(), "objectValue", null);
        setField(term11701, term11701.getClass(), "propListHead", term11705);
        setIntField(term11701, term11701.getClass(), "sourcePosition", 1467356494);
        setField(term11701, term11701.getClass(), "jsType", null);
        setField(term11701, term11701.getClass(), "parent", null);
        setField(term11700, term11700.getClass(), "next", term11701);
        setIntField(term11706, term11706.getClass(), "type", 0);
        setField(term11706, term11706.getClass(), "next", null);
        setField(term11706, term11706.getClass(), "first", null);
        setField(term11706, term11706.getClass(), "last", null);
        setField(term11706, term11706.getClass(), "propListHead", null);
        setIntField(term11706, term11706.getClass(), "sourcePosition", 0);
        setField(term11706, term11706.getClass(), "jsType", null);
        setField(term11706, term11706.getClass(), "parent", null);
        setField(term11700, term11700.getClass(), "first", term11706);
        setIntField(term11707, term11707.getClass(), "type", 0);
        setField(term11707, term11707.getClass(), "next", null);
        setField(term11707, term11707.getClass(), "first", null);
        setField(term11707, term11707.getClass(), "last", null);
        setField(term11707, term11707.getClass(), "propListHead", null);
        setIntField(term11707, term11707.getClass(), "sourcePosition", 0);
        setField(term11707, term11707.getClass(), "jsType", null);
        setField(term11707, term11707.getClass(), "parent", null);
        setField(term11700, term11700.getClass(), "last", term11707);
        setField(term11708, term11708.getClass(), "next", null);
        setIntField(term11708, term11708.getClass(), "type", 0);
        setIntField(term11708, term11708.getClass(), "intValue", 0);
        setField(term11708, term11708.getClass(), "objectValue", null);
        setField(term11700, term11700.getClass(), "propListHead", term11708);
        setIntField(term11700, term11700.getClass(), "sourcePosition", -26316536);
        setField(term11700, term11700.getClass(), "jsType", null);
        setField(term11700, term11700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1271;
        callMethod(klass, "containsFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1271, term11700));
    }

};


