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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_newFunctionNode_182113995180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2127;
     Object term2158;
     Object term2185;
     Object term2187;

    public NodeUtil_newFunctionNode_182113995180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2143 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2153 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2130, term2130.getClass(), "type", 950385621);
        setIntField(term2132, term2132.getClass(), "type", -1602072035);
        setIntField(term2134, term2134.getClass(), "type", 0);
        setField(term2134, term2134.getClass(), "next", null);
        setField(term2134, term2134.getClass(), "first", null);
        setField(term2134, term2134.getClass(), "last", null);
        setField(term2134, term2134.getClass(), "propListHead", null);
        setIntField(term2134, term2134.getClass(), "sourcePosition", 0);
        setField(term2134, term2134.getClass(), "jsType", null);
        setField(term2134, term2134.getClass(), "parent", null);
        setField(term2132, term2132.getClass(), "next", term2134);
        setIntField(term2137, term2137.getClass(), "type", 0);
        setField(term2137, term2137.getClass(), "next", null);
        setField(term2137, term2137.getClass(), "first", null);
        setField(term2137, term2137.getClass(), "last", null);
        setField(term2137, term2137.getClass(), "propListHead", null);
        setIntField(term2137, term2137.getClass(), "sourcePosition", 0);
        setField(term2137, term2137.getClass(), "jsType", null);
        setField(term2137, term2137.getClass(), "parent", null);
        setField(term2132, term2132.getClass(), "first", term2137);
        setIntField(term2140, term2140.getClass(), "type", 0);
        setField(term2140, term2140.getClass(), "next", null);
        setField(term2140, term2140.getClass(), "first", null);
        setField(term2140, term2140.getClass(), "last", null);
        setField(term2140, term2140.getClass(), "propListHead", null);
        setIntField(term2140, term2140.getClass(), "sourcePosition", 0);
        setField(term2140, term2140.getClass(), "jsType", null);
        setField(term2140, term2140.getClass(), "parent", null);
        setField(term2132, term2132.getClass(), "last", term2140);
        setField(term2143, term2143.getClass(), "next", null);
        setIntField(term2143, term2143.getClass(), "type", 0);
        setIntField(term2143, term2143.getClass(), "intValue", 0);
        setField(term2143, term2143.getClass(), "objectValue", null);
        setField(term2132, term2132.getClass(), "propListHead", term2143);
        setIntField(term2132, term2132.getClass(), "sourcePosition", 434914590);
        setField(term2132, term2132.getClass(), "jsType", null);
        setField(term2132, term2132.getClass(), "parent", null);
        setField(term2130, term2130.getClass(), "next", term2132);
        setIntField(term2147, term2147.getClass(), "type", 0);
        setField(term2147, term2147.getClass(), "next", null);
        setField(term2147, term2147.getClass(), "first", null);
        setField(term2147, term2147.getClass(), "last", null);
        setField(term2147, term2147.getClass(), "propListHead", null);
        setIntField(term2147, term2147.getClass(), "sourcePosition", 0);
        setField(term2147, term2147.getClass(), "jsType", null);
        setField(term2147, term2147.getClass(), "parent", null);
        setField(term2130, term2130.getClass(), "first", term2147);
        setIntField(term2150, term2150.getClass(), "type", 0);
        setField(term2150, term2150.getClass(), "next", null);
        setField(term2150, term2150.getClass(), "first", null);
        setField(term2150, term2150.getClass(), "last", null);
        setField(term2150, term2150.getClass(), "propListHead", null);
        setIntField(term2150, term2150.getClass(), "sourcePosition", 0);
        setField(term2150, term2150.getClass(), "jsType", null);
        setField(term2150, term2150.getClass(), "parent", null);
        setField(term2130, term2130.getClass(), "last", term2150);
        setField(term2153, term2153.getClass(), "next", null);
        setIntField(term2153, term2153.getClass(), "type", 0);
        setIntField(term2153, term2153.getClass(), "intValue", 0);
        setField(term2153, term2153.getClass(), "objectValue", null);
        setField(term2130, term2130.getClass(), "propListHead", term2153);
        setIntField(term2130, term2130.getClass(), "sourcePosition", 1983756621);
        setField(term2130, term2130.getClass(), "jsType", null);
        setField(term2130, term2130.getClass(), "parent", null);
        term2127 = new LinkedList();
        ((LinkedList) term2127).add(term2130);
        term2158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2171 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2181 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2158, term2158.getClass(), "type", -489441521);
        setIntField(term2160, term2160.getClass(), "type", 1544768934);
        setIntField(term2162, term2162.getClass(), "type", 0);
        setField(term2162, term2162.getClass(), "next", null);
        setField(term2162, term2162.getClass(), "first", null);
        setField(term2162, term2162.getClass(), "last", null);
        setField(term2162, term2162.getClass(), "propListHead", null);
        setIntField(term2162, term2162.getClass(), "sourcePosition", 0);
        setField(term2162, term2162.getClass(), "jsType", null);
        setField(term2162, term2162.getClass(), "parent", null);
        setField(term2160, term2160.getClass(), "next", term2162);
        setIntField(term2165, term2165.getClass(), "type", 0);
        setField(term2165, term2165.getClass(), "next", null);
        setField(term2165, term2165.getClass(), "first", null);
        setField(term2165, term2165.getClass(), "last", null);
        setField(term2165, term2165.getClass(), "propListHead", null);
        setIntField(term2165, term2165.getClass(), "sourcePosition", 0);
        setField(term2165, term2165.getClass(), "jsType", null);
        setField(term2165, term2165.getClass(), "parent", null);
        setField(term2160, term2160.getClass(), "first", term2165);
        setIntField(term2168, term2168.getClass(), "type", 0);
        setField(term2168, term2168.getClass(), "next", null);
        setField(term2168, term2168.getClass(), "first", null);
        setField(term2168, term2168.getClass(), "last", null);
        setField(term2168, term2168.getClass(), "propListHead", null);
        setIntField(term2168, term2168.getClass(), "sourcePosition", 0);
        setField(term2168, term2168.getClass(), "jsType", null);
        setField(term2168, term2168.getClass(), "parent", null);
        setField(term2160, term2160.getClass(), "last", term2168);
        setField(term2171, term2171.getClass(), "next", null);
        setIntField(term2171, term2171.getClass(), "type", 0);
        setIntField(term2171, term2171.getClass(), "intValue", 0);
        setField(term2171, term2171.getClass(), "objectValue", null);
        setField(term2160, term2160.getClass(), "propListHead", term2171);
        setIntField(term2160, term2160.getClass(), "sourcePosition", 958132675);
        setField(term2160, term2160.getClass(), "jsType", null);
        setField(term2160, term2160.getClass(), "parent", null);
        setField(term2158, term2158.getClass(), "next", term2160);
        setIntField(term2175, term2175.getClass(), "type", 0);
        setField(term2175, term2175.getClass(), "next", null);
        setField(term2175, term2175.getClass(), "first", null);
        setField(term2175, term2175.getClass(), "last", null);
        setField(term2175, term2175.getClass(), "propListHead", null);
        setIntField(term2175, term2175.getClass(), "sourcePosition", 0);
        setField(term2175, term2175.getClass(), "jsType", null);
        setField(term2175, term2175.getClass(), "parent", null);
        setField(term2158, term2158.getClass(), "first", term2175);
        setIntField(term2178, term2178.getClass(), "type", 0);
        setField(term2178, term2178.getClass(), "next", null);
        setField(term2178, term2178.getClass(), "first", null);
        setField(term2178, term2178.getClass(), "last", null);
        setField(term2178, term2178.getClass(), "propListHead", null);
        setIntField(term2178, term2178.getClass(), "sourcePosition", 0);
        setField(term2178, term2178.getClass(), "jsType", null);
        setField(term2178, term2178.getClass(), "parent", null);
        setField(term2158, term2158.getClass(), "last", term2178);
        setField(term2181, term2181.getClass(), "next", null);
        setIntField(term2181, term2181.getClass(), "type", 0);
        setIntField(term2181, term2181.getClass(), "intValue", 0);
        setField(term2181, term2181.getClass(), "objectValue", null);
        setField(term2158, term2158.getClass(), "propListHead", term2181);
        setIntField(term2158, term2158.getClass(), "sourcePosition", -689879283);
        setField(term2158, term2158.getClass(), "jsType", null);
        setField(term2158, term2158.getClass(), "parent", null);
        term2185 = new Integer(1985432430);
        term2187 = new Integer(-1769933499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = "MxlszYVzRf";
        args[1] = term2127;
        args[2] = term2158;
        args[3] = term2185;
        args[4] = term2187;
        try {
            callMethod(klass, "newFunctionNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


