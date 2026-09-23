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

public class PeepholeFoldConstants_optimizeSubtree_1606506993530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113047;
     Object term113117;
     Object term113817;
     Object term113818;
     Object term113809;

    public PeepholeFoldConstants_optimizeSubtree_1606506993530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113047 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term113117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113117, term113117.getClass(), "type", 36);
        term113817 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term113817, term113817.getClass(), "currentTraversal", null);
        term113818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113818, term113818.getClass(), "type", 36);
        setField(term113818, term113818.getClass(), "next", null);
        setField(term113818, term113818.getClass(), "first", null);
        setField(term113818, term113818.getClass(), "last", null);
        setField(term113818, term113818.getClass(), "propListHead", null);
        setIntField(term113818, term113818.getClass(), "sourcePosition", 0);
        setField(term113818, term113818.getClass(), "jsType", null);
        setField(term113818, term113818.getClass(), "parent", null);
        term113809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113809, term113809.getClass(), "type", 36);
        setField(term113809, term113809.getClass(), "next", null);
        setField(term113809, term113809.getClass(), "first", null);
        setField(term113809, term113809.getClass(), "last", null);
        setField(term113809, term113809.getClass(), "propListHead", null);
        setIntField(term113809, term113809.getClass(), "sourcePosition", 0);
        setField(term113809, term113809.getClass(), "jsType", null);
        setField(term113809, term113809.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term113117;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term113047, args);
        assertTrue(recursiveEquals(term113047, term113817));
        assertTrue(recursiveEquals(term113117, term113818));
        assertTrue(recursiveEquals(retValue, term113809));
    }

};


