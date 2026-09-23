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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315109;
     Object term315201;
     Object term315660;
     Object term315661;
     Object term315641;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315109 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term315201 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term315201, term315201.getClass(), "first", term315201);
        setField(term315201, term315201.getClass(), "next", term315201);
        setIntField(term315201, term315201.getClass(), "type", 33);
        term315660 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term315660, term315660.getClass(), "currentTraversal", null);
        term315661 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term315661, term315661.getClass(), "str", null);
        setIntField(term315661, term315661.getClass(), "type", 33);
        setField(term315661, term315661.getClass(), "next", term315661);
        setField(term315661, term315661.getClass(), "first", term315661);
        setField(term315661, term315661.getClass(), "last", null);
        setField(term315661, term315661.getClass(), "propListHead", null);
        setIntField(term315661, term315661.getClass(), "sourcePosition", 0);
        setField(term315661, term315661.getClass(), "jsType", null);
        setField(term315661, term315661.getClass(), "parent", null);
        term315641 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term315641, term315641.getClass(), "str", null);
        setIntField(term315641, term315641.getClass(), "type", 33);
        setField(term315641, term315641.getClass(), "next", term315641);
        setField(term315641, term315641.getClass(), "first", term315641);
        setField(term315641, term315641.getClass(), "last", null);
        setField(term315641, term315641.getClass(), "propListHead", null);
        setIntField(term315641, term315641.getClass(), "sourcePosition", 0);
        setField(term315641, term315641.getClass(), "jsType", null);
        setField(term315641, term315641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term315201;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term315109, args);
        assertTrue(recursiveEquals(term315109, term315660));
        assertTrue(recursiveEquals(term315201, term315661));
        assertTrue(recursiveEquals(retValue, term315641));
    }

};


