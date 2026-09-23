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

public class NodeUtil_getInfoForNameNode_2009241699298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3388;
     Object term23815;

    public NodeUtil_getInfoForNameNode_2009241699298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3388, term3388.getClass(), "type", 1701819905);
        setIntField(term3390, term3390.getClass(), "type", 1086709736);
        setIntField(term3392, term3392.getClass(), "type", 0);
        setField(term3392, term3392.getClass(), "next", null);
        setField(term3392, term3392.getClass(), "first", null);
        setField(term3392, term3392.getClass(), "last", null);
        setField(term3392, term3392.getClass(), "propListHead", null);
        setIntField(term3392, term3392.getClass(), "sourcePosition", 0);
        setField(term3392, term3392.getClass(), "jsType", null);
        setField(term3392, term3392.getClass(), "parent", null);
        setField(term3390, term3390.getClass(), "next", term3392);
        setIntField(term3395, term3395.getClass(), "type", 0);
        setField(term3395, term3395.getClass(), "next", null);
        setField(term3395, term3395.getClass(), "first", null);
        setField(term3395, term3395.getClass(), "last", null);
        setField(term3395, term3395.getClass(), "propListHead", null);
        setIntField(term3395, term3395.getClass(), "sourcePosition", 0);
        setField(term3395, term3395.getClass(), "jsType", null);
        setField(term3395, term3395.getClass(), "parent", null);
        setField(term3390, term3390.getClass(), "first", term3395);
        setIntField(term3398, term3398.getClass(), "type", 0);
        setField(term3398, term3398.getClass(), "next", null);
        setField(term3398, term3398.getClass(), "first", null);
        setField(term3398, term3398.getClass(), "last", null);
        setField(term3398, term3398.getClass(), "propListHead", null);
        setIntField(term3398, term3398.getClass(), "sourcePosition", 0);
        setField(term3398, term3398.getClass(), "jsType", null);
        setField(term3398, term3398.getClass(), "parent", null);
        setField(term3390, term3390.getClass(), "last", term3398);
        setField(term3390, term3390.getClass(), "propListHead", null);
        setIntField(term3390, term3390.getClass(), "sourcePosition", 0);
        setField(term3390, term3390.getClass(), "jsType", null);
        setField(term3390, term3390.getClass(), "parent", null);
        setField(term3388, term3388.getClass(), "next", term3390);
        setIntField(term3402, term3402.getClass(), "type", 0);
        setField(term3402, term3402.getClass(), "next", null);
        setField(term3402, term3402.getClass(), "first", null);
        setField(term3402, term3402.getClass(), "last", null);
        setField(term3402, term3402.getClass(), "propListHead", null);
        setIntField(term3402, term3402.getClass(), "sourcePosition", 0);
        setField(term3402, term3402.getClass(), "jsType", null);
        setField(term3402, term3402.getClass(), "parent", null);
        setField(term3388, term3388.getClass(), "first", term3402);
        setIntField(term3405, term3405.getClass(), "type", 0);
        setField(term3405, term3405.getClass(), "next", null);
        setField(term3405, term3405.getClass(), "first", null);
        setField(term3405, term3405.getClass(), "last", null);
        setField(term3405, term3405.getClass(), "propListHead", null);
        setIntField(term3405, term3405.getClass(), "sourcePosition", 0);
        setField(term3405, term3405.getClass(), "jsType", null);
        setField(term3405, term3405.getClass(), "parent", null);
        setField(term3388, term3388.getClass(), "last", term3405);
        setField(term3388, term3388.getClass(), "propListHead", null);
        setIntField(term3388, term3388.getClass(), "sourcePosition", 0);
        setField(term3388, term3388.getClass(), "jsType", null);
        setField(term3388, term3388.getClass(), "parent", null);
        term23815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23815, term23815.getClass(), "type", 1701819905);
        setIntField(term23816, term23816.getClass(), "type", 1086709736);
        setIntField(term23817, term23817.getClass(), "type", 0);
        setField(term23817, term23817.getClass(), "next", null);
        setField(term23817, term23817.getClass(), "first", null);
        setField(term23817, term23817.getClass(), "last", null);
        setField(term23817, term23817.getClass(), "propListHead", null);
        setIntField(term23817, term23817.getClass(), "sourcePosition", 0);
        setField(term23817, term23817.getClass(), "jsType", null);
        setField(term23817, term23817.getClass(), "parent", null);
        setField(term23816, term23816.getClass(), "next", term23817);
        setIntField(term23818, term23818.getClass(), "type", 0);
        setField(term23818, term23818.getClass(), "next", null);
        setField(term23818, term23818.getClass(), "first", null);
        setField(term23818, term23818.getClass(), "last", null);
        setField(term23818, term23818.getClass(), "propListHead", null);
        setIntField(term23818, term23818.getClass(), "sourcePosition", 0);
        setField(term23818, term23818.getClass(), "jsType", null);
        setField(term23818, term23818.getClass(), "parent", null);
        setField(term23816, term23816.getClass(), "first", term23818);
        setIntField(term23819, term23819.getClass(), "type", 0);
        setField(term23819, term23819.getClass(), "next", null);
        setField(term23819, term23819.getClass(), "first", null);
        setField(term23819, term23819.getClass(), "last", null);
        setField(term23819, term23819.getClass(), "propListHead", null);
        setIntField(term23819, term23819.getClass(), "sourcePosition", 0);
        setField(term23819, term23819.getClass(), "jsType", null);
        setField(term23819, term23819.getClass(), "parent", null);
        setField(term23816, term23816.getClass(), "last", term23819);
        setField(term23816, term23816.getClass(), "propListHead", null);
        setIntField(term23816, term23816.getClass(), "sourcePosition", 0);
        setField(term23816, term23816.getClass(), "jsType", null);
        setField(term23816, term23816.getClass(), "parent", null);
        setField(term23815, term23815.getClass(), "next", term23816);
        setIntField(term23820, term23820.getClass(), "type", 0);
        setField(term23820, term23820.getClass(), "next", null);
        setField(term23820, term23820.getClass(), "first", null);
        setField(term23820, term23820.getClass(), "last", null);
        setField(term23820, term23820.getClass(), "propListHead", null);
        setIntField(term23820, term23820.getClass(), "sourcePosition", 0);
        setField(term23820, term23820.getClass(), "jsType", null);
        setField(term23820, term23820.getClass(), "parent", null);
        setField(term23815, term23815.getClass(), "first", term23820);
        setIntField(term23821, term23821.getClass(), "type", 0);
        setField(term23821, term23821.getClass(), "next", null);
        setField(term23821, term23821.getClass(), "first", null);
        setField(term23821, term23821.getClass(), "last", null);
        setField(term23821, term23821.getClass(), "propListHead", null);
        setIntField(term23821, term23821.getClass(), "sourcePosition", 0);
        setField(term23821, term23821.getClass(), "jsType", null);
        setField(term23821, term23821.getClass(), "parent", null);
        setField(term23815, term23815.getClass(), "last", term23821);
        setField(term23815, term23815.getClass(), "propListHead", null);
        setIntField(term23815, term23815.getClass(), "sourcePosition", 0);
        setField(term23815, term23815.getClass(), "jsType", null);
        setField(term23815, term23815.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3388;
        Object retValue = callMethod(klass, "getInfoForNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term3388, term23815));
        assertTrue(recursiveEquals(retValue, null));
    }

};


