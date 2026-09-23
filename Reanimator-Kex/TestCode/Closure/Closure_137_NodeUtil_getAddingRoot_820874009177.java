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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getAddingRoot_820874009177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2061;

    public NodeUtil_getAddingRoot_820874009177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2074 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2084 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2061, term2061.getClass(), "type", -979568);
        setIntField(term2063, term2063.getClass(), "type", -1742790308);
        setIntField(term2065, term2065.getClass(), "type", 0);
        setField(term2065, term2065.getClass(), "next", null);
        setField(term2065, term2065.getClass(), "first", null);
        setField(term2065, term2065.getClass(), "last", null);
        setField(term2065, term2065.getClass(), "propListHead", null);
        setIntField(term2065, term2065.getClass(), "sourcePosition", 0);
        setField(term2065, term2065.getClass(), "jsType", null);
        setField(term2065, term2065.getClass(), "parent", null);
        setField(term2063, term2063.getClass(), "next", term2065);
        setIntField(term2068, term2068.getClass(), "type", 0);
        setField(term2068, term2068.getClass(), "next", null);
        setField(term2068, term2068.getClass(), "first", null);
        setField(term2068, term2068.getClass(), "last", null);
        setField(term2068, term2068.getClass(), "propListHead", null);
        setIntField(term2068, term2068.getClass(), "sourcePosition", 0);
        setField(term2068, term2068.getClass(), "jsType", null);
        setField(term2068, term2068.getClass(), "parent", null);
        setField(term2063, term2063.getClass(), "first", term2068);
        setIntField(term2071, term2071.getClass(), "type", 0);
        setField(term2071, term2071.getClass(), "next", null);
        setField(term2071, term2071.getClass(), "first", null);
        setField(term2071, term2071.getClass(), "last", null);
        setField(term2071, term2071.getClass(), "propListHead", null);
        setIntField(term2071, term2071.getClass(), "sourcePosition", 0);
        setField(term2071, term2071.getClass(), "jsType", null);
        setField(term2071, term2071.getClass(), "parent", null);
        setField(term2063, term2063.getClass(), "last", term2071);
        setField(term2074, term2074.getClass(), "next", null);
        setIntField(term2074, term2074.getClass(), "type", 0);
        setIntField(term2074, term2074.getClass(), "intValue", 0);
        setField(term2074, term2074.getClass(), "objectValue", null);
        setField(term2063, term2063.getClass(), "propListHead", term2074);
        setIntField(term2063, term2063.getClass(), "sourcePosition", -985334541);
        setField(term2063, term2063.getClass(), "jsType", null);
        setField(term2063, term2063.getClass(), "parent", null);
        setField(term2061, term2061.getClass(), "next", term2063);
        setIntField(term2078, term2078.getClass(), "type", 0);
        setField(term2078, term2078.getClass(), "next", null);
        setField(term2078, term2078.getClass(), "first", null);
        setField(term2078, term2078.getClass(), "last", null);
        setField(term2078, term2078.getClass(), "propListHead", null);
        setIntField(term2078, term2078.getClass(), "sourcePosition", 0);
        setField(term2078, term2078.getClass(), "jsType", null);
        setField(term2078, term2078.getClass(), "parent", null);
        setField(term2061, term2061.getClass(), "first", term2078);
        setIntField(term2081, term2081.getClass(), "type", 0);
        setField(term2081, term2081.getClass(), "next", null);
        setField(term2081, term2081.getClass(), "first", null);
        setField(term2081, term2081.getClass(), "last", null);
        setField(term2081, term2081.getClass(), "propListHead", null);
        setIntField(term2081, term2081.getClass(), "sourcePosition", 0);
        setField(term2081, term2081.getClass(), "jsType", null);
        setField(term2081, term2081.getClass(), "parent", null);
        setField(term2061, term2061.getClass(), "last", term2081);
        setField(term2084, term2084.getClass(), "next", null);
        setIntField(term2084, term2084.getClass(), "type", 0);
        setIntField(term2084, term2084.getClass(), "intValue", 0);
        setField(term2084, term2084.getClass(), "objectValue", null);
        setField(term2061, term2061.getClass(), "propListHead", term2084);
        setIntField(term2061, term2061.getClass(), "sourcePosition", -1870004228);
        setField(term2061, term2061.getClass(), "jsType", null);
        setField(term2061, term2061.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2061;
        try {
            callMethod(klass, "getAddingRoot", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


