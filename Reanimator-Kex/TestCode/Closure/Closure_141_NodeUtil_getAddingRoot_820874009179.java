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

public class NodeUtil_getAddingRoot_820874009179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2088;

    public NodeUtil_getAddingRoot_820874009179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2101 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2111 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2088, term2088.getClass(), "type", -537786484);
        setIntField(term2090, term2090.getClass(), "type", -1421649118);
        setIntField(term2092, term2092.getClass(), "type", 0);
        setField(term2092, term2092.getClass(), "next", null);
        setField(term2092, term2092.getClass(), "first", null);
        setField(term2092, term2092.getClass(), "last", null);
        setField(term2092, term2092.getClass(), "propListHead", null);
        setIntField(term2092, term2092.getClass(), "sourcePosition", 0);
        setField(term2092, term2092.getClass(), "jsType", null);
        setField(term2092, term2092.getClass(), "parent", null);
        setField(term2090, term2090.getClass(), "next", term2092);
        setIntField(term2095, term2095.getClass(), "type", 0);
        setField(term2095, term2095.getClass(), "next", null);
        setField(term2095, term2095.getClass(), "first", null);
        setField(term2095, term2095.getClass(), "last", null);
        setField(term2095, term2095.getClass(), "propListHead", null);
        setIntField(term2095, term2095.getClass(), "sourcePosition", 0);
        setField(term2095, term2095.getClass(), "jsType", null);
        setField(term2095, term2095.getClass(), "parent", null);
        setField(term2090, term2090.getClass(), "first", term2095);
        setIntField(term2098, term2098.getClass(), "type", 0);
        setField(term2098, term2098.getClass(), "next", null);
        setField(term2098, term2098.getClass(), "first", null);
        setField(term2098, term2098.getClass(), "last", null);
        setField(term2098, term2098.getClass(), "propListHead", null);
        setIntField(term2098, term2098.getClass(), "sourcePosition", 0);
        setField(term2098, term2098.getClass(), "jsType", null);
        setField(term2098, term2098.getClass(), "parent", null);
        setField(term2090, term2090.getClass(), "last", term2098);
        setField(term2101, term2101.getClass(), "next", null);
        setIntField(term2101, term2101.getClass(), "type", 0);
        setIntField(term2101, term2101.getClass(), "intValue", 0);
        setField(term2101, term2101.getClass(), "objectValue", null);
        setField(term2090, term2090.getClass(), "propListHead", term2101);
        setIntField(term2090, term2090.getClass(), "sourcePosition", 1430066560);
        setField(term2090, term2090.getClass(), "jsType", null);
        setField(term2090, term2090.getClass(), "parent", null);
        setField(term2088, term2088.getClass(), "next", term2090);
        setIntField(term2105, term2105.getClass(), "type", 0);
        setField(term2105, term2105.getClass(), "next", null);
        setField(term2105, term2105.getClass(), "first", null);
        setField(term2105, term2105.getClass(), "last", null);
        setField(term2105, term2105.getClass(), "propListHead", null);
        setIntField(term2105, term2105.getClass(), "sourcePosition", 0);
        setField(term2105, term2105.getClass(), "jsType", null);
        setField(term2105, term2105.getClass(), "parent", null);
        setField(term2088, term2088.getClass(), "first", term2105);
        setIntField(term2108, term2108.getClass(), "type", 0);
        setField(term2108, term2108.getClass(), "next", null);
        setField(term2108, term2108.getClass(), "first", null);
        setField(term2108, term2108.getClass(), "last", null);
        setField(term2108, term2108.getClass(), "propListHead", null);
        setIntField(term2108, term2108.getClass(), "sourcePosition", 0);
        setField(term2108, term2108.getClass(), "jsType", null);
        setField(term2108, term2108.getClass(), "parent", null);
        setField(term2088, term2088.getClass(), "last", term2108);
        setField(term2111, term2111.getClass(), "next", null);
        setIntField(term2111, term2111.getClass(), "type", 0);
        setIntField(term2111, term2111.getClass(), "intValue", 0);
        setField(term2111, term2111.getClass(), "objectValue", null);
        setField(term2088, term2088.getClass(), "propListHead", term2111);
        setIntField(term2088, term2088.getClass(), "sourcePosition", 836734074);
        setField(term2088, term2088.getClass(), "jsType", null);
        setField(term2088, term2088.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2088;
        try {
            callMethod(klass, "getAddingRoot", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


