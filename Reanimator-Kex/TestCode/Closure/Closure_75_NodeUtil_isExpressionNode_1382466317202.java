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

public class NodeUtil_isExpressionNode_1382466317202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1244;
     Object term11557;

    public NodeUtil_isExpressionNode_1382466317202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1257 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1244, term1244.getClass(), "type", 947449400);
        setIntField(term1246, term1246.getClass(), "type", 213831054);
        setIntField(term1248, term1248.getClass(), "type", 0);
        setField(term1248, term1248.getClass(), "next", null);
        setField(term1248, term1248.getClass(), "first", null);
        setField(term1248, term1248.getClass(), "last", null);
        setField(term1248, term1248.getClass(), "propListHead", null);
        setIntField(term1248, term1248.getClass(), "sourcePosition", 0);
        setField(term1248, term1248.getClass(), "jsType", null);
        setField(term1248, term1248.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "next", term1248);
        setIntField(term1251, term1251.getClass(), "type", 0);
        setField(term1251, term1251.getClass(), "next", null);
        setField(term1251, term1251.getClass(), "first", null);
        setField(term1251, term1251.getClass(), "last", null);
        setField(term1251, term1251.getClass(), "propListHead", null);
        setIntField(term1251, term1251.getClass(), "sourcePosition", 0);
        setField(term1251, term1251.getClass(), "jsType", null);
        setField(term1251, term1251.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "first", term1251);
        setIntField(term1254, term1254.getClass(), "type", 0);
        setField(term1254, term1254.getClass(), "next", null);
        setField(term1254, term1254.getClass(), "first", null);
        setField(term1254, term1254.getClass(), "last", null);
        setField(term1254, term1254.getClass(), "propListHead", null);
        setIntField(term1254, term1254.getClass(), "sourcePosition", 0);
        setField(term1254, term1254.getClass(), "jsType", null);
        setField(term1254, term1254.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "last", term1254);
        setField(term1257, term1257.getClass(), "next", null);
        setIntField(term1257, term1257.getClass(), "type", 0);
        setIntField(term1257, term1257.getClass(), "intValue", 0);
        setField(term1257, term1257.getClass(), "objectValue", null);
        setField(term1246, term1246.getClass(), "propListHead", term1257);
        setIntField(term1246, term1246.getClass(), "sourcePosition", -1639041228);
        setField(term1246, term1246.getClass(), "jsType", null);
        setField(term1246, term1246.getClass(), "parent", null);
        setField(term1244, term1244.getClass(), "next", term1246);
        setIntField(term1261, term1261.getClass(), "type", 0);
        setField(term1261, term1261.getClass(), "next", null);
        setField(term1261, term1261.getClass(), "first", null);
        setField(term1261, term1261.getClass(), "last", null);
        setField(term1261, term1261.getClass(), "propListHead", null);
        setIntField(term1261, term1261.getClass(), "sourcePosition", 0);
        setField(term1261, term1261.getClass(), "jsType", null);
        setField(term1261, term1261.getClass(), "parent", null);
        setField(term1244, term1244.getClass(), "first", term1261);
        setIntField(term1264, term1264.getClass(), "type", 0);
        setField(term1264, term1264.getClass(), "next", null);
        setField(term1264, term1264.getClass(), "first", null);
        setField(term1264, term1264.getClass(), "last", null);
        setField(term1264, term1264.getClass(), "propListHead", null);
        setIntField(term1264, term1264.getClass(), "sourcePosition", 0);
        setField(term1264, term1264.getClass(), "jsType", null);
        setField(term1264, term1264.getClass(), "parent", null);
        setField(term1244, term1244.getClass(), "last", term1264);
        setField(term1267, term1267.getClass(), "next", null);
        setIntField(term1267, term1267.getClass(), "type", 0);
        setIntField(term1267, term1267.getClass(), "intValue", 0);
        setField(term1267, term1267.getClass(), "objectValue", null);
        setField(term1244, term1244.getClass(), "propListHead", term1267);
        setIntField(term1244, term1244.getClass(), "sourcePosition", 2027686272);
        setField(term1244, term1244.getClass(), "jsType", null);
        setField(term1244, term1244.getClass(), "parent", null);
        term11557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11562 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11565 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11557, term11557.getClass(), "type", 947449400);
        setIntField(term11558, term11558.getClass(), "type", 213831054);
        setIntField(term11559, term11559.getClass(), "type", 0);
        setField(term11559, term11559.getClass(), "next", null);
        setField(term11559, term11559.getClass(), "first", null);
        setField(term11559, term11559.getClass(), "last", null);
        setField(term11559, term11559.getClass(), "propListHead", null);
        setIntField(term11559, term11559.getClass(), "sourcePosition", 0);
        setField(term11559, term11559.getClass(), "jsType", null);
        setField(term11559, term11559.getClass(), "parent", null);
        setField(term11558, term11558.getClass(), "next", term11559);
        setIntField(term11560, term11560.getClass(), "type", 0);
        setField(term11560, term11560.getClass(), "next", null);
        setField(term11560, term11560.getClass(), "first", null);
        setField(term11560, term11560.getClass(), "last", null);
        setField(term11560, term11560.getClass(), "propListHead", null);
        setIntField(term11560, term11560.getClass(), "sourcePosition", 0);
        setField(term11560, term11560.getClass(), "jsType", null);
        setField(term11560, term11560.getClass(), "parent", null);
        setField(term11558, term11558.getClass(), "first", term11560);
        setIntField(term11561, term11561.getClass(), "type", 0);
        setField(term11561, term11561.getClass(), "next", null);
        setField(term11561, term11561.getClass(), "first", null);
        setField(term11561, term11561.getClass(), "last", null);
        setField(term11561, term11561.getClass(), "propListHead", null);
        setIntField(term11561, term11561.getClass(), "sourcePosition", 0);
        setField(term11561, term11561.getClass(), "jsType", null);
        setField(term11561, term11561.getClass(), "parent", null);
        setField(term11558, term11558.getClass(), "last", term11561);
        setField(term11562, term11562.getClass(), "next", null);
        setIntField(term11562, term11562.getClass(), "type", 0);
        setIntField(term11562, term11562.getClass(), "intValue", 0);
        setField(term11562, term11562.getClass(), "objectValue", null);
        setField(term11558, term11558.getClass(), "propListHead", term11562);
        setIntField(term11558, term11558.getClass(), "sourcePosition", -1639041228);
        setField(term11558, term11558.getClass(), "jsType", null);
        setField(term11558, term11558.getClass(), "parent", null);
        setField(term11557, term11557.getClass(), "next", term11558);
        setIntField(term11563, term11563.getClass(), "type", 0);
        setField(term11563, term11563.getClass(), "next", null);
        setField(term11563, term11563.getClass(), "first", null);
        setField(term11563, term11563.getClass(), "last", null);
        setField(term11563, term11563.getClass(), "propListHead", null);
        setIntField(term11563, term11563.getClass(), "sourcePosition", 0);
        setField(term11563, term11563.getClass(), "jsType", null);
        setField(term11563, term11563.getClass(), "parent", null);
        setField(term11557, term11557.getClass(), "first", term11563);
        setIntField(term11564, term11564.getClass(), "type", 0);
        setField(term11564, term11564.getClass(), "next", null);
        setField(term11564, term11564.getClass(), "first", null);
        setField(term11564, term11564.getClass(), "last", null);
        setField(term11564, term11564.getClass(), "propListHead", null);
        setIntField(term11564, term11564.getClass(), "sourcePosition", 0);
        setField(term11564, term11564.getClass(), "jsType", null);
        setField(term11564, term11564.getClass(), "parent", null);
        setField(term11557, term11557.getClass(), "last", term11564);
        setField(term11565, term11565.getClass(), "next", null);
        setIntField(term11565, term11565.getClass(), "type", 0);
        setIntField(term11565, term11565.getClass(), "intValue", 0);
        setField(term11565, term11565.getClass(), "objectValue", null);
        setField(term11557, term11557.getClass(), "propListHead", term11565);
        setIntField(term11557, term11557.getClass(), "sourcePosition", 2027686272);
        setField(term11557, term11557.getClass(), "jsType", null);
        setField(term11557, term11557.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1244;
        Object retValue = callMethod(klass, "isExpressionNode", argTypes, null, args);
        assertTrue(recursiveEquals(term1244, term11557));
        assertTrue(recursiveEquals(retValue, false));
    }

};


