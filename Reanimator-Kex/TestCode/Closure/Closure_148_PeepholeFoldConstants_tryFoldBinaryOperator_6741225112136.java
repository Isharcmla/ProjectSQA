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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581418;
     Object term581510;
     Object term581743;
     Object term581744;
     Object term581703;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581418 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term581510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term581602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term581694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term581602, term581602.getClass(), "next", term581694);
        setIntField(term581602, term581602.getClass(), "type", 39);
        setField(term581510, term581510.getClass(), "first", term581602);
        setIntField(term581510, term581510.getClass(), "type", 11);
        term581743 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term581743, term581743.getClass(), "currentTraversal", null);
        term581744 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term581745 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term581746 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term581744, term581744.getClass(), "number", 0.0);
        setIntField(term581744, term581744.getClass(), "type", 11);
        setField(term581744, term581744.getClass(), "next", null);
        setDoubleField(term581745, term581745.getClass(), "number", 0.0);
        setIntField(term581745, term581745.getClass(), "type", 39);
        setDoubleField(term581746, term581746.getClass(), "number", 0.0);
        setIntField(term581746, term581746.getClass(), "type", 0);
        setField(term581746, term581746.getClass(), "next", null);
        setField(term581746, term581746.getClass(), "first", null);
        setField(term581746, term581746.getClass(), "last", null);
        setField(term581746, term581746.getClass(), "propListHead", null);
        setIntField(term581746, term581746.getClass(), "sourcePosition", 0);
        setField(term581746, term581746.getClass(), "jsType", null);
        setField(term581746, term581746.getClass(), "parent", null);
        setField(term581745, term581745.getClass(), "next", term581746);
        setField(term581745, term581745.getClass(), "first", null);
        setField(term581745, term581745.getClass(), "last", null);
        setField(term581745, term581745.getClass(), "propListHead", null);
        setIntField(term581745, term581745.getClass(), "sourcePosition", 0);
        setField(term581745, term581745.getClass(), "jsType", null);
        setField(term581745, term581745.getClass(), "parent", null);
        setField(term581744, term581744.getClass(), "first", term581745);
        setField(term581744, term581744.getClass(), "last", null);
        setField(term581744, term581744.getClass(), "propListHead", null);
        setIntField(term581744, term581744.getClass(), "sourcePosition", 0);
        setField(term581744, term581744.getClass(), "jsType", null);
        setField(term581744, term581744.getClass(), "parent", null);
        term581703 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term581706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term581709 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term581703, term581703.getClass(), "number", 0.0);
        setIntField(term581703, term581703.getClass(), "type", 11);
        setField(term581703, term581703.getClass(), "next", null);
        setDoubleField(term581706, term581706.getClass(), "number", 0.0);
        setIntField(term581706, term581706.getClass(), "type", 39);
        setDoubleField(term581709, term581709.getClass(), "number", 0.0);
        setIntField(term581709, term581709.getClass(), "type", 0);
        setField(term581709, term581709.getClass(), "next", null);
        setField(term581709, term581709.getClass(), "first", null);
        setField(term581709, term581709.getClass(), "last", null);
        setField(term581709, term581709.getClass(), "propListHead", null);
        setIntField(term581709, term581709.getClass(), "sourcePosition", 0);
        setField(term581709, term581709.getClass(), "jsType", null);
        setField(term581709, term581709.getClass(), "parent", null);
        setField(term581706, term581706.getClass(), "next", term581709);
        setField(term581706, term581706.getClass(), "first", null);
        setField(term581706, term581706.getClass(), "last", null);
        setField(term581706, term581706.getClass(), "propListHead", null);
        setIntField(term581706, term581706.getClass(), "sourcePosition", 0);
        setField(term581706, term581706.getClass(), "jsType", null);
        setField(term581706, term581706.getClass(), "parent", null);
        setField(term581703, term581703.getClass(), "first", term581706);
        setField(term581703, term581703.getClass(), "last", null);
        setField(term581703, term581703.getClass(), "propListHead", null);
        setIntField(term581703, term581703.getClass(), "sourcePosition", 0);
        setField(term581703, term581703.getClass(), "jsType", null);
        setField(term581703, term581703.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term581510;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term581418, args);
        assertTrue(recursiveEquals(term581418, term581743));
        assertTrue(recursiveEquals(term581510, term581744));
        assertTrue(recursiveEquals(retValue, term581703));
    }

};


