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

public class PeepholeFoldConstants_optimizeSubtree_1606506993185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28666;
     Object term28736;
     Object term28755;
     Object term28756;
     Object term28746;

    public PeepholeFoldConstants_optimizeSubtree_1606506993185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28666 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28736, term28736.getClass(), "type", 86);
        term28755 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term28755, term28755.getClass(), "currentTraversal", null);
        term28756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28756, term28756.getClass(), "type", 86);
        setField(term28756, term28756.getClass(), "next", null);
        setField(term28756, term28756.getClass(), "first", null);
        setField(term28756, term28756.getClass(), "last", null);
        setField(term28756, term28756.getClass(), "propListHead", null);
        setIntField(term28756, term28756.getClass(), "sourcePosition", 0);
        setField(term28756, term28756.getClass(), "jsType", null);
        setField(term28756, term28756.getClass(), "parent", null);
        term28746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28746, term28746.getClass(), "type", 86);
        setField(term28746, term28746.getClass(), "next", null);
        setField(term28746, term28746.getClass(), "first", null);
        setField(term28746, term28746.getClass(), "last", null);
        setField(term28746, term28746.getClass(), "propListHead", null);
        setIntField(term28746, term28746.getClass(), "sourcePosition", 0);
        setField(term28746, term28746.getClass(), "jsType", null);
        setField(term28746, term28746.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28736;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term28666, args);
        assertTrue(recursiveEquals(term28666, term28755));
        assertTrue(recursiveEquals(term28736, term28756));
        assertTrue(recursiveEquals(retValue, term28746));
    }

};


