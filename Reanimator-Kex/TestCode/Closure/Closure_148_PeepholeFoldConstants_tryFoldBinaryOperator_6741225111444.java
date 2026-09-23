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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357184;
     Object term357276;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357184 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term357276 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term357366 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term357458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term357458, term357458.getClass(), "type", 64);
        setField(term357366, term357366.getClass(), "next", term357458);
        setIntField(term357366, term357366.getClass(), "type", 0);
        setField(term357276, term357276.getClass(), "first", term357366);
        setIntField(term357276, term357276.getClass(), "type", 101);
        setField(term357276, term357276.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term357276;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term357184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


