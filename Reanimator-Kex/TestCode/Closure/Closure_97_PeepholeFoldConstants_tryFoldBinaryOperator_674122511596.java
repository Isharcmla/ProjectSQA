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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156488;
     Object term156580;
     Object term156861;
     Object term156862;
     Object term156808;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156488 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term156580 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term156650, term156650.getClass(), "next", term156742);
        setIntField(term156650, term156650.getClass(), "type", 0);
        setField(term156580, term156580.getClass(), "first", term156650);
        setIntField(term156580, term156580.getClass(), "type", 100);
        setField(term156580, term156580.getClass(), "parent", null);
        term156861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term156861, term156861.getClass(), "currentTraversal", null);
        term156862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term156862, term156862.getClass(), "str", null);
        setIntField(term156862, term156862.getClass(), "type", 100);
        setField(term156862, term156862.getClass(), "next", null);
        setIntField(term156863, term156863.getClass(), "type", 0);
        setField(term156864, term156864.getClass(), "str", null);
        setIntField(term156864, term156864.getClass(), "type", 0);
        setField(term156864, term156864.getClass(), "next", null);
        setField(term156864, term156864.getClass(), "first", null);
        setField(term156864, term156864.getClass(), "last", null);
        setField(term156864, term156864.getClass(), "propListHead", null);
        setIntField(term156864, term156864.getClass(), "sourcePosition", 0);
        setField(term156864, term156864.getClass(), "jsType", null);
        setField(term156864, term156864.getClass(), "parent", null);
        setField(term156863, term156863.getClass(), "next", term156864);
        setField(term156863, term156863.getClass(), "first", null);
        setField(term156863, term156863.getClass(), "last", null);
        setField(term156863, term156863.getClass(), "propListHead", null);
        setIntField(term156863, term156863.getClass(), "sourcePosition", 0);
        setField(term156863, term156863.getClass(), "jsType", null);
        setField(term156863, term156863.getClass(), "parent", null);
        setField(term156862, term156862.getClass(), "first", term156863);
        setField(term156862, term156862.getClass(), "last", null);
        setField(term156862, term156862.getClass(), "propListHead", null);
        setIntField(term156862, term156862.getClass(), "sourcePosition", 0);
        setField(term156862, term156862.getClass(), "jsType", null);
        setField(term156862, term156862.getClass(), "parent", null);
        term156808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term156810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156812 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term156808, term156808.getClass(), "str", null);
        setIntField(term156808, term156808.getClass(), "type", 100);
        setField(term156808, term156808.getClass(), "next", null);
        setIntField(term156810, term156810.getClass(), "type", 0);
        setField(term156812, term156812.getClass(), "str", null);
        setIntField(term156812, term156812.getClass(), "type", 0);
        setField(term156812, term156812.getClass(), "next", null);
        setField(term156812, term156812.getClass(), "first", null);
        setField(term156812, term156812.getClass(), "last", null);
        setField(term156812, term156812.getClass(), "propListHead", null);
        setIntField(term156812, term156812.getClass(), "sourcePosition", 0);
        setField(term156812, term156812.getClass(), "jsType", null);
        setField(term156812, term156812.getClass(), "parent", null);
        setField(term156810, term156810.getClass(), "next", term156812);
        setField(term156810, term156810.getClass(), "first", null);
        setField(term156810, term156810.getClass(), "last", null);
        setField(term156810, term156810.getClass(), "propListHead", null);
        setIntField(term156810, term156810.getClass(), "sourcePosition", 0);
        setField(term156810, term156810.getClass(), "jsType", null);
        setField(term156810, term156810.getClass(), "parent", null);
        setField(term156808, term156808.getClass(), "first", term156810);
        setField(term156808, term156808.getClass(), "last", null);
        setField(term156808, term156808.getClass(), "propListHead", null);
        setIntField(term156808, term156808.getClass(), "sourcePosition", 0);
        setField(term156808, term156808.getClass(), "jsType", null);
        setField(term156808, term156808.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term156580;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term156488, args);
        assertTrue(recursiveEquals(term156488, term156861));
        assertTrue(recursiveEquals(term156580, term156862));
        assertTrue(recursiveEquals(retValue, term156808));
    }

};


