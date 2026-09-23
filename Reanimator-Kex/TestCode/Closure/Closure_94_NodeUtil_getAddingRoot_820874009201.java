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

public class NodeUtil_getAddingRoot_820874009201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304;

    public NodeUtil_getAddingRoot_820874009201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2317 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2327 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2304, term2304.getClass(), "type", -1767079160);
        setIntField(term2306, term2306.getClass(), "type", 314478878);
        setIntField(term2308, term2308.getClass(), "type", 0);
        setField(term2308, term2308.getClass(), "next", null);
        setField(term2308, term2308.getClass(), "first", null);
        setField(term2308, term2308.getClass(), "last", null);
        setField(term2308, term2308.getClass(), "propListHead", null);
        setIntField(term2308, term2308.getClass(), "sourcePosition", 0);
        setField(term2308, term2308.getClass(), "jsType", null);
        setField(term2308, term2308.getClass(), "parent", null);
        setField(term2306, term2306.getClass(), "next", term2308);
        setIntField(term2311, term2311.getClass(), "type", 0);
        setField(term2311, term2311.getClass(), "next", null);
        setField(term2311, term2311.getClass(), "first", null);
        setField(term2311, term2311.getClass(), "last", null);
        setField(term2311, term2311.getClass(), "propListHead", null);
        setIntField(term2311, term2311.getClass(), "sourcePosition", 0);
        setField(term2311, term2311.getClass(), "jsType", null);
        setField(term2311, term2311.getClass(), "parent", null);
        setField(term2306, term2306.getClass(), "first", term2311);
        setIntField(term2314, term2314.getClass(), "type", 0);
        setField(term2314, term2314.getClass(), "next", null);
        setField(term2314, term2314.getClass(), "first", null);
        setField(term2314, term2314.getClass(), "last", null);
        setField(term2314, term2314.getClass(), "propListHead", null);
        setIntField(term2314, term2314.getClass(), "sourcePosition", 0);
        setField(term2314, term2314.getClass(), "jsType", null);
        setField(term2314, term2314.getClass(), "parent", null);
        setField(term2306, term2306.getClass(), "last", term2314);
        setField(term2317, term2317.getClass(), "next", null);
        setIntField(term2317, term2317.getClass(), "type", 0);
        setIntField(term2317, term2317.getClass(), "intValue", 0);
        setField(term2317, term2317.getClass(), "objectValue", null);
        setField(term2306, term2306.getClass(), "propListHead", term2317);
        setIntField(term2306, term2306.getClass(), "sourcePosition", -524352937);
        setField(term2306, term2306.getClass(), "jsType", null);
        setField(term2306, term2306.getClass(), "parent", null);
        setField(term2304, term2304.getClass(), "next", term2306);
        setIntField(term2321, term2321.getClass(), "type", 0);
        setField(term2321, term2321.getClass(), "next", null);
        setField(term2321, term2321.getClass(), "first", null);
        setField(term2321, term2321.getClass(), "last", null);
        setField(term2321, term2321.getClass(), "propListHead", null);
        setIntField(term2321, term2321.getClass(), "sourcePosition", 0);
        setField(term2321, term2321.getClass(), "jsType", null);
        setField(term2321, term2321.getClass(), "parent", null);
        setField(term2304, term2304.getClass(), "first", term2321);
        setIntField(term2324, term2324.getClass(), "type", 0);
        setField(term2324, term2324.getClass(), "next", null);
        setField(term2324, term2324.getClass(), "first", null);
        setField(term2324, term2324.getClass(), "last", null);
        setField(term2324, term2324.getClass(), "propListHead", null);
        setIntField(term2324, term2324.getClass(), "sourcePosition", 0);
        setField(term2324, term2324.getClass(), "jsType", null);
        setField(term2324, term2324.getClass(), "parent", null);
        setField(term2304, term2304.getClass(), "last", term2324);
        setField(term2327, term2327.getClass(), "next", null);
        setIntField(term2327, term2327.getClass(), "type", 0);
        setIntField(term2327, term2327.getClass(), "intValue", 0);
        setField(term2327, term2327.getClass(), "objectValue", null);
        setField(term2304, term2304.getClass(), "propListHead", term2327);
        setIntField(term2304, term2304.getClass(), "sourcePosition", 1472218987);
        setField(term2304, term2304.getClass(), "jsType", null);
        setField(term2304, term2304.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2304;
        try {
            callMethod(klass, "getAddingRoot", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


