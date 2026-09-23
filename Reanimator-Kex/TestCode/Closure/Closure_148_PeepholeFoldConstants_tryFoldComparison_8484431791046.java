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

public class PeepholeFoldConstants_tryFoldComparison_8484431791046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245197;
     Object term245289;
     Object term245381;
     Object term245473;
     Object term245504;
     Object term245505;
     Object term245506;
     Object term245507;
     Object term245484;

    public PeepholeFoldConstants_tryFoldComparison_8484431791046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245197 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term245289 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term245289, term245289.getClass(), "type", 16);
        term245381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term245381, term245381.getClass(), "type", 16);
        term245473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term245504 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term245504, term245504.getClass(), "currentTraversal", null);
        term245505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term245505, term245505.getClass(), "number", 0.0);
        setIntField(term245505, term245505.getClass(), "type", 16);
        setField(term245505, term245505.getClass(), "next", null);
        setField(term245505, term245505.getClass(), "first", null);
        setField(term245505, term245505.getClass(), "last", null);
        setField(term245505, term245505.getClass(), "propListHead", null);
        setIntField(term245505, term245505.getClass(), "sourcePosition", 0);
        setField(term245505, term245505.getClass(), "jsType", null);
        setField(term245505, term245505.getClass(), "parent", null);
        term245506 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term245506, term245506.getClass(), "number", 0.0);
        setIntField(term245506, term245506.getClass(), "type", 16);
        setField(term245506, term245506.getClass(), "next", null);
        setField(term245506, term245506.getClass(), "first", null);
        setField(term245506, term245506.getClass(), "last", null);
        setField(term245506, term245506.getClass(), "propListHead", null);
        setIntField(term245506, term245506.getClass(), "sourcePosition", 0);
        setField(term245506, term245506.getClass(), "jsType", null);
        setField(term245506, term245506.getClass(), "parent", null);
        term245507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term245507, term245507.getClass(), "number", 0.0);
        setIntField(term245507, term245507.getClass(), "type", 0);
        setField(term245507, term245507.getClass(), "next", null);
        setField(term245507, term245507.getClass(), "first", null);
        setField(term245507, term245507.getClass(), "last", null);
        setField(term245507, term245507.getClass(), "propListHead", null);
        setIntField(term245507, term245507.getClass(), "sourcePosition", 0);
        setField(term245507, term245507.getClass(), "jsType", null);
        setField(term245507, term245507.getClass(), "parent", null);
        term245484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term245484, term245484.getClass(), "number", 0.0);
        setIntField(term245484, term245484.getClass(), "type", 16);
        setField(term245484, term245484.getClass(), "next", null);
        setField(term245484, term245484.getClass(), "first", null);
        setField(term245484, term245484.getClass(), "last", null);
        setField(term245484, term245484.getClass(), "propListHead", null);
        setIntField(term245484, term245484.getClass(), "sourcePosition", 0);
        setField(term245484, term245484.getClass(), "jsType", null);
        setField(term245484, term245484.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term245289;
        args[1] = term245381;
        args[2] = term245473;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term245197, args);
        assertTrue(recursiveEquals(term245197, term245504));
        assertTrue(recursiveEquals(term245289, term245505));
        assertTrue(recursiveEquals(term245381, term245506));
        assertTrue(recursiveEquals(term245473, term245507));
        assertTrue(recursiveEquals(retValue, term245484));
    }

};


