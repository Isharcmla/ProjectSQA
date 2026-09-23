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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305458;
     Object term305550;
     Object term306545;
     Object term306546;
     Object term306509;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305458 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term305550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term305734 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term305642, term305642.getClass(), "next", term305734);
        setIntField(term305642, term305642.getClass(), "type", 39);
        setField(term305550, term305550.getClass(), "first", term305642);
        setIntField(term305550, term305550.getClass(), "type", 23);
        term306545 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term306545, term306545.getClass(), "currentTraversal", null);
        term306546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term306546, term306546.getClass(), "number", 0.0);
        setIntField(term306546, term306546.getClass(), "type", 23);
        setField(term306546, term306546.getClass(), "next", null);
        setDoubleField(term306547, term306547.getClass(), "number", 0.0);
        setIntField(term306547, term306547.getClass(), "type", 39);
        setDoubleField(term306548, term306548.getClass(), "number", 0.0);
        setIntField(term306548, term306548.getClass(), "type", 0);
        setField(term306548, term306548.getClass(), "next", null);
        setField(term306548, term306548.getClass(), "first", null);
        setField(term306548, term306548.getClass(), "last", null);
        setField(term306548, term306548.getClass(), "propListHead", null);
        setIntField(term306548, term306548.getClass(), "sourcePosition", 0);
        setField(term306548, term306548.getClass(), "jsType", null);
        setField(term306548, term306548.getClass(), "parent", null);
        setField(term306547, term306547.getClass(), "next", term306548);
        setField(term306547, term306547.getClass(), "first", null);
        setField(term306547, term306547.getClass(), "last", null);
        setField(term306547, term306547.getClass(), "propListHead", null);
        setIntField(term306547, term306547.getClass(), "sourcePosition", 0);
        setField(term306547, term306547.getClass(), "jsType", null);
        setField(term306547, term306547.getClass(), "parent", null);
        setField(term306546, term306546.getClass(), "first", term306547);
        setField(term306546, term306546.getClass(), "last", null);
        setField(term306546, term306546.getClass(), "propListHead", null);
        setIntField(term306546, term306546.getClass(), "sourcePosition", 0);
        setField(term306546, term306546.getClass(), "jsType", null);
        setField(term306546, term306546.getClass(), "parent", null);
        term306509 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306512 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term306515 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term306509, term306509.getClass(), "number", 0.0);
        setIntField(term306509, term306509.getClass(), "type", 23);
        setField(term306509, term306509.getClass(), "next", null);
        setDoubleField(term306512, term306512.getClass(), "number", 0.0);
        setIntField(term306512, term306512.getClass(), "type", 39);
        setDoubleField(term306515, term306515.getClass(), "number", 0.0);
        setIntField(term306515, term306515.getClass(), "type", 0);
        setField(term306515, term306515.getClass(), "next", null);
        setField(term306515, term306515.getClass(), "first", null);
        setField(term306515, term306515.getClass(), "last", null);
        setField(term306515, term306515.getClass(), "propListHead", null);
        setIntField(term306515, term306515.getClass(), "sourcePosition", 0);
        setField(term306515, term306515.getClass(), "jsType", null);
        setField(term306515, term306515.getClass(), "parent", null);
        setField(term306512, term306512.getClass(), "next", term306515);
        setField(term306512, term306512.getClass(), "first", null);
        setField(term306512, term306512.getClass(), "last", null);
        setField(term306512, term306512.getClass(), "propListHead", null);
        setIntField(term306512, term306512.getClass(), "sourcePosition", 0);
        setField(term306512, term306512.getClass(), "jsType", null);
        setField(term306512, term306512.getClass(), "parent", null);
        setField(term306509, term306509.getClass(), "first", term306512);
        setField(term306509, term306509.getClass(), "last", null);
        setField(term306509, term306509.getClass(), "propListHead", null);
        setIntField(term306509, term306509.getClass(), "sourcePosition", 0);
        setField(term306509, term306509.getClass(), "jsType", null);
        setField(term306509, term306509.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term305550;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term305458, args);
        assertTrue(recursiveEquals(term305458, term306545));
        assertTrue(recursiveEquals(term305550, term306546));
        assertTrue(recursiveEquals(retValue, term306509));
    }

};


