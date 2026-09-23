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
import java.lang.Integer;

public class NodeUtil_containsType_1974866574198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2194;
     Object term2221;
     Object term13256;

    public NodeUtil_containsType_1974866574198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2207 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2217 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2194, term2194.getClass(), "type", -1735276919);
        setIntField(term2196, term2196.getClass(), "type", 1798354517);
        setIntField(term2198, term2198.getClass(), "type", 0);
        setField(term2198, term2198.getClass(), "next", null);
        setField(term2198, term2198.getClass(), "first", null);
        setField(term2198, term2198.getClass(), "last", null);
        setField(term2198, term2198.getClass(), "propListHead", null);
        setIntField(term2198, term2198.getClass(), "sourcePosition", 0);
        setField(term2198, term2198.getClass(), "jsType", null);
        setField(term2198, term2198.getClass(), "parent", null);
        setField(term2196, term2196.getClass(), "next", term2198);
        setIntField(term2201, term2201.getClass(), "type", 0);
        setField(term2201, term2201.getClass(), "next", null);
        setField(term2201, term2201.getClass(), "first", null);
        setField(term2201, term2201.getClass(), "last", null);
        setField(term2201, term2201.getClass(), "propListHead", null);
        setIntField(term2201, term2201.getClass(), "sourcePosition", 0);
        setField(term2201, term2201.getClass(), "jsType", null);
        setField(term2201, term2201.getClass(), "parent", null);
        setField(term2196, term2196.getClass(), "first", term2201);
        setIntField(term2204, term2204.getClass(), "type", 0);
        setField(term2204, term2204.getClass(), "next", null);
        setField(term2204, term2204.getClass(), "first", null);
        setField(term2204, term2204.getClass(), "last", null);
        setField(term2204, term2204.getClass(), "propListHead", null);
        setIntField(term2204, term2204.getClass(), "sourcePosition", 0);
        setField(term2204, term2204.getClass(), "jsType", null);
        setField(term2204, term2204.getClass(), "parent", null);
        setField(term2196, term2196.getClass(), "last", term2204);
        setField(term2207, term2207.getClass(), "next", null);
        setIntField(term2207, term2207.getClass(), "type", 0);
        setIntField(term2207, term2207.getClass(), "intValue", 0);
        setField(term2207, term2207.getClass(), "objectValue", null);
        setField(term2196, term2196.getClass(), "propListHead", term2207);
        setIntField(term2196, term2196.getClass(), "sourcePosition", -1085899912);
        setField(term2196, term2196.getClass(), "jsType", null);
        setField(term2196, term2196.getClass(), "parent", null);
        setField(term2194, term2194.getClass(), "next", term2196);
        setIntField(term2211, term2211.getClass(), "type", 0);
        setField(term2211, term2211.getClass(), "next", null);
        setField(term2211, term2211.getClass(), "first", null);
        setField(term2211, term2211.getClass(), "last", null);
        setField(term2211, term2211.getClass(), "propListHead", null);
        setIntField(term2211, term2211.getClass(), "sourcePosition", 0);
        setField(term2211, term2211.getClass(), "jsType", null);
        setField(term2211, term2211.getClass(), "parent", null);
        setField(term2194, term2194.getClass(), "first", term2211);
        setIntField(term2214, term2214.getClass(), "type", 0);
        setField(term2214, term2214.getClass(), "next", null);
        setField(term2214, term2214.getClass(), "first", null);
        setField(term2214, term2214.getClass(), "last", null);
        setField(term2214, term2214.getClass(), "propListHead", null);
        setIntField(term2214, term2214.getClass(), "sourcePosition", 0);
        setField(term2214, term2214.getClass(), "jsType", null);
        setField(term2214, term2214.getClass(), "parent", null);
        setField(term2194, term2194.getClass(), "last", term2214);
        setField(term2217, term2217.getClass(), "next", null);
        setIntField(term2217, term2217.getClass(), "type", 0);
        setIntField(term2217, term2217.getClass(), "intValue", 0);
        setField(term2217, term2217.getClass(), "objectValue", null);
        setField(term2194, term2194.getClass(), "propListHead", term2217);
        setIntField(term2194, term2194.getClass(), "sourcePosition", -1458980236);
        setField(term2194, term2194.getClass(), "jsType", null);
        setField(term2194, term2194.getClass(), "parent", null);
        term2221 = new Integer(890505372);
        term13256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13261 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13264 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13256, term13256.getClass(), "type", -1735276919);
        setIntField(term13257, term13257.getClass(), "type", 1798354517);
        setIntField(term13258, term13258.getClass(), "type", 0);
        setField(term13258, term13258.getClass(), "next", null);
        setField(term13258, term13258.getClass(), "first", null);
        setField(term13258, term13258.getClass(), "last", null);
        setField(term13258, term13258.getClass(), "propListHead", null);
        setIntField(term13258, term13258.getClass(), "sourcePosition", 0);
        setField(term13258, term13258.getClass(), "jsType", null);
        setField(term13258, term13258.getClass(), "parent", null);
        setField(term13257, term13257.getClass(), "next", term13258);
        setIntField(term13259, term13259.getClass(), "type", 0);
        setField(term13259, term13259.getClass(), "next", null);
        setField(term13259, term13259.getClass(), "first", null);
        setField(term13259, term13259.getClass(), "last", null);
        setField(term13259, term13259.getClass(), "propListHead", null);
        setIntField(term13259, term13259.getClass(), "sourcePosition", 0);
        setField(term13259, term13259.getClass(), "jsType", null);
        setField(term13259, term13259.getClass(), "parent", null);
        setField(term13257, term13257.getClass(), "first", term13259);
        setIntField(term13260, term13260.getClass(), "type", 0);
        setField(term13260, term13260.getClass(), "next", null);
        setField(term13260, term13260.getClass(), "first", null);
        setField(term13260, term13260.getClass(), "last", null);
        setField(term13260, term13260.getClass(), "propListHead", null);
        setIntField(term13260, term13260.getClass(), "sourcePosition", 0);
        setField(term13260, term13260.getClass(), "jsType", null);
        setField(term13260, term13260.getClass(), "parent", null);
        setField(term13257, term13257.getClass(), "last", term13260);
        setField(term13261, term13261.getClass(), "next", null);
        setIntField(term13261, term13261.getClass(), "type", 0);
        setIntField(term13261, term13261.getClass(), "intValue", 0);
        setField(term13261, term13261.getClass(), "objectValue", null);
        setField(term13257, term13257.getClass(), "propListHead", term13261);
        setIntField(term13257, term13257.getClass(), "sourcePosition", -1085899912);
        setField(term13257, term13257.getClass(), "jsType", null);
        setField(term13257, term13257.getClass(), "parent", null);
        setField(term13256, term13256.getClass(), "next", term13257);
        setIntField(term13262, term13262.getClass(), "type", 0);
        setField(term13262, term13262.getClass(), "next", null);
        setField(term13262, term13262.getClass(), "first", null);
        setField(term13262, term13262.getClass(), "last", null);
        setField(term13262, term13262.getClass(), "propListHead", null);
        setIntField(term13262, term13262.getClass(), "sourcePosition", 0);
        setField(term13262, term13262.getClass(), "jsType", null);
        setField(term13262, term13262.getClass(), "parent", null);
        setField(term13256, term13256.getClass(), "first", term13262);
        setIntField(term13263, term13263.getClass(), "type", 0);
        setField(term13263, term13263.getClass(), "next", null);
        setField(term13263, term13263.getClass(), "first", null);
        setField(term13263, term13263.getClass(), "last", null);
        setField(term13263, term13263.getClass(), "propListHead", null);
        setIntField(term13263, term13263.getClass(), "sourcePosition", 0);
        setField(term13263, term13263.getClass(), "jsType", null);
        setField(term13263, term13263.getClass(), "parent", null);
        setField(term13256, term13256.getClass(), "last", term13263);
        setField(term13264, term13264.getClass(), "next", null);
        setIntField(term13264, term13264.getClass(), "type", 0);
        setIntField(term13264, term13264.getClass(), "intValue", 0);
        setField(term13264, term13264.getClass(), "objectValue", null);
        setField(term13256, term13256.getClass(), "propListHead", term13264);
        setIntField(term13256, term13256.getClass(), "sourcePosition", -1458980236);
        setField(term13256, term13256.getClass(), "jsType", null);
        setField(term13256, term13256.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2194;
        args[1] = term2221;
        callMethod(klass, "containsType", argTypes, null, args);
        assertTrue(recursiveEquals(term2194, 890505372));
        assertTrue(recursiveEquals(term2221, term13256));
    }

};


