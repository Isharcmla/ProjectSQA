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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694603;
     Object term694695;
     Object term694815;
     Object term694816;
     Object term694773;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694603 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term694695 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term694765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term694695, term694695.getClass(), "first", term694695);
        setField(term694695, term694695.getClass(), "next", term694765);
        setIntField(term694695, term694695.getClass(), "type", 21);
        term694815 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term694815, term694815.getClass(), "currentTraversal", null);
        term694816 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term694817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term694816, term694816.getClass(), "number", 0.0);
        setIntField(term694816, term694816.getClass(), "type", 21);
        setIntField(term694817, term694817.getClass(), "type", 0);
        setField(term694817, term694817.getClass(), "next", null);
        setField(term694817, term694817.getClass(), "first", null);
        setField(term694817, term694817.getClass(), "last", null);
        setField(term694817, term694817.getClass(), "propListHead", null);
        setIntField(term694817, term694817.getClass(), "sourcePosition", 0);
        setField(term694817, term694817.getClass(), "jsType", null);
        setField(term694817, term694817.getClass(), "parent", null);
        setField(term694816, term694816.getClass(), "next", term694817);
        setField(term694816, term694816.getClass(), "first", term694816);
        setField(term694816, term694816.getClass(), "last", null);
        setField(term694816, term694816.getClass(), "propListHead", null);
        setIntField(term694816, term694816.getClass(), "sourcePosition", 0);
        setField(term694816, term694816.getClass(), "jsType", null);
        setField(term694816, term694816.getClass(), "parent", null);
        term694773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term694776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term694773, term694773.getClass(), "number", 0.0);
        setIntField(term694773, term694773.getClass(), "type", 21);
        setIntField(term694776, term694776.getClass(), "type", 0);
        setField(term694776, term694776.getClass(), "next", null);
        setField(term694776, term694776.getClass(), "first", null);
        setField(term694776, term694776.getClass(), "last", null);
        setField(term694776, term694776.getClass(), "propListHead", null);
        setIntField(term694776, term694776.getClass(), "sourcePosition", 0);
        setField(term694776, term694776.getClass(), "jsType", null);
        setField(term694776, term694776.getClass(), "parent", null);
        setField(term694773, term694773.getClass(), "next", term694776);
        setField(term694773, term694773.getClass(), "first", term694773);
        setField(term694773, term694773.getClass(), "last", null);
        setField(term694773, term694773.getClass(), "propListHead", null);
        setIntField(term694773, term694773.getClass(), "sourcePosition", 0);
        setField(term694773, term694773.getClass(), "jsType", null);
        setField(term694773, term694773.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term694695;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term694603, args);
        assertTrue(recursiveEquals(term694603, term694815));
        assertTrue(recursiveEquals(term694695, term694816));
        assertTrue(recursiveEquals(retValue, term694773));
    }

};


