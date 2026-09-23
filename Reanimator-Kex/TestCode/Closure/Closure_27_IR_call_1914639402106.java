package com.google.javascript.rhino;

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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_call_1914639402106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1267;
     Object term1294;

    public IR_call_1914639402106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1267, term1267.getClass(), "type", 1887772522);
        setIntField(term1269, term1269.getClass(), "type", 354196060);
        setIntField(term1271, term1271.getClass(), "type", -1840305774);
        setIntField(term1273, term1273.getClass(), "type", 1365087144);
        setIntField(term1275, term1275.getClass(), "type", -1537255112);
        setField(term1275, term1275.getClass(), "next", null);
        setField(term1275, term1275.getClass(), "first", null);
        setField(term1275, term1275.getClass(), "last", null);
        setField(term1275, term1275.getClass(), "propListHead", null);
        setIntField(term1275, term1275.getClass(), "sourcePosition", 0);
        setField(term1275, term1275.getClass(), "jsType", null);
        setField(term1275, term1275.getClass(), "parent", null);
        setField(term1273, term1273.getClass(), "next", term1275);
        setIntField(term1278, term1278.getClass(), "type", 934477462);
        setField(term1278, term1278.getClass(), "next", null);
        setField(term1278, term1278.getClass(), "first", null);
        setField(term1278, term1278.getClass(), "last", term1275);
        setField(term1278, term1278.getClass(), "propListHead", null);
        setIntField(term1278, term1278.getClass(), "sourcePosition", 0);
        setField(term1278, term1278.getClass(), "jsType", null);
        setField(term1278, term1278.getClass(), "parent", null);
        setField(term1273, term1273.getClass(), "first", term1278);
        setField(term1273, term1273.getClass(), "last", term1271);
        setField(term1273, term1273.getClass(), "propListHead", null);
        setIntField(term1273, term1273.getClass(), "sourcePosition", 0);
        setField(term1273, term1273.getClass(), "jsType", null);
        setField(term1273, term1273.getClass(), "parent", null);
        setField(term1271, term1271.getClass(), "next", term1273);
        setField(term1271, term1271.getClass(), "first", term1275);
        setIntField(term1282, term1282.getClass(), "type", -1252345779);
        setIntField(term1284, term1284.getClass(), "type", -2063365430);
        setField(term1284, term1284.getClass(), "next", null);
        setField(term1284, term1284.getClass(), "first", term1278);
        setField(term1284, term1284.getClass(), "last", term1273);
        setField(term1284, term1284.getClass(), "propListHead", null);
        setIntField(term1284, term1284.getClass(), "sourcePosition", 0);
        setField(term1284, term1284.getClass(), "jsType", null);
        setField(term1284, term1284.getClass(), "parent", null);
        setField(term1282, term1282.getClass(), "next", term1284);
        setField(term1282, term1282.getClass(), "first", term1269);
        setField(term1282, term1282.getClass(), "last", term1269);
        setField(term1282, term1282.getClass(), "propListHead", null);
        setIntField(term1282, term1282.getClass(), "sourcePosition", 0);
        setField(term1282, term1282.getClass(), "jsType", null);
        setField(term1282, term1282.getClass(), "parent", null);
        setField(term1271, term1271.getClass(), "last", term1282);
        setField(term1271, term1271.getClass(), "propListHead", null);
        setIntField(term1271, term1271.getClass(), "sourcePosition", 0);
        setField(term1271, term1271.getClass(), "jsType", null);
        setField(term1271, term1271.getClass(), "parent", null);
        setField(term1269, term1269.getClass(), "next", term1271);
        setIntField(term1289, term1289.getClass(), "type", 812570053);
        setField(term1289, term1289.getClass(), "next", term1282);
        setField(term1289, term1289.getClass(), "first", term1284);
        setField(term1289, term1289.getClass(), "last", term1267);
        setField(term1289, term1289.getClass(), "propListHead", null);
        setIntField(term1289, term1289.getClass(), "sourcePosition", 0);
        setField(term1289, term1289.getClass(), "jsType", null);
        setField(term1289, term1289.getClass(), "parent", null);
        setField(term1269, term1269.getClass(), "first", term1289);
        setField(term1269, term1269.getClass(), "last", term1289);
        setField(term1269, term1269.getClass(), "propListHead", null);
        setIntField(term1269, term1269.getClass(), "sourcePosition", 0);
        setField(term1269, term1269.getClass(), "jsType", null);
        setField(term1269, term1269.getClass(), "parent", null);
        setField(term1267, term1267.getClass(), "next", term1269);
        setField(term1267, term1267.getClass(), "first", term1273);
        setField(term1267, term1267.getClass(), "last", term1275);
        setField(term1267, term1267.getClass(), "propListHead", null);
        setIntField(term1267, term1267.getClass(), "sourcePosition", 0);
        setField(term1267, term1267.getClass(), "jsType", null);
        setField(term1267, term1267.getClass(), "parent", null);
        term1294 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1267;
        args[1] = term1294;
        try {
            callMethod(klass, "call", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


