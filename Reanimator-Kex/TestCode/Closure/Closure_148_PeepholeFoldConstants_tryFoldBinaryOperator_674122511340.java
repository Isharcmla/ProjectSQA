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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67429;
     Object term67521;
     Object term68045;
     Object term68046;
     Object term68020;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67429 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term67521 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term67591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67521, term67521.getClass(), "first", term67521);
        setField(term67521, term67521.getClass(), "next", term67591);
        setIntField(term67521, term67521.getClass(), "type", 33);
        term68045 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term68045, term68045.getClass(), "currentTraversal", null);
        term68046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term68047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68046, term68046.getClass(), "str", null);
        setIntField(term68046, term68046.getClass(), "type", 33);
        setIntField(term68047, term68047.getClass(), "type", 0);
        setField(term68047, term68047.getClass(), "next", null);
        setField(term68047, term68047.getClass(), "first", null);
        setField(term68047, term68047.getClass(), "last", null);
        setField(term68047, term68047.getClass(), "propListHead", null);
        setIntField(term68047, term68047.getClass(), "sourcePosition", 0);
        setField(term68047, term68047.getClass(), "jsType", null);
        setField(term68047, term68047.getClass(), "parent", null);
        setField(term68046, term68046.getClass(), "next", term68047);
        setField(term68046, term68046.getClass(), "first", term68046);
        setField(term68046, term68046.getClass(), "last", null);
        setField(term68046, term68046.getClass(), "propListHead", null);
        setIntField(term68046, term68046.getClass(), "sourcePosition", 0);
        setField(term68046, term68046.getClass(), "jsType", null);
        setField(term68046, term68046.getClass(), "parent", null);
        term68020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term68022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68020, term68020.getClass(), "str", null);
        setIntField(term68020, term68020.getClass(), "type", 33);
        setIntField(term68022, term68022.getClass(), "type", 0);
        setField(term68022, term68022.getClass(), "next", null);
        setField(term68022, term68022.getClass(), "first", null);
        setField(term68022, term68022.getClass(), "last", null);
        setField(term68022, term68022.getClass(), "propListHead", null);
        setIntField(term68022, term68022.getClass(), "sourcePosition", 0);
        setField(term68022, term68022.getClass(), "jsType", null);
        setField(term68022, term68022.getClass(), "parent", null);
        setField(term68020, term68020.getClass(), "next", term68022);
        setField(term68020, term68020.getClass(), "first", term68020);
        setField(term68020, term68020.getClass(), "last", null);
        setField(term68020, term68020.getClass(), "propListHead", null);
        setIntField(term68020, term68020.getClass(), "sourcePosition", 0);
        setField(term68020, term68020.getClass(), "jsType", null);
        setField(term68020, term68020.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term67521;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term67429, args);
        assertTrue(recursiveEquals(term67429, term68045));
        assertTrue(recursiveEquals(term67521, term68046));
        assertTrue(recursiveEquals(retValue, term68020));
    }

};


