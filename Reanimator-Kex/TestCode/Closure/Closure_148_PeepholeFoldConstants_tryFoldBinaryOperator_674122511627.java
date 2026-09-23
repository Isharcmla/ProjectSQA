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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137811;
     Object term137903;
     Object term138453;
     Object term138454;
     Object term138423;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137811 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term137903 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term137903, term137903.getClass(), "first", term137903);
        setField(term137903, term137903.getClass(), "next", term137973);
        setIntField(term137903, term137903.getClass(), "type", 17);
        term138453 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term138453, term138453.getClass(), "currentTraversal", null);
        term138454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term138454, term138454.getClass(), "number", 0.0);
        setIntField(term138454, term138454.getClass(), "type", 17);
        setIntField(term138455, term138455.getClass(), "type", 0);
        setField(term138455, term138455.getClass(), "next", null);
        setField(term138455, term138455.getClass(), "first", null);
        setField(term138455, term138455.getClass(), "last", null);
        setField(term138455, term138455.getClass(), "propListHead", null);
        setIntField(term138455, term138455.getClass(), "sourcePosition", 0);
        setField(term138455, term138455.getClass(), "jsType", null);
        setField(term138455, term138455.getClass(), "parent", null);
        setField(term138454, term138454.getClass(), "next", term138455);
        setField(term138454, term138454.getClass(), "first", term138454);
        setField(term138454, term138454.getClass(), "last", null);
        setField(term138454, term138454.getClass(), "propListHead", null);
        setIntField(term138454, term138454.getClass(), "sourcePosition", 0);
        setField(term138454, term138454.getClass(), "jsType", null);
        setField(term138454, term138454.getClass(), "parent", null);
        term138423 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term138426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term138423, term138423.getClass(), "number", 0.0);
        setIntField(term138423, term138423.getClass(), "type", 17);
        setIntField(term138426, term138426.getClass(), "type", 0);
        setField(term138426, term138426.getClass(), "next", null);
        setField(term138426, term138426.getClass(), "first", null);
        setField(term138426, term138426.getClass(), "last", null);
        setField(term138426, term138426.getClass(), "propListHead", null);
        setIntField(term138426, term138426.getClass(), "sourcePosition", 0);
        setField(term138426, term138426.getClass(), "jsType", null);
        setField(term138426, term138426.getClass(), "parent", null);
        setField(term138423, term138423.getClass(), "next", term138426);
        setField(term138423, term138423.getClass(), "first", term138423);
        setField(term138423, term138423.getClass(), "last", null);
        setField(term138423, term138423.getClass(), "propListHead", null);
        setIntField(term138423, term138423.getClass(), "sourcePosition", 0);
        setField(term138423, term138423.getClass(), "jsType", null);
        setField(term138423, term138423.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term137903;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term137811, args);
        assertTrue(recursiveEquals(term137811, term138453));
        assertTrue(recursiveEquals(term137903, term138454));
        assertTrue(recursiveEquals(retValue, term138423));
    }

};


