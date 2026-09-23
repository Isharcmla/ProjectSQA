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

public class NodeUtil_isSwitchCase_1170575017225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1892;
     Object term13614;

    public NodeUtil_isSwitchCase_1170575017225() {
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
        term13614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13619 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13622 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13614, term13614.getClass(), "type", 1631305277);
        setIntField(term13615, term13615.getClass(), "type", -179238712);
        setIntField(term13616, term13616.getClass(), "type", 0);
        setField(term13616, term13616.getClass(), "next", null);
        setField(term13616, term13616.getClass(), "first", null);
        setField(term13616, term13616.getClass(), "last", null);
        setField(term13616, term13616.getClass(), "propListHead", null);
        setIntField(term13616, term13616.getClass(), "sourcePosition", 0);
        setField(term13616, term13616.getClass(), "jsType", null);
        setField(term13616, term13616.getClass(), "parent", null);
        setField(term13615, term13615.getClass(), "next", term13616);
        setIntField(term13617, term13617.getClass(), "type", 0);
        setField(term13617, term13617.getClass(), "next", null);
        setField(term13617, term13617.getClass(), "first", null);
        setField(term13617, term13617.getClass(), "last", null);
        setField(term13617, term13617.getClass(), "propListHead", null);
        setIntField(term13617, term13617.getClass(), "sourcePosition", 0);
        setField(term13617, term13617.getClass(), "jsType", null);
        setField(term13617, term13617.getClass(), "parent", null);
        setField(term13615, term13615.getClass(), "first", term13617);
        setIntField(term13618, term13618.getClass(), "type", 0);
        setField(term13618, term13618.getClass(), "next", null);
        setField(term13618, term13618.getClass(), "first", null);
        setField(term13618, term13618.getClass(), "last", null);
        setField(term13618, term13618.getClass(), "propListHead", null);
        setIntField(term13618, term13618.getClass(), "sourcePosition", 0);
        setField(term13618, term13618.getClass(), "jsType", null);
        setField(term13618, term13618.getClass(), "parent", null);
        setField(term13615, term13615.getClass(), "last", term13618);
        setField(term13619, term13619.getClass(), "next", null);
        setIntField(term13619, term13619.getClass(), "type", 0);
        setIntField(term13619, term13619.getClass(), "intValue", 0);
        setField(term13619, term13619.getClass(), "objectValue", null);
        setField(term13615, term13615.getClass(), "propListHead", term13619);
        setIntField(term13615, term13615.getClass(), "sourcePosition", -2009613557);
        setField(term13615, term13615.getClass(), "jsType", null);
        setField(term13615, term13615.getClass(), "parent", null);
        setField(term13614, term13614.getClass(), "next", term13615);
        setIntField(term13620, term13620.getClass(), "type", 0);
        setField(term13620, term13620.getClass(), "next", null);
        setField(term13620, term13620.getClass(), "first", null);
        setField(term13620, term13620.getClass(), "last", null);
        setField(term13620, term13620.getClass(), "propListHead", null);
        setIntField(term13620, term13620.getClass(), "sourcePosition", 0);
        setField(term13620, term13620.getClass(), "jsType", null);
        setField(term13620, term13620.getClass(), "parent", null);
        setField(term13614, term13614.getClass(), "first", term13620);
        setIntField(term13621, term13621.getClass(), "type", 0);
        setField(term13621, term13621.getClass(), "next", null);
        setField(term13621, term13621.getClass(), "first", null);
        setField(term13621, term13621.getClass(), "last", null);
        setField(term13621, term13621.getClass(), "propListHead", null);
        setIntField(term13621, term13621.getClass(), "sourcePosition", 0);
        setField(term13621, term13621.getClass(), "jsType", null);
        setField(term13621, term13621.getClass(), "parent", null);
        setField(term13614, term13614.getClass(), "last", term13621);
        setField(term13622, term13622.getClass(), "next", null);
        setIntField(term13622, term13622.getClass(), "type", 0);
        setIntField(term13622, term13622.getClass(), "intValue", 0);
        setField(term13622, term13622.getClass(), "objectValue", null);
        setField(term13614, term13614.getClass(), "propListHead", term13622);
        setIntField(term13614, term13614.getClass(), "sourcePosition", 654195547);
        setField(term13614, term13614.getClass(), "jsType", null);
        setField(term13614, term13614.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1892;
        Object retValue = callMethod(klass, "isSwitchCase", argTypes, null, args);
        assertTrue(recursiveEquals(term1892, term13614));
        assertTrue(recursiveEquals(retValue, false));
    }

};


