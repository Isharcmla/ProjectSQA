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

public class PeepholeFoldConstants_optimizeSubtree_1606506993210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34214;
     Object term34284;
     Object term34486;
     Object term34487;
     Object term34477;

    public PeepholeFoldConstants_optimizeSubtree_1606506993210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34214 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term34284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34284, term34284.getClass(), "type", 42);
        term34486 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term34486, term34486.getClass(), "currentTraversal", null);
        term34487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34487, term34487.getClass(), "type", 42);
        setField(term34487, term34487.getClass(), "next", null);
        setField(term34487, term34487.getClass(), "first", null);
        setField(term34487, term34487.getClass(), "last", null);
        setField(term34487, term34487.getClass(), "propListHead", null);
        setIntField(term34487, term34487.getClass(), "sourcePosition", 0);
        setField(term34487, term34487.getClass(), "jsType", null);
        setField(term34487, term34487.getClass(), "parent", null);
        term34477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34477, term34477.getClass(), "type", 42);
        setField(term34477, term34477.getClass(), "next", null);
        setField(term34477, term34477.getClass(), "first", null);
        setField(term34477, term34477.getClass(), "last", null);
        setField(term34477, term34477.getClass(), "propListHead", null);
        setIntField(term34477, term34477.getClass(), "sourcePosition", 0);
        setField(term34477, term34477.getClass(), "jsType", null);
        setField(term34477, term34477.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34284;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term34214, args);
        assertTrue(recursiveEquals(term34214, term34486));
        assertTrue(recursiveEquals(term34284, term34487));
        assertTrue(recursiveEquals(retValue, term34477));
    }

};


