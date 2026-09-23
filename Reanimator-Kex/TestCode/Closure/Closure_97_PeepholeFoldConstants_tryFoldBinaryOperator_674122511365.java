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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84631;
     Object term84723;
     Object term85413;
     Object term85414;
     Object term85362;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84631 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term84723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term84815, term84815.getClass(), "next", term84907);
        setField(term84723, term84723.getClass(), "first", term84815);
        setIntField(term84723, term84723.getClass(), "type", 14);
        term85413 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term85413, term85413.getClass(), "currentTraversal", null);
        term85414 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85415 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85416 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term85414, term85414.getClass(), "number", 0.0);
        setIntField(term85414, term85414.getClass(), "type", 14);
        setField(term85414, term85414.getClass(), "next", null);
        setDoubleField(term85415, term85415.getClass(), "number", 0.0);
        setIntField(term85415, term85415.getClass(), "type", 0);
        setDoubleField(term85416, term85416.getClass(), "number", 0.0);
        setIntField(term85416, term85416.getClass(), "type", 0);
        setField(term85416, term85416.getClass(), "next", null);
        setField(term85416, term85416.getClass(), "first", null);
        setField(term85416, term85416.getClass(), "last", null);
        setField(term85416, term85416.getClass(), "propListHead", null);
        setIntField(term85416, term85416.getClass(), "sourcePosition", 0);
        setField(term85416, term85416.getClass(), "jsType", null);
        setField(term85416, term85416.getClass(), "parent", null);
        setField(term85415, term85415.getClass(), "next", term85416);
        setField(term85415, term85415.getClass(), "first", null);
        setField(term85415, term85415.getClass(), "last", null);
        setField(term85415, term85415.getClass(), "propListHead", null);
        setIntField(term85415, term85415.getClass(), "sourcePosition", 0);
        setField(term85415, term85415.getClass(), "jsType", null);
        setField(term85415, term85415.getClass(), "parent", null);
        setField(term85414, term85414.getClass(), "first", term85415);
        setField(term85414, term85414.getClass(), "last", null);
        setField(term85414, term85414.getClass(), "propListHead", null);
        setIntField(term85414, term85414.getClass(), "sourcePosition", 0);
        setField(term85414, term85414.getClass(), "jsType", null);
        setField(term85414, term85414.getClass(), "parent", null);
        term85362 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85368 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term85362, term85362.getClass(), "number", 0.0);
        setIntField(term85362, term85362.getClass(), "type", 14);
        setField(term85362, term85362.getClass(), "next", null);
        setDoubleField(term85365, term85365.getClass(), "number", 0.0);
        setIntField(term85365, term85365.getClass(), "type", 0);
        setDoubleField(term85368, term85368.getClass(), "number", 0.0);
        setIntField(term85368, term85368.getClass(), "type", 0);
        setField(term85368, term85368.getClass(), "next", null);
        setField(term85368, term85368.getClass(), "first", null);
        setField(term85368, term85368.getClass(), "last", null);
        setField(term85368, term85368.getClass(), "propListHead", null);
        setIntField(term85368, term85368.getClass(), "sourcePosition", 0);
        setField(term85368, term85368.getClass(), "jsType", null);
        setField(term85368, term85368.getClass(), "parent", null);
        setField(term85365, term85365.getClass(), "next", term85368);
        setField(term85365, term85365.getClass(), "first", null);
        setField(term85365, term85365.getClass(), "last", null);
        setField(term85365, term85365.getClass(), "propListHead", null);
        setIntField(term85365, term85365.getClass(), "sourcePosition", 0);
        setField(term85365, term85365.getClass(), "jsType", null);
        setField(term85365, term85365.getClass(), "parent", null);
        setField(term85362, term85362.getClass(), "first", term85365);
        setField(term85362, term85362.getClass(), "last", null);
        setField(term85362, term85362.getClass(), "propListHead", null);
        setIntField(term85362, term85362.getClass(), "sourcePosition", 0);
        setField(term85362, term85362.getClass(), "jsType", null);
        setField(term85362, term85362.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term84723;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term84631, args);
        assertTrue(recursiveEquals(term84631, term85413));
        assertTrue(recursiveEquals(term84723, term85414));
        assertTrue(recursiveEquals(retValue, term85362));
    }

};


