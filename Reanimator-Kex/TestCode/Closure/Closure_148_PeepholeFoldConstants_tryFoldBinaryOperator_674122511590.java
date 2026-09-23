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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128509;
     Object term128601;
     Object term129232;
     Object term129233;
     Object term129211;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128509 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term128601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term128671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128601, term128601.getClass(), "first", term128601);
        setField(term128601, term128601.getClass(), "next", term128671);
        setIntField(term128601, term128601.getClass(), "type", 20);
        term129232 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term129232, term129232.getClass(), "currentTraversal", null);
        term129233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term129234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term129233, term129233.getClass(), "str", null);
        setIntField(term129233, term129233.getClass(), "type", 20);
        setIntField(term129234, term129234.getClass(), "type", 0);
        setField(term129234, term129234.getClass(), "next", null);
        setField(term129234, term129234.getClass(), "first", null);
        setField(term129234, term129234.getClass(), "last", null);
        setField(term129234, term129234.getClass(), "propListHead", null);
        setIntField(term129234, term129234.getClass(), "sourcePosition", 0);
        setField(term129234, term129234.getClass(), "jsType", null);
        setField(term129234, term129234.getClass(), "parent", null);
        setField(term129233, term129233.getClass(), "next", term129234);
        setField(term129233, term129233.getClass(), "first", term129233);
        setField(term129233, term129233.getClass(), "last", null);
        setField(term129233, term129233.getClass(), "propListHead", null);
        setIntField(term129233, term129233.getClass(), "sourcePosition", 0);
        setField(term129233, term129233.getClass(), "jsType", null);
        setField(term129233, term129233.getClass(), "parent", null);
        term129211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term129213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term129211, term129211.getClass(), "str", null);
        setIntField(term129211, term129211.getClass(), "type", 20);
        setIntField(term129213, term129213.getClass(), "type", 0);
        setField(term129213, term129213.getClass(), "next", null);
        setField(term129213, term129213.getClass(), "first", null);
        setField(term129213, term129213.getClass(), "last", null);
        setField(term129213, term129213.getClass(), "propListHead", null);
        setIntField(term129213, term129213.getClass(), "sourcePosition", 0);
        setField(term129213, term129213.getClass(), "jsType", null);
        setField(term129213, term129213.getClass(), "parent", null);
        setField(term129211, term129211.getClass(), "next", term129213);
        setField(term129211, term129211.getClass(), "first", term129211);
        setField(term129211, term129211.getClass(), "last", null);
        setField(term129211, term129211.getClass(), "propListHead", null);
        setIntField(term129211, term129211.getClass(), "sourcePosition", 0);
        setField(term129211, term129211.getClass(), "jsType", null);
        setField(term129211, term129211.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128601;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term128509, args);
        assertTrue(recursiveEquals(term128509, term129232));
        assertTrue(recursiveEquals(term128601, term129233));
        assertTrue(recursiveEquals(retValue, term129211));
    }

};


