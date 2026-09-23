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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684341;
     Object term684427;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term684341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term684427 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term684513 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term684605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term684605, term684605.getClass(), "type", 39);
        setField(term684513, term684513.getClass(), "next", term684605);
        setIntField(term684513, term684513.getClass(), "type", 39);
        setField(term684427, term684427.getClass(), "first", term684513);
        setIntField(term684427, term684427.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term684427;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term684341, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


