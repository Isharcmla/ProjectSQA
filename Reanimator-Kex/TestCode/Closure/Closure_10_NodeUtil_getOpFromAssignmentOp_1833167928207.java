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

public class NodeUtil_getOpFromAssignmentOp_1833167928207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1275;

    public NodeUtil_getOpFromAssignmentOp_1833167928207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1275, term1275.getClass(), "type", 464181937);
        setIntField(term1277, term1277.getClass(), "type", -1455526612);
        setIntField(term1279, term1279.getClass(), "type", -941356098);
        setIntField(term1281, term1281.getClass(), "type", -201517446);
        setIntField(term1283, term1283.getClass(), "type", -97742366);
        setField(term1283, term1283.getClass(), "next", null);
        setField(term1283, term1283.getClass(), "first", null);
        setField(term1283, term1283.getClass(), "last", null);
        setField(term1283, term1283.getClass(), "propListHead", null);
        setIntField(term1283, term1283.getClass(), "sourcePosition", 0);
        setField(term1283, term1283.getClass(), "jsType", null);
        setField(term1283, term1283.getClass(), "parent", null);
        setField(term1281, term1281.getClass(), "next", term1283);
        setIntField(term1286, term1286.getClass(), "type", 1638851942);
        setField(term1286, term1286.getClass(), "next", null);
        setField(term1286, term1286.getClass(), "first", null);
        setField(term1286, term1286.getClass(), "last", term1283);
        setField(term1286, term1286.getClass(), "propListHead", null);
        setIntField(term1286, term1286.getClass(), "sourcePosition", 0);
        setField(term1286, term1286.getClass(), "jsType", null);
        setField(term1286, term1286.getClass(), "parent", null);
        setField(term1281, term1281.getClass(), "first", term1286);
        setField(term1281, term1281.getClass(), "last", term1279);
        setField(term1281, term1281.getClass(), "propListHead", null);
        setIntField(term1281, term1281.getClass(), "sourcePosition", 0);
        setField(term1281, term1281.getClass(), "jsType", null);
        setField(term1281, term1281.getClass(), "parent", null);
        setField(term1279, term1279.getClass(), "next", term1281);
        setField(term1279, term1279.getClass(), "first", term1283);
        setIntField(term1290, term1290.getClass(), "type", 1160010161);
        setIntField(term1292, term1292.getClass(), "type", -423900705);
        setField(term1292, term1292.getClass(), "next", null);
        setField(term1292, term1292.getClass(), "first", term1286);
        setField(term1292, term1292.getClass(), "last", term1281);
        setField(term1292, term1292.getClass(), "propListHead", null);
        setIntField(term1292, term1292.getClass(), "sourcePosition", 0);
        setField(term1292, term1292.getClass(), "jsType", null);
        setField(term1292, term1292.getClass(), "parent", null);
        setField(term1290, term1290.getClass(), "next", term1292);
        setField(term1290, term1290.getClass(), "first", term1277);
        setField(term1290, term1290.getClass(), "last", term1277);
        setField(term1290, term1290.getClass(), "propListHead", null);
        setIntField(term1290, term1290.getClass(), "sourcePosition", 0);
        setField(term1290, term1290.getClass(), "jsType", null);
        setField(term1290, term1290.getClass(), "parent", null);
        setField(term1279, term1279.getClass(), "last", term1290);
        setField(term1279, term1279.getClass(), "propListHead", null);
        setIntField(term1279, term1279.getClass(), "sourcePosition", 0);
        setField(term1279, term1279.getClass(), "jsType", null);
        setField(term1279, term1279.getClass(), "parent", null);
        setField(term1277, term1277.getClass(), "next", term1279);
        setIntField(term1297, term1297.getClass(), "type", -525570815);
        setField(term1297, term1297.getClass(), "next", term1290);
        setField(term1297, term1297.getClass(), "first", term1292);
        setField(term1297, term1297.getClass(), "last", term1275);
        setField(term1297, term1297.getClass(), "propListHead", null);
        setIntField(term1297, term1297.getClass(), "sourcePosition", 0);
        setField(term1297, term1297.getClass(), "jsType", null);
        setField(term1297, term1297.getClass(), "parent", null);
        setField(term1277, term1277.getClass(), "first", term1297);
        setField(term1277, term1277.getClass(), "last", term1297);
        setField(term1277, term1277.getClass(), "propListHead", null);
        setIntField(term1277, term1277.getClass(), "sourcePosition", 0);
        setField(term1277, term1277.getClass(), "jsType", null);
        setField(term1277, term1277.getClass(), "parent", null);
        setField(term1275, term1275.getClass(), "next", term1277);
        setField(term1275, term1275.getClass(), "first", term1281);
        setField(term1275, term1275.getClass(), "last", term1283);
        setField(term1275, term1275.getClass(), "propListHead", null);
        setIntField(term1275, term1275.getClass(), "sourcePosition", 0);
        setField(term1275, term1275.getClass(), "jsType", null);
        setField(term1275, term1275.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1275;
        try {
            callMethod(klass, "getOpFromAssignmentOp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


