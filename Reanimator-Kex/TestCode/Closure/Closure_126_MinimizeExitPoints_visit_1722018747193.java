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

public class MinimizeExitPoints_visit_1722018747193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60252;
     Object term60344;
     Object term61492;
     Object term61493;

    public MinimizeExitPoints_visit_1722018747193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60252 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term60344 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term60344, term60344.getClass(), "type", 105);
        setField(term60344, term60344.getClass(), "last", term60436);
        term61492 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term61492, term61492.getClass(), "compiler", null);
        term61493 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61494 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term61493, term61493.getClass(), "number", 0.0);
        setIntField(term61493, term61493.getClass(), "type", 105);
        setField(term61493, term61493.getClass(), "next", null);
        setField(term61493, term61493.getClass(), "first", null);
        setDoubleField(term61494, term61494.getClass(), "number", 0.0);
        setIntField(term61494, term61494.getClass(), "type", 0);
        setField(term61494, term61494.getClass(), "next", null);
        setField(term61494, term61494.getClass(), "first", null);
        setField(term61494, term61494.getClass(), "last", null);
        setField(term61494, term61494.getClass(), "propListHead", null);
        setIntField(term61494, term61494.getClass(), "sourcePosition", 0);
        setField(term61494, term61494.getClass(), "jsType", null);
        setField(term61494, term61494.getClass(), "parent", null);
        setField(term61493, term61493.getClass(), "last", term61494);
        setField(term61493, term61493.getClass(), "propListHead", null);
        setIntField(term61493, term61493.getClass(), "sourcePosition", 0);
        setField(term61493, term61493.getClass(), "jsType", null);
        setField(term61493, term61493.getClass(), "parent", null);
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
        args[1] = term60344;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term60252, args);
        assertTrue(recursiveEquals(term60252, term61492));
        assertTrue(recursiveEquals(term60344, null));
    }

};


