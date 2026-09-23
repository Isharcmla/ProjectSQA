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

public class NodeUtil_isThis_1377192847238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2297;
     Object term15573;

    public NodeUtil_isThis_1377192847238() {
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
        term15573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15578 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15581 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15573, term15573.getClass(), "type", 892205855);
        setIntField(term15574, term15574.getClass(), "type", 2076413861);
        setIntField(term15575, term15575.getClass(), "type", 0);
        setField(term15575, term15575.getClass(), "next", null);
        setField(term15575, term15575.getClass(), "first", null);
        setField(term15575, term15575.getClass(), "last", null);
        setField(term15575, term15575.getClass(), "propListHead", null);
        setIntField(term15575, term15575.getClass(), "sourcePosition", 0);
        setField(term15575, term15575.getClass(), "jsType", null);
        setField(term15575, term15575.getClass(), "parent", null);
        setField(term15574, term15574.getClass(), "next", term15575);
        setIntField(term15576, term15576.getClass(), "type", 0);
        setField(term15576, term15576.getClass(), "next", null);
        setField(term15576, term15576.getClass(), "first", null);
        setField(term15576, term15576.getClass(), "last", null);
        setField(term15576, term15576.getClass(), "propListHead", null);
        setIntField(term15576, term15576.getClass(), "sourcePosition", 0);
        setField(term15576, term15576.getClass(), "jsType", null);
        setField(term15576, term15576.getClass(), "parent", null);
        setField(term15574, term15574.getClass(), "first", term15576);
        setIntField(term15577, term15577.getClass(), "type", 0);
        setField(term15577, term15577.getClass(), "next", null);
        setField(term15577, term15577.getClass(), "first", null);
        setField(term15577, term15577.getClass(), "last", null);
        setField(term15577, term15577.getClass(), "propListHead", null);
        setIntField(term15577, term15577.getClass(), "sourcePosition", 0);
        setField(term15577, term15577.getClass(), "jsType", null);
        setField(term15577, term15577.getClass(), "parent", null);
        setField(term15574, term15574.getClass(), "last", term15577);
        setField(term15578, term15578.getClass(), "next", null);
        setIntField(term15578, term15578.getClass(), "type", 0);
        setIntField(term15578, term15578.getClass(), "intValue", 0);
        setField(term15578, term15578.getClass(), "objectValue", null);
        setField(term15574, term15574.getClass(), "propListHead", term15578);
        setIntField(term15574, term15574.getClass(), "sourcePosition", -1641507499);
        setField(term15574, term15574.getClass(), "jsType", null);
        setField(term15574, term15574.getClass(), "parent", null);
        setField(term15573, term15573.getClass(), "next", term15574);
        setIntField(term15579, term15579.getClass(), "type", 0);
        setField(term15579, term15579.getClass(), "next", null);
        setField(term15579, term15579.getClass(), "first", null);
        setField(term15579, term15579.getClass(), "last", null);
        setField(term15579, term15579.getClass(), "propListHead", null);
        setIntField(term15579, term15579.getClass(), "sourcePosition", 0);
        setField(term15579, term15579.getClass(), "jsType", null);
        setField(term15579, term15579.getClass(), "parent", null);
        setField(term15573, term15573.getClass(), "first", term15579);
        setIntField(term15580, term15580.getClass(), "type", 0);
        setField(term15580, term15580.getClass(), "next", null);
        setField(term15580, term15580.getClass(), "first", null);
        setField(term15580, term15580.getClass(), "last", null);
        setField(term15580, term15580.getClass(), "propListHead", null);
        setIntField(term15580, term15580.getClass(), "sourcePosition", 0);
        setField(term15580, term15580.getClass(), "jsType", null);
        setField(term15580, term15580.getClass(), "parent", null);
        setField(term15573, term15573.getClass(), "last", term15580);
        setField(term15581, term15581.getClass(), "next", null);
        setIntField(term15581, term15581.getClass(), "type", 0);
        setIntField(term15581, term15581.getClass(), "intValue", 0);
        setField(term15581, term15581.getClass(), "objectValue", null);
        setField(term15573, term15573.getClass(), "propListHead", term15581);
        setIntField(term15573, term15573.getClass(), "sourcePosition", -33436796);
        setField(term15573, term15573.getClass(), "jsType", null);
        setField(term15573, term15573.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2297;
        Object retValue = callMethod(klass, "isThis", argTypes, null, args);
        assertTrue(recursiveEquals(term2297, term15573));
        assertTrue(recursiveEquals(retValue, false));
    }

};


