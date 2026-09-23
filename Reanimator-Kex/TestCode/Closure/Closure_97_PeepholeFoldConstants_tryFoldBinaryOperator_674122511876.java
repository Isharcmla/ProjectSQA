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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248538;
     Object term248608;
     Object term248834;
     Object term248835;
     Object term248805;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248538 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term248608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term248678, term248678.getClass(), "next", term248748);
        setIntField(term248678, term248678.getClass(), "type", 39);
        setField(term248608, term248608.getClass(), "first", term248678);
        setIntField(term248608, term248608.getClass(), "type", 20);
        term248834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term248834, term248834.getClass(), "currentTraversal", null);
        term248835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term248835, term248835.getClass(), "type", 20);
        setField(term248835, term248835.getClass(), "next", null);
        setIntField(term248836, term248836.getClass(), "type", 39);
        setIntField(term248837, term248837.getClass(), "type", 0);
        setField(term248837, term248837.getClass(), "next", null);
        setField(term248837, term248837.getClass(), "first", null);
        setField(term248837, term248837.getClass(), "last", null);
        setField(term248837, term248837.getClass(), "propListHead", null);
        setIntField(term248837, term248837.getClass(), "sourcePosition", 0);
        setField(term248837, term248837.getClass(), "jsType", null);
        setField(term248837, term248837.getClass(), "parent", null);
        setField(term248836, term248836.getClass(), "next", term248837);
        setField(term248836, term248836.getClass(), "first", null);
        setField(term248836, term248836.getClass(), "last", null);
        setField(term248836, term248836.getClass(), "propListHead", null);
        setIntField(term248836, term248836.getClass(), "sourcePosition", 0);
        setField(term248836, term248836.getClass(), "jsType", null);
        setField(term248836, term248836.getClass(), "parent", null);
        setField(term248835, term248835.getClass(), "first", term248836);
        setField(term248835, term248835.getClass(), "last", null);
        setField(term248835, term248835.getClass(), "propListHead", null);
        setIntField(term248835, term248835.getClass(), "sourcePosition", 0);
        setField(term248835, term248835.getClass(), "jsType", null);
        setField(term248835, term248835.getClass(), "parent", null);
        term248805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term248805, term248805.getClass(), "type", 20);
        setField(term248805, term248805.getClass(), "next", null);
        setIntField(term248807, term248807.getClass(), "type", 39);
        setIntField(term248809, term248809.getClass(), "type", 0);
        setField(term248809, term248809.getClass(), "next", null);
        setField(term248809, term248809.getClass(), "first", null);
        setField(term248809, term248809.getClass(), "last", null);
        setField(term248809, term248809.getClass(), "propListHead", null);
        setIntField(term248809, term248809.getClass(), "sourcePosition", 0);
        setField(term248809, term248809.getClass(), "jsType", null);
        setField(term248809, term248809.getClass(), "parent", null);
        setField(term248807, term248807.getClass(), "next", term248809);
        setField(term248807, term248807.getClass(), "first", null);
        setField(term248807, term248807.getClass(), "last", null);
        setField(term248807, term248807.getClass(), "propListHead", null);
        setIntField(term248807, term248807.getClass(), "sourcePosition", 0);
        setField(term248807, term248807.getClass(), "jsType", null);
        setField(term248807, term248807.getClass(), "parent", null);
        setField(term248805, term248805.getClass(), "first", term248807);
        setField(term248805, term248805.getClass(), "last", null);
        setField(term248805, term248805.getClass(), "propListHead", null);
        setIntField(term248805, term248805.getClass(), "sourcePosition", 0);
        setField(term248805, term248805.getClass(), "jsType", null);
        setField(term248805, term248805.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term248608;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term248538, args);
        assertTrue(recursiveEquals(term248538, term248834));
        assertTrue(recursiveEquals(term248608, term248835));
        assertTrue(recursiveEquals(retValue, term248805));
    }

};


