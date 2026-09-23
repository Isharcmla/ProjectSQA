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

public class NodeUtil_isHoistedFunctionDeclaration_1630852851185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1815;
     Object term11810;

    public NodeUtil_isHoistedFunctionDeclaration_1630852851185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1828 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1838 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1815, term1815.getClass(), "type", 1460702778);
        setIntField(term1817, term1817.getClass(), "type", -1693535639);
        setIntField(term1819, term1819.getClass(), "type", 0);
        setField(term1819, term1819.getClass(), "next", null);
        setField(term1819, term1819.getClass(), "first", null);
        setField(term1819, term1819.getClass(), "last", null);
        setField(term1819, term1819.getClass(), "propListHead", null);
        setIntField(term1819, term1819.getClass(), "sourcePosition", 0);
        setField(term1819, term1819.getClass(), "jsType", null);
        setField(term1819, term1819.getClass(), "parent", null);
        setField(term1817, term1817.getClass(), "next", term1819);
        setIntField(term1822, term1822.getClass(), "type", 0);
        setField(term1822, term1822.getClass(), "next", null);
        setField(term1822, term1822.getClass(), "first", null);
        setField(term1822, term1822.getClass(), "last", null);
        setField(term1822, term1822.getClass(), "propListHead", null);
        setIntField(term1822, term1822.getClass(), "sourcePosition", 0);
        setField(term1822, term1822.getClass(), "jsType", null);
        setField(term1822, term1822.getClass(), "parent", null);
        setField(term1817, term1817.getClass(), "first", term1822);
        setIntField(term1825, term1825.getClass(), "type", 0);
        setField(term1825, term1825.getClass(), "next", null);
        setField(term1825, term1825.getClass(), "first", null);
        setField(term1825, term1825.getClass(), "last", null);
        setField(term1825, term1825.getClass(), "propListHead", null);
        setIntField(term1825, term1825.getClass(), "sourcePosition", 0);
        setField(term1825, term1825.getClass(), "jsType", null);
        setField(term1825, term1825.getClass(), "parent", null);
        setField(term1817, term1817.getClass(), "last", term1825);
        setField(term1828, term1828.getClass(), "next", null);
        setIntField(term1828, term1828.getClass(), "type", 0);
        setIntField(term1828, term1828.getClass(), "intValue", 0);
        setField(term1828, term1828.getClass(), "objectValue", null);
        setField(term1817, term1817.getClass(), "propListHead", term1828);
        setIntField(term1817, term1817.getClass(), "sourcePosition", -1272268399);
        setField(term1817, term1817.getClass(), "jsType", null);
        setField(term1817, term1817.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "next", term1817);
        setIntField(term1832, term1832.getClass(), "type", 0);
        setField(term1832, term1832.getClass(), "next", null);
        setField(term1832, term1832.getClass(), "first", null);
        setField(term1832, term1832.getClass(), "last", null);
        setField(term1832, term1832.getClass(), "propListHead", null);
        setIntField(term1832, term1832.getClass(), "sourcePosition", 0);
        setField(term1832, term1832.getClass(), "jsType", null);
        setField(term1832, term1832.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "first", term1832);
        setIntField(term1835, term1835.getClass(), "type", 0);
        setField(term1835, term1835.getClass(), "next", null);
        setField(term1835, term1835.getClass(), "first", null);
        setField(term1835, term1835.getClass(), "last", null);
        setField(term1835, term1835.getClass(), "propListHead", null);
        setIntField(term1835, term1835.getClass(), "sourcePosition", 0);
        setField(term1835, term1835.getClass(), "jsType", null);
        setField(term1835, term1835.getClass(), "parent", null);
        setField(term1815, term1815.getClass(), "last", term1835);
        setField(term1838, term1838.getClass(), "next", null);
        setIntField(term1838, term1838.getClass(), "type", 0);
        setIntField(term1838, term1838.getClass(), "intValue", 0);
        setField(term1838, term1838.getClass(), "objectValue", null);
        setField(term1815, term1815.getClass(), "propListHead", term1838);
        setIntField(term1815, term1815.getClass(), "sourcePosition", 1120271104);
        setField(term1815, term1815.getClass(), "jsType", null);
        setField(term1815, term1815.getClass(), "parent", null);
        term11810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11815 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11818 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11810, term11810.getClass(), "type", 1460702778);
        setIntField(term11811, term11811.getClass(), "type", -1693535639);
        setIntField(term11812, term11812.getClass(), "type", 0);
        setField(term11812, term11812.getClass(), "next", null);
        setField(term11812, term11812.getClass(), "first", null);
        setField(term11812, term11812.getClass(), "last", null);
        setField(term11812, term11812.getClass(), "propListHead", null);
        setIntField(term11812, term11812.getClass(), "sourcePosition", 0);
        setField(term11812, term11812.getClass(), "jsType", null);
        setField(term11812, term11812.getClass(), "parent", null);
        setField(term11811, term11811.getClass(), "next", term11812);
        setIntField(term11813, term11813.getClass(), "type", 0);
        setField(term11813, term11813.getClass(), "next", null);
        setField(term11813, term11813.getClass(), "first", null);
        setField(term11813, term11813.getClass(), "last", null);
        setField(term11813, term11813.getClass(), "propListHead", null);
        setIntField(term11813, term11813.getClass(), "sourcePosition", 0);
        setField(term11813, term11813.getClass(), "jsType", null);
        setField(term11813, term11813.getClass(), "parent", null);
        setField(term11811, term11811.getClass(), "first", term11813);
        setIntField(term11814, term11814.getClass(), "type", 0);
        setField(term11814, term11814.getClass(), "next", null);
        setField(term11814, term11814.getClass(), "first", null);
        setField(term11814, term11814.getClass(), "last", null);
        setField(term11814, term11814.getClass(), "propListHead", null);
        setIntField(term11814, term11814.getClass(), "sourcePosition", 0);
        setField(term11814, term11814.getClass(), "jsType", null);
        setField(term11814, term11814.getClass(), "parent", null);
        setField(term11811, term11811.getClass(), "last", term11814);
        setField(term11815, term11815.getClass(), "next", null);
        setIntField(term11815, term11815.getClass(), "type", 0);
        setIntField(term11815, term11815.getClass(), "intValue", 0);
        setField(term11815, term11815.getClass(), "objectValue", null);
        setField(term11811, term11811.getClass(), "propListHead", term11815);
        setIntField(term11811, term11811.getClass(), "sourcePosition", -1272268399);
        setField(term11811, term11811.getClass(), "jsType", null);
        setField(term11811, term11811.getClass(), "parent", null);
        setField(term11810, term11810.getClass(), "next", term11811);
        setIntField(term11816, term11816.getClass(), "type", 0);
        setField(term11816, term11816.getClass(), "next", null);
        setField(term11816, term11816.getClass(), "first", null);
        setField(term11816, term11816.getClass(), "last", null);
        setField(term11816, term11816.getClass(), "propListHead", null);
        setIntField(term11816, term11816.getClass(), "sourcePosition", 0);
        setField(term11816, term11816.getClass(), "jsType", null);
        setField(term11816, term11816.getClass(), "parent", null);
        setField(term11810, term11810.getClass(), "first", term11816);
        setIntField(term11817, term11817.getClass(), "type", 0);
        setField(term11817, term11817.getClass(), "next", null);
        setField(term11817, term11817.getClass(), "first", null);
        setField(term11817, term11817.getClass(), "last", null);
        setField(term11817, term11817.getClass(), "propListHead", null);
        setIntField(term11817, term11817.getClass(), "sourcePosition", 0);
        setField(term11817, term11817.getClass(), "jsType", null);
        setField(term11817, term11817.getClass(), "parent", null);
        setField(term11810, term11810.getClass(), "last", term11817);
        setField(term11818, term11818.getClass(), "next", null);
        setIntField(term11818, term11818.getClass(), "type", 0);
        setIntField(term11818, term11818.getClass(), "intValue", 0);
        setField(term11818, term11818.getClass(), "objectValue", null);
        setField(term11810, term11810.getClass(), "propListHead", term11818);
        setIntField(term11810, term11810.getClass(), "sourcePosition", 1120271104);
        setField(term11810, term11810.getClass(), "jsType", null);
        setField(term11810, term11810.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1815;
        Object retValue = callMethod(klass, "isHoistedFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1815, term11810));
        assertTrue(recursiveEquals(retValue, false));
    }

};


