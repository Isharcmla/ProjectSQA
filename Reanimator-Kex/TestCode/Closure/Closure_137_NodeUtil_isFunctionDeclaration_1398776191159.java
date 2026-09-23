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

public class NodeUtil_isFunctionDeclaration_1398776191159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1516;
     Object term9451;

    public NodeUtil_isFunctionDeclaration_1398776191159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1529 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1539 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1516, term1516.getClass(), "type", 1505480070);
        setIntField(term1518, term1518.getClass(), "type", -1777140369);
        setIntField(term1520, term1520.getClass(), "type", 0);
        setField(term1520, term1520.getClass(), "next", null);
        setField(term1520, term1520.getClass(), "first", null);
        setField(term1520, term1520.getClass(), "last", null);
        setField(term1520, term1520.getClass(), "propListHead", null);
        setIntField(term1520, term1520.getClass(), "sourcePosition", 0);
        setField(term1520, term1520.getClass(), "jsType", null);
        setField(term1520, term1520.getClass(), "parent", null);
        setField(term1518, term1518.getClass(), "next", term1520);
        setIntField(term1523, term1523.getClass(), "type", 0);
        setField(term1523, term1523.getClass(), "next", null);
        setField(term1523, term1523.getClass(), "first", null);
        setField(term1523, term1523.getClass(), "last", null);
        setField(term1523, term1523.getClass(), "propListHead", null);
        setIntField(term1523, term1523.getClass(), "sourcePosition", 0);
        setField(term1523, term1523.getClass(), "jsType", null);
        setField(term1523, term1523.getClass(), "parent", null);
        setField(term1518, term1518.getClass(), "first", term1523);
        setIntField(term1526, term1526.getClass(), "type", 0);
        setField(term1526, term1526.getClass(), "next", null);
        setField(term1526, term1526.getClass(), "first", null);
        setField(term1526, term1526.getClass(), "last", null);
        setField(term1526, term1526.getClass(), "propListHead", null);
        setIntField(term1526, term1526.getClass(), "sourcePosition", 0);
        setField(term1526, term1526.getClass(), "jsType", null);
        setField(term1526, term1526.getClass(), "parent", null);
        setField(term1518, term1518.getClass(), "last", term1526);
        setField(term1529, term1529.getClass(), "next", null);
        setIntField(term1529, term1529.getClass(), "type", 0);
        setIntField(term1529, term1529.getClass(), "intValue", 0);
        setField(term1529, term1529.getClass(), "objectValue", null);
        setField(term1518, term1518.getClass(), "propListHead", term1529);
        setIntField(term1518, term1518.getClass(), "sourcePosition", 86041387);
        setField(term1518, term1518.getClass(), "jsType", null);
        setField(term1518, term1518.getClass(), "parent", null);
        setField(term1516, term1516.getClass(), "next", term1518);
        setIntField(term1533, term1533.getClass(), "type", 0);
        setField(term1533, term1533.getClass(), "next", null);
        setField(term1533, term1533.getClass(), "first", null);
        setField(term1533, term1533.getClass(), "last", null);
        setField(term1533, term1533.getClass(), "propListHead", null);
        setIntField(term1533, term1533.getClass(), "sourcePosition", 0);
        setField(term1533, term1533.getClass(), "jsType", null);
        setField(term1533, term1533.getClass(), "parent", null);
        setField(term1516, term1516.getClass(), "first", term1533);
        setIntField(term1536, term1536.getClass(), "type", 0);
        setField(term1536, term1536.getClass(), "next", null);
        setField(term1536, term1536.getClass(), "first", null);
        setField(term1536, term1536.getClass(), "last", null);
        setField(term1536, term1536.getClass(), "propListHead", null);
        setIntField(term1536, term1536.getClass(), "sourcePosition", 0);
        setField(term1536, term1536.getClass(), "jsType", null);
        setField(term1536, term1536.getClass(), "parent", null);
        setField(term1516, term1516.getClass(), "last", term1536);
        setField(term1539, term1539.getClass(), "next", null);
        setIntField(term1539, term1539.getClass(), "type", 0);
        setIntField(term1539, term1539.getClass(), "intValue", 0);
        setField(term1539, term1539.getClass(), "objectValue", null);
        setField(term1516, term1516.getClass(), "propListHead", term1539);
        setIntField(term1516, term1516.getClass(), "sourcePosition", 1010721666);
        setField(term1516, term1516.getClass(), "jsType", null);
        setField(term1516, term1516.getClass(), "parent", null);
        term9451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9456 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9459 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9451, term9451.getClass(), "type", 1505480070);
        setIntField(term9452, term9452.getClass(), "type", -1777140369);
        setIntField(term9453, term9453.getClass(), "type", 0);
        setField(term9453, term9453.getClass(), "next", null);
        setField(term9453, term9453.getClass(), "first", null);
        setField(term9453, term9453.getClass(), "last", null);
        setField(term9453, term9453.getClass(), "propListHead", null);
        setIntField(term9453, term9453.getClass(), "sourcePosition", 0);
        setField(term9453, term9453.getClass(), "jsType", null);
        setField(term9453, term9453.getClass(), "parent", null);
        setField(term9452, term9452.getClass(), "next", term9453);
        setIntField(term9454, term9454.getClass(), "type", 0);
        setField(term9454, term9454.getClass(), "next", null);
        setField(term9454, term9454.getClass(), "first", null);
        setField(term9454, term9454.getClass(), "last", null);
        setField(term9454, term9454.getClass(), "propListHead", null);
        setIntField(term9454, term9454.getClass(), "sourcePosition", 0);
        setField(term9454, term9454.getClass(), "jsType", null);
        setField(term9454, term9454.getClass(), "parent", null);
        setField(term9452, term9452.getClass(), "first", term9454);
        setIntField(term9455, term9455.getClass(), "type", 0);
        setField(term9455, term9455.getClass(), "next", null);
        setField(term9455, term9455.getClass(), "first", null);
        setField(term9455, term9455.getClass(), "last", null);
        setField(term9455, term9455.getClass(), "propListHead", null);
        setIntField(term9455, term9455.getClass(), "sourcePosition", 0);
        setField(term9455, term9455.getClass(), "jsType", null);
        setField(term9455, term9455.getClass(), "parent", null);
        setField(term9452, term9452.getClass(), "last", term9455);
        setField(term9456, term9456.getClass(), "next", null);
        setIntField(term9456, term9456.getClass(), "type", 0);
        setIntField(term9456, term9456.getClass(), "intValue", 0);
        setField(term9456, term9456.getClass(), "objectValue", null);
        setField(term9452, term9452.getClass(), "propListHead", term9456);
        setIntField(term9452, term9452.getClass(), "sourcePosition", 86041387);
        setField(term9452, term9452.getClass(), "jsType", null);
        setField(term9452, term9452.getClass(), "parent", null);
        setField(term9451, term9451.getClass(), "next", term9452);
        setIntField(term9457, term9457.getClass(), "type", 0);
        setField(term9457, term9457.getClass(), "next", null);
        setField(term9457, term9457.getClass(), "first", null);
        setField(term9457, term9457.getClass(), "last", null);
        setField(term9457, term9457.getClass(), "propListHead", null);
        setIntField(term9457, term9457.getClass(), "sourcePosition", 0);
        setField(term9457, term9457.getClass(), "jsType", null);
        setField(term9457, term9457.getClass(), "parent", null);
        setField(term9451, term9451.getClass(), "first", term9457);
        setIntField(term9458, term9458.getClass(), "type", 0);
        setField(term9458, term9458.getClass(), "next", null);
        setField(term9458, term9458.getClass(), "first", null);
        setField(term9458, term9458.getClass(), "last", null);
        setField(term9458, term9458.getClass(), "propListHead", null);
        setIntField(term9458, term9458.getClass(), "sourcePosition", 0);
        setField(term9458, term9458.getClass(), "jsType", null);
        setField(term9458, term9458.getClass(), "parent", null);
        setField(term9451, term9451.getClass(), "last", term9458);
        setField(term9459, term9459.getClass(), "next", null);
        setIntField(term9459, term9459.getClass(), "type", 0);
        setIntField(term9459, term9459.getClass(), "intValue", 0);
        setField(term9459, term9459.getClass(), "objectValue", null);
        setField(term9451, term9451.getClass(), "propListHead", term9459);
        setIntField(term9451, term9451.getClass(), "sourcePosition", 1010721666);
        setField(term9451, term9451.getClass(), "jsType", null);
        setField(term9451, term9451.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1516;
        Object retValue = callMethod(klass, "isFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1516, term9451));
        assertTrue(recursiveEquals(retValue, false));
    }

};


