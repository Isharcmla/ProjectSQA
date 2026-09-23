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

public class NodeUtil_isControlStructureCodeBlock_763580606220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1626;
     Object term1653;

    public NodeUtil_isControlStructureCodeBlock_763580606220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1626, term1626.getClass(), "type", -1224443634);
        setIntField(term1628, term1628.getClass(), "type", 1048451946);
        setIntField(term1630, term1630.getClass(), "type", 5603560);
        setIntField(term1632, term1632.getClass(), "type", -1079020032);
        setIntField(term1634, term1634.getClass(), "type", -1973791064);
        setField(term1634, term1634.getClass(), "next", null);
        setField(term1634, term1634.getClass(), "first", null);
        setField(term1634, term1634.getClass(), "last", null);
        setField(term1634, term1634.getClass(), "propListHead", null);
        setIntField(term1634, term1634.getClass(), "sourcePosition", 0);
        setField(term1634, term1634.getClass(), "jsType", null);
        setField(term1634, term1634.getClass(), "parent", null);
        setField(term1632, term1632.getClass(), "next", term1634);
        setIntField(term1637, term1637.getClass(), "type", -2072158633);
        setField(term1637, term1637.getClass(), "next", null);
        setField(term1637, term1637.getClass(), "first", null);
        setField(term1637, term1637.getClass(), "last", term1634);
        setField(term1637, term1637.getClass(), "propListHead", null);
        setIntField(term1637, term1637.getClass(), "sourcePosition", 0);
        setField(term1637, term1637.getClass(), "jsType", null);
        setField(term1637, term1637.getClass(), "parent", null);
        setField(term1632, term1632.getClass(), "first", term1637);
        setField(term1632, term1632.getClass(), "last", term1630);
        setField(term1632, term1632.getClass(), "propListHead", null);
        setIntField(term1632, term1632.getClass(), "sourcePosition", 0);
        setField(term1632, term1632.getClass(), "jsType", null);
        setField(term1632, term1632.getClass(), "parent", null);
        setField(term1630, term1630.getClass(), "next", term1632);
        setField(term1630, term1630.getClass(), "first", term1634);
        setIntField(term1641, term1641.getClass(), "type", 1465188553);
        setIntField(term1643, term1643.getClass(), "type", 1633913667);
        setField(term1643, term1643.getClass(), "next", null);
        setField(term1643, term1643.getClass(), "first", term1637);
        setField(term1643, term1643.getClass(), "last", term1632);
        setField(term1643, term1643.getClass(), "propListHead", null);
        setIntField(term1643, term1643.getClass(), "sourcePosition", 0);
        setField(term1643, term1643.getClass(), "jsType", null);
        setField(term1643, term1643.getClass(), "parent", null);
        setField(term1641, term1641.getClass(), "next", term1643);
        setField(term1641, term1641.getClass(), "first", term1628);
        setField(term1641, term1641.getClass(), "last", term1628);
        setField(term1641, term1641.getClass(), "propListHead", null);
        setIntField(term1641, term1641.getClass(), "sourcePosition", 0);
        setField(term1641, term1641.getClass(), "jsType", null);
        setField(term1641, term1641.getClass(), "parent", null);
        setField(term1630, term1630.getClass(), "last", term1641);
        setField(term1630, term1630.getClass(), "propListHead", null);
        setIntField(term1630, term1630.getClass(), "sourcePosition", 0);
        setField(term1630, term1630.getClass(), "jsType", null);
        setField(term1630, term1630.getClass(), "parent", null);
        setField(term1628, term1628.getClass(), "next", term1630);
        setIntField(term1648, term1648.getClass(), "type", 1292332296);
        setField(term1648, term1648.getClass(), "next", term1641);
        setField(term1648, term1648.getClass(), "first", term1643);
        setField(term1648, term1648.getClass(), "last", term1626);
        setField(term1648, term1648.getClass(), "propListHead", null);
        setIntField(term1648, term1648.getClass(), "sourcePosition", 0);
        setField(term1648, term1648.getClass(), "jsType", null);
        setField(term1648, term1648.getClass(), "parent", null);
        setField(term1628, term1628.getClass(), "first", term1648);
        setField(term1628, term1628.getClass(), "last", term1648);
        setField(term1628, term1628.getClass(), "propListHead", null);
        setIntField(term1628, term1628.getClass(), "sourcePosition", 0);
        setField(term1628, term1628.getClass(), "jsType", null);
        setField(term1628, term1628.getClass(), "parent", null);
        setField(term1626, term1626.getClass(), "next", term1628);
        setField(term1626, term1626.getClass(), "first", term1632);
        setField(term1626, term1626.getClass(), "last", term1634);
        setField(term1626, term1626.getClass(), "propListHead", null);
        setIntField(term1626, term1626.getClass(), "sourcePosition", 0);
        setField(term1626, term1626.getClass(), "jsType", null);
        setField(term1626, term1626.getClass(), "parent", null);
        term1653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1653, term1653.getClass(), "type", -1415256843);
        setIntField(term1655, term1655.getClass(), "type", 612177768);
        setIntField(term1657, term1657.getClass(), "type", -1626451656);
        setIntField(term1659, term1659.getClass(), "type", 173952451);
        setIntField(term1661, term1661.getClass(), "type", -1972033388);
        setField(term1661, term1661.getClass(), "next", null);
        setField(term1661, term1661.getClass(), "first", null);
        setField(term1661, term1661.getClass(), "last", null);
        setField(term1661, term1661.getClass(), "propListHead", null);
        setIntField(term1661, term1661.getClass(), "sourcePosition", 0);
        setField(term1661, term1661.getClass(), "jsType", null);
        setField(term1661, term1661.getClass(), "parent", null);
        setField(term1659, term1659.getClass(), "next", term1661);
        setIntField(term1664, term1664.getClass(), "type", -1005024758);
        setField(term1664, term1664.getClass(), "next", null);
        setField(term1664, term1664.getClass(), "first", null);
        setField(term1664, term1664.getClass(), "last", term1661);
        setField(term1664, term1664.getClass(), "propListHead", null);
        setIntField(term1664, term1664.getClass(), "sourcePosition", 0);
        setField(term1664, term1664.getClass(), "jsType", null);
        setField(term1664, term1664.getClass(), "parent", null);
        setField(term1659, term1659.getClass(), "first", term1664);
        setField(term1659, term1659.getClass(), "last", term1657);
        setField(term1659, term1659.getClass(), "propListHead", null);
        setIntField(term1659, term1659.getClass(), "sourcePosition", 0);
        setField(term1659, term1659.getClass(), "jsType", null);
        setField(term1659, term1659.getClass(), "parent", null);
        setField(term1657, term1657.getClass(), "next", term1659);
        setField(term1657, term1657.getClass(), "first", term1661);
        setIntField(term1668, term1668.getClass(), "type", -1912429941);
        setIntField(term1670, term1670.getClass(), "type", 1801052257);
        setField(term1670, term1670.getClass(), "next", null);
        setField(term1670, term1670.getClass(), "first", term1664);
        setField(term1670, term1670.getClass(), "last", term1659);
        setField(term1670, term1670.getClass(), "propListHead", null);
        setIntField(term1670, term1670.getClass(), "sourcePosition", 0);
        setField(term1670, term1670.getClass(), "jsType", null);
        setField(term1670, term1670.getClass(), "parent", null);
        setField(term1668, term1668.getClass(), "next", term1670);
        setField(term1668, term1668.getClass(), "first", term1655);
        setField(term1668, term1668.getClass(), "last", term1655);
        setField(term1668, term1668.getClass(), "propListHead", null);
        setIntField(term1668, term1668.getClass(), "sourcePosition", 0);
        setField(term1668, term1668.getClass(), "jsType", null);
        setField(term1668, term1668.getClass(), "parent", null);
        setField(term1657, term1657.getClass(), "last", term1668);
        setField(term1657, term1657.getClass(), "propListHead", null);
        setIntField(term1657, term1657.getClass(), "sourcePosition", 0);
        setField(term1657, term1657.getClass(), "jsType", null);
        setField(term1657, term1657.getClass(), "parent", null);
        setField(term1655, term1655.getClass(), "next", term1657);
        setIntField(term1675, term1675.getClass(), "type", -2110556060);
        setField(term1675, term1675.getClass(), "next", term1668);
        setField(term1675, term1675.getClass(), "first", term1670);
        setField(term1675, term1675.getClass(), "last", term1653);
        setField(term1675, term1675.getClass(), "propListHead", null);
        setIntField(term1675, term1675.getClass(), "sourcePosition", 0);
        setField(term1675, term1675.getClass(), "jsType", null);
        setField(term1675, term1675.getClass(), "parent", null);
        setField(term1655, term1655.getClass(), "first", term1675);
        setField(term1655, term1655.getClass(), "last", term1675);
        setField(term1655, term1655.getClass(), "propListHead", null);
        setIntField(term1655, term1655.getClass(), "sourcePosition", 0);
        setField(term1655, term1655.getClass(), "jsType", null);
        setField(term1655, term1655.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "next", term1655);
        setField(term1653, term1653.getClass(), "first", term1659);
        setField(term1653, term1653.getClass(), "last", term1661);
        setField(term1653, term1653.getClass(), "propListHead", null);
        setIntField(term1653, term1653.getClass(), "sourcePosition", 0);
        setField(term1653, term1653.getClass(), "jsType", null);
        setField(term1653, term1653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1626;
        args[1] = term1653;
        try {
            callMethod(klass, "isControlStructureCodeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


