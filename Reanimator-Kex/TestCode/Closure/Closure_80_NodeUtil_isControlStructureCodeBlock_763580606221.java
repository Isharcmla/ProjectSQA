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

public class NodeUtil_isControlStructureCodeBlock_763580606221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1757;
     Object term1784;

    public NodeUtil_isControlStructureCodeBlock_763580606221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1770 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1780 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1757, term1757.getClass(), "type", 1815951606);
        setIntField(term1759, term1759.getClass(), "type", -1858909368);
        setIntField(term1761, term1761.getClass(), "type", 0);
        setField(term1761, term1761.getClass(), "next", null);
        setField(term1761, term1761.getClass(), "first", null);
        setField(term1761, term1761.getClass(), "last", null);
        setField(term1761, term1761.getClass(), "propListHead", null);
        setIntField(term1761, term1761.getClass(), "sourcePosition", 0);
        setField(term1761, term1761.getClass(), "jsType", null);
        setField(term1761, term1761.getClass(), "parent", null);
        setField(term1759, term1759.getClass(), "next", term1761);
        setIntField(term1764, term1764.getClass(), "type", 0);
        setField(term1764, term1764.getClass(), "next", null);
        setField(term1764, term1764.getClass(), "first", null);
        setField(term1764, term1764.getClass(), "last", null);
        setField(term1764, term1764.getClass(), "propListHead", null);
        setIntField(term1764, term1764.getClass(), "sourcePosition", 0);
        setField(term1764, term1764.getClass(), "jsType", null);
        setField(term1764, term1764.getClass(), "parent", null);
        setField(term1759, term1759.getClass(), "first", term1764);
        setIntField(term1767, term1767.getClass(), "type", 0);
        setField(term1767, term1767.getClass(), "next", null);
        setField(term1767, term1767.getClass(), "first", null);
        setField(term1767, term1767.getClass(), "last", null);
        setField(term1767, term1767.getClass(), "propListHead", null);
        setIntField(term1767, term1767.getClass(), "sourcePosition", 0);
        setField(term1767, term1767.getClass(), "jsType", null);
        setField(term1767, term1767.getClass(), "parent", null);
        setField(term1759, term1759.getClass(), "last", term1767);
        setField(term1770, term1770.getClass(), "next", null);
        setIntField(term1770, term1770.getClass(), "type", 0);
        setIntField(term1770, term1770.getClass(), "intValue", 0);
        setField(term1770, term1770.getClass(), "objectValue", null);
        setField(term1759, term1759.getClass(), "propListHead", term1770);
        setIntField(term1759, term1759.getClass(), "sourcePosition", 1409095253);
        setField(term1759, term1759.getClass(), "jsType", null);
        setField(term1759, term1759.getClass(), "parent", null);
        setField(term1757, term1757.getClass(), "next", term1759);
        setIntField(term1774, term1774.getClass(), "type", 0);
        setField(term1774, term1774.getClass(), "next", null);
        setField(term1774, term1774.getClass(), "first", null);
        setField(term1774, term1774.getClass(), "last", null);
        setField(term1774, term1774.getClass(), "propListHead", null);
        setIntField(term1774, term1774.getClass(), "sourcePosition", 0);
        setField(term1774, term1774.getClass(), "jsType", null);
        setField(term1774, term1774.getClass(), "parent", null);
        setField(term1757, term1757.getClass(), "first", term1774);
        setIntField(term1777, term1777.getClass(), "type", 0);
        setField(term1777, term1777.getClass(), "next", null);
        setField(term1777, term1777.getClass(), "first", null);
        setField(term1777, term1777.getClass(), "last", null);
        setField(term1777, term1777.getClass(), "propListHead", null);
        setIntField(term1777, term1777.getClass(), "sourcePosition", 0);
        setField(term1777, term1777.getClass(), "jsType", null);
        setField(term1777, term1777.getClass(), "parent", null);
        setField(term1757, term1757.getClass(), "last", term1777);
        setField(term1780, term1780.getClass(), "next", null);
        setIntField(term1780, term1780.getClass(), "type", 0);
        setIntField(term1780, term1780.getClass(), "intValue", 0);
        setField(term1780, term1780.getClass(), "objectValue", null);
        setField(term1757, term1757.getClass(), "propListHead", term1780);
        setIntField(term1757, term1757.getClass(), "sourcePosition", 315179039);
        setField(term1757, term1757.getClass(), "jsType", null);
        setField(term1757, term1757.getClass(), "parent", null);
        term1784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1797 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1784, term1784.getClass(), "type", -1934033808);
        setIntField(term1786, term1786.getClass(), "type", -485108462);
        setIntField(term1788, term1788.getClass(), "type", 0);
        setField(term1788, term1788.getClass(), "next", null);
        setField(term1788, term1788.getClass(), "first", null);
        setField(term1788, term1788.getClass(), "last", null);
        setField(term1788, term1788.getClass(), "propListHead", null);
        setIntField(term1788, term1788.getClass(), "sourcePosition", 0);
        setField(term1788, term1788.getClass(), "jsType", null);
        setField(term1788, term1788.getClass(), "parent", null);
        setField(term1786, term1786.getClass(), "next", term1788);
        setIntField(term1791, term1791.getClass(), "type", 0);
        setField(term1791, term1791.getClass(), "next", null);
        setField(term1791, term1791.getClass(), "first", null);
        setField(term1791, term1791.getClass(), "last", null);
        setField(term1791, term1791.getClass(), "propListHead", null);
        setIntField(term1791, term1791.getClass(), "sourcePosition", 0);
        setField(term1791, term1791.getClass(), "jsType", null);
        setField(term1791, term1791.getClass(), "parent", null);
        setField(term1786, term1786.getClass(), "first", term1791);
        setIntField(term1794, term1794.getClass(), "type", 0);
        setField(term1794, term1794.getClass(), "next", null);
        setField(term1794, term1794.getClass(), "first", null);
        setField(term1794, term1794.getClass(), "last", null);
        setField(term1794, term1794.getClass(), "propListHead", null);
        setIntField(term1794, term1794.getClass(), "sourcePosition", 0);
        setField(term1794, term1794.getClass(), "jsType", null);
        setField(term1794, term1794.getClass(), "parent", null);
        setField(term1786, term1786.getClass(), "last", term1794);
        setField(term1797, term1797.getClass(), "next", null);
        setIntField(term1797, term1797.getClass(), "type", 0);
        setIntField(term1797, term1797.getClass(), "intValue", 0);
        setField(term1797, term1797.getClass(), "objectValue", null);
        setField(term1786, term1786.getClass(), "propListHead", term1797);
        setIntField(term1786, term1786.getClass(), "sourcePosition", -1150062870);
        setField(term1786, term1786.getClass(), "jsType", null);
        setField(term1786, term1786.getClass(), "parent", null);
        setField(term1784, term1784.getClass(), "next", term1786);
        setIntField(term1801, term1801.getClass(), "type", 0);
        setField(term1801, term1801.getClass(), "next", null);
        setField(term1801, term1801.getClass(), "first", null);
        setField(term1801, term1801.getClass(), "last", null);
        setField(term1801, term1801.getClass(), "propListHead", null);
        setIntField(term1801, term1801.getClass(), "sourcePosition", 0);
        setField(term1801, term1801.getClass(), "jsType", null);
        setField(term1801, term1801.getClass(), "parent", null);
        setField(term1784, term1784.getClass(), "first", term1801);
        setIntField(term1804, term1804.getClass(), "type", 0);
        setField(term1804, term1804.getClass(), "next", null);
        setField(term1804, term1804.getClass(), "first", null);
        setField(term1804, term1804.getClass(), "last", null);
        setField(term1804, term1804.getClass(), "propListHead", null);
        setIntField(term1804, term1804.getClass(), "sourcePosition", 0);
        setField(term1804, term1804.getClass(), "jsType", null);
        setField(term1804, term1804.getClass(), "parent", null);
        setField(term1784, term1784.getClass(), "last", term1804);
        setField(term1807, term1807.getClass(), "next", null);
        setIntField(term1807, term1807.getClass(), "type", 0);
        setIntField(term1807, term1807.getClass(), "intValue", 0);
        setField(term1807, term1807.getClass(), "objectValue", null);
        setField(term1784, term1784.getClass(), "propListHead", term1807);
        setIntField(term1784, term1784.getClass(), "sourcePosition", -886200503);
        setField(term1784, term1784.getClass(), "jsType", null);
        setField(term1784, term1784.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1757;
        args[1] = term1784;
        try {
            callMethod(klass, "isControlStructureCodeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


