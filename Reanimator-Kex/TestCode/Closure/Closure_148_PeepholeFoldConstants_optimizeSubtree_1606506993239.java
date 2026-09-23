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

public class PeepholeFoldConstants_optimizeSubtree_1606506993239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45108;
     Object term45178;
     Object term45656;
     Object term45657;
     Object term45621;

    public PeepholeFoldConstants_optimizeSubtree_1606506993239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45108 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term45178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45178, term45178.getClass(), "type", 37);
        setField(term45178, term45178.getClass(), "first", term45178);
        term45656 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term45656, term45656.getClass(), "currentTraversal", null);
        term45657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45657, term45657.getClass(), "type", 37);
        setField(term45657, term45657.getClass(), "next", null);
        setField(term45657, term45657.getClass(), "first", term45657);
        setField(term45657, term45657.getClass(), "last", null);
        setField(term45657, term45657.getClass(), "propListHead", null);
        setIntField(term45657, term45657.getClass(), "sourcePosition", 0);
        setField(term45657, term45657.getClass(), "jsType", null);
        setField(term45657, term45657.getClass(), "parent", null);
        term45621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45621, term45621.getClass(), "type", 37);
        setField(term45621, term45621.getClass(), "next", null);
        setField(term45621, term45621.getClass(), "first", term45621);
        setField(term45621, term45621.getClass(), "last", null);
        setField(term45621, term45621.getClass(), "propListHead", null);
        setIntField(term45621, term45621.getClass(), "sourcePosition", 0);
        setField(term45621, term45621.getClass(), "jsType", null);
        setField(term45621, term45621.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45178;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term45108, args);
        assertTrue(recursiveEquals(term45108, term45656));
        assertTrue(recursiveEquals(term45178, term45657));
        assertTrue(recursiveEquals(retValue, term45621));
    }

};


