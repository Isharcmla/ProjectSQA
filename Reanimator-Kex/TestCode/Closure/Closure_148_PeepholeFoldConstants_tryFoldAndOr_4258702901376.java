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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336468;
     Object term336560;
     Object term336652;
     Object term336761;
     Object term336762;
     Object term336763;
     Object term336729;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336468 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term336560 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term336560, term336560.getClass(), "parent", null);
        setIntField(term336560, term336560.getClass(), "type", 44);
        term336652 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term336652, term336652.getClass(), "type", 44);
        term336761 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term336761, term336761.getClass(), "currentTraversal", null);
        term336762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term336762, term336762.getClass(), "str", null);
        setIntField(term336762, term336762.getClass(), "type", 44);
        setField(term336762, term336762.getClass(), "next", null);
        setField(term336762, term336762.getClass(), "first", null);
        setField(term336762, term336762.getClass(), "last", null);
        setField(term336762, term336762.getClass(), "propListHead", null);
        setIntField(term336762, term336762.getClass(), "sourcePosition", 0);
        setField(term336762, term336762.getClass(), "jsType", null);
        setField(term336762, term336762.getClass(), "parent", null);
        term336763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term336763, term336763.getClass(), "number", 0.0);
        setIntField(term336763, term336763.getClass(), "type", 44);
        setField(term336763, term336763.getClass(), "next", null);
        setField(term336763, term336763.getClass(), "first", null);
        setField(term336763, term336763.getClass(), "last", null);
        setField(term336763, term336763.getClass(), "propListHead", null);
        setIntField(term336763, term336763.getClass(), "sourcePosition", 0);
        setField(term336763, term336763.getClass(), "jsType", null);
        setField(term336763, term336763.getClass(), "parent", null);
        term336729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term336729, term336729.getClass(), "str", null);
        setIntField(term336729, term336729.getClass(), "type", 44);
        setField(term336729, term336729.getClass(), "next", null);
        setField(term336729, term336729.getClass(), "first", null);
        setField(term336729, term336729.getClass(), "last", null);
        setField(term336729, term336729.getClass(), "propListHead", null);
        setIntField(term336729, term336729.getClass(), "sourcePosition", 0);
        setField(term336729, term336729.getClass(), "jsType", null);
        setField(term336729, term336729.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term336560;
        args[1] = term336652;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term336468, args);
        assertTrue(recursiveEquals(term336468, term336761));
        assertTrue(recursiveEquals(term336560, term336762));
        assertTrue(recursiveEquals(term336652, term336763));
        assertTrue(recursiveEquals(retValue, term336729));
    }

};


