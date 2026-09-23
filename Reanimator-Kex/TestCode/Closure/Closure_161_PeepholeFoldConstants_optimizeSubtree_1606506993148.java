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

public class PeepholeFoldConstants_optimizeSubtree_1606506993148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24134;
     Object term24204;
     Object term24405;
     Object term24406;
     Object term24396;

    public PeepholeFoldConstants_optimizeSubtree_1606506993148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24134 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24204, term24204.getClass(), "type", 15);
        term24405 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term24405, term24405.getClass(), "currentTraversal", null);
        term24406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24406, term24406.getClass(), "type", 15);
        setField(term24406, term24406.getClass(), "next", null);
        setField(term24406, term24406.getClass(), "first", null);
        setField(term24406, term24406.getClass(), "last", null);
        setField(term24406, term24406.getClass(), "propListHead", null);
        setIntField(term24406, term24406.getClass(), "sourcePosition", 0);
        setField(term24406, term24406.getClass(), "jsType", null);
        setField(term24406, term24406.getClass(), "parent", null);
        term24396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24396, term24396.getClass(), "type", 15);
        setField(term24396, term24396.getClass(), "next", null);
        setField(term24396, term24396.getClass(), "first", null);
        setField(term24396, term24396.getClass(), "last", null);
        setField(term24396, term24396.getClass(), "propListHead", null);
        setIntField(term24396, term24396.getClass(), "sourcePosition", 0);
        setField(term24396, term24396.getClass(), "jsType", null);
        setField(term24396, term24396.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24204;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term24134, args);
        assertTrue(recursiveEquals(term24134, term24405));
        assertTrue(recursiveEquals(term24204, term24406));
        assertTrue(recursiveEquals(retValue, term24396));
    }

};


