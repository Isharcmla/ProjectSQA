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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802583;
     Object term802675;
     Object term802859;
     Object term802951;
     Object term803013;
     Object term803014;
     Object term803016;
     Object term803017;
     Object term802962;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term802583 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term802675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term802767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term802675, term802675.getClass(), "parent", term802767);
        setIntField(term802675, term802675.getClass(), "type", 0);
        term802859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term802859, term802859.getClass(), "type", 0);
        term802951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term802951, term802951.getClass(), "type", 64);
        term803013 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term803013, term803013.getClass(), "currentTraversal", null);
        term803014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term803015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term803014, term803014.getClass(), "number", 0.0);
        setIntField(term803014, term803014.getClass(), "type", 0);
        setField(term803014, term803014.getClass(), "next", null);
        setField(term803014, term803014.getClass(), "first", null);
        setField(term803014, term803014.getClass(), "last", null);
        setField(term803014, term803014.getClass(), "propListHead", null);
        setIntField(term803014, term803014.getClass(), "sourcePosition", 0);
        setField(term803014, term803014.getClass(), "jsType", null);
        setDoubleField(term803015, term803015.getClass(), "number", 0.0);
        setIntField(term803015, term803015.getClass(), "type", 0);
        setField(term803015, term803015.getClass(), "next", null);
        setField(term803015, term803015.getClass(), "first", null);
        setField(term803015, term803015.getClass(), "last", null);
        setField(term803015, term803015.getClass(), "propListHead", null);
        setIntField(term803015, term803015.getClass(), "sourcePosition", 0);
        setField(term803015, term803015.getClass(), "jsType", null);
        setField(term803015, term803015.getClass(), "parent", null);
        setField(term803014, term803014.getClass(), "parent", term803015);
        term803016 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term803016, term803016.getClass(), "number", 0.0);
        setIntField(term803016, term803016.getClass(), "type", 0);
        setField(term803016, term803016.getClass(), "next", null);
        setField(term803016, term803016.getClass(), "first", null);
        setField(term803016, term803016.getClass(), "last", null);
        setField(term803016, term803016.getClass(), "propListHead", null);
        setIntField(term803016, term803016.getClass(), "sourcePosition", 0);
        setField(term803016, term803016.getClass(), "jsType", null);
        setField(term803016, term803016.getClass(), "parent", null);
        term803017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term803017, term803017.getClass(), "str", null);
        setIntField(term803017, term803017.getClass(), "type", 64);
        setField(term803017, term803017.getClass(), "next", null);
        setField(term803017, term803017.getClass(), "first", null);
        setField(term803017, term803017.getClass(), "last", null);
        setField(term803017, term803017.getClass(), "propListHead", null);
        setIntField(term803017, term803017.getClass(), "sourcePosition", 0);
        setField(term803017, term803017.getClass(), "jsType", null);
        setField(term803017, term803017.getClass(), "parent", null);
        term802962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term802966 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term802962, term802962.getClass(), "number", 0.0);
        setIntField(term802962, term802962.getClass(), "type", 0);
        setField(term802962, term802962.getClass(), "next", null);
        setField(term802962, term802962.getClass(), "first", null);
        setField(term802962, term802962.getClass(), "last", null);
        setField(term802962, term802962.getClass(), "propListHead", null);
        setIntField(term802962, term802962.getClass(), "sourcePosition", 0);
        setField(term802962, term802962.getClass(), "jsType", null);
        setDoubleField(term802966, term802966.getClass(), "number", 0.0);
        setIntField(term802966, term802966.getClass(), "type", 0);
        setField(term802966, term802966.getClass(), "next", null);
        setField(term802966, term802966.getClass(), "first", null);
        setField(term802966, term802966.getClass(), "last", null);
        setField(term802966, term802966.getClass(), "propListHead", null);
        setIntField(term802966, term802966.getClass(), "sourcePosition", 0);
        setField(term802966, term802966.getClass(), "jsType", null);
        setField(term802966, term802966.getClass(), "parent", null);
        setField(term802962, term802962.getClass(), "parent", term802966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term802675;
        args[1] = term802859;
        args[2] = term802951;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term802583, args);
        assertTrue(recursiveEquals(term802583, term803013));
        assertTrue(recursiveEquals(term802675, term803014));
        assertTrue(recursiveEquals(term802859, term803016));
        assertTrue(recursiveEquals(term802951, term803017));
        assertTrue(recursiveEquals(retValue, term802962));
    }

};


