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

public class PeepholeFoldConstants_optimizeSubtree_160650699389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13969;
     Object term14039;
     Object term14050;
     Object term14051;
     Object term14041;

    public PeepholeFoldConstants_optimizeSubtree_160650699389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13969 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term14039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14039, term14039.getClass(), "type", 33);
        term14050 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term14050, term14050.getClass(), "currentTraversal", null);
        term14051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14051, term14051.getClass(), "type", 33);
        setField(term14051, term14051.getClass(), "next", null);
        setField(term14051, term14051.getClass(), "first", null);
        setField(term14051, term14051.getClass(), "last", null);
        setField(term14051, term14051.getClass(), "propListHead", null);
        setIntField(term14051, term14051.getClass(), "sourcePosition", 0);
        setField(term14051, term14051.getClass(), "jsType", null);
        setField(term14051, term14051.getClass(), "parent", null);
        term14041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14041, term14041.getClass(), "type", 33);
        setField(term14041, term14041.getClass(), "next", null);
        setField(term14041, term14041.getClass(), "first", null);
        setField(term14041, term14041.getClass(), "last", null);
        setField(term14041, term14041.getClass(), "propListHead", null);
        setIntField(term14041, term14041.getClass(), "sourcePosition", 0);
        setField(term14041, term14041.getClass(), "jsType", null);
        setField(term14041, term14041.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14039;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term13969, args);
        assertTrue(recursiveEquals(term13969, term14050));
        assertTrue(recursiveEquals(term14039, term14051));
        assertTrue(recursiveEquals(retValue, term14041));
    }

};


