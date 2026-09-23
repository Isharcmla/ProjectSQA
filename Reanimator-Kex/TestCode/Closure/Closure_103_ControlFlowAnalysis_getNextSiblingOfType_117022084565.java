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

public class ControlFlowAnalysis_getNextSiblingOfType_117022084565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2877;
     Object term2904;
     Object term21124;
     Object term21133;

    public ControlFlowAnalysis_getNextSiblingOfType_117022084565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2890 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2900 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2877, term2877.getClass(), "type", -1085899912);
        setIntField(term2879, term2879.getClass(), "type", -1452324619);
        setIntField(term2881, term2881.getClass(), "type", 0);
        setField(term2881, term2881.getClass(), "next", null);
        setField(term2881, term2881.getClass(), "first", null);
        setField(term2881, term2881.getClass(), "last", null);
        setField(term2881, term2881.getClass(), "propListHead", null);
        setIntField(term2881, term2881.getClass(), "sourcePosition", 0);
        setField(term2881, term2881.getClass(), "jsType", null);
        setField(term2881, term2881.getClass(), "parent", null);
        setField(term2879, term2879.getClass(), "next", term2881);
        setIntField(term2884, term2884.getClass(), "type", 0);
        setField(term2884, term2884.getClass(), "next", null);
        setField(term2884, term2884.getClass(), "first", null);
        setField(term2884, term2884.getClass(), "last", null);
        setField(term2884, term2884.getClass(), "propListHead", null);
        setIntField(term2884, term2884.getClass(), "sourcePosition", 0);
        setField(term2884, term2884.getClass(), "jsType", null);
        setField(term2884, term2884.getClass(), "parent", null);
        setField(term2879, term2879.getClass(), "first", term2884);
        setIntField(term2887, term2887.getClass(), "type", 0);
        setField(term2887, term2887.getClass(), "next", null);
        setField(term2887, term2887.getClass(), "first", null);
        setField(term2887, term2887.getClass(), "last", null);
        setField(term2887, term2887.getClass(), "propListHead", null);
        setIntField(term2887, term2887.getClass(), "sourcePosition", 0);
        setField(term2887, term2887.getClass(), "jsType", null);
        setField(term2887, term2887.getClass(), "parent", null);
        setField(term2879, term2879.getClass(), "last", term2887);
        setField(term2890, term2890.getClass(), "next", null);
        setIntField(term2890, term2890.getClass(), "type", 0);
        setIntField(term2890, term2890.getClass(), "intValue", 0);
        setField(term2890, term2890.getClass(), "objectValue", null);
        setField(term2879, term2879.getClass(), "propListHead", term2890);
        setIntField(term2879, term2879.getClass(), "sourcePosition", 666218293);
        setField(term2879, term2879.getClass(), "jsType", null);
        setField(term2879, term2879.getClass(), "parent", null);
        setField(term2877, term2877.getClass(), "next", term2879);
        setIntField(term2894, term2894.getClass(), "type", 0);
        setField(term2894, term2894.getClass(), "next", null);
        setField(term2894, term2894.getClass(), "first", null);
        setField(term2894, term2894.getClass(), "last", null);
        setField(term2894, term2894.getClass(), "propListHead", null);
        setIntField(term2894, term2894.getClass(), "sourcePosition", 0);
        setField(term2894, term2894.getClass(), "jsType", null);
        setField(term2894, term2894.getClass(), "parent", null);
        setField(term2877, term2877.getClass(), "first", term2894);
        setIntField(term2897, term2897.getClass(), "type", 0);
        setField(term2897, term2897.getClass(), "next", null);
        setField(term2897, term2897.getClass(), "first", null);
        setField(term2897, term2897.getClass(), "last", null);
        setField(term2897, term2897.getClass(), "propListHead", null);
        setIntField(term2897, term2897.getClass(), "sourcePosition", 0);
        setField(term2897, term2897.getClass(), "jsType", null);
        setField(term2897, term2897.getClass(), "parent", null);
        setField(term2877, term2877.getClass(), "last", term2897);
        setField(term2900, term2900.getClass(), "next", null);
        setIntField(term2900, term2900.getClass(), "type", 0);
        setIntField(term2900, term2900.getClass(), "intValue", 0);
        setField(term2900, term2900.getClass(), "objectValue", null);
        setField(term2877, term2877.getClass(), "propListHead", term2900);
        setIntField(term2877, term2877.getClass(), "sourcePosition", 1737876343);
        setField(term2877, term2877.getClass(), "jsType", null);
        setField(term2877, term2877.getClass(), "parent", null);
        term2904 = (int[]) newIntArray(0);
        term21124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21129 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21132 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term21124, term21124.getClass(), "type", -1085899912);
        setIntField(term21125, term21125.getClass(), "type", -1452324619);
        setIntField(term21126, term21126.getClass(), "type", 0);
        setField(term21126, term21126.getClass(), "next", null);
        setField(term21126, term21126.getClass(), "first", null);
        setField(term21126, term21126.getClass(), "last", null);
        setField(term21126, term21126.getClass(), "propListHead", null);
        setIntField(term21126, term21126.getClass(), "sourcePosition", 0);
        setField(term21126, term21126.getClass(), "jsType", null);
        setField(term21126, term21126.getClass(), "parent", null);
        setField(term21125, term21125.getClass(), "next", term21126);
        setIntField(term21127, term21127.getClass(), "type", 0);
        setField(term21127, term21127.getClass(), "next", null);
        setField(term21127, term21127.getClass(), "first", null);
        setField(term21127, term21127.getClass(), "last", null);
        setField(term21127, term21127.getClass(), "propListHead", null);
        setIntField(term21127, term21127.getClass(), "sourcePosition", 0);
        setField(term21127, term21127.getClass(), "jsType", null);
        setField(term21127, term21127.getClass(), "parent", null);
        setField(term21125, term21125.getClass(), "first", term21127);
        setIntField(term21128, term21128.getClass(), "type", 0);
        setField(term21128, term21128.getClass(), "next", null);
        setField(term21128, term21128.getClass(), "first", null);
        setField(term21128, term21128.getClass(), "last", null);
        setField(term21128, term21128.getClass(), "propListHead", null);
        setIntField(term21128, term21128.getClass(), "sourcePosition", 0);
        setField(term21128, term21128.getClass(), "jsType", null);
        setField(term21128, term21128.getClass(), "parent", null);
        setField(term21125, term21125.getClass(), "last", term21128);
        setField(term21129, term21129.getClass(), "next", null);
        setIntField(term21129, term21129.getClass(), "type", 0);
        setIntField(term21129, term21129.getClass(), "intValue", 0);
        setField(term21129, term21129.getClass(), "objectValue", null);
        setField(term21125, term21125.getClass(), "propListHead", term21129);
        setIntField(term21125, term21125.getClass(), "sourcePosition", 666218293);
        setField(term21125, term21125.getClass(), "jsType", null);
        setField(term21125, term21125.getClass(), "parent", null);
        setField(term21124, term21124.getClass(), "next", term21125);
        setIntField(term21130, term21130.getClass(), "type", 0);
        setField(term21130, term21130.getClass(), "next", null);
        setField(term21130, term21130.getClass(), "first", null);
        setField(term21130, term21130.getClass(), "last", null);
        setField(term21130, term21130.getClass(), "propListHead", null);
        setIntField(term21130, term21130.getClass(), "sourcePosition", 0);
        setField(term21130, term21130.getClass(), "jsType", null);
        setField(term21130, term21130.getClass(), "parent", null);
        setField(term21124, term21124.getClass(), "first", term21130);
        setIntField(term21131, term21131.getClass(), "type", 0);
        setField(term21131, term21131.getClass(), "next", null);
        setField(term21131, term21131.getClass(), "first", null);
        setField(term21131, term21131.getClass(), "last", null);
        setField(term21131, term21131.getClass(), "propListHead", null);
        setIntField(term21131, term21131.getClass(), "sourcePosition", 0);
        setField(term21131, term21131.getClass(), "jsType", null);
        setField(term21131, term21131.getClass(), "parent", null);
        setField(term21124, term21124.getClass(), "last", term21131);
        setField(term21132, term21132.getClass(), "next", null);
        setIntField(term21132, term21132.getClass(), "type", 0);
        setIntField(term21132, term21132.getClass(), "intValue", 0);
        setField(term21132, term21132.getClass(), "objectValue", null);
        setField(term21124, term21124.getClass(), "propListHead", term21132);
        setIntField(term21124, term21124.getClass(), "sourcePosition", 1737876343);
        setField(term21124, term21124.getClass(), "jsType", null);
        setField(term21124, term21124.getClass(), "parent", null);
        term21133 = (int[]) newIntArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2877;
        args[1] = term2904;
        Object retValue = callMethod(klass, "getNextSiblingOfType", argTypes, null, args);
        assertTrue(recursiveEquals(term2877, term21124));
        assertTrue(recursiveEquals(term2904, term21133));
        assertTrue(recursiveEquals(retValue, null));
    }

};


