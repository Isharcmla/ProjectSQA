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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238165;
     Object term238257;
     Object term238761;
     Object term238762;
     Object term238740;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238165 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term238257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term238257, term238257.getClass(), "first", term238257);
        setField(term238257, term238257.getClass(), "next", term238327);
        setIntField(term238257, term238257.getClass(), "type", 18);
        term238761 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term238761, term238761.getClass(), "currentTraversal", null);
        term238762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term238762, term238762.getClass(), "str", null);
        setIntField(term238762, term238762.getClass(), "type", 18);
        setIntField(term238763, term238763.getClass(), "type", 0);
        setField(term238763, term238763.getClass(), "next", null);
        setField(term238763, term238763.getClass(), "first", null);
        setField(term238763, term238763.getClass(), "last", null);
        setField(term238763, term238763.getClass(), "propListHead", null);
        setIntField(term238763, term238763.getClass(), "sourcePosition", 0);
        setField(term238763, term238763.getClass(), "jsType", null);
        setField(term238763, term238763.getClass(), "parent", null);
        setField(term238762, term238762.getClass(), "next", term238763);
        setField(term238762, term238762.getClass(), "first", term238762);
        setField(term238762, term238762.getClass(), "last", null);
        setField(term238762, term238762.getClass(), "propListHead", null);
        setIntField(term238762, term238762.getClass(), "sourcePosition", 0);
        setField(term238762, term238762.getClass(), "jsType", null);
        setField(term238762, term238762.getClass(), "parent", null);
        term238740 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term238740, term238740.getClass(), "str", null);
        setIntField(term238740, term238740.getClass(), "type", 18);
        setIntField(term238742, term238742.getClass(), "type", 0);
        setField(term238742, term238742.getClass(), "next", null);
        setField(term238742, term238742.getClass(), "first", null);
        setField(term238742, term238742.getClass(), "last", null);
        setField(term238742, term238742.getClass(), "propListHead", null);
        setIntField(term238742, term238742.getClass(), "sourcePosition", 0);
        setField(term238742, term238742.getClass(), "jsType", null);
        setField(term238742, term238742.getClass(), "parent", null);
        setField(term238740, term238740.getClass(), "next", term238742);
        setField(term238740, term238740.getClass(), "first", term238740);
        setField(term238740, term238740.getClass(), "last", null);
        setField(term238740, term238740.getClass(), "propListHead", null);
        setIntField(term238740, term238740.getClass(), "sourcePosition", 0);
        setField(term238740, term238740.getClass(), "jsType", null);
        setField(term238740, term238740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term238257;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term238165, args);
        assertTrue(recursiveEquals(term238165, term238761));
        assertTrue(recursiveEquals(term238257, term238762));
        assertTrue(recursiveEquals(retValue, term238740));
    }

};


