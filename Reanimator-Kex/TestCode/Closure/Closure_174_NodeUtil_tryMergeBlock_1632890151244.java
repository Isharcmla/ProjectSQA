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

public class NodeUtil_tryMergeBlock_1632890151244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2060;

    public NodeUtil_tryMergeBlock_1632890151244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2060, term2060.getClass(), "type", 698551724);
        setIntField(term2062, term2062.getClass(), "type", -1631048635);
        setIntField(term2064, term2064.getClass(), "type", 1342808731);
        setIntField(term2066, term2066.getClass(), "type", -64893740);
        setIntField(term2068, term2068.getClass(), "type", -222012928);
        setField(term2068, term2068.getClass(), "next", null);
        setField(term2068, term2068.getClass(), "first", null);
        setField(term2068, term2068.getClass(), "last", null);
        setField(term2068, term2068.getClass(), "propListHead", null);
        setIntField(term2068, term2068.getClass(), "sourcePosition", 0);
        setField(term2068, term2068.getClass(), "jsType", null);
        setField(term2068, term2068.getClass(), "parent", null);
        setField(term2066, term2066.getClass(), "next", term2068);
        setIntField(term2071, term2071.getClass(), "type", -146564963);
        setField(term2071, term2071.getClass(), "next", null);
        setField(term2071, term2071.getClass(), "first", null);
        setField(term2071, term2071.getClass(), "last", term2068);
        setField(term2071, term2071.getClass(), "propListHead", null);
        setIntField(term2071, term2071.getClass(), "sourcePosition", 0);
        setField(term2071, term2071.getClass(), "jsType", null);
        setField(term2071, term2071.getClass(), "parent", null);
        setField(term2066, term2066.getClass(), "first", term2071);
        setField(term2066, term2066.getClass(), "last", term2064);
        setField(term2066, term2066.getClass(), "propListHead", null);
        setIntField(term2066, term2066.getClass(), "sourcePosition", 0);
        setField(term2066, term2066.getClass(), "jsType", null);
        setField(term2066, term2066.getClass(), "parent", null);
        setField(term2064, term2064.getClass(), "next", term2066);
        setField(term2064, term2064.getClass(), "first", term2068);
        setIntField(term2075, term2075.getClass(), "type", -1292704466);
        setIntField(term2077, term2077.getClass(), "type", 1991858584);
        setField(term2077, term2077.getClass(), "next", null);
        setField(term2077, term2077.getClass(), "first", term2071);
        setField(term2077, term2077.getClass(), "last", term2066);
        setField(term2077, term2077.getClass(), "propListHead", null);
        setIntField(term2077, term2077.getClass(), "sourcePosition", 0);
        setField(term2077, term2077.getClass(), "jsType", null);
        setField(term2077, term2077.getClass(), "parent", null);
        setField(term2075, term2075.getClass(), "next", term2077);
        setField(term2075, term2075.getClass(), "first", term2062);
        setField(term2075, term2075.getClass(), "last", term2062);
        setField(term2075, term2075.getClass(), "propListHead", null);
        setIntField(term2075, term2075.getClass(), "sourcePosition", 0);
        setField(term2075, term2075.getClass(), "jsType", null);
        setField(term2075, term2075.getClass(), "parent", null);
        setField(term2064, term2064.getClass(), "last", term2075);
        setField(term2064, term2064.getClass(), "propListHead", null);
        setIntField(term2064, term2064.getClass(), "sourcePosition", 0);
        setField(term2064, term2064.getClass(), "jsType", null);
        setField(term2064, term2064.getClass(), "parent", null);
        setField(term2062, term2062.getClass(), "next", term2064);
        setIntField(term2082, term2082.getClass(), "type", -1300947782);
        setField(term2082, term2082.getClass(), "next", term2075);
        setField(term2082, term2082.getClass(), "first", term2077);
        setField(term2082, term2082.getClass(), "last", term2060);
        setField(term2082, term2082.getClass(), "propListHead", null);
        setIntField(term2082, term2082.getClass(), "sourcePosition", 0);
        setField(term2082, term2082.getClass(), "jsType", null);
        setField(term2082, term2082.getClass(), "parent", null);
        setField(term2062, term2062.getClass(), "first", term2082);
        setField(term2062, term2062.getClass(), "last", term2082);
        setField(term2062, term2062.getClass(), "propListHead", null);
        setIntField(term2062, term2062.getClass(), "sourcePosition", 0);
        setField(term2062, term2062.getClass(), "jsType", null);
        setField(term2062, term2062.getClass(), "parent", null);
        setField(term2060, term2060.getClass(), "next", term2062);
        setField(term2060, term2060.getClass(), "first", term2066);
        setField(term2060, term2060.getClass(), "last", term2068);
        setField(term2060, term2060.getClass(), "propListHead", null);
        setIntField(term2060, term2060.getClass(), "sourcePosition", 0);
        setField(term2060, term2060.getClass(), "jsType", null);
        setField(term2060, term2060.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2060;
        try {
            callMethod(klass, "tryMergeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


