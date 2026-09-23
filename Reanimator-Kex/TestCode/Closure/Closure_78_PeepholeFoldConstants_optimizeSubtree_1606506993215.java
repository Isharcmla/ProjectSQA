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

public class PeepholeFoldConstants_optimizeSubtree_1606506993215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34816;
     Object term34886;
     Object term34909;
     Object term34910;
     Object term34900;

    public PeepholeFoldConstants_optimizeSubtree_1606506993215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34816 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term34886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34886, term34886.getClass(), "type", 86);
        term34909 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term34909, term34909.getClass(), "currentTraversal", null);
        term34910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34910, term34910.getClass(), "type", 86);
        setField(term34910, term34910.getClass(), "next", null);
        setField(term34910, term34910.getClass(), "first", null);
        setField(term34910, term34910.getClass(), "last", null);
        setField(term34910, term34910.getClass(), "propListHead", null);
        setIntField(term34910, term34910.getClass(), "sourcePosition", 0);
        setField(term34910, term34910.getClass(), "jsType", null);
        setField(term34910, term34910.getClass(), "parent", null);
        term34900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34900, term34900.getClass(), "type", 86);
        setField(term34900, term34900.getClass(), "next", null);
        setField(term34900, term34900.getClass(), "first", null);
        setField(term34900, term34900.getClass(), "last", null);
        setField(term34900, term34900.getClass(), "propListHead", null);
        setIntField(term34900, term34900.getClass(), "sourcePosition", 0);
        setField(term34900, term34900.getClass(), "jsType", null);
        setField(term34900, term34900.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34886;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term34816, args);
        assertTrue(recursiveEquals(term34816, term34909));
        assertTrue(recursiveEquals(term34886, term34910));
        assertTrue(recursiveEquals(retValue, term34900));
    }

};


