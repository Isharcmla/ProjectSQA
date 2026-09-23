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

public class PeepholeFoldConstants_optimizeSubtree_1606506993157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26228;
     Object term26298;
     Object term26309;
     Object term26310;
     Object term26300;

    public PeepholeFoldConstants_optimizeSubtree_1606506993157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26228 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26298, term26298.getClass(), "type", 79);
        term26309 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26309, term26309.getClass(), "currentTraversal", null);
        term26310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26310, term26310.getClass(), "type", 79);
        setField(term26310, term26310.getClass(), "next", null);
        setField(term26310, term26310.getClass(), "first", null);
        setField(term26310, term26310.getClass(), "last", null);
        setField(term26310, term26310.getClass(), "propListHead", null);
        setIntField(term26310, term26310.getClass(), "sourcePosition", 0);
        setField(term26310, term26310.getClass(), "jsType", null);
        setField(term26310, term26310.getClass(), "parent", null);
        term26300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26300, term26300.getClass(), "type", 79);
        setField(term26300, term26300.getClass(), "next", null);
        setField(term26300, term26300.getClass(), "first", null);
        setField(term26300, term26300.getClass(), "last", null);
        setField(term26300, term26300.getClass(), "propListHead", null);
        setIntField(term26300, term26300.getClass(), "sourcePosition", 0);
        setField(term26300, term26300.getClass(), "jsType", null);
        setField(term26300, term26300.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26298;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term26228, args);
        assertTrue(recursiveEquals(term26228, term26309));
        assertTrue(recursiveEquals(term26298, term26310));
        assertTrue(recursiveEquals(retValue, term26300));
    }

};


