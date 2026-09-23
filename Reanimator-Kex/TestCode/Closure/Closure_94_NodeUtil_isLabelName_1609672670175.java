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

public class NodeUtil_isLabelName_1609672670175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1491;
     Object term10472;

    public NodeUtil_isLabelName_1609672670175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1504 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1514 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1491, term1491.getClass(), "type", 1816273440);
        setIntField(term1493, term1493.getClass(), "type", 109078154);
        setIntField(term1495, term1495.getClass(), "type", 0);
        setField(term1495, term1495.getClass(), "next", null);
        setField(term1495, term1495.getClass(), "first", null);
        setField(term1495, term1495.getClass(), "last", null);
        setField(term1495, term1495.getClass(), "propListHead", null);
        setIntField(term1495, term1495.getClass(), "sourcePosition", 0);
        setField(term1495, term1495.getClass(), "jsType", null);
        setField(term1495, term1495.getClass(), "parent", null);
        setField(term1493, term1493.getClass(), "next", term1495);
        setIntField(term1498, term1498.getClass(), "type", 0);
        setField(term1498, term1498.getClass(), "next", null);
        setField(term1498, term1498.getClass(), "first", null);
        setField(term1498, term1498.getClass(), "last", null);
        setField(term1498, term1498.getClass(), "propListHead", null);
        setIntField(term1498, term1498.getClass(), "sourcePosition", 0);
        setField(term1498, term1498.getClass(), "jsType", null);
        setField(term1498, term1498.getClass(), "parent", null);
        setField(term1493, term1493.getClass(), "first", term1498);
        setIntField(term1501, term1501.getClass(), "type", 0);
        setField(term1501, term1501.getClass(), "next", null);
        setField(term1501, term1501.getClass(), "first", null);
        setField(term1501, term1501.getClass(), "last", null);
        setField(term1501, term1501.getClass(), "propListHead", null);
        setIntField(term1501, term1501.getClass(), "sourcePosition", 0);
        setField(term1501, term1501.getClass(), "jsType", null);
        setField(term1501, term1501.getClass(), "parent", null);
        setField(term1493, term1493.getClass(), "last", term1501);
        setField(term1504, term1504.getClass(), "next", null);
        setIntField(term1504, term1504.getClass(), "type", 0);
        setIntField(term1504, term1504.getClass(), "intValue", 0);
        setField(term1504, term1504.getClass(), "objectValue", null);
        setField(term1493, term1493.getClass(), "propListHead", term1504);
        setIntField(term1493, term1493.getClass(), "sourcePosition", -995785731);
        setField(term1493, term1493.getClass(), "jsType", null);
        setField(term1493, term1493.getClass(), "parent", null);
        setField(term1491, term1491.getClass(), "next", term1493);
        setIntField(term1508, term1508.getClass(), "type", 0);
        setField(term1508, term1508.getClass(), "next", null);
        setField(term1508, term1508.getClass(), "first", null);
        setField(term1508, term1508.getClass(), "last", null);
        setField(term1508, term1508.getClass(), "propListHead", null);
        setIntField(term1508, term1508.getClass(), "sourcePosition", 0);
        setField(term1508, term1508.getClass(), "jsType", null);
        setField(term1508, term1508.getClass(), "parent", null);
        setField(term1491, term1491.getClass(), "first", term1508);
        setIntField(term1511, term1511.getClass(), "type", 0);
        setField(term1511, term1511.getClass(), "next", null);
        setField(term1511, term1511.getClass(), "first", null);
        setField(term1511, term1511.getClass(), "last", null);
        setField(term1511, term1511.getClass(), "propListHead", null);
        setIntField(term1511, term1511.getClass(), "sourcePosition", 0);
        setField(term1511, term1511.getClass(), "jsType", null);
        setField(term1511, term1511.getClass(), "parent", null);
        setField(term1491, term1491.getClass(), "last", term1511);
        setField(term1514, term1514.getClass(), "next", null);
        setIntField(term1514, term1514.getClass(), "type", 0);
        setIntField(term1514, term1514.getClass(), "intValue", 0);
        setField(term1514, term1514.getClass(), "objectValue", null);
        setField(term1491, term1491.getClass(), "propListHead", term1514);
        setIntField(term1491, term1491.getClass(), "sourcePosition", 1349815364);
        setField(term1491, term1491.getClass(), "jsType", null);
        setField(term1491, term1491.getClass(), "parent", null);
        term10472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10477 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10480 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10472, term10472.getClass(), "type", 1816273440);
        setIntField(term10473, term10473.getClass(), "type", 109078154);
        setIntField(term10474, term10474.getClass(), "type", 0);
        setField(term10474, term10474.getClass(), "next", null);
        setField(term10474, term10474.getClass(), "first", null);
        setField(term10474, term10474.getClass(), "last", null);
        setField(term10474, term10474.getClass(), "propListHead", null);
        setIntField(term10474, term10474.getClass(), "sourcePosition", 0);
        setField(term10474, term10474.getClass(), "jsType", null);
        setField(term10474, term10474.getClass(), "parent", null);
        setField(term10473, term10473.getClass(), "next", term10474);
        setIntField(term10475, term10475.getClass(), "type", 0);
        setField(term10475, term10475.getClass(), "next", null);
        setField(term10475, term10475.getClass(), "first", null);
        setField(term10475, term10475.getClass(), "last", null);
        setField(term10475, term10475.getClass(), "propListHead", null);
        setIntField(term10475, term10475.getClass(), "sourcePosition", 0);
        setField(term10475, term10475.getClass(), "jsType", null);
        setField(term10475, term10475.getClass(), "parent", null);
        setField(term10473, term10473.getClass(), "first", term10475);
        setIntField(term10476, term10476.getClass(), "type", 0);
        setField(term10476, term10476.getClass(), "next", null);
        setField(term10476, term10476.getClass(), "first", null);
        setField(term10476, term10476.getClass(), "last", null);
        setField(term10476, term10476.getClass(), "propListHead", null);
        setIntField(term10476, term10476.getClass(), "sourcePosition", 0);
        setField(term10476, term10476.getClass(), "jsType", null);
        setField(term10476, term10476.getClass(), "parent", null);
        setField(term10473, term10473.getClass(), "last", term10476);
        setField(term10477, term10477.getClass(), "next", null);
        setIntField(term10477, term10477.getClass(), "type", 0);
        setIntField(term10477, term10477.getClass(), "intValue", 0);
        setField(term10477, term10477.getClass(), "objectValue", null);
        setField(term10473, term10473.getClass(), "propListHead", term10477);
        setIntField(term10473, term10473.getClass(), "sourcePosition", -995785731);
        setField(term10473, term10473.getClass(), "jsType", null);
        setField(term10473, term10473.getClass(), "parent", null);
        setField(term10472, term10472.getClass(), "next", term10473);
        setIntField(term10478, term10478.getClass(), "type", 0);
        setField(term10478, term10478.getClass(), "next", null);
        setField(term10478, term10478.getClass(), "first", null);
        setField(term10478, term10478.getClass(), "last", null);
        setField(term10478, term10478.getClass(), "propListHead", null);
        setIntField(term10478, term10478.getClass(), "sourcePosition", 0);
        setField(term10478, term10478.getClass(), "jsType", null);
        setField(term10478, term10478.getClass(), "parent", null);
        setField(term10472, term10472.getClass(), "first", term10478);
        setIntField(term10479, term10479.getClass(), "type", 0);
        setField(term10479, term10479.getClass(), "next", null);
        setField(term10479, term10479.getClass(), "first", null);
        setField(term10479, term10479.getClass(), "last", null);
        setField(term10479, term10479.getClass(), "propListHead", null);
        setIntField(term10479, term10479.getClass(), "sourcePosition", 0);
        setField(term10479, term10479.getClass(), "jsType", null);
        setField(term10479, term10479.getClass(), "parent", null);
        setField(term10472, term10472.getClass(), "last", term10479);
        setField(term10480, term10480.getClass(), "next", null);
        setIntField(term10480, term10480.getClass(), "type", 0);
        setIntField(term10480, term10480.getClass(), "intValue", 0);
        setField(term10480, term10480.getClass(), "objectValue", null);
        setField(term10472, term10472.getClass(), "propListHead", term10480);
        setIntField(term10472, term10472.getClass(), "sourcePosition", 1349815364);
        setField(term10472, term10472.getClass(), "jsType", null);
        setField(term10472, term10472.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1491;
        Object retValue = callMethod(klass, "isLabelName", argTypes, null, args);
        assertTrue(recursiveEquals(term1491, term10472));
        assertTrue(recursiveEquals(retValue, false));
    }

};


