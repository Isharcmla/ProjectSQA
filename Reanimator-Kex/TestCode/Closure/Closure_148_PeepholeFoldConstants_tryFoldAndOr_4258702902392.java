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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664527;
     Object term664597;
     Object term664667;
     Object term664702;
     Object term664703;
     Object term664704;
     Object term664671;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664527 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term664597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term664597, term664597.getClass(), "parent", term664597);
        setIntField(term664597, term664597.getClass(), "type", 47);
        term664667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term664667, term664667.getClass(), "type", 47);
        term664702 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term664702, term664702.getClass(), "currentTraversal", null);
        term664703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term664703, term664703.getClass(), "type", 47);
        setField(term664703, term664703.getClass(), "next", null);
        setField(term664703, term664703.getClass(), "first", null);
        setField(term664703, term664703.getClass(), "last", null);
        setField(term664703, term664703.getClass(), "propListHead", null);
        setIntField(term664703, term664703.getClass(), "sourcePosition", 0);
        setField(term664703, term664703.getClass(), "jsType", null);
        setField(term664703, term664703.getClass(), "parent", term664703);
        term664704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term664704, term664704.getClass(), "type", 47);
        setField(term664704, term664704.getClass(), "next", null);
        setField(term664704, term664704.getClass(), "first", null);
        setField(term664704, term664704.getClass(), "last", null);
        setField(term664704, term664704.getClass(), "propListHead", null);
        setIntField(term664704, term664704.getClass(), "sourcePosition", 0);
        setField(term664704, term664704.getClass(), "jsType", null);
        setField(term664704, term664704.getClass(), "parent", null);
        term664671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term664671, term664671.getClass(), "type", 47);
        setField(term664671, term664671.getClass(), "next", null);
        setField(term664671, term664671.getClass(), "first", null);
        setField(term664671, term664671.getClass(), "last", null);
        setField(term664671, term664671.getClass(), "propListHead", null);
        setIntField(term664671, term664671.getClass(), "sourcePosition", 0);
        setField(term664671, term664671.getClass(), "jsType", null);
        setField(term664671, term664671.getClass(), "parent", term664671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term664597;
        args[1] = term664667;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term664527, args);
        assertTrue(recursiveEquals(term664527, term664702));
        assertTrue(recursiveEquals(term664597, term664703));
        assertTrue(recursiveEquals(term664667, term664704));
        assertTrue(recursiveEquals(retValue, term664671));
    }

};


