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

public class NodeUtil_newFunctionNode_182113995178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2100;
     Object term2131;
     Object term2158;
     Object term2160;

    public NodeUtil_newFunctionNode_182113995178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2116 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2126 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2103, term2103.getClass(), "type", -537786484);
        setIntField(term2105, term2105.getClass(), "type", -1421649118);
        setIntField(term2107, term2107.getClass(), "type", 0);
        setField(term2107, term2107.getClass(), "next", null);
        setField(term2107, term2107.getClass(), "first", null);
        setField(term2107, term2107.getClass(), "last", null);
        setField(term2107, term2107.getClass(), "propListHead", null);
        setIntField(term2107, term2107.getClass(), "sourcePosition", 0);
        setField(term2107, term2107.getClass(), "jsType", null);
        setField(term2107, term2107.getClass(), "parent", null);
        setField(term2105, term2105.getClass(), "next", term2107);
        setIntField(term2110, term2110.getClass(), "type", 0);
        setField(term2110, term2110.getClass(), "next", null);
        setField(term2110, term2110.getClass(), "first", null);
        setField(term2110, term2110.getClass(), "last", null);
        setField(term2110, term2110.getClass(), "propListHead", null);
        setIntField(term2110, term2110.getClass(), "sourcePosition", 0);
        setField(term2110, term2110.getClass(), "jsType", null);
        setField(term2110, term2110.getClass(), "parent", null);
        setField(term2105, term2105.getClass(), "first", term2110);
        setIntField(term2113, term2113.getClass(), "type", 0);
        setField(term2113, term2113.getClass(), "next", null);
        setField(term2113, term2113.getClass(), "first", null);
        setField(term2113, term2113.getClass(), "last", null);
        setField(term2113, term2113.getClass(), "propListHead", null);
        setIntField(term2113, term2113.getClass(), "sourcePosition", 0);
        setField(term2113, term2113.getClass(), "jsType", null);
        setField(term2113, term2113.getClass(), "parent", null);
        setField(term2105, term2105.getClass(), "last", term2113);
        setField(term2116, term2116.getClass(), "next", null);
        setIntField(term2116, term2116.getClass(), "type", 0);
        setIntField(term2116, term2116.getClass(), "intValue", 0);
        setField(term2116, term2116.getClass(), "objectValue", null);
        setField(term2105, term2105.getClass(), "propListHead", term2116);
        setIntField(term2105, term2105.getClass(), "sourcePosition", 1430066560);
        setField(term2105, term2105.getClass(), "jsType", null);
        setField(term2105, term2105.getClass(), "parent", null);
        setField(term2103, term2103.getClass(), "next", term2105);
        setIntField(term2120, term2120.getClass(), "type", 0);
        setField(term2120, term2120.getClass(), "next", null);
        setField(term2120, term2120.getClass(), "first", null);
        setField(term2120, term2120.getClass(), "last", null);
        setField(term2120, term2120.getClass(), "propListHead", null);
        setIntField(term2120, term2120.getClass(), "sourcePosition", 0);
        setField(term2120, term2120.getClass(), "jsType", null);
        setField(term2120, term2120.getClass(), "parent", null);
        setField(term2103, term2103.getClass(), "first", term2120);
        setIntField(term2123, term2123.getClass(), "type", 0);
        setField(term2123, term2123.getClass(), "next", null);
        setField(term2123, term2123.getClass(), "first", null);
        setField(term2123, term2123.getClass(), "last", null);
        setField(term2123, term2123.getClass(), "propListHead", null);
        setIntField(term2123, term2123.getClass(), "sourcePosition", 0);
        setField(term2123, term2123.getClass(), "jsType", null);
        setField(term2123, term2123.getClass(), "parent", null);
        setField(term2103, term2103.getClass(), "last", term2123);
        setField(term2126, term2126.getClass(), "next", null);
        setIntField(term2126, term2126.getClass(), "type", 0);
        setIntField(term2126, term2126.getClass(), "intValue", 0);
        setField(term2126, term2126.getClass(), "objectValue", null);
        setField(term2103, term2103.getClass(), "propListHead", term2126);
        setIntField(term2103, term2103.getClass(), "sourcePosition", 836734074);
        setField(term2103, term2103.getClass(), "jsType", null);
        setField(term2103, term2103.getClass(), "parent", null);
        term2100 = new LinkedList();
        ((LinkedList) term2100).add(term2103);
        term2131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2144 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2154 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2131, term2131.getClass(), "type", 950385621);
        setIntField(term2133, term2133.getClass(), "type", -1602072035);
        setIntField(term2135, term2135.getClass(), "type", 0);
        setField(term2135, term2135.getClass(), "next", null);
        setField(term2135, term2135.getClass(), "first", null);
        setField(term2135, term2135.getClass(), "last", null);
        setField(term2135, term2135.getClass(), "propListHead", null);
        setIntField(term2135, term2135.getClass(), "sourcePosition", 0);
        setField(term2135, term2135.getClass(), "jsType", null);
        setField(term2135, term2135.getClass(), "parent", null);
        setField(term2133, term2133.getClass(), "next", term2135);
        setIntField(term2138, term2138.getClass(), "type", 0);
        setField(term2138, term2138.getClass(), "next", null);
        setField(term2138, term2138.getClass(), "first", null);
        setField(term2138, term2138.getClass(), "last", null);
        setField(term2138, term2138.getClass(), "propListHead", null);
        setIntField(term2138, term2138.getClass(), "sourcePosition", 0);
        setField(term2138, term2138.getClass(), "jsType", null);
        setField(term2138, term2138.getClass(), "parent", null);
        setField(term2133, term2133.getClass(), "first", term2138);
        setIntField(term2141, term2141.getClass(), "type", 0);
        setField(term2141, term2141.getClass(), "next", null);
        setField(term2141, term2141.getClass(), "first", null);
        setField(term2141, term2141.getClass(), "last", null);
        setField(term2141, term2141.getClass(), "propListHead", null);
        setIntField(term2141, term2141.getClass(), "sourcePosition", 0);
        setField(term2141, term2141.getClass(), "jsType", null);
        setField(term2141, term2141.getClass(), "parent", null);
        setField(term2133, term2133.getClass(), "last", term2141);
        setField(term2144, term2144.getClass(), "next", null);
        setIntField(term2144, term2144.getClass(), "type", 0);
        setIntField(term2144, term2144.getClass(), "intValue", 0);
        setField(term2144, term2144.getClass(), "objectValue", null);
        setField(term2133, term2133.getClass(), "propListHead", term2144);
        setIntField(term2133, term2133.getClass(), "sourcePosition", 434914590);
        setField(term2133, term2133.getClass(), "jsType", null);
        setField(term2133, term2133.getClass(), "parent", null);
        setField(term2131, term2131.getClass(), "next", term2133);
        setIntField(term2148, term2148.getClass(), "type", 0);
        setField(term2148, term2148.getClass(), "next", null);
        setField(term2148, term2148.getClass(), "first", null);
        setField(term2148, term2148.getClass(), "last", null);
        setField(term2148, term2148.getClass(), "propListHead", null);
        setIntField(term2148, term2148.getClass(), "sourcePosition", 0);
        setField(term2148, term2148.getClass(), "jsType", null);
        setField(term2148, term2148.getClass(), "parent", null);
        setField(term2131, term2131.getClass(), "first", term2148);
        setIntField(term2151, term2151.getClass(), "type", 0);
        setField(term2151, term2151.getClass(), "next", null);
        setField(term2151, term2151.getClass(), "first", null);
        setField(term2151, term2151.getClass(), "last", null);
        setField(term2151, term2151.getClass(), "propListHead", null);
        setIntField(term2151, term2151.getClass(), "sourcePosition", 0);
        setField(term2151, term2151.getClass(), "jsType", null);
        setField(term2151, term2151.getClass(), "parent", null);
        setField(term2131, term2131.getClass(), "last", term2151);
        setField(term2154, term2154.getClass(), "next", null);
        setIntField(term2154, term2154.getClass(), "type", 0);
        setIntField(term2154, term2154.getClass(), "intValue", 0);
        setField(term2154, term2154.getClass(), "objectValue", null);
        setField(term2131, term2131.getClass(), "propListHead", term2154);
        setIntField(term2131, term2131.getClass(), "sourcePosition", 1983756621);
        setField(term2131, term2131.getClass(), "jsType", null);
        setField(term2131, term2131.getClass(), "parent", null);
        term2158 = new Integer(-2134711835);
        term2160 = new Integer(-1641244494);
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
        args[1] = term2100;
        args[2] = term2131;
        args[3] = term2158;
        args[4] = term2160;
        try {
            callMethod(klass, "newFunctionNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


