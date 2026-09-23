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

public class NodeUtil_isStatementParent_1289829320225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1892;
     Object term13698;

    public NodeUtil_isStatementParent_1289829320225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1905 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1915 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1892, term1892.getClass(), "type", 1631305277);
        setIntField(term1894, term1894.getClass(), "type", -179238712);
        setIntField(term1896, term1896.getClass(), "type", 0);
        setField(term1896, term1896.getClass(), "next", null);
        setField(term1896, term1896.getClass(), "first", null);
        setField(term1896, term1896.getClass(), "last", null);
        setField(term1896, term1896.getClass(), "propListHead", null);
        setIntField(term1896, term1896.getClass(), "sourcePosition", 0);
        setField(term1896, term1896.getClass(), "jsType", null);
        setField(term1896, term1896.getClass(), "parent", null);
        setField(term1894, term1894.getClass(), "next", term1896);
        setIntField(term1899, term1899.getClass(), "type", 0);
        setField(term1899, term1899.getClass(), "next", null);
        setField(term1899, term1899.getClass(), "first", null);
        setField(term1899, term1899.getClass(), "last", null);
        setField(term1899, term1899.getClass(), "propListHead", null);
        setIntField(term1899, term1899.getClass(), "sourcePosition", 0);
        setField(term1899, term1899.getClass(), "jsType", null);
        setField(term1899, term1899.getClass(), "parent", null);
        setField(term1894, term1894.getClass(), "first", term1899);
        setIntField(term1902, term1902.getClass(), "type", 0);
        setField(term1902, term1902.getClass(), "next", null);
        setField(term1902, term1902.getClass(), "first", null);
        setField(term1902, term1902.getClass(), "last", null);
        setField(term1902, term1902.getClass(), "propListHead", null);
        setIntField(term1902, term1902.getClass(), "sourcePosition", 0);
        setField(term1902, term1902.getClass(), "jsType", null);
        setField(term1902, term1902.getClass(), "parent", null);
        setField(term1894, term1894.getClass(), "last", term1902);
        setField(term1905, term1905.getClass(), "next", null);
        setIntField(term1905, term1905.getClass(), "type", 0);
        setIntField(term1905, term1905.getClass(), "intValue", 0);
        setField(term1905, term1905.getClass(), "objectValue", null);
        setField(term1894, term1894.getClass(), "propListHead", term1905);
        setIntField(term1894, term1894.getClass(), "sourcePosition", -2009613557);
        setField(term1894, term1894.getClass(), "jsType", null);
        setField(term1894, term1894.getClass(), "parent", null);
        setField(term1892, term1892.getClass(), "next", term1894);
        setIntField(term1909, term1909.getClass(), "type", 0);
        setField(term1909, term1909.getClass(), "next", null);
        setField(term1909, term1909.getClass(), "first", null);
        setField(term1909, term1909.getClass(), "last", null);
        setField(term1909, term1909.getClass(), "propListHead", null);
        setIntField(term1909, term1909.getClass(), "sourcePosition", 0);
        setField(term1909, term1909.getClass(), "jsType", null);
        setField(term1909, term1909.getClass(), "parent", null);
        setField(term1892, term1892.getClass(), "first", term1909);
        setIntField(term1912, term1912.getClass(), "type", 0);
        setField(term1912, term1912.getClass(), "next", null);
        setField(term1912, term1912.getClass(), "first", null);
        setField(term1912, term1912.getClass(), "last", null);
        setField(term1912, term1912.getClass(), "propListHead", null);
        setIntField(term1912, term1912.getClass(), "sourcePosition", 0);
        setField(term1912, term1912.getClass(), "jsType", null);
        setField(term1912, term1912.getClass(), "parent", null);
        setField(term1892, term1892.getClass(), "last", term1912);
        setField(term1915, term1915.getClass(), "next", null);
        setIntField(term1915, term1915.getClass(), "type", 0);
        setIntField(term1915, term1915.getClass(), "intValue", 0);
        setField(term1915, term1915.getClass(), "objectValue", null);
        setField(term1892, term1892.getClass(), "propListHead", term1915);
        setIntField(term1892, term1892.getClass(), "sourcePosition", 654195547);
        setField(term1892, term1892.getClass(), "jsType", null);
        setField(term1892, term1892.getClass(), "parent", null);
        term13698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13703 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13706 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13698, term13698.getClass(), "type", 1631305277);
        setIntField(term13699, term13699.getClass(), "type", -179238712);
        setIntField(term13700, term13700.getClass(), "type", 0);
        setField(term13700, term13700.getClass(), "next", null);
        setField(term13700, term13700.getClass(), "first", null);
        setField(term13700, term13700.getClass(), "last", null);
        setField(term13700, term13700.getClass(), "propListHead", null);
        setIntField(term13700, term13700.getClass(), "sourcePosition", 0);
        setField(term13700, term13700.getClass(), "jsType", null);
        setField(term13700, term13700.getClass(), "parent", null);
        setField(term13699, term13699.getClass(), "next", term13700);
        setIntField(term13701, term13701.getClass(), "type", 0);
        setField(term13701, term13701.getClass(), "next", null);
        setField(term13701, term13701.getClass(), "first", null);
        setField(term13701, term13701.getClass(), "last", null);
        setField(term13701, term13701.getClass(), "propListHead", null);
        setIntField(term13701, term13701.getClass(), "sourcePosition", 0);
        setField(term13701, term13701.getClass(), "jsType", null);
        setField(term13701, term13701.getClass(), "parent", null);
        setField(term13699, term13699.getClass(), "first", term13701);
        setIntField(term13702, term13702.getClass(), "type", 0);
        setField(term13702, term13702.getClass(), "next", null);
        setField(term13702, term13702.getClass(), "first", null);
        setField(term13702, term13702.getClass(), "last", null);
        setField(term13702, term13702.getClass(), "propListHead", null);
        setIntField(term13702, term13702.getClass(), "sourcePosition", 0);
        setField(term13702, term13702.getClass(), "jsType", null);
        setField(term13702, term13702.getClass(), "parent", null);
        setField(term13699, term13699.getClass(), "last", term13702);
        setField(term13703, term13703.getClass(), "next", null);
        setIntField(term13703, term13703.getClass(), "type", 0);
        setIntField(term13703, term13703.getClass(), "intValue", 0);
        setField(term13703, term13703.getClass(), "objectValue", null);
        setField(term13699, term13699.getClass(), "propListHead", term13703);
        setIntField(term13699, term13699.getClass(), "sourcePosition", -2009613557);
        setField(term13699, term13699.getClass(), "jsType", null);
        setField(term13699, term13699.getClass(), "parent", null);
        setField(term13698, term13698.getClass(), "next", term13699);
        setIntField(term13704, term13704.getClass(), "type", 0);
        setField(term13704, term13704.getClass(), "next", null);
        setField(term13704, term13704.getClass(), "first", null);
        setField(term13704, term13704.getClass(), "last", null);
        setField(term13704, term13704.getClass(), "propListHead", null);
        setIntField(term13704, term13704.getClass(), "sourcePosition", 0);
        setField(term13704, term13704.getClass(), "jsType", null);
        setField(term13704, term13704.getClass(), "parent", null);
        setField(term13698, term13698.getClass(), "first", term13704);
        setIntField(term13705, term13705.getClass(), "type", 0);
        setField(term13705, term13705.getClass(), "next", null);
        setField(term13705, term13705.getClass(), "first", null);
        setField(term13705, term13705.getClass(), "last", null);
        setField(term13705, term13705.getClass(), "propListHead", null);
        setIntField(term13705, term13705.getClass(), "sourcePosition", 0);
        setField(term13705, term13705.getClass(), "jsType", null);
        setField(term13705, term13705.getClass(), "parent", null);
        setField(term13698, term13698.getClass(), "last", term13705);
        setField(term13706, term13706.getClass(), "next", null);
        setIntField(term13706, term13706.getClass(), "type", 0);
        setIntField(term13706, term13706.getClass(), "intValue", 0);
        setField(term13706, term13706.getClass(), "objectValue", null);
        setField(term13698, term13698.getClass(), "propListHead", term13706);
        setIntField(term13698, term13698.getClass(), "sourcePosition", 654195547);
        setField(term13698, term13698.getClass(), "jsType", null);
        setField(term13698, term13698.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1892;
        Object retValue = callMethod(klass, "isStatementParent", argTypes, null, args);
        assertTrue(recursiveEquals(term1892, term13698));
        assertTrue(recursiveEquals(retValue, false));
    }

};


