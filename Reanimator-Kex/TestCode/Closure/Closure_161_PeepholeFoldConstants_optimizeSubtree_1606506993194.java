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

public class PeepholeFoldConstants_optimizeSubtree_1606506993194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29487;
     Object term29557;
     Object term29779;
     Object term29780;
     Object term29770;

    public PeepholeFoldConstants_optimizeSubtree_1606506993194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29487 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29557, term29557.getClass(), "type", 42);
        term29779 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29779, term29779.getClass(), "currentTraversal", null);
        term29780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29780, term29780.getClass(), "type", 42);
        setField(term29780, term29780.getClass(), "next", null);
        setField(term29780, term29780.getClass(), "first", null);
        setField(term29780, term29780.getClass(), "last", null);
        setField(term29780, term29780.getClass(), "propListHead", null);
        setIntField(term29780, term29780.getClass(), "sourcePosition", 0);
        setField(term29780, term29780.getClass(), "jsType", null);
        setField(term29780, term29780.getClass(), "parent", null);
        term29770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29770, term29770.getClass(), "type", 42);
        setField(term29770, term29770.getClass(), "next", null);
        setField(term29770, term29770.getClass(), "first", null);
        setField(term29770, term29770.getClass(), "last", null);
        setField(term29770, term29770.getClass(), "propListHead", null);
        setIntField(term29770, term29770.getClass(), "sourcePosition", 0);
        setField(term29770, term29770.getClass(), "jsType", null);
        setField(term29770, term29770.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29557;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term29487, args);
        assertTrue(recursiveEquals(term29487, term29779));
        assertTrue(recursiveEquals(term29557, term29780));
        assertTrue(recursiveEquals(retValue, term29770));
    }

};


