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

public class ReferenceCollectingCallback_visit_872273174146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31811;
     Object term32041;
     Object term31995;
     Object term32327;
     Object term32328;
     Object term32329;

    public ReferenceCollectingCallback_visit_872273174146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31811 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term32041 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term32041, term32041.getClass(), "type", 100);
        term31995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term31995, term31995.getClass(), "type", 100);
        setField(term31995, term31995.getClass(), "first", term32041);
        term32327 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term32327, term32327.getClass(), "referenceMap", null);
        setField(term32327, term32327.getClass(), "blockStack", null);
        setField(term32327, term32327.getClass(), "behavior", null);
        setField(term32327, term32327.getClass(), "compiler", null);
        setField(term32327, term32327.getClass(), "varFilter", null);
        term32328 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term32328, term32328.getClass(), "str", null);
        setIntField(term32328, term32328.getClass(), "type", 100);
        setField(term32328, term32328.getClass(), "next", null);
        setField(term32328, term32328.getClass(), "first", null);
        setField(term32328, term32328.getClass(), "last", null);
        setField(term32328, term32328.getClass(), "propListHead", null);
        setIntField(term32328, term32328.getClass(), "sourcePosition", 0);
        setField(term32328, term32328.getClass(), "jsType", null);
        setField(term32328, term32328.getClass(), "parent", null);
        term32329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term32330 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term32329, term32329.getClass(), "str", null);
        setIntField(term32329, term32329.getClass(), "type", 100);
        setField(term32329, term32329.getClass(), "next", null);
        setField(term32330, term32330.getClass(), "str", null);
        setIntField(term32330, term32330.getClass(), "type", 100);
        setField(term32330, term32330.getClass(), "next", null);
        setField(term32330, term32330.getClass(), "first", null);
        setField(term32330, term32330.getClass(), "last", null);
        setField(term32330, term32330.getClass(), "propListHead", null);
        setIntField(term32330, term32330.getClass(), "sourcePosition", 0);
        setField(term32330, term32330.getClass(), "jsType", null);
        setField(term32330, term32330.getClass(), "parent", null);
        setField(term32329, term32329.getClass(), "first", term32330);
        setField(term32329, term32329.getClass(), "last", null);
        setField(term32329, term32329.getClass(), "propListHead", null);
        setIntField(term32329, term32329.getClass(), "sourcePosition", 0);
        setField(term32329, term32329.getClass(), "jsType", null);
        setField(term32329, term32329.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term32041;
        args[2] = term31995;
        callMethod(klass, "visit", argTypes, term31811, args);
        assertTrue(recursiveEquals(term31811, term32327));
        assertTrue(recursiveEquals(term32041, term32329));
        assertTrue(recursiveEquals(term31995, null));
    }

};


