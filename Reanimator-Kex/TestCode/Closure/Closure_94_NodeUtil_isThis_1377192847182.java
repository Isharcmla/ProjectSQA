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

public class NodeUtil_isThis_1377192847182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1734;
     Object term11607;

    public NodeUtil_isThis_1377192847182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1747 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1757 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1734, term1734.getClass(), "type", -341287775);
        setIntField(term1736, term1736.getClass(), "type", -2023791789);
        setIntField(term1738, term1738.getClass(), "type", 0);
        setField(term1738, term1738.getClass(), "next", null);
        setField(term1738, term1738.getClass(), "first", null);
        setField(term1738, term1738.getClass(), "last", null);
        setField(term1738, term1738.getClass(), "propListHead", null);
        setIntField(term1738, term1738.getClass(), "sourcePosition", 0);
        setField(term1738, term1738.getClass(), "jsType", null);
        setField(term1738, term1738.getClass(), "parent", null);
        setField(term1736, term1736.getClass(), "next", term1738);
        setIntField(term1741, term1741.getClass(), "type", 0);
        setField(term1741, term1741.getClass(), "next", null);
        setField(term1741, term1741.getClass(), "first", null);
        setField(term1741, term1741.getClass(), "last", null);
        setField(term1741, term1741.getClass(), "propListHead", null);
        setIntField(term1741, term1741.getClass(), "sourcePosition", 0);
        setField(term1741, term1741.getClass(), "jsType", null);
        setField(term1741, term1741.getClass(), "parent", null);
        setField(term1736, term1736.getClass(), "first", term1741);
        setIntField(term1744, term1744.getClass(), "type", 0);
        setField(term1744, term1744.getClass(), "next", null);
        setField(term1744, term1744.getClass(), "first", null);
        setField(term1744, term1744.getClass(), "last", null);
        setField(term1744, term1744.getClass(), "propListHead", null);
        setIntField(term1744, term1744.getClass(), "sourcePosition", 0);
        setField(term1744, term1744.getClass(), "jsType", null);
        setField(term1744, term1744.getClass(), "parent", null);
        setField(term1736, term1736.getClass(), "last", term1744);
        setField(term1747, term1747.getClass(), "next", null);
        setIntField(term1747, term1747.getClass(), "type", 0);
        setIntField(term1747, term1747.getClass(), "intValue", 0);
        setField(term1747, term1747.getClass(), "objectValue", null);
        setField(term1736, term1736.getClass(), "propListHead", term1747);
        setIntField(term1736, term1736.getClass(), "sourcePosition", 1418551216);
        setField(term1736, term1736.getClass(), "jsType", null);
        setField(term1736, term1736.getClass(), "parent", null);
        setField(term1734, term1734.getClass(), "next", term1736);
        setIntField(term1751, term1751.getClass(), "type", 0);
        setField(term1751, term1751.getClass(), "next", null);
        setField(term1751, term1751.getClass(), "first", null);
        setField(term1751, term1751.getClass(), "last", null);
        setField(term1751, term1751.getClass(), "propListHead", null);
        setIntField(term1751, term1751.getClass(), "sourcePosition", 0);
        setField(term1751, term1751.getClass(), "jsType", null);
        setField(term1751, term1751.getClass(), "parent", null);
        setField(term1734, term1734.getClass(), "first", term1751);
        setIntField(term1754, term1754.getClass(), "type", 0);
        setField(term1754, term1754.getClass(), "next", null);
        setField(term1754, term1754.getClass(), "first", null);
        setField(term1754, term1754.getClass(), "last", null);
        setField(term1754, term1754.getClass(), "propListHead", null);
        setIntField(term1754, term1754.getClass(), "sourcePosition", 0);
        setField(term1754, term1754.getClass(), "jsType", null);
        setField(term1754, term1754.getClass(), "parent", null);
        setField(term1734, term1734.getClass(), "last", term1754);
        setField(term1757, term1757.getClass(), "next", null);
        setIntField(term1757, term1757.getClass(), "type", 0);
        setIntField(term1757, term1757.getClass(), "intValue", 0);
        setField(term1757, term1757.getClass(), "objectValue", null);
        setField(term1734, term1734.getClass(), "propListHead", term1757);
        setIntField(term1734, term1734.getClass(), "sourcePosition", -626779272);
        setField(term1734, term1734.getClass(), "jsType", null);
        setField(term1734, term1734.getClass(), "parent", null);
        term11607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11612 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11615 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11607, term11607.getClass(), "type", -341287775);
        setIntField(term11608, term11608.getClass(), "type", -2023791789);
        setIntField(term11609, term11609.getClass(), "type", 0);
        setField(term11609, term11609.getClass(), "next", null);
        setField(term11609, term11609.getClass(), "first", null);
        setField(term11609, term11609.getClass(), "last", null);
        setField(term11609, term11609.getClass(), "propListHead", null);
        setIntField(term11609, term11609.getClass(), "sourcePosition", 0);
        setField(term11609, term11609.getClass(), "jsType", null);
        setField(term11609, term11609.getClass(), "parent", null);
        setField(term11608, term11608.getClass(), "next", term11609);
        setIntField(term11610, term11610.getClass(), "type", 0);
        setField(term11610, term11610.getClass(), "next", null);
        setField(term11610, term11610.getClass(), "first", null);
        setField(term11610, term11610.getClass(), "last", null);
        setField(term11610, term11610.getClass(), "propListHead", null);
        setIntField(term11610, term11610.getClass(), "sourcePosition", 0);
        setField(term11610, term11610.getClass(), "jsType", null);
        setField(term11610, term11610.getClass(), "parent", null);
        setField(term11608, term11608.getClass(), "first", term11610);
        setIntField(term11611, term11611.getClass(), "type", 0);
        setField(term11611, term11611.getClass(), "next", null);
        setField(term11611, term11611.getClass(), "first", null);
        setField(term11611, term11611.getClass(), "last", null);
        setField(term11611, term11611.getClass(), "propListHead", null);
        setIntField(term11611, term11611.getClass(), "sourcePosition", 0);
        setField(term11611, term11611.getClass(), "jsType", null);
        setField(term11611, term11611.getClass(), "parent", null);
        setField(term11608, term11608.getClass(), "last", term11611);
        setField(term11612, term11612.getClass(), "next", null);
        setIntField(term11612, term11612.getClass(), "type", 0);
        setIntField(term11612, term11612.getClass(), "intValue", 0);
        setField(term11612, term11612.getClass(), "objectValue", null);
        setField(term11608, term11608.getClass(), "propListHead", term11612);
        setIntField(term11608, term11608.getClass(), "sourcePosition", 1418551216);
        setField(term11608, term11608.getClass(), "jsType", null);
        setField(term11608, term11608.getClass(), "parent", null);
        setField(term11607, term11607.getClass(), "next", term11608);
        setIntField(term11613, term11613.getClass(), "type", 0);
        setField(term11613, term11613.getClass(), "next", null);
        setField(term11613, term11613.getClass(), "first", null);
        setField(term11613, term11613.getClass(), "last", null);
        setField(term11613, term11613.getClass(), "propListHead", null);
        setIntField(term11613, term11613.getClass(), "sourcePosition", 0);
        setField(term11613, term11613.getClass(), "jsType", null);
        setField(term11613, term11613.getClass(), "parent", null);
        setField(term11607, term11607.getClass(), "first", term11613);
        setIntField(term11614, term11614.getClass(), "type", 0);
        setField(term11614, term11614.getClass(), "next", null);
        setField(term11614, term11614.getClass(), "first", null);
        setField(term11614, term11614.getClass(), "last", null);
        setField(term11614, term11614.getClass(), "propListHead", null);
        setIntField(term11614, term11614.getClass(), "sourcePosition", 0);
        setField(term11614, term11614.getClass(), "jsType", null);
        setField(term11614, term11614.getClass(), "parent", null);
        setField(term11607, term11607.getClass(), "last", term11614);
        setField(term11615, term11615.getClass(), "next", null);
        setIntField(term11615, term11615.getClass(), "type", 0);
        setIntField(term11615, term11615.getClass(), "intValue", 0);
        setField(term11615, term11615.getClass(), "objectValue", null);
        setField(term11607, term11607.getClass(), "propListHead", term11615);
        setIntField(term11607, term11607.getClass(), "sourcePosition", -626779272);
        setField(term11607, term11607.getClass(), "jsType", null);
        setField(term11607, term11607.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1734;
        Object retValue = callMethod(klass, "isThis", argTypes, null, args);
        assertTrue(recursiveEquals(term1734, term11607));
        assertTrue(recursiveEquals(retValue, false));
    }

};


