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

public class NodeUtil_isControlStructure_649070953168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1275;
     Object term9425;

    public NodeUtil_isControlStructure_649070953168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1288 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1298 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1275, term1275.getClass(), "type", -1271375703);
        setIntField(term1277, term1277.getClass(), "type", -687282231);
        setIntField(term1279, term1279.getClass(), "type", 0);
        setField(term1279, term1279.getClass(), "next", null);
        setField(term1279, term1279.getClass(), "first", null);
        setField(term1279, term1279.getClass(), "last", null);
        setField(term1279, term1279.getClass(), "propListHead", null);
        setIntField(term1279, term1279.getClass(), "sourcePosition", 0);
        setField(term1279, term1279.getClass(), "jsType", null);
        setField(term1279, term1279.getClass(), "parent", null);
        setField(term1277, term1277.getClass(), "next", term1279);
        setIntField(term1282, term1282.getClass(), "type", 0);
        setField(term1282, term1282.getClass(), "next", null);
        setField(term1282, term1282.getClass(), "first", null);
        setField(term1282, term1282.getClass(), "last", null);
        setField(term1282, term1282.getClass(), "propListHead", null);
        setIntField(term1282, term1282.getClass(), "sourcePosition", 0);
        setField(term1282, term1282.getClass(), "jsType", null);
        setField(term1282, term1282.getClass(), "parent", null);
        setField(term1277, term1277.getClass(), "first", term1282);
        setIntField(term1285, term1285.getClass(), "type", 0);
        setField(term1285, term1285.getClass(), "next", null);
        setField(term1285, term1285.getClass(), "first", null);
        setField(term1285, term1285.getClass(), "last", null);
        setField(term1285, term1285.getClass(), "propListHead", null);
        setIntField(term1285, term1285.getClass(), "sourcePosition", 0);
        setField(term1285, term1285.getClass(), "jsType", null);
        setField(term1285, term1285.getClass(), "parent", null);
        setField(term1277, term1277.getClass(), "last", term1285);
        setField(term1288, term1288.getClass(), "next", null);
        setIntField(term1288, term1288.getClass(), "type", 0);
        setIntField(term1288, term1288.getClass(), "intValue", 0);
        setField(term1288, term1288.getClass(), "objectValue", null);
        setField(term1277, term1277.getClass(), "propListHead", term1288);
        setIntField(term1277, term1277.getClass(), "sourcePosition", 1863910269);
        setField(term1277, term1277.getClass(), "jsType", null);
        setField(term1277, term1277.getClass(), "parent", null);
        setField(term1275, term1275.getClass(), "next", term1277);
        setIntField(term1292, term1292.getClass(), "type", 0);
        setField(term1292, term1292.getClass(), "next", null);
        setField(term1292, term1292.getClass(), "first", null);
        setField(term1292, term1292.getClass(), "last", null);
        setField(term1292, term1292.getClass(), "propListHead", null);
        setIntField(term1292, term1292.getClass(), "sourcePosition", 0);
        setField(term1292, term1292.getClass(), "jsType", null);
        setField(term1292, term1292.getClass(), "parent", null);
        setField(term1275, term1275.getClass(), "first", term1292);
        setIntField(term1295, term1295.getClass(), "type", 0);
        setField(term1295, term1295.getClass(), "next", null);
        setField(term1295, term1295.getClass(), "first", null);
        setField(term1295, term1295.getClass(), "last", null);
        setField(term1295, term1295.getClass(), "propListHead", null);
        setIntField(term1295, term1295.getClass(), "sourcePosition", 0);
        setField(term1295, term1295.getClass(), "jsType", null);
        setField(term1295, term1295.getClass(), "parent", null);
        setField(term1275, term1275.getClass(), "last", term1295);
        setField(term1298, term1298.getClass(), "next", null);
        setIntField(term1298, term1298.getClass(), "type", 0);
        setIntField(term1298, term1298.getClass(), "intValue", 0);
        setField(term1298, term1298.getClass(), "objectValue", null);
        setField(term1275, term1275.getClass(), "propListHead", term1298);
        setIntField(term1275, term1275.getClass(), "sourcePosition", 864645689);
        setField(term1275, term1275.getClass(), "jsType", null);
        setField(term1275, term1275.getClass(), "parent", null);
        term9425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9430 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9433 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9425, term9425.getClass(), "type", -1271375703);
        setIntField(term9426, term9426.getClass(), "type", -687282231);
        setIntField(term9427, term9427.getClass(), "type", 0);
        setField(term9427, term9427.getClass(), "next", null);
        setField(term9427, term9427.getClass(), "first", null);
        setField(term9427, term9427.getClass(), "last", null);
        setField(term9427, term9427.getClass(), "propListHead", null);
        setIntField(term9427, term9427.getClass(), "sourcePosition", 0);
        setField(term9427, term9427.getClass(), "jsType", null);
        setField(term9427, term9427.getClass(), "parent", null);
        setField(term9426, term9426.getClass(), "next", term9427);
        setIntField(term9428, term9428.getClass(), "type", 0);
        setField(term9428, term9428.getClass(), "next", null);
        setField(term9428, term9428.getClass(), "first", null);
        setField(term9428, term9428.getClass(), "last", null);
        setField(term9428, term9428.getClass(), "propListHead", null);
        setIntField(term9428, term9428.getClass(), "sourcePosition", 0);
        setField(term9428, term9428.getClass(), "jsType", null);
        setField(term9428, term9428.getClass(), "parent", null);
        setField(term9426, term9426.getClass(), "first", term9428);
        setIntField(term9429, term9429.getClass(), "type", 0);
        setField(term9429, term9429.getClass(), "next", null);
        setField(term9429, term9429.getClass(), "first", null);
        setField(term9429, term9429.getClass(), "last", null);
        setField(term9429, term9429.getClass(), "propListHead", null);
        setIntField(term9429, term9429.getClass(), "sourcePosition", 0);
        setField(term9429, term9429.getClass(), "jsType", null);
        setField(term9429, term9429.getClass(), "parent", null);
        setField(term9426, term9426.getClass(), "last", term9429);
        setField(term9430, term9430.getClass(), "next", null);
        setIntField(term9430, term9430.getClass(), "type", 0);
        setIntField(term9430, term9430.getClass(), "intValue", 0);
        setField(term9430, term9430.getClass(), "objectValue", null);
        setField(term9426, term9426.getClass(), "propListHead", term9430);
        setIntField(term9426, term9426.getClass(), "sourcePosition", 1863910269);
        setField(term9426, term9426.getClass(), "jsType", null);
        setField(term9426, term9426.getClass(), "parent", null);
        setField(term9425, term9425.getClass(), "next", term9426);
        setIntField(term9431, term9431.getClass(), "type", 0);
        setField(term9431, term9431.getClass(), "next", null);
        setField(term9431, term9431.getClass(), "first", null);
        setField(term9431, term9431.getClass(), "last", null);
        setField(term9431, term9431.getClass(), "propListHead", null);
        setIntField(term9431, term9431.getClass(), "sourcePosition", 0);
        setField(term9431, term9431.getClass(), "jsType", null);
        setField(term9431, term9431.getClass(), "parent", null);
        setField(term9425, term9425.getClass(), "first", term9431);
        setIntField(term9432, term9432.getClass(), "type", 0);
        setField(term9432, term9432.getClass(), "next", null);
        setField(term9432, term9432.getClass(), "first", null);
        setField(term9432, term9432.getClass(), "last", null);
        setField(term9432, term9432.getClass(), "propListHead", null);
        setIntField(term9432, term9432.getClass(), "sourcePosition", 0);
        setField(term9432, term9432.getClass(), "jsType", null);
        setField(term9432, term9432.getClass(), "parent", null);
        setField(term9425, term9425.getClass(), "last", term9432);
        setField(term9433, term9433.getClass(), "next", null);
        setIntField(term9433, term9433.getClass(), "type", 0);
        setIntField(term9433, term9433.getClass(), "intValue", 0);
        setField(term9433, term9433.getClass(), "objectValue", null);
        setField(term9425, term9425.getClass(), "propListHead", term9433);
        setIntField(term9425, term9425.getClass(), "sourcePosition", 864645689);
        setField(term9425, term9425.getClass(), "jsType", null);
        setField(term9425, term9425.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1275;
        Object retValue = callMethod(klass, "isControlStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1275, term9425));
        assertTrue(recursiveEquals(retValue, false));
    }

};


