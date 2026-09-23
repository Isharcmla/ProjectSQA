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

public class PeepholeFoldConstants_optimizeSubtree_1606506993344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68636;
     Object term68706;
     Object term68777;
     Object term68778;
     Object term68752;

    public PeepholeFoldConstants_optimizeSubtree_1606506993344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68636 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term68706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68706, term68706.getClass(), "type", 33);
        setField(term68706, term68706.getClass(), "first", term68706);
        setField(term68706, term68706.getClass(), "next", term68706);
        term68777 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term68777, term68777.getClass(), "currentTraversal", null);
        term68778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68778, term68778.getClass(), "type", 33);
        setField(term68778, term68778.getClass(), "next", term68778);
        setField(term68778, term68778.getClass(), "first", term68778);
        setField(term68778, term68778.getClass(), "last", null);
        setField(term68778, term68778.getClass(), "propListHead", null);
        setIntField(term68778, term68778.getClass(), "sourcePosition", 0);
        setField(term68778, term68778.getClass(), "jsType", null);
        setField(term68778, term68778.getClass(), "parent", null);
        term68752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68752, term68752.getClass(), "type", 33);
        setField(term68752, term68752.getClass(), "next", term68752);
        setField(term68752, term68752.getClass(), "first", term68752);
        setField(term68752, term68752.getClass(), "last", null);
        setField(term68752, term68752.getClass(), "propListHead", null);
        setIntField(term68752, term68752.getClass(), "sourcePosition", 0);
        setField(term68752, term68752.getClass(), "jsType", null);
        setField(term68752, term68752.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term68706;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term68636, args);
        assertTrue(recursiveEquals(term68636, term68777));
        assertTrue(recursiveEquals(term68706, term68778));
        assertTrue(recursiveEquals(retValue, term68752));
    }

};


