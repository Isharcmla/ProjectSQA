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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276073;
     Object term276165;
     Object term302695;
     Object term302696;
     Object term302668;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term276165 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term276235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term276165, term276165.getClass(), "first", term276165);
        setField(term276165, term276165.getClass(), "next", term276235);
        setIntField(term276165, term276165.getClass(), "type", 9);
        term302695 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term302695, term302695.getClass(), "currentTraversal", null);
        term302696 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term302697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term302696, term302696.getClass(), "str", null);
        setIntField(term302696, term302696.getClass(), "type", 9);
        setIntField(term302697, term302697.getClass(), "type", 0);
        setField(term302697, term302697.getClass(), "next", null);
        setField(term302697, term302697.getClass(), "first", null);
        setField(term302697, term302697.getClass(), "last", null);
        setField(term302697, term302697.getClass(), "propListHead", null);
        setIntField(term302697, term302697.getClass(), "sourcePosition", 0);
        setField(term302697, term302697.getClass(), "jsType", null);
        setField(term302697, term302697.getClass(), "parent", null);
        setField(term302696, term302696.getClass(), "next", term302697);
        setField(term302696, term302696.getClass(), "first", term302696);
        setField(term302696, term302696.getClass(), "last", null);
        setField(term302696, term302696.getClass(), "propListHead", null);
        setIntField(term302696, term302696.getClass(), "sourcePosition", 0);
        setField(term302696, term302696.getClass(), "jsType", null);
        setField(term302696, term302696.getClass(), "parent", null);
        term302668 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term302670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term302668, term302668.getClass(), "str", null);
        setIntField(term302668, term302668.getClass(), "type", 9);
        setIntField(term302670, term302670.getClass(), "type", 0);
        setField(term302670, term302670.getClass(), "next", null);
        setField(term302670, term302670.getClass(), "first", null);
        setField(term302670, term302670.getClass(), "last", null);
        setField(term302670, term302670.getClass(), "propListHead", null);
        setIntField(term302670, term302670.getClass(), "sourcePosition", 0);
        setField(term302670, term302670.getClass(), "jsType", null);
        setField(term302670, term302670.getClass(), "parent", null);
        setField(term302668, term302668.getClass(), "next", term302670);
        setField(term302668, term302668.getClass(), "first", term302668);
        setField(term302668, term302668.getClass(), "last", null);
        setField(term302668, term302668.getClass(), "propListHead", null);
        setIntField(term302668, term302668.getClass(), "sourcePosition", 0);
        setField(term302668, term302668.getClass(), "jsType", null);
        setField(term302668, term302668.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term276165;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term276073, args);
        assertTrue(recursiveEquals(term276073, term302695));
        assertTrue(recursiveEquals(term276165, term302696));
        assertTrue(recursiveEquals(retValue, term302668));
    }

};


