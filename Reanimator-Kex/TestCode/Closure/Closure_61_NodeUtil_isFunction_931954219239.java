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

public class NodeUtil_isFunction_931954219239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1771;
     Object term13730;

    public NodeUtil_isFunction_931954219239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1771, term1771.getClass(), "type", 1868344256);
        setIntField(term1773, term1773.getClass(), "type", -932147928);
        setIntField(term1775, term1775.getClass(), "type", 0);
        setField(term1775, term1775.getClass(), "next", null);
        setField(term1775, term1775.getClass(), "first", null);
        setField(term1775, term1775.getClass(), "last", null);
        setField(term1775, term1775.getClass(), "propListHead", null);
        setIntField(term1775, term1775.getClass(), "sourcePosition", 0);
        setField(term1775, term1775.getClass(), "jsType", null);
        setField(term1775, term1775.getClass(), "parent", null);
        setField(term1773, term1773.getClass(), "next", term1775);
        setIntField(term1778, term1778.getClass(), "type", 0);
        setField(term1778, term1778.getClass(), "next", null);
        setField(term1778, term1778.getClass(), "first", null);
        setField(term1778, term1778.getClass(), "last", null);
        setField(term1778, term1778.getClass(), "propListHead", null);
        setIntField(term1778, term1778.getClass(), "sourcePosition", 0);
        setField(term1778, term1778.getClass(), "jsType", null);
        setField(term1778, term1778.getClass(), "parent", null);
        setField(term1773, term1773.getClass(), "first", term1778);
        setIntField(term1781, term1781.getClass(), "type", 0);
        setField(term1781, term1781.getClass(), "next", null);
        setField(term1781, term1781.getClass(), "first", null);
        setField(term1781, term1781.getClass(), "last", null);
        setField(term1781, term1781.getClass(), "propListHead", null);
        setIntField(term1781, term1781.getClass(), "sourcePosition", 0);
        setField(term1781, term1781.getClass(), "jsType", null);
        setField(term1781, term1781.getClass(), "parent", null);
        setField(term1773, term1773.getClass(), "last", term1781);
        setField(term1773, term1773.getClass(), "propListHead", null);
        setIntField(term1773, term1773.getClass(), "sourcePosition", 0);
        setField(term1773, term1773.getClass(), "jsType", null);
        setField(term1773, term1773.getClass(), "parent", null);
        setField(term1771, term1771.getClass(), "next", term1773);
        setIntField(term1785, term1785.getClass(), "type", 0);
        setField(term1785, term1785.getClass(), "next", null);
        setField(term1785, term1785.getClass(), "first", null);
        setField(term1785, term1785.getClass(), "last", null);
        setField(term1785, term1785.getClass(), "propListHead", null);
        setIntField(term1785, term1785.getClass(), "sourcePosition", 0);
        setField(term1785, term1785.getClass(), "jsType", null);
        setField(term1785, term1785.getClass(), "parent", null);
        setField(term1771, term1771.getClass(), "first", term1785);
        setIntField(term1788, term1788.getClass(), "type", 0);
        setField(term1788, term1788.getClass(), "next", null);
        setField(term1788, term1788.getClass(), "first", null);
        setField(term1788, term1788.getClass(), "last", null);
        setField(term1788, term1788.getClass(), "propListHead", null);
        setIntField(term1788, term1788.getClass(), "sourcePosition", 0);
        setField(term1788, term1788.getClass(), "jsType", null);
        setField(term1788, term1788.getClass(), "parent", null);
        setField(term1771, term1771.getClass(), "last", term1788);
        setField(term1771, term1771.getClass(), "propListHead", null);
        setIntField(term1771, term1771.getClass(), "sourcePosition", 0);
        setField(term1771, term1771.getClass(), "jsType", null);
        setField(term1771, term1771.getClass(), "parent", null);
        term13730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13730, term13730.getClass(), "type", 1868344256);
        setIntField(term13731, term13731.getClass(), "type", -932147928);
        setIntField(term13732, term13732.getClass(), "type", 0);
        setField(term13732, term13732.getClass(), "next", null);
        setField(term13732, term13732.getClass(), "first", null);
        setField(term13732, term13732.getClass(), "last", null);
        setField(term13732, term13732.getClass(), "propListHead", null);
        setIntField(term13732, term13732.getClass(), "sourcePosition", 0);
        setField(term13732, term13732.getClass(), "jsType", null);
        setField(term13732, term13732.getClass(), "parent", null);
        setField(term13731, term13731.getClass(), "next", term13732);
        setIntField(term13733, term13733.getClass(), "type", 0);
        setField(term13733, term13733.getClass(), "next", null);
        setField(term13733, term13733.getClass(), "first", null);
        setField(term13733, term13733.getClass(), "last", null);
        setField(term13733, term13733.getClass(), "propListHead", null);
        setIntField(term13733, term13733.getClass(), "sourcePosition", 0);
        setField(term13733, term13733.getClass(), "jsType", null);
        setField(term13733, term13733.getClass(), "parent", null);
        setField(term13731, term13731.getClass(), "first", term13733);
        setIntField(term13734, term13734.getClass(), "type", 0);
        setField(term13734, term13734.getClass(), "next", null);
        setField(term13734, term13734.getClass(), "first", null);
        setField(term13734, term13734.getClass(), "last", null);
        setField(term13734, term13734.getClass(), "propListHead", null);
        setIntField(term13734, term13734.getClass(), "sourcePosition", 0);
        setField(term13734, term13734.getClass(), "jsType", null);
        setField(term13734, term13734.getClass(), "parent", null);
        setField(term13731, term13731.getClass(), "last", term13734);
        setField(term13731, term13731.getClass(), "propListHead", null);
        setIntField(term13731, term13731.getClass(), "sourcePosition", 0);
        setField(term13731, term13731.getClass(), "jsType", null);
        setField(term13731, term13731.getClass(), "parent", null);
        setField(term13730, term13730.getClass(), "next", term13731);
        setIntField(term13735, term13735.getClass(), "type", 0);
        setField(term13735, term13735.getClass(), "next", null);
        setField(term13735, term13735.getClass(), "first", null);
        setField(term13735, term13735.getClass(), "last", null);
        setField(term13735, term13735.getClass(), "propListHead", null);
        setIntField(term13735, term13735.getClass(), "sourcePosition", 0);
        setField(term13735, term13735.getClass(), "jsType", null);
        setField(term13735, term13735.getClass(), "parent", null);
        setField(term13730, term13730.getClass(), "first", term13735);
        setIntField(term13736, term13736.getClass(), "type", 0);
        setField(term13736, term13736.getClass(), "next", null);
        setField(term13736, term13736.getClass(), "first", null);
        setField(term13736, term13736.getClass(), "last", null);
        setField(term13736, term13736.getClass(), "propListHead", null);
        setIntField(term13736, term13736.getClass(), "sourcePosition", 0);
        setField(term13736, term13736.getClass(), "jsType", null);
        setField(term13736, term13736.getClass(), "parent", null);
        setField(term13730, term13730.getClass(), "last", term13736);
        setField(term13730, term13730.getClass(), "propListHead", null);
        setIntField(term13730, term13730.getClass(), "sourcePosition", 0);
        setField(term13730, term13730.getClass(), "jsType", null);
        setField(term13730, term13730.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1771;
        Object retValue = callMethod(klass, "isFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1771, term13730));
        assertTrue(recursiveEquals(retValue, false));
    }

};


