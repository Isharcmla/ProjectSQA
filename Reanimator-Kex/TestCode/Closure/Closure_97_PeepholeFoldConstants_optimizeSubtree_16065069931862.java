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

public class PeepholeFoldConstants_optimizeSubtree_16065069931862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716206;
     Object term716276;
     Object term716346;
     Object term716347;
     Object term716338;

    public PeepholeFoldConstants_optimizeSubtree_16065069931862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716206 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term716276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term716276, term716276.getClass(), "type", 28);
        term716346 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term716346, term716346.getClass(), "currentTraversal", null);
        term716347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term716347, term716347.getClass(), "type", 28);
        setField(term716347, term716347.getClass(), "next", null);
        setField(term716347, term716347.getClass(), "first", null);
        setField(term716347, term716347.getClass(), "last", null);
        setField(term716347, term716347.getClass(), "propListHead", null);
        setIntField(term716347, term716347.getClass(), "sourcePosition", 0);
        setField(term716347, term716347.getClass(), "jsType", null);
        setField(term716347, term716347.getClass(), "parent", null);
        term716338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term716338, term716338.getClass(), "type", 28);
        setField(term716338, term716338.getClass(), "next", null);
        setField(term716338, term716338.getClass(), "first", null);
        setField(term716338, term716338.getClass(), "last", null);
        setField(term716338, term716338.getClass(), "propListHead", null);
        setIntField(term716338, term716338.getClass(), "sourcePosition", 0);
        setField(term716338, term716338.getClass(), "jsType", null);
        setField(term716338, term716338.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term716276;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term716206, args);
        assertTrue(recursiveEquals(term716206, term716346));
        assertTrue(recursiveEquals(term716276, term716347));
        assertTrue(recursiveEquals(retValue, term716338));
    }

};


