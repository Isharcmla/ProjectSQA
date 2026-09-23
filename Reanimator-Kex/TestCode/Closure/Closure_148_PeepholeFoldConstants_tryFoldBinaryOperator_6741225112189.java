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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597493;
     Object term597585;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597493 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term597585 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term597677 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term597769 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term597861 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term597769, term597769.getClass(), "type", 44);
        setField(term597677, term597677.getClass(), "next", term597769);
        setIntField(term597677, term597677.getClass(), "type", 0);
        setField(term597585, term597585.getClass(), "first", term597677);
        setIntField(term597585, term597585.getClass(), "type", 101);
        setIntField(term597861, term597861.getClass(), "type", 113);
        setField(term597585, term597585.getClass(), "parent", term597861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term597585;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term597493, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


