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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477348;
     Object term477440;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term477348 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term477440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term477532 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term477624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term477716 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term477532, term477532.getClass(), "next", term477624);
        setIntField(term477532, term477532.getClass(), "type", 47);
        setField(term477440, term477440.getClass(), "first", term477532);
        setIntField(term477440, term477440.getClass(), "type", 100);
        setField(term477440, term477440.getClass(), "parent", term477716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term477440;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term477348, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


