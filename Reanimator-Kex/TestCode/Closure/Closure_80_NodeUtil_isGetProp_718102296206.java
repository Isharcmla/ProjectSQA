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

public class NodeUtil_isGetProp_718102296206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352;
     Object term11625;

    public NodeUtil_isGetProp_718102296206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1365 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1375 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1352, term1352.getClass(), "type", -138239905);
        setIntField(term1354, term1354.getClass(), "type", 590451710);
        setIntField(term1356, term1356.getClass(), "type", 0);
        setField(term1356, term1356.getClass(), "next", null);
        setField(term1356, term1356.getClass(), "first", null);
        setField(term1356, term1356.getClass(), "last", null);
        setField(term1356, term1356.getClass(), "propListHead", null);
        setIntField(term1356, term1356.getClass(), "sourcePosition", 0);
        setField(term1356, term1356.getClass(), "jsType", null);
        setField(term1356, term1356.getClass(), "parent", null);
        setField(term1354, term1354.getClass(), "next", term1356);
        setIntField(term1359, term1359.getClass(), "type", 0);
        setField(term1359, term1359.getClass(), "next", null);
        setField(term1359, term1359.getClass(), "first", null);
        setField(term1359, term1359.getClass(), "last", null);
        setField(term1359, term1359.getClass(), "propListHead", null);
        setIntField(term1359, term1359.getClass(), "sourcePosition", 0);
        setField(term1359, term1359.getClass(), "jsType", null);
        setField(term1359, term1359.getClass(), "parent", null);
        setField(term1354, term1354.getClass(), "first", term1359);
        setIntField(term1362, term1362.getClass(), "type", 0);
        setField(term1362, term1362.getClass(), "next", null);
        setField(term1362, term1362.getClass(), "first", null);
        setField(term1362, term1362.getClass(), "last", null);
        setField(term1362, term1362.getClass(), "propListHead", null);
        setIntField(term1362, term1362.getClass(), "sourcePosition", 0);
        setField(term1362, term1362.getClass(), "jsType", null);
        setField(term1362, term1362.getClass(), "parent", null);
        setField(term1354, term1354.getClass(), "last", term1362);
        setField(term1365, term1365.getClass(), "next", null);
        setIntField(term1365, term1365.getClass(), "type", 0);
        setIntField(term1365, term1365.getClass(), "intValue", 0);
        setField(term1365, term1365.getClass(), "objectValue", null);
        setField(term1354, term1354.getClass(), "propListHead", term1365);
        setIntField(term1354, term1354.getClass(), "sourcePosition", 1048451946);
        setField(term1354, term1354.getClass(), "jsType", null);
        setField(term1354, term1354.getClass(), "parent", null);
        setField(term1352, term1352.getClass(), "next", term1354);
        setIntField(term1369, term1369.getClass(), "type", 0);
        setField(term1369, term1369.getClass(), "next", null);
        setField(term1369, term1369.getClass(), "first", null);
        setField(term1369, term1369.getClass(), "last", null);
        setField(term1369, term1369.getClass(), "propListHead", null);
        setIntField(term1369, term1369.getClass(), "sourcePosition", 0);
        setField(term1369, term1369.getClass(), "jsType", null);
        setField(term1369, term1369.getClass(), "parent", null);
        setField(term1352, term1352.getClass(), "first", term1369);
        setIntField(term1372, term1372.getClass(), "type", 0);
        setField(term1372, term1372.getClass(), "next", null);
        setField(term1372, term1372.getClass(), "first", null);
        setField(term1372, term1372.getClass(), "last", null);
        setField(term1372, term1372.getClass(), "propListHead", null);
        setIntField(term1372, term1372.getClass(), "sourcePosition", 0);
        setField(term1372, term1372.getClass(), "jsType", null);
        setField(term1372, term1372.getClass(), "parent", null);
        setField(term1352, term1352.getClass(), "last", term1372);
        setField(term1375, term1375.getClass(), "next", null);
        setIntField(term1375, term1375.getClass(), "type", 0);
        setIntField(term1375, term1375.getClass(), "intValue", 0);
        setField(term1375, term1375.getClass(), "objectValue", null);
        setField(term1352, term1352.getClass(), "propListHead", term1375);
        setIntField(term1352, term1352.getClass(), "sourcePosition", 5603560);
        setField(term1352, term1352.getClass(), "jsType", null);
        setField(term1352, term1352.getClass(), "parent", null);
        term11625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11630 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11633 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11625, term11625.getClass(), "type", -138239905);
        setIntField(term11626, term11626.getClass(), "type", 590451710);
        setIntField(term11627, term11627.getClass(), "type", 0);
        setField(term11627, term11627.getClass(), "next", null);
        setField(term11627, term11627.getClass(), "first", null);
        setField(term11627, term11627.getClass(), "last", null);
        setField(term11627, term11627.getClass(), "propListHead", null);
        setIntField(term11627, term11627.getClass(), "sourcePosition", 0);
        setField(term11627, term11627.getClass(), "jsType", null);
        setField(term11627, term11627.getClass(), "parent", null);
        setField(term11626, term11626.getClass(), "next", term11627);
        setIntField(term11628, term11628.getClass(), "type", 0);
        setField(term11628, term11628.getClass(), "next", null);
        setField(term11628, term11628.getClass(), "first", null);
        setField(term11628, term11628.getClass(), "last", null);
        setField(term11628, term11628.getClass(), "propListHead", null);
        setIntField(term11628, term11628.getClass(), "sourcePosition", 0);
        setField(term11628, term11628.getClass(), "jsType", null);
        setField(term11628, term11628.getClass(), "parent", null);
        setField(term11626, term11626.getClass(), "first", term11628);
        setIntField(term11629, term11629.getClass(), "type", 0);
        setField(term11629, term11629.getClass(), "next", null);
        setField(term11629, term11629.getClass(), "first", null);
        setField(term11629, term11629.getClass(), "last", null);
        setField(term11629, term11629.getClass(), "propListHead", null);
        setIntField(term11629, term11629.getClass(), "sourcePosition", 0);
        setField(term11629, term11629.getClass(), "jsType", null);
        setField(term11629, term11629.getClass(), "parent", null);
        setField(term11626, term11626.getClass(), "last", term11629);
        setField(term11630, term11630.getClass(), "next", null);
        setIntField(term11630, term11630.getClass(), "type", 0);
        setIntField(term11630, term11630.getClass(), "intValue", 0);
        setField(term11630, term11630.getClass(), "objectValue", null);
        setField(term11626, term11626.getClass(), "propListHead", term11630);
        setIntField(term11626, term11626.getClass(), "sourcePosition", 1048451946);
        setField(term11626, term11626.getClass(), "jsType", null);
        setField(term11626, term11626.getClass(), "parent", null);
        setField(term11625, term11625.getClass(), "next", term11626);
        setIntField(term11631, term11631.getClass(), "type", 0);
        setField(term11631, term11631.getClass(), "next", null);
        setField(term11631, term11631.getClass(), "first", null);
        setField(term11631, term11631.getClass(), "last", null);
        setField(term11631, term11631.getClass(), "propListHead", null);
        setIntField(term11631, term11631.getClass(), "sourcePosition", 0);
        setField(term11631, term11631.getClass(), "jsType", null);
        setField(term11631, term11631.getClass(), "parent", null);
        setField(term11625, term11625.getClass(), "first", term11631);
        setIntField(term11632, term11632.getClass(), "type", 0);
        setField(term11632, term11632.getClass(), "next", null);
        setField(term11632, term11632.getClass(), "first", null);
        setField(term11632, term11632.getClass(), "last", null);
        setField(term11632, term11632.getClass(), "propListHead", null);
        setIntField(term11632, term11632.getClass(), "sourcePosition", 0);
        setField(term11632, term11632.getClass(), "jsType", null);
        setField(term11632, term11632.getClass(), "parent", null);
        setField(term11625, term11625.getClass(), "last", term11632);
        setField(term11633, term11633.getClass(), "next", null);
        setIntField(term11633, term11633.getClass(), "type", 0);
        setIntField(term11633, term11633.getClass(), "intValue", 0);
        setField(term11633, term11633.getClass(), "objectValue", null);
        setField(term11625, term11625.getClass(), "propListHead", term11633);
        setIntField(term11625, term11625.getClass(), "sourcePosition", 5603560);
        setField(term11625, term11625.getClass(), "jsType", null);
        setField(term11625, term11625.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1352;
        Object retValue = callMethod(klass, "isGetProp", argTypes, null, args);
        assertTrue(recursiveEquals(term1352, term11625));
        assertTrue(recursiveEquals(retValue, false));
    }

};


