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

public class PeepholeFoldConstants_optimizeSubtree_160650699395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14578;
     Object term14648;
     Object term14912;
     Object term14913;
     Object term14903;

    public PeepholeFoldConstants_optimizeSubtree_160650699395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14578 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term14648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14648, term14648.getClass(), "type", 54);
        term14912 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term14912, term14912.getClass(), "currentTraversal", null);
        term14913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14913, term14913.getClass(), "type", 54);
        setField(term14913, term14913.getClass(), "next", null);
        setField(term14913, term14913.getClass(), "first", null);
        setField(term14913, term14913.getClass(), "last", null);
        setField(term14913, term14913.getClass(), "propListHead", null);
        setIntField(term14913, term14913.getClass(), "sourcePosition", 0);
        setField(term14913, term14913.getClass(), "jsType", null);
        setField(term14913, term14913.getClass(), "parent", null);
        term14903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14903, term14903.getClass(), "type", 54);
        setField(term14903, term14903.getClass(), "next", null);
        setField(term14903, term14903.getClass(), "first", null);
        setField(term14903, term14903.getClass(), "last", null);
        setField(term14903, term14903.getClass(), "propListHead", null);
        setIntField(term14903, term14903.getClass(), "sourcePosition", 0);
        setField(term14903, term14903.getClass(), "jsType", null);
        setField(term14903, term14903.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14648;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term14578, args);
        assertTrue(recursiveEquals(term14578, term14912));
        assertTrue(recursiveEquals(term14648, term14913));
        assertTrue(recursiveEquals(retValue, term14903));
    }

};


