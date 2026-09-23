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

public class IR_and_453906161114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1669;
     Object term1696;

    public IR_and_453906161114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1669, term1669.getClass(), "type", 1091954101);
        setIntField(term1671, term1671.getClass(), "type", 1895143076);
        setIntField(term1673, term1673.getClass(), "type", 1981860404);
        setIntField(term1675, term1675.getClass(), "type", 732174235);
        setIntField(term1677, term1677.getClass(), "type", 470895808);
        setField(term1677, term1677.getClass(), "next", null);
        setField(term1677, term1677.getClass(), "first", null);
        setField(term1677, term1677.getClass(), "last", null);
        setField(term1677, term1677.getClass(), "propListHead", null);
        setIntField(term1677, term1677.getClass(), "sourcePosition", 0);
        setField(term1677, term1677.getClass(), "jsType", null);
        setField(term1677, term1677.getClass(), "parent", null);
        setField(term1675, term1675.getClass(), "next", term1677);
        setIntField(term1680, term1680.getClass(), "type", 1787325291);
        setField(term1680, term1680.getClass(), "next", null);
        setField(term1680, term1680.getClass(), "first", null);
        setField(term1680, term1680.getClass(), "last", term1677);
        setField(term1680, term1680.getClass(), "propListHead", null);
        setIntField(term1680, term1680.getClass(), "sourcePosition", 0);
        setField(term1680, term1680.getClass(), "jsType", null);
        setField(term1680, term1680.getClass(), "parent", null);
        setField(term1675, term1675.getClass(), "first", term1680);
        setField(term1675, term1675.getClass(), "last", term1673);
        setField(term1675, term1675.getClass(), "propListHead", null);
        setIntField(term1675, term1675.getClass(), "sourcePosition", 0);
        setField(term1675, term1675.getClass(), "jsType", null);
        setField(term1675, term1675.getClass(), "parent", null);
        setField(term1673, term1673.getClass(), "next", term1675);
        setField(term1673, term1673.getClass(), "first", term1677);
        setIntField(term1684, term1684.getClass(), "type", -255317272);
        setIntField(term1686, term1686.getClass(), "type", -706253892);
        setField(term1686, term1686.getClass(), "next", null);
        setField(term1686, term1686.getClass(), "first", term1680);
        setField(term1686, term1686.getClass(), "last", term1675);
        setField(term1686, term1686.getClass(), "propListHead", null);
        setIntField(term1686, term1686.getClass(), "sourcePosition", 0);
        setField(term1686, term1686.getClass(), "jsType", null);
        setField(term1686, term1686.getClass(), "parent", null);
        setField(term1684, term1684.getClass(), "next", term1686);
        setField(term1684, term1684.getClass(), "first", term1671);
        setField(term1684, term1684.getClass(), "last", term1671);
        setField(term1684, term1684.getClass(), "propListHead", null);
        setIntField(term1684, term1684.getClass(), "sourcePosition", 0);
        setField(term1684, term1684.getClass(), "jsType", null);
        setField(term1684, term1684.getClass(), "parent", null);
        setField(term1673, term1673.getClass(), "last", term1684);
        setField(term1673, term1673.getClass(), "propListHead", null);
        setIntField(term1673, term1673.getClass(), "sourcePosition", 0);
        setField(term1673, term1673.getClass(), "jsType", null);
        setField(term1673, term1673.getClass(), "parent", null);
        setField(term1671, term1671.getClass(), "next", term1673);
        setIntField(term1691, term1691.getClass(), "type", -1341439819);
        setField(term1691, term1691.getClass(), "next", term1684);
        setField(term1691, term1691.getClass(), "first", term1686);
        setField(term1691, term1691.getClass(), "last", term1669);
        setField(term1691, term1691.getClass(), "propListHead", null);
        setIntField(term1691, term1691.getClass(), "sourcePosition", 0);
        setField(term1691, term1691.getClass(), "jsType", null);
        setField(term1691, term1691.getClass(), "parent", null);
        setField(term1671, term1671.getClass(), "first", term1691);
        setField(term1671, term1671.getClass(), "last", term1691);
        setField(term1671, term1671.getClass(), "propListHead", null);
        setIntField(term1671, term1671.getClass(), "sourcePosition", 0);
        setField(term1671, term1671.getClass(), "jsType", null);
        setField(term1671, term1671.getClass(), "parent", null);
        setField(term1669, term1669.getClass(), "next", term1671);
        setField(term1669, term1669.getClass(), "first", term1675);
        setField(term1669, term1669.getClass(), "last", term1677);
        setField(term1669, term1669.getClass(), "propListHead", null);
        setIntField(term1669, term1669.getClass(), "sourcePosition", 0);
        setField(term1669, term1669.getClass(), "jsType", null);
        setField(term1669, term1669.getClass(), "parent", null);
        term1696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1696, term1696.getClass(), "type", -728760750);
        setIntField(term1698, term1698.getClass(), "type", -1617383807);
        setIntField(term1700, term1700.getClass(), "type", -1244386281);
        setIntField(term1702, term1702.getClass(), "type", -885788574);
        setIntField(term1704, term1704.getClass(), "type", -865722613);
        setField(term1704, term1704.getClass(), "next", null);
        setField(term1704, term1704.getClass(), "first", null);
        setField(term1704, term1704.getClass(), "last", null);
        setField(term1704, term1704.getClass(), "propListHead", null);
        setIntField(term1704, term1704.getClass(), "sourcePosition", 0);
        setField(term1704, term1704.getClass(), "jsType", null);
        setField(term1704, term1704.getClass(), "parent", null);
        setField(term1702, term1702.getClass(), "next", term1704);
        setIntField(term1707, term1707.getClass(), "type", -1551355284);
        setField(term1707, term1707.getClass(), "next", null);
        setField(term1707, term1707.getClass(), "first", null);
        setField(term1707, term1707.getClass(), "last", term1704);
        setField(term1707, term1707.getClass(), "propListHead", null);
        setIntField(term1707, term1707.getClass(), "sourcePosition", 0);
        setField(term1707, term1707.getClass(), "jsType", null);
        setField(term1707, term1707.getClass(), "parent", null);
        setField(term1702, term1702.getClass(), "first", term1707);
        setField(term1702, term1702.getClass(), "last", term1700);
        setField(term1702, term1702.getClass(), "propListHead", null);
        setIntField(term1702, term1702.getClass(), "sourcePosition", 0);
        setField(term1702, term1702.getClass(), "jsType", null);
        setField(term1702, term1702.getClass(), "parent", null);
        setField(term1700, term1700.getClass(), "next", term1702);
        setField(term1700, term1700.getClass(), "first", term1704);
        setIntField(term1711, term1711.getClass(), "type", 1213549815);
        setIntField(term1713, term1713.getClass(), "type", -1518419301);
        setField(term1713, term1713.getClass(), "next", null);
        setField(term1713, term1713.getClass(), "first", term1707);
        setField(term1713, term1713.getClass(), "last", term1702);
        setField(term1713, term1713.getClass(), "propListHead", null);
        setIntField(term1713, term1713.getClass(), "sourcePosition", 0);
        setField(term1713, term1713.getClass(), "jsType", null);
        setField(term1713, term1713.getClass(), "parent", null);
        setField(term1711, term1711.getClass(), "next", term1713);
        setField(term1711, term1711.getClass(), "first", term1698);
        setField(term1711, term1711.getClass(), "last", term1698);
        setField(term1711, term1711.getClass(), "propListHead", null);
        setIntField(term1711, term1711.getClass(), "sourcePosition", 0);
        setField(term1711, term1711.getClass(), "jsType", null);
        setField(term1711, term1711.getClass(), "parent", null);
        setField(term1700, term1700.getClass(), "last", term1711);
        setField(term1700, term1700.getClass(), "propListHead", null);
        setIntField(term1700, term1700.getClass(), "sourcePosition", 0);
        setField(term1700, term1700.getClass(), "jsType", null);
        setField(term1700, term1700.getClass(), "parent", null);
        setField(term1698, term1698.getClass(), "next", term1700);
        setIntField(term1718, term1718.getClass(), "type", 674879025);
        setField(term1718, term1718.getClass(), "next", term1711);
        setField(term1718, term1718.getClass(), "first", term1713);
        setField(term1718, term1718.getClass(), "last", term1696);
        setField(term1718, term1718.getClass(), "propListHead", null);
        setIntField(term1718, term1718.getClass(), "sourcePosition", 0);
        setField(term1718, term1718.getClass(), "jsType", null);
        setField(term1718, term1718.getClass(), "parent", null);
        setField(term1698, term1698.getClass(), "first", term1718);
        setField(term1698, term1698.getClass(), "last", term1718);
        setField(term1698, term1698.getClass(), "propListHead", null);
        setIntField(term1698, term1698.getClass(), "sourcePosition", 0);
        setField(term1698, term1698.getClass(), "jsType", null);
        setField(term1698, term1698.getClass(), "parent", null);
        setField(term1696, term1696.getClass(), "next", term1698);
        setField(term1696, term1696.getClass(), "first", term1702);
        setField(term1696, term1696.getClass(), "last", term1704);
        setField(term1696, term1696.getClass(), "propListHead", null);
        setIntField(term1696, term1696.getClass(), "sourcePosition", 0);
        setField(term1696, term1696.getClass(), "jsType", null);
        setField(term1696, term1696.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1669;
        args[1] = term1696;
        try {
            callMethod(klass, "and", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


