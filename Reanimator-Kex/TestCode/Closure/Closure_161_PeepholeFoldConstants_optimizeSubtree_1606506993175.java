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

public class PeepholeFoldConstants_optimizeSubtree_1606506993175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27438;
     Object term27508;
     Object term27918;
     Object term27919;
     Object term27902;

    public PeepholeFoldConstants_optimizeSubtree_1606506993175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27438 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27508, term27508.getClass(), "type", 54);
        setField(term27508, term27508.getClass(), "first", term27508);
        term27918 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27918, term27918.getClass(), "currentTraversal", null);
        term27919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27919, term27919.getClass(), "type", 54);
        setField(term27919, term27919.getClass(), "next", null);
        setField(term27919, term27919.getClass(), "first", term27919);
        setField(term27919, term27919.getClass(), "last", null);
        setField(term27919, term27919.getClass(), "propListHead", null);
        setIntField(term27919, term27919.getClass(), "sourcePosition", 0);
        setField(term27919, term27919.getClass(), "jsType", null);
        setField(term27919, term27919.getClass(), "parent", null);
        term27902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27902, term27902.getClass(), "type", 54);
        setField(term27902, term27902.getClass(), "next", null);
        setField(term27902, term27902.getClass(), "first", term27902);
        setField(term27902, term27902.getClass(), "last", null);
        setField(term27902, term27902.getClass(), "propListHead", null);
        setIntField(term27902, term27902.getClass(), "sourcePosition", 0);
        setField(term27902, term27902.getClass(), "jsType", null);
        setField(term27902, term27902.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27508;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term27438, args);
        assertTrue(recursiveEquals(term27438, term27918));
        assertTrue(recursiveEquals(term27508, term27919));
        assertTrue(recursiveEquals(retValue, term27902));
    }

};


