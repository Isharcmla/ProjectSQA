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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337270;
     Object term337362;
     Object term337987;
     Object term337988;
     Object term337927;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337270 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term337362 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term337546, term337546.getClass(), "first", term337454);
        setField(term337454, term337454.getClass(), "next", term337546);
        setField(term337362, term337362.getClass(), "first", term337454);
        setIntField(term337362, term337362.getClass(), "type", 86);
        term337987 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term337987, term337987.getClass(), "currentTraversal", null);
        term337988 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337989 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term337988, term337988.getClass(), "number", 0.0);
        setIntField(term337988, term337988.getClass(), "type", 86);
        setField(term337988, term337988.getClass(), "next", null);
        setDoubleField(term337989, term337989.getClass(), "number", 0.0);
        setIntField(term337989, term337989.getClass(), "type", 0);
        setDoubleField(term337990, term337990.getClass(), "number", 0.0);
        setIntField(term337990, term337990.getClass(), "type", 0);
        setField(term337990, term337990.getClass(), "next", null);
        setField(term337990, term337990.getClass(), "first", term337989);
        setField(term337990, term337990.getClass(), "last", null);
        setField(term337990, term337990.getClass(), "propListHead", null);
        setIntField(term337990, term337990.getClass(), "sourcePosition", 0);
        setField(term337990, term337990.getClass(), "jsType", null);
        setField(term337990, term337990.getClass(), "parent", null);
        setField(term337989, term337989.getClass(), "next", term337990);
        setField(term337989, term337989.getClass(), "first", null);
        setField(term337989, term337989.getClass(), "last", null);
        setField(term337989, term337989.getClass(), "propListHead", null);
        setIntField(term337989, term337989.getClass(), "sourcePosition", 0);
        setField(term337989, term337989.getClass(), "jsType", null);
        setField(term337989, term337989.getClass(), "parent", null);
        setField(term337988, term337988.getClass(), "first", term337989);
        setField(term337988, term337988.getClass(), "last", null);
        setField(term337988, term337988.getClass(), "propListHead", null);
        setIntField(term337988, term337988.getClass(), "sourcePosition", 0);
        setField(term337988, term337988.getClass(), "jsType", null);
        setField(term337988, term337988.getClass(), "parent", null);
        term337927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337933 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term337927, term337927.getClass(), "number", 0.0);
        setIntField(term337927, term337927.getClass(), "type", 86);
        setField(term337927, term337927.getClass(), "next", null);
        setDoubleField(term337930, term337930.getClass(), "number", 0.0);
        setIntField(term337930, term337930.getClass(), "type", 0);
        setDoubleField(term337933, term337933.getClass(), "number", 0.0);
        setIntField(term337933, term337933.getClass(), "type", 0);
        setField(term337933, term337933.getClass(), "next", null);
        setField(term337933, term337933.getClass(), "first", term337930);
        setField(term337933, term337933.getClass(), "last", null);
        setField(term337933, term337933.getClass(), "propListHead", null);
        setIntField(term337933, term337933.getClass(), "sourcePosition", 0);
        setField(term337933, term337933.getClass(), "jsType", null);
        setField(term337933, term337933.getClass(), "parent", null);
        setField(term337930, term337930.getClass(), "next", term337933);
        setField(term337930, term337930.getClass(), "first", null);
        setField(term337930, term337930.getClass(), "last", null);
        setField(term337930, term337930.getClass(), "propListHead", null);
        setIntField(term337930, term337930.getClass(), "sourcePosition", 0);
        setField(term337930, term337930.getClass(), "jsType", null);
        setField(term337930, term337930.getClass(), "parent", null);
        setField(term337927, term337927.getClass(), "first", term337930);
        setField(term337927, term337927.getClass(), "last", null);
        setField(term337927, term337927.getClass(), "propListHead", null);
        setIntField(term337927, term337927.getClass(), "sourcePosition", 0);
        setField(term337927, term337927.getClass(), "jsType", null);
        setField(term337927, term337927.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term337362;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term337270, args);
        assertTrue(recursiveEquals(term337270, term337987));
        assertTrue(recursiveEquals(term337362, term337988));
        assertTrue(recursiveEquals(retValue, term337927));
    }

};


