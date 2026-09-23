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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275983;
     Object term276075;
     Object term277100;
     Object term277101;
     Object term277046;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275983 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term276075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term276167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term276259 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term276259, term276259.getClass(), "type", 16);
        setField(term276167, term276167.getClass(), "next", term276259);
        setIntField(term276167, term276167.getClass(), "type", 42);
        setField(term276075, term276075.getClass(), "first", term276167);
        setIntField(term276075, term276075.getClass(), "type", 16);
        term277100 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term277100, term277100.getClass(), "currentTraversal", null);
        term277101 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term277102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term277103 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term277101, term277101.getClass(), "number", 0.0);
        setIntField(term277101, term277101.getClass(), "type", 16);
        setField(term277101, term277101.getClass(), "next", null);
        setDoubleField(term277102, term277102.getClass(), "number", 0.0);
        setIntField(term277102, term277102.getClass(), "type", 42);
        setDoubleField(term277103, term277103.getClass(), "number", 0.0);
        setIntField(term277103, term277103.getClass(), "type", 16);
        setField(term277103, term277103.getClass(), "next", null);
        setField(term277103, term277103.getClass(), "first", null);
        setField(term277103, term277103.getClass(), "last", null);
        setField(term277103, term277103.getClass(), "propListHead", null);
        setIntField(term277103, term277103.getClass(), "sourcePosition", 0);
        setField(term277103, term277103.getClass(), "jsType", null);
        setField(term277103, term277103.getClass(), "parent", null);
        setField(term277102, term277102.getClass(), "next", term277103);
        setField(term277102, term277102.getClass(), "first", null);
        setField(term277102, term277102.getClass(), "last", null);
        setField(term277102, term277102.getClass(), "propListHead", null);
        setIntField(term277102, term277102.getClass(), "sourcePosition", 0);
        setField(term277102, term277102.getClass(), "jsType", null);
        setField(term277102, term277102.getClass(), "parent", null);
        setField(term277101, term277101.getClass(), "first", term277102);
        setField(term277101, term277101.getClass(), "last", null);
        setField(term277101, term277101.getClass(), "propListHead", null);
        setIntField(term277101, term277101.getClass(), "sourcePosition", 0);
        setField(term277101, term277101.getClass(), "jsType", null);
        setField(term277101, term277101.getClass(), "parent", null);
        term277046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term277049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term277052 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term277046, term277046.getClass(), "number", 0.0);
        setIntField(term277046, term277046.getClass(), "type", 16);
        setField(term277046, term277046.getClass(), "next", null);
        setDoubleField(term277049, term277049.getClass(), "number", 0.0);
        setIntField(term277049, term277049.getClass(), "type", 42);
        setDoubleField(term277052, term277052.getClass(), "number", 0.0);
        setIntField(term277052, term277052.getClass(), "type", 16);
        setField(term277052, term277052.getClass(), "next", null);
        setField(term277052, term277052.getClass(), "first", null);
        setField(term277052, term277052.getClass(), "last", null);
        setField(term277052, term277052.getClass(), "propListHead", null);
        setIntField(term277052, term277052.getClass(), "sourcePosition", 0);
        setField(term277052, term277052.getClass(), "jsType", null);
        setField(term277052, term277052.getClass(), "parent", null);
        setField(term277049, term277049.getClass(), "next", term277052);
        setField(term277049, term277049.getClass(), "first", null);
        setField(term277049, term277049.getClass(), "last", null);
        setField(term277049, term277049.getClass(), "propListHead", null);
        setIntField(term277049, term277049.getClass(), "sourcePosition", 0);
        setField(term277049, term277049.getClass(), "jsType", null);
        setField(term277049, term277049.getClass(), "parent", null);
        setField(term277046, term277046.getClass(), "first", term277049);
        setField(term277046, term277046.getClass(), "last", null);
        setField(term277046, term277046.getClass(), "propListHead", null);
        setIntField(term277046, term277046.getClass(), "sourcePosition", 0);
        setField(term277046, term277046.getClass(), "jsType", null);
        setField(term277046, term277046.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term276075;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term275983, args);
        assertTrue(recursiveEquals(term275983, term277100));
        assertTrue(recursiveEquals(term276075, term277101));
        assertTrue(recursiveEquals(retValue, term277046));
    }

};


