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

public class NodeUtil_getAssignedValue_425769613225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1466;

    public NodeUtil_getAssignedValue_425769613225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1466, term1466.getClass(), "type", -2138825831);
        setIntField(term1468, term1468.getClass(), "type", 1454781562);
        setIntField(term1470, term1470.getClass(), "type", -27944011);
        setIntField(term1472, term1472.getClass(), "type", -20614472);
        setIntField(term1474, term1474.getClass(), "type", 1126618861);
        setField(term1474, term1474.getClass(), "next", null);
        setField(term1474, term1474.getClass(), "first", null);
        setField(term1474, term1474.getClass(), "last", null);
        setField(term1474, term1474.getClass(), "propListHead", null);
        setIntField(term1474, term1474.getClass(), "sourcePosition", 0);
        setField(term1474, term1474.getClass(), "jsType", null);
        setField(term1474, term1474.getClass(), "parent", null);
        setField(term1472, term1472.getClass(), "next", term1474);
        setIntField(term1477, term1477.getClass(), "type", 947449400);
        setField(term1477, term1477.getClass(), "next", null);
        setField(term1477, term1477.getClass(), "first", null);
        setField(term1477, term1477.getClass(), "last", term1474);
        setField(term1477, term1477.getClass(), "propListHead", null);
        setIntField(term1477, term1477.getClass(), "sourcePosition", 0);
        setField(term1477, term1477.getClass(), "jsType", null);
        setField(term1477, term1477.getClass(), "parent", null);
        setField(term1472, term1472.getClass(), "first", term1477);
        setField(term1472, term1472.getClass(), "last", term1470);
        setField(term1472, term1472.getClass(), "propListHead", null);
        setIntField(term1472, term1472.getClass(), "sourcePosition", 0);
        setField(term1472, term1472.getClass(), "jsType", null);
        setField(term1472, term1472.getClass(), "parent", null);
        setField(term1470, term1470.getClass(), "next", term1472);
        setField(term1470, term1470.getClass(), "first", term1474);
        setIntField(term1481, term1481.getClass(), "type", 1207142014);
        setIntField(term1483, term1483.getClass(), "type", -876426634);
        setField(term1483, term1483.getClass(), "next", null);
        setField(term1483, term1483.getClass(), "first", term1477);
        setField(term1483, term1483.getClass(), "last", term1472);
        setField(term1483, term1483.getClass(), "propListHead", null);
        setIntField(term1483, term1483.getClass(), "sourcePosition", 0);
        setField(term1483, term1483.getClass(), "jsType", null);
        setField(term1483, term1483.getClass(), "parent", null);
        setField(term1481, term1481.getClass(), "next", term1483);
        setField(term1481, term1481.getClass(), "first", term1468);
        setField(term1481, term1481.getClass(), "last", term1468);
        setField(term1481, term1481.getClass(), "propListHead", null);
        setIntField(term1481, term1481.getClass(), "sourcePosition", 0);
        setField(term1481, term1481.getClass(), "jsType", null);
        setField(term1481, term1481.getClass(), "parent", null);
        setField(term1470, term1470.getClass(), "last", term1481);
        setField(term1470, term1470.getClass(), "propListHead", null);
        setIntField(term1470, term1470.getClass(), "sourcePosition", 0);
        setField(term1470, term1470.getClass(), "jsType", null);
        setField(term1470, term1470.getClass(), "parent", null);
        setField(term1468, term1468.getClass(), "next", term1470);
        setIntField(term1488, term1488.getClass(), "type", 213831054);
        setField(term1488, term1488.getClass(), "next", term1481);
        setField(term1488, term1488.getClass(), "first", term1483);
        setField(term1488, term1488.getClass(), "last", term1466);
        setField(term1488, term1488.getClass(), "propListHead", null);
        setIntField(term1488, term1488.getClass(), "sourcePosition", 0);
        setField(term1488, term1488.getClass(), "jsType", null);
        setField(term1488, term1488.getClass(), "parent", null);
        setField(term1468, term1468.getClass(), "first", term1488);
        setField(term1468, term1468.getClass(), "last", term1488);
        setField(term1468, term1468.getClass(), "propListHead", null);
        setIntField(term1468, term1468.getClass(), "sourcePosition", 0);
        setField(term1468, term1468.getClass(), "jsType", null);
        setField(term1468, term1468.getClass(), "parent", null);
        setField(term1466, term1466.getClass(), "next", term1468);
        setField(term1466, term1466.getClass(), "first", term1472);
        setField(term1466, term1466.getClass(), "last", term1474);
        setField(term1466, term1466.getClass(), "propListHead", null);
        setIntField(term1466, term1466.getClass(), "sourcePosition", 0);
        setField(term1466, term1466.getClass(), "jsType", null);
        setField(term1466, term1466.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1466;
        try {
            callMethod(klass, "getAssignedValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


