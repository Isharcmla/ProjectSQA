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
     Object term23629;

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
        term23629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23629, term23629.getClass(), "type", 1701819905);
        setIntField(term23630, term23630.getClass(), "type", 1086709736);
        setIntField(term23631, term23631.getClass(), "type", 0);
        setField(term23631, term23631.getClass(), "next", null);
        setField(term23631, term23631.getClass(), "first", null);
        setField(term23631, term23631.getClass(), "last", null);
        setField(term23631, term23631.getClass(), "propListHead", null);
        setIntField(term23631, term23631.getClass(), "sourcePosition", 0);
        setField(term23631, term23631.getClass(), "jsType", null);
        setField(term23631, term23631.getClass(), "parent", null);
        setField(term23630, term23630.getClass(), "next", term23631);
        setIntField(term23632, term23632.getClass(), "type", 0);
        setField(term23632, term23632.getClass(), "next", null);
        setField(term23632, term23632.getClass(), "first", null);
        setField(term23632, term23632.getClass(), "last", null);
        setField(term23632, term23632.getClass(), "propListHead", null);
        setIntField(term23632, term23632.getClass(), "sourcePosition", 0);
        setField(term23632, term23632.getClass(), "jsType", null);
        setField(term23632, term23632.getClass(), "parent", null);
        setField(term23630, term23630.getClass(), "first", term23632);
        setIntField(term23633, term23633.getClass(), "type", 0);
        setField(term23633, term23633.getClass(), "next", null);
        setField(term23633, term23633.getClass(), "first", null);
        setField(term23633, term23633.getClass(), "last", null);
        setField(term23633, term23633.getClass(), "propListHead", null);
        setIntField(term23633, term23633.getClass(), "sourcePosition", 0);
        setField(term23633, term23633.getClass(), "jsType", null);
        setField(term23633, term23633.getClass(), "parent", null);
        setField(term23630, term23630.getClass(), "last", term23633);
        setField(term23630, term23630.getClass(), "propListHead", null);
        setIntField(term23630, term23630.getClass(), "sourcePosition", 0);
        setField(term23630, term23630.getClass(), "jsType", null);
        setField(term23630, term23630.getClass(), "parent", null);
        setField(term23629, term23629.getClass(), "next", term23630);
        setIntField(term23634, term23634.getClass(), "type", 0);
        setField(term23634, term23634.getClass(), "next", null);
        setField(term23634, term23634.getClass(), "first", null);
        setField(term23634, term23634.getClass(), "last", null);
        setField(term23634, term23634.getClass(), "propListHead", null);
        setIntField(term23634, term23634.getClass(), "sourcePosition", 0);
        setField(term23634, term23634.getClass(), "jsType", null);
        setField(term23634, term23634.getClass(), "parent", null);
        setField(term23629, term23629.getClass(), "first", term23634);
        setIntField(term23635, term23635.getClass(), "type", 0);
        setField(term23635, term23635.getClass(), "next", null);
        setField(term23635, term23635.getClass(), "first", null);
        setField(term23635, term23635.getClass(), "last", null);
        setField(term23635, term23635.getClass(), "propListHead", null);
        setIntField(term23635, term23635.getClass(), "sourcePosition", 0);
        setField(term23635, term23635.getClass(), "jsType", null);
        setField(term23635, term23635.getClass(), "parent", null);
        setField(term23629, term23629.getClass(), "last", term23635);
        setField(term23629, term23629.getClass(), "propListHead", null);
        setIntField(term23629, term23629.getClass(), "sourcePosition", 0);
        setField(term23629, term23629.getClass(), "jsType", null);
        setField(term23629, term23629.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3388;
        Object retValue = callMethod(klass, "getInfoForNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term3388, term23629));
        assertTrue(recursiveEquals(retValue, null));
    }

};


