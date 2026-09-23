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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698990;
     Object term699082;
     Object term699195;
     Object term699196;
     Object term699172;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term698990 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term699082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term699152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term699082, term699082.getClass(), "first", term699082);
        setField(term699082, term699082.getClass(), "next", term699152);
        setIntField(term699082, term699082.getClass(), "type", 18);
        term699195 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term699195, term699195.getClass(), "currentTraversal", null);
        term699196 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term699197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term699196, term699196.getClass(), "number", 0.0);
        setIntField(term699196, term699196.getClass(), "type", 18);
        setIntField(term699197, term699197.getClass(), "type", 0);
        setField(term699197, term699197.getClass(), "next", null);
        setField(term699197, term699197.getClass(), "first", null);
        setField(term699197, term699197.getClass(), "last", null);
        setField(term699197, term699197.getClass(), "propListHead", null);
        setIntField(term699197, term699197.getClass(), "sourcePosition", 0);
        setField(term699197, term699197.getClass(), "jsType", null);
        setField(term699197, term699197.getClass(), "parent", null);
        setField(term699196, term699196.getClass(), "next", term699197);
        setField(term699196, term699196.getClass(), "first", term699196);
        setField(term699196, term699196.getClass(), "last", null);
        setField(term699196, term699196.getClass(), "propListHead", null);
        setIntField(term699196, term699196.getClass(), "sourcePosition", 0);
        setField(term699196, term699196.getClass(), "jsType", null);
        setField(term699196, term699196.getClass(), "parent", null);
        term699172 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term699175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term699172, term699172.getClass(), "number", 0.0);
        setIntField(term699172, term699172.getClass(), "type", 18);
        setIntField(term699175, term699175.getClass(), "type", 0);
        setField(term699175, term699175.getClass(), "next", null);
        setField(term699175, term699175.getClass(), "first", null);
        setField(term699175, term699175.getClass(), "last", null);
        setField(term699175, term699175.getClass(), "propListHead", null);
        setIntField(term699175, term699175.getClass(), "sourcePosition", 0);
        setField(term699175, term699175.getClass(), "jsType", null);
        setField(term699175, term699175.getClass(), "parent", null);
        setField(term699172, term699172.getClass(), "next", term699175);
        setField(term699172, term699172.getClass(), "first", term699172);
        setField(term699172, term699172.getClass(), "last", null);
        setField(term699172, term699172.getClass(), "propListHead", null);
        setIntField(term699172, term699172.getClass(), "sourcePosition", 0);
        setField(term699172, term699172.getClass(), "jsType", null);
        setField(term699172, term699172.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term699082;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term698990, args);
        assertTrue(recursiveEquals(term698990, term699195));
        assertTrue(recursiveEquals(term699082, term699196));
        assertTrue(recursiveEquals(retValue, term699172));
    }

};


