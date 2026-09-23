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

public class NodeUtil_isHoistedFunctionDeclaration_1630852851242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2405;
     Object term15807;

    public NodeUtil_isHoistedFunctionDeclaration_1630852851242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2418 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2428 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2405, term2405.getClass(), "type", 1558810715);
        setIntField(term2407, term2407.getClass(), "type", 802673242);
        setIntField(term2409, term2409.getClass(), "type", 0);
        setField(term2409, term2409.getClass(), "next", null);
        setField(term2409, term2409.getClass(), "first", null);
        setField(term2409, term2409.getClass(), "last", null);
        setField(term2409, term2409.getClass(), "propListHead", null);
        setIntField(term2409, term2409.getClass(), "sourcePosition", 0);
        setField(term2409, term2409.getClass(), "jsType", null);
        setField(term2409, term2409.getClass(), "parent", null);
        setField(term2407, term2407.getClass(), "next", term2409);
        setIntField(term2412, term2412.getClass(), "type", 0);
        setField(term2412, term2412.getClass(), "next", null);
        setField(term2412, term2412.getClass(), "first", null);
        setField(term2412, term2412.getClass(), "last", null);
        setField(term2412, term2412.getClass(), "propListHead", null);
        setIntField(term2412, term2412.getClass(), "sourcePosition", 0);
        setField(term2412, term2412.getClass(), "jsType", null);
        setField(term2412, term2412.getClass(), "parent", null);
        setField(term2407, term2407.getClass(), "first", term2412);
        setIntField(term2415, term2415.getClass(), "type", 0);
        setField(term2415, term2415.getClass(), "next", null);
        setField(term2415, term2415.getClass(), "first", null);
        setField(term2415, term2415.getClass(), "last", null);
        setField(term2415, term2415.getClass(), "propListHead", null);
        setIntField(term2415, term2415.getClass(), "sourcePosition", 0);
        setField(term2415, term2415.getClass(), "jsType", null);
        setField(term2415, term2415.getClass(), "parent", null);
        setField(term2407, term2407.getClass(), "last", term2415);
        setField(term2418, term2418.getClass(), "next", null);
        setIntField(term2418, term2418.getClass(), "type", 0);
        setIntField(term2418, term2418.getClass(), "intValue", 0);
        setField(term2418, term2418.getClass(), "objectValue", null);
        setField(term2407, term2407.getClass(), "propListHead", term2418);
        setIntField(term2407, term2407.getClass(), "sourcePosition", 2052244839);
        setField(term2407, term2407.getClass(), "jsType", null);
        setField(term2407, term2407.getClass(), "parent", null);
        setField(term2405, term2405.getClass(), "next", term2407);
        setIntField(term2422, term2422.getClass(), "type", 0);
        setField(term2422, term2422.getClass(), "next", null);
        setField(term2422, term2422.getClass(), "first", null);
        setField(term2422, term2422.getClass(), "last", null);
        setField(term2422, term2422.getClass(), "propListHead", null);
        setIntField(term2422, term2422.getClass(), "sourcePosition", 0);
        setField(term2422, term2422.getClass(), "jsType", null);
        setField(term2422, term2422.getClass(), "parent", null);
        setField(term2405, term2405.getClass(), "first", term2422);
        setIntField(term2425, term2425.getClass(), "type", 0);
        setField(term2425, term2425.getClass(), "next", null);
        setField(term2425, term2425.getClass(), "first", null);
        setField(term2425, term2425.getClass(), "last", null);
        setField(term2425, term2425.getClass(), "propListHead", null);
        setIntField(term2425, term2425.getClass(), "sourcePosition", 0);
        setField(term2425, term2425.getClass(), "jsType", null);
        setField(term2425, term2425.getClass(), "parent", null);
        setField(term2405, term2405.getClass(), "last", term2425);
        setField(term2428, term2428.getClass(), "next", null);
        setIntField(term2428, term2428.getClass(), "type", 0);
        setIntField(term2428, term2428.getClass(), "intValue", 0);
        setField(term2428, term2428.getClass(), "objectValue", null);
        setField(term2405, term2405.getClass(), "propListHead", term2428);
        setIntField(term2405, term2405.getClass(), "sourcePosition", -1763480506);
        setField(term2405, term2405.getClass(), "jsType", null);
        setField(term2405, term2405.getClass(), "parent", null);
        term15807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15812 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15815 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15807, term15807.getClass(), "type", 1558810715);
        setIntField(term15808, term15808.getClass(), "type", 802673242);
        setIntField(term15809, term15809.getClass(), "type", 0);
        setField(term15809, term15809.getClass(), "next", null);
        setField(term15809, term15809.getClass(), "first", null);
        setField(term15809, term15809.getClass(), "last", null);
        setField(term15809, term15809.getClass(), "propListHead", null);
        setIntField(term15809, term15809.getClass(), "sourcePosition", 0);
        setField(term15809, term15809.getClass(), "jsType", null);
        setField(term15809, term15809.getClass(), "parent", null);
        setField(term15808, term15808.getClass(), "next", term15809);
        setIntField(term15810, term15810.getClass(), "type", 0);
        setField(term15810, term15810.getClass(), "next", null);
        setField(term15810, term15810.getClass(), "first", null);
        setField(term15810, term15810.getClass(), "last", null);
        setField(term15810, term15810.getClass(), "propListHead", null);
        setIntField(term15810, term15810.getClass(), "sourcePosition", 0);
        setField(term15810, term15810.getClass(), "jsType", null);
        setField(term15810, term15810.getClass(), "parent", null);
        setField(term15808, term15808.getClass(), "first", term15810);
        setIntField(term15811, term15811.getClass(), "type", 0);
        setField(term15811, term15811.getClass(), "next", null);
        setField(term15811, term15811.getClass(), "first", null);
        setField(term15811, term15811.getClass(), "last", null);
        setField(term15811, term15811.getClass(), "propListHead", null);
        setIntField(term15811, term15811.getClass(), "sourcePosition", 0);
        setField(term15811, term15811.getClass(), "jsType", null);
        setField(term15811, term15811.getClass(), "parent", null);
        setField(term15808, term15808.getClass(), "last", term15811);
        setField(term15812, term15812.getClass(), "next", null);
        setIntField(term15812, term15812.getClass(), "type", 0);
        setIntField(term15812, term15812.getClass(), "intValue", 0);
        setField(term15812, term15812.getClass(), "objectValue", null);
        setField(term15808, term15808.getClass(), "propListHead", term15812);
        setIntField(term15808, term15808.getClass(), "sourcePosition", 2052244839);
        setField(term15808, term15808.getClass(), "jsType", null);
        setField(term15808, term15808.getClass(), "parent", null);
        setField(term15807, term15807.getClass(), "next", term15808);
        setIntField(term15813, term15813.getClass(), "type", 0);
        setField(term15813, term15813.getClass(), "next", null);
        setField(term15813, term15813.getClass(), "first", null);
        setField(term15813, term15813.getClass(), "last", null);
        setField(term15813, term15813.getClass(), "propListHead", null);
        setIntField(term15813, term15813.getClass(), "sourcePosition", 0);
        setField(term15813, term15813.getClass(), "jsType", null);
        setField(term15813, term15813.getClass(), "parent", null);
        setField(term15807, term15807.getClass(), "first", term15813);
        setIntField(term15814, term15814.getClass(), "type", 0);
        setField(term15814, term15814.getClass(), "next", null);
        setField(term15814, term15814.getClass(), "first", null);
        setField(term15814, term15814.getClass(), "last", null);
        setField(term15814, term15814.getClass(), "propListHead", null);
        setIntField(term15814, term15814.getClass(), "sourcePosition", 0);
        setField(term15814, term15814.getClass(), "jsType", null);
        setField(term15814, term15814.getClass(), "parent", null);
        setField(term15807, term15807.getClass(), "last", term15814);
        setField(term15815, term15815.getClass(), "next", null);
        setIntField(term15815, term15815.getClass(), "type", 0);
        setIntField(term15815, term15815.getClass(), "intValue", 0);
        setField(term15815, term15815.getClass(), "objectValue", null);
        setField(term15807, term15807.getClass(), "propListHead", term15815);
        setIntField(term15807, term15807.getClass(), "sourcePosition", -1763480506);
        setField(term15807, term15807.getClass(), "jsType", null);
        setField(term15807, term15807.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2405;
        Object retValue = callMethod(klass, "isHoistedFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term2405, term15807));
        assertTrue(recursiveEquals(retValue, false));
    }

};


