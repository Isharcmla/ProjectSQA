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

public class NodeUtil_getFunctionBody_1855640240233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2058;

    public NodeUtil_getFunctionBody_1855640240233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2058, term2058.getClass(), "type", 852806940);
        setIntField(term2060, term2060.getClass(), "type", 698551724);
        setIntField(term2062, term2062.getClass(), "type", -1631048635);
        setIntField(term2064, term2064.getClass(), "type", 1342808731);
        setIntField(term2066, term2066.getClass(), "type", -64893740);
        setField(term2066, term2066.getClass(), "next", null);
        setField(term2066, term2066.getClass(), "first", null);
        setField(term2066, term2066.getClass(), "last", null);
        setField(term2066, term2066.getClass(), "propListHead", null);
        setIntField(term2066, term2066.getClass(), "sourcePosition", 0);
        setField(term2066, term2066.getClass(), "jsType", null);
        setField(term2066, term2066.getClass(), "parent", null);
        setField(term2064, term2064.getClass(), "next", term2066);
        setIntField(term2069, term2069.getClass(), "type", -222012928);
        setField(term2069, term2069.getClass(), "next", null);
        setField(term2069, term2069.getClass(), "first", null);
        setField(term2069, term2069.getClass(), "last", term2066);
        setField(term2069, term2069.getClass(), "propListHead", null);
        setIntField(term2069, term2069.getClass(), "sourcePosition", 0);
        setField(term2069, term2069.getClass(), "jsType", null);
        setField(term2069, term2069.getClass(), "parent", null);
        setField(term2064, term2064.getClass(), "first", term2069);
        setField(term2064, term2064.getClass(), "last", term2062);
        setField(term2064, term2064.getClass(), "propListHead", null);
        setIntField(term2064, term2064.getClass(), "sourcePosition", 0);
        setField(term2064, term2064.getClass(), "jsType", null);
        setField(term2064, term2064.getClass(), "parent", null);
        setField(term2062, term2062.getClass(), "next", term2064);
        setField(term2062, term2062.getClass(), "first", term2066);
        setIntField(term2073, term2073.getClass(), "type", -83178716);
        setIntField(term2075, term2075.getClass(), "type", -1292704466);
        setField(term2075, term2075.getClass(), "next", null);
        setField(term2075, term2075.getClass(), "first", term2069);
        setField(term2075, term2075.getClass(), "last", term2064);
        setField(term2075, term2075.getClass(), "propListHead", null);
        setIntField(term2075, term2075.getClass(), "sourcePosition", 0);
        setField(term2075, term2075.getClass(), "jsType", null);
        setField(term2075, term2075.getClass(), "parent", null);
        setField(term2073, term2073.getClass(), "next", term2075);
        setField(term2073, term2073.getClass(), "first", term2060);
        setField(term2073, term2073.getClass(), "last", term2060);
        setField(term2073, term2073.getClass(), "propListHead", null);
        setIntField(term2073, term2073.getClass(), "sourcePosition", 0);
        setField(term2073, term2073.getClass(), "jsType", null);
        setField(term2073, term2073.getClass(), "parent", null);
        setField(term2062, term2062.getClass(), "last", term2073);
        setField(term2062, term2062.getClass(), "propListHead", null);
        setIntField(term2062, term2062.getClass(), "sourcePosition", 0);
        setField(term2062, term2062.getClass(), "jsType", null);
        setField(term2062, term2062.getClass(), "parent", null);
        setField(term2060, term2060.getClass(), "next", term2062);
        setIntField(term2080, term2080.getClass(), "type", 1991858584);
        setField(term2080, term2080.getClass(), "next", term2073);
        setField(term2080, term2080.getClass(), "first", term2075);
        setField(term2080, term2080.getClass(), "last", term2058);
        setField(term2080, term2080.getClass(), "propListHead", null);
        setIntField(term2080, term2080.getClass(), "sourcePosition", 0);
        setField(term2080, term2080.getClass(), "jsType", null);
        setField(term2080, term2080.getClass(), "parent", null);
        setField(term2060, term2060.getClass(), "first", term2080);
        setField(term2060, term2060.getClass(), "last", term2080);
        setField(term2060, term2060.getClass(), "propListHead", null);
        setIntField(term2060, term2060.getClass(), "sourcePosition", 0);
        setField(term2060, term2060.getClass(), "jsType", null);
        setField(term2060, term2060.getClass(), "parent", null);
        setField(term2058, term2058.getClass(), "next", term2060);
        setField(term2058, term2058.getClass(), "first", term2064);
        setField(term2058, term2058.getClass(), "last", term2066);
        setField(term2058, term2058.getClass(), "propListHead", null);
        setIntField(term2058, term2058.getClass(), "sourcePosition", 0);
        setField(term2058, term2058.getClass(), "jsType", null);
        setField(term2058, term2058.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2058;
        try {
            callMethod(klass, "getFunctionBody", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


