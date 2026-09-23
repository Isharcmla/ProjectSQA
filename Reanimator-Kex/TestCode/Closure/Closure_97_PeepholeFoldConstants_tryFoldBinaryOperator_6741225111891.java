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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723507;
     Object term723577;
     Object term724181;
     Object term724182;
     Object term724132;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term723507 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term723577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term723717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term723717, term723717.getClass(), "type", 14);
        setField(term723647, term723647.getClass(), "next", term723717);
        setIntField(term723647, term723647.getClass(), "type", 42);
        setField(term723577, term723577.getClass(), "first", term723647);
        setIntField(term723577, term723577.getClass(), "type", 14);
        term724181 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term724181, term724181.getClass(), "currentTraversal", null);
        term724182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term724182, term724182.getClass(), "type", 14);
        setField(term724182, term724182.getClass(), "next", null);
        setIntField(term724183, term724183.getClass(), "type", 42);
        setIntField(term724184, term724184.getClass(), "type", 14);
        setField(term724184, term724184.getClass(), "next", null);
        setField(term724184, term724184.getClass(), "first", null);
        setField(term724184, term724184.getClass(), "last", null);
        setField(term724184, term724184.getClass(), "propListHead", null);
        setIntField(term724184, term724184.getClass(), "sourcePosition", 0);
        setField(term724184, term724184.getClass(), "jsType", null);
        setField(term724184, term724184.getClass(), "parent", null);
        setField(term724183, term724183.getClass(), "next", term724184);
        setField(term724183, term724183.getClass(), "first", null);
        setField(term724183, term724183.getClass(), "last", null);
        setField(term724183, term724183.getClass(), "propListHead", null);
        setIntField(term724183, term724183.getClass(), "sourcePosition", 0);
        setField(term724183, term724183.getClass(), "jsType", null);
        setField(term724183, term724183.getClass(), "parent", null);
        setField(term724182, term724182.getClass(), "first", term724183);
        setField(term724182, term724182.getClass(), "last", null);
        setField(term724182, term724182.getClass(), "propListHead", null);
        setIntField(term724182, term724182.getClass(), "sourcePosition", 0);
        setField(term724182, term724182.getClass(), "jsType", null);
        setField(term724182, term724182.getClass(), "parent", null);
        term724132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term724132, term724132.getClass(), "type", 14);
        setField(term724132, term724132.getClass(), "next", null);
        setIntField(term724134, term724134.getClass(), "type", 42);
        setIntField(term724136, term724136.getClass(), "type", 14);
        setField(term724136, term724136.getClass(), "next", null);
        setField(term724136, term724136.getClass(), "first", null);
        setField(term724136, term724136.getClass(), "last", null);
        setField(term724136, term724136.getClass(), "propListHead", null);
        setIntField(term724136, term724136.getClass(), "sourcePosition", 0);
        setField(term724136, term724136.getClass(), "jsType", null);
        setField(term724136, term724136.getClass(), "parent", null);
        setField(term724134, term724134.getClass(), "next", term724136);
        setField(term724134, term724134.getClass(), "first", null);
        setField(term724134, term724134.getClass(), "last", null);
        setField(term724134, term724134.getClass(), "propListHead", null);
        setIntField(term724134, term724134.getClass(), "sourcePosition", 0);
        setField(term724134, term724134.getClass(), "jsType", null);
        setField(term724134, term724134.getClass(), "parent", null);
        setField(term724132, term724132.getClass(), "first", term724134);
        setField(term724132, term724132.getClass(), "last", null);
        setField(term724132, term724132.getClass(), "propListHead", null);
        setIntField(term724132, term724132.getClass(), "sourcePosition", 0);
        setField(term724132, term724132.getClass(), "jsType", null);
        setField(term724132, term724132.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term723577;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term723507, args);
        assertTrue(recursiveEquals(term723507, term724181));
        assertTrue(recursiveEquals(term723577, term724182));
        assertTrue(recursiveEquals(retValue, term724132));
    }

};


