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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35990;
     Object term36060;
     Object term36079;
     Object term36080;
     Object term36064;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35990 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term36060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36060, term36060.getClass(), "first", term36060);
        setField(term36060, term36060.getClass(), "next", term36060);
        setIntField(term36060, term36060.getClass(), "type", 19);
        term36079 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term36079, term36079.getClass(), "currentTraversal", null);
        term36080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36080, term36080.getClass(), "type", 19);
        setField(term36080, term36080.getClass(), "next", term36080);
        setField(term36080, term36080.getClass(), "first", term36080);
        setField(term36080, term36080.getClass(), "last", null);
        setField(term36080, term36080.getClass(), "propListHead", null);
        setIntField(term36080, term36080.getClass(), "sourcePosition", 0);
        setField(term36080, term36080.getClass(), "jsType", null);
        setField(term36080, term36080.getClass(), "parent", null);
        term36064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36064, term36064.getClass(), "type", 19);
        setField(term36064, term36064.getClass(), "next", term36064);
        setField(term36064, term36064.getClass(), "first", term36064);
        setField(term36064, term36064.getClass(), "last", null);
        setField(term36064, term36064.getClass(), "propListHead", null);
        setIntField(term36064, term36064.getClass(), "sourcePosition", 0);
        setField(term36064, term36064.getClass(), "jsType", null);
        setField(term36064, term36064.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36060;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term35990, args);
        assertTrue(recursiveEquals(term35990, term36079));
        assertTrue(recursiveEquals(term36060, term36080));
        assertTrue(recursiveEquals(retValue, term36064));
    }

};


