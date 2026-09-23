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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862356;
     Object term862448;
     Object term862632;
     Object term862724;
     Object term863294;
     Object term863295;
     Object term863297;
     Object term863298;
     Object term863242;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term862356 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term862448 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term862540 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term862540, term862540.getClass(), "type", 98);
        setField(term862448, term862448.getClass(), "parent", term862540);
        setIntField(term862448, term862448.getClass(), "type", 0);
        term862632 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term862632, term862632.getClass(), "type", 0);
        term862724 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term862724, term862724.getClass(), "type", 47);
        term863294 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term863294, term863294.getClass(), "currentTraversal", null);
        term863295 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term863296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term863295, term863295.getClass(), "number", 0.0);
        setIntField(term863295, term863295.getClass(), "type", 0);
        setField(term863295, term863295.getClass(), "next", null);
        setField(term863295, term863295.getClass(), "first", null);
        setField(term863295, term863295.getClass(), "last", null);
        setField(term863295, term863295.getClass(), "propListHead", null);
        setIntField(term863295, term863295.getClass(), "sourcePosition", 0);
        setField(term863295, term863295.getClass(), "jsType", null);
        setDoubleField(term863296, term863296.getClass(), "number", 0.0);
        setIntField(term863296, term863296.getClass(), "type", 98);
        setField(term863296, term863296.getClass(), "next", null);
        setField(term863296, term863296.getClass(), "first", null);
        setField(term863296, term863296.getClass(), "last", null);
        setField(term863296, term863296.getClass(), "propListHead", null);
        setIntField(term863296, term863296.getClass(), "sourcePosition", 0);
        setField(term863296, term863296.getClass(), "jsType", null);
        setField(term863296, term863296.getClass(), "parent", null);
        setField(term863295, term863295.getClass(), "parent", term863296);
        term863297 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term863297, term863297.getClass(), "number", 0.0);
        setIntField(term863297, term863297.getClass(), "type", 0);
        setField(term863297, term863297.getClass(), "next", null);
        setField(term863297, term863297.getClass(), "first", null);
        setField(term863297, term863297.getClass(), "last", null);
        setField(term863297, term863297.getClass(), "propListHead", null);
        setIntField(term863297, term863297.getClass(), "sourcePosition", 0);
        setField(term863297, term863297.getClass(), "jsType", null);
        setField(term863297, term863297.getClass(), "parent", null);
        term863298 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term863298, term863298.getClass(), "str", null);
        setIntField(term863298, term863298.getClass(), "type", 47);
        setField(term863298, term863298.getClass(), "next", null);
        setField(term863298, term863298.getClass(), "first", null);
        setField(term863298, term863298.getClass(), "last", null);
        setField(term863298, term863298.getClass(), "propListHead", null);
        setIntField(term863298, term863298.getClass(), "sourcePosition", 0);
        setField(term863298, term863298.getClass(), "jsType", null);
        setField(term863298, term863298.getClass(), "parent", null);
        term863242 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term863246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term863242, term863242.getClass(), "number", 0.0);
        setIntField(term863242, term863242.getClass(), "type", 0);
        setField(term863242, term863242.getClass(), "next", null);
        setField(term863242, term863242.getClass(), "first", null);
        setField(term863242, term863242.getClass(), "last", null);
        setField(term863242, term863242.getClass(), "propListHead", null);
        setIntField(term863242, term863242.getClass(), "sourcePosition", 0);
        setField(term863242, term863242.getClass(), "jsType", null);
        setDoubleField(term863246, term863246.getClass(), "number", 0.0);
        setIntField(term863246, term863246.getClass(), "type", 98);
        setField(term863246, term863246.getClass(), "next", null);
        setField(term863246, term863246.getClass(), "first", null);
        setField(term863246, term863246.getClass(), "last", null);
        setField(term863246, term863246.getClass(), "propListHead", null);
        setIntField(term863246, term863246.getClass(), "sourcePosition", 0);
        setField(term863246, term863246.getClass(), "jsType", null);
        setField(term863246, term863246.getClass(), "parent", null);
        setField(term863242, term863242.getClass(), "parent", term863246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term862448;
        args[1] = term862632;
        args[2] = term862724;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term862356, args);
        assertTrue(recursiveEquals(term862356, term863294));
        assertTrue(recursiveEquals(term862448, term863295));
        assertTrue(recursiveEquals(term862632, term863297));
        assertTrue(recursiveEquals(term862724, term863298));
        assertTrue(recursiveEquals(retValue, term863242));
    }

};


