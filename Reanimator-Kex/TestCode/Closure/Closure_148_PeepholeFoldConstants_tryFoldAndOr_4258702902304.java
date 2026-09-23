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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635087;
     Object term635179;
     Object term635363;
     Object term635455;
     Object term635568;
     Object term635569;
     Object term635571;
     Object term635572;
     Object term635517;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term635087 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term635179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term635271 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term635179, term635179.getClass(), "parent", term635271);
        setIntField(term635179, term635179.getClass(), "type", 0);
        term635363 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term635363, term635363.getClass(), "type", 0);
        term635455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term635455, term635455.getClass(), "type", 47);
        term635568 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term635568, term635568.getClass(), "currentTraversal", null);
        term635569 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term635570 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term635569, term635569.getClass(), "number", 0.0);
        setIntField(term635569, term635569.getClass(), "type", 0);
        setField(term635569, term635569.getClass(), "next", null);
        setField(term635569, term635569.getClass(), "first", null);
        setField(term635569, term635569.getClass(), "last", null);
        setField(term635569, term635569.getClass(), "propListHead", null);
        setIntField(term635569, term635569.getClass(), "sourcePosition", 0);
        setField(term635569, term635569.getClass(), "jsType", null);
        setDoubleField(term635570, term635570.getClass(), "number", 0.0);
        setIntField(term635570, term635570.getClass(), "type", 0);
        setField(term635570, term635570.getClass(), "next", null);
        setField(term635570, term635570.getClass(), "first", null);
        setField(term635570, term635570.getClass(), "last", null);
        setField(term635570, term635570.getClass(), "propListHead", null);
        setIntField(term635570, term635570.getClass(), "sourcePosition", 0);
        setField(term635570, term635570.getClass(), "jsType", null);
        setField(term635570, term635570.getClass(), "parent", null);
        setField(term635569, term635569.getClass(), "parent", term635570);
        term635571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term635571, term635571.getClass(), "str", null);
        setIntField(term635571, term635571.getClass(), "type", 0);
        setField(term635571, term635571.getClass(), "next", null);
        setField(term635571, term635571.getClass(), "first", null);
        setField(term635571, term635571.getClass(), "last", null);
        setField(term635571, term635571.getClass(), "propListHead", null);
        setIntField(term635571, term635571.getClass(), "sourcePosition", 0);
        setField(term635571, term635571.getClass(), "jsType", null);
        setField(term635571, term635571.getClass(), "parent", null);
        term635572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term635572, term635572.getClass(), "number", 0.0);
        setIntField(term635572, term635572.getClass(), "type", 47);
        setField(term635572, term635572.getClass(), "next", null);
        setField(term635572, term635572.getClass(), "first", null);
        setField(term635572, term635572.getClass(), "last", null);
        setField(term635572, term635572.getClass(), "propListHead", null);
        setIntField(term635572, term635572.getClass(), "sourcePosition", 0);
        setField(term635572, term635572.getClass(), "jsType", null);
        setField(term635572, term635572.getClass(), "parent", null);
        term635517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term635521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term635517, term635517.getClass(), "number", 0.0);
        setIntField(term635517, term635517.getClass(), "type", 0);
        setField(term635517, term635517.getClass(), "next", null);
        setField(term635517, term635517.getClass(), "first", null);
        setField(term635517, term635517.getClass(), "last", null);
        setField(term635517, term635517.getClass(), "propListHead", null);
        setIntField(term635517, term635517.getClass(), "sourcePosition", 0);
        setField(term635517, term635517.getClass(), "jsType", null);
        setDoubleField(term635521, term635521.getClass(), "number", 0.0);
        setIntField(term635521, term635521.getClass(), "type", 0);
        setField(term635521, term635521.getClass(), "next", null);
        setField(term635521, term635521.getClass(), "first", null);
        setField(term635521, term635521.getClass(), "last", null);
        setField(term635521, term635521.getClass(), "propListHead", null);
        setIntField(term635521, term635521.getClass(), "sourcePosition", 0);
        setField(term635521, term635521.getClass(), "jsType", null);
        setField(term635521, term635521.getClass(), "parent", null);
        setField(term635517, term635517.getClass(), "parent", term635521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term635179;
        args[1] = term635363;
        args[2] = term635455;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term635087, args);
        assertTrue(recursiveEquals(term635087, term635568));
        assertTrue(recursiveEquals(term635179, term635569));
        assertTrue(recursiveEquals(term635363, term635571));
        assertTrue(recursiveEquals(term635455, term635572));
        assertTrue(recursiveEquals(retValue, term635517));
    }

};


