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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_removeChild_1104348502231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2081;
     Object term2108;

    public NodeUtil_removeChild_1104348502231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2094 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2104 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2081, term2081.getClass(), "type", 277855691);
        setIntField(term2083, term2083.getClass(), "type", -1422131197);
        setIntField(term2085, term2085.getClass(), "type", 0);
        setField(term2085, term2085.getClass(), "next", null);
        setField(term2085, term2085.getClass(), "first", null);
        setField(term2085, term2085.getClass(), "last", null);
        setField(term2085, term2085.getClass(), "propListHead", null);
        setIntField(term2085, term2085.getClass(), "sourcePosition", 0);
        setField(term2085, term2085.getClass(), "jsType", null);
        setField(term2085, term2085.getClass(), "parent", null);
        setField(term2083, term2083.getClass(), "next", term2085);
        setIntField(term2088, term2088.getClass(), "type", 0);
        setField(term2088, term2088.getClass(), "next", null);
        setField(term2088, term2088.getClass(), "first", null);
        setField(term2088, term2088.getClass(), "last", null);
        setField(term2088, term2088.getClass(), "propListHead", null);
        setIntField(term2088, term2088.getClass(), "sourcePosition", 0);
        setField(term2088, term2088.getClass(), "jsType", null);
        setField(term2088, term2088.getClass(), "parent", null);
        setField(term2083, term2083.getClass(), "first", term2088);
        setIntField(term2091, term2091.getClass(), "type", 0);
        setField(term2091, term2091.getClass(), "next", null);
        setField(term2091, term2091.getClass(), "first", null);
        setField(term2091, term2091.getClass(), "last", null);
        setField(term2091, term2091.getClass(), "propListHead", null);
        setIntField(term2091, term2091.getClass(), "sourcePosition", 0);
        setField(term2091, term2091.getClass(), "jsType", null);
        setField(term2091, term2091.getClass(), "parent", null);
        setField(term2083, term2083.getClass(), "last", term2091);
        setField(term2094, term2094.getClass(), "next", null);
        setIntField(term2094, term2094.getClass(), "type", 0);
        setIntField(term2094, term2094.getClass(), "intValue", 0);
        setField(term2094, term2094.getClass(), "objectValue", null);
        setField(term2083, term2083.getClass(), "propListHead", term2094);
        setIntField(term2083, term2083.getClass(), "sourcePosition", -1742790308);
        setField(term2083, term2083.getClass(), "jsType", null);
        setField(term2083, term2083.getClass(), "parent", null);
        setField(term2081, term2081.getClass(), "next", term2083);
        setIntField(term2098, term2098.getClass(), "type", 0);
        setField(term2098, term2098.getClass(), "next", null);
        setField(term2098, term2098.getClass(), "first", null);
        setField(term2098, term2098.getClass(), "last", null);
        setField(term2098, term2098.getClass(), "propListHead", null);
        setIntField(term2098, term2098.getClass(), "sourcePosition", 0);
        setField(term2098, term2098.getClass(), "jsType", null);
        setField(term2098, term2098.getClass(), "parent", null);
        setField(term2081, term2081.getClass(), "first", term2098);
        setIntField(term2101, term2101.getClass(), "type", 0);
        setField(term2101, term2101.getClass(), "next", null);
        setField(term2101, term2101.getClass(), "first", null);
        setField(term2101, term2101.getClass(), "last", null);
        setField(term2101, term2101.getClass(), "propListHead", null);
        setIntField(term2101, term2101.getClass(), "sourcePosition", 0);
        setField(term2101, term2101.getClass(), "jsType", null);
        setField(term2101, term2101.getClass(), "parent", null);
        setField(term2081, term2081.getClass(), "last", term2101);
        setField(term2104, term2104.getClass(), "next", null);
        setIntField(term2104, term2104.getClass(), "type", 0);
        setIntField(term2104, term2104.getClass(), "intValue", 0);
        setField(term2104, term2104.getClass(), "objectValue", null);
        setField(term2081, term2081.getClass(), "propListHead", term2104);
        setIntField(term2081, term2081.getClass(), "sourcePosition", -1592093430);
        setField(term2081, term2081.getClass(), "jsType", null);
        setField(term2081, term2081.getClass(), "parent", null);
        term2108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2121 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2131 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2108, term2108.getClass(), "type", 380484139);
        setIntField(term2110, term2110.getClass(), "type", 263859424);
        setIntField(term2112, term2112.getClass(), "type", 0);
        setField(term2112, term2112.getClass(), "next", null);
        setField(term2112, term2112.getClass(), "first", null);
        setField(term2112, term2112.getClass(), "last", null);
        setField(term2112, term2112.getClass(), "propListHead", null);
        setIntField(term2112, term2112.getClass(), "sourcePosition", 0);
        setField(term2112, term2112.getClass(), "jsType", null);
        setField(term2112, term2112.getClass(), "parent", null);
        setField(term2110, term2110.getClass(), "next", term2112);
        setIntField(term2115, term2115.getClass(), "type", 0);
        setField(term2115, term2115.getClass(), "next", null);
        setField(term2115, term2115.getClass(), "first", null);
        setField(term2115, term2115.getClass(), "last", null);
        setField(term2115, term2115.getClass(), "propListHead", null);
        setIntField(term2115, term2115.getClass(), "sourcePosition", 0);
        setField(term2115, term2115.getClass(), "jsType", null);
        setField(term2115, term2115.getClass(), "parent", null);
        setField(term2110, term2110.getClass(), "first", term2115);
        setIntField(term2118, term2118.getClass(), "type", 0);
        setField(term2118, term2118.getClass(), "next", null);
        setField(term2118, term2118.getClass(), "first", null);
        setField(term2118, term2118.getClass(), "last", null);
        setField(term2118, term2118.getClass(), "propListHead", null);
        setIntField(term2118, term2118.getClass(), "sourcePosition", 0);
        setField(term2118, term2118.getClass(), "jsType", null);
        setField(term2118, term2118.getClass(), "parent", null);
        setField(term2110, term2110.getClass(), "last", term2118);
        setField(term2121, term2121.getClass(), "next", null);
        setIntField(term2121, term2121.getClass(), "type", 0);
        setIntField(term2121, term2121.getClass(), "intValue", 0);
        setField(term2121, term2121.getClass(), "objectValue", null);
        setField(term2110, term2110.getClass(), "propListHead", term2121);
        setIntField(term2110, term2110.getClass(), "sourcePosition", -1421649118);
        setField(term2110, term2110.getClass(), "jsType", null);
        setField(term2110, term2110.getClass(), "parent", null);
        setField(term2108, term2108.getClass(), "next", term2110);
        setIntField(term2125, term2125.getClass(), "type", 0);
        setField(term2125, term2125.getClass(), "next", null);
        setField(term2125, term2125.getClass(), "first", null);
        setField(term2125, term2125.getClass(), "last", null);
        setField(term2125, term2125.getClass(), "propListHead", null);
        setIntField(term2125, term2125.getClass(), "sourcePosition", 0);
        setField(term2125, term2125.getClass(), "jsType", null);
        setField(term2125, term2125.getClass(), "parent", null);
        setField(term2108, term2108.getClass(), "first", term2125);
        setIntField(term2128, term2128.getClass(), "type", 0);
        setField(term2128, term2128.getClass(), "next", null);
        setField(term2128, term2128.getClass(), "first", null);
        setField(term2128, term2128.getClass(), "last", null);
        setField(term2128, term2128.getClass(), "propListHead", null);
        setIntField(term2128, term2128.getClass(), "sourcePosition", 0);
        setField(term2128, term2128.getClass(), "jsType", null);
        setField(term2128, term2128.getClass(), "parent", null);
        setField(term2108, term2108.getClass(), "last", term2128);
        setField(term2131, term2131.getClass(), "next", null);
        setIntField(term2131, term2131.getClass(), "type", 0);
        setIntField(term2131, term2131.getClass(), "intValue", 0);
        setField(term2131, term2131.getClass(), "objectValue", null);
        setField(term2108, term2108.getClass(), "propListHead", term2131);
        setIntField(term2108, term2108.getClass(), "sourcePosition", -511248284);
        setField(term2108, term2108.getClass(), "jsType", null);
        setField(term2108, term2108.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2081;
        args[1] = term2108;
        try {
            callMethod(klass, "removeChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


