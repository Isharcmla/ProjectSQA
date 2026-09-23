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

public class PeepholeFoldConstants_optimizeSubtree_1606506993316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48890;
     Object term48960;
     Object term62915;
     Object term62916;
     Object term62899;

    public PeepholeFoldConstants_optimizeSubtree_1606506993316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48890 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term48960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48960, term48960.getClass(), "type", 68);
        setField(term48960, term48960.getClass(), "first", term48960);
        term62915 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62915, term62915.getClass(), "currentTraversal", null);
        term62916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62916, term62916.getClass(), "type", 68);
        setField(term62916, term62916.getClass(), "next", null);
        setField(term62916, term62916.getClass(), "first", term62916);
        setField(term62916, term62916.getClass(), "last", null);
        setField(term62916, term62916.getClass(), "propListHead", null);
        setIntField(term62916, term62916.getClass(), "sourcePosition", 0);
        setField(term62916, term62916.getClass(), "jsType", null);
        setField(term62916, term62916.getClass(), "parent", null);
        term62899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62899, term62899.getClass(), "type", 68);
        setField(term62899, term62899.getClass(), "next", null);
        setField(term62899, term62899.getClass(), "first", term62899);
        setField(term62899, term62899.getClass(), "last", null);
        setField(term62899, term62899.getClass(), "propListHead", null);
        setIntField(term62899, term62899.getClass(), "sourcePosition", 0);
        setField(term62899, term62899.getClass(), "jsType", null);
        setField(term62899, term62899.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48960;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term48890, args);
        assertTrue(recursiveEquals(term48890, term62915));
        assertTrue(recursiveEquals(term48960, term62916));
        assertTrue(recursiveEquals(retValue, term62899));
    }

};


