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

public class PeepholeFoldConstants_optimizeSubtree_160650699385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14723;
     Object term14793;
     Object term15061;
     Object term15062;
     Object term15051;

    public PeepholeFoldConstants_optimizeSubtree_160650699385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14723 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term14793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14793, term14793.getClass(), "type", 19);
        term15061 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term15061, term15061.getClass(), "currentTraversal", null);
        term15062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15062, term15062.getClass(), "type", 19);
        setField(term15062, term15062.getClass(), "next", null);
        setField(term15062, term15062.getClass(), "first", null);
        setField(term15062, term15062.getClass(), "last", null);
        setField(term15062, term15062.getClass(), "propListHead", null);
        setIntField(term15062, term15062.getClass(), "sourcePosition", 0);
        setField(term15062, term15062.getClass(), "jsType", null);
        setField(term15062, term15062.getClass(), "parent", null);
        term15051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15051, term15051.getClass(), "type", 19);
        setField(term15051, term15051.getClass(), "next", null);
        setField(term15051, term15051.getClass(), "first", null);
        setField(term15051, term15051.getClass(), "last", null);
        setField(term15051, term15051.getClass(), "propListHead", null);
        setIntField(term15051, term15051.getClass(), "sourcePosition", 0);
        setField(term15051, term15051.getClass(), "jsType", null);
        setField(term15051, term15051.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14793;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term14723, args);
        assertTrue(recursiveEquals(term14723, term15061));
        assertTrue(recursiveEquals(term14793, term15062));
        assertTrue(recursiveEquals(retValue, term15051));
    }

};


