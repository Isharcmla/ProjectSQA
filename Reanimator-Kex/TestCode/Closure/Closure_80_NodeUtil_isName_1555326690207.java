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

public class NodeUtil_isName_1555326690207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1379;
     Object term11665;

    public NodeUtil_isName_1555326690207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1392 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1402 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1379, term1379.getClass(), "type", -355469363);
        setIntField(term1381, term1381.getClass(), "type", -1415256843);
        setIntField(term1383, term1383.getClass(), "type", 0);
        setField(term1383, term1383.getClass(), "next", null);
        setField(term1383, term1383.getClass(), "first", null);
        setField(term1383, term1383.getClass(), "last", null);
        setField(term1383, term1383.getClass(), "propListHead", null);
        setIntField(term1383, term1383.getClass(), "sourcePosition", 0);
        setField(term1383, term1383.getClass(), "jsType", null);
        setField(term1383, term1383.getClass(), "parent", null);
        setField(term1381, term1381.getClass(), "next", term1383);
        setIntField(term1386, term1386.getClass(), "type", 0);
        setField(term1386, term1386.getClass(), "next", null);
        setField(term1386, term1386.getClass(), "first", null);
        setField(term1386, term1386.getClass(), "last", null);
        setField(term1386, term1386.getClass(), "propListHead", null);
        setIntField(term1386, term1386.getClass(), "sourcePosition", 0);
        setField(term1386, term1386.getClass(), "jsType", null);
        setField(term1386, term1386.getClass(), "parent", null);
        setField(term1381, term1381.getClass(), "first", term1386);
        setIntField(term1389, term1389.getClass(), "type", 0);
        setField(term1389, term1389.getClass(), "next", null);
        setField(term1389, term1389.getClass(), "first", null);
        setField(term1389, term1389.getClass(), "last", null);
        setField(term1389, term1389.getClass(), "propListHead", null);
        setIntField(term1389, term1389.getClass(), "sourcePosition", 0);
        setField(term1389, term1389.getClass(), "jsType", null);
        setField(term1389, term1389.getClass(), "parent", null);
        setField(term1381, term1381.getClass(), "last", term1389);
        setField(term1392, term1392.getClass(), "next", null);
        setIntField(term1392, term1392.getClass(), "type", 0);
        setIntField(term1392, term1392.getClass(), "intValue", 0);
        setField(term1392, term1392.getClass(), "objectValue", null);
        setField(term1381, term1381.getClass(), "propListHead", term1392);
        setIntField(term1381, term1381.getClass(), "sourcePosition", 173952451);
        setField(term1381, term1381.getClass(), "jsType", null);
        setField(term1381, term1381.getClass(), "parent", null);
        setField(term1379, term1379.getClass(), "next", term1381);
        setIntField(term1396, term1396.getClass(), "type", 0);
        setField(term1396, term1396.getClass(), "next", null);
        setField(term1396, term1396.getClass(), "first", null);
        setField(term1396, term1396.getClass(), "last", null);
        setField(term1396, term1396.getClass(), "propListHead", null);
        setIntField(term1396, term1396.getClass(), "sourcePosition", 0);
        setField(term1396, term1396.getClass(), "jsType", null);
        setField(term1396, term1396.getClass(), "parent", null);
        setField(term1379, term1379.getClass(), "first", term1396);
        setIntField(term1399, term1399.getClass(), "type", 0);
        setField(term1399, term1399.getClass(), "next", null);
        setField(term1399, term1399.getClass(), "first", null);
        setField(term1399, term1399.getClass(), "last", null);
        setField(term1399, term1399.getClass(), "propListHead", null);
        setIntField(term1399, term1399.getClass(), "sourcePosition", 0);
        setField(term1399, term1399.getClass(), "jsType", null);
        setField(term1399, term1399.getClass(), "parent", null);
        setField(term1379, term1379.getClass(), "last", term1399);
        setField(term1402, term1402.getClass(), "next", null);
        setIntField(term1402, term1402.getClass(), "type", 0);
        setIntField(term1402, term1402.getClass(), "intValue", 0);
        setField(term1402, term1402.getClass(), "objectValue", null);
        setField(term1379, term1379.getClass(), "propListHead", term1402);
        setIntField(term1379, term1379.getClass(), "sourcePosition", -1972033388);
        setField(term1379, term1379.getClass(), "jsType", null);
        setField(term1379, term1379.getClass(), "parent", null);
        term11665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11670 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11673 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11665, term11665.getClass(), "type", -355469363);
        setIntField(term11666, term11666.getClass(), "type", -1415256843);
        setIntField(term11667, term11667.getClass(), "type", 0);
        setField(term11667, term11667.getClass(), "next", null);
        setField(term11667, term11667.getClass(), "first", null);
        setField(term11667, term11667.getClass(), "last", null);
        setField(term11667, term11667.getClass(), "propListHead", null);
        setIntField(term11667, term11667.getClass(), "sourcePosition", 0);
        setField(term11667, term11667.getClass(), "jsType", null);
        setField(term11667, term11667.getClass(), "parent", null);
        setField(term11666, term11666.getClass(), "next", term11667);
        setIntField(term11668, term11668.getClass(), "type", 0);
        setField(term11668, term11668.getClass(), "next", null);
        setField(term11668, term11668.getClass(), "first", null);
        setField(term11668, term11668.getClass(), "last", null);
        setField(term11668, term11668.getClass(), "propListHead", null);
        setIntField(term11668, term11668.getClass(), "sourcePosition", 0);
        setField(term11668, term11668.getClass(), "jsType", null);
        setField(term11668, term11668.getClass(), "parent", null);
        setField(term11666, term11666.getClass(), "first", term11668);
        setIntField(term11669, term11669.getClass(), "type", 0);
        setField(term11669, term11669.getClass(), "next", null);
        setField(term11669, term11669.getClass(), "first", null);
        setField(term11669, term11669.getClass(), "last", null);
        setField(term11669, term11669.getClass(), "propListHead", null);
        setIntField(term11669, term11669.getClass(), "sourcePosition", 0);
        setField(term11669, term11669.getClass(), "jsType", null);
        setField(term11669, term11669.getClass(), "parent", null);
        setField(term11666, term11666.getClass(), "last", term11669);
        setField(term11670, term11670.getClass(), "next", null);
        setIntField(term11670, term11670.getClass(), "type", 0);
        setIntField(term11670, term11670.getClass(), "intValue", 0);
        setField(term11670, term11670.getClass(), "objectValue", null);
        setField(term11666, term11666.getClass(), "propListHead", term11670);
        setIntField(term11666, term11666.getClass(), "sourcePosition", 173952451);
        setField(term11666, term11666.getClass(), "jsType", null);
        setField(term11666, term11666.getClass(), "parent", null);
        setField(term11665, term11665.getClass(), "next", term11666);
        setIntField(term11671, term11671.getClass(), "type", 0);
        setField(term11671, term11671.getClass(), "next", null);
        setField(term11671, term11671.getClass(), "first", null);
        setField(term11671, term11671.getClass(), "last", null);
        setField(term11671, term11671.getClass(), "propListHead", null);
        setIntField(term11671, term11671.getClass(), "sourcePosition", 0);
        setField(term11671, term11671.getClass(), "jsType", null);
        setField(term11671, term11671.getClass(), "parent", null);
        setField(term11665, term11665.getClass(), "first", term11671);
        setIntField(term11672, term11672.getClass(), "type", 0);
        setField(term11672, term11672.getClass(), "next", null);
        setField(term11672, term11672.getClass(), "first", null);
        setField(term11672, term11672.getClass(), "last", null);
        setField(term11672, term11672.getClass(), "propListHead", null);
        setIntField(term11672, term11672.getClass(), "sourcePosition", 0);
        setField(term11672, term11672.getClass(), "jsType", null);
        setField(term11672, term11672.getClass(), "parent", null);
        setField(term11665, term11665.getClass(), "last", term11672);
        setField(term11673, term11673.getClass(), "next", null);
        setIntField(term11673, term11673.getClass(), "type", 0);
        setIntField(term11673, term11673.getClass(), "intValue", 0);
        setField(term11673, term11673.getClass(), "objectValue", null);
        setField(term11665, term11665.getClass(), "propListHead", term11673);
        setIntField(term11665, term11665.getClass(), "sourcePosition", -1972033388);
        setField(term11665, term11665.getClass(), "jsType", null);
        setField(term11665, term11665.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1379;
        Object retValue = callMethod(klass, "isName", argTypes, null, args);
        assertTrue(recursiveEquals(term1379, term11665));
        assertTrue(recursiveEquals(retValue, false));
    }

};


