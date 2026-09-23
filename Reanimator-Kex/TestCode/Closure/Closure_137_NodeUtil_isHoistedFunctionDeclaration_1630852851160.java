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

public class NodeUtil_isHoistedFunctionDeclaration_1630852851160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1543;
     Object term9493;

    public NodeUtil_isHoistedFunctionDeclaration_1630852851160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1556 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1566 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1543, term1543.getClass(), "type", 1104108112);
        setIntField(term1545, term1545.getClass(), "type", 1545119095);
        setIntField(term1547, term1547.getClass(), "type", 0);
        setField(term1547, term1547.getClass(), "next", null);
        setField(term1547, term1547.getClass(), "first", null);
        setField(term1547, term1547.getClass(), "last", null);
        setField(term1547, term1547.getClass(), "propListHead", null);
        setIntField(term1547, term1547.getClass(), "sourcePosition", 0);
        setField(term1547, term1547.getClass(), "jsType", null);
        setField(term1547, term1547.getClass(), "parent", null);
        setField(term1545, term1545.getClass(), "next", term1547);
        setIntField(term1550, term1550.getClass(), "type", 0);
        setField(term1550, term1550.getClass(), "next", null);
        setField(term1550, term1550.getClass(), "first", null);
        setField(term1550, term1550.getClass(), "last", null);
        setField(term1550, term1550.getClass(), "propListHead", null);
        setIntField(term1550, term1550.getClass(), "sourcePosition", 0);
        setField(term1550, term1550.getClass(), "jsType", null);
        setField(term1550, term1550.getClass(), "parent", null);
        setField(term1545, term1545.getClass(), "first", term1550);
        setIntField(term1553, term1553.getClass(), "type", 0);
        setField(term1553, term1553.getClass(), "next", null);
        setField(term1553, term1553.getClass(), "first", null);
        setField(term1553, term1553.getClass(), "last", null);
        setField(term1553, term1553.getClass(), "propListHead", null);
        setIntField(term1553, term1553.getClass(), "sourcePosition", 0);
        setField(term1553, term1553.getClass(), "jsType", null);
        setField(term1553, term1553.getClass(), "parent", null);
        setField(term1545, term1545.getClass(), "last", term1553);
        setField(term1556, term1556.getClass(), "next", null);
        setIntField(term1556, term1556.getClass(), "type", 0);
        setIntField(term1556, term1556.getClass(), "intValue", 0);
        setField(term1556, term1556.getClass(), "objectValue", null);
        setField(term1545, term1545.getClass(), "propListHead", term1556);
        setIntField(term1545, term1545.getClass(), "sourcePosition", -514195141);
        setField(term1545, term1545.getClass(), "jsType", null);
        setField(term1545, term1545.getClass(), "parent", null);
        setField(term1543, term1543.getClass(), "next", term1545);
        setIntField(term1560, term1560.getClass(), "type", 0);
        setField(term1560, term1560.getClass(), "next", null);
        setField(term1560, term1560.getClass(), "first", null);
        setField(term1560, term1560.getClass(), "last", null);
        setField(term1560, term1560.getClass(), "propListHead", null);
        setIntField(term1560, term1560.getClass(), "sourcePosition", 0);
        setField(term1560, term1560.getClass(), "jsType", null);
        setField(term1560, term1560.getClass(), "parent", null);
        setField(term1543, term1543.getClass(), "first", term1560);
        setIntField(term1563, term1563.getClass(), "type", 0);
        setField(term1563, term1563.getClass(), "next", null);
        setField(term1563, term1563.getClass(), "first", null);
        setField(term1563, term1563.getClass(), "last", null);
        setField(term1563, term1563.getClass(), "propListHead", null);
        setIntField(term1563, term1563.getClass(), "sourcePosition", 0);
        setField(term1563, term1563.getClass(), "jsType", null);
        setField(term1563, term1563.getClass(), "parent", null);
        setField(term1543, term1543.getClass(), "last", term1563);
        setField(term1566, term1566.getClass(), "next", null);
        setIntField(term1566, term1566.getClass(), "type", 0);
        setIntField(term1566, term1566.getClass(), "intValue", 0);
        setField(term1566, term1566.getClass(), "objectValue", null);
        setField(term1543, term1543.getClass(), "propListHead", term1566);
        setIntField(term1543, term1543.getClass(), "sourcePosition", -297946422);
        setField(term1543, term1543.getClass(), "jsType", null);
        setField(term1543, term1543.getClass(), "parent", null);
        term9493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9498 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9501 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9493, term9493.getClass(), "type", 1104108112);
        setIntField(term9494, term9494.getClass(), "type", 1545119095);
        setIntField(term9495, term9495.getClass(), "type", 0);
        setField(term9495, term9495.getClass(), "next", null);
        setField(term9495, term9495.getClass(), "first", null);
        setField(term9495, term9495.getClass(), "last", null);
        setField(term9495, term9495.getClass(), "propListHead", null);
        setIntField(term9495, term9495.getClass(), "sourcePosition", 0);
        setField(term9495, term9495.getClass(), "jsType", null);
        setField(term9495, term9495.getClass(), "parent", null);
        setField(term9494, term9494.getClass(), "next", term9495);
        setIntField(term9496, term9496.getClass(), "type", 0);
        setField(term9496, term9496.getClass(), "next", null);
        setField(term9496, term9496.getClass(), "first", null);
        setField(term9496, term9496.getClass(), "last", null);
        setField(term9496, term9496.getClass(), "propListHead", null);
        setIntField(term9496, term9496.getClass(), "sourcePosition", 0);
        setField(term9496, term9496.getClass(), "jsType", null);
        setField(term9496, term9496.getClass(), "parent", null);
        setField(term9494, term9494.getClass(), "first", term9496);
        setIntField(term9497, term9497.getClass(), "type", 0);
        setField(term9497, term9497.getClass(), "next", null);
        setField(term9497, term9497.getClass(), "first", null);
        setField(term9497, term9497.getClass(), "last", null);
        setField(term9497, term9497.getClass(), "propListHead", null);
        setIntField(term9497, term9497.getClass(), "sourcePosition", 0);
        setField(term9497, term9497.getClass(), "jsType", null);
        setField(term9497, term9497.getClass(), "parent", null);
        setField(term9494, term9494.getClass(), "last", term9497);
        setField(term9498, term9498.getClass(), "next", null);
        setIntField(term9498, term9498.getClass(), "type", 0);
        setIntField(term9498, term9498.getClass(), "intValue", 0);
        setField(term9498, term9498.getClass(), "objectValue", null);
        setField(term9494, term9494.getClass(), "propListHead", term9498);
        setIntField(term9494, term9494.getClass(), "sourcePosition", -514195141);
        setField(term9494, term9494.getClass(), "jsType", null);
        setField(term9494, term9494.getClass(), "parent", null);
        setField(term9493, term9493.getClass(), "next", term9494);
        setIntField(term9499, term9499.getClass(), "type", 0);
        setField(term9499, term9499.getClass(), "next", null);
        setField(term9499, term9499.getClass(), "first", null);
        setField(term9499, term9499.getClass(), "last", null);
        setField(term9499, term9499.getClass(), "propListHead", null);
        setIntField(term9499, term9499.getClass(), "sourcePosition", 0);
        setField(term9499, term9499.getClass(), "jsType", null);
        setField(term9499, term9499.getClass(), "parent", null);
        setField(term9493, term9493.getClass(), "first", term9499);
        setIntField(term9500, term9500.getClass(), "type", 0);
        setField(term9500, term9500.getClass(), "next", null);
        setField(term9500, term9500.getClass(), "first", null);
        setField(term9500, term9500.getClass(), "last", null);
        setField(term9500, term9500.getClass(), "propListHead", null);
        setIntField(term9500, term9500.getClass(), "sourcePosition", 0);
        setField(term9500, term9500.getClass(), "jsType", null);
        setField(term9500, term9500.getClass(), "parent", null);
        setField(term9493, term9493.getClass(), "last", term9500);
        setField(term9501, term9501.getClass(), "next", null);
        setIntField(term9501, term9501.getClass(), "type", 0);
        setIntField(term9501, term9501.getClass(), "intValue", 0);
        setField(term9501, term9501.getClass(), "objectValue", null);
        setField(term9493, term9493.getClass(), "propListHead", term9501);
        setIntField(term9493, term9493.getClass(), "sourcePosition", -297946422);
        setField(term9493, term9493.getClass(), "jsType", null);
        setField(term9493, term9493.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1543;
        Object retValue = callMethod(klass, "isHoistedFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1543, term9493));
        assertTrue(recursiveEquals(retValue, false));
    }

};


