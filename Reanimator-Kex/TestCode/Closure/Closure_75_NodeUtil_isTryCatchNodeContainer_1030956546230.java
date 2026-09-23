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

public class NodeUtil_isTryCatchNodeContainer_1030956546230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2054;

    public NodeUtil_isTryCatchNodeContainer_1030956546230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2067 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2077 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2054, term2054.getClass(), "type", 1795369860);
        setIntField(term2056, term2056.getClass(), "type", 953741504);
        setIntField(term2058, term2058.getClass(), "type", 0);
        setField(term2058, term2058.getClass(), "next", null);
        setField(term2058, term2058.getClass(), "first", null);
        setField(term2058, term2058.getClass(), "last", null);
        setField(term2058, term2058.getClass(), "propListHead", null);
        setIntField(term2058, term2058.getClass(), "sourcePosition", 0);
        setField(term2058, term2058.getClass(), "jsType", null);
        setField(term2058, term2058.getClass(), "parent", null);
        setField(term2056, term2056.getClass(), "next", term2058);
        setIntField(term2061, term2061.getClass(), "type", 0);
        setField(term2061, term2061.getClass(), "next", null);
        setField(term2061, term2061.getClass(), "first", null);
        setField(term2061, term2061.getClass(), "last", null);
        setField(term2061, term2061.getClass(), "propListHead", null);
        setIntField(term2061, term2061.getClass(), "sourcePosition", 0);
        setField(term2061, term2061.getClass(), "jsType", null);
        setField(term2061, term2061.getClass(), "parent", null);
        setField(term2056, term2056.getClass(), "first", term2061);
        setIntField(term2064, term2064.getClass(), "type", 0);
        setField(term2064, term2064.getClass(), "next", null);
        setField(term2064, term2064.getClass(), "first", null);
        setField(term2064, term2064.getClass(), "last", null);
        setField(term2064, term2064.getClass(), "propListHead", null);
        setIntField(term2064, term2064.getClass(), "sourcePosition", 0);
        setField(term2064, term2064.getClass(), "jsType", null);
        setField(term2064, term2064.getClass(), "parent", null);
        setField(term2056, term2056.getClass(), "last", term2064);
        setField(term2067, term2067.getClass(), "next", null);
        setIntField(term2067, term2067.getClass(), "type", 0);
        setIntField(term2067, term2067.getClass(), "intValue", 0);
        setField(term2067, term2067.getClass(), "objectValue", null);
        setField(term2056, term2056.getClass(), "propListHead", term2067);
        setIntField(term2056, term2056.getClass(), "sourcePosition", 1779370220);
        setField(term2056, term2056.getClass(), "jsType", null);
        setField(term2056, term2056.getClass(), "parent", null);
        setField(term2054, term2054.getClass(), "next", term2056);
        setIntField(term2071, term2071.getClass(), "type", 0);
        setField(term2071, term2071.getClass(), "next", null);
        setField(term2071, term2071.getClass(), "first", null);
        setField(term2071, term2071.getClass(), "last", null);
        setField(term2071, term2071.getClass(), "propListHead", null);
        setIntField(term2071, term2071.getClass(), "sourcePosition", 0);
        setField(term2071, term2071.getClass(), "jsType", null);
        setField(term2071, term2071.getClass(), "parent", null);
        setField(term2054, term2054.getClass(), "first", term2071);
        setIntField(term2074, term2074.getClass(), "type", 0);
        setField(term2074, term2074.getClass(), "next", null);
        setField(term2074, term2074.getClass(), "first", null);
        setField(term2074, term2074.getClass(), "last", null);
        setField(term2074, term2074.getClass(), "propListHead", null);
        setIntField(term2074, term2074.getClass(), "sourcePosition", 0);
        setField(term2074, term2074.getClass(), "jsType", null);
        setField(term2074, term2074.getClass(), "parent", null);
        setField(term2054, term2054.getClass(), "last", term2074);
        setField(term2077, term2077.getClass(), "next", null);
        setIntField(term2077, term2077.getClass(), "type", 0);
        setIntField(term2077, term2077.getClass(), "intValue", 0);
        setField(term2077, term2077.getClass(), "objectValue", null);
        setField(term2054, term2054.getClass(), "propListHead", term2077);
        setIntField(term2054, term2054.getClass(), "sourcePosition", -1716046610);
        setField(term2054, term2054.getClass(), "jsType", null);
        setField(term2054, term2054.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2054;
        try {
            callMethod(klass, "isTryCatchNodeContainer", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


