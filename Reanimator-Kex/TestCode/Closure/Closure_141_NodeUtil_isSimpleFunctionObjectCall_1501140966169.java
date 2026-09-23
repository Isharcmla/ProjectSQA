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

public class NodeUtil_isSimpleFunctionObjectCall_1501140966169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1781;
     Object term10391;

    public NodeUtil_isSimpleFunctionObjectCall_1501140966169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1794 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1804 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1781, term1781.getClass(), "type", -1288536479);
        setIntField(term1783, term1783.getClass(), "type", -1933419449);
        setIntField(term1785, term1785.getClass(), "type", 0);
        setField(term1785, term1785.getClass(), "next", null);
        setField(term1785, term1785.getClass(), "first", null);
        setField(term1785, term1785.getClass(), "last", null);
        setField(term1785, term1785.getClass(), "propListHead", null);
        setIntField(term1785, term1785.getClass(), "sourcePosition", 0);
        setField(term1785, term1785.getClass(), "jsType", null);
        setField(term1785, term1785.getClass(), "parent", null);
        setField(term1783, term1783.getClass(), "next", term1785);
        setIntField(term1788, term1788.getClass(), "type", 0);
        setField(term1788, term1788.getClass(), "next", null);
        setField(term1788, term1788.getClass(), "first", null);
        setField(term1788, term1788.getClass(), "last", null);
        setField(term1788, term1788.getClass(), "propListHead", null);
        setIntField(term1788, term1788.getClass(), "sourcePosition", 0);
        setField(term1788, term1788.getClass(), "jsType", null);
        setField(term1788, term1788.getClass(), "parent", null);
        setField(term1783, term1783.getClass(), "first", term1788);
        setIntField(term1791, term1791.getClass(), "type", 0);
        setField(term1791, term1791.getClass(), "next", null);
        setField(term1791, term1791.getClass(), "first", null);
        setField(term1791, term1791.getClass(), "last", null);
        setField(term1791, term1791.getClass(), "propListHead", null);
        setIntField(term1791, term1791.getClass(), "sourcePosition", 0);
        setField(term1791, term1791.getClass(), "jsType", null);
        setField(term1791, term1791.getClass(), "parent", null);
        setField(term1783, term1783.getClass(), "last", term1791);
        setField(term1794, term1794.getClass(), "next", null);
        setIntField(term1794, term1794.getClass(), "type", 0);
        setIntField(term1794, term1794.getClass(), "intValue", 0);
        setField(term1794, term1794.getClass(), "objectValue", null);
        setField(term1783, term1783.getClass(), "propListHead", term1794);
        setIntField(term1783, term1783.getClass(), "sourcePosition", -834193529);
        setField(term1783, term1783.getClass(), "jsType", null);
        setField(term1783, term1783.getClass(), "parent", null);
        setField(term1781, term1781.getClass(), "next", term1783);
        setIntField(term1798, term1798.getClass(), "type", 0);
        setField(term1798, term1798.getClass(), "next", null);
        setField(term1798, term1798.getClass(), "first", null);
        setField(term1798, term1798.getClass(), "last", null);
        setField(term1798, term1798.getClass(), "propListHead", null);
        setIntField(term1798, term1798.getClass(), "sourcePosition", 0);
        setField(term1798, term1798.getClass(), "jsType", null);
        setField(term1798, term1798.getClass(), "parent", null);
        setField(term1781, term1781.getClass(), "first", term1798);
        setIntField(term1801, term1801.getClass(), "type", 0);
        setField(term1801, term1801.getClass(), "next", null);
        setField(term1801, term1801.getClass(), "first", null);
        setField(term1801, term1801.getClass(), "last", null);
        setField(term1801, term1801.getClass(), "propListHead", null);
        setIntField(term1801, term1801.getClass(), "sourcePosition", 0);
        setField(term1801, term1801.getClass(), "jsType", null);
        setField(term1801, term1801.getClass(), "parent", null);
        setField(term1781, term1781.getClass(), "last", term1801);
        setField(term1804, term1804.getClass(), "next", null);
        setIntField(term1804, term1804.getClass(), "type", 0);
        setIntField(term1804, term1804.getClass(), "intValue", 0);
        setField(term1804, term1804.getClass(), "objectValue", null);
        setField(term1781, term1781.getClass(), "propListHead", term1804);
        setIntField(term1781, term1781.getClass(), "sourcePosition", 335780735);
        setField(term1781, term1781.getClass(), "jsType", null);
        setField(term1781, term1781.getClass(), "parent", null);
        term10391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10396 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10399 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10391, term10391.getClass(), "type", -1288536479);
        setIntField(term10392, term10392.getClass(), "type", -1933419449);
        setIntField(term10393, term10393.getClass(), "type", 0);
        setField(term10393, term10393.getClass(), "next", null);
        setField(term10393, term10393.getClass(), "first", null);
        setField(term10393, term10393.getClass(), "last", null);
        setField(term10393, term10393.getClass(), "propListHead", null);
        setIntField(term10393, term10393.getClass(), "sourcePosition", 0);
        setField(term10393, term10393.getClass(), "jsType", null);
        setField(term10393, term10393.getClass(), "parent", null);
        setField(term10392, term10392.getClass(), "next", term10393);
        setIntField(term10394, term10394.getClass(), "type", 0);
        setField(term10394, term10394.getClass(), "next", null);
        setField(term10394, term10394.getClass(), "first", null);
        setField(term10394, term10394.getClass(), "last", null);
        setField(term10394, term10394.getClass(), "propListHead", null);
        setIntField(term10394, term10394.getClass(), "sourcePosition", 0);
        setField(term10394, term10394.getClass(), "jsType", null);
        setField(term10394, term10394.getClass(), "parent", null);
        setField(term10392, term10392.getClass(), "first", term10394);
        setIntField(term10395, term10395.getClass(), "type", 0);
        setField(term10395, term10395.getClass(), "next", null);
        setField(term10395, term10395.getClass(), "first", null);
        setField(term10395, term10395.getClass(), "last", null);
        setField(term10395, term10395.getClass(), "propListHead", null);
        setIntField(term10395, term10395.getClass(), "sourcePosition", 0);
        setField(term10395, term10395.getClass(), "jsType", null);
        setField(term10395, term10395.getClass(), "parent", null);
        setField(term10392, term10392.getClass(), "last", term10395);
        setField(term10396, term10396.getClass(), "next", null);
        setIntField(term10396, term10396.getClass(), "type", 0);
        setIntField(term10396, term10396.getClass(), "intValue", 0);
        setField(term10396, term10396.getClass(), "objectValue", null);
        setField(term10392, term10392.getClass(), "propListHead", term10396);
        setIntField(term10392, term10392.getClass(), "sourcePosition", -834193529);
        setField(term10392, term10392.getClass(), "jsType", null);
        setField(term10392, term10392.getClass(), "parent", null);
        setField(term10391, term10391.getClass(), "next", term10392);
        setIntField(term10397, term10397.getClass(), "type", 0);
        setField(term10397, term10397.getClass(), "next", null);
        setField(term10397, term10397.getClass(), "first", null);
        setField(term10397, term10397.getClass(), "last", null);
        setField(term10397, term10397.getClass(), "propListHead", null);
        setIntField(term10397, term10397.getClass(), "sourcePosition", 0);
        setField(term10397, term10397.getClass(), "jsType", null);
        setField(term10397, term10397.getClass(), "parent", null);
        setField(term10391, term10391.getClass(), "first", term10397);
        setIntField(term10398, term10398.getClass(), "type", 0);
        setField(term10398, term10398.getClass(), "next", null);
        setField(term10398, term10398.getClass(), "first", null);
        setField(term10398, term10398.getClass(), "last", null);
        setField(term10398, term10398.getClass(), "propListHead", null);
        setIntField(term10398, term10398.getClass(), "sourcePosition", 0);
        setField(term10398, term10398.getClass(), "jsType", null);
        setField(term10398, term10398.getClass(), "parent", null);
        setField(term10391, term10391.getClass(), "last", term10398);
        setField(term10399, term10399.getClass(), "next", null);
        setIntField(term10399, term10399.getClass(), "type", 0);
        setIntField(term10399, term10399.getClass(), "intValue", 0);
        setField(term10399, term10399.getClass(), "objectValue", null);
        setField(term10391, term10391.getClass(), "propListHead", term10399);
        setIntField(term10391, term10391.getClass(), "sourcePosition", 335780735);
        setField(term10391, term10391.getClass(), "jsType", null);
        setField(term10391, term10391.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1781;
        Object retValue = callMethod(klass, "isSimpleFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1781, term10391));
        assertTrue(recursiveEquals(retValue, false));
    }

};


