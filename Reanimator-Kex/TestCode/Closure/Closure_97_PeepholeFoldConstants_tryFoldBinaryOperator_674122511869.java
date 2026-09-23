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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246793;
     Object term246885;
     Object term247441;
     Object term247442;
     Object term247392;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246793 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term246885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term246955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term246885, term246885.getClass(), "first", term246885);
        setField(term246885, term246885.getClass(), "next", term246955);
        setIntField(term246885, term246885.getClass(), "type", 101);
        term247441 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term247441, term247441.getClass(), "currentTraversal", null);
        term247442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term247443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term247442, term247442.getClass(), "number", 0.0);
        setIntField(term247442, term247442.getClass(), "type", 101);
        setIntField(term247443, term247443.getClass(), "type", 0);
        setField(term247443, term247443.getClass(), "next", null);
        setField(term247443, term247443.getClass(), "first", null);
        setField(term247443, term247443.getClass(), "last", null);
        setField(term247443, term247443.getClass(), "propListHead", null);
        setIntField(term247443, term247443.getClass(), "sourcePosition", 0);
        setField(term247443, term247443.getClass(), "jsType", null);
        setField(term247443, term247443.getClass(), "parent", null);
        setField(term247442, term247442.getClass(), "next", term247443);
        setField(term247442, term247442.getClass(), "first", term247442);
        setField(term247442, term247442.getClass(), "last", null);
        setField(term247442, term247442.getClass(), "propListHead", null);
        setIntField(term247442, term247442.getClass(), "sourcePosition", 0);
        setField(term247442, term247442.getClass(), "jsType", null);
        setField(term247442, term247442.getClass(), "parent", null);
        term247392 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term247395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term247392, term247392.getClass(), "number", 0.0);
        setIntField(term247392, term247392.getClass(), "type", 101);
        setIntField(term247395, term247395.getClass(), "type", 0);
        setField(term247395, term247395.getClass(), "next", null);
        setField(term247395, term247395.getClass(), "first", null);
        setField(term247395, term247395.getClass(), "last", null);
        setField(term247395, term247395.getClass(), "propListHead", null);
        setIntField(term247395, term247395.getClass(), "sourcePosition", 0);
        setField(term247395, term247395.getClass(), "jsType", null);
        setField(term247395, term247395.getClass(), "parent", null);
        setField(term247392, term247392.getClass(), "next", term247395);
        setField(term247392, term247392.getClass(), "first", term247392);
        setField(term247392, term247392.getClass(), "last", null);
        setField(term247392, term247392.getClass(), "propListHead", null);
        setIntField(term247392, term247392.getClass(), "sourcePosition", 0);
        setField(term247392, term247392.getClass(), "jsType", null);
        setField(term247392, term247392.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term246885;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term246793, args);
        assertTrue(recursiveEquals(term246793, term247441));
        assertTrue(recursiveEquals(term246885, term247442));
        assertTrue(recursiveEquals(retValue, term247392));
    }

};


