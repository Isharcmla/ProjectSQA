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

public class ReferenceCollectingCallback_visit_872273174662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174061;
     Object term174291;
     Object term174245;
     Object term174601;
     Object term174602;
     Object term174603;

    public ReferenceCollectingCallback_visit_872273174662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174061 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term174291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term174291, term174291.getClass(), "type", 0);
        term174245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term174245, term174245.getClass(), "type", 108);
        setField(term174245, term174245.getClass(), "first", term174291);
        term174601 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term174601, term174601.getClass(), "referenceMap", null);
        setField(term174601, term174601.getClass(), "blockStack", null);
        setField(term174601, term174601.getClass(), "behavior", null);
        setField(term174601, term174601.getClass(), "compiler", null);
        setField(term174601, term174601.getClass(), "varFilter", null);
        term174602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term174602, term174602.getClass(), "number", 0.0);
        setIntField(term174602, term174602.getClass(), "type", 0);
        setField(term174602, term174602.getClass(), "next", null);
        setField(term174602, term174602.getClass(), "first", null);
        setField(term174602, term174602.getClass(), "last", null);
        setField(term174602, term174602.getClass(), "propListHead", null);
        setIntField(term174602, term174602.getClass(), "sourcePosition", 0);
        setField(term174602, term174602.getClass(), "jsType", null);
        setField(term174602, term174602.getClass(), "parent", null);
        term174603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174604 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term174603, term174603.getClass(), "str", null);
        setIntField(term174603, term174603.getClass(), "type", 108);
        setField(term174603, term174603.getClass(), "next", null);
        setDoubleField(term174604, term174604.getClass(), "number", 0.0);
        setIntField(term174604, term174604.getClass(), "type", 0);
        setField(term174604, term174604.getClass(), "next", null);
        setField(term174604, term174604.getClass(), "first", null);
        setField(term174604, term174604.getClass(), "last", null);
        setField(term174604, term174604.getClass(), "propListHead", null);
        setIntField(term174604, term174604.getClass(), "sourcePosition", 0);
        setField(term174604, term174604.getClass(), "jsType", null);
        setField(term174604, term174604.getClass(), "parent", null);
        setField(term174603, term174603.getClass(), "first", term174604);
        setField(term174603, term174603.getClass(), "last", null);
        setField(term174603, term174603.getClass(), "propListHead", null);
        setIntField(term174603, term174603.getClass(), "sourcePosition", 0);
        setField(term174603, term174603.getClass(), "jsType", null);
        setField(term174603, term174603.getClass(), "parent", null);
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
        args[1] = term174291;
        args[2] = term174245;
        callMethod(klass, "visit", argTypes, term174061, args);
        assertTrue(recursiveEquals(term174061, term174601));
        assertTrue(recursiveEquals(term174291, term174603));
        assertTrue(recursiveEquals(term174245, null));
    }

};


