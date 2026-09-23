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

public class NodeUtil_isFunction_931954219157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1435;
     Object term9025;

    public NodeUtil_isFunction_931954219157() {
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
        term9025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9030 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9033 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9025, term9025.getClass(), "type", -1518419301);
        setIntField(term9026, term9026.getClass(), "type", -1698809299);
        setIntField(term9027, term9027.getClass(), "type", 0);
        setField(term9027, term9027.getClass(), "next", null);
        setField(term9027, term9027.getClass(), "first", null);
        setField(term9027, term9027.getClass(), "last", null);
        setField(term9027, term9027.getClass(), "propListHead", null);
        setIntField(term9027, term9027.getClass(), "sourcePosition", 0);
        setField(term9027, term9027.getClass(), "jsType", null);
        setField(term9027, term9027.getClass(), "parent", null);
        setField(term9026, term9026.getClass(), "next", term9027);
        setIntField(term9028, term9028.getClass(), "type", 0);
        setField(term9028, term9028.getClass(), "next", null);
        setField(term9028, term9028.getClass(), "first", null);
        setField(term9028, term9028.getClass(), "last", null);
        setField(term9028, term9028.getClass(), "propListHead", null);
        setIntField(term9028, term9028.getClass(), "sourcePosition", 0);
        setField(term9028, term9028.getClass(), "jsType", null);
        setField(term9028, term9028.getClass(), "parent", null);
        setField(term9026, term9026.getClass(), "first", term9028);
        setIntField(term9029, term9029.getClass(), "type", 0);
        setField(term9029, term9029.getClass(), "next", null);
        setField(term9029, term9029.getClass(), "first", null);
        setField(term9029, term9029.getClass(), "last", null);
        setField(term9029, term9029.getClass(), "propListHead", null);
        setIntField(term9029, term9029.getClass(), "sourcePosition", 0);
        setField(term9029, term9029.getClass(), "jsType", null);
        setField(term9029, term9029.getClass(), "parent", null);
        setField(term9026, term9026.getClass(), "last", term9029);
        setField(term9030, term9030.getClass(), "next", null);
        setIntField(term9030, term9030.getClass(), "type", 0);
        setIntField(term9030, term9030.getClass(), "intValue", 0);
        setField(term9030, term9030.getClass(), "objectValue", null);
        setField(term9026, term9026.getClass(), "propListHead", term9030);
        setIntField(term9026, term9026.getClass(), "sourcePosition", 1543696412);
        setField(term9026, term9026.getClass(), "jsType", null);
        setField(term9026, term9026.getClass(), "parent", null);
        setField(term9025, term9025.getClass(), "next", term9026);
        setIntField(term9031, term9031.getClass(), "type", 0);
        setField(term9031, term9031.getClass(), "next", null);
        setField(term9031, term9031.getClass(), "first", null);
        setField(term9031, term9031.getClass(), "last", null);
        setField(term9031, term9031.getClass(), "propListHead", null);
        setIntField(term9031, term9031.getClass(), "sourcePosition", 0);
        setField(term9031, term9031.getClass(), "jsType", null);
        setField(term9031, term9031.getClass(), "parent", null);
        setField(term9025, term9025.getClass(), "first", term9031);
        setIntField(term9032, term9032.getClass(), "type", 0);
        setField(term9032, term9032.getClass(), "next", null);
        setField(term9032, term9032.getClass(), "first", null);
        setField(term9032, term9032.getClass(), "last", null);
        setField(term9032, term9032.getClass(), "propListHead", null);
        setIntField(term9032, term9032.getClass(), "sourcePosition", 0);
        setField(term9032, term9032.getClass(), "jsType", null);
        setField(term9032, term9032.getClass(), "parent", null);
        setField(term9025, term9025.getClass(), "last", term9032);
        setField(term9033, term9033.getClass(), "next", null);
        setIntField(term9033, term9033.getClass(), "type", 0);
        setIntField(term9033, term9033.getClass(), "intValue", 0);
        setField(term9033, term9033.getClass(), "objectValue", null);
        setField(term9025, term9025.getClass(), "propListHead", term9033);
        setIntField(term9025, term9025.getClass(), "sourcePosition", -1385748168);
        setField(term9025, term9025.getClass(), "jsType", null);
        setField(term9025, term9025.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1435;
        Object retValue = callMethod(klass, "isFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1435, term9025));
        assertTrue(recursiveEquals(retValue, false));
    }

};


