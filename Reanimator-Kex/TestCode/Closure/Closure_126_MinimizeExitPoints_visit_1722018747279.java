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

public class MinimizeExitPoints_visit_1722018747279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96452;
     Object term96544;
     Object term97796;
     Object term97797;

    public MinimizeExitPoints_visit_1722018747279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96452 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term96544 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term96544, term96544.getClass(), "type", 105);
        setIntField(term96636, term96636.getClass(), "type", 4);
        setField(term96636, term96636.getClass(), "first", term96728);
        setField(term96544, term96544.getClass(), "last", term96636);
        term97796 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term97796, term97796.getClass(), "compiler", null);
        term97797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term97797, term97797.getClass(), "number", 0.0);
        setIntField(term97797, term97797.getClass(), "type", 105);
        setField(term97797, term97797.getClass(), "next", null);
        setField(term97797, term97797.getClass(), "first", null);
        setDoubleField(term97798, term97798.getClass(), "number", 0.0);
        setIntField(term97798, term97798.getClass(), "type", 4);
        setField(term97798, term97798.getClass(), "next", null);
        setDoubleField(term97799, term97799.getClass(), "number", 0.0);
        setIntField(term97799, term97799.getClass(), "type", 0);
        setField(term97799, term97799.getClass(), "next", null);
        setField(term97799, term97799.getClass(), "first", null);
        setField(term97799, term97799.getClass(), "last", null);
        setField(term97799, term97799.getClass(), "propListHead", null);
        setIntField(term97799, term97799.getClass(), "sourcePosition", 0);
        setField(term97799, term97799.getClass(), "jsType", null);
        setField(term97799, term97799.getClass(), "parent", null);
        setField(term97798, term97798.getClass(), "first", term97799);
        setField(term97798, term97798.getClass(), "last", null);
        setField(term97798, term97798.getClass(), "propListHead", null);
        setIntField(term97798, term97798.getClass(), "sourcePosition", 0);
        setField(term97798, term97798.getClass(), "jsType", null);
        setField(term97798, term97798.getClass(), "parent", null);
        setField(term97797, term97797.getClass(), "last", term97798);
        setField(term97797, term97797.getClass(), "propListHead", null);
        setIntField(term97797, term97797.getClass(), "sourcePosition", 0);
        setField(term97797, term97797.getClass(), "jsType", null);
        setField(term97797, term97797.getClass(), "parent", null);
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
        args[1] = term96544;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term96452, args);
        assertTrue(recursiveEquals(term96452, term97796));
        assertTrue(recursiveEquals(term96544, null));
    }

};


