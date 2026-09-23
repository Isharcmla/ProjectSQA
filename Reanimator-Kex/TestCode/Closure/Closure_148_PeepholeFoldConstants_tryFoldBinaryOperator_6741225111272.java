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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304243;
     Object term304335;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304243 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term304335 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term304421 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term304491, term304491.getClass(), "type", 40);
        setField(term304421, term304421.getClass(), "next", term304491);
        setField(term304335, term304335.getClass(), "first", term304421);
        setIntField(term304335, term304335.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term304335;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term304243, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


