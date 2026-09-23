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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567476;
     Object term567568;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567476 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term567568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term567638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term567730 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term567730, term567730.getClass(), "type", 44);
        setField(term567638, term567638.getClass(), "next", term567730);
        setIntField(term567638, term567638.getClass(), "type", 0);
        setField(term567568, term567568.getClass(), "first", term567638);
        setIntField(term567568, term567568.getClass(), "type", 101);
        setField(term567568, term567568.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term567568;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term567476, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


