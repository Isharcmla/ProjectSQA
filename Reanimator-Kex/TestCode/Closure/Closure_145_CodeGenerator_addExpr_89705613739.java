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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class CodeGenerator_addExpr_89705613739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281;
     Object term1282;
     Object term1309;

    public CodeGenerator_addExpr_89705613739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1281 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1281, term1281.getClass(), "cc", null);
        setField(term1281, term1281.getClass(), "outputCharsetEncoder", null);
        term1282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1305 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1282, term1282.getClass(), "type", 1225272962);
        setIntField(term1284, term1284.getClass(), "type", -112921587);
        setIntField(term1286, term1286.getClass(), "type", 0);
        setField(term1286, term1286.getClass(), "next", null);
        setField(term1286, term1286.getClass(), "first", null);
        setField(term1286, term1286.getClass(), "last", null);
        setField(term1286, term1286.getClass(), "propListHead", null);
        setIntField(term1286, term1286.getClass(), "sourcePosition", 0);
        setField(term1286, term1286.getClass(), "jsType", null);
        setField(term1286, term1286.getClass(), "parent", null);
        setField(term1284, term1284.getClass(), "next", term1286);
        setIntField(term1289, term1289.getClass(), "type", 0);
        setField(term1289, term1289.getClass(), "next", null);
        setField(term1289, term1289.getClass(), "first", null);
        setField(term1289, term1289.getClass(), "last", null);
        setField(term1289, term1289.getClass(), "propListHead", null);
        setIntField(term1289, term1289.getClass(), "sourcePosition", 0);
        setField(term1289, term1289.getClass(), "jsType", null);
        setField(term1289, term1289.getClass(), "parent", null);
        setField(term1284, term1284.getClass(), "first", term1289);
        setIntField(term1292, term1292.getClass(), "type", 0);
        setField(term1292, term1292.getClass(), "next", null);
        setField(term1292, term1292.getClass(), "first", null);
        setField(term1292, term1292.getClass(), "last", null);
        setField(term1292, term1292.getClass(), "propListHead", null);
        setIntField(term1292, term1292.getClass(), "sourcePosition", 0);
        setField(term1292, term1292.getClass(), "jsType", null);
        setField(term1292, term1292.getClass(), "parent", null);
        setField(term1284, term1284.getClass(), "last", term1292);
        setField(term1295, term1295.getClass(), "next", null);
        setIntField(term1295, term1295.getClass(), "type", 0);
        setIntField(term1295, term1295.getClass(), "intValue", 0);
        setField(term1295, term1295.getClass(), "objectValue", null);
        setField(term1284, term1284.getClass(), "propListHead", term1295);
        setIntField(term1284, term1284.getClass(), "sourcePosition", 962840079);
        setField(term1284, term1284.getClass(), "jsType", null);
        setField(term1284, term1284.getClass(), "parent", null);
        setField(term1282, term1282.getClass(), "next", term1284);
        setIntField(term1299, term1299.getClass(), "type", 0);
        setField(term1299, term1299.getClass(), "next", null);
        setField(term1299, term1299.getClass(), "first", null);
        setField(term1299, term1299.getClass(), "last", null);
        setField(term1299, term1299.getClass(), "propListHead", null);
        setIntField(term1299, term1299.getClass(), "sourcePosition", 0);
        setField(term1299, term1299.getClass(), "jsType", null);
        setField(term1299, term1299.getClass(), "parent", null);
        setField(term1282, term1282.getClass(), "first", term1299);
        setIntField(term1302, term1302.getClass(), "type", 0);
        setField(term1302, term1302.getClass(), "next", null);
        setField(term1302, term1302.getClass(), "first", null);
        setField(term1302, term1302.getClass(), "last", null);
        setField(term1302, term1302.getClass(), "propListHead", null);
        setIntField(term1302, term1302.getClass(), "sourcePosition", 0);
        setField(term1302, term1302.getClass(), "jsType", null);
        setField(term1302, term1302.getClass(), "parent", null);
        setField(term1282, term1282.getClass(), "last", term1302);
        setField(term1305, term1305.getClass(), "next", null);
        setIntField(term1305, term1305.getClass(), "type", 0);
        setIntField(term1305, term1305.getClass(), "intValue", 0);
        setField(term1305, term1305.getClass(), "objectValue", null);
        setField(term1282, term1282.getClass(), "propListHead", term1305);
        setIntField(term1282, term1282.getClass(), "sourcePosition", 1540719661);
        setField(term1282, term1282.getClass(), "jsType", null);
        setField(term1282, term1282.getClass(), "parent", null);
        term1309 = new Integer(1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1282;
        args[1] = term1309;
        try {
            callMethod(klass, "addExpr", argTypes, term1281, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


