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
import java.lang.Integer;

public class NodeUtil_containsType_951752563264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2599;
     Object term2626;

    public NodeUtil_containsType_951752563264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2599, term2599.getClass(), "type", 1983756621);
        setIntField(term2601, term2601.getClass(), "type", -2134711835);
        setIntField(term2603, term2603.getClass(), "type", -1641244494);
        setIntField(term2605, term2605.getClass(), "type", 1124282188);
        setIntField(term2607, term2607.getClass(), "type", -489441521);
        setField(term2607, term2607.getClass(), "next", null);
        setField(term2607, term2607.getClass(), "first", null);
        setField(term2607, term2607.getClass(), "last", null);
        setField(term2607, term2607.getClass(), "propListHead", null);
        setIntField(term2607, term2607.getClass(), "sourcePosition", 0);
        setField(term2607, term2607.getClass(), "jsType", null);
        setField(term2607, term2607.getClass(), "parent", null);
        setField(term2605, term2605.getClass(), "next", term2607);
        setIntField(term2610, term2610.getClass(), "type", 225873732);
        setField(term2610, term2610.getClass(), "next", null);
        setField(term2610, term2610.getClass(), "first", null);
        setField(term2610, term2610.getClass(), "last", term2607);
        setField(term2610, term2610.getClass(), "propListHead", null);
        setIntField(term2610, term2610.getClass(), "sourcePosition", 0);
        setField(term2610, term2610.getClass(), "jsType", null);
        setField(term2610, term2610.getClass(), "parent", null);
        setField(term2605, term2605.getClass(), "first", term2610);
        setField(term2605, term2605.getClass(), "last", term2603);
        setField(term2605, term2605.getClass(), "propListHead", null);
        setIntField(term2605, term2605.getClass(), "sourcePosition", 0);
        setField(term2605, term2605.getClass(), "jsType", null);
        setField(term2605, term2605.getClass(), "parent", null);
        setField(term2603, term2603.getClass(), "next", term2605);
        setField(term2603, term2603.getClass(), "first", term2607);
        setIntField(term2614, term2614.getClass(), "type", 18072182);
        setIntField(term2616, term2616.getClass(), "type", 1544768934);
        setField(term2616, term2616.getClass(), "next", null);
        setField(term2616, term2616.getClass(), "first", term2610);
        setField(term2616, term2616.getClass(), "last", term2605);
        setField(term2616, term2616.getClass(), "propListHead", null);
        setIntField(term2616, term2616.getClass(), "sourcePosition", 0);
        setField(term2616, term2616.getClass(), "jsType", null);
        setField(term2616, term2616.getClass(), "parent", null);
        setField(term2614, term2614.getClass(), "next", term2616);
        setField(term2614, term2614.getClass(), "first", term2601);
        setField(term2614, term2614.getClass(), "last", term2601);
        setField(term2614, term2614.getClass(), "propListHead", null);
        setIntField(term2614, term2614.getClass(), "sourcePosition", 0);
        setField(term2614, term2614.getClass(), "jsType", null);
        setField(term2614, term2614.getClass(), "parent", null);
        setField(term2603, term2603.getClass(), "last", term2614);
        setField(term2603, term2603.getClass(), "propListHead", null);
        setIntField(term2603, term2603.getClass(), "sourcePosition", 0);
        setField(term2603, term2603.getClass(), "jsType", null);
        setField(term2603, term2603.getClass(), "parent", null);
        setField(term2601, term2601.getClass(), "next", term2603);
        setIntField(term2621, term2621.getClass(), "type", -383508597);
        setField(term2621, term2621.getClass(), "next", term2614);
        setField(term2621, term2621.getClass(), "first", term2616);
        setField(term2621, term2621.getClass(), "last", term2599);
        setField(term2621, term2621.getClass(), "propListHead", null);
        setIntField(term2621, term2621.getClass(), "sourcePosition", 0);
        setField(term2621, term2621.getClass(), "jsType", null);
        setField(term2621, term2621.getClass(), "parent", null);
        setField(term2601, term2601.getClass(), "first", term2621);
        setField(term2601, term2601.getClass(), "last", term2621);
        setField(term2601, term2601.getClass(), "propListHead", null);
        setIntField(term2601, term2601.getClass(), "sourcePosition", 0);
        setField(term2601, term2601.getClass(), "jsType", null);
        setField(term2601, term2601.getClass(), "parent", null);
        setField(term2599, term2599.getClass(), "next", term2601);
        setField(term2599, term2599.getClass(), "first", term2605);
        setField(term2599, term2599.getClass(), "last", term2607);
        setField(term2599, term2599.getClass(), "propListHead", null);
        setIntField(term2599, term2599.getClass(), "sourcePosition", 0);
        setField(term2599, term2599.getClass(), "jsType", null);
        setField(term2599, term2599.getClass(), "parent", null);
        term2626 = new Integer(-819372164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2599;
        args[1] = term2626;
        args[2] = null;
        try {
            callMethod(klass, "containsType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


