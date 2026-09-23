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

public class NodeUtil_isPrototypeProperty_1449633110213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2833;
     Object term15533;

    public NodeUtil_isPrototypeProperty_1449633110213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2856 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2833, term2833.getClass(), "type", 1594426218);
        setIntField(term2835, term2835.getClass(), "type", -189738995);
        setIntField(term2837, term2837.getClass(), "type", 0);
        setField(term2837, term2837.getClass(), "next", null);
        setField(term2837, term2837.getClass(), "first", null);
        setField(term2837, term2837.getClass(), "last", null);
        setField(term2837, term2837.getClass(), "propListHead", null);
        setIntField(term2837, term2837.getClass(), "sourcePosition", 0);
        setField(term2837, term2837.getClass(), "jsType", null);
        setField(term2837, term2837.getClass(), "parent", null);
        setField(term2835, term2835.getClass(), "next", term2837);
        setIntField(term2840, term2840.getClass(), "type", 0);
        setField(term2840, term2840.getClass(), "next", null);
        setField(term2840, term2840.getClass(), "first", null);
        setField(term2840, term2840.getClass(), "last", null);
        setField(term2840, term2840.getClass(), "propListHead", null);
        setIntField(term2840, term2840.getClass(), "sourcePosition", 0);
        setField(term2840, term2840.getClass(), "jsType", null);
        setField(term2840, term2840.getClass(), "parent", null);
        setField(term2835, term2835.getClass(), "first", term2840);
        setIntField(term2843, term2843.getClass(), "type", 0);
        setField(term2843, term2843.getClass(), "next", null);
        setField(term2843, term2843.getClass(), "first", null);
        setField(term2843, term2843.getClass(), "last", null);
        setField(term2843, term2843.getClass(), "propListHead", null);
        setIntField(term2843, term2843.getClass(), "sourcePosition", 0);
        setField(term2843, term2843.getClass(), "jsType", null);
        setField(term2843, term2843.getClass(), "parent", null);
        setField(term2835, term2835.getClass(), "last", term2843);
        setField(term2846, term2846.getClass(), "next", null);
        setIntField(term2846, term2846.getClass(), "type", 0);
        setIntField(term2846, term2846.getClass(), "intValue", 0);
        setField(term2846, term2846.getClass(), "objectValue", null);
        setField(term2835, term2835.getClass(), "propListHead", term2846);
        setIntField(term2835, term2835.getClass(), "sourcePosition", 279675992);
        setField(term2835, term2835.getClass(), "jsType", null);
        setField(term2835, term2835.getClass(), "parent", null);
        setField(term2833, term2833.getClass(), "next", term2835);
        setIntField(term2850, term2850.getClass(), "type", 0);
        setField(term2850, term2850.getClass(), "next", null);
        setField(term2850, term2850.getClass(), "first", null);
        setField(term2850, term2850.getClass(), "last", null);
        setField(term2850, term2850.getClass(), "propListHead", null);
        setIntField(term2850, term2850.getClass(), "sourcePosition", 0);
        setField(term2850, term2850.getClass(), "jsType", null);
        setField(term2850, term2850.getClass(), "parent", null);
        setField(term2833, term2833.getClass(), "first", term2850);
        setIntField(term2853, term2853.getClass(), "type", 0);
        setField(term2853, term2853.getClass(), "next", null);
        setField(term2853, term2853.getClass(), "first", null);
        setField(term2853, term2853.getClass(), "last", null);
        setField(term2853, term2853.getClass(), "propListHead", null);
        setIntField(term2853, term2853.getClass(), "sourcePosition", 0);
        setField(term2853, term2853.getClass(), "jsType", null);
        setField(term2853, term2853.getClass(), "parent", null);
        setField(term2833, term2833.getClass(), "last", term2853);
        setField(term2856, term2856.getClass(), "next", null);
        setIntField(term2856, term2856.getClass(), "type", 0);
        setIntField(term2856, term2856.getClass(), "intValue", 0);
        setField(term2856, term2856.getClass(), "objectValue", null);
        setField(term2833, term2833.getClass(), "propListHead", term2856);
        setIntField(term2833, term2833.getClass(), "sourcePosition", -1626074989);
        setField(term2833, term2833.getClass(), "jsType", null);
        setField(term2833, term2833.getClass(), "parent", null);
        term15533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15538 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15541 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15533, term15533.getClass(), "type", 1594426218);
        setIntField(term15534, term15534.getClass(), "type", -189738995);
        setIntField(term15535, term15535.getClass(), "type", 0);
        setField(term15535, term15535.getClass(), "next", null);
        setField(term15535, term15535.getClass(), "first", null);
        setField(term15535, term15535.getClass(), "last", null);
        setField(term15535, term15535.getClass(), "propListHead", null);
        setIntField(term15535, term15535.getClass(), "sourcePosition", 0);
        setField(term15535, term15535.getClass(), "jsType", null);
        setField(term15535, term15535.getClass(), "parent", null);
        setField(term15534, term15534.getClass(), "next", term15535);
        setIntField(term15536, term15536.getClass(), "type", 0);
        setField(term15536, term15536.getClass(), "next", null);
        setField(term15536, term15536.getClass(), "first", null);
        setField(term15536, term15536.getClass(), "last", null);
        setField(term15536, term15536.getClass(), "propListHead", null);
        setIntField(term15536, term15536.getClass(), "sourcePosition", 0);
        setField(term15536, term15536.getClass(), "jsType", null);
        setField(term15536, term15536.getClass(), "parent", null);
        setField(term15534, term15534.getClass(), "first", term15536);
        setIntField(term15537, term15537.getClass(), "type", 0);
        setField(term15537, term15537.getClass(), "next", null);
        setField(term15537, term15537.getClass(), "first", null);
        setField(term15537, term15537.getClass(), "last", null);
        setField(term15537, term15537.getClass(), "propListHead", null);
        setIntField(term15537, term15537.getClass(), "sourcePosition", 0);
        setField(term15537, term15537.getClass(), "jsType", null);
        setField(term15537, term15537.getClass(), "parent", null);
        setField(term15534, term15534.getClass(), "last", term15537);
        setField(term15538, term15538.getClass(), "next", null);
        setIntField(term15538, term15538.getClass(), "type", 0);
        setIntField(term15538, term15538.getClass(), "intValue", 0);
        setField(term15538, term15538.getClass(), "objectValue", null);
        setField(term15534, term15534.getClass(), "propListHead", term15538);
        setIntField(term15534, term15534.getClass(), "sourcePosition", 279675992);
        setField(term15534, term15534.getClass(), "jsType", null);
        setField(term15534, term15534.getClass(), "parent", null);
        setField(term15533, term15533.getClass(), "next", term15534);
        setIntField(term15539, term15539.getClass(), "type", 0);
        setField(term15539, term15539.getClass(), "next", null);
        setField(term15539, term15539.getClass(), "first", null);
        setField(term15539, term15539.getClass(), "last", null);
        setField(term15539, term15539.getClass(), "propListHead", null);
        setIntField(term15539, term15539.getClass(), "sourcePosition", 0);
        setField(term15539, term15539.getClass(), "jsType", null);
        setField(term15539, term15539.getClass(), "parent", null);
        setField(term15533, term15533.getClass(), "first", term15539);
        setIntField(term15540, term15540.getClass(), "type", 0);
        setField(term15540, term15540.getClass(), "next", null);
        setField(term15540, term15540.getClass(), "first", null);
        setField(term15540, term15540.getClass(), "last", null);
        setField(term15540, term15540.getClass(), "propListHead", null);
        setIntField(term15540, term15540.getClass(), "sourcePosition", 0);
        setField(term15540, term15540.getClass(), "jsType", null);
        setField(term15540, term15540.getClass(), "parent", null);
        setField(term15533, term15533.getClass(), "last", term15540);
        setField(term15541, term15541.getClass(), "next", null);
        setIntField(term15541, term15541.getClass(), "type", 0);
        setIntField(term15541, term15541.getClass(), "intValue", 0);
        setField(term15541, term15541.getClass(), "objectValue", null);
        setField(term15533, term15533.getClass(), "propListHead", term15541);
        setIntField(term15533, term15533.getClass(), "sourcePosition", -1626074989);
        setField(term15533, term15533.getClass(), "jsType", null);
        setField(term15533, term15533.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2833;
        Object retValue = callMethod(klass, "isPrototypeProperty", argTypes, null, args);
        assertTrue(recursiveEquals(term2833, term15533));
        assertTrue(recursiveEquals(retValue, false));
    }

};


