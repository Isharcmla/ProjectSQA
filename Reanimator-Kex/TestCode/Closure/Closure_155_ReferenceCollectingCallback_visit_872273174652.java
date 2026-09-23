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

public class ReferenceCollectingCallback_visit_872273174652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172082;
     Object term172312;
     Object term172266;
     Object term172362;
     Object term172363;
     Object term172364;

    public ReferenceCollectingCallback_visit_872273174652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172082 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term172312 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term172312, term172312.getClass(), "type", 0);
        term172266 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term172266, term172266.getClass(), "type", 101);
        setField(term172266, term172266.getClass(), "first", term172312);
        term172362 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term172362, term172362.getClass(), "referenceMap", null);
        setField(term172362, term172362.getClass(), "blockStack", null);
        setField(term172362, term172362.getClass(), "behavior", null);
        setField(term172362, term172362.getClass(), "compiler", null);
        setField(term172362, term172362.getClass(), "varFilter", null);
        term172363 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term172363, term172363.getClass(), "str", null);
        setIntField(term172363, term172363.getClass(), "type", 0);
        setField(term172363, term172363.getClass(), "next", null);
        setField(term172363, term172363.getClass(), "first", null);
        setField(term172363, term172363.getClass(), "last", null);
        setField(term172363, term172363.getClass(), "propListHead", null);
        setIntField(term172363, term172363.getClass(), "sourcePosition", 0);
        setField(term172363, term172363.getClass(), "jsType", null);
        setField(term172363, term172363.getClass(), "parent", null);
        term172364 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term172365 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term172364, term172364.getClass(), "number", 0.0);
        setIntField(term172364, term172364.getClass(), "type", 101);
        setField(term172364, term172364.getClass(), "next", null);
        setField(term172365, term172365.getClass(), "str", null);
        setIntField(term172365, term172365.getClass(), "type", 0);
        setField(term172365, term172365.getClass(), "next", null);
        setField(term172365, term172365.getClass(), "first", null);
        setField(term172365, term172365.getClass(), "last", null);
        setField(term172365, term172365.getClass(), "propListHead", null);
        setIntField(term172365, term172365.getClass(), "sourcePosition", 0);
        setField(term172365, term172365.getClass(), "jsType", null);
        setField(term172365, term172365.getClass(), "parent", null);
        setField(term172364, term172364.getClass(), "first", term172365);
        setField(term172364, term172364.getClass(), "last", null);
        setField(term172364, term172364.getClass(), "propListHead", null);
        setIntField(term172364, term172364.getClass(), "sourcePosition", 0);
        setField(term172364, term172364.getClass(), "jsType", null);
        setField(term172364, term172364.getClass(), "parent", null);
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
        args[1] = term172312;
        args[2] = term172266;
        callMethod(klass, "visit", argTypes, term172082, args);
        assertTrue(recursiveEquals(term172082, term172362));
        assertTrue(recursiveEquals(term172312, term172364));
        assertTrue(recursiveEquals(term172266, null));
    }

};


