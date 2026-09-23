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

public class NodeUtil_getStringValue_242131640107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term3558;

    public NodeUtil_getStringValue_242131640107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term28, term28.getClass(), "type", 597278769);
        setIntField(term30, term30.getClass(), "type", 1048535127);
        setIntField(term32, term32.getClass(), "type", 0);
        setField(term32, term32.getClass(), "next", null);
        setField(term32, term32.getClass(), "first", null);
        setField(term32, term32.getClass(), "last", null);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term30, term30.getClass(), "next", term32);
        setIntField(term35, term35.getClass(), "type", 0);
        setField(term35, term35.getClass(), "next", null);
        setField(term35, term35.getClass(), "first", null);
        setField(term35, term35.getClass(), "last", null);
        setField(term35, term35.getClass(), "propListHead", null);
        setIntField(term35, term35.getClass(), "sourcePosition", 0);
        setField(term35, term35.getClass(), "jsType", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term30, term30.getClass(), "first", term35);
        setIntField(term38, term38.getClass(), "type", 0);
        setField(term38, term38.getClass(), "next", null);
        setField(term38, term38.getClass(), "first", null);
        setField(term38, term38.getClass(), "last", null);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term30, term30.getClass(), "last", term38);
        setField(term41, term41.getClass(), "next", null);
        setIntField(term41, term41.getClass(), "type", 0);
        setIntField(term41, term41.getClass(), "intValue", 0);
        setField(term41, term41.getClass(), "objectValue", null);
        setField(term30, term30.getClass(), "propListHead", term41);
        setIntField(term30, term30.getClass(), "sourcePosition", -2068769794);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term28, term28.getClass(), "next", term30);
        setIntField(term45, term45.getClass(), "type", 0);
        setField(term45, term45.getClass(), "next", null);
        setField(term45, term45.getClass(), "first", null);
        setField(term45, term45.getClass(), "last", null);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term28, term28.getClass(), "first", term45);
        setIntField(term48, term48.getClass(), "type", 0);
        setField(term48, term48.getClass(), "next", null);
        setField(term48, term48.getClass(), "first", null);
        setField(term48, term48.getClass(), "last", null);
        setField(term48, term48.getClass(), "propListHead", null);
        setIntField(term48, term48.getClass(), "sourcePosition", 0);
        setField(term48, term48.getClass(), "jsType", null);
        setField(term48, term48.getClass(), "parent", null);
        setField(term28, term28.getClass(), "last", term48);
        setField(term51, term51.getClass(), "next", null);
        setIntField(term51, term51.getClass(), "type", 0);
        setIntField(term51, term51.getClass(), "intValue", 0);
        setField(term51, term51.getClass(), "objectValue", null);
        setField(term28, term28.getClass(), "propListHead", term51);
        setIntField(term28, term28.getClass(), "sourcePosition", -117576464);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
        term3558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3563 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3566 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3558, term3558.getClass(), "type", 597278769);
        setIntField(term3559, term3559.getClass(), "type", 1048535127);
        setIntField(term3560, term3560.getClass(), "type", 0);
        setField(term3560, term3560.getClass(), "next", null);
        setField(term3560, term3560.getClass(), "first", null);
        setField(term3560, term3560.getClass(), "last", null);
        setField(term3560, term3560.getClass(), "propListHead", null);
        setIntField(term3560, term3560.getClass(), "sourcePosition", 0);
        setField(term3560, term3560.getClass(), "jsType", null);
        setField(term3560, term3560.getClass(), "parent", null);
        setField(term3559, term3559.getClass(), "next", term3560);
        setIntField(term3561, term3561.getClass(), "type", 0);
        setField(term3561, term3561.getClass(), "next", null);
        setField(term3561, term3561.getClass(), "first", null);
        setField(term3561, term3561.getClass(), "last", null);
        setField(term3561, term3561.getClass(), "propListHead", null);
        setIntField(term3561, term3561.getClass(), "sourcePosition", 0);
        setField(term3561, term3561.getClass(), "jsType", null);
        setField(term3561, term3561.getClass(), "parent", null);
        setField(term3559, term3559.getClass(), "first", term3561);
        setIntField(term3562, term3562.getClass(), "type", 0);
        setField(term3562, term3562.getClass(), "next", null);
        setField(term3562, term3562.getClass(), "first", null);
        setField(term3562, term3562.getClass(), "last", null);
        setField(term3562, term3562.getClass(), "propListHead", null);
        setIntField(term3562, term3562.getClass(), "sourcePosition", 0);
        setField(term3562, term3562.getClass(), "jsType", null);
        setField(term3562, term3562.getClass(), "parent", null);
        setField(term3559, term3559.getClass(), "last", term3562);
        setField(term3563, term3563.getClass(), "next", null);
        setIntField(term3563, term3563.getClass(), "type", 0);
        setIntField(term3563, term3563.getClass(), "intValue", 0);
        setField(term3563, term3563.getClass(), "objectValue", null);
        setField(term3559, term3559.getClass(), "propListHead", term3563);
        setIntField(term3559, term3559.getClass(), "sourcePosition", -2068769794);
        setField(term3559, term3559.getClass(), "jsType", null);
        setField(term3559, term3559.getClass(), "parent", null);
        setField(term3558, term3558.getClass(), "next", term3559);
        setIntField(term3564, term3564.getClass(), "type", 0);
        setField(term3564, term3564.getClass(), "next", null);
        setField(term3564, term3564.getClass(), "first", null);
        setField(term3564, term3564.getClass(), "last", null);
        setField(term3564, term3564.getClass(), "propListHead", null);
        setIntField(term3564, term3564.getClass(), "sourcePosition", 0);
        setField(term3564, term3564.getClass(), "jsType", null);
        setField(term3564, term3564.getClass(), "parent", null);
        setField(term3558, term3558.getClass(), "first", term3564);
        setIntField(term3565, term3565.getClass(), "type", 0);
        setField(term3565, term3565.getClass(), "next", null);
        setField(term3565, term3565.getClass(), "first", null);
        setField(term3565, term3565.getClass(), "last", null);
        setField(term3565, term3565.getClass(), "propListHead", null);
        setIntField(term3565, term3565.getClass(), "sourcePosition", 0);
        setField(term3565, term3565.getClass(), "jsType", null);
        setField(term3565, term3565.getClass(), "parent", null);
        setField(term3558, term3558.getClass(), "last", term3565);
        setField(term3566, term3566.getClass(), "next", null);
        setIntField(term3566, term3566.getClass(), "type", 0);
        setIntField(term3566, term3566.getClass(), "intValue", 0);
        setField(term3566, term3566.getClass(), "objectValue", null);
        setField(term3558, term3558.getClass(), "propListHead", term3566);
        setIntField(term3558, term3558.getClass(), "sourcePosition", -117576464);
        setField(term3558, term3558.getClass(), "jsType", null);
        setField(term3558, term3558.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28;
        Object retValue = callMethod(klass, "getStringValue", argTypes, null, args);
        assertTrue(recursiveEquals(term28, term3558));
        assertTrue(recursiveEquals(retValue, null));
    }

};


