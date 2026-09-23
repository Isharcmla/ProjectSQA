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
     Object term11919;

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
        term11919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11924 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11927 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11919, term11919.getClass(), "type", -138239905);
        setIntField(term11920, term11920.getClass(), "type", 590451710);
        setIntField(term11921, term11921.getClass(), "type", 0);
        setField(term11921, term11921.getClass(), "next", null);
        setField(term11921, term11921.getClass(), "first", null);
        setField(term11921, term11921.getClass(), "last", null);
        setField(term11921, term11921.getClass(), "propListHead", null);
        setIntField(term11921, term11921.getClass(), "sourcePosition", 0);
        setField(term11921, term11921.getClass(), "jsType", null);
        setField(term11921, term11921.getClass(), "parent", null);
        setField(term11920, term11920.getClass(), "next", term11921);
        setIntField(term11922, term11922.getClass(), "type", 0);
        setField(term11922, term11922.getClass(), "next", null);
        setField(term11922, term11922.getClass(), "first", null);
        setField(term11922, term11922.getClass(), "last", null);
        setField(term11922, term11922.getClass(), "propListHead", null);
        setIntField(term11922, term11922.getClass(), "sourcePosition", 0);
        setField(term11922, term11922.getClass(), "jsType", null);
        setField(term11922, term11922.getClass(), "parent", null);
        setField(term11920, term11920.getClass(), "first", term11922);
        setIntField(term11923, term11923.getClass(), "type", 0);
        setField(term11923, term11923.getClass(), "next", null);
        setField(term11923, term11923.getClass(), "first", null);
        setField(term11923, term11923.getClass(), "last", null);
        setField(term11923, term11923.getClass(), "propListHead", null);
        setIntField(term11923, term11923.getClass(), "sourcePosition", 0);
        setField(term11923, term11923.getClass(), "jsType", null);
        setField(term11923, term11923.getClass(), "parent", null);
        setField(term11920, term11920.getClass(), "last", term11923);
        setField(term11924, term11924.getClass(), "next", null);
        setIntField(term11924, term11924.getClass(), "type", 0);
        setIntField(term11924, term11924.getClass(), "intValue", 0);
        setField(term11924, term11924.getClass(), "objectValue", null);
        setField(term11920, term11920.getClass(), "propListHead", term11924);
        setIntField(term11920, term11920.getClass(), "sourcePosition", 1048451946);
        setField(term11920, term11920.getClass(), "jsType", null);
        setField(term11920, term11920.getClass(), "parent", null);
        setField(term11919, term11919.getClass(), "next", term11920);
        setIntField(term11925, term11925.getClass(), "type", 0);
        setField(term11925, term11925.getClass(), "next", null);
        setField(term11925, term11925.getClass(), "first", null);
        setField(term11925, term11925.getClass(), "last", null);
        setField(term11925, term11925.getClass(), "propListHead", null);
        setIntField(term11925, term11925.getClass(), "sourcePosition", 0);
        setField(term11925, term11925.getClass(), "jsType", null);
        setField(term11925, term11925.getClass(), "parent", null);
        setField(term11919, term11919.getClass(), "first", term11925);
        setIntField(term11926, term11926.getClass(), "type", 0);
        setField(term11926, term11926.getClass(), "next", null);
        setField(term11926, term11926.getClass(), "first", null);
        setField(term11926, term11926.getClass(), "last", null);
        setField(term11926, term11926.getClass(), "propListHead", null);
        setIntField(term11926, term11926.getClass(), "sourcePosition", 0);
        setField(term11926, term11926.getClass(), "jsType", null);
        setField(term11926, term11926.getClass(), "parent", null);
        setField(term11919, term11919.getClass(), "last", term11926);
        setField(term11927, term11927.getClass(), "next", null);
        setIntField(term11927, term11927.getClass(), "type", 0);
        setIntField(term11927, term11927.getClass(), "intValue", 0);
        setField(term11927, term11927.getClass(), "objectValue", null);
        setField(term11919, term11919.getClass(), "propListHead", term11927);
        setIntField(term11919, term11919.getClass(), "sourcePosition", 5603560);
        setField(term11919, term11919.getClass(), "jsType", null);
        setField(term11919, term11919.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1352;
        Object retValue = callMethod(klass, "isGetProp", argTypes, null, args);
        assertTrue(recursiveEquals(term1352, term11919));
        assertTrue(recursiveEquals(retValue, false));
    }

};


