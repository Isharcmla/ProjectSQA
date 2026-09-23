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

public class PeepholeFoldConstants_tryFoldAdd_17496499312072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558797;
     Object term558889;
     Object term558981;
     Object term559073;
     Object term559611;
     Object term559612;
     Object term559613;
     Object term559614;
     Object term559584;

    public PeepholeFoldConstants_tryFoldAdd_17496499312072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558797 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term558889 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term558889, term558889.getClass(), "type", 21);
        term558981 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term558981, term558981.getClass(), "type", 21);
        term559073 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term559611 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term559611, term559611.getClass(), "currentTraversal", null);
        term559612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term559612, term559612.getClass(), "str", null);
        setIntField(term559612, term559612.getClass(), "type", 21);
        setField(term559612, term559612.getClass(), "next", null);
        setField(term559612, term559612.getClass(), "first", null);
        setField(term559612, term559612.getClass(), "last", null);
        setField(term559612, term559612.getClass(), "propListHead", null);
        setIntField(term559612, term559612.getClass(), "sourcePosition", 0);
        setField(term559612, term559612.getClass(), "jsType", null);
        setField(term559612, term559612.getClass(), "parent", null);
        term559613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term559613, term559613.getClass(), "number", 0.0);
        setIntField(term559613, term559613.getClass(), "type", 21);
        setField(term559613, term559613.getClass(), "next", null);
        setField(term559613, term559613.getClass(), "first", null);
        setField(term559613, term559613.getClass(), "last", null);
        setField(term559613, term559613.getClass(), "propListHead", null);
        setIntField(term559613, term559613.getClass(), "sourcePosition", 0);
        setField(term559613, term559613.getClass(), "jsType", null);
        setField(term559613, term559613.getClass(), "parent", null);
        term559614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term559614, term559614.getClass(), "str", null);
        setIntField(term559614, term559614.getClass(), "type", 0);
        setField(term559614, term559614.getClass(), "next", null);
        setField(term559614, term559614.getClass(), "first", null);
        setField(term559614, term559614.getClass(), "last", null);
        setField(term559614, term559614.getClass(), "propListHead", null);
        setIntField(term559614, term559614.getClass(), "sourcePosition", 0);
        setField(term559614, term559614.getClass(), "jsType", null);
        setField(term559614, term559614.getClass(), "parent", null);
        term559584 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term559584, term559584.getClass(), "str", null);
        setIntField(term559584, term559584.getClass(), "type", 21);
        setField(term559584, term559584.getClass(), "next", null);
        setField(term559584, term559584.getClass(), "first", null);
        setField(term559584, term559584.getClass(), "last", null);
        setField(term559584, term559584.getClass(), "propListHead", null);
        setIntField(term559584, term559584.getClass(), "sourcePosition", 0);
        setField(term559584, term559584.getClass(), "jsType", null);
        setField(term559584, term559584.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term558889;
        args[1] = term558981;
        args[2] = term559073;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term558797, args);
        assertTrue(recursiveEquals(term558797, term559611));
        assertTrue(recursiveEquals(term558889, term559612));
        assertTrue(recursiveEquals(term558981, term559613));
        assertTrue(recursiveEquals(term559073, term559614));
        assertTrue(recursiveEquals(retValue, term559584));
    }

};


