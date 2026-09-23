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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionBody_1855640240240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1792;

    public NodeUtil_getFunctionBody_1855640240240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1792, term1792.getClass(), "type", 654195547);
        setIntField(term1794, term1794.getClass(), "type", -944986533);
        setIntField(term1796, term1796.getClass(), "type", 0);
        setField(term1796, term1796.getClass(), "next", null);
        setField(term1796, term1796.getClass(), "first", null);
        setField(term1796, term1796.getClass(), "last", null);
        setField(term1796, term1796.getClass(), "propListHead", null);
        setIntField(term1796, term1796.getClass(), "sourcePosition", 0);
        setField(term1796, term1796.getClass(), "jsType", null);
        setField(term1796, term1796.getClass(), "parent", null);
        setField(term1794, term1794.getClass(), "next", term1796);
        setIntField(term1799, term1799.getClass(), "type", 0);
        setField(term1799, term1799.getClass(), "next", null);
        setField(term1799, term1799.getClass(), "first", null);
        setField(term1799, term1799.getClass(), "last", null);
        setField(term1799, term1799.getClass(), "propListHead", null);
        setIntField(term1799, term1799.getClass(), "sourcePosition", 0);
        setField(term1799, term1799.getClass(), "jsType", null);
        setField(term1799, term1799.getClass(), "parent", null);
        setField(term1794, term1794.getClass(), "first", term1799);
        setIntField(term1802, term1802.getClass(), "type", 0);
        setField(term1802, term1802.getClass(), "next", null);
        setField(term1802, term1802.getClass(), "first", null);
        setField(term1802, term1802.getClass(), "last", null);
        setField(term1802, term1802.getClass(), "propListHead", null);
        setIntField(term1802, term1802.getClass(), "sourcePosition", 0);
        setField(term1802, term1802.getClass(), "jsType", null);
        setField(term1802, term1802.getClass(), "parent", null);
        setField(term1794, term1794.getClass(), "last", term1802);
        setField(term1794, term1794.getClass(), "propListHead", null);
        setIntField(term1794, term1794.getClass(), "sourcePosition", 0);
        setField(term1794, term1794.getClass(), "jsType", null);
        setField(term1794, term1794.getClass(), "parent", null);
        setField(term1792, term1792.getClass(), "next", term1794);
        setIntField(term1806, term1806.getClass(), "type", 0);
        setField(term1806, term1806.getClass(), "next", null);
        setField(term1806, term1806.getClass(), "first", null);
        setField(term1806, term1806.getClass(), "last", null);
        setField(term1806, term1806.getClass(), "propListHead", null);
        setIntField(term1806, term1806.getClass(), "sourcePosition", 0);
        setField(term1806, term1806.getClass(), "jsType", null);
        setField(term1806, term1806.getClass(), "parent", null);
        setField(term1792, term1792.getClass(), "first", term1806);
        setIntField(term1809, term1809.getClass(), "type", 0);
        setField(term1809, term1809.getClass(), "next", null);
        setField(term1809, term1809.getClass(), "first", null);
        setField(term1809, term1809.getClass(), "last", null);
        setField(term1809, term1809.getClass(), "propListHead", null);
        setIntField(term1809, term1809.getClass(), "sourcePosition", 0);
        setField(term1809, term1809.getClass(), "jsType", null);
        setField(term1809, term1809.getClass(), "parent", null);
        setField(term1792, term1792.getClass(), "last", term1809);
        setField(term1792, term1792.getClass(), "propListHead", null);
        setIntField(term1792, term1792.getClass(), "sourcePosition", 0);
        setField(term1792, term1792.getClass(), "jsType", null);
        setField(term1792, term1792.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1792;
        try {
            callMethod(klass, "getFunctionBody", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


