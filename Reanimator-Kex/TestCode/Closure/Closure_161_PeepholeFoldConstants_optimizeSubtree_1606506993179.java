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

public class PeepholeFoldConstants_optimizeSubtree_1606506993179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28039;
     Object term28109;
     Object term28153;
     Object term28154;
     Object term28144;

    public PeepholeFoldConstants_optimizeSubtree_1606506993179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28039 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28109, term28109.getClass(), "type", 56);
        term28153 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term28153, term28153.getClass(), "currentTraversal", null);
        term28154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28154, term28154.getClass(), "type", 56);
        setField(term28154, term28154.getClass(), "next", null);
        setField(term28154, term28154.getClass(), "first", null);
        setField(term28154, term28154.getClass(), "last", null);
        setField(term28154, term28154.getClass(), "propListHead", null);
        setIntField(term28154, term28154.getClass(), "sourcePosition", 0);
        setField(term28154, term28154.getClass(), "jsType", null);
        setField(term28154, term28154.getClass(), "parent", null);
        term28144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28144, term28144.getClass(), "type", 56);
        setField(term28144, term28144.getClass(), "next", null);
        setField(term28144, term28144.getClass(), "first", null);
        setField(term28144, term28144.getClass(), "last", null);
        setField(term28144, term28144.getClass(), "propListHead", null);
        setIntField(term28144, term28144.getClass(), "sourcePosition", 0);
        setField(term28144, term28144.getClass(), "jsType", null);
        setField(term28144, term28144.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28109;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term28039, args);
        assertTrue(recursiveEquals(term28039, term28153));
        assertTrue(recursiveEquals(term28109, term28154));
        assertTrue(recursiveEquals(retValue, term28144));
    }

};


