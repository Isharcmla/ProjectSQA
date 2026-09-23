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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155560;
     Object term155630;
     Object term155869;
     Object term155870;
     Object term155840;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155560 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term155630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term155700, term155700.getClass(), "next", term155770);
        setIntField(term155700, term155700.getClass(), "type", 39);
        setField(term155630, term155630.getClass(), "first", term155700);
        setIntField(term155630, term155630.getClass(), "type", 23);
        term155869 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term155869, term155869.getClass(), "currentTraversal", null);
        term155870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term155870, term155870.getClass(), "type", 23);
        setField(term155870, term155870.getClass(), "next", null);
        setIntField(term155871, term155871.getClass(), "type", 39);
        setIntField(term155872, term155872.getClass(), "type", 0);
        setField(term155872, term155872.getClass(), "next", null);
        setField(term155872, term155872.getClass(), "first", null);
        setField(term155872, term155872.getClass(), "last", null);
        setField(term155872, term155872.getClass(), "propListHead", null);
        setIntField(term155872, term155872.getClass(), "sourcePosition", 0);
        setField(term155872, term155872.getClass(), "jsType", null);
        setField(term155872, term155872.getClass(), "parent", null);
        setField(term155871, term155871.getClass(), "next", term155872);
        setField(term155871, term155871.getClass(), "first", null);
        setField(term155871, term155871.getClass(), "last", null);
        setField(term155871, term155871.getClass(), "propListHead", null);
        setIntField(term155871, term155871.getClass(), "sourcePosition", 0);
        setField(term155871, term155871.getClass(), "jsType", null);
        setField(term155871, term155871.getClass(), "parent", null);
        setField(term155870, term155870.getClass(), "first", term155871);
        setField(term155870, term155870.getClass(), "last", null);
        setField(term155870, term155870.getClass(), "propListHead", null);
        setIntField(term155870, term155870.getClass(), "sourcePosition", 0);
        setField(term155870, term155870.getClass(), "jsType", null);
        setField(term155870, term155870.getClass(), "parent", null);
        term155840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term155840, term155840.getClass(), "type", 23);
        setField(term155840, term155840.getClass(), "next", null);
        setIntField(term155842, term155842.getClass(), "type", 39);
        setIntField(term155844, term155844.getClass(), "type", 0);
        setField(term155844, term155844.getClass(), "next", null);
        setField(term155844, term155844.getClass(), "first", null);
        setField(term155844, term155844.getClass(), "last", null);
        setField(term155844, term155844.getClass(), "propListHead", null);
        setIntField(term155844, term155844.getClass(), "sourcePosition", 0);
        setField(term155844, term155844.getClass(), "jsType", null);
        setField(term155844, term155844.getClass(), "parent", null);
        setField(term155842, term155842.getClass(), "next", term155844);
        setField(term155842, term155842.getClass(), "first", null);
        setField(term155842, term155842.getClass(), "last", null);
        setField(term155842, term155842.getClass(), "propListHead", null);
        setIntField(term155842, term155842.getClass(), "sourcePosition", 0);
        setField(term155842, term155842.getClass(), "jsType", null);
        setField(term155842, term155842.getClass(), "parent", null);
        setField(term155840, term155840.getClass(), "first", term155842);
        setField(term155840, term155840.getClass(), "last", null);
        setField(term155840, term155840.getClass(), "propListHead", null);
        setIntField(term155840, term155840.getClass(), "sourcePosition", 0);
        setField(term155840, term155840.getClass(), "jsType", null);
        setField(term155840, term155840.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term155630;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term155560, args);
        assertTrue(recursiveEquals(term155560, term155869));
        assertTrue(recursiveEquals(term155630, term155870));
        assertTrue(recursiveEquals(retValue, term155840));
    }

};


