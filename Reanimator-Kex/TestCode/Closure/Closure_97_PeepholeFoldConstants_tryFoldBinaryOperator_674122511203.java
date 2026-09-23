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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39341;
     Object term39411;
     Object term39621;
     Object term39622;
     Object term39606;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term39411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39411, term39411.getClass(), "first", term39411);
        setField(term39411, term39411.getClass(), "next", term39411);
        setIntField(term39411, term39411.getClass(), "type", 22);
        term39621 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term39621, term39621.getClass(), "currentTraversal", null);
        term39622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39622, term39622.getClass(), "type", 22);
        setField(term39622, term39622.getClass(), "next", term39622);
        setField(term39622, term39622.getClass(), "first", term39622);
        setField(term39622, term39622.getClass(), "last", null);
        setField(term39622, term39622.getClass(), "propListHead", null);
        setIntField(term39622, term39622.getClass(), "sourcePosition", 0);
        setField(term39622, term39622.getClass(), "jsType", null);
        setField(term39622, term39622.getClass(), "parent", null);
        term39606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39606, term39606.getClass(), "type", 22);
        setField(term39606, term39606.getClass(), "next", term39606);
        setField(term39606, term39606.getClass(), "first", term39606);
        setField(term39606, term39606.getClass(), "last", null);
        setField(term39606, term39606.getClass(), "propListHead", null);
        setIntField(term39606, term39606.getClass(), "sourcePosition", 0);
        setField(term39606, term39606.getClass(), "jsType", null);
        setField(term39606, term39606.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39411;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term39341, args);
        assertTrue(recursiveEquals(term39341, term39621));
        assertTrue(recursiveEquals(term39411, term39622));
        assertTrue(recursiveEquals(retValue, term39606));
    }

};


