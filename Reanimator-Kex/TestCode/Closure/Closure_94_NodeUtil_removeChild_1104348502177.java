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

public class NodeUtil_removeChild_1104348502177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1572;
     Object term1599;

    public NodeUtil_removeChild_1104348502177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1585 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1595 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1572, term1572.getClass(), "type", -497534255);
        setIntField(term1574, term1574.getClass(), "type", -1955400589);
        setIntField(term1576, term1576.getClass(), "type", 0);
        setField(term1576, term1576.getClass(), "next", null);
        setField(term1576, term1576.getClass(), "first", null);
        setField(term1576, term1576.getClass(), "last", null);
        setField(term1576, term1576.getClass(), "propListHead", null);
        setIntField(term1576, term1576.getClass(), "sourcePosition", 0);
        setField(term1576, term1576.getClass(), "jsType", null);
        setField(term1576, term1576.getClass(), "parent", null);
        setField(term1574, term1574.getClass(), "next", term1576);
        setIntField(term1579, term1579.getClass(), "type", 0);
        setField(term1579, term1579.getClass(), "next", null);
        setField(term1579, term1579.getClass(), "first", null);
        setField(term1579, term1579.getClass(), "last", null);
        setField(term1579, term1579.getClass(), "propListHead", null);
        setIntField(term1579, term1579.getClass(), "sourcePosition", 0);
        setField(term1579, term1579.getClass(), "jsType", null);
        setField(term1579, term1579.getClass(), "parent", null);
        setField(term1574, term1574.getClass(), "first", term1579);
        setIntField(term1582, term1582.getClass(), "type", 0);
        setField(term1582, term1582.getClass(), "next", null);
        setField(term1582, term1582.getClass(), "first", null);
        setField(term1582, term1582.getClass(), "last", null);
        setField(term1582, term1582.getClass(), "propListHead", null);
        setIntField(term1582, term1582.getClass(), "sourcePosition", 0);
        setField(term1582, term1582.getClass(), "jsType", null);
        setField(term1582, term1582.getClass(), "parent", null);
        setField(term1574, term1574.getClass(), "last", term1582);
        setField(term1585, term1585.getClass(), "next", null);
        setIntField(term1585, term1585.getClass(), "type", 0);
        setIntField(term1585, term1585.getClass(), "intValue", 0);
        setField(term1585, term1585.getClass(), "objectValue", null);
        setField(term1574, term1574.getClass(), "propListHead", term1585);
        setIntField(term1574, term1574.getClass(), "sourcePosition", -711507760);
        setField(term1574, term1574.getClass(), "jsType", null);
        setField(term1574, term1574.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "next", term1574);
        setIntField(term1589, term1589.getClass(), "type", 0);
        setField(term1589, term1589.getClass(), "next", null);
        setField(term1589, term1589.getClass(), "first", null);
        setField(term1589, term1589.getClass(), "last", null);
        setField(term1589, term1589.getClass(), "propListHead", null);
        setIntField(term1589, term1589.getClass(), "sourcePosition", 0);
        setField(term1589, term1589.getClass(), "jsType", null);
        setField(term1589, term1589.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "first", term1589);
        setIntField(term1592, term1592.getClass(), "type", 0);
        setField(term1592, term1592.getClass(), "next", null);
        setField(term1592, term1592.getClass(), "first", null);
        setField(term1592, term1592.getClass(), "last", null);
        setField(term1592, term1592.getClass(), "propListHead", null);
        setIntField(term1592, term1592.getClass(), "sourcePosition", 0);
        setField(term1592, term1592.getClass(), "jsType", null);
        setField(term1592, term1592.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "last", term1592);
        setField(term1595, term1595.getClass(), "next", null);
        setIntField(term1595, term1595.getClass(), "type", 0);
        setIntField(term1595, term1595.getClass(), "intValue", 0);
        setField(term1595, term1595.getClass(), "objectValue", null);
        setField(term1572, term1572.getClass(), "propListHead", term1595);
        setIntField(term1572, term1572.getClass(), "sourcePosition", 1053773809);
        setField(term1572, term1572.getClass(), "jsType", null);
        setField(term1572, term1572.getClass(), "parent", null);
        term1599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1612 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1622 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1599, term1599.getClass(), "type", -271094506);
        setIntField(term1601, term1601.getClass(), "type", -763576148);
        setIntField(term1603, term1603.getClass(), "type", 0);
        setField(term1603, term1603.getClass(), "next", null);
        setField(term1603, term1603.getClass(), "first", null);
        setField(term1603, term1603.getClass(), "last", null);
        setField(term1603, term1603.getClass(), "propListHead", null);
        setIntField(term1603, term1603.getClass(), "sourcePosition", 0);
        setField(term1603, term1603.getClass(), "jsType", null);
        setField(term1603, term1603.getClass(), "parent", null);
        setField(term1601, term1601.getClass(), "next", term1603);
        setIntField(term1606, term1606.getClass(), "type", 0);
        setField(term1606, term1606.getClass(), "next", null);
        setField(term1606, term1606.getClass(), "first", null);
        setField(term1606, term1606.getClass(), "last", null);
        setField(term1606, term1606.getClass(), "propListHead", null);
        setIntField(term1606, term1606.getClass(), "sourcePosition", 0);
        setField(term1606, term1606.getClass(), "jsType", null);
        setField(term1606, term1606.getClass(), "parent", null);
        setField(term1601, term1601.getClass(), "first", term1606);
        setIntField(term1609, term1609.getClass(), "type", 0);
        setField(term1609, term1609.getClass(), "next", null);
        setField(term1609, term1609.getClass(), "first", null);
        setField(term1609, term1609.getClass(), "last", null);
        setField(term1609, term1609.getClass(), "propListHead", null);
        setIntField(term1609, term1609.getClass(), "sourcePosition", 0);
        setField(term1609, term1609.getClass(), "jsType", null);
        setField(term1609, term1609.getClass(), "parent", null);
        setField(term1601, term1601.getClass(), "last", term1609);
        setField(term1612, term1612.getClass(), "next", null);
        setIntField(term1612, term1612.getClass(), "type", 0);
        setIntField(term1612, term1612.getClass(), "intValue", 0);
        setField(term1612, term1612.getClass(), "objectValue", null);
        setField(term1601, term1601.getClass(), "propListHead", term1612);
        setIntField(term1601, term1601.getClass(), "sourcePosition", 452088587);
        setField(term1601, term1601.getClass(), "jsType", null);
        setField(term1601, term1601.getClass(), "parent", null);
        setField(term1599, term1599.getClass(), "next", term1601);
        setIntField(term1616, term1616.getClass(), "type", 0);
        setField(term1616, term1616.getClass(), "next", null);
        setField(term1616, term1616.getClass(), "first", null);
        setField(term1616, term1616.getClass(), "last", null);
        setField(term1616, term1616.getClass(), "propListHead", null);
        setIntField(term1616, term1616.getClass(), "sourcePosition", 0);
        setField(term1616, term1616.getClass(), "jsType", null);
        setField(term1616, term1616.getClass(), "parent", null);
        setField(term1599, term1599.getClass(), "first", term1616);
        setIntField(term1619, term1619.getClass(), "type", 0);
        setField(term1619, term1619.getClass(), "next", null);
        setField(term1619, term1619.getClass(), "first", null);
        setField(term1619, term1619.getClass(), "last", null);
        setField(term1619, term1619.getClass(), "propListHead", null);
        setIntField(term1619, term1619.getClass(), "sourcePosition", 0);
        setField(term1619, term1619.getClass(), "jsType", null);
        setField(term1619, term1619.getClass(), "parent", null);
        setField(term1599, term1599.getClass(), "last", term1619);
        setField(term1622, term1622.getClass(), "next", null);
        setIntField(term1622, term1622.getClass(), "type", 0);
        setIntField(term1622, term1622.getClass(), "intValue", 0);
        setField(term1622, term1622.getClass(), "objectValue", null);
        setField(term1599, term1599.getClass(), "propListHead", term1622);
        setIntField(term1599, term1599.getClass(), "sourcePosition", -1630069454);
        setField(term1599, term1599.getClass(), "jsType", null);
        setField(term1599, term1599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1572;
        args[1] = term1599;
        try {
            callMethod(klass, "removeChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


