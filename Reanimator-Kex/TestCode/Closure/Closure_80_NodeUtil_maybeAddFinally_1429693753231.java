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
import java.lang.Object;

public class NodeUtil_maybeAddFinally_1429693753231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2108;

    public NodeUtil_maybeAddFinally_1429693753231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2121 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2131 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2108, term2108.getClass(), "type", 380484139);
        setIntField(term2110, term2110.getClass(), "type", 263859424);
        setIntField(term2112, term2112.getClass(), "type", 0);
        setField(term2112, term2112.getClass(), "next", null);
        setField(term2112, term2112.getClass(), "first", null);
        setField(term2112, term2112.getClass(), "last", null);
        setField(term2112, term2112.getClass(), "propListHead", null);
        setIntField(term2112, term2112.getClass(), "sourcePosition", 0);
        setField(term2112, term2112.getClass(), "jsType", null);
        setField(term2112, term2112.getClass(), "parent", null);
        setField(term2110, term2110.getClass(), "next", term2112);
        setIntField(term2115, term2115.getClass(), "type", 0);
        setField(term2115, term2115.getClass(), "next", null);
        setField(term2115, term2115.getClass(), "first", null);
        setField(term2115, term2115.getClass(), "last", null);
        setField(term2115, term2115.getClass(), "propListHead", null);
        setIntField(term2115, term2115.getClass(), "sourcePosition", 0);
        setField(term2115, term2115.getClass(), "jsType", null);
        setField(term2115, term2115.getClass(), "parent", null);
        setField(term2110, term2110.getClass(), "first", term2115);
        setIntField(term2118, term2118.getClass(), "type", 0);
        setField(term2118, term2118.getClass(), "next", null);
        setField(term2118, term2118.getClass(), "first", null);
        setField(term2118, term2118.getClass(), "last", null);
        setField(term2118, term2118.getClass(), "propListHead", null);
        setIntField(term2118, term2118.getClass(), "sourcePosition", 0);
        setField(term2118, term2118.getClass(), "jsType", null);
        setField(term2118, term2118.getClass(), "parent", null);
        setField(term2110, term2110.getClass(), "last", term2118);
        setField(term2121, term2121.getClass(), "next", null);
        setIntField(term2121, term2121.getClass(), "type", 0);
        setIntField(term2121, term2121.getClass(), "intValue", 0);
        setField(term2121, term2121.getClass(), "objectValue", null);
        setField(term2110, term2110.getClass(), "propListHead", term2121);
        setIntField(term2110, term2110.getClass(), "sourcePosition", -1421649118);
        setField(term2110, term2110.getClass(), "jsType", null);
        setField(term2110, term2110.getClass(), "parent", null);
        setField(term2108, term2108.getClass(), "next", term2110);
        setIntField(term2125, term2125.getClass(), "type", 0);
        setField(term2125, term2125.getClass(), "next", null);
        setField(term2125, term2125.getClass(), "first", null);
        setField(term2125, term2125.getClass(), "last", null);
        setField(term2125, term2125.getClass(), "propListHead", null);
        setIntField(term2125, term2125.getClass(), "sourcePosition", 0);
        setField(term2125, term2125.getClass(), "jsType", null);
        setField(term2125, term2125.getClass(), "parent", null);
        setField(term2108, term2108.getClass(), "first", term2125);
        setIntField(term2128, term2128.getClass(), "type", 0);
        setField(term2128, term2128.getClass(), "next", null);
        setField(term2128, term2128.getClass(), "first", null);
        setField(term2128, term2128.getClass(), "last", null);
        setField(term2128, term2128.getClass(), "propListHead", null);
        setIntField(term2128, term2128.getClass(), "sourcePosition", 0);
        setField(term2128, term2128.getClass(), "jsType", null);
        setField(term2128, term2128.getClass(), "parent", null);
        setField(term2108, term2108.getClass(), "last", term2128);
        setField(term2131, term2131.getClass(), "next", null);
        setIntField(term2131, term2131.getClass(), "type", 0);
        setIntField(term2131, term2131.getClass(), "intValue", 0);
        setField(term2131, term2131.getClass(), "objectValue", null);
        setField(term2108, term2108.getClass(), "propListHead", term2131);
        setIntField(term2108, term2108.getClass(), "sourcePosition", -511248284);
        setField(term2108, term2108.getClass(), "jsType", null);
        setField(term2108, term2108.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2108;
        try {
            callMethod(klass, "maybeAddFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


