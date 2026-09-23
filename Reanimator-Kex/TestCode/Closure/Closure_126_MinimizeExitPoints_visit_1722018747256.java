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

public class MinimizeExitPoints_visit_1722018747256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86945;
     Object term87037;
     Object term87174;
     Object term87175;

    public MinimizeExitPoints_visit_1722018747256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86945 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term87037 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87129 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term87037, term87037.getClass(), "type", 113);
        setField(term87037, term87037.getClass(), "last", term87129);
        term87174 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term87174, term87174.getClass(), "compiler", null);
        term87175 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term87175, term87175.getClass(), "number", 0.0);
        setIntField(term87175, term87175.getClass(), "type", 113);
        setField(term87175, term87175.getClass(), "next", null);
        setField(term87175, term87175.getClass(), "first", null);
        setDoubleField(term87176, term87176.getClass(), "number", 0.0);
        setIntField(term87176, term87176.getClass(), "type", 0);
        setField(term87176, term87176.getClass(), "next", null);
        setField(term87176, term87176.getClass(), "first", null);
        setField(term87176, term87176.getClass(), "last", null);
        setField(term87176, term87176.getClass(), "propListHead", null);
        setIntField(term87176, term87176.getClass(), "sourcePosition", 0);
        setField(term87176, term87176.getClass(), "jsType", null);
        setField(term87176, term87176.getClass(), "parent", null);
        setField(term87175, term87175.getClass(), "last", term87176);
        setField(term87175, term87175.getClass(), "propListHead", null);
        setIntField(term87175, term87175.getClass(), "sourcePosition", 0);
        setField(term87175, term87175.getClass(), "jsType", null);
        setField(term87175, term87175.getClass(), "parent", null);
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
        args[1] = term87037;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term86945, args);
        assertTrue(recursiveEquals(term86945, term87174));
        assertTrue(recursiveEquals(term87037, null));
    }

};


