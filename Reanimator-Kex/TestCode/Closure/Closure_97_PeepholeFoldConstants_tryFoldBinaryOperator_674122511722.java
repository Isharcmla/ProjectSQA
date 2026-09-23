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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185002;
     Object term185094;
     Object term185196;
     Object term185197;
     Object term185171;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185002 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term185094 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term185094, term185094.getClass(), "first", term185094);
        setField(term185094, term185094.getClass(), "next", term185164);
        setIntField(term185094, term185094.getClass(), "type", 33);
        term185196 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term185196, term185196.getClass(), "currentTraversal", null);
        term185197 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term185197, term185197.getClass(), "str", null);
        setIntField(term185197, term185197.getClass(), "type", 33);
        setIntField(term185198, term185198.getClass(), "type", 0);
        setField(term185198, term185198.getClass(), "next", null);
        setField(term185198, term185198.getClass(), "first", null);
        setField(term185198, term185198.getClass(), "last", null);
        setField(term185198, term185198.getClass(), "propListHead", null);
        setIntField(term185198, term185198.getClass(), "sourcePosition", 0);
        setField(term185198, term185198.getClass(), "jsType", null);
        setField(term185198, term185198.getClass(), "parent", null);
        setField(term185197, term185197.getClass(), "next", term185198);
        setField(term185197, term185197.getClass(), "first", term185197);
        setField(term185197, term185197.getClass(), "last", null);
        setField(term185197, term185197.getClass(), "propListHead", null);
        setIntField(term185197, term185197.getClass(), "sourcePosition", 0);
        setField(term185197, term185197.getClass(), "jsType", null);
        setField(term185197, term185197.getClass(), "parent", null);
        term185171 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term185171, term185171.getClass(), "str", null);
        setIntField(term185171, term185171.getClass(), "type", 33);
        setIntField(term185173, term185173.getClass(), "type", 0);
        setField(term185173, term185173.getClass(), "next", null);
        setField(term185173, term185173.getClass(), "first", null);
        setField(term185173, term185173.getClass(), "last", null);
        setField(term185173, term185173.getClass(), "propListHead", null);
        setIntField(term185173, term185173.getClass(), "sourcePosition", 0);
        setField(term185173, term185173.getClass(), "jsType", null);
        setField(term185173, term185173.getClass(), "parent", null);
        setField(term185171, term185171.getClass(), "next", term185173);
        setField(term185171, term185171.getClass(), "first", term185171);
        setField(term185171, term185171.getClass(), "last", null);
        setField(term185171, term185171.getClass(), "propListHead", null);
        setIntField(term185171, term185171.getClass(), "sourcePosition", 0);
        setField(term185171, term185171.getClass(), "jsType", null);
        setField(term185171, term185171.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term185094;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term185002, args);
        assertTrue(recursiveEquals(term185002, term185196));
        assertTrue(recursiveEquals(term185094, term185197));
        assertTrue(recursiveEquals(retValue, term185171));
    }

};


