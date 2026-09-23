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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97848;
     Object term97940;
     Object term98481;
     Object term98482;
     Object term98443;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97848 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term97940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term97940, term97940.getClass(), "first", term97940);
        setField(term97940, term97940.getClass(), "next", term98032);
        setIntField(term97940, term97940.getClass(), "type", 14);
        term98481 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term98481, term98481.getClass(), "currentTraversal", null);
        term98482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term98482, term98482.getClass(), "str", null);
        setIntField(term98482, term98482.getClass(), "type", 14);
        setField(term98483, term98483.getClass(), "str", null);
        setIntField(term98483, term98483.getClass(), "type", 0);
        setField(term98483, term98483.getClass(), "next", null);
        setField(term98483, term98483.getClass(), "first", null);
        setField(term98483, term98483.getClass(), "last", null);
        setField(term98483, term98483.getClass(), "propListHead", null);
        setIntField(term98483, term98483.getClass(), "sourcePosition", 0);
        setField(term98483, term98483.getClass(), "jsType", null);
        setField(term98483, term98483.getClass(), "parent", null);
        setField(term98482, term98482.getClass(), "next", term98483);
        setField(term98482, term98482.getClass(), "first", term98482);
        setField(term98482, term98482.getClass(), "last", null);
        setField(term98482, term98482.getClass(), "propListHead", null);
        setIntField(term98482, term98482.getClass(), "sourcePosition", 0);
        setField(term98482, term98482.getClass(), "jsType", null);
        setField(term98482, term98482.getClass(), "parent", null);
        term98443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98445 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term98443, term98443.getClass(), "str", null);
        setIntField(term98443, term98443.getClass(), "type", 14);
        setField(term98445, term98445.getClass(), "str", null);
        setIntField(term98445, term98445.getClass(), "type", 0);
        setField(term98445, term98445.getClass(), "next", null);
        setField(term98445, term98445.getClass(), "first", null);
        setField(term98445, term98445.getClass(), "last", null);
        setField(term98445, term98445.getClass(), "propListHead", null);
        setIntField(term98445, term98445.getClass(), "sourcePosition", 0);
        setField(term98445, term98445.getClass(), "jsType", null);
        setField(term98445, term98445.getClass(), "parent", null);
        setField(term98443, term98443.getClass(), "next", term98445);
        setField(term98443, term98443.getClass(), "first", term98443);
        setField(term98443, term98443.getClass(), "last", null);
        setField(term98443, term98443.getClass(), "propListHead", null);
        setIntField(term98443, term98443.getClass(), "sourcePosition", 0);
        setField(term98443, term98443.getClass(), "jsType", null);
        setField(term98443, term98443.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term97940;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term97848, args);
        assertTrue(recursiveEquals(term97848, term98481));
        assertTrue(recursiveEquals(term97940, term98482));
        assertTrue(recursiveEquals(retValue, term98443));
    }

};


