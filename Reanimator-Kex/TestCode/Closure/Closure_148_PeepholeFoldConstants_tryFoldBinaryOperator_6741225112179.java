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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594054;
     Object term594146;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594054 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term594146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term594238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term594324 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term594324, term594324.getClass(), "type", 39);
        setField(term594238, term594238.getClass(), "next", term594324);
        setIntField(term594238, term594238.getClass(), "type", 39);
        setField(term594146, term594146.getClass(), "first", term594238);
        setIntField(term594146, term594146.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term594146;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term594054, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


