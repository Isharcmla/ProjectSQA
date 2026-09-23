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

public class PeepholeFoldConstants_optimizeSubtree_1606506993155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29940;
     Object term30010;
     Object term30317;
     Object term30318;
     Object term30282;

    public PeepholeFoldConstants_optimizeSubtree_1606506993155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29940 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term30010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30010, term30010.getClass(), "type", 37);
        setField(term30010, term30010.getClass(), "first", term30010);
        term30317 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term30317, term30317.getClass(), "currentTraversal", null);
        term30318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30318, term30318.getClass(), "type", 37);
        setField(term30318, term30318.getClass(), "next", null);
        setField(term30318, term30318.getClass(), "first", term30318);
        setField(term30318, term30318.getClass(), "last", null);
        setField(term30318, term30318.getClass(), "propListHead", null);
        setIntField(term30318, term30318.getClass(), "sourcePosition", 0);
        setField(term30318, term30318.getClass(), "jsType", null);
        setField(term30318, term30318.getClass(), "parent", null);
        term30282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30282, term30282.getClass(), "type", 37);
        setField(term30282, term30282.getClass(), "next", null);
        setField(term30282, term30282.getClass(), "first", term30282);
        setField(term30282, term30282.getClass(), "last", null);
        setField(term30282, term30282.getClass(), "propListHead", null);
        setIntField(term30282, term30282.getClass(), "sourcePosition", 0);
        setField(term30282, term30282.getClass(), "jsType", null);
        setField(term30282, term30282.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30010;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term29940, args);
        assertTrue(recursiveEquals(term29940, term30317));
        assertTrue(recursiveEquals(term30010, term30318));
        assertTrue(recursiveEquals(retValue, term30282));
    }

};


