package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_appendStringTree_1791460641270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2510;

    public Node_appendStringTree_1791460641270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2510, term2510.getClass(), "type", -1716046610);
        setIntField(term2512, term2512.getClass(), "type", 65264024);
        setIntField(term2514, term2514.getClass(), "type", -252449812);
        setIntField(term2516, term2516.getClass(), "type", -1885268968);
        setIntField(term2518, term2518.getClass(), "type", 277855691);
        setField(term2518, term2518.getClass(), "next", null);
        setField(term2518, term2518.getClass(), "first", null);
        setField(term2518, term2518.getClass(), "last", null);
        setField(term2518, term2518.getClass(), "propListHead", null);
        setIntField(term2518, term2518.getClass(), "sourcePosition", 0);
        setField(term2518, term2518.getClass(), "jsType", null);
        setField(term2518, term2518.getClass(), "parent", null);
        setField(term2516, term2516.getClass(), "next", term2518);
        setIntField(term2521, term2521.getClass(), "type", 675891483);
        setField(term2521, term2521.getClass(), "next", null);
        setField(term2521, term2521.getClass(), "first", null);
        setField(term2521, term2521.getClass(), "last", term2518);
        setField(term2521, term2521.getClass(), "propListHead", null);
        setIntField(term2521, term2521.getClass(), "sourcePosition", 0);
        setField(term2521, term2521.getClass(), "jsType", null);
        setField(term2521, term2521.getClass(), "parent", null);
        setField(term2516, term2516.getClass(), "first", term2521);
        setField(term2516, term2516.getClass(), "last", term2514);
        setField(term2516, term2516.getClass(), "propListHead", null);
        setIntField(term2516, term2516.getClass(), "sourcePosition", 0);
        setField(term2516, term2516.getClass(), "jsType", null);
        setField(term2516, term2516.getClass(), "parent", null);
        setField(term2514, term2514.getClass(), "next", term2516);
        setField(term2514, term2514.getClass(), "first", term2518);
        setIntField(term2525, term2525.getClass(), "type", -979568);
        setIntField(term2527, term2527.getClass(), "type", -1422131197);
        setField(term2527, term2527.getClass(), "next", null);
        setField(term2527, term2527.getClass(), "first", term2521);
        setField(term2527, term2527.getClass(), "last", term2516);
        setField(term2527, term2527.getClass(), "propListHead", null);
        setIntField(term2527, term2527.getClass(), "sourcePosition", 0);
        setField(term2527, term2527.getClass(), "jsType", null);
        setField(term2527, term2527.getClass(), "parent", null);
        setField(term2525, term2525.getClass(), "next", term2527);
        setField(term2525, term2525.getClass(), "first", term2512);
        setField(term2525, term2525.getClass(), "last", term2512);
        setField(term2525, term2525.getClass(), "propListHead", null);
        setIntField(term2525, term2525.getClass(), "sourcePosition", 0);
        setField(term2525, term2525.getClass(), "jsType", null);
        setField(term2525, term2525.getClass(), "parent", null);
        setField(term2514, term2514.getClass(), "last", term2525);
        setField(term2514, term2514.getClass(), "propListHead", null);
        setIntField(term2514, term2514.getClass(), "sourcePosition", 0);
        setField(term2514, term2514.getClass(), "jsType", null);
        setField(term2514, term2514.getClass(), "parent", null);
        setField(term2512, term2512.getClass(), "next", term2514);
        setIntField(term2532, term2532.getClass(), "type", -20399281);
        setField(term2532, term2532.getClass(), "next", term2525);
        setField(term2532, term2532.getClass(), "first", term2527);
        setField(term2532, term2532.getClass(), "last", term2510);
        setField(term2532, term2532.getClass(), "propListHead", null);
        setIntField(term2532, term2532.getClass(), "sourcePosition", 0);
        setField(term2532, term2532.getClass(), "jsType", null);
        setField(term2532, term2532.getClass(), "parent", null);
        setField(term2512, term2512.getClass(), "first", term2532);
        setField(term2512, term2512.getClass(), "last", term2532);
        setField(term2512, term2512.getClass(), "propListHead", null);
        setIntField(term2512, term2512.getClass(), "sourcePosition", 0);
        setField(term2512, term2512.getClass(), "jsType", null);
        setField(term2512, term2512.getClass(), "parent", null);
        setField(term2510, term2510.getClass(), "next", term2512);
        setField(term2510, term2510.getClass(), "first", term2516);
        setField(term2510, term2510.getClass(), "last", term2518);
        setField(term2510, term2510.getClass(), "propListHead", null);
        setIntField(term2510, term2510.getClass(), "sourcePosition", 0);
        setField(term2510, term2510.getClass(), "jsType", null);
        setField(term2510, term2510.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendStringTree", argTypes, term2510, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


