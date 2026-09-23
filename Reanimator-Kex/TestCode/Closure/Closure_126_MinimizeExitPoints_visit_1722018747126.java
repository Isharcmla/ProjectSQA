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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class MinimizeExitPoints_visit_1722018747126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33247;
     Object term33339;
     Object term33476;
     Object term33477;

    public MinimizeExitPoints_visit_1722018747126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33247 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term33339 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term33431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term33339, term33339.getClass(), "type", 115);
        setField(term33339, term33339.getClass(), "last", term33431);
        term33476 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term33476, term33476.getClass(), "compiler", null);
        term33477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term33478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term33477, term33477.getClass(), "number", 0.0);
        setIntField(term33477, term33477.getClass(), "type", 115);
        setField(term33477, term33477.getClass(), "next", null);
        setField(term33477, term33477.getClass(), "first", null);
        setDoubleField(term33478, term33478.getClass(), "number", 0.0);
        setIntField(term33478, term33478.getClass(), "type", 0);
        setField(term33478, term33478.getClass(), "next", null);
        setField(term33478, term33478.getClass(), "first", null);
        setField(term33478, term33478.getClass(), "last", null);
        setField(term33478, term33478.getClass(), "propListHead", null);
        setIntField(term33478, term33478.getClass(), "sourcePosition", 0);
        setField(term33478, term33478.getClass(), "jsType", null);
        setField(term33478, term33478.getClass(), "parent", null);
        setField(term33477, term33477.getClass(), "last", term33478);
        setField(term33477, term33477.getClass(), "propListHead", null);
        setIntField(term33477, term33477.getClass(), "sourcePosition", 0);
        setField(term33477, term33477.getClass(), "jsType", null);
        setField(term33477, term33477.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term33339;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term33247, args);
        assertTrue(recursiveEquals(term33247, term33476));
        assertTrue(recursiveEquals(term33339, null));
    }

};


