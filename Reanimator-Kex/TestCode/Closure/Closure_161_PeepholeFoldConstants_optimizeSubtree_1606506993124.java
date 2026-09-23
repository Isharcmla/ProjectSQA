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

public class PeepholeFoldConstants_optimizeSubtree_1606506993124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20600;
     Object term20670;
     Object term20871;
     Object term20872;
     Object term20862;

    public PeepholeFoldConstants_optimizeSubtree_1606506993124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20670, term20670.getClass(), "type", 73);
        term20871 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20871, term20871.getClass(), "currentTraversal", null);
        term20872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20872, term20872.getClass(), "type", 73);
        setField(term20872, term20872.getClass(), "next", null);
        setField(term20872, term20872.getClass(), "first", null);
        setField(term20872, term20872.getClass(), "last", null);
        setField(term20872, term20872.getClass(), "propListHead", null);
        setIntField(term20872, term20872.getClass(), "sourcePosition", 0);
        setField(term20872, term20872.getClass(), "jsType", null);
        setField(term20872, term20872.getClass(), "parent", null);
        term20862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20862, term20862.getClass(), "type", 73);
        setField(term20862, term20862.getClass(), "next", null);
        setField(term20862, term20862.getClass(), "first", null);
        setField(term20862, term20862.getClass(), "last", null);
        setField(term20862, term20862.getClass(), "propListHead", null);
        setIntField(term20862, term20862.getClass(), "sourcePosition", 0);
        setField(term20862, term20862.getClass(), "jsType", null);
        setField(term20862, term20862.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20670;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term20600, args);
        assertTrue(recursiveEquals(term20600, term20871));
        assertTrue(recursiveEquals(term20670, term20872));
        assertTrue(recursiveEquals(retValue, term20862));
    }

};


