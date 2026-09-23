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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136992;
     Object term137062;
     Object term137648;
     Object term137649;
     Object term137619;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136992 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term137062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term137132, term137132.getClass(), "next", term137202);
        setIntField(term137132, term137132.getClass(), "type", 39);
        setField(term137062, term137062.getClass(), "first", term137132);
        setIntField(term137062, term137062.getClass(), "type", 18);
        term137648 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term137648, term137648.getClass(), "currentTraversal", null);
        term137649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term137649, term137649.getClass(), "type", 18);
        setField(term137649, term137649.getClass(), "next", null);
        setIntField(term137650, term137650.getClass(), "type", 39);
        setIntField(term137651, term137651.getClass(), "type", 0);
        setField(term137651, term137651.getClass(), "next", null);
        setField(term137651, term137651.getClass(), "first", null);
        setField(term137651, term137651.getClass(), "last", null);
        setField(term137651, term137651.getClass(), "propListHead", null);
        setIntField(term137651, term137651.getClass(), "sourcePosition", 0);
        setField(term137651, term137651.getClass(), "jsType", null);
        setField(term137651, term137651.getClass(), "parent", null);
        setField(term137650, term137650.getClass(), "next", term137651);
        setField(term137650, term137650.getClass(), "first", null);
        setField(term137650, term137650.getClass(), "last", null);
        setField(term137650, term137650.getClass(), "propListHead", null);
        setIntField(term137650, term137650.getClass(), "sourcePosition", 0);
        setField(term137650, term137650.getClass(), "jsType", null);
        setField(term137650, term137650.getClass(), "parent", null);
        setField(term137649, term137649.getClass(), "first", term137650);
        setField(term137649, term137649.getClass(), "last", null);
        setField(term137649, term137649.getClass(), "propListHead", null);
        setIntField(term137649, term137649.getClass(), "sourcePosition", 0);
        setField(term137649, term137649.getClass(), "jsType", null);
        setField(term137649, term137649.getClass(), "parent", null);
        term137619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term137619, term137619.getClass(), "type", 18);
        setField(term137619, term137619.getClass(), "next", null);
        setIntField(term137621, term137621.getClass(), "type", 39);
        setIntField(term137623, term137623.getClass(), "type", 0);
        setField(term137623, term137623.getClass(), "next", null);
        setField(term137623, term137623.getClass(), "first", null);
        setField(term137623, term137623.getClass(), "last", null);
        setField(term137623, term137623.getClass(), "propListHead", null);
        setIntField(term137623, term137623.getClass(), "sourcePosition", 0);
        setField(term137623, term137623.getClass(), "jsType", null);
        setField(term137623, term137623.getClass(), "parent", null);
        setField(term137621, term137621.getClass(), "next", term137623);
        setField(term137621, term137621.getClass(), "first", null);
        setField(term137621, term137621.getClass(), "last", null);
        setField(term137621, term137621.getClass(), "propListHead", null);
        setIntField(term137621, term137621.getClass(), "sourcePosition", 0);
        setField(term137621, term137621.getClass(), "jsType", null);
        setField(term137621, term137621.getClass(), "parent", null);
        setField(term137619, term137619.getClass(), "first", term137621);
        setField(term137619, term137619.getClass(), "last", null);
        setField(term137619, term137619.getClass(), "propListHead", null);
        setIntField(term137619, term137619.getClass(), "sourcePosition", 0);
        setField(term137619, term137619.getClass(), "jsType", null);
        setField(term137619, term137619.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term137062;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term136992, args);
        assertTrue(recursiveEquals(term136992, term137648));
        assertTrue(recursiveEquals(term137062, term137649));
        assertTrue(recursiveEquals(retValue, term137619));
    }

};


