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

public class PeepholeFoldConstants_optimizeSubtree_1606506993105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17805;
     Object term17875;
     Object term18142;
     Object term18143;
     Object term18133;

    public PeepholeFoldConstants_optimizeSubtree_1606506993105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17805 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term17875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17875, term17875.getClass(), "type", 77);
        term18142 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term18142, term18142.getClass(), "currentTraversal", null);
        term18143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18143, term18143.getClass(), "type", 77);
        setField(term18143, term18143.getClass(), "next", null);
        setField(term18143, term18143.getClass(), "first", null);
        setField(term18143, term18143.getClass(), "last", null);
        setField(term18143, term18143.getClass(), "propListHead", null);
        setIntField(term18143, term18143.getClass(), "sourcePosition", 0);
        setField(term18143, term18143.getClass(), "jsType", null);
        setField(term18143, term18143.getClass(), "parent", null);
        term18133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18133, term18133.getClass(), "type", 77);
        setField(term18133, term18133.getClass(), "next", null);
        setField(term18133, term18133.getClass(), "first", null);
        setField(term18133, term18133.getClass(), "last", null);
        setField(term18133, term18133.getClass(), "propListHead", null);
        setIntField(term18133, term18133.getClass(), "sourcePosition", 0);
        setField(term18133, term18133.getClass(), "jsType", null);
        setField(term18133, term18133.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17875;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term17805, args);
        assertTrue(recursiveEquals(term17805, term18142));
        assertTrue(recursiveEquals(term17875, term18143));
        assertTrue(recursiveEquals(retValue, term18133));
    }

};


