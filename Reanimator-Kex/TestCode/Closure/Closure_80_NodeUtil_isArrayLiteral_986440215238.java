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

public class NodeUtil_isArrayLiteral_986440215238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2297;
     Object term15246;

    public NodeUtil_isArrayLiteral_986440215238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2310 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2320 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2297, term2297.getClass(), "type", 892205855);
        setIntField(term2299, term2299.getClass(), "type", 2076413861);
        setIntField(term2301, term2301.getClass(), "type", 0);
        setField(term2301, term2301.getClass(), "next", null);
        setField(term2301, term2301.getClass(), "first", null);
        setField(term2301, term2301.getClass(), "last", null);
        setField(term2301, term2301.getClass(), "propListHead", null);
        setIntField(term2301, term2301.getClass(), "sourcePosition", 0);
        setField(term2301, term2301.getClass(), "jsType", null);
        setField(term2301, term2301.getClass(), "parent", null);
        setField(term2299, term2299.getClass(), "next", term2301);
        setIntField(term2304, term2304.getClass(), "type", 0);
        setField(term2304, term2304.getClass(), "next", null);
        setField(term2304, term2304.getClass(), "first", null);
        setField(term2304, term2304.getClass(), "last", null);
        setField(term2304, term2304.getClass(), "propListHead", null);
        setIntField(term2304, term2304.getClass(), "sourcePosition", 0);
        setField(term2304, term2304.getClass(), "jsType", null);
        setField(term2304, term2304.getClass(), "parent", null);
        setField(term2299, term2299.getClass(), "first", term2304);
        setIntField(term2307, term2307.getClass(), "type", 0);
        setField(term2307, term2307.getClass(), "next", null);
        setField(term2307, term2307.getClass(), "first", null);
        setField(term2307, term2307.getClass(), "last", null);
        setField(term2307, term2307.getClass(), "propListHead", null);
        setIntField(term2307, term2307.getClass(), "sourcePosition", 0);
        setField(term2307, term2307.getClass(), "jsType", null);
        setField(term2307, term2307.getClass(), "parent", null);
        setField(term2299, term2299.getClass(), "last", term2307);
        setField(term2310, term2310.getClass(), "next", null);
        setIntField(term2310, term2310.getClass(), "type", 0);
        setIntField(term2310, term2310.getClass(), "intValue", 0);
        setField(term2310, term2310.getClass(), "objectValue", null);
        setField(term2299, term2299.getClass(), "propListHead", term2310);
        setIntField(term2299, term2299.getClass(), "sourcePosition", -1641507499);
        setField(term2299, term2299.getClass(), "jsType", null);
        setField(term2299, term2299.getClass(), "parent", null);
        setField(term2297, term2297.getClass(), "next", term2299);
        setIntField(term2314, term2314.getClass(), "type", 0);
        setField(term2314, term2314.getClass(), "next", null);
        setField(term2314, term2314.getClass(), "first", null);
        setField(term2314, term2314.getClass(), "last", null);
        setField(term2314, term2314.getClass(), "propListHead", null);
        setIntField(term2314, term2314.getClass(), "sourcePosition", 0);
        setField(term2314, term2314.getClass(), "jsType", null);
        setField(term2314, term2314.getClass(), "parent", null);
        setField(term2297, term2297.getClass(), "first", term2314);
        setIntField(term2317, term2317.getClass(), "type", 0);
        setField(term2317, term2317.getClass(), "next", null);
        setField(term2317, term2317.getClass(), "first", null);
        setField(term2317, term2317.getClass(), "last", null);
        setField(term2317, term2317.getClass(), "propListHead", null);
        setIntField(term2317, term2317.getClass(), "sourcePosition", 0);
        setField(term2317, term2317.getClass(), "jsType", null);
        setField(term2317, term2317.getClass(), "parent", null);
        setField(term2297, term2297.getClass(), "last", term2317);
        setField(term2320, term2320.getClass(), "next", null);
        setIntField(term2320, term2320.getClass(), "type", 0);
        setIntField(term2320, term2320.getClass(), "intValue", 0);
        setField(term2320, term2320.getClass(), "objectValue", null);
        setField(term2297, term2297.getClass(), "propListHead", term2320);
        setIntField(term2297, term2297.getClass(), "sourcePosition", -33436796);
        setField(term2297, term2297.getClass(), "jsType", null);
        setField(term2297, term2297.getClass(), "parent", null);
        term15246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15251 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15254 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15246, term15246.getClass(), "type", 892205855);
        setIntField(term15247, term15247.getClass(), "type", 2076413861);
        setIntField(term15248, term15248.getClass(), "type", 0);
        setField(term15248, term15248.getClass(), "next", null);
        setField(term15248, term15248.getClass(), "first", null);
        setField(term15248, term15248.getClass(), "last", null);
        setField(term15248, term15248.getClass(), "propListHead", null);
        setIntField(term15248, term15248.getClass(), "sourcePosition", 0);
        setField(term15248, term15248.getClass(), "jsType", null);
        setField(term15248, term15248.getClass(), "parent", null);
        setField(term15247, term15247.getClass(), "next", term15248);
        setIntField(term15249, term15249.getClass(), "type", 0);
        setField(term15249, term15249.getClass(), "next", null);
        setField(term15249, term15249.getClass(), "first", null);
        setField(term15249, term15249.getClass(), "last", null);
        setField(term15249, term15249.getClass(), "propListHead", null);
        setIntField(term15249, term15249.getClass(), "sourcePosition", 0);
        setField(term15249, term15249.getClass(), "jsType", null);
        setField(term15249, term15249.getClass(), "parent", null);
        setField(term15247, term15247.getClass(), "first", term15249);
        setIntField(term15250, term15250.getClass(), "type", 0);
        setField(term15250, term15250.getClass(), "next", null);
        setField(term15250, term15250.getClass(), "first", null);
        setField(term15250, term15250.getClass(), "last", null);
        setField(term15250, term15250.getClass(), "propListHead", null);
        setIntField(term15250, term15250.getClass(), "sourcePosition", 0);
        setField(term15250, term15250.getClass(), "jsType", null);
        setField(term15250, term15250.getClass(), "parent", null);
        setField(term15247, term15247.getClass(), "last", term15250);
        setField(term15251, term15251.getClass(), "next", null);
        setIntField(term15251, term15251.getClass(), "type", 0);
        setIntField(term15251, term15251.getClass(), "intValue", 0);
        setField(term15251, term15251.getClass(), "objectValue", null);
        setField(term15247, term15247.getClass(), "propListHead", term15251);
        setIntField(term15247, term15247.getClass(), "sourcePosition", -1641507499);
        setField(term15247, term15247.getClass(), "jsType", null);
        setField(term15247, term15247.getClass(), "parent", null);
        setField(term15246, term15246.getClass(), "next", term15247);
        setIntField(term15252, term15252.getClass(), "type", 0);
        setField(term15252, term15252.getClass(), "next", null);
        setField(term15252, term15252.getClass(), "first", null);
        setField(term15252, term15252.getClass(), "last", null);
        setField(term15252, term15252.getClass(), "propListHead", null);
        setIntField(term15252, term15252.getClass(), "sourcePosition", 0);
        setField(term15252, term15252.getClass(), "jsType", null);
        setField(term15252, term15252.getClass(), "parent", null);
        setField(term15246, term15246.getClass(), "first", term15252);
        setIntField(term15253, term15253.getClass(), "type", 0);
        setField(term15253, term15253.getClass(), "next", null);
        setField(term15253, term15253.getClass(), "first", null);
        setField(term15253, term15253.getClass(), "last", null);
        setField(term15253, term15253.getClass(), "propListHead", null);
        setIntField(term15253, term15253.getClass(), "sourcePosition", 0);
        setField(term15253, term15253.getClass(), "jsType", null);
        setField(term15253, term15253.getClass(), "parent", null);
        setField(term15246, term15246.getClass(), "last", term15253);
        setField(term15254, term15254.getClass(), "next", null);
        setIntField(term15254, term15254.getClass(), "type", 0);
        setIntField(term15254, term15254.getClass(), "intValue", 0);
        setField(term15254, term15254.getClass(), "objectValue", null);
        setField(term15246, term15246.getClass(), "propListHead", term15254);
        setIntField(term15246, term15246.getClass(), "sourcePosition", -33436796);
        setField(term15246, term15246.getClass(), "jsType", null);
        setField(term15246, term15246.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2297;
        Object retValue = callMethod(klass, "isArrayLiteral", argTypes, null, args);
        assertTrue(recursiveEquals(term2297, term15246));
        assertTrue(recursiveEquals(retValue, false));
    }

};


