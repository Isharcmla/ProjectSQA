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

public class ReferenceCollectingCallback_visit_872273174340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73832;
     Object term74062;
     Object term74016;
     Object term74111;
     Object term74112;
     Object term74113;

    public ReferenceCollectingCallback_visit_872273174340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73832 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term74062 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term74062, term74062.getClass(), "type", 100);
        term74016 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term74016, term74016.getClass(), "type", 100);
        setField(term74016, term74016.getClass(), "first", term74062);
        term74111 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term74111, term74111.getClass(), "referenceMap", null);
        setField(term74111, term74111.getClass(), "blockStack", null);
        setField(term74111, term74111.getClass(), "behavior", null);
        setField(term74111, term74111.getClass(), "compiler", null);
        setField(term74111, term74111.getClass(), "varFilter", null);
        term74112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term74112, term74112.getClass(), "number", 0.0);
        setIntField(term74112, term74112.getClass(), "type", 100);
        setField(term74112, term74112.getClass(), "next", null);
        setField(term74112, term74112.getClass(), "first", null);
        setField(term74112, term74112.getClass(), "last", null);
        setField(term74112, term74112.getClass(), "propListHead", null);
        setIntField(term74112, term74112.getClass(), "sourcePosition", 0);
        setField(term74112, term74112.getClass(), "jsType", null);
        setField(term74112, term74112.getClass(), "parent", null);
        term74113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74114 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term74113, term74113.getClass(), "number", 0.0);
        setIntField(term74113, term74113.getClass(), "type", 100);
        setField(term74113, term74113.getClass(), "next", null);
        setDoubleField(term74114, term74114.getClass(), "number", 0.0);
        setIntField(term74114, term74114.getClass(), "type", 100);
        setField(term74114, term74114.getClass(), "next", null);
        setField(term74114, term74114.getClass(), "first", null);
        setField(term74114, term74114.getClass(), "last", null);
        setField(term74114, term74114.getClass(), "propListHead", null);
        setIntField(term74114, term74114.getClass(), "sourcePosition", 0);
        setField(term74114, term74114.getClass(), "jsType", null);
        setField(term74114, term74114.getClass(), "parent", null);
        setField(term74113, term74113.getClass(), "first", term74114);
        setField(term74113, term74113.getClass(), "last", null);
        setField(term74113, term74113.getClass(), "propListHead", null);
        setIntField(term74113, term74113.getClass(), "sourcePosition", 0);
        setField(term74113, term74113.getClass(), "jsType", null);
        setField(term74113, term74113.getClass(), "parent", null);
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
        args[1] = term74062;
        args[2] = term74016;
        callMethod(klass, "visit", argTypes, term73832, args);
        assertTrue(recursiveEquals(term73832, term74111));
        assertTrue(recursiveEquals(term74062, term74113));
        assertTrue(recursiveEquals(term74016, null));
    }

};


