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
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_addExpr_50800799149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1442;
     Object term1453;
     Object term1474;
     Object enum11;

    public CodeGenerator_addExpr_50800799149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1443 = new HashMap();
        term1442 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1442, term1442.getClass(), "ESCAPED_JS_STRINGS", term1443);
        setField(term1442, term1442.getClass(), "cc", null);
        setField(term1442, term1442.getClass(), "outputCharsetEncoder", null);
        term1453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1453, term1453.getClass(), "type", 1551099402);
        setIntField(term1455, term1455.getClass(), "type", -478195677);
        setIntField(term1457, term1457.getClass(), "type", 0);
        setField(term1457, term1457.getClass(), "next", null);
        setField(term1457, term1457.getClass(), "first", null);
        setField(term1457, term1457.getClass(), "last", null);
        setField(term1457, term1457.getClass(), "propListHead", null);
        setIntField(term1457, term1457.getClass(), "sourcePosition", 0);
        setField(term1457, term1457.getClass(), "jsType", null);
        setField(term1457, term1457.getClass(), "parent", null);
        setField(term1455, term1455.getClass(), "next", term1457);
        setIntField(term1460, term1460.getClass(), "type", 0);
        setField(term1460, term1460.getClass(), "next", null);
        setField(term1460, term1460.getClass(), "first", null);
        setField(term1460, term1460.getClass(), "last", null);
        setField(term1460, term1460.getClass(), "propListHead", null);
        setIntField(term1460, term1460.getClass(), "sourcePosition", 0);
        setField(term1460, term1460.getClass(), "jsType", null);
        setField(term1460, term1460.getClass(), "parent", null);
        setField(term1455, term1455.getClass(), "first", term1460);
        setIntField(term1463, term1463.getClass(), "type", 0);
        setField(term1463, term1463.getClass(), "next", null);
        setField(term1463, term1463.getClass(), "first", null);
        setField(term1463, term1463.getClass(), "last", null);
        setField(term1463, term1463.getClass(), "propListHead", null);
        setIntField(term1463, term1463.getClass(), "sourcePosition", 0);
        setField(term1463, term1463.getClass(), "jsType", null);
        setField(term1463, term1463.getClass(), "parent", null);
        setField(term1455, term1455.getClass(), "last", term1463);
        setField(term1455, term1455.getClass(), "propListHead", null);
        setIntField(term1455, term1455.getClass(), "sourcePosition", 0);
        setField(term1455, term1455.getClass(), "jsType", null);
        setField(term1455, term1455.getClass(), "parent", null);
        setField(term1453, term1453.getClass(), "next", term1455);
        setIntField(term1467, term1467.getClass(), "type", 0);
        setField(term1467, term1467.getClass(), "next", null);
        setField(term1467, term1467.getClass(), "first", null);
        setField(term1467, term1467.getClass(), "last", null);
        setField(term1467, term1467.getClass(), "propListHead", null);
        setIntField(term1467, term1467.getClass(), "sourcePosition", 0);
        setField(term1467, term1467.getClass(), "jsType", null);
        setField(term1467, term1467.getClass(), "parent", null);
        setField(term1453, term1453.getClass(), "first", term1467);
        setIntField(term1470, term1470.getClass(), "type", 0);
        setField(term1470, term1470.getClass(), "next", null);
        setField(term1470, term1470.getClass(), "first", null);
        setField(term1470, term1470.getClass(), "last", null);
        setField(term1470, term1470.getClass(), "propListHead", null);
        setIntField(term1470, term1470.getClass(), "sourcePosition", 0);
        setField(term1470, term1470.getClass(), "jsType", null);
        setField(term1470, term1470.getClass(), "parent", null);
        setField(term1453, term1453.getClass(), "last", term1470);
        setField(term1453, term1453.getClass(), "propListHead", null);
        setIntField(term1453, term1453.getClass(), "sourcePosition", 0);
        setField(term1453, term1453.getClass(), "jsType", null);
        setField(term1453, term1453.getClass(), "parent", null);
        term1474 = new Integer(-481533957);
        Class<? extends Object> term7290 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term7289 = ((Class) term7290).getDeclaredField((String) "OTHER");
        ((Field) term7289).setAccessible(true);
        enum11 = ((Field) term7289).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1453;
        args[1] = term1474;
        args[2] = enum11;
        try {
            callMethod(klass, "addExpr", argTypes, term1442, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


