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

public class NodeUtil_isStatementParent_1289829320228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1498;
     Object term12319;

    public NodeUtil_isStatementParent_1289829320228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1498, term1498.getClass(), "type", 633765954);
        setIntField(term1500, term1500.getClass(), "type", 34167717);
        setIntField(term1502, term1502.getClass(), "type", 0);
        setField(term1502, term1502.getClass(), "next", null);
        setField(term1502, term1502.getClass(), "first", null);
        setField(term1502, term1502.getClass(), "last", null);
        setField(term1502, term1502.getClass(), "propListHead", null);
        setIntField(term1502, term1502.getClass(), "sourcePosition", 0);
        setField(term1502, term1502.getClass(), "jsType", null);
        setField(term1502, term1502.getClass(), "parent", null);
        setField(term1500, term1500.getClass(), "next", term1502);
        setIntField(term1505, term1505.getClass(), "type", 0);
        setField(term1505, term1505.getClass(), "next", null);
        setField(term1505, term1505.getClass(), "first", null);
        setField(term1505, term1505.getClass(), "last", null);
        setField(term1505, term1505.getClass(), "propListHead", null);
        setIntField(term1505, term1505.getClass(), "sourcePosition", 0);
        setField(term1505, term1505.getClass(), "jsType", null);
        setField(term1505, term1505.getClass(), "parent", null);
        setField(term1500, term1500.getClass(), "first", term1505);
        setIntField(term1508, term1508.getClass(), "type", 0);
        setField(term1508, term1508.getClass(), "next", null);
        setField(term1508, term1508.getClass(), "first", null);
        setField(term1508, term1508.getClass(), "last", null);
        setField(term1508, term1508.getClass(), "propListHead", null);
        setIntField(term1508, term1508.getClass(), "sourcePosition", 0);
        setField(term1508, term1508.getClass(), "jsType", null);
        setField(term1508, term1508.getClass(), "parent", null);
        setField(term1500, term1500.getClass(), "last", term1508);
        setField(term1500, term1500.getClass(), "propListHead", null);
        setIntField(term1500, term1500.getClass(), "sourcePosition", 0);
        setField(term1500, term1500.getClass(), "jsType", null);
        setField(term1500, term1500.getClass(), "parent", null);
        setField(term1498, term1498.getClass(), "next", term1500);
        setIntField(term1512, term1512.getClass(), "type", 0);
        setField(term1512, term1512.getClass(), "next", null);
        setField(term1512, term1512.getClass(), "first", null);
        setField(term1512, term1512.getClass(), "last", null);
        setField(term1512, term1512.getClass(), "propListHead", null);
        setIntField(term1512, term1512.getClass(), "sourcePosition", 0);
        setField(term1512, term1512.getClass(), "jsType", null);
        setField(term1512, term1512.getClass(), "parent", null);
        setField(term1498, term1498.getClass(), "first", term1512);
        setIntField(term1515, term1515.getClass(), "type", 0);
        setField(term1515, term1515.getClass(), "next", null);
        setField(term1515, term1515.getClass(), "first", null);
        setField(term1515, term1515.getClass(), "last", null);
        setField(term1515, term1515.getClass(), "propListHead", null);
        setIntField(term1515, term1515.getClass(), "sourcePosition", 0);
        setField(term1515, term1515.getClass(), "jsType", null);
        setField(term1515, term1515.getClass(), "parent", null);
        setField(term1498, term1498.getClass(), "last", term1515);
        setField(term1498, term1498.getClass(), "propListHead", null);
        setIntField(term1498, term1498.getClass(), "sourcePosition", 0);
        setField(term1498, term1498.getClass(), "jsType", null);
        setField(term1498, term1498.getClass(), "parent", null);
        term12319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12319, term12319.getClass(), "type", 633765954);
        setIntField(term12320, term12320.getClass(), "type", 34167717);
        setIntField(term12321, term12321.getClass(), "type", 0);
        setField(term12321, term12321.getClass(), "next", null);
        setField(term12321, term12321.getClass(), "first", null);
        setField(term12321, term12321.getClass(), "last", null);
        setField(term12321, term12321.getClass(), "propListHead", null);
        setIntField(term12321, term12321.getClass(), "sourcePosition", 0);
        setField(term12321, term12321.getClass(), "jsType", null);
        setField(term12321, term12321.getClass(), "parent", null);
        setField(term12320, term12320.getClass(), "next", term12321);
        setIntField(term12322, term12322.getClass(), "type", 0);
        setField(term12322, term12322.getClass(), "next", null);
        setField(term12322, term12322.getClass(), "first", null);
        setField(term12322, term12322.getClass(), "last", null);
        setField(term12322, term12322.getClass(), "propListHead", null);
        setIntField(term12322, term12322.getClass(), "sourcePosition", 0);
        setField(term12322, term12322.getClass(), "jsType", null);
        setField(term12322, term12322.getClass(), "parent", null);
        setField(term12320, term12320.getClass(), "first", term12322);
        setIntField(term12323, term12323.getClass(), "type", 0);
        setField(term12323, term12323.getClass(), "next", null);
        setField(term12323, term12323.getClass(), "first", null);
        setField(term12323, term12323.getClass(), "last", null);
        setField(term12323, term12323.getClass(), "propListHead", null);
        setIntField(term12323, term12323.getClass(), "sourcePosition", 0);
        setField(term12323, term12323.getClass(), "jsType", null);
        setField(term12323, term12323.getClass(), "parent", null);
        setField(term12320, term12320.getClass(), "last", term12323);
        setField(term12320, term12320.getClass(), "propListHead", null);
        setIntField(term12320, term12320.getClass(), "sourcePosition", 0);
        setField(term12320, term12320.getClass(), "jsType", null);
        setField(term12320, term12320.getClass(), "parent", null);
        setField(term12319, term12319.getClass(), "next", term12320);
        setIntField(term12324, term12324.getClass(), "type", 0);
        setField(term12324, term12324.getClass(), "next", null);
        setField(term12324, term12324.getClass(), "first", null);
        setField(term12324, term12324.getClass(), "last", null);
        setField(term12324, term12324.getClass(), "propListHead", null);
        setIntField(term12324, term12324.getClass(), "sourcePosition", 0);
        setField(term12324, term12324.getClass(), "jsType", null);
        setField(term12324, term12324.getClass(), "parent", null);
        setField(term12319, term12319.getClass(), "first", term12324);
        setIntField(term12325, term12325.getClass(), "type", 0);
        setField(term12325, term12325.getClass(), "next", null);
        setField(term12325, term12325.getClass(), "first", null);
        setField(term12325, term12325.getClass(), "last", null);
        setField(term12325, term12325.getClass(), "propListHead", null);
        setIntField(term12325, term12325.getClass(), "sourcePosition", 0);
        setField(term12325, term12325.getClass(), "jsType", null);
        setField(term12325, term12325.getClass(), "parent", null);
        setField(term12319, term12319.getClass(), "last", term12325);
        setField(term12319, term12319.getClass(), "propListHead", null);
        setIntField(term12319, term12319.getClass(), "sourcePosition", 0);
        setField(term12319, term12319.getClass(), "jsType", null);
        setField(term12319, term12319.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1498;
        Object retValue = callMethod(klass, "isStatementParent", argTypes, null, args);
        assertTrue(recursiveEquals(term1498, term12319));
        assertTrue(recursiveEquals(retValue, false));
    }

};


