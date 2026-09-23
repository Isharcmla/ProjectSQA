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

public class PeepholeFoldConstants_tryFoldTypeof_10367868771608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622978;
     Object term623070;
     Object term650925;
     Object term650926;
     Object term650903;

    public PeepholeFoldConstants_tryFoldTypeof_10367868771608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622978 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term623070 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term623162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term623070, term623070.getClass(), "type", 32);
        setField(term623070, term623070.getClass(), "first", term623162);
        term650925 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term650925, term650925.getClass(), "currentTraversal", null);
        term650926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term650927 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term650926, term650926.getClass(), "str", null);
        setIntField(term650926, term650926.getClass(), "type", 32);
        setField(term650926, term650926.getClass(), "next", null);
        setField(term650927, term650927.getClass(), "str", null);
        setIntField(term650927, term650927.getClass(), "type", 0);
        setField(term650927, term650927.getClass(), "next", null);
        setField(term650927, term650927.getClass(), "first", null);
        setField(term650927, term650927.getClass(), "last", null);
        setField(term650927, term650927.getClass(), "propListHead", null);
        setIntField(term650927, term650927.getClass(), "sourcePosition", 0);
        setField(term650927, term650927.getClass(), "jsType", null);
        setField(term650927, term650927.getClass(), "parent", null);
        setField(term650926, term650926.getClass(), "first", term650927);
        setField(term650926, term650926.getClass(), "last", null);
        setField(term650926, term650926.getClass(), "propListHead", null);
        setIntField(term650926, term650926.getClass(), "sourcePosition", 0);
        setField(term650926, term650926.getClass(), "jsType", null);
        setField(term650926, term650926.getClass(), "parent", null);
        term650903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term650905 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term650903, term650903.getClass(), "str", null);
        setIntField(term650903, term650903.getClass(), "type", 32);
        setField(term650903, term650903.getClass(), "next", null);
        setField(term650905, term650905.getClass(), "str", null);
        setIntField(term650905, term650905.getClass(), "type", 0);
        setField(term650905, term650905.getClass(), "next", null);
        setField(term650905, term650905.getClass(), "first", null);
        setField(term650905, term650905.getClass(), "last", null);
        setField(term650905, term650905.getClass(), "propListHead", null);
        setIntField(term650905, term650905.getClass(), "sourcePosition", 0);
        setField(term650905, term650905.getClass(), "jsType", null);
        setField(term650905, term650905.getClass(), "parent", null);
        setField(term650903, term650903.getClass(), "first", term650905);
        setField(term650903, term650903.getClass(), "last", null);
        setField(term650903, term650903.getClass(), "propListHead", null);
        setIntField(term650903, term650903.getClass(), "sourcePosition", 0);
        setField(term650903, term650903.getClass(), "jsType", null);
        setField(term650903, term650903.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term623070;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term622978, args);
        assertTrue(recursiveEquals(term622978, term650925));
        assertTrue(recursiveEquals(term623070, term650926));
        assertTrue(recursiveEquals(retValue, term650903));
    }

};


