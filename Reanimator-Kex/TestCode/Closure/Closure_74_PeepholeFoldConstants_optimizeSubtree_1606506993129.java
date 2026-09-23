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

public class PeepholeFoldConstants_optimizeSubtree_1606506993129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23095;
     Object term23165;
     Object term23444;
     Object term23445;
     Object term23435;

    public PeepholeFoldConstants_optimizeSubtree_1606506993129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23095 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term23165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23165, term23165.getClass(), "type", 61);
        term23444 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term23444, term23444.getClass(), "currentTraversal", null);
        term23445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23445, term23445.getClass(), "type", 61);
        setField(term23445, term23445.getClass(), "next", null);
        setField(term23445, term23445.getClass(), "first", null);
        setField(term23445, term23445.getClass(), "last", null);
        setField(term23445, term23445.getClass(), "propListHead", null);
        setIntField(term23445, term23445.getClass(), "sourcePosition", 0);
        setField(term23445, term23445.getClass(), "jsType", null);
        setField(term23445, term23445.getClass(), "parent", null);
        term23435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23435, term23435.getClass(), "type", 61);
        setField(term23435, term23435.getClass(), "next", null);
        setField(term23435, term23435.getClass(), "first", null);
        setField(term23435, term23435.getClass(), "last", null);
        setField(term23435, term23435.getClass(), "propListHead", null);
        setIntField(term23435, term23435.getClass(), "sourcePosition", 0);
        setField(term23435, term23435.getClass(), "jsType", null);
        setField(term23435, term23435.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23165;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term23095, args);
        assertTrue(recursiveEquals(term23095, term23444));
        assertTrue(recursiveEquals(term23165, term23445));
        assertTrue(recursiveEquals(retValue, term23435));
    }

};


