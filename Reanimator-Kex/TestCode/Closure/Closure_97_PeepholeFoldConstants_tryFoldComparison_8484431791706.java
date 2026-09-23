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

public class PeepholeFoldConstants_tryFoldComparison_8484431791706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673989;
     Object term674081;
     Object term674173;
     Object term674265;
     Object term674726;
     Object term674727;
     Object term674728;
     Object term674729;
     Object term674700;

    public PeepholeFoldConstants_tryFoldComparison_8484431791706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673989 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term674081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term674081, term674081.getClass(), "type", 14);
        term674173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term674173, term674173.getClass(), "type", 42);
        term674265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term674265, term674265.getClass(), "type", 14);
        term674726 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term674726, term674726.getClass(), "currentTraversal", null);
        term674727 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term674727, term674727.getClass(), "number", 0.0);
        setIntField(term674727, term674727.getClass(), "type", 42);
        setField(term674727, term674727.getClass(), "next", null);
        setField(term674727, term674727.getClass(), "first", null);
        setField(term674727, term674727.getClass(), "last", null);
        setField(term674727, term674727.getClass(), "propListHead", null);
        setIntField(term674727, term674727.getClass(), "sourcePosition", 0);
        setField(term674727, term674727.getClass(), "jsType", null);
        setField(term674727, term674727.getClass(), "parent", null);
        term674728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term674728, term674728.getClass(), "number", 0.0);
        setIntField(term674728, term674728.getClass(), "type", 14);
        setField(term674728, term674728.getClass(), "next", null);
        setField(term674728, term674728.getClass(), "first", null);
        setField(term674728, term674728.getClass(), "last", null);
        setField(term674728, term674728.getClass(), "propListHead", null);
        setIntField(term674728, term674728.getClass(), "sourcePosition", 0);
        setField(term674728, term674728.getClass(), "jsType", null);
        setField(term674728, term674728.getClass(), "parent", null);
        term674729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term674729, term674729.getClass(), "str", null);
        setIntField(term674729, term674729.getClass(), "type", 14);
        setField(term674729, term674729.getClass(), "next", null);
        setField(term674729, term674729.getClass(), "first", null);
        setField(term674729, term674729.getClass(), "last", null);
        setField(term674729, term674729.getClass(), "propListHead", null);
        setIntField(term674729, term674729.getClass(), "sourcePosition", 0);
        setField(term674729, term674729.getClass(), "jsType", null);
        setField(term674729, term674729.getClass(), "parent", null);
        term674700 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term674700, term674700.getClass(), "number", 0.0);
        setIntField(term674700, term674700.getClass(), "type", 14);
        setField(term674700, term674700.getClass(), "next", null);
        setField(term674700, term674700.getClass(), "first", null);
        setField(term674700, term674700.getClass(), "last", null);
        setField(term674700, term674700.getClass(), "propListHead", null);
        setIntField(term674700, term674700.getClass(), "sourcePosition", 0);
        setField(term674700, term674700.getClass(), "jsType", null);
        setField(term674700, term674700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term674081;
        args[1] = term674173;
        args[2] = term674265;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term673989, args);
        assertTrue(recursiveEquals(term673989, term674726));
        assertTrue(recursiveEquals(term674081, term674727));
        assertTrue(recursiveEquals(term674173, term674728));
        assertTrue(recursiveEquals(term674265, term674729));
        assertTrue(recursiveEquals(retValue, term674700));
    }

};


