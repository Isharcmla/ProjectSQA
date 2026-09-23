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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term651481;
     Object term651573;
     Object term651665;
     Object term651797;
     Object term651798;
     Object term651799;
     Object term651765;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term651481 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term651573 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term651573, term651573.getClass(), "parent", null);
        setIntField(term651573, term651573.getClass(), "type", 63);
        term651665 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term651665, term651665.getClass(), "type", 63);
        term651797 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651797, term651797.getClass(), "currentTraversal", null);
        term651798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term651798, term651798.getClass(), "str", null);
        setIntField(term651798, term651798.getClass(), "type", 63);
        setField(term651798, term651798.getClass(), "next", null);
        setField(term651798, term651798.getClass(), "first", null);
        setField(term651798, term651798.getClass(), "last", null);
        setField(term651798, term651798.getClass(), "propListHead", null);
        setIntField(term651798, term651798.getClass(), "sourcePosition", 0);
        setField(term651798, term651798.getClass(), "jsType", null);
        setField(term651798, term651798.getClass(), "parent", null);
        term651799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term651799, term651799.getClass(), "number", 0.0);
        setIntField(term651799, term651799.getClass(), "type", 63);
        setField(term651799, term651799.getClass(), "next", null);
        setField(term651799, term651799.getClass(), "first", null);
        setField(term651799, term651799.getClass(), "last", null);
        setField(term651799, term651799.getClass(), "propListHead", null);
        setIntField(term651799, term651799.getClass(), "sourcePosition", 0);
        setField(term651799, term651799.getClass(), "jsType", null);
        setField(term651799, term651799.getClass(), "parent", null);
        term651765 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term651765, term651765.getClass(), "str", null);
        setIntField(term651765, term651765.getClass(), "type", 63);
        setField(term651765, term651765.getClass(), "next", null);
        setField(term651765, term651765.getClass(), "first", null);
        setField(term651765, term651765.getClass(), "last", null);
        setField(term651765, term651765.getClass(), "propListHead", null);
        setIntField(term651765, term651765.getClass(), "sourcePosition", 0);
        setField(term651765, term651765.getClass(), "jsType", null);
        setField(term651765, term651765.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term651573;
        args[1] = term651665;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term651481, args);
        assertTrue(recursiveEquals(term651481, term651797));
        assertTrue(recursiveEquals(term651573, term651798));
        assertTrue(recursiveEquals(term651665, term651799));
        assertTrue(recursiveEquals(retValue, term651765));
    }

};


