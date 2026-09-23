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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744528;
     Object term744620;
     Object term744731;
     Object term744732;
     Object term744703;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term744528 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term744620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term744690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term744620, term744620.getClass(), "first", term744620);
        setField(term744620, term744620.getClass(), "next", term744690);
        setIntField(term744620, term744620.getClass(), "type", 46);
        term744731 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term744731, term744731.getClass(), "currentTraversal", null);
        term744732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term744733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term744732, term744732.getClass(), "str", null);
        setIntField(term744732, term744732.getClass(), "type", 46);
        setIntField(term744733, term744733.getClass(), "type", 0);
        setField(term744733, term744733.getClass(), "next", null);
        setField(term744733, term744733.getClass(), "first", null);
        setField(term744733, term744733.getClass(), "last", null);
        setField(term744733, term744733.getClass(), "propListHead", null);
        setIntField(term744733, term744733.getClass(), "sourcePosition", 0);
        setField(term744733, term744733.getClass(), "jsType", null);
        setField(term744733, term744733.getClass(), "parent", null);
        setField(term744732, term744732.getClass(), "next", term744733);
        setField(term744732, term744732.getClass(), "first", term744732);
        setField(term744732, term744732.getClass(), "last", null);
        setField(term744732, term744732.getClass(), "propListHead", null);
        setIntField(term744732, term744732.getClass(), "sourcePosition", 0);
        setField(term744732, term744732.getClass(), "jsType", null);
        setField(term744732, term744732.getClass(), "parent", null);
        term744703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term744705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term744703, term744703.getClass(), "str", null);
        setIntField(term744703, term744703.getClass(), "type", 46);
        setIntField(term744705, term744705.getClass(), "type", 0);
        setField(term744705, term744705.getClass(), "next", null);
        setField(term744705, term744705.getClass(), "first", null);
        setField(term744705, term744705.getClass(), "last", null);
        setField(term744705, term744705.getClass(), "propListHead", null);
        setIntField(term744705, term744705.getClass(), "sourcePosition", 0);
        setField(term744705, term744705.getClass(), "jsType", null);
        setField(term744705, term744705.getClass(), "parent", null);
        setField(term744703, term744703.getClass(), "next", term744705);
        setField(term744703, term744703.getClass(), "first", term744703);
        setField(term744703, term744703.getClass(), "last", null);
        setField(term744703, term744703.getClass(), "propListHead", null);
        setIntField(term744703, term744703.getClass(), "sourcePosition", 0);
        setField(term744703, term744703.getClass(), "jsType", null);
        setField(term744703, term744703.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term744620;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term744528, args);
        assertTrue(recursiveEquals(term744528, term744731));
        assertTrue(recursiveEquals(term744620, term744732));
        assertTrue(recursiveEquals(retValue, term744703));
    }

};


