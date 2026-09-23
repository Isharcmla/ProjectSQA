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
     Object term11406;

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
        term11406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11411 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11414 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11406, term11406.getClass(), "type", 990883365);
        setIntField(term11407, term11407.getClass(), "type", 514511037);
        setIntField(term11408, term11408.getClass(), "type", 0);
        setField(term11408, term11408.getClass(), "next", null);
        setField(term11408, term11408.getClass(), "first", null);
        setField(term11408, term11408.getClass(), "last", null);
        setField(term11408, term11408.getClass(), "propListHead", null);
        setIntField(term11408, term11408.getClass(), "sourcePosition", 0);
        setField(term11408, term11408.getClass(), "jsType", null);
        setField(term11408, term11408.getClass(), "parent", null);
        setField(term11407, term11407.getClass(), "next", term11408);
        setIntField(term11409, term11409.getClass(), "type", 0);
        setField(term11409, term11409.getClass(), "next", null);
        setField(term11409, term11409.getClass(), "first", null);
        setField(term11409, term11409.getClass(), "last", null);
        setField(term11409, term11409.getClass(), "propListHead", null);
        setIntField(term11409, term11409.getClass(), "sourcePosition", 0);
        setField(term11409, term11409.getClass(), "jsType", null);
        setField(term11409, term11409.getClass(), "parent", null);
        setField(term11407, term11407.getClass(), "first", term11409);
        setIntField(term11410, term11410.getClass(), "type", 0);
        setField(term11410, term11410.getClass(), "next", null);
        setField(term11410, term11410.getClass(), "first", null);
        setField(term11410, term11410.getClass(), "last", null);
        setField(term11410, term11410.getClass(), "propListHead", null);
        setIntField(term11410, term11410.getClass(), "sourcePosition", 0);
        setField(term11410, term11410.getClass(), "jsType", null);
        setField(term11410, term11410.getClass(), "parent", null);
        setField(term11407, term11407.getClass(), "last", term11410);
        setField(term11411, term11411.getClass(), "next", null);
        setIntField(term11411, term11411.getClass(), "type", 0);
        setIntField(term11411, term11411.getClass(), "intValue", 0);
        setField(term11411, term11411.getClass(), "objectValue", null);
        setField(term11407, term11407.getClass(), "propListHead", term11411);
        setIntField(term11407, term11407.getClass(), "sourcePosition", 1467356494);
        setField(term11407, term11407.getClass(), "jsType", null);
        setField(term11407, term11407.getClass(), "parent", null);
        setField(term11406, term11406.getClass(), "next", term11407);
        setIntField(term11412, term11412.getClass(), "type", 0);
        setField(term11412, term11412.getClass(), "next", null);
        setField(term11412, term11412.getClass(), "first", null);
        setField(term11412, term11412.getClass(), "last", null);
        setField(term11412, term11412.getClass(), "propListHead", null);
        setIntField(term11412, term11412.getClass(), "sourcePosition", 0);
        setField(term11412, term11412.getClass(), "jsType", null);
        setField(term11412, term11412.getClass(), "parent", null);
        setField(term11406, term11406.getClass(), "first", term11412);
        setIntField(term11413, term11413.getClass(), "type", 0);
        setField(term11413, term11413.getClass(), "next", null);
        setField(term11413, term11413.getClass(), "first", null);
        setField(term11413, term11413.getClass(), "last", null);
        setField(term11413, term11413.getClass(), "propListHead", null);
        setIntField(term11413, term11413.getClass(), "sourcePosition", 0);
        setField(term11413, term11413.getClass(), "jsType", null);
        setField(term11413, term11413.getClass(), "parent", null);
        setField(term11406, term11406.getClass(), "last", term11413);
        setField(term11414, term11414.getClass(), "next", null);
        setIntField(term11414, term11414.getClass(), "type", 0);
        setIntField(term11414, term11414.getClass(), "intValue", 0);
        setField(term11414, term11414.getClass(), "objectValue", null);
        setField(term11406, term11406.getClass(), "propListHead", term11414);
        setIntField(term11406, term11406.getClass(), "sourcePosition", -26316536);
        setField(term11406, term11406.getClass(), "jsType", null);
        setField(term11406, term11406.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1271;
        callMethod(klass, "containsFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1271, term11406));
    }

};


