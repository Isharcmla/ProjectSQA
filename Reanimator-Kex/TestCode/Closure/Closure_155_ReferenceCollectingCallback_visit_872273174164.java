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

public class ReferenceCollectingCallback_visit_872273174164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36705;
     Object term36935;
     Object term36889;
     Object term37492;
     Object term37493;
     Object term37494;

    public ReferenceCollectingCallback_visit_872273174164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36705 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term36935 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term36935, term36935.getClass(), "type", 98);
        term36889 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term36889, term36889.getClass(), "type", 98);
        setField(term36889, term36889.getClass(), "first", term36935);
        term37492 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term37492, term37492.getClass(), "referenceMap", null);
        setField(term37492, term37492.getClass(), "blockStack", null);
        setField(term37492, term37492.getClass(), "behavior", null);
        setField(term37492, term37492.getClass(), "compiler", null);
        setField(term37492, term37492.getClass(), "varFilter", null);
        term37493 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term37493, term37493.getClass(), "str", null);
        setIntField(term37493, term37493.getClass(), "type", 98);
        setField(term37493, term37493.getClass(), "next", null);
        setField(term37493, term37493.getClass(), "first", null);
        setField(term37493, term37493.getClass(), "last", null);
        setField(term37493, term37493.getClass(), "propListHead", null);
        setIntField(term37493, term37493.getClass(), "sourcePosition", 0);
        setField(term37493, term37493.getClass(), "jsType", null);
        setField(term37493, term37493.getClass(), "parent", null);
        term37494 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term37495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term37494, term37494.getClass(), "str", null);
        setIntField(term37494, term37494.getClass(), "type", 98);
        setField(term37494, term37494.getClass(), "next", null);
        setField(term37495, term37495.getClass(), "str", null);
        setIntField(term37495, term37495.getClass(), "type", 98);
        setField(term37495, term37495.getClass(), "next", null);
        setField(term37495, term37495.getClass(), "first", null);
        setField(term37495, term37495.getClass(), "last", null);
        setField(term37495, term37495.getClass(), "propListHead", null);
        setIntField(term37495, term37495.getClass(), "sourcePosition", 0);
        setField(term37495, term37495.getClass(), "jsType", null);
        setField(term37495, term37495.getClass(), "parent", null);
        setField(term37494, term37494.getClass(), "first", term37495);
        setField(term37494, term37494.getClass(), "last", null);
        setField(term37494, term37494.getClass(), "propListHead", null);
        setIntField(term37494, term37494.getClass(), "sourcePosition", 0);
        setField(term37494, term37494.getClass(), "jsType", null);
        setField(term37494, term37494.getClass(), "parent", null);
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
        args[1] = term36935;
        args[2] = term36889;
        callMethod(klass, "visit", argTypes, term36705, args);
        assertTrue(recursiveEquals(term36705, term37492));
        assertTrue(recursiveEquals(term36935, term37494));
        assertTrue(recursiveEquals(term36889, null));
    }

};


