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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552451;
     Object term552521;
     Object term553200;
     Object term553201;
     Object term553153;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552451 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term552521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term552591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term552661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term552661, term552661.getClass(), "type", 16);
        setField(term552591, term552591.getClass(), "next", term552661);
        setIntField(term552591, term552591.getClass(), "type", 42);
        setField(term552521, term552521.getClass(), "first", term552591);
        setIntField(term552521, term552521.getClass(), "type", 16);
        term553200 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term553200, term553200.getClass(), "currentTraversal", null);
        term553201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term553201, term553201.getClass(), "type", 16);
        setField(term553201, term553201.getClass(), "next", null);
        setIntField(term553202, term553202.getClass(), "type", 42);
        setIntField(term553203, term553203.getClass(), "type", 16);
        setField(term553203, term553203.getClass(), "next", null);
        setField(term553203, term553203.getClass(), "first", null);
        setField(term553203, term553203.getClass(), "last", null);
        setField(term553203, term553203.getClass(), "propListHead", null);
        setIntField(term553203, term553203.getClass(), "sourcePosition", 0);
        setField(term553203, term553203.getClass(), "jsType", null);
        setField(term553203, term553203.getClass(), "parent", null);
        setField(term553202, term553202.getClass(), "next", term553203);
        setField(term553202, term553202.getClass(), "first", null);
        setField(term553202, term553202.getClass(), "last", null);
        setField(term553202, term553202.getClass(), "propListHead", null);
        setIntField(term553202, term553202.getClass(), "sourcePosition", 0);
        setField(term553202, term553202.getClass(), "jsType", null);
        setField(term553202, term553202.getClass(), "parent", null);
        setField(term553201, term553201.getClass(), "first", term553202);
        setField(term553201, term553201.getClass(), "last", null);
        setField(term553201, term553201.getClass(), "propListHead", null);
        setIntField(term553201, term553201.getClass(), "sourcePosition", 0);
        setField(term553201, term553201.getClass(), "jsType", null);
        setField(term553201, term553201.getClass(), "parent", null);
        term553153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term553153, term553153.getClass(), "type", 16);
        setField(term553153, term553153.getClass(), "next", null);
        setIntField(term553155, term553155.getClass(), "type", 42);
        setIntField(term553157, term553157.getClass(), "type", 16);
        setField(term553157, term553157.getClass(), "next", null);
        setField(term553157, term553157.getClass(), "first", null);
        setField(term553157, term553157.getClass(), "last", null);
        setField(term553157, term553157.getClass(), "propListHead", null);
        setIntField(term553157, term553157.getClass(), "sourcePosition", 0);
        setField(term553157, term553157.getClass(), "jsType", null);
        setField(term553157, term553157.getClass(), "parent", null);
        setField(term553155, term553155.getClass(), "next", term553157);
        setField(term553155, term553155.getClass(), "first", null);
        setField(term553155, term553155.getClass(), "last", null);
        setField(term553155, term553155.getClass(), "propListHead", null);
        setIntField(term553155, term553155.getClass(), "sourcePosition", 0);
        setField(term553155, term553155.getClass(), "jsType", null);
        setField(term553155, term553155.getClass(), "parent", null);
        setField(term553153, term553153.getClass(), "first", term553155);
        setField(term553153, term553153.getClass(), "last", null);
        setField(term553153, term553153.getClass(), "propListHead", null);
        setIntField(term553153, term553153.getClass(), "sourcePosition", 0);
        setField(term553153, term553153.getClass(), "jsType", null);
        setField(term553153, term553153.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term552521;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term552451, args);
        assertTrue(recursiveEquals(term552451, term553200));
        assertTrue(recursiveEquals(term552521, term553201));
        assertTrue(recursiveEquals(retValue, term553153));
    }

};


