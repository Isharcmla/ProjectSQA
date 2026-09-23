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

public class PeepholeFoldConstants_optimizeSubtree_1606506993177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27640;
     Object term27710;
     Object term28129;
     Object term28130;
     Object term28111;

    public PeepholeFoldConstants_optimizeSubtree_1606506993177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27710, term27710.getClass(), "type", 94);
        setField(term27710, term27710.getClass(), "last", term27710);
        term28129 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term28129, term28129.getClass(), "currentTraversal", null);
        term28130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28130, term28130.getClass(), "type", 94);
        setField(term28130, term28130.getClass(), "next", null);
        setField(term28130, term28130.getClass(), "first", null);
        setField(term28130, term28130.getClass(), "last", term28130);
        setField(term28130, term28130.getClass(), "propListHead", null);
        setIntField(term28130, term28130.getClass(), "sourcePosition", 0);
        setField(term28130, term28130.getClass(), "jsType", null);
        setField(term28130, term28130.getClass(), "parent", null);
        term28111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28111, term28111.getClass(), "type", 94);
        setField(term28111, term28111.getClass(), "next", null);
        setField(term28111, term28111.getClass(), "first", null);
        setField(term28111, term28111.getClass(), "last", term28111);
        setField(term28111, term28111.getClass(), "propListHead", null);
        setIntField(term28111, term28111.getClass(), "sourcePosition", 0);
        setField(term28111, term28111.getClass(), "jsType", null);
        setField(term28111, term28111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27710;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term27640, args);
        assertTrue(recursiveEquals(term27640, term28129));
        assertTrue(recursiveEquals(term27710, term28130));
        assertTrue(recursiveEquals(retValue, term28111));
    }

};


