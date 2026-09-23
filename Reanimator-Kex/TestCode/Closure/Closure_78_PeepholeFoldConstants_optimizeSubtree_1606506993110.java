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

public class PeepholeFoldConstants_optimizeSubtree_1606506993110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18626;
     Object term18696;
     Object term18942;
     Object term18943;
     Object term18933;

    public PeepholeFoldConstants_optimizeSubtree_1606506993110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18626 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18696, term18696.getClass(), "type", 65);
        term18942 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term18942, term18942.getClass(), "currentTraversal", null);
        term18943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18943, term18943.getClass(), "type", 65);
        setField(term18943, term18943.getClass(), "next", null);
        setField(term18943, term18943.getClass(), "first", null);
        setField(term18943, term18943.getClass(), "last", null);
        setField(term18943, term18943.getClass(), "propListHead", null);
        setIntField(term18943, term18943.getClass(), "sourcePosition", 0);
        setField(term18943, term18943.getClass(), "jsType", null);
        setField(term18943, term18943.getClass(), "parent", null);
        term18933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18933, term18933.getClass(), "type", 65);
        setField(term18933, term18933.getClass(), "next", null);
        setField(term18933, term18933.getClass(), "first", null);
        setField(term18933, term18933.getClass(), "last", null);
        setField(term18933, term18933.getClass(), "propListHead", null);
        setIntField(term18933, term18933.getClass(), "sourcePosition", 0);
        setField(term18933, term18933.getClass(), "jsType", null);
        setField(term18933, term18933.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18696;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term18626, args);
        assertTrue(recursiveEquals(term18626, term18942));
        assertTrue(recursiveEquals(term18696, term18943));
        assertTrue(recursiveEquals(retValue, term18933));
    }

};


