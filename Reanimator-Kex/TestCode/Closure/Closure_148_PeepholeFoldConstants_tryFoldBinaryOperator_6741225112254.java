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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618573;
     Object term618665;
     Object term618789;
     Object term618790;
     Object term618742;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term618573 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term618665 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term618735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term618665, term618665.getClass(), "first", term618665);
        setField(term618665, term618665.getClass(), "next", term618735);
        setIntField(term618665, term618665.getClass(), "type", 101);
        term618789 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term618789, term618789.getClass(), "currentTraversal", null);
        term618790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term618791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term618790, term618790.getClass(), "str", null);
        setIntField(term618790, term618790.getClass(), "type", 101);
        setIntField(term618791, term618791.getClass(), "type", 0);
        setField(term618791, term618791.getClass(), "next", null);
        setField(term618791, term618791.getClass(), "first", null);
        setField(term618791, term618791.getClass(), "last", null);
        setField(term618791, term618791.getClass(), "propListHead", null);
        setIntField(term618791, term618791.getClass(), "sourcePosition", 0);
        setField(term618791, term618791.getClass(), "jsType", null);
        setField(term618791, term618791.getClass(), "parent", null);
        setField(term618790, term618790.getClass(), "next", term618791);
        setField(term618790, term618790.getClass(), "first", term618790);
        setField(term618790, term618790.getClass(), "last", null);
        setField(term618790, term618790.getClass(), "propListHead", null);
        setIntField(term618790, term618790.getClass(), "sourcePosition", 0);
        setField(term618790, term618790.getClass(), "jsType", null);
        setField(term618790, term618790.getClass(), "parent", null);
        term618742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term618744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term618742, term618742.getClass(), "str", null);
        setIntField(term618742, term618742.getClass(), "type", 101);
        setIntField(term618744, term618744.getClass(), "type", 0);
        setField(term618744, term618744.getClass(), "next", null);
        setField(term618744, term618744.getClass(), "first", null);
        setField(term618744, term618744.getClass(), "last", null);
        setField(term618744, term618744.getClass(), "propListHead", null);
        setIntField(term618744, term618744.getClass(), "sourcePosition", 0);
        setField(term618744, term618744.getClass(), "jsType", null);
        setField(term618744, term618744.getClass(), "parent", null);
        setField(term618742, term618742.getClass(), "next", term618744);
        setField(term618742, term618742.getClass(), "first", term618742);
        setField(term618742, term618742.getClass(), "last", null);
        setField(term618742, term618742.getClass(), "propListHead", null);
        setIntField(term618742, term618742.getClass(), "sourcePosition", 0);
        setField(term618742, term618742.getClass(), "jsType", null);
        setField(term618742, term618742.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term618665;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term618573, args);
        assertTrue(recursiveEquals(term618573, term618789));
        assertTrue(recursiveEquals(term618665, term618790));
        assertTrue(recursiveEquals(retValue, term618742));
    }

};


