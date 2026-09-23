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
import java.lang.Object;

public class NodeUtil_getAssignedValue_425769613211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1487;

    public NodeUtil_getAssignedValue_425769613211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1500 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1510 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1487, term1487.getClass(), "type", -1538936030);
        setIntField(term1489, term1489.getClass(), "type", -2069930777);
        setIntField(term1491, term1491.getClass(), "type", 0);
        setField(term1491, term1491.getClass(), "next", null);
        setField(term1491, term1491.getClass(), "first", null);
        setField(term1491, term1491.getClass(), "last", null);
        setField(term1491, term1491.getClass(), "propListHead", null);
        setIntField(term1491, term1491.getClass(), "sourcePosition", 0);
        setField(term1491, term1491.getClass(), "jsType", null);
        setField(term1491, term1491.getClass(), "parent", null);
        setField(term1489, term1489.getClass(), "next", term1491);
        setIntField(term1494, term1494.getClass(), "type", 0);
        setField(term1494, term1494.getClass(), "next", null);
        setField(term1494, term1494.getClass(), "first", null);
        setField(term1494, term1494.getClass(), "last", null);
        setField(term1494, term1494.getClass(), "propListHead", null);
        setIntField(term1494, term1494.getClass(), "sourcePosition", 0);
        setField(term1494, term1494.getClass(), "jsType", null);
        setField(term1494, term1494.getClass(), "parent", null);
        setField(term1489, term1489.getClass(), "first", term1494);
        setIntField(term1497, term1497.getClass(), "type", 0);
        setField(term1497, term1497.getClass(), "next", null);
        setField(term1497, term1497.getClass(), "first", null);
        setField(term1497, term1497.getClass(), "last", null);
        setField(term1497, term1497.getClass(), "propListHead", null);
        setIntField(term1497, term1497.getClass(), "sourcePosition", 0);
        setField(term1497, term1497.getClass(), "jsType", null);
        setField(term1497, term1497.getClass(), "parent", null);
        setField(term1489, term1489.getClass(), "last", term1497);
        setField(term1500, term1500.getClass(), "next", null);
        setIntField(term1500, term1500.getClass(), "type", 0);
        setIntField(term1500, term1500.getClass(), "intValue", 0);
        setField(term1500, term1500.getClass(), "objectValue", null);
        setField(term1489, term1489.getClass(), "propListHead", term1500);
        setIntField(term1489, term1489.getClass(), "sourcePosition", -270592367);
        setField(term1489, term1489.getClass(), "jsType", null);
        setField(term1489, term1489.getClass(), "parent", null);
        setField(term1487, term1487.getClass(), "next", term1489);
        setIntField(term1504, term1504.getClass(), "type", 0);
        setField(term1504, term1504.getClass(), "next", null);
        setField(term1504, term1504.getClass(), "first", null);
        setField(term1504, term1504.getClass(), "last", null);
        setField(term1504, term1504.getClass(), "propListHead", null);
        setIntField(term1504, term1504.getClass(), "sourcePosition", 0);
        setField(term1504, term1504.getClass(), "jsType", null);
        setField(term1504, term1504.getClass(), "parent", null);
        setField(term1487, term1487.getClass(), "first", term1504);
        setIntField(term1507, term1507.getClass(), "type", 0);
        setField(term1507, term1507.getClass(), "next", null);
        setField(term1507, term1507.getClass(), "first", null);
        setField(term1507, term1507.getClass(), "last", null);
        setField(term1507, term1507.getClass(), "propListHead", null);
        setIntField(term1507, term1507.getClass(), "sourcePosition", 0);
        setField(term1507, term1507.getClass(), "jsType", null);
        setField(term1507, term1507.getClass(), "parent", null);
        setField(term1487, term1487.getClass(), "last", term1507);
        setField(term1510, term1510.getClass(), "next", null);
        setIntField(term1510, term1510.getClass(), "type", 0);
        setIntField(term1510, term1510.getClass(), "intValue", 0);
        setField(term1510, term1510.getClass(), "objectValue", null);
        setField(term1487, term1487.getClass(), "propListHead", term1510);
        setIntField(term1487, term1487.getClass(), "sourcePosition", 178847646);
        setField(term1487, term1487.getClass(), "jsType", null);
        setField(term1487, term1487.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1487;
        try {
            callMethod(klass, "getAssignedValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


