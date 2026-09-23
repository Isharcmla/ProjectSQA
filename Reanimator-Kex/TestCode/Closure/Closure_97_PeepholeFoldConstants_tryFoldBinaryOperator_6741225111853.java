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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714090;
     Object term714182;
     Object term714714;
     Object term714715;
     Object term714667;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714090 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term714182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term714252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term714182, term714182.getClass(), "first", term714182);
        setField(term714182, term714182.getClass(), "next", term714252);
        setIntField(term714182, term714182.getClass(), "type", 101);
        term714714 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term714714, term714714.getClass(), "currentTraversal", null);
        term714715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term714716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term714715, term714715.getClass(), "str", null);
        setIntField(term714715, term714715.getClass(), "type", 101);
        setIntField(term714716, term714716.getClass(), "type", 0);
        setField(term714716, term714716.getClass(), "next", null);
        setField(term714716, term714716.getClass(), "first", null);
        setField(term714716, term714716.getClass(), "last", null);
        setField(term714716, term714716.getClass(), "propListHead", null);
        setIntField(term714716, term714716.getClass(), "sourcePosition", 0);
        setField(term714716, term714716.getClass(), "jsType", null);
        setField(term714716, term714716.getClass(), "parent", null);
        setField(term714715, term714715.getClass(), "next", term714716);
        setField(term714715, term714715.getClass(), "first", term714715);
        setField(term714715, term714715.getClass(), "last", null);
        setField(term714715, term714715.getClass(), "propListHead", null);
        setIntField(term714715, term714715.getClass(), "sourcePosition", 0);
        setField(term714715, term714715.getClass(), "jsType", null);
        setField(term714715, term714715.getClass(), "parent", null);
        term714667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term714669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term714667, term714667.getClass(), "str", null);
        setIntField(term714667, term714667.getClass(), "type", 101);
        setIntField(term714669, term714669.getClass(), "type", 0);
        setField(term714669, term714669.getClass(), "next", null);
        setField(term714669, term714669.getClass(), "first", null);
        setField(term714669, term714669.getClass(), "last", null);
        setField(term714669, term714669.getClass(), "propListHead", null);
        setIntField(term714669, term714669.getClass(), "sourcePosition", 0);
        setField(term714669, term714669.getClass(), "jsType", null);
        setField(term714669, term714669.getClass(), "parent", null);
        setField(term714667, term714667.getClass(), "next", term714669);
        setField(term714667, term714667.getClass(), "first", term714667);
        setField(term714667, term714667.getClass(), "last", null);
        setField(term714667, term714667.getClass(), "propListHead", null);
        setIntField(term714667, term714667.getClass(), "sourcePosition", 0);
        setField(term714667, term714667.getClass(), "jsType", null);
        setField(term714667, term714667.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term714182;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term714090, args);
        assertTrue(recursiveEquals(term714090, term714714));
        assertTrue(recursiveEquals(term714182, term714715));
        assertTrue(recursiveEquals(retValue, term714667));
    }

};


