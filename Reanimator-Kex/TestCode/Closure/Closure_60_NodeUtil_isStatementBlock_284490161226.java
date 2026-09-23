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

public class NodeUtil_isStatementBlock_284490161226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1456;
     Object term12005;

    public NodeUtil_isStatementBlock_284490161226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1456, term1456.getClass(), "type", 963694071);
        setIntField(term1458, term1458.getClass(), "type", 1238598518);
        setIntField(term1460, term1460.getClass(), "type", 0);
        setField(term1460, term1460.getClass(), "next", null);
        setField(term1460, term1460.getClass(), "first", null);
        setField(term1460, term1460.getClass(), "last", null);
        setField(term1460, term1460.getClass(), "propListHead", null);
        setIntField(term1460, term1460.getClass(), "sourcePosition", 0);
        setField(term1460, term1460.getClass(), "jsType", null);
        setField(term1460, term1460.getClass(), "parent", null);
        setField(term1458, term1458.getClass(), "next", term1460);
        setIntField(term1463, term1463.getClass(), "type", 0);
        setField(term1463, term1463.getClass(), "next", null);
        setField(term1463, term1463.getClass(), "first", null);
        setField(term1463, term1463.getClass(), "last", null);
        setField(term1463, term1463.getClass(), "propListHead", null);
        setIntField(term1463, term1463.getClass(), "sourcePosition", 0);
        setField(term1463, term1463.getClass(), "jsType", null);
        setField(term1463, term1463.getClass(), "parent", null);
        setField(term1458, term1458.getClass(), "first", term1463);
        setIntField(term1466, term1466.getClass(), "type", 0);
        setField(term1466, term1466.getClass(), "next", null);
        setField(term1466, term1466.getClass(), "first", null);
        setField(term1466, term1466.getClass(), "last", null);
        setField(term1466, term1466.getClass(), "propListHead", null);
        setIntField(term1466, term1466.getClass(), "sourcePosition", 0);
        setField(term1466, term1466.getClass(), "jsType", null);
        setField(term1466, term1466.getClass(), "parent", null);
        setField(term1458, term1458.getClass(), "last", term1466);
        setField(term1458, term1458.getClass(), "propListHead", null);
        setIntField(term1458, term1458.getClass(), "sourcePosition", 0);
        setField(term1458, term1458.getClass(), "jsType", null);
        setField(term1458, term1458.getClass(), "parent", null);
        setField(term1456, term1456.getClass(), "next", term1458);
        setIntField(term1470, term1470.getClass(), "type", 0);
        setField(term1470, term1470.getClass(), "next", null);
        setField(term1470, term1470.getClass(), "first", null);
        setField(term1470, term1470.getClass(), "last", null);
        setField(term1470, term1470.getClass(), "propListHead", null);
        setIntField(term1470, term1470.getClass(), "sourcePosition", 0);
        setField(term1470, term1470.getClass(), "jsType", null);
        setField(term1470, term1470.getClass(), "parent", null);
        setField(term1456, term1456.getClass(), "first", term1470);
        setIntField(term1473, term1473.getClass(), "type", 0);
        setField(term1473, term1473.getClass(), "next", null);
        setField(term1473, term1473.getClass(), "first", null);
        setField(term1473, term1473.getClass(), "last", null);
        setField(term1473, term1473.getClass(), "propListHead", null);
        setIntField(term1473, term1473.getClass(), "sourcePosition", 0);
        setField(term1473, term1473.getClass(), "jsType", null);
        setField(term1473, term1473.getClass(), "parent", null);
        setField(term1456, term1456.getClass(), "last", term1473);
        setField(term1456, term1456.getClass(), "propListHead", null);
        setIntField(term1456, term1456.getClass(), "sourcePosition", 0);
        setField(term1456, term1456.getClass(), "jsType", null);
        setField(term1456, term1456.getClass(), "parent", null);
        term12005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12005, term12005.getClass(), "type", 963694071);
        setIntField(term12006, term12006.getClass(), "type", 1238598518);
        setIntField(term12007, term12007.getClass(), "type", 0);
        setField(term12007, term12007.getClass(), "next", null);
        setField(term12007, term12007.getClass(), "first", null);
        setField(term12007, term12007.getClass(), "last", null);
        setField(term12007, term12007.getClass(), "propListHead", null);
        setIntField(term12007, term12007.getClass(), "sourcePosition", 0);
        setField(term12007, term12007.getClass(), "jsType", null);
        setField(term12007, term12007.getClass(), "parent", null);
        setField(term12006, term12006.getClass(), "next", term12007);
        setIntField(term12008, term12008.getClass(), "type", 0);
        setField(term12008, term12008.getClass(), "next", null);
        setField(term12008, term12008.getClass(), "first", null);
        setField(term12008, term12008.getClass(), "last", null);
        setField(term12008, term12008.getClass(), "propListHead", null);
        setIntField(term12008, term12008.getClass(), "sourcePosition", 0);
        setField(term12008, term12008.getClass(), "jsType", null);
        setField(term12008, term12008.getClass(), "parent", null);
        setField(term12006, term12006.getClass(), "first", term12008);
        setIntField(term12009, term12009.getClass(), "type", 0);
        setField(term12009, term12009.getClass(), "next", null);
        setField(term12009, term12009.getClass(), "first", null);
        setField(term12009, term12009.getClass(), "last", null);
        setField(term12009, term12009.getClass(), "propListHead", null);
        setIntField(term12009, term12009.getClass(), "sourcePosition", 0);
        setField(term12009, term12009.getClass(), "jsType", null);
        setField(term12009, term12009.getClass(), "parent", null);
        setField(term12006, term12006.getClass(), "last", term12009);
        setField(term12006, term12006.getClass(), "propListHead", null);
        setIntField(term12006, term12006.getClass(), "sourcePosition", 0);
        setField(term12006, term12006.getClass(), "jsType", null);
        setField(term12006, term12006.getClass(), "parent", null);
        setField(term12005, term12005.getClass(), "next", term12006);
        setIntField(term12010, term12010.getClass(), "type", 0);
        setField(term12010, term12010.getClass(), "next", null);
        setField(term12010, term12010.getClass(), "first", null);
        setField(term12010, term12010.getClass(), "last", null);
        setField(term12010, term12010.getClass(), "propListHead", null);
        setIntField(term12010, term12010.getClass(), "sourcePosition", 0);
        setField(term12010, term12010.getClass(), "jsType", null);
        setField(term12010, term12010.getClass(), "parent", null);
        setField(term12005, term12005.getClass(), "first", term12010);
        setIntField(term12011, term12011.getClass(), "type", 0);
        setField(term12011, term12011.getClass(), "next", null);
        setField(term12011, term12011.getClass(), "first", null);
        setField(term12011, term12011.getClass(), "last", null);
        setField(term12011, term12011.getClass(), "propListHead", null);
        setIntField(term12011, term12011.getClass(), "sourcePosition", 0);
        setField(term12011, term12011.getClass(), "jsType", null);
        setField(term12011, term12011.getClass(), "parent", null);
        setField(term12005, term12005.getClass(), "last", term12011);
        setField(term12005, term12005.getClass(), "propListHead", null);
        setIntField(term12005, term12005.getClass(), "sourcePosition", 0);
        setField(term12005, term12005.getClass(), "jsType", null);
        setField(term12005, term12005.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1456;
        Object retValue = callMethod(klass, "isStatementBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1456, term12005));
        assertTrue(recursiveEquals(retValue, false));
    }

};


