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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180096;
     Object term180188;
     Object term180457;
     Object term180458;
     Object term180428;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180096 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term180188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180280, term180280.getClass(), "next", term180372);
        setIntField(term180280, term180280.getClass(), "type", 39);
        setField(term180188, term180188.getClass(), "first", term180280);
        setIntField(term180188, term180188.getClass(), "type", 22);
        term180457 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term180457, term180457.getClass(), "currentTraversal", null);
        term180458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180459 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180460 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180458, term180458.getClass(), "str", null);
        setIntField(term180458, term180458.getClass(), "type", 22);
        setField(term180458, term180458.getClass(), "next", null);
        setField(term180459, term180459.getClass(), "str", null);
        setIntField(term180459, term180459.getClass(), "type", 39);
        setField(term180460, term180460.getClass(), "str", null);
        setIntField(term180460, term180460.getClass(), "type", 0);
        setField(term180460, term180460.getClass(), "next", null);
        setField(term180460, term180460.getClass(), "first", null);
        setField(term180460, term180460.getClass(), "last", null);
        setField(term180460, term180460.getClass(), "propListHead", null);
        setIntField(term180460, term180460.getClass(), "sourcePosition", 0);
        setField(term180460, term180460.getClass(), "jsType", null);
        setField(term180460, term180460.getClass(), "parent", null);
        setField(term180459, term180459.getClass(), "next", term180460);
        setField(term180459, term180459.getClass(), "first", null);
        setField(term180459, term180459.getClass(), "last", null);
        setField(term180459, term180459.getClass(), "propListHead", null);
        setIntField(term180459, term180459.getClass(), "sourcePosition", 0);
        setField(term180459, term180459.getClass(), "jsType", null);
        setField(term180459, term180459.getClass(), "parent", null);
        setField(term180458, term180458.getClass(), "first", term180459);
        setField(term180458, term180458.getClass(), "last", null);
        setField(term180458, term180458.getClass(), "propListHead", null);
        setIntField(term180458, term180458.getClass(), "sourcePosition", 0);
        setField(term180458, term180458.getClass(), "jsType", null);
        setField(term180458, term180458.getClass(), "parent", null);
        term180428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term180432 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180428, term180428.getClass(), "str", null);
        setIntField(term180428, term180428.getClass(), "type", 22);
        setField(term180428, term180428.getClass(), "next", null);
        setField(term180430, term180430.getClass(), "str", null);
        setIntField(term180430, term180430.getClass(), "type", 39);
        setField(term180432, term180432.getClass(), "str", null);
        setIntField(term180432, term180432.getClass(), "type", 0);
        setField(term180432, term180432.getClass(), "next", null);
        setField(term180432, term180432.getClass(), "first", null);
        setField(term180432, term180432.getClass(), "last", null);
        setField(term180432, term180432.getClass(), "propListHead", null);
        setIntField(term180432, term180432.getClass(), "sourcePosition", 0);
        setField(term180432, term180432.getClass(), "jsType", null);
        setField(term180432, term180432.getClass(), "parent", null);
        setField(term180430, term180430.getClass(), "next", term180432);
        setField(term180430, term180430.getClass(), "first", null);
        setField(term180430, term180430.getClass(), "last", null);
        setField(term180430, term180430.getClass(), "propListHead", null);
        setIntField(term180430, term180430.getClass(), "sourcePosition", 0);
        setField(term180430, term180430.getClass(), "jsType", null);
        setField(term180430, term180430.getClass(), "parent", null);
        setField(term180428, term180428.getClass(), "first", term180430);
        setField(term180428, term180428.getClass(), "last", null);
        setField(term180428, term180428.getClass(), "propListHead", null);
        setIntField(term180428, term180428.getClass(), "sourcePosition", 0);
        setField(term180428, term180428.getClass(), "jsType", null);
        setField(term180428, term180428.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term180188;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term180096, args);
        assertTrue(recursiveEquals(term180096, term180457));
        assertTrue(recursiveEquals(term180188, term180458));
        assertTrue(recursiveEquals(retValue, term180428));
    }

};


