package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_comma_403530381113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1615;
     Object term1642;

    public IR_comma_403530381113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1615, term1615.getClass(), "type", -1972033388);
        setIntField(term1617, term1617.getClass(), "type", -1005024758);
        setIntField(term1619, term1619.getClass(), "type", 2634669);
        setIntField(term1621, term1621.getClass(), "type", -1912429941);
        setIntField(term1623, term1623.getClass(), "type", 1801052257);
        setField(term1623, term1623.getClass(), "next", null);
        setField(term1623, term1623.getClass(), "first", null);
        setField(term1623, term1623.getClass(), "last", null);
        setField(term1623, term1623.getClass(), "propListHead", null);
        setIntField(term1623, term1623.getClass(), "sourcePosition", 0);
        setField(term1623, term1623.getClass(), "jsType", null);
        setField(term1623, term1623.getClass(), "parent", null);
        setField(term1621, term1621.getClass(), "next", term1623);
        setIntField(term1626, term1626.getClass(), "type", -2110556060);
        setField(term1626, term1626.getClass(), "next", null);
        setField(term1626, term1626.getClass(), "first", null);
        setField(term1626, term1626.getClass(), "last", term1623);
        setField(term1626, term1626.getClass(), "propListHead", null);
        setIntField(term1626, term1626.getClass(), "sourcePosition", 0);
        setField(term1626, term1626.getClass(), "jsType", null);
        setField(term1626, term1626.getClass(), "parent", null);
        setField(term1621, term1621.getClass(), "first", term1626);
        setField(term1621, term1621.getClass(), "last", term1619);
        setField(term1621, term1621.getClass(), "propListHead", null);
        setIntField(term1621, term1621.getClass(), "sourcePosition", 0);
        setField(term1621, term1621.getClass(), "jsType", null);
        setField(term1621, term1621.getClass(), "parent", null);
        setField(term1619, term1619.getClass(), "next", term1621);
        setField(term1619, term1619.getClass(), "first", term1623);
        setIntField(term1630, term1630.getClass(), "type", 752615112);
        setIntField(term1632, term1632.getClass(), "type", -1674430871);
        setField(term1632, term1632.getClass(), "next", null);
        setField(term1632, term1632.getClass(), "first", term1626);
        setField(term1632, term1632.getClass(), "last", term1621);
        setField(term1632, term1632.getClass(), "propListHead", null);
        setIntField(term1632, term1632.getClass(), "sourcePosition", 0);
        setField(term1632, term1632.getClass(), "jsType", null);
        setField(term1632, term1632.getClass(), "parent", null);
        setField(term1630, term1630.getClass(), "next", term1632);
        setField(term1630, term1630.getClass(), "first", term1617);
        setField(term1630, term1630.getClass(), "last", term1617);
        setField(term1630, term1630.getClass(), "propListHead", null);
        setIntField(term1630, term1630.getClass(), "sourcePosition", 0);
        setField(term1630, term1630.getClass(), "jsType", null);
        setField(term1630, term1630.getClass(), "parent", null);
        setField(term1619, term1619.getClass(), "last", term1630);
        setField(term1619, term1619.getClass(), "propListHead", null);
        setIntField(term1619, term1619.getClass(), "sourcePosition", 0);
        setField(term1619, term1619.getClass(), "jsType", null);
        setField(term1619, term1619.getClass(), "parent", null);
        setField(term1617, term1617.getClass(), "next", term1619);
        setIntField(term1637, term1637.getClass(), "type", 794352120);
        setField(term1637, term1637.getClass(), "next", term1630);
        setField(term1637, term1637.getClass(), "first", term1632);
        setField(term1637, term1637.getClass(), "last", term1615);
        setField(term1637, term1637.getClass(), "propListHead", null);
        setIntField(term1637, term1637.getClass(), "sourcePosition", 0);
        setField(term1637, term1637.getClass(), "jsType", null);
        setField(term1637, term1637.getClass(), "parent", null);
        setField(term1617, term1617.getClass(), "first", term1637);
        setField(term1617, term1617.getClass(), "last", term1637);
        setField(term1617, term1617.getClass(), "propListHead", null);
        setIntField(term1617, term1617.getClass(), "sourcePosition", 0);
        setField(term1617, term1617.getClass(), "jsType", null);
        setField(term1617, term1617.getClass(), "parent", null);
        setField(term1615, term1615.getClass(), "next", term1617);
        setField(term1615, term1615.getClass(), "first", term1621);
        setField(term1615, term1615.getClass(), "last", term1623);
        setField(term1615, term1615.getClass(), "propListHead", null);
        setIntField(term1615, term1615.getClass(), "sourcePosition", 0);
        setField(term1615, term1615.getClass(), "jsType", null);
        setField(term1615, term1615.getClass(), "parent", null);
        term1642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1642, term1642.getClass(), "type", 340719678);
        setIntField(term1644, term1644.getClass(), "type", 299791142);
        setIntField(term1646, term1646.getClass(), "type", 1862191391);
        setIntField(term1648, term1648.getClass(), "type", 1131398807);
        setIntField(term1650, term1650.getClass(), "type", -344907703);
        setField(term1650, term1650.getClass(), "next", null);
        setField(term1650, term1650.getClass(), "first", null);
        setField(term1650, term1650.getClass(), "last", null);
        setField(term1650, term1650.getClass(), "propListHead", null);
        setIntField(term1650, term1650.getClass(), "sourcePosition", 0);
        setField(term1650, term1650.getClass(), "jsType", null);
        setField(term1650, term1650.getClass(), "parent", null);
        setField(term1648, term1648.getClass(), "next", term1650);
        setIntField(term1653, term1653.getClass(), "type", 824341437);
        setField(term1653, term1653.getClass(), "next", null);
        setField(term1653, term1653.getClass(), "first", null);
        setField(term1653, term1653.getClass(), "last", term1650);
        setField(term1653, term1653.getClass(), "propListHead", null);
        setIntField(term1653, term1653.getClass(), "sourcePosition", 0);
        setField(term1653, term1653.getClass(), "jsType", null);
        setField(term1653, term1653.getClass(), "parent", null);
        setField(term1648, term1648.getClass(), "first", term1653);
        setField(term1648, term1648.getClass(), "last", term1646);
        setField(term1648, term1648.getClass(), "propListHead", null);
        setIntField(term1648, term1648.getClass(), "sourcePosition", 0);
        setField(term1648, term1648.getClass(), "jsType", null);
        setField(term1648, term1648.getClass(), "parent", null);
        setField(term1646, term1646.getClass(), "next", term1648);
        setField(term1646, term1646.getClass(), "first", term1650);
        setIntField(term1657, term1657.getClass(), "type", 520504102);
        setIntField(term1659, term1659.getClass(), "type", -457396133);
        setField(term1659, term1659.getClass(), "next", null);
        setField(term1659, term1659.getClass(), "first", term1653);
        setField(term1659, term1659.getClass(), "last", term1648);
        setField(term1659, term1659.getClass(), "propListHead", null);
        setIntField(term1659, term1659.getClass(), "sourcePosition", 0);
        setField(term1659, term1659.getClass(), "jsType", null);
        setField(term1659, term1659.getClass(), "parent", null);
        setField(term1657, term1657.getClass(), "next", term1659);
        setField(term1657, term1657.getClass(), "first", term1644);
        setField(term1657, term1657.getClass(), "last", term1644);
        setField(term1657, term1657.getClass(), "propListHead", null);
        setIntField(term1657, term1657.getClass(), "sourcePosition", 0);
        setField(term1657, term1657.getClass(), "jsType", null);
        setField(term1657, term1657.getClass(), "parent", null);
        setField(term1646, term1646.getClass(), "last", term1657);
        setField(term1646, term1646.getClass(), "propListHead", null);
        setIntField(term1646, term1646.getClass(), "sourcePosition", 0);
        setField(term1646, term1646.getClass(), "jsType", null);
        setField(term1646, term1646.getClass(), "parent", null);
        setField(term1644, term1644.getClass(), "next", term1646);
        setIntField(term1664, term1664.getClass(), "type", -1793950607);
        setField(term1664, term1664.getClass(), "next", term1657);
        setField(term1664, term1664.getClass(), "first", term1659);
        setField(term1664, term1664.getClass(), "last", term1642);
        setField(term1664, term1664.getClass(), "propListHead", null);
        setIntField(term1664, term1664.getClass(), "sourcePosition", 0);
        setField(term1664, term1664.getClass(), "jsType", null);
        setField(term1664, term1664.getClass(), "parent", null);
        setField(term1644, term1644.getClass(), "first", term1664);
        setField(term1644, term1644.getClass(), "last", term1664);
        setField(term1644, term1644.getClass(), "propListHead", null);
        setIntField(term1644, term1644.getClass(), "sourcePosition", 0);
        setField(term1644, term1644.getClass(), "jsType", null);
        setField(term1644, term1644.getClass(), "parent", null);
        setField(term1642, term1642.getClass(), "next", term1644);
        setField(term1642, term1642.getClass(), "first", term1648);
        setField(term1642, term1642.getClass(), "last", term1650);
        setField(term1642, term1642.getClass(), "propListHead", null);
        setIntField(term1642, term1642.getClass(), "sourcePosition", 0);
        setField(term1642, term1642.getClass(), "jsType", null);
        setField(term1642, term1642.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1615;
        args[1] = term1642;
        try {
            callMethod(klass, "comma", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


