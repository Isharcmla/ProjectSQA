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

public class ReferenceCollectingCallback_visit_872273174337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86621;
     Object term86851;
     Object term86805;
     Object term87493;
     Object term87494;
     Object term87495;

    public ReferenceCollectingCallback_visit_872273174337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86621 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term86851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term86851, term86851.getClass(), "type", 0);
        term86805 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term86805, term86805.getClass(), "type", 98);
        setField(term86805, term86805.getClass(), "first", term86851);
        term87493 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term87493, term87493.getClass(), "referenceMap", null);
        setField(term87493, term87493.getClass(), "blockStack", null);
        setField(term87493, term87493.getClass(), "behavior", null);
        setField(term87493, term87493.getClass(), "compiler", null);
        setField(term87493, term87493.getClass(), "varFilter", null);
        term87494 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term87494, term87494.getClass(), "str", null);
        setIntField(term87494, term87494.getClass(), "type", 0);
        setField(term87494, term87494.getClass(), "next", null);
        setField(term87494, term87494.getClass(), "first", null);
        setField(term87494, term87494.getClass(), "last", null);
        setField(term87494, term87494.getClass(), "propListHead", null);
        setIntField(term87494, term87494.getClass(), "sourcePosition", 0);
        setField(term87494, term87494.getClass(), "jsType", null);
        setField(term87494, term87494.getClass(), "parent", null);
        term87495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87496 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term87495, term87495.getClass(), "number", 0.0);
        setIntField(term87495, term87495.getClass(), "type", 98);
        setField(term87495, term87495.getClass(), "next", null);
        setField(term87496, term87496.getClass(), "str", null);
        setIntField(term87496, term87496.getClass(), "type", 0);
        setField(term87496, term87496.getClass(), "next", null);
        setField(term87496, term87496.getClass(), "first", null);
        setField(term87496, term87496.getClass(), "last", null);
        setField(term87496, term87496.getClass(), "propListHead", null);
        setIntField(term87496, term87496.getClass(), "sourcePosition", 0);
        setField(term87496, term87496.getClass(), "jsType", null);
        setField(term87496, term87496.getClass(), "parent", null);
        setField(term87495, term87495.getClass(), "first", term87496);
        setField(term87495, term87495.getClass(), "last", null);
        setField(term87495, term87495.getClass(), "propListHead", null);
        setIntField(term87495, term87495.getClass(), "sourcePosition", 0);
        setField(term87495, term87495.getClass(), "jsType", null);
        setField(term87495, term87495.getClass(), "parent", null);
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
        args[1] = term86851;
        args[2] = term86805;
        callMethod(klass, "visit", argTypes, term86621, args);
        assertTrue(recursiveEquals(term86621, term87493));
        assertTrue(recursiveEquals(term86851, term87495));
        assertTrue(recursiveEquals(term86805, null));
    }

};


