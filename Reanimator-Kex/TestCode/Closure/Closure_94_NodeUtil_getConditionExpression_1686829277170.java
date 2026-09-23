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

public class NodeUtil_getConditionExpression_1686829277170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1356;

    public NodeUtil_getConditionExpression_1686829277170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1369 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1379 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1356, term1356.getClass(), "type", 2634669);
        setIntField(term1358, term1358.getClass(), "type", 313459791);
        setIntField(term1360, term1360.getClass(), "type", 0);
        setField(term1360, term1360.getClass(), "next", null);
        setField(term1360, term1360.getClass(), "first", null);
        setField(term1360, term1360.getClass(), "last", null);
        setField(term1360, term1360.getClass(), "propListHead", null);
        setIntField(term1360, term1360.getClass(), "sourcePosition", 0);
        setField(term1360, term1360.getClass(), "jsType", null);
        setField(term1360, term1360.getClass(), "parent", null);
        setField(term1358, term1358.getClass(), "next", term1360);
        setIntField(term1363, term1363.getClass(), "type", 0);
        setField(term1363, term1363.getClass(), "next", null);
        setField(term1363, term1363.getClass(), "first", null);
        setField(term1363, term1363.getClass(), "last", null);
        setField(term1363, term1363.getClass(), "propListHead", null);
        setIntField(term1363, term1363.getClass(), "sourcePosition", 0);
        setField(term1363, term1363.getClass(), "jsType", null);
        setField(term1363, term1363.getClass(), "parent", null);
        setField(term1358, term1358.getClass(), "first", term1363);
        setIntField(term1366, term1366.getClass(), "type", 0);
        setField(term1366, term1366.getClass(), "next", null);
        setField(term1366, term1366.getClass(), "first", null);
        setField(term1366, term1366.getClass(), "last", null);
        setField(term1366, term1366.getClass(), "propListHead", null);
        setIntField(term1366, term1366.getClass(), "sourcePosition", 0);
        setField(term1366, term1366.getClass(), "jsType", null);
        setField(term1366, term1366.getClass(), "parent", null);
        setField(term1358, term1358.getClass(), "last", term1366);
        setField(term1369, term1369.getClass(), "next", null);
        setIntField(term1369, term1369.getClass(), "type", 0);
        setIntField(term1369, term1369.getClass(), "intValue", 0);
        setField(term1369, term1369.getClass(), "objectValue", null);
        setField(term1358, term1358.getClass(), "propListHead", term1369);
        setIntField(term1358, term1358.getClass(), "sourcePosition", 794352120);
        setField(term1358, term1358.getClass(), "jsType", null);
        setField(term1358, term1358.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "next", term1358);
        setIntField(term1373, term1373.getClass(), "type", 0);
        setField(term1373, term1373.getClass(), "next", null);
        setField(term1373, term1373.getClass(), "first", null);
        setField(term1373, term1373.getClass(), "last", null);
        setField(term1373, term1373.getClass(), "propListHead", null);
        setIntField(term1373, term1373.getClass(), "sourcePosition", 0);
        setField(term1373, term1373.getClass(), "jsType", null);
        setField(term1373, term1373.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "first", term1373);
        setIntField(term1376, term1376.getClass(), "type", 0);
        setField(term1376, term1376.getClass(), "next", null);
        setField(term1376, term1376.getClass(), "first", null);
        setField(term1376, term1376.getClass(), "last", null);
        setField(term1376, term1376.getClass(), "propListHead", null);
        setIntField(term1376, term1376.getClass(), "sourcePosition", 0);
        setField(term1376, term1376.getClass(), "jsType", null);
        setField(term1376, term1376.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "last", term1376);
        setField(term1379, term1379.getClass(), "next", null);
        setIntField(term1379, term1379.getClass(), "type", 0);
        setIntField(term1379, term1379.getClass(), "intValue", 0);
        setField(term1379, term1379.getClass(), "objectValue", null);
        setField(term1356, term1356.getClass(), "propListHead", term1379);
        setIntField(term1356, term1356.getClass(), "sourcePosition", 340719678);
        setField(term1356, term1356.getClass(), "jsType", null);
        setField(term1356, term1356.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1356;
        try {
            callMethod(klass, "getConditionExpression", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


