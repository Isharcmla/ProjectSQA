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

public class MinimizeExitPoints_visit_1722018747338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124755;
     Object term124847;
     Object term125097;
     Object term125098;

    public MinimizeExitPoints_visit_1722018747338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124755 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term124847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term124939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125031 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term124847, term124847.getClass(), "type", 115);
        setIntField(term124939, term124939.getClass(), "type", 117);
        setField(term124939, term124939.getClass(), "first", term125031);
        setField(term124847, term124847.getClass(), "last", term124939);
        term125097 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term125097, term125097.getClass(), "compiler", null);
        term125098 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125100 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term125098, term125098.getClass(), "number", 0.0);
        setIntField(term125098, term125098.getClass(), "type", 115);
        setField(term125098, term125098.getClass(), "next", null);
        setField(term125098, term125098.getClass(), "first", null);
        setDoubleField(term125099, term125099.getClass(), "number", 0.0);
        setIntField(term125099, term125099.getClass(), "type", 117);
        setField(term125099, term125099.getClass(), "next", null);
        setDoubleField(term125100, term125100.getClass(), "number", 0.0);
        setIntField(term125100, term125100.getClass(), "type", 0);
        setField(term125100, term125100.getClass(), "next", null);
        setField(term125100, term125100.getClass(), "first", null);
        setField(term125100, term125100.getClass(), "last", null);
        setField(term125100, term125100.getClass(), "propListHead", null);
        setIntField(term125100, term125100.getClass(), "sourcePosition", 0);
        setField(term125100, term125100.getClass(), "jsType", null);
        setField(term125100, term125100.getClass(), "parent", null);
        setField(term125099, term125099.getClass(), "first", term125100);
        setField(term125099, term125099.getClass(), "last", null);
        setField(term125099, term125099.getClass(), "propListHead", null);
        setIntField(term125099, term125099.getClass(), "sourcePosition", 0);
        setField(term125099, term125099.getClass(), "jsType", null);
        setField(term125099, term125099.getClass(), "parent", null);
        setField(term125098, term125098.getClass(), "last", term125099);
        setField(term125098, term125098.getClass(), "propListHead", null);
        setIntField(term125098, term125098.getClass(), "sourcePosition", 0);
        setField(term125098, term125098.getClass(), "jsType", null);
        setField(term125098, term125098.getClass(), "parent", null);
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
        args[1] = term124847;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term124755, args);
        assertTrue(recursiveEquals(term124755, term125097));
        assertTrue(recursiveEquals(term124847, null));
    }

};


