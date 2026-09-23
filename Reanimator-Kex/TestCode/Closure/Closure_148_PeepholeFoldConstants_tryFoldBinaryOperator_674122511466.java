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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96318;
     Object term96410;
     Object term96512;
     Object term96513;
     Object term96487;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term96410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term96480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96410, term96410.getClass(), "first", term96410);
        setField(term96410, term96410.getClass(), "next", term96480);
        setIntField(term96410, term96410.getClass(), "type", 11);
        term96512 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term96512, term96512.getClass(), "currentTraversal", null);
        term96513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term96514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96513, term96513.getClass(), "str", null);
        setIntField(term96513, term96513.getClass(), "type", 11);
        setIntField(term96514, term96514.getClass(), "type", 0);
        setField(term96514, term96514.getClass(), "next", null);
        setField(term96514, term96514.getClass(), "first", null);
        setField(term96514, term96514.getClass(), "last", null);
        setField(term96514, term96514.getClass(), "propListHead", null);
        setIntField(term96514, term96514.getClass(), "sourcePosition", 0);
        setField(term96514, term96514.getClass(), "jsType", null);
        setField(term96514, term96514.getClass(), "parent", null);
        setField(term96513, term96513.getClass(), "next", term96514);
        setField(term96513, term96513.getClass(), "first", term96513);
        setField(term96513, term96513.getClass(), "last", null);
        setField(term96513, term96513.getClass(), "propListHead", null);
        setIntField(term96513, term96513.getClass(), "sourcePosition", 0);
        setField(term96513, term96513.getClass(), "jsType", null);
        setField(term96513, term96513.getClass(), "parent", null);
        term96487 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term96489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96487, term96487.getClass(), "str", null);
        setIntField(term96487, term96487.getClass(), "type", 11);
        setIntField(term96489, term96489.getClass(), "type", 0);
        setField(term96489, term96489.getClass(), "next", null);
        setField(term96489, term96489.getClass(), "first", null);
        setField(term96489, term96489.getClass(), "last", null);
        setField(term96489, term96489.getClass(), "propListHead", null);
        setIntField(term96489, term96489.getClass(), "sourcePosition", 0);
        setField(term96489, term96489.getClass(), "jsType", null);
        setField(term96489, term96489.getClass(), "parent", null);
        setField(term96487, term96487.getClass(), "next", term96489);
        setField(term96487, term96487.getClass(), "first", term96487);
        setField(term96487, term96487.getClass(), "last", null);
        setField(term96487, term96487.getClass(), "propListHead", null);
        setIntField(term96487, term96487.getClass(), "sourcePosition", 0);
        setField(term96487, term96487.getClass(), "jsType", null);
        setField(term96487, term96487.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96410;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term96318, args);
        assertTrue(recursiveEquals(term96318, term96512));
        assertTrue(recursiveEquals(term96410, term96513));
        assertTrue(recursiveEquals(retValue, term96487));
    }

};


