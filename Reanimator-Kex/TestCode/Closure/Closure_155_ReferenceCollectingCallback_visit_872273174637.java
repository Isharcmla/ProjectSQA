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

public class ReferenceCollectingCallback_visit_872273174637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167198;
     Object term167428;
     Object term167382;
     Object term168096;
     Object term168097;
     Object term168098;

    public ReferenceCollectingCallback_visit_872273174637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167198 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term167428 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term167428, term167428.getClass(), "type", 0);
        term167382 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term167382, term167382.getClass(), "type", 100);
        setField(term167382, term167382.getClass(), "first", term167428);
        term168096 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term168096, term168096.getClass(), "referenceMap", null);
        setField(term168096, term168096.getClass(), "blockStack", null);
        setField(term168096, term168096.getClass(), "behavior", null);
        setField(term168096, term168096.getClass(), "compiler", null);
        setField(term168096, term168096.getClass(), "varFilter", null);
        term168097 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term168097, term168097.getClass(), "number", 0.0);
        setIntField(term168097, term168097.getClass(), "type", 0);
        setField(term168097, term168097.getClass(), "next", null);
        setField(term168097, term168097.getClass(), "first", null);
        setField(term168097, term168097.getClass(), "last", null);
        setField(term168097, term168097.getClass(), "propListHead", null);
        setIntField(term168097, term168097.getClass(), "sourcePosition", 0);
        setField(term168097, term168097.getClass(), "jsType", null);
        setField(term168097, term168097.getClass(), "parent", null);
        term168098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term168099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term168098, term168098.getClass(), "str", null);
        setIntField(term168098, term168098.getClass(), "type", 100);
        setField(term168098, term168098.getClass(), "next", null);
        setDoubleField(term168099, term168099.getClass(), "number", 0.0);
        setIntField(term168099, term168099.getClass(), "type", 0);
        setField(term168099, term168099.getClass(), "next", null);
        setField(term168099, term168099.getClass(), "first", null);
        setField(term168099, term168099.getClass(), "last", null);
        setField(term168099, term168099.getClass(), "propListHead", null);
        setIntField(term168099, term168099.getClass(), "sourcePosition", 0);
        setField(term168099, term168099.getClass(), "jsType", null);
        setField(term168099, term168099.getClass(), "parent", null);
        setField(term168098, term168098.getClass(), "first", term168099);
        setField(term168098, term168098.getClass(), "last", null);
        setField(term168098, term168098.getClass(), "propListHead", null);
        setIntField(term168098, term168098.getClass(), "sourcePosition", 0);
        setField(term168098, term168098.getClass(), "jsType", null);
        setField(term168098, term168098.getClass(), "parent", null);
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
        args[1] = term167428;
        args[2] = term167382;
        callMethod(klass, "visit", argTypes, term167198, args);
        assertTrue(recursiveEquals(term167198, term168096));
        assertTrue(recursiveEquals(term167428, term168098));
        assertTrue(recursiveEquals(term167382, null));
    }

};


