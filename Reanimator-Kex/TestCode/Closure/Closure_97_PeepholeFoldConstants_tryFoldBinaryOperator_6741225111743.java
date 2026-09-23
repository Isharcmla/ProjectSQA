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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684742;
     Object term684834;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term684742 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term684834 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term684920 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term684990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term684990, term684990.getClass(), "type", 39);
        setField(term684920, term684920.getClass(), "next", term684990);
        setIntField(term684920, term684920.getClass(), "type", 39);
        setField(term684834, term684834.getClass(), "first", term684920);
        setIntField(term684834, term684834.getClass(), "type", 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term684834;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term684742, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


