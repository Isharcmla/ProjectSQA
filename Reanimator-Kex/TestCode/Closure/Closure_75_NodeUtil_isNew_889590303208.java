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
     Object term11999;

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
        term11999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12004 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12007 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11999, term11999.getClass(), "type", 1801052257);
        setIntField(term12000, term12000.getClass(), "type", -1674430871);
        setIntField(term12001, term12001.getClass(), "type", 0);
        setField(term12001, term12001.getClass(), "next", null);
        setField(term12001, term12001.getClass(), "first", null);
        setField(term12001, term12001.getClass(), "last", null);
        setField(term12001, term12001.getClass(), "propListHead", null);
        setIntField(term12001, term12001.getClass(), "sourcePosition", 0);
        setField(term12001, term12001.getClass(), "jsType", null);
        setField(term12001, term12001.getClass(), "parent", null);
        setField(term12000, term12000.getClass(), "next", term12001);
        setIntField(term12002, term12002.getClass(), "type", 0);
        setField(term12002, term12002.getClass(), "next", null);
        setField(term12002, term12002.getClass(), "first", null);
        setField(term12002, term12002.getClass(), "last", null);
        setField(term12002, term12002.getClass(), "propListHead", null);
        setIntField(term12002, term12002.getClass(), "sourcePosition", 0);
        setField(term12002, term12002.getClass(), "jsType", null);
        setField(term12002, term12002.getClass(), "parent", null);
        setField(term12000, term12000.getClass(), "first", term12002);
        setIntField(term12003, term12003.getClass(), "type", 0);
        setField(term12003, term12003.getClass(), "next", null);
        setField(term12003, term12003.getClass(), "first", null);
        setField(term12003, term12003.getClass(), "last", null);
        setField(term12003, term12003.getClass(), "propListHead", null);
        setIntField(term12003, term12003.getClass(), "sourcePosition", 0);
        setField(term12003, term12003.getClass(), "jsType", null);
        setField(term12003, term12003.getClass(), "parent", null);
        setField(term12000, term12000.getClass(), "last", term12003);
        setField(term12004, term12004.getClass(), "next", null);
        setIntField(term12004, term12004.getClass(), "type", 0);
        setIntField(term12004, term12004.getClass(), "intValue", 0);
        setField(term12004, term12004.getClass(), "objectValue", null);
        setField(term12000, term12000.getClass(), "propListHead", term12004);
        setIntField(term12000, term12000.getClass(), "sourcePosition", 299791142);
        setField(term12000, term12000.getClass(), "jsType", null);
        setField(term12000, term12000.getClass(), "parent", null);
        setField(term11999, term11999.getClass(), "next", term12000);
        setIntField(term12005, term12005.getClass(), "type", 0);
        setField(term12005, term12005.getClass(), "next", null);
        setField(term12005, term12005.getClass(), "first", null);
        setField(term12005, term12005.getClass(), "last", null);
        setField(term12005, term12005.getClass(), "propListHead", null);
        setIntField(term12005, term12005.getClass(), "sourcePosition", 0);
        setField(term12005, term12005.getClass(), "jsType", null);
        setField(term12005, term12005.getClass(), "parent", null);
        setField(term11999, term11999.getClass(), "first", term12005);
        setIntField(term12006, term12006.getClass(), "type", 0);
        setField(term12006, term12006.getClass(), "next", null);
        setField(term12006, term12006.getClass(), "first", null);
        setField(term12006, term12006.getClass(), "last", null);
        setField(term12006, term12006.getClass(), "propListHead", null);
        setIntField(term12006, term12006.getClass(), "sourcePosition", 0);
        setField(term12006, term12006.getClass(), "jsType", null);
        setField(term12006, term12006.getClass(), "parent", null);
        setField(term11999, term11999.getClass(), "last", term12006);
        setField(term12007, term12007.getClass(), "next", null);
        setIntField(term12007, term12007.getClass(), "type", 0);
        setIntField(term12007, term12007.getClass(), "intValue", 0);
        setField(term12007, term12007.getClass(), "objectValue", null);
        setField(term11999, term11999.getClass(), "propListHead", term12007);
        setIntField(term11999, term11999.getClass(), "sourcePosition", 1862191391);
        setField(term11999, term11999.getClass(), "jsType", null);
        setField(term11999, term11999.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1406;
        Object retValue = callMethod(klass, "isNew", argTypes, null, args);
        assertTrue(recursiveEquals(term1406, term11999));
        assertTrue(recursiveEquals(retValue, false));
    }

};


