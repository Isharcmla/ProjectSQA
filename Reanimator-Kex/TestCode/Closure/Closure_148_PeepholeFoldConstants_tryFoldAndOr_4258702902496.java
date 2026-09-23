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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701292;
     Object term701384;
     Object term701568;
     Object term701660;
     Object term701744;
     Object term701745;
     Object term701747;
     Object term701748;
     Object term701671;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term701292 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term701384 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term701476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term701476, term701476.getClass(), "type", 114);
        setField(term701384, term701384.getClass(), "parent", term701476);
        setIntField(term701384, term701384.getClass(), "type", 0);
        term701568 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term701568, term701568.getClass(), "type", 126);
        term701660 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term701660, term701660.getClass(), "type", 47);
        term701744 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term701744, term701744.getClass(), "currentTraversal", null);
        term701745 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term701746 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term701745, term701745.getClass(), "number", 0.0);
        setIntField(term701745, term701745.getClass(), "type", 0);
        setField(term701745, term701745.getClass(), "next", null);
        setField(term701745, term701745.getClass(), "first", null);
        setField(term701745, term701745.getClass(), "last", null);
        setField(term701745, term701745.getClass(), "propListHead", null);
        setIntField(term701745, term701745.getClass(), "sourcePosition", 0);
        setField(term701745, term701745.getClass(), "jsType", null);
        setDoubleField(term701746, term701746.getClass(), "number", 0.0);
        setIntField(term701746, term701746.getClass(), "type", 114);
        setField(term701746, term701746.getClass(), "next", null);
        setField(term701746, term701746.getClass(), "first", null);
        setField(term701746, term701746.getClass(), "last", null);
        setField(term701746, term701746.getClass(), "propListHead", null);
        setIntField(term701746, term701746.getClass(), "sourcePosition", 0);
        setField(term701746, term701746.getClass(), "jsType", null);
        setField(term701746, term701746.getClass(), "parent", null);
        setField(term701745, term701745.getClass(), "parent", term701746);
        term701747 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term701747, term701747.getClass(), "number", 0.0);
        setIntField(term701747, term701747.getClass(), "type", 126);
        setField(term701747, term701747.getClass(), "next", null);
        setField(term701747, term701747.getClass(), "first", null);
        setField(term701747, term701747.getClass(), "last", null);
        setField(term701747, term701747.getClass(), "propListHead", null);
        setIntField(term701747, term701747.getClass(), "sourcePosition", 0);
        setField(term701747, term701747.getClass(), "jsType", null);
        setField(term701747, term701747.getClass(), "parent", null);
        term701748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term701748, term701748.getClass(), "str", null);
        setIntField(term701748, term701748.getClass(), "type", 47);
        setField(term701748, term701748.getClass(), "next", null);
        setField(term701748, term701748.getClass(), "first", null);
        setField(term701748, term701748.getClass(), "last", null);
        setField(term701748, term701748.getClass(), "propListHead", null);
        setIntField(term701748, term701748.getClass(), "sourcePosition", 0);
        setField(term701748, term701748.getClass(), "jsType", null);
        setField(term701748, term701748.getClass(), "parent", null);
        term701671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term701675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term701671, term701671.getClass(), "number", 0.0);
        setIntField(term701671, term701671.getClass(), "type", 0);
        setField(term701671, term701671.getClass(), "next", null);
        setField(term701671, term701671.getClass(), "first", null);
        setField(term701671, term701671.getClass(), "last", null);
        setField(term701671, term701671.getClass(), "propListHead", null);
        setIntField(term701671, term701671.getClass(), "sourcePosition", 0);
        setField(term701671, term701671.getClass(), "jsType", null);
        setDoubleField(term701675, term701675.getClass(), "number", 0.0);
        setIntField(term701675, term701675.getClass(), "type", 114);
        setField(term701675, term701675.getClass(), "next", null);
        setField(term701675, term701675.getClass(), "first", null);
        setField(term701675, term701675.getClass(), "last", null);
        setField(term701675, term701675.getClass(), "propListHead", null);
        setIntField(term701675, term701675.getClass(), "sourcePosition", 0);
        setField(term701675, term701675.getClass(), "jsType", null);
        setField(term701675, term701675.getClass(), "parent", null);
        setField(term701671, term701671.getClass(), "parent", term701675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term701384;
        args[1] = term701568;
        args[2] = term701660;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term701292, args);
        assertTrue(recursiveEquals(term701292, term701744));
        assertTrue(recursiveEquals(term701384, term701745));
        assertTrue(recursiveEquals(term701568, term701747));
        assertTrue(recursiveEquals(term701660, term701748));
        assertTrue(recursiveEquals(retValue, term701671));
    }

};


