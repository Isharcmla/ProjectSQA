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

public class IR_eq_543743324117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1804;
     Object term1831;

    public IR_eq_543743324117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1804, term1804.getClass(), "type", 1349815364);
        setIntField(term1806, term1806.getClass(), "type", 2128383340);
        setIntField(term1808, term1808.getClass(), "type", 1238598518);
        setIntField(term1810, term1810.getClass(), "type", -558146961);
        setIntField(term1812, term1812.getClass(), "type", 1505480070);
        setField(term1812, term1812.getClass(), "next", null);
        setField(term1812, term1812.getClass(), "first", null);
        setField(term1812, term1812.getClass(), "last", null);
        setField(term1812, term1812.getClass(), "propListHead", null);
        setIntField(term1812, term1812.getClass(), "sourcePosition", 0);
        setField(term1812, term1812.getClass(), "jsType", null);
        setField(term1812, term1812.getClass(), "parent", null);
        setField(term1810, term1810.getClass(), "next", term1812);
        setIntField(term1815, term1815.getClass(), "type", -829088844);
        setField(term1815, term1815.getClass(), "next", null);
        setField(term1815, term1815.getClass(), "first", null);
        setField(term1815, term1815.getClass(), "last", term1812);
        setField(term1815, term1815.getClass(), "propListHead", null);
        setIntField(term1815, term1815.getClass(), "sourcePosition", 0);
        setField(term1815, term1815.getClass(), "jsType", null);
        setField(term1815, term1815.getClass(), "parent", null);
        setField(term1810, term1810.getClass(), "first", term1815);
        setField(term1810, term1810.getClass(), "last", term1808);
        setField(term1810, term1810.getClass(), "propListHead", null);
        setIntField(term1810, term1810.getClass(), "sourcePosition", 0);
        setField(term1810, term1810.getClass(), "jsType", null);
        setField(term1810, term1810.getClass(), "parent", null);
        setField(term1808, term1808.getClass(), "next", term1810);
        setField(term1808, term1808.getClass(), "first", term1812);
        setIntField(term1819, term1819.getClass(), "type", -246967963);
        setIntField(term1821, term1821.getClass(), "type", -1777140369);
        setField(term1821, term1821.getClass(), "next", null);
        setField(term1821, term1821.getClass(), "first", term1815);
        setField(term1821, term1821.getClass(), "last", term1810);
        setField(term1821, term1821.getClass(), "propListHead", null);
        setIntField(term1821, term1821.getClass(), "sourcePosition", 0);
        setField(term1821, term1821.getClass(), "jsType", null);
        setField(term1821, term1821.getClass(), "parent", null);
        setField(term1819, term1819.getClass(), "next", term1821);
        setField(term1819, term1819.getClass(), "first", term1806);
        setField(term1819, term1819.getClass(), "last", term1806);
        setField(term1819, term1819.getClass(), "propListHead", null);
        setIntField(term1819, term1819.getClass(), "sourcePosition", 0);
        setField(term1819, term1819.getClass(), "jsType", null);
        setField(term1819, term1819.getClass(), "parent", null);
        setField(term1808, term1808.getClass(), "last", term1819);
        setField(term1808, term1808.getClass(), "propListHead", null);
        setIntField(term1808, term1808.getClass(), "sourcePosition", 0);
        setField(term1808, term1808.getClass(), "jsType", null);
        setField(term1808, term1808.getClass(), "parent", null);
        setField(term1806, term1806.getClass(), "next", term1808);
        setIntField(term1826, term1826.getClass(), "type", 993627098);
        setField(term1826, term1826.getClass(), "next", term1819);
        setField(term1826, term1826.getClass(), "first", term1821);
        setField(term1826, term1826.getClass(), "last", term1804);
        setField(term1826, term1826.getClass(), "propListHead", null);
        setIntField(term1826, term1826.getClass(), "sourcePosition", 0);
        setField(term1826, term1826.getClass(), "jsType", null);
        setField(term1826, term1826.getClass(), "parent", null);
        setField(term1806, term1806.getClass(), "first", term1826);
        setField(term1806, term1806.getClass(), "last", term1826);
        setField(term1806, term1806.getClass(), "propListHead", null);
        setIntField(term1806, term1806.getClass(), "sourcePosition", 0);
        setField(term1806, term1806.getClass(), "jsType", null);
        setField(term1806, term1806.getClass(), "parent", null);
        setField(term1804, term1804.getClass(), "next", term1806);
        setField(term1804, term1804.getClass(), "first", term1810);
        setField(term1804, term1804.getClass(), "last", term1812);
        setField(term1804, term1804.getClass(), "propListHead", null);
        setIntField(term1804, term1804.getClass(), "sourcePosition", 0);
        setField(term1804, term1804.getClass(), "jsType", null);
        setField(term1804, term1804.getClass(), "parent", null);
        term1831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1831, term1831.getClass(), "type", 872295704);
        setIntField(term1833, term1833.getClass(), "type", 86041387);
        setIntField(term1835, term1835.getClass(), "type", 1010721666);
        setIntField(term1837, term1837.getClass(), "type", 27043781);
        setIntField(term1839, term1839.getClass(), "type", -1367122405);
        setField(term1839, term1839.getClass(), "next", null);
        setField(term1839, term1839.getClass(), "first", null);
        setField(term1839, term1839.getClass(), "last", null);
        setField(term1839, term1839.getClass(), "propListHead", null);
        setIntField(term1839, term1839.getClass(), "sourcePosition", 0);
        setField(term1839, term1839.getClass(), "jsType", null);
        setField(term1839, term1839.getClass(), "parent", null);
        setField(term1837, term1837.getClass(), "next", term1839);
        setIntField(term1842, term1842.getClass(), "type", -1703625118);
        setField(term1842, term1842.getClass(), "next", null);
        setField(term1842, term1842.getClass(), "first", null);
        setField(term1842, term1842.getClass(), "last", term1839);
        setField(term1842, term1842.getClass(), "propListHead", null);
        setIntField(term1842, term1842.getClass(), "sourcePosition", 0);
        setField(term1842, term1842.getClass(), "jsType", null);
        setField(term1842, term1842.getClass(), "parent", null);
        setField(term1837, term1837.getClass(), "first", term1842);
        setField(term1837, term1837.getClass(), "last", term1835);
        setField(term1837, term1837.getClass(), "propListHead", null);
        setIntField(term1837, term1837.getClass(), "sourcePosition", 0);
        setField(term1837, term1837.getClass(), "jsType", null);
        setField(term1837, term1837.getClass(), "parent", null);
        setField(term1835, term1835.getClass(), "next", term1837);
        setField(term1835, term1835.getClass(), "first", term1839);
        setIntField(term1846, term1846.getClass(), "type", 1648665618);
        setIntField(term1848, term1848.getClass(), "type", 633765954);
        setField(term1848, term1848.getClass(), "next", null);
        setField(term1848, term1848.getClass(), "first", term1842);
        setField(term1848, term1848.getClass(), "last", term1837);
        setField(term1848, term1848.getClass(), "propListHead", null);
        setIntField(term1848, term1848.getClass(), "sourcePosition", 0);
        setField(term1848, term1848.getClass(), "jsType", null);
        setField(term1848, term1848.getClass(), "parent", null);
        setField(term1846, term1846.getClass(), "next", term1848);
        setField(term1846, term1846.getClass(), "first", term1833);
        setField(term1846, term1846.getClass(), "last", term1833);
        setField(term1846, term1846.getClass(), "propListHead", null);
        setIntField(term1846, term1846.getClass(), "sourcePosition", 0);
        setField(term1846, term1846.getClass(), "jsType", null);
        setField(term1846, term1846.getClass(), "parent", null);
        setField(term1835, term1835.getClass(), "last", term1846);
        setField(term1835, term1835.getClass(), "propListHead", null);
        setIntField(term1835, term1835.getClass(), "sourcePosition", 0);
        setField(term1835, term1835.getClass(), "jsType", null);
        setField(term1835, term1835.getClass(), "parent", null);
        setField(term1833, term1833.getClass(), "next", term1835);
        setIntField(term1853, term1853.getClass(), "type", 269110087);
        setField(term1853, term1853.getClass(), "next", term1846);
        setField(term1853, term1853.getClass(), "first", term1848);
        setField(term1853, term1853.getClass(), "last", term1831);
        setField(term1853, term1853.getClass(), "propListHead", null);
        setIntField(term1853, term1853.getClass(), "sourcePosition", 0);
        setField(term1853, term1853.getClass(), "jsType", null);
        setField(term1853, term1853.getClass(), "parent", null);
        setField(term1833, term1833.getClass(), "first", term1853);
        setField(term1833, term1833.getClass(), "last", term1853);
        setField(term1833, term1833.getClass(), "propListHead", null);
        setIntField(term1833, term1833.getClass(), "sourcePosition", 0);
        setField(term1833, term1833.getClass(), "jsType", null);
        setField(term1833, term1833.getClass(), "parent", null);
        setField(term1831, term1831.getClass(), "next", term1833);
        setField(term1831, term1831.getClass(), "first", term1837);
        setField(term1831, term1831.getClass(), "last", term1839);
        setField(term1831, term1831.getClass(), "propListHead", null);
        setIntField(term1831, term1831.getClass(), "sourcePosition", 0);
        setField(term1831, term1831.getClass(), "jsType", null);
        setField(term1831, term1831.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1804;
        args[1] = term1831;
        try {
            callMethod(klass, "eq", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


