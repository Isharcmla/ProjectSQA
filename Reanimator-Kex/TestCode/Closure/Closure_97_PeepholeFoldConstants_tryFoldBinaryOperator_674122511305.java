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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61093;
     Object term61163;
     Object term61570;
     Object term61571;
     Object term61538;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61093 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term61163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61163, term61163.getClass(), "first", term61163);
        setField(term61163, term61163.getClass(), "next", term61163);
        setIntField(term61163, term61163.getClass(), "type", 14);
        term61570 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term61570, term61570.getClass(), "currentTraversal", null);
        term61571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61571, term61571.getClass(), "type", 14);
        setField(term61571, term61571.getClass(), "next", term61571);
        setField(term61571, term61571.getClass(), "first", term61571);
        setField(term61571, term61571.getClass(), "last", null);
        setField(term61571, term61571.getClass(), "propListHead", null);
        setIntField(term61571, term61571.getClass(), "sourcePosition", 0);
        setField(term61571, term61571.getClass(), "jsType", null);
        setField(term61571, term61571.getClass(), "parent", null);
        term61538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61538, term61538.getClass(), "type", 14);
        setField(term61538, term61538.getClass(), "next", term61538);
        setField(term61538, term61538.getClass(), "first", term61538);
        setField(term61538, term61538.getClass(), "last", null);
        setField(term61538, term61538.getClass(), "propListHead", null);
        setIntField(term61538, term61538.getClass(), "sourcePosition", 0);
        setField(term61538, term61538.getClass(), "jsType", null);
        setField(term61538, term61538.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61163;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term61093, args);
        assertTrue(recursiveEquals(term61093, term61570));
        assertTrue(recursiveEquals(term61163, term61571));
        assertTrue(recursiveEquals(retValue, term61538));
    }

};


