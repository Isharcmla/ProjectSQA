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

public class CodeGenerator_addExpr_89705613748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1444;
     Object term1455;
     Object term1482;

    public CodeGenerator_addExpr_89705613748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1445 = new HashMap();
        term1444 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1444, term1444.getClass(), "ESCAPED_JS_STRINGS", term1445);
        setField(term1444, term1444.getClass(), "cc", null);
        setField(term1444, term1444.getClass(), "outputCharsetEncoder", null);
        term1455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1468 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1478 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1455, term1455.getClass(), "type", -2027534003);
        setIntField(term1457, term1457.getClass(), "type", 972867650);
        setIntField(term1459, term1459.getClass(), "type", 0);
        setField(term1459, term1459.getClass(), "next", null);
        setField(term1459, term1459.getClass(), "first", null);
        setField(term1459, term1459.getClass(), "last", null);
        setField(term1459, term1459.getClass(), "propListHead", null);
        setIntField(term1459, term1459.getClass(), "sourcePosition", 0);
        setField(term1459, term1459.getClass(), "jsType", null);
        setField(term1459, term1459.getClass(), "parent", null);
        setField(term1457, term1457.getClass(), "next", term1459);
        setIntField(term1462, term1462.getClass(), "type", 0);
        setField(term1462, term1462.getClass(), "next", null);
        setField(term1462, term1462.getClass(), "first", null);
        setField(term1462, term1462.getClass(), "last", null);
        setField(term1462, term1462.getClass(), "propListHead", null);
        setIntField(term1462, term1462.getClass(), "sourcePosition", 0);
        setField(term1462, term1462.getClass(), "jsType", null);
        setField(term1462, term1462.getClass(), "parent", null);
        setField(term1457, term1457.getClass(), "first", term1462);
        setIntField(term1465, term1465.getClass(), "type", 0);
        setField(term1465, term1465.getClass(), "next", null);
        setField(term1465, term1465.getClass(), "first", null);
        setField(term1465, term1465.getClass(), "last", null);
        setField(term1465, term1465.getClass(), "propListHead", null);
        setIntField(term1465, term1465.getClass(), "sourcePosition", 0);
        setField(term1465, term1465.getClass(), "jsType", null);
        setField(term1465, term1465.getClass(), "parent", null);
        setField(term1457, term1457.getClass(), "last", term1465);
        setField(term1468, term1468.getClass(), "next", null);
        setIntField(term1468, term1468.getClass(), "type", 0);
        setIntField(term1468, term1468.getClass(), "intValue", 0);
        setField(term1468, term1468.getClass(), "objectValue", null);
        setField(term1457, term1457.getClass(), "propListHead", term1468);
        setIntField(term1457, term1457.getClass(), "sourcePosition", 1240914516);
        setField(term1457, term1457.getClass(), "jsType", null);
        setField(term1457, term1457.getClass(), "parent", null);
        setField(term1455, term1455.getClass(), "next", term1457);
        setIntField(term1472, term1472.getClass(), "type", 0);
        setField(term1472, term1472.getClass(), "next", null);
        setField(term1472, term1472.getClass(), "first", null);
        setField(term1472, term1472.getClass(), "last", null);
        setField(term1472, term1472.getClass(), "propListHead", null);
        setIntField(term1472, term1472.getClass(), "sourcePosition", 0);
        setField(term1472, term1472.getClass(), "jsType", null);
        setField(term1472, term1472.getClass(), "parent", null);
        setField(term1455, term1455.getClass(), "first", term1472);
        setIntField(term1475, term1475.getClass(), "type", 0);
        setField(term1475, term1475.getClass(), "next", null);
        setField(term1475, term1475.getClass(), "first", null);
        setField(term1475, term1475.getClass(), "last", null);
        setField(term1475, term1475.getClass(), "propListHead", null);
        setIntField(term1475, term1475.getClass(), "sourcePosition", 0);
        setField(term1475, term1475.getClass(), "jsType", null);
        setField(term1475, term1475.getClass(), "parent", null);
        setField(term1455, term1455.getClass(), "last", term1475);
        setField(term1478, term1478.getClass(), "next", null);
        setIntField(term1478, term1478.getClass(), "type", 0);
        setIntField(term1478, term1478.getClass(), "intValue", 0);
        setField(term1478, term1478.getClass(), "objectValue", null);
        setField(term1455, term1455.getClass(), "propListHead", term1478);
        setIntField(term1455, term1455.getClass(), "sourcePosition", -1465035361);
        setField(term1455, term1455.getClass(), "jsType", null);
        setField(term1455, term1455.getClass(), "parent", null);
        term1482 = new Integer(1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1455;
        args[1] = term1482;
        try {
            callMethod(klass, "addExpr", argTypes, term1444, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


