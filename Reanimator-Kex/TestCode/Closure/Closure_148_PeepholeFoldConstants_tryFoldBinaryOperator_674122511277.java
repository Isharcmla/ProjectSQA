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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53197;
     Object term53267;
     Object term53768;
     Object term53769;
     Object term53724;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53197 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term53267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53407, term53407.getClass(), "type", 42);
        setField(term53337, term53337.getClass(), "next", term53407);
        setIntField(term53337, term53337.getClass(), "type", 42);
        setField(term53267, term53267.getClass(), "first", term53337);
        setIntField(term53267, term53267.getClass(), "type", 16);
        term53768 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term53768, term53768.getClass(), "currentTraversal", null);
        term53769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53769, term53769.getClass(), "type", 16);
        setField(term53769, term53769.getClass(), "next", null);
        setIntField(term53770, term53770.getClass(), "type", 42);
        setIntField(term53771, term53771.getClass(), "type", 42);
        setField(term53771, term53771.getClass(), "next", null);
        setField(term53771, term53771.getClass(), "first", null);
        setField(term53771, term53771.getClass(), "last", null);
        setField(term53771, term53771.getClass(), "propListHead", null);
        setIntField(term53771, term53771.getClass(), "sourcePosition", 0);
        setField(term53771, term53771.getClass(), "jsType", null);
        setField(term53771, term53771.getClass(), "parent", null);
        setField(term53770, term53770.getClass(), "next", term53771);
        setField(term53770, term53770.getClass(), "first", null);
        setField(term53770, term53770.getClass(), "last", null);
        setField(term53770, term53770.getClass(), "propListHead", null);
        setIntField(term53770, term53770.getClass(), "sourcePosition", 0);
        setField(term53770, term53770.getClass(), "jsType", null);
        setField(term53770, term53770.getClass(), "parent", null);
        setField(term53769, term53769.getClass(), "first", term53770);
        setField(term53769, term53769.getClass(), "last", null);
        setField(term53769, term53769.getClass(), "propListHead", null);
        setIntField(term53769, term53769.getClass(), "sourcePosition", 0);
        setField(term53769, term53769.getClass(), "jsType", null);
        setField(term53769, term53769.getClass(), "parent", null);
        term53724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53724, term53724.getClass(), "type", 16);
        setField(term53724, term53724.getClass(), "next", null);
        setIntField(term53726, term53726.getClass(), "type", 42);
        setIntField(term53728, term53728.getClass(), "type", 42);
        setField(term53728, term53728.getClass(), "next", null);
        setField(term53728, term53728.getClass(), "first", null);
        setField(term53728, term53728.getClass(), "last", null);
        setField(term53728, term53728.getClass(), "propListHead", null);
        setIntField(term53728, term53728.getClass(), "sourcePosition", 0);
        setField(term53728, term53728.getClass(), "jsType", null);
        setField(term53728, term53728.getClass(), "parent", null);
        setField(term53726, term53726.getClass(), "next", term53728);
        setField(term53726, term53726.getClass(), "first", null);
        setField(term53726, term53726.getClass(), "last", null);
        setField(term53726, term53726.getClass(), "propListHead", null);
        setIntField(term53726, term53726.getClass(), "sourcePosition", 0);
        setField(term53726, term53726.getClass(), "jsType", null);
        setField(term53726, term53726.getClass(), "parent", null);
        setField(term53724, term53724.getClass(), "first", term53726);
        setField(term53724, term53724.getClass(), "last", null);
        setField(term53724, term53724.getClass(), "propListHead", null);
        setIntField(term53724, term53724.getClass(), "sourcePosition", 0);
        setField(term53724, term53724.getClass(), "jsType", null);
        setField(term53724, term53724.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53267;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term53197, args);
        assertTrue(recursiveEquals(term53197, term53768));
        assertTrue(recursiveEquals(term53267, term53769));
        assertTrue(recursiveEquals(retValue, term53724));
    }

};


