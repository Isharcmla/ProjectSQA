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

public class NodeUtil_removeChild_1104348502230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2054;
     Object term2081;

    public NodeUtil_removeChild_1104348502230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2067 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2077 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2054, term2054.getClass(), "type", 1795369860);
        setIntField(term2056, term2056.getClass(), "type", 953741504);
        setIntField(term2058, term2058.getClass(), "type", 0);
        setField(term2058, term2058.getClass(), "next", null);
        setField(term2058, term2058.getClass(), "first", null);
        setField(term2058, term2058.getClass(), "last", null);
        setField(term2058, term2058.getClass(), "propListHead", null);
        setIntField(term2058, term2058.getClass(), "sourcePosition", 0);
        setField(term2058, term2058.getClass(), "jsType", null);
        setField(term2058, term2058.getClass(), "parent", null);
        setField(term2056, term2056.getClass(), "next", term2058);
        setIntField(term2061, term2061.getClass(), "type", 0);
        setField(term2061, term2061.getClass(), "next", null);
        setField(term2061, term2061.getClass(), "first", null);
        setField(term2061, term2061.getClass(), "last", null);
        setField(term2061, term2061.getClass(), "propListHead", null);
        setIntField(term2061, term2061.getClass(), "sourcePosition", 0);
        setField(term2061, term2061.getClass(), "jsType", null);
        setField(term2061, term2061.getClass(), "parent", null);
        setField(term2056, term2056.getClass(), "first", term2061);
        setIntField(term2064, term2064.getClass(), "type", 0);
        setField(term2064, term2064.getClass(), "next", null);
        setField(term2064, term2064.getClass(), "first", null);
        setField(term2064, term2064.getClass(), "last", null);
        setField(term2064, term2064.getClass(), "propListHead", null);
        setIntField(term2064, term2064.getClass(), "sourcePosition", 0);
        setField(term2064, term2064.getClass(), "jsType", null);
        setField(term2064, term2064.getClass(), "parent", null);
        setField(term2056, term2056.getClass(), "last", term2064);
        setField(term2067, term2067.getClass(), "next", null);
        setIntField(term2067, term2067.getClass(), "type", 0);
        setIntField(term2067, term2067.getClass(), "intValue", 0);
        setField(term2067, term2067.getClass(), "objectValue", null);
        setField(term2056, term2056.getClass(), "propListHead", term2067);
        setIntField(term2056, term2056.getClass(), "sourcePosition", 1779370220);
        setField(term2056, term2056.getClass(), "jsType", null);
        setField(term2056, term2056.getClass(), "parent", null);
        setField(term2054, term2054.getClass(), "next", term2056);
        setIntField(term2071, term2071.getClass(), "type", 0);
        setField(term2071, term2071.getClass(), "next", null);
        setField(term2071, term2071.getClass(), "first", null);
        setField(term2071, term2071.getClass(), "last", null);
        setField(term2071, term2071.getClass(), "propListHead", null);
        setIntField(term2071, term2071.getClass(), "sourcePosition", 0);
        setField(term2071, term2071.getClass(), "jsType", null);
        setField(term2071, term2071.getClass(), "parent", null);
        setField(term2054, term2054.getClass(), "first", term2071);
        setIntField(term2074, term2074.getClass(), "type", 0);
        setField(term2074, term2074.getClass(), "next", null);
        setField(term2074, term2074.getClass(), "first", null);
        setField(term2074, term2074.getClass(), "last", null);
        setField(term2074, term2074.getClass(), "propListHead", null);
        setIntField(term2074, term2074.getClass(), "sourcePosition", 0);
        setField(term2074, term2074.getClass(), "jsType", null);
        setField(term2074, term2074.getClass(), "parent", null);
        setField(term2054, term2054.getClass(), "last", term2074);
        setField(term2077, term2077.getClass(), "next", null);
        setIntField(term2077, term2077.getClass(), "type", 0);
        setIntField(term2077, term2077.getClass(), "intValue", 0);
        setField(term2077, term2077.getClass(), "objectValue", null);
        setField(term2054, term2054.getClass(), "propListHead", term2077);
        setIntField(term2054, term2054.getClass(), "sourcePosition", -1716046610);
        setField(term2054, term2054.getClass(), "jsType", null);
        setField(term2054, term2054.getClass(), "parent", null);
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
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2054;
        args[1] = term2081;
        try {
            callMethod(klass, "removeChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


