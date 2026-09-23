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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20663;
     Object term20733;
     Object term21190;
     Object term21191;
     Object term21171;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20663 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20733, term20733.getClass(), "first", term20733);
        setField(term20733, term20733.getClass(), "next", term20733);
        setIntField(term20733, term20733.getClass(), "type", 11);
        term21190 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term21190, term21190.getClass(), "currentTraversal", null);
        term21191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21191, term21191.getClass(), "type", 11);
        setField(term21191, term21191.getClass(), "next", term21191);
        setField(term21191, term21191.getClass(), "first", term21191);
        setField(term21191, term21191.getClass(), "last", null);
        setField(term21191, term21191.getClass(), "propListHead", null);
        setIntField(term21191, term21191.getClass(), "sourcePosition", 0);
        setField(term21191, term21191.getClass(), "jsType", null);
        setField(term21191, term21191.getClass(), "parent", null);
        term21171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21171, term21171.getClass(), "type", 11);
        setField(term21171, term21171.getClass(), "next", term21171);
        setField(term21171, term21171.getClass(), "first", term21171);
        setField(term21171, term21171.getClass(), "last", null);
        setField(term21171, term21171.getClass(), "propListHead", null);
        setIntField(term21171, term21171.getClass(), "sourcePosition", 0);
        setField(term21171, term21171.getClass(), "jsType", null);
        setField(term21171, term21171.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20733;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term20663, args);
        assertTrue(recursiveEquals(term20663, term21190));
        assertTrue(recursiveEquals(term20733, term21191));
        assertTrue(recursiveEquals(retValue, term21171));
    }

};


