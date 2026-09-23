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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890741;
     Object term890811;
     Object term891727;
     Object term891728;
     Object term891658;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890741 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term890811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term890881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term890951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term890951, term890951.getClass(), "type", 64);
        setField(term890881, term890881.getClass(), "next", term890951);
        setIntField(term890881, term890881.getClass(), "type", 0);
        setField(term890811, term890811.getClass(), "first", term890881);
        setIntField(term890811, term890811.getClass(), "type", 101);
        setIntField(term891021, term891021.getClass(), "type", 98);
        setField(term890811, term890811.getClass(), "parent", term891021);
        term891727 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term891727, term891727.getClass(), "currentTraversal", null);
        term891728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term891728, term891728.getClass(), "type", 101);
        setField(term891728, term891728.getClass(), "next", null);
        setIntField(term891729, term891729.getClass(), "type", 0);
        setIntField(term891730, term891730.getClass(), "type", 64);
        setField(term891730, term891730.getClass(), "next", null);
        setField(term891730, term891730.getClass(), "first", null);
        setField(term891730, term891730.getClass(), "last", null);
        setField(term891730, term891730.getClass(), "propListHead", null);
        setIntField(term891730, term891730.getClass(), "sourcePosition", 0);
        setField(term891730, term891730.getClass(), "jsType", null);
        setField(term891730, term891730.getClass(), "parent", null);
        setField(term891729, term891729.getClass(), "next", term891730);
        setField(term891729, term891729.getClass(), "first", null);
        setField(term891729, term891729.getClass(), "last", null);
        setField(term891729, term891729.getClass(), "propListHead", null);
        setIntField(term891729, term891729.getClass(), "sourcePosition", 0);
        setField(term891729, term891729.getClass(), "jsType", null);
        setField(term891729, term891729.getClass(), "parent", null);
        setField(term891728, term891728.getClass(), "first", term891729);
        setField(term891728, term891728.getClass(), "last", null);
        setField(term891728, term891728.getClass(), "propListHead", null);
        setIntField(term891728, term891728.getClass(), "sourcePosition", 0);
        setField(term891728, term891728.getClass(), "jsType", null);
        setIntField(term891731, term891731.getClass(), "type", 98);
        setField(term891731, term891731.getClass(), "next", null);
        setField(term891731, term891731.getClass(), "first", null);
        setField(term891731, term891731.getClass(), "last", null);
        setField(term891731, term891731.getClass(), "propListHead", null);
        setIntField(term891731, term891731.getClass(), "sourcePosition", 0);
        setField(term891731, term891731.getClass(), "jsType", null);
        setField(term891731, term891731.getClass(), "parent", null);
        setField(term891728, term891728.getClass(), "parent", term891731);
        term891658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term891658, term891658.getClass(), "type", 101);
        setField(term891658, term891658.getClass(), "next", null);
        setIntField(term891660, term891660.getClass(), "type", 0);
        setIntField(term891662, term891662.getClass(), "type", 64);
        setField(term891662, term891662.getClass(), "next", null);
        setField(term891662, term891662.getClass(), "first", null);
        setField(term891662, term891662.getClass(), "last", null);
        setField(term891662, term891662.getClass(), "propListHead", null);
        setIntField(term891662, term891662.getClass(), "sourcePosition", 0);
        setField(term891662, term891662.getClass(), "jsType", null);
        setField(term891662, term891662.getClass(), "parent", null);
        setField(term891660, term891660.getClass(), "next", term891662);
        setField(term891660, term891660.getClass(), "first", null);
        setField(term891660, term891660.getClass(), "last", null);
        setField(term891660, term891660.getClass(), "propListHead", null);
        setIntField(term891660, term891660.getClass(), "sourcePosition", 0);
        setField(term891660, term891660.getClass(), "jsType", null);
        setField(term891660, term891660.getClass(), "parent", null);
        setField(term891658, term891658.getClass(), "first", term891660);
        setField(term891658, term891658.getClass(), "last", null);
        setField(term891658, term891658.getClass(), "propListHead", null);
        setIntField(term891658, term891658.getClass(), "sourcePosition", 0);
        setField(term891658, term891658.getClass(), "jsType", null);
        setIntField(term891667, term891667.getClass(), "type", 98);
        setField(term891667, term891667.getClass(), "next", null);
        setField(term891667, term891667.getClass(), "first", null);
        setField(term891667, term891667.getClass(), "last", null);
        setField(term891667, term891667.getClass(), "propListHead", null);
        setIntField(term891667, term891667.getClass(), "sourcePosition", 0);
        setField(term891667, term891667.getClass(), "jsType", null);
        setField(term891667, term891667.getClass(), "parent", null);
        setField(term891658, term891658.getClass(), "parent", term891667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term890811;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term890741, args);
        assertTrue(recursiveEquals(term890741, term891727));
        assertTrue(recursiveEquals(term890811, term891728));
        assertTrue(recursiveEquals(retValue, term891658));
    }

};


