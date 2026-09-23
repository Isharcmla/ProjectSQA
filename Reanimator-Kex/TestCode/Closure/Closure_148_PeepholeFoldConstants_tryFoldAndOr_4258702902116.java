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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575018;
     Object term575110;
     Object term575294;
     Object term575364;
     Object term575700;
     Object term575701;
     Object term575703;
     Object term575704;
     Object term575658;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term575018 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term575110 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term575202 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term575110, term575110.getClass(), "parent", term575202);
        setIntField(term575110, term575110.getClass(), "type", 0);
        term575294 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term575294, term575294.getClass(), "type", 0);
        term575364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term575700 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term575700, term575700.getClass(), "currentTraversal", null);
        term575701 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term575702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term575701, term575701.getClass(), "str", null);
        setIntField(term575701, term575701.getClass(), "type", 0);
        setField(term575701, term575701.getClass(), "next", null);
        setField(term575701, term575701.getClass(), "first", null);
        setField(term575701, term575701.getClass(), "last", null);
        setField(term575701, term575701.getClass(), "propListHead", null);
        setIntField(term575701, term575701.getClass(), "sourcePosition", 0);
        setField(term575701, term575701.getClass(), "jsType", null);
        setField(term575702, term575702.getClass(), "str", null);
        setIntField(term575702, term575702.getClass(), "type", 0);
        setField(term575702, term575702.getClass(), "next", null);
        setField(term575702, term575702.getClass(), "first", null);
        setField(term575702, term575702.getClass(), "last", null);
        setField(term575702, term575702.getClass(), "propListHead", null);
        setIntField(term575702, term575702.getClass(), "sourcePosition", 0);
        setField(term575702, term575702.getClass(), "jsType", null);
        setField(term575702, term575702.getClass(), "parent", null);
        setField(term575701, term575701.getClass(), "parent", term575702);
        term575703 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term575703, term575703.getClass(), "number", 0.0);
        setIntField(term575703, term575703.getClass(), "type", 0);
        setField(term575703, term575703.getClass(), "next", null);
        setField(term575703, term575703.getClass(), "first", null);
        setField(term575703, term575703.getClass(), "last", null);
        setField(term575703, term575703.getClass(), "propListHead", null);
        setIntField(term575703, term575703.getClass(), "sourcePosition", 0);
        setField(term575703, term575703.getClass(), "jsType", null);
        setField(term575703, term575703.getClass(), "parent", null);
        term575704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term575704, term575704.getClass(), "type", 0);
        setField(term575704, term575704.getClass(), "next", null);
        setField(term575704, term575704.getClass(), "first", null);
        setField(term575704, term575704.getClass(), "last", null);
        setField(term575704, term575704.getClass(), "propListHead", null);
        setIntField(term575704, term575704.getClass(), "sourcePosition", 0);
        setField(term575704, term575704.getClass(), "jsType", null);
        setField(term575704, term575704.getClass(), "parent", null);
        term575658 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term575661 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term575658, term575658.getClass(), "str", null);
        setIntField(term575658, term575658.getClass(), "type", 0);
        setField(term575658, term575658.getClass(), "next", null);
        setField(term575658, term575658.getClass(), "first", null);
        setField(term575658, term575658.getClass(), "last", null);
        setField(term575658, term575658.getClass(), "propListHead", null);
        setIntField(term575658, term575658.getClass(), "sourcePosition", 0);
        setField(term575658, term575658.getClass(), "jsType", null);
        setField(term575661, term575661.getClass(), "str", null);
        setIntField(term575661, term575661.getClass(), "type", 0);
        setField(term575661, term575661.getClass(), "next", null);
        setField(term575661, term575661.getClass(), "first", null);
        setField(term575661, term575661.getClass(), "last", null);
        setField(term575661, term575661.getClass(), "propListHead", null);
        setIntField(term575661, term575661.getClass(), "sourcePosition", 0);
        setField(term575661, term575661.getClass(), "jsType", null);
        setField(term575661, term575661.getClass(), "parent", null);
        setField(term575658, term575658.getClass(), "parent", term575661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term575110;
        args[1] = term575294;
        args[2] = term575364;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term575018, args);
        assertTrue(recursiveEquals(term575018, term575700));
        assertTrue(recursiveEquals(term575110, term575701));
        assertTrue(recursiveEquals(term575294, term575703));
        assertTrue(recursiveEquals(term575364, term575704));
        assertTrue(recursiveEquals(retValue, term575658));
    }

};


