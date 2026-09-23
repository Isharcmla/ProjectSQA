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

public class NodeUtil_tryMergeBlock_1632890151153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1354;

    public NodeUtil_tryMergeBlock_1632890151153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1367 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1377 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1354, term1354.getClass(), "type", 2634669);
        setIntField(term1356, term1356.getClass(), "type", 313459791);
        setIntField(term1358, term1358.getClass(), "type", 0);
        setField(term1358, term1358.getClass(), "next", null);
        setField(term1358, term1358.getClass(), "first", null);
        setField(term1358, term1358.getClass(), "last", null);
        setField(term1358, term1358.getClass(), "propListHead", null);
        setIntField(term1358, term1358.getClass(), "sourcePosition", 0);
        setField(term1358, term1358.getClass(), "jsType", null);
        setField(term1358, term1358.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "next", term1358);
        setIntField(term1361, term1361.getClass(), "type", 0);
        setField(term1361, term1361.getClass(), "next", null);
        setField(term1361, term1361.getClass(), "first", null);
        setField(term1361, term1361.getClass(), "last", null);
        setField(term1361, term1361.getClass(), "propListHead", null);
        setIntField(term1361, term1361.getClass(), "sourcePosition", 0);
        setField(term1361, term1361.getClass(), "jsType", null);
        setField(term1361, term1361.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "first", term1361);
        setIntField(term1364, term1364.getClass(), "type", 0);
        setField(term1364, term1364.getClass(), "next", null);
        setField(term1364, term1364.getClass(), "first", null);
        setField(term1364, term1364.getClass(), "last", null);
        setField(term1364, term1364.getClass(), "propListHead", null);
        setIntField(term1364, term1364.getClass(), "sourcePosition", 0);
        setField(term1364, term1364.getClass(), "jsType", null);
        setField(term1364, term1364.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "last", term1364);
        setField(term1367, term1367.getClass(), "next", null);
        setIntField(term1367, term1367.getClass(), "type", 0);
        setIntField(term1367, term1367.getClass(), "intValue", 0);
        setField(term1367, term1367.getClass(), "objectValue", null);
        setField(term1356, term1356.getClass(), "propListHead", term1367);
        setIntField(term1356, term1356.getClass(), "sourcePosition", 794352120);
        setField(term1356, term1356.getClass(), "jsType", null);
        setField(term1356, term1356.getClass(), "parent", null);
        setField(term1354, term1354.getClass(), "next", term1356);
        setIntField(term1371, term1371.getClass(), "type", 0);
        setField(term1371, term1371.getClass(), "next", null);
        setField(term1371, term1371.getClass(), "first", null);
        setField(term1371, term1371.getClass(), "last", null);
        setField(term1371, term1371.getClass(), "propListHead", null);
        setIntField(term1371, term1371.getClass(), "sourcePosition", 0);
        setField(term1371, term1371.getClass(), "jsType", null);
        setField(term1371, term1371.getClass(), "parent", null);
        setField(term1354, term1354.getClass(), "first", term1371);
        setIntField(term1374, term1374.getClass(), "type", 0);
        setField(term1374, term1374.getClass(), "next", null);
        setField(term1374, term1374.getClass(), "first", null);
        setField(term1374, term1374.getClass(), "last", null);
        setField(term1374, term1374.getClass(), "propListHead", null);
        setIntField(term1374, term1374.getClass(), "sourcePosition", 0);
        setField(term1374, term1374.getClass(), "jsType", null);
        setField(term1374, term1374.getClass(), "parent", null);
        setField(term1354, term1354.getClass(), "last", term1374);
        setField(term1377, term1377.getClass(), "next", null);
        setIntField(term1377, term1377.getClass(), "type", 0);
        setIntField(term1377, term1377.getClass(), "intValue", 0);
        setField(term1377, term1377.getClass(), "objectValue", null);
        setField(term1354, term1354.getClass(), "propListHead", term1377);
        setIntField(term1354, term1354.getClass(), "sourcePosition", 340719678);
        setField(term1354, term1354.getClass(), "jsType", null);
        setField(term1354, term1354.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1354;
        try {
            callMethod(klass, "tryMergeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


