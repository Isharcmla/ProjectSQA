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
     Object term19194;
     Object term19264;
     Object term19304;
     Object term19305;
     Object term19283;

    public PeepholeFoldConstants_optimizeSubtree_1606506993110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19194 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term19264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19264, term19264.getClass(), "type", 37);
        term19304 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term19304, term19304.getClass(), "currentTraversal", null);
        term19305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19305, term19305.getClass(), "type", 37);
        setField(term19305, term19305.getClass(), "next", null);
        setField(term19305, term19305.getClass(), "first", null);
        setField(term19305, term19305.getClass(), "last", null);
        setField(term19305, term19305.getClass(), "propListHead", null);
        setIntField(term19305, term19305.getClass(), "sourcePosition", 0);
        setField(term19305, term19305.getClass(), "jsType", null);
        setField(term19305, term19305.getClass(), "parent", null);
        term19283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19283, term19283.getClass(), "type", 37);
        setField(term19283, term19283.getClass(), "next", null);
        setField(term19283, term19283.getClass(), "first", null);
        setField(term19283, term19283.getClass(), "last", null);
        setField(term19283, term19283.getClass(), "propListHead", null);
        setIntField(term19283, term19283.getClass(), "sourcePosition", 0);
        setField(term19283, term19283.getClass(), "jsType", null);
        setField(term19283, term19283.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19264;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term19194, args);
        assertTrue(recursiveEquals(term19194, term19304));
        assertTrue(recursiveEquals(term19264, term19305));
        assertTrue(recursiveEquals(retValue, term19283));
    }

};


