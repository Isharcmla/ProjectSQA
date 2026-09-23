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

public class NodeUtil_isGet_883122773208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1057;
     Object term10660;

    public NodeUtil_isGet_883122773208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1057, term1057.getClass(), "type", 76650923);
        setIntField(term1059, term1059.getClass(), "type", -1840305774);
        setIntField(term1061, term1061.getClass(), "type", 0);
        setField(term1061, term1061.getClass(), "next", null);
        setField(term1061, term1061.getClass(), "first", null);
        setField(term1061, term1061.getClass(), "last", null);
        setField(term1061, term1061.getClass(), "propListHead", null);
        setIntField(term1061, term1061.getClass(), "sourcePosition", 0);
        setField(term1061, term1061.getClass(), "jsType", null);
        setField(term1061, term1061.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "next", term1061);
        setIntField(term1064, term1064.getClass(), "type", 0);
        setField(term1064, term1064.getClass(), "next", null);
        setField(term1064, term1064.getClass(), "first", null);
        setField(term1064, term1064.getClass(), "last", null);
        setField(term1064, term1064.getClass(), "propListHead", null);
        setIntField(term1064, term1064.getClass(), "sourcePosition", 0);
        setField(term1064, term1064.getClass(), "jsType", null);
        setField(term1064, term1064.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "first", term1064);
        setIntField(term1067, term1067.getClass(), "type", 0);
        setField(term1067, term1067.getClass(), "next", null);
        setField(term1067, term1067.getClass(), "first", null);
        setField(term1067, term1067.getClass(), "last", null);
        setField(term1067, term1067.getClass(), "propListHead", null);
        setIntField(term1067, term1067.getClass(), "sourcePosition", 0);
        setField(term1067, term1067.getClass(), "jsType", null);
        setField(term1067, term1067.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "last", term1067);
        setField(term1059, term1059.getClass(), "propListHead", null);
        setIntField(term1059, term1059.getClass(), "sourcePosition", 0);
        setField(term1059, term1059.getClass(), "jsType", null);
        setField(term1059, term1059.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "next", term1059);
        setIntField(term1071, term1071.getClass(), "type", 0);
        setField(term1071, term1071.getClass(), "next", null);
        setField(term1071, term1071.getClass(), "first", null);
        setField(term1071, term1071.getClass(), "last", null);
        setField(term1071, term1071.getClass(), "propListHead", null);
        setIntField(term1071, term1071.getClass(), "sourcePosition", 0);
        setField(term1071, term1071.getClass(), "jsType", null);
        setField(term1071, term1071.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "first", term1071);
        setIntField(term1074, term1074.getClass(), "type", 0);
        setField(term1074, term1074.getClass(), "next", null);
        setField(term1074, term1074.getClass(), "first", null);
        setField(term1074, term1074.getClass(), "last", null);
        setField(term1074, term1074.getClass(), "propListHead", null);
        setIntField(term1074, term1074.getClass(), "sourcePosition", 0);
        setField(term1074, term1074.getClass(), "jsType", null);
        setField(term1074, term1074.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "last", term1074);
        setField(term1057, term1057.getClass(), "propListHead", null);
        setIntField(term1057, term1057.getClass(), "sourcePosition", 0);
        setField(term1057, term1057.getClass(), "jsType", null);
        setField(term1057, term1057.getClass(), "parent", null);
        term10660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10660, term10660.getClass(), "type", 76650923);
        setIntField(term10661, term10661.getClass(), "type", -1840305774);
        setIntField(term10662, term10662.getClass(), "type", 0);
        setField(term10662, term10662.getClass(), "next", null);
        setField(term10662, term10662.getClass(), "first", null);
        setField(term10662, term10662.getClass(), "last", null);
        setField(term10662, term10662.getClass(), "propListHead", null);
        setIntField(term10662, term10662.getClass(), "sourcePosition", 0);
        setField(term10662, term10662.getClass(), "jsType", null);
        setField(term10662, term10662.getClass(), "parent", null);
        setField(term10661, term10661.getClass(), "next", term10662);
        setIntField(term10663, term10663.getClass(), "type", 0);
        setField(term10663, term10663.getClass(), "next", null);
        setField(term10663, term10663.getClass(), "first", null);
        setField(term10663, term10663.getClass(), "last", null);
        setField(term10663, term10663.getClass(), "propListHead", null);
        setIntField(term10663, term10663.getClass(), "sourcePosition", 0);
        setField(term10663, term10663.getClass(), "jsType", null);
        setField(term10663, term10663.getClass(), "parent", null);
        setField(term10661, term10661.getClass(), "first", term10663);
        setIntField(term10664, term10664.getClass(), "type", 0);
        setField(term10664, term10664.getClass(), "next", null);
        setField(term10664, term10664.getClass(), "first", null);
        setField(term10664, term10664.getClass(), "last", null);
        setField(term10664, term10664.getClass(), "propListHead", null);
        setIntField(term10664, term10664.getClass(), "sourcePosition", 0);
        setField(term10664, term10664.getClass(), "jsType", null);
        setField(term10664, term10664.getClass(), "parent", null);
        setField(term10661, term10661.getClass(), "last", term10664);
        setField(term10661, term10661.getClass(), "propListHead", null);
        setIntField(term10661, term10661.getClass(), "sourcePosition", 0);
        setField(term10661, term10661.getClass(), "jsType", null);
        setField(term10661, term10661.getClass(), "parent", null);
        setField(term10660, term10660.getClass(), "next", term10661);
        setIntField(term10665, term10665.getClass(), "type", 0);
        setField(term10665, term10665.getClass(), "next", null);
        setField(term10665, term10665.getClass(), "first", null);
        setField(term10665, term10665.getClass(), "last", null);
        setField(term10665, term10665.getClass(), "propListHead", null);
        setIntField(term10665, term10665.getClass(), "sourcePosition", 0);
        setField(term10665, term10665.getClass(), "jsType", null);
        setField(term10665, term10665.getClass(), "parent", null);
        setField(term10660, term10660.getClass(), "first", term10665);
        setIntField(term10666, term10666.getClass(), "type", 0);
        setField(term10666, term10666.getClass(), "next", null);
        setField(term10666, term10666.getClass(), "first", null);
        setField(term10666, term10666.getClass(), "last", null);
        setField(term10666, term10666.getClass(), "propListHead", null);
        setIntField(term10666, term10666.getClass(), "sourcePosition", 0);
        setField(term10666, term10666.getClass(), "jsType", null);
        setField(term10666, term10666.getClass(), "parent", null);
        setField(term10660, term10660.getClass(), "last", term10666);
        setField(term10660, term10660.getClass(), "propListHead", null);
        setIntField(term10660, term10660.getClass(), "sourcePosition", 0);
        setField(term10660, term10660.getClass(), "jsType", null);
        setField(term10660, term10660.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1057;
        Object retValue = callMethod(klass, "isGet", argTypes, null, args);
        assertTrue(recursiveEquals(term1057, term10660));
        assertTrue(recursiveEquals(retValue, false));
    }

};


