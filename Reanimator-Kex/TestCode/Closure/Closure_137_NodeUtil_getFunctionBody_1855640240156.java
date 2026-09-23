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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionBody_1855640240156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1435;

    public NodeUtil_getFunctionBody_1855640240156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1448 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1458 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1435, term1435.getClass(), "type", -1518419301);
        setIntField(term1437, term1437.getClass(), "type", -1698809299);
        setIntField(term1439, term1439.getClass(), "type", 0);
        setField(term1439, term1439.getClass(), "next", null);
        setField(term1439, term1439.getClass(), "first", null);
        setField(term1439, term1439.getClass(), "last", null);
        setField(term1439, term1439.getClass(), "propListHead", null);
        setIntField(term1439, term1439.getClass(), "sourcePosition", 0);
        setField(term1439, term1439.getClass(), "jsType", null);
        setField(term1439, term1439.getClass(), "parent", null);
        setField(term1437, term1437.getClass(), "next", term1439);
        setIntField(term1442, term1442.getClass(), "type", 0);
        setField(term1442, term1442.getClass(), "next", null);
        setField(term1442, term1442.getClass(), "first", null);
        setField(term1442, term1442.getClass(), "last", null);
        setField(term1442, term1442.getClass(), "propListHead", null);
        setIntField(term1442, term1442.getClass(), "sourcePosition", 0);
        setField(term1442, term1442.getClass(), "jsType", null);
        setField(term1442, term1442.getClass(), "parent", null);
        setField(term1437, term1437.getClass(), "first", term1442);
        setIntField(term1445, term1445.getClass(), "type", 0);
        setField(term1445, term1445.getClass(), "next", null);
        setField(term1445, term1445.getClass(), "first", null);
        setField(term1445, term1445.getClass(), "last", null);
        setField(term1445, term1445.getClass(), "propListHead", null);
        setIntField(term1445, term1445.getClass(), "sourcePosition", 0);
        setField(term1445, term1445.getClass(), "jsType", null);
        setField(term1445, term1445.getClass(), "parent", null);
        setField(term1437, term1437.getClass(), "last", term1445);
        setField(term1448, term1448.getClass(), "next", null);
        setIntField(term1448, term1448.getClass(), "type", 0);
        setIntField(term1448, term1448.getClass(), "intValue", 0);
        setField(term1448, term1448.getClass(), "objectValue", null);
        setField(term1437, term1437.getClass(), "propListHead", term1448);
        setIntField(term1437, term1437.getClass(), "sourcePosition", 1543696412);
        setField(term1437, term1437.getClass(), "jsType", null);
        setField(term1437, term1437.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "next", term1437);
        setIntField(term1452, term1452.getClass(), "type", 0);
        setField(term1452, term1452.getClass(), "next", null);
        setField(term1452, term1452.getClass(), "first", null);
        setField(term1452, term1452.getClass(), "last", null);
        setField(term1452, term1452.getClass(), "propListHead", null);
        setIntField(term1452, term1452.getClass(), "sourcePosition", 0);
        setField(term1452, term1452.getClass(), "jsType", null);
        setField(term1452, term1452.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "first", term1452);
        setIntField(term1455, term1455.getClass(), "type", 0);
        setField(term1455, term1455.getClass(), "next", null);
        setField(term1455, term1455.getClass(), "first", null);
        setField(term1455, term1455.getClass(), "last", null);
        setField(term1455, term1455.getClass(), "propListHead", null);
        setIntField(term1455, term1455.getClass(), "sourcePosition", 0);
        setField(term1455, term1455.getClass(), "jsType", null);
        setField(term1455, term1455.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "last", term1455);
        setField(term1458, term1458.getClass(), "next", null);
        setIntField(term1458, term1458.getClass(), "type", 0);
        setIntField(term1458, term1458.getClass(), "intValue", 0);
        setField(term1458, term1458.getClass(), "objectValue", null);
        setField(term1435, term1435.getClass(), "propListHead", term1458);
        setIntField(term1435, term1435.getClass(), "sourcePosition", -1385748168);
        setField(term1435, term1435.getClass(), "jsType", null);
        setField(term1435, term1435.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1435;
        try {
            callMethod(klass, "getFunctionBody", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


