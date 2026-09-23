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

public class PeepholeFoldConstants_optimizeSubtree_16065069931643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420249;
     Object term420319;
     Object term420861;
     Object term420862;
     Object term420845;

    public PeepholeFoldConstants_optimizeSubtree_16065069931643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420249 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term420319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term420319, term420319.getClass(), "type", 34);
        setField(term420319, term420319.getClass(), "first", term420319);
        setField(term420319, term420319.getClass(), "next", term420319);
        term420861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term420861, term420861.getClass(), "currentTraversal", null);
        term420862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term420862, term420862.getClass(), "type", 34);
        setField(term420862, term420862.getClass(), "next", term420862);
        setField(term420862, term420862.getClass(), "first", term420862);
        setField(term420862, term420862.getClass(), "last", null);
        setField(term420862, term420862.getClass(), "propListHead", null);
        setIntField(term420862, term420862.getClass(), "sourcePosition", 0);
        setField(term420862, term420862.getClass(), "jsType", null);
        setField(term420862, term420862.getClass(), "parent", null);
        term420845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term420845, term420845.getClass(), "type", 34);
        setField(term420845, term420845.getClass(), "next", term420845);
        setField(term420845, term420845.getClass(), "first", term420845);
        setField(term420845, term420845.getClass(), "last", null);
        setField(term420845, term420845.getClass(), "propListHead", null);
        setIntField(term420845, term420845.getClass(), "sourcePosition", 0);
        setField(term420845, term420845.getClass(), "jsType", null);
        setField(term420845, term420845.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term420319;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term420249, args);
        assertTrue(recursiveEquals(term420249, term420861));
        assertTrue(recursiveEquals(term420319, term420862));
        assertTrue(recursiveEquals(retValue, term420845));
    }

};


