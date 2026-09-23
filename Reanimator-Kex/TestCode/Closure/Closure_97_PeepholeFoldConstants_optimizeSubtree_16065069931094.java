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

public class PeepholeFoldConstants_optimizeSubtree_16065069931094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339250;
     Object term339320;
     Object term339338;
     Object term339339;
     Object term339322;

    public PeepholeFoldConstants_optimizeSubtree_16065069931094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339250 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term339320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term339320, term339320.getClass(), "type", 34);
        setField(term339320, term339320.getClass(), "first", term339320);
        setField(term339320, term339320.getClass(), "next", term339320);
        term339338 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term339338, term339338.getClass(), "currentTraversal", null);
        term339339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term339339, term339339.getClass(), "type", 34);
        setField(term339339, term339339.getClass(), "next", term339339);
        setField(term339339, term339339.getClass(), "first", term339339);
        setField(term339339, term339339.getClass(), "last", null);
        setField(term339339, term339339.getClass(), "propListHead", null);
        setIntField(term339339, term339339.getClass(), "sourcePosition", 0);
        setField(term339339, term339339.getClass(), "jsType", null);
        setField(term339339, term339339.getClass(), "parent", null);
        term339322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term339322, term339322.getClass(), "type", 34);
        setField(term339322, term339322.getClass(), "next", term339322);
        setField(term339322, term339322.getClass(), "first", term339322);
        setField(term339322, term339322.getClass(), "last", null);
        setField(term339322, term339322.getClass(), "propListHead", null);
        setIntField(term339322, term339322.getClass(), "sourcePosition", 0);
        setField(term339322, term339322.getClass(), "jsType", null);
        setField(term339322, term339322.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term339320;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term339250, args);
        assertTrue(recursiveEquals(term339250, term339338));
        assertTrue(recursiveEquals(term339320, term339339));
        assertTrue(recursiveEquals(retValue, term339322));
    }

};


