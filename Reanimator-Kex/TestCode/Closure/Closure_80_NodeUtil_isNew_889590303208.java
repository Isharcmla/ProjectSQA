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

public class NodeUtil_isNew_889590303208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1406;
     Object term11705;

    public NodeUtil_isNew_889590303208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1419 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1429 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1406, term1406.getClass(), "type", 1801052257);
        setIntField(term1408, term1408.getClass(), "type", -1674430871);
        setIntField(term1410, term1410.getClass(), "type", 0);
        setField(term1410, term1410.getClass(), "next", null);
        setField(term1410, term1410.getClass(), "first", null);
        setField(term1410, term1410.getClass(), "last", null);
        setField(term1410, term1410.getClass(), "propListHead", null);
        setIntField(term1410, term1410.getClass(), "sourcePosition", 0);
        setField(term1410, term1410.getClass(), "jsType", null);
        setField(term1410, term1410.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "next", term1410);
        setIntField(term1413, term1413.getClass(), "type", 0);
        setField(term1413, term1413.getClass(), "next", null);
        setField(term1413, term1413.getClass(), "first", null);
        setField(term1413, term1413.getClass(), "last", null);
        setField(term1413, term1413.getClass(), "propListHead", null);
        setIntField(term1413, term1413.getClass(), "sourcePosition", 0);
        setField(term1413, term1413.getClass(), "jsType", null);
        setField(term1413, term1413.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "first", term1413);
        setIntField(term1416, term1416.getClass(), "type", 0);
        setField(term1416, term1416.getClass(), "next", null);
        setField(term1416, term1416.getClass(), "first", null);
        setField(term1416, term1416.getClass(), "last", null);
        setField(term1416, term1416.getClass(), "propListHead", null);
        setIntField(term1416, term1416.getClass(), "sourcePosition", 0);
        setField(term1416, term1416.getClass(), "jsType", null);
        setField(term1416, term1416.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "last", term1416);
        setField(term1419, term1419.getClass(), "next", null);
        setIntField(term1419, term1419.getClass(), "type", 0);
        setIntField(term1419, term1419.getClass(), "intValue", 0);
        setField(term1419, term1419.getClass(), "objectValue", null);
        setField(term1408, term1408.getClass(), "propListHead", term1419);
        setIntField(term1408, term1408.getClass(), "sourcePosition", 299791142);
        setField(term1408, term1408.getClass(), "jsType", null);
        setField(term1408, term1408.getClass(), "parent", null);
        setField(term1406, term1406.getClass(), "next", term1408);
        setIntField(term1423, term1423.getClass(), "type", 0);
        setField(term1423, term1423.getClass(), "next", null);
        setField(term1423, term1423.getClass(), "first", null);
        setField(term1423, term1423.getClass(), "last", null);
        setField(term1423, term1423.getClass(), "propListHead", null);
        setIntField(term1423, term1423.getClass(), "sourcePosition", 0);
        setField(term1423, term1423.getClass(), "jsType", null);
        setField(term1423, term1423.getClass(), "parent", null);
        setField(term1406, term1406.getClass(), "first", term1423);
        setIntField(term1426, term1426.getClass(), "type", 0);
        setField(term1426, term1426.getClass(), "next", null);
        setField(term1426, term1426.getClass(), "first", null);
        setField(term1426, term1426.getClass(), "last", null);
        setField(term1426, term1426.getClass(), "propListHead", null);
        setIntField(term1426, term1426.getClass(), "sourcePosition", 0);
        setField(term1426, term1426.getClass(), "jsType", null);
        setField(term1426, term1426.getClass(), "parent", null);
        setField(term1406, term1406.getClass(), "last", term1426);
        setField(term1429, term1429.getClass(), "next", null);
        setIntField(term1429, term1429.getClass(), "type", 0);
        setIntField(term1429, term1429.getClass(), "intValue", 0);
        setField(term1429, term1429.getClass(), "objectValue", null);
        setField(term1406, term1406.getClass(), "propListHead", term1429);
        setIntField(term1406, term1406.getClass(), "sourcePosition", 1862191391);
        setField(term1406, term1406.getClass(), "jsType", null);
        setField(term1406, term1406.getClass(), "parent", null);
        term11705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11710 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11713 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11705, term11705.getClass(), "type", 1801052257);
        setIntField(term11706, term11706.getClass(), "type", -1674430871);
        setIntField(term11707, term11707.getClass(), "type", 0);
        setField(term11707, term11707.getClass(), "next", null);
        setField(term11707, term11707.getClass(), "first", null);
        setField(term11707, term11707.getClass(), "last", null);
        setField(term11707, term11707.getClass(), "propListHead", null);
        setIntField(term11707, term11707.getClass(), "sourcePosition", 0);
        setField(term11707, term11707.getClass(), "jsType", null);
        setField(term11707, term11707.getClass(), "parent", null);
        setField(term11706, term11706.getClass(), "next", term11707);
        setIntField(term11708, term11708.getClass(), "type", 0);
        setField(term11708, term11708.getClass(), "next", null);
        setField(term11708, term11708.getClass(), "first", null);
        setField(term11708, term11708.getClass(), "last", null);
        setField(term11708, term11708.getClass(), "propListHead", null);
        setIntField(term11708, term11708.getClass(), "sourcePosition", 0);
        setField(term11708, term11708.getClass(), "jsType", null);
        setField(term11708, term11708.getClass(), "parent", null);
        setField(term11706, term11706.getClass(), "first", term11708);
        setIntField(term11709, term11709.getClass(), "type", 0);
        setField(term11709, term11709.getClass(), "next", null);
        setField(term11709, term11709.getClass(), "first", null);
        setField(term11709, term11709.getClass(), "last", null);
        setField(term11709, term11709.getClass(), "propListHead", null);
        setIntField(term11709, term11709.getClass(), "sourcePosition", 0);
        setField(term11709, term11709.getClass(), "jsType", null);
        setField(term11709, term11709.getClass(), "parent", null);
        setField(term11706, term11706.getClass(), "last", term11709);
        setField(term11710, term11710.getClass(), "next", null);
        setIntField(term11710, term11710.getClass(), "type", 0);
        setIntField(term11710, term11710.getClass(), "intValue", 0);
        setField(term11710, term11710.getClass(), "objectValue", null);
        setField(term11706, term11706.getClass(), "propListHead", term11710);
        setIntField(term11706, term11706.getClass(), "sourcePosition", 299791142);
        setField(term11706, term11706.getClass(), "jsType", null);
        setField(term11706, term11706.getClass(), "parent", null);
        setField(term11705, term11705.getClass(), "next", term11706);
        setIntField(term11711, term11711.getClass(), "type", 0);
        setField(term11711, term11711.getClass(), "next", null);
        setField(term11711, term11711.getClass(), "first", null);
        setField(term11711, term11711.getClass(), "last", null);
        setField(term11711, term11711.getClass(), "propListHead", null);
        setIntField(term11711, term11711.getClass(), "sourcePosition", 0);
        setField(term11711, term11711.getClass(), "jsType", null);
        setField(term11711, term11711.getClass(), "parent", null);
        setField(term11705, term11705.getClass(), "first", term11711);
        setIntField(term11712, term11712.getClass(), "type", 0);
        setField(term11712, term11712.getClass(), "next", null);
        setField(term11712, term11712.getClass(), "first", null);
        setField(term11712, term11712.getClass(), "last", null);
        setField(term11712, term11712.getClass(), "propListHead", null);
        setIntField(term11712, term11712.getClass(), "sourcePosition", 0);
        setField(term11712, term11712.getClass(), "jsType", null);
        setField(term11712, term11712.getClass(), "parent", null);
        setField(term11705, term11705.getClass(), "last", term11712);
        setField(term11713, term11713.getClass(), "next", null);
        setIntField(term11713, term11713.getClass(), "type", 0);
        setIntField(term11713, term11713.getClass(), "intValue", 0);
        setField(term11713, term11713.getClass(), "objectValue", null);
        setField(term11705, term11705.getClass(), "propListHead", term11713);
        setIntField(term11705, term11705.getClass(), "sourcePosition", 1862191391);
        setField(term11705, term11705.getClass(), "jsType", null);
        setField(term11705, term11705.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1406;
        Object retValue = callMethod(klass, "isNew", argTypes, null, args);
        assertTrue(recursiveEquals(term1406, term11705));
        assertTrue(recursiveEquals(retValue, false));
    }

};


