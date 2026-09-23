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
import java.lang.Boolean;

public class CodeGenerator_addList_71041459251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1789;
     Object term1800;
     Object term1821;

    public CodeGenerator_addList_71041459251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1790 = new HashMap();
        term1789 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1789, term1789.getClass(), "ESCAPED_JS_STRINGS", term1790);
        setField(term1789, term1789.getClass(), "cc", null);
        setField(term1789, term1789.getClass(), "outputCharsetEncoder", null);
        term1800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1800, term1800.getClass(), "type", -1034506028);
        setIntField(term1802, term1802.getClass(), "type", -1347665717);
        setIntField(term1804, term1804.getClass(), "type", 0);
        setField(term1804, term1804.getClass(), "next", null);
        setField(term1804, term1804.getClass(), "first", null);
        setField(term1804, term1804.getClass(), "last", null);
        setField(term1804, term1804.getClass(), "propListHead", null);
        setIntField(term1804, term1804.getClass(), "sourcePosition", 0);
        setField(term1804, term1804.getClass(), "jsType", null);
        setField(term1804, term1804.getClass(), "parent", null);
        setField(term1802, term1802.getClass(), "next", term1804);
        setIntField(term1807, term1807.getClass(), "type", 0);
        setField(term1807, term1807.getClass(), "next", null);
        setField(term1807, term1807.getClass(), "first", null);
        setField(term1807, term1807.getClass(), "last", null);
        setField(term1807, term1807.getClass(), "propListHead", null);
        setIntField(term1807, term1807.getClass(), "sourcePosition", 0);
        setField(term1807, term1807.getClass(), "jsType", null);
        setField(term1807, term1807.getClass(), "parent", null);
        setField(term1802, term1802.getClass(), "first", term1807);
        setIntField(term1810, term1810.getClass(), "type", 0);
        setField(term1810, term1810.getClass(), "next", null);
        setField(term1810, term1810.getClass(), "first", null);
        setField(term1810, term1810.getClass(), "last", null);
        setField(term1810, term1810.getClass(), "propListHead", null);
        setIntField(term1810, term1810.getClass(), "sourcePosition", 0);
        setField(term1810, term1810.getClass(), "jsType", null);
        setField(term1810, term1810.getClass(), "parent", null);
        setField(term1802, term1802.getClass(), "last", term1810);
        setField(term1802, term1802.getClass(), "propListHead", null);
        setIntField(term1802, term1802.getClass(), "sourcePosition", 0);
        setField(term1802, term1802.getClass(), "jsType", null);
        setField(term1802, term1802.getClass(), "parent", null);
        setField(term1800, term1800.getClass(), "next", term1802);
        setIntField(term1814, term1814.getClass(), "type", 0);
        setField(term1814, term1814.getClass(), "next", null);
        setField(term1814, term1814.getClass(), "first", null);
        setField(term1814, term1814.getClass(), "last", null);
        setField(term1814, term1814.getClass(), "propListHead", null);
        setIntField(term1814, term1814.getClass(), "sourcePosition", 0);
        setField(term1814, term1814.getClass(), "jsType", null);
        setField(term1814, term1814.getClass(), "parent", null);
        setField(term1800, term1800.getClass(), "first", term1814);
        setIntField(term1817, term1817.getClass(), "type", 0);
        setField(term1817, term1817.getClass(), "next", null);
        setField(term1817, term1817.getClass(), "first", null);
        setField(term1817, term1817.getClass(), "last", null);
        setField(term1817, term1817.getClass(), "propListHead", null);
        setIntField(term1817, term1817.getClass(), "sourcePosition", 0);
        setField(term1817, term1817.getClass(), "jsType", null);
        setField(term1817, term1817.getClass(), "parent", null);
        setField(term1800, term1800.getClass(), "last", term1817);
        setField(term1800, term1800.getClass(), "propListHead", null);
        setIntField(term1800, term1800.getClass(), "sourcePosition", 0);
        setField(term1800, term1800.getClass(), "jsType", null);
        setField(term1800, term1800.getClass(), "parent", null);
        term1821 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1800;
        args[1] = term1821;
        try {
            callMethod(klass, "addList", argTypes, term1789, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


