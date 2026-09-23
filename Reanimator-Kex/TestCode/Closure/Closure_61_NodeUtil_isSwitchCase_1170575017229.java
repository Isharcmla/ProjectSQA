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

public class NodeUtil_isSwitchCase_1170575017229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1519;
     Object term12353;

    public NodeUtil_isSwitchCase_1170575017229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1519, term1519.getClass(), "type", -497534255);
        setIntField(term1521, term1521.getClass(), "type", -1955400589);
        setIntField(term1523, term1523.getClass(), "type", 0);
        setField(term1523, term1523.getClass(), "next", null);
        setField(term1523, term1523.getClass(), "first", null);
        setField(term1523, term1523.getClass(), "last", null);
        setField(term1523, term1523.getClass(), "propListHead", null);
        setIntField(term1523, term1523.getClass(), "sourcePosition", 0);
        setField(term1523, term1523.getClass(), "jsType", null);
        setField(term1523, term1523.getClass(), "parent", null);
        setField(term1521, term1521.getClass(), "next", term1523);
        setIntField(term1526, term1526.getClass(), "type", 0);
        setField(term1526, term1526.getClass(), "next", null);
        setField(term1526, term1526.getClass(), "first", null);
        setField(term1526, term1526.getClass(), "last", null);
        setField(term1526, term1526.getClass(), "propListHead", null);
        setIntField(term1526, term1526.getClass(), "sourcePosition", 0);
        setField(term1526, term1526.getClass(), "jsType", null);
        setField(term1526, term1526.getClass(), "parent", null);
        setField(term1521, term1521.getClass(), "first", term1526);
        setIntField(term1529, term1529.getClass(), "type", 0);
        setField(term1529, term1529.getClass(), "next", null);
        setField(term1529, term1529.getClass(), "first", null);
        setField(term1529, term1529.getClass(), "last", null);
        setField(term1529, term1529.getClass(), "propListHead", null);
        setIntField(term1529, term1529.getClass(), "sourcePosition", 0);
        setField(term1529, term1529.getClass(), "jsType", null);
        setField(term1529, term1529.getClass(), "parent", null);
        setField(term1521, term1521.getClass(), "last", term1529);
        setField(term1521, term1521.getClass(), "propListHead", null);
        setIntField(term1521, term1521.getClass(), "sourcePosition", 0);
        setField(term1521, term1521.getClass(), "jsType", null);
        setField(term1521, term1521.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "next", term1521);
        setIntField(term1533, term1533.getClass(), "type", 0);
        setField(term1533, term1533.getClass(), "next", null);
        setField(term1533, term1533.getClass(), "first", null);
        setField(term1533, term1533.getClass(), "last", null);
        setField(term1533, term1533.getClass(), "propListHead", null);
        setIntField(term1533, term1533.getClass(), "sourcePosition", 0);
        setField(term1533, term1533.getClass(), "jsType", null);
        setField(term1533, term1533.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "first", term1533);
        setIntField(term1536, term1536.getClass(), "type", 0);
        setField(term1536, term1536.getClass(), "next", null);
        setField(term1536, term1536.getClass(), "first", null);
        setField(term1536, term1536.getClass(), "last", null);
        setField(term1536, term1536.getClass(), "propListHead", null);
        setIntField(term1536, term1536.getClass(), "sourcePosition", 0);
        setField(term1536, term1536.getClass(), "jsType", null);
        setField(term1536, term1536.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "last", term1536);
        setField(term1519, term1519.getClass(), "propListHead", null);
        setIntField(term1519, term1519.getClass(), "sourcePosition", 0);
        setField(term1519, term1519.getClass(), "jsType", null);
        setField(term1519, term1519.getClass(), "parent", null);
        term12353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12353, term12353.getClass(), "type", -497534255);
        setIntField(term12354, term12354.getClass(), "type", -1955400589);
        setIntField(term12355, term12355.getClass(), "type", 0);
        setField(term12355, term12355.getClass(), "next", null);
        setField(term12355, term12355.getClass(), "first", null);
        setField(term12355, term12355.getClass(), "last", null);
        setField(term12355, term12355.getClass(), "propListHead", null);
        setIntField(term12355, term12355.getClass(), "sourcePosition", 0);
        setField(term12355, term12355.getClass(), "jsType", null);
        setField(term12355, term12355.getClass(), "parent", null);
        setField(term12354, term12354.getClass(), "next", term12355);
        setIntField(term12356, term12356.getClass(), "type", 0);
        setField(term12356, term12356.getClass(), "next", null);
        setField(term12356, term12356.getClass(), "first", null);
        setField(term12356, term12356.getClass(), "last", null);
        setField(term12356, term12356.getClass(), "propListHead", null);
        setIntField(term12356, term12356.getClass(), "sourcePosition", 0);
        setField(term12356, term12356.getClass(), "jsType", null);
        setField(term12356, term12356.getClass(), "parent", null);
        setField(term12354, term12354.getClass(), "first", term12356);
        setIntField(term12357, term12357.getClass(), "type", 0);
        setField(term12357, term12357.getClass(), "next", null);
        setField(term12357, term12357.getClass(), "first", null);
        setField(term12357, term12357.getClass(), "last", null);
        setField(term12357, term12357.getClass(), "propListHead", null);
        setIntField(term12357, term12357.getClass(), "sourcePosition", 0);
        setField(term12357, term12357.getClass(), "jsType", null);
        setField(term12357, term12357.getClass(), "parent", null);
        setField(term12354, term12354.getClass(), "last", term12357);
        setField(term12354, term12354.getClass(), "propListHead", null);
        setIntField(term12354, term12354.getClass(), "sourcePosition", 0);
        setField(term12354, term12354.getClass(), "jsType", null);
        setField(term12354, term12354.getClass(), "parent", null);
        setField(term12353, term12353.getClass(), "next", term12354);
        setIntField(term12358, term12358.getClass(), "type", 0);
        setField(term12358, term12358.getClass(), "next", null);
        setField(term12358, term12358.getClass(), "first", null);
        setField(term12358, term12358.getClass(), "last", null);
        setField(term12358, term12358.getClass(), "propListHead", null);
        setIntField(term12358, term12358.getClass(), "sourcePosition", 0);
        setField(term12358, term12358.getClass(), "jsType", null);
        setField(term12358, term12358.getClass(), "parent", null);
        setField(term12353, term12353.getClass(), "first", term12358);
        setIntField(term12359, term12359.getClass(), "type", 0);
        setField(term12359, term12359.getClass(), "next", null);
        setField(term12359, term12359.getClass(), "first", null);
        setField(term12359, term12359.getClass(), "last", null);
        setField(term12359, term12359.getClass(), "propListHead", null);
        setIntField(term12359, term12359.getClass(), "sourcePosition", 0);
        setField(term12359, term12359.getClass(), "jsType", null);
        setField(term12359, term12359.getClass(), "parent", null);
        setField(term12353, term12353.getClass(), "last", term12359);
        setField(term12353, term12353.getClass(), "propListHead", null);
        setIntField(term12353, term12353.getClass(), "sourcePosition", 0);
        setField(term12353, term12353.getClass(), "jsType", null);
        setField(term12353, term12353.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1519;
        Object retValue = callMethod(klass, "isSwitchCase", argTypes, null, args);
        assertTrue(recursiveEquals(term1519, term12353));
        assertTrue(recursiveEquals(retValue, false));
    }

};


