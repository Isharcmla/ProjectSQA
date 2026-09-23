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

public class PeepholeFoldConstants_optimizeSubtree_1606506993315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48699;
     Object term48769;
     Object term62896;
     Object term62897;
     Object term62886;

    public PeepholeFoldConstants_optimizeSubtree_1606506993315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48699 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term48769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48769, term48769.getClass(), "type", 9);
        term62896 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62896, term62896.getClass(), "currentTraversal", null);
        term62897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62897, term62897.getClass(), "type", 9);
        setField(term62897, term62897.getClass(), "next", null);
        setField(term62897, term62897.getClass(), "first", null);
        setField(term62897, term62897.getClass(), "last", null);
        setField(term62897, term62897.getClass(), "propListHead", null);
        setIntField(term62897, term62897.getClass(), "sourcePosition", 0);
        setField(term62897, term62897.getClass(), "jsType", null);
        setField(term62897, term62897.getClass(), "parent", null);
        term62886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62886, term62886.getClass(), "type", 9);
        setField(term62886, term62886.getClass(), "next", null);
        setField(term62886, term62886.getClass(), "first", null);
        setField(term62886, term62886.getClass(), "last", null);
        setField(term62886, term62886.getClass(), "propListHead", null);
        setIntField(term62886, term62886.getClass(), "sourcePosition", 0);
        setField(term62886, term62886.getClass(), "jsType", null);
        setField(term62886, term62886.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48769;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term48699, args);
        assertTrue(recursiveEquals(term48699, term62896));
        assertTrue(recursiveEquals(term48769, term62897));
        assertTrue(recursiveEquals(retValue, term62886));
    }

};


