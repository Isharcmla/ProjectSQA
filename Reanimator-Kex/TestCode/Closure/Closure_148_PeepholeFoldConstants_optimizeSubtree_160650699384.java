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

public class PeepholeFoldConstants_optimizeSubtree_160650699384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15143;
     Object term15213;
     Object term15275;
     Object term15276;
     Object term15267;

    public PeepholeFoldConstants_optimizeSubtree_160650699384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15143 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term15213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15213, term15213.getClass(), "type", 34);
        term15275 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term15275, term15275.getClass(), "currentTraversal", null);
        term15276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15276, term15276.getClass(), "type", 34);
        setField(term15276, term15276.getClass(), "next", null);
        setField(term15276, term15276.getClass(), "first", null);
        setField(term15276, term15276.getClass(), "last", null);
        setField(term15276, term15276.getClass(), "propListHead", null);
        setIntField(term15276, term15276.getClass(), "sourcePosition", 0);
        setField(term15276, term15276.getClass(), "jsType", null);
        setField(term15276, term15276.getClass(), "parent", null);
        term15267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15267, term15267.getClass(), "type", 34);
        setField(term15267, term15267.getClass(), "next", null);
        setField(term15267, term15267.getClass(), "first", null);
        setField(term15267, term15267.getClass(), "last", null);
        setField(term15267, term15267.getClass(), "propListHead", null);
        setIntField(term15267, term15267.getClass(), "sourcePosition", 0);
        setField(term15267, term15267.getClass(), "jsType", null);
        setField(term15267, term15267.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15213;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term15143, args);
        assertTrue(recursiveEquals(term15143, term15275));
        assertTrue(recursiveEquals(term15213, term15276));
        assertTrue(recursiveEquals(retValue, term15267));
    }

};


