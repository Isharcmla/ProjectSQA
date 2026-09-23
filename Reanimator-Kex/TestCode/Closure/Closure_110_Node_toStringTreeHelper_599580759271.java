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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Node_toStringTreeHelper_599580759271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2537;
     Object term2564;

    public Node_toStringTreeHelper_599580759271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2537, term2537.getClass(), "type", -830170410);
        setIntField(term2539, term2539.getClass(), "type", -1742790308);
        setIntField(term2541, term2541.getClass(), "type", -1592093430);
        setIntField(term2543, term2543.getClass(), "type", 1178214545);
        setIntField(term2545, term2545.getClass(), "type", -985334541);
        setField(term2545, term2545.getClass(), "next", null);
        setField(term2545, term2545.getClass(), "first", null);
        setField(term2545, term2545.getClass(), "last", null);
        setField(term2545, term2545.getClass(), "propListHead", null);
        setIntField(term2545, term2545.getClass(), "sourcePosition", 0);
        setField(term2545, term2545.getClass(), "jsType", null);
        setField(term2545, term2545.getClass(), "parent", null);
        setField(term2543, term2543.getClass(), "next", term2545);
        setIntField(term2548, term2548.getClass(), "type", -1870004228);
        setField(term2548, term2548.getClass(), "next", null);
        setField(term2548, term2548.getClass(), "first", null);
        setField(term2548, term2548.getClass(), "last", term2545);
        setField(term2548, term2548.getClass(), "propListHead", null);
        setIntField(term2548, term2548.getClass(), "sourcePosition", 0);
        setField(term2548, term2548.getClass(), "jsType", null);
        setField(term2548, term2548.getClass(), "parent", null);
        setField(term2543, term2543.getClass(), "first", term2548);
        setField(term2543, term2543.getClass(), "last", term2541);
        setField(term2543, term2543.getClass(), "propListHead", null);
        setIntField(term2543, term2543.getClass(), "sourcePosition", 0);
        setField(term2543, term2543.getClass(), "jsType", null);
        setField(term2543, term2543.getClass(), "parent", null);
        setField(term2541, term2541.getClass(), "next", term2543);
        setField(term2541, term2541.getClass(), "first", term2545);
        setIntField(term2552, term2552.getClass(), "type", 1822317628);
        setIntField(term2554, term2554.getClass(), "type", -608830309);
        setField(term2554, term2554.getClass(), "next", null);
        setField(term2554, term2554.getClass(), "first", term2548);
        setField(term2554, term2554.getClass(), "last", term2543);
        setField(term2554, term2554.getClass(), "propListHead", null);
        setIntField(term2554, term2554.getClass(), "sourcePosition", 0);
        setField(term2554, term2554.getClass(), "jsType", null);
        setField(term2554, term2554.getClass(), "parent", null);
        setField(term2552, term2552.getClass(), "next", term2554);
        setField(term2552, term2552.getClass(), "first", term2539);
        setField(term2552, term2552.getClass(), "last", term2539);
        setField(term2552, term2552.getClass(), "propListHead", null);
        setIntField(term2552, term2552.getClass(), "sourcePosition", 0);
        setField(term2552, term2552.getClass(), "jsType", null);
        setField(term2552, term2552.getClass(), "parent", null);
        setField(term2541, term2541.getClass(), "last", term2552);
        setField(term2541, term2541.getClass(), "propListHead", null);
        setIntField(term2541, term2541.getClass(), "sourcePosition", 0);
        setField(term2541, term2541.getClass(), "jsType", null);
        setField(term2541, term2541.getClass(), "parent", null);
        setField(term2539, term2539.getClass(), "next", term2541);
        setIntField(term2559, term2559.getClass(), "type", -537786484);
        setField(term2559, term2559.getClass(), "next", term2552);
        setField(term2559, term2559.getClass(), "first", term2554);
        setField(term2559, term2559.getClass(), "last", term2537);
        setField(term2559, term2559.getClass(), "propListHead", null);
        setIntField(term2559, term2559.getClass(), "sourcePosition", 0);
        setField(term2559, term2559.getClass(), "jsType", null);
        setField(term2559, term2559.getClass(), "parent", null);
        setField(term2539, term2539.getClass(), "first", term2559);
        setField(term2539, term2539.getClass(), "last", term2559);
        setField(term2539, term2539.getClass(), "propListHead", null);
        setIntField(term2539, term2539.getClass(), "sourcePosition", 0);
        setField(term2539, term2539.getClass(), "jsType", null);
        setField(term2539, term2539.getClass(), "parent", null);
        setField(term2537, term2537.getClass(), "next", term2539);
        setField(term2537, term2537.getClass(), "first", term2543);
        setField(term2537, term2537.getClass(), "last", term2545);
        setField(term2537, term2537.getClass(), "propListHead", null);
        setIntField(term2537, term2537.getClass(), "sourcePosition", 0);
        setField(term2537, term2537.getClass(), "jsType", null);
        setField(term2537, term2537.getClass(), "parent", null);
        term2564 = new Integer(263859424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[3];
        args[0] = term2537;
        args[1] = term2564;
        args[2] = null;
        try {
            callMethod(klass, "toStringTreeHelper", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


