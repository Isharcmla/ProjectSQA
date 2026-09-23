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
     Object term1484;
     Object term1495;
     Object term1522;
     Object enum11;

    public CodeGenerator_addExpr_50800799149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1485 = new HashMap();
        term1484 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1484, term1484.getClass(), "ESCAPED_JS_STRINGS", term1485);
        setField(term1484, term1484.getClass(), "cc", null);
        setField(term1484, term1484.getClass(), "outputCharsetEncoder", null);
        term1495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1508 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1495, term1495.getClass(), "type", -556405712);
        setIntField(term1497, term1497.getClass(), "type", -344842608);
        setIntField(term1499, term1499.getClass(), "type", 0);
        setField(term1499, term1499.getClass(), "next", null);
        setField(term1499, term1499.getClass(), "first", null);
        setField(term1499, term1499.getClass(), "last", null);
        setField(term1499, term1499.getClass(), "propListHead", null);
        setIntField(term1499, term1499.getClass(), "sourcePosition", 0);
        setField(term1499, term1499.getClass(), "jsType", null);
        setField(term1499, term1499.getClass(), "parent", null);
        setField(term1497, term1497.getClass(), "next", term1499);
        setIntField(term1502, term1502.getClass(), "type", 0);
        setField(term1502, term1502.getClass(), "next", null);
        setField(term1502, term1502.getClass(), "first", null);
        setField(term1502, term1502.getClass(), "last", null);
        setField(term1502, term1502.getClass(), "propListHead", null);
        setIntField(term1502, term1502.getClass(), "sourcePosition", 0);
        setField(term1502, term1502.getClass(), "jsType", null);
        setField(term1502, term1502.getClass(), "parent", null);
        setField(term1497, term1497.getClass(), "first", term1502);
        setIntField(term1505, term1505.getClass(), "type", 0);
        setField(term1505, term1505.getClass(), "next", null);
        setField(term1505, term1505.getClass(), "first", null);
        setField(term1505, term1505.getClass(), "last", null);
        setField(term1505, term1505.getClass(), "propListHead", null);
        setIntField(term1505, term1505.getClass(), "sourcePosition", 0);
        setField(term1505, term1505.getClass(), "jsType", null);
        setField(term1505, term1505.getClass(), "parent", null);
        setField(term1497, term1497.getClass(), "last", term1505);
        setField(term1508, term1508.getClass(), "next", null);
        setIntField(term1508, term1508.getClass(), "type", 0);
        setIntField(term1508, term1508.getClass(), "intValue", 0);
        setField(term1508, term1508.getClass(), "objectValue", null);
        setField(term1497, term1497.getClass(), "propListHead", term1508);
        setIntField(term1497, term1497.getClass(), "sourcePosition", -1034506028);
        setField(term1497, term1497.getClass(), "jsType", null);
        setField(term1497, term1497.getClass(), "parent", null);
        setField(term1495, term1495.getClass(), "next", term1497);
        setIntField(term1512, term1512.getClass(), "type", 0);
        setField(term1512, term1512.getClass(), "next", null);
        setField(term1512, term1512.getClass(), "first", null);
        setField(term1512, term1512.getClass(), "last", null);
        setField(term1512, term1512.getClass(), "propListHead", null);
        setIntField(term1512, term1512.getClass(), "sourcePosition", 0);
        setField(term1512, term1512.getClass(), "jsType", null);
        setField(term1512, term1512.getClass(), "parent", null);
        setField(term1495, term1495.getClass(), "first", term1512);
        setIntField(term1515, term1515.getClass(), "type", 0);
        setField(term1515, term1515.getClass(), "next", null);
        setField(term1515, term1515.getClass(), "first", null);
        setField(term1515, term1515.getClass(), "last", null);
        setField(term1515, term1515.getClass(), "propListHead", null);
        setIntField(term1515, term1515.getClass(), "sourcePosition", 0);
        setField(term1515, term1515.getClass(), "jsType", null);
        setField(term1515, term1515.getClass(), "parent", null);
        setField(term1495, term1495.getClass(), "last", term1515);
        setField(term1518, term1518.getClass(), "next", null);
        setIntField(term1518, term1518.getClass(), "type", 0);
        setIntField(term1518, term1518.getClass(), "intValue", 0);
        setField(term1518, term1518.getClass(), "objectValue", null);
        setField(term1495, term1495.getClass(), "propListHead", term1518);
        setIntField(term1495, term1495.getClass(), "sourcePosition", -1263114719);
        setField(term1495, term1495.getClass(), "jsType", null);
        setField(term1495, term1495.getClass(), "parent", null);
        term1522 = new Integer(-894662986);
        Class<? extends Object> term7451 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term7450 = ((Class) term7451).getDeclaredField((String) "OTHER");
        ((Field) term7450).setAccessible(true);
        enum11 = ((Field) term7450).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1495;
        args[1] = term1522;
        args[2] = enum11;
        try {
            callMethod(klass, "addExpr", argTypes, term1484, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


